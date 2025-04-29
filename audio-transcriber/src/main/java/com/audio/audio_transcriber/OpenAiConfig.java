package com.audio.audio_transcriber;

import org.springframework.ai.model.SimpleApiKey;
import org.springframework.ai.openai.OpenAiAudioTranscriptionModel;
import org.springframework.ai.openai.api.OpenAiAudioApi;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.web.client.DefaultResponseErrorHandler;
import org.springframework.web.client.RestClient;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class OpenAiConfig {

    @Value("${spring.ai.openai.api-key}")
    private String apiKey;

    @Bean
    public OpenAiAudioApi openAiAudioApi() {
        return new OpenAiAudioApi(
                "https://api.openai.com",
                new SimpleApiKey(apiKey),
                new LinkedMultiValueMap<>(),
                RestClient.builder(),
                WebClient.builder(),
                new DefaultResponseErrorHandler()
        );
    }

    @Bean
    public OpenAiAudioTranscriptionModel transcriptionModel(OpenAiAudioApi api) {
        return new OpenAiAudioTranscriptionModel(api);
    }
}
