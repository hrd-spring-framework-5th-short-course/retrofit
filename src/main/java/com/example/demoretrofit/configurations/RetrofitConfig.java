package com.example.demoretrofit.configurations;

import com.google.gson.*;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Date;

@Configuration
public class RetrofitConfig {

    @Bean
    public OkHttpClient client() {
        OkHttpClient.Builder okHttpClientBuilder = new OkHttpClient.Builder();
        return okHttpClientBuilder.addInterceptor(new Interceptor() {

            @Override
            public Response intercept(Chain chain) throws IOException {
                Request original = chain.request();
                Request request = original.newBuilder()
                        .header("Content-Type", "application/json")
                        .header("Authorization", "Basic c2lkYToxMjMxMjM=")
                        .method(original.method(), original.body()).build();
                return chain.proceed(request);

            }
        }).build();
    }


    @Bean
    @Autowired
    public Retrofit retrofit(OkHttpClient client) throws IOException {

        Gson gson = new GsonBuilder()
                .registerTypeAdapter(Date.class, new JsonDeserializer() {

                    public Date deserialize(JsonElement jsonElement,
                                            Type type,
                                            JsonDeserializationContext context)
                            throws JsonParseException {

                        return new Date(jsonElement.getAsJsonPrimitive().getAsLong());
                    }
                }).create();


        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://localhost:2020")
                .client(client)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();
        return retrofit;

    }

}
