package com.d3h.cleanarch.config;

import com.d3h.cleanarch.core.domain.Customer;
import com.d3h.cleanarch.entrypoint.consumer.message.CustomerMessage;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.ProducerFactory;
import org.springframework.kafka.support.serializer.JsonDeserializer;

import java.util.HashMap;
import java.util.Map;

import static org.apache.kafka.clients.consumer.ConsumerConfig.GROUP_ID_CONFIG;
import static org.apache.kafka.clients.consumer.ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG;
import static org.apache.kafka.clients.consumer.ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG;
import static org.apache.kafka.clients.consumer.ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG;
import static org.apache.kafka.clients.consumer.ConsumerConfig.AUTO_OFFSET_RESET_CONFIG;

@EnableKafka
@Configuration
public class kafkaConsumerConfig {

    @Bean
    public ConsumerFactory<String, CustomerMessage> consumerFactory() {
        Map<String, Object> configProps = new HashMap<>();
        configProps.put(BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
        configProps.put(GROUP_ID_CONFIG, "deh");
        configProps.put(KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
        configProps.put(VALUE_DESERIALIZER_CLASS_CONFIG, JsonDeserializer.class);
        configProps.put(AUTO_OFFSET_RESET_CONFIG, "earliest");
        return new DefaultKafkaConsumerFactory<>(configProps, new StringDeserializer(), new JsonDeserializer<>(CustomerMessage.class));
    }

    @Bean
    public ConcurrentKafkaListenerContainerFactory<String, CustomerMessage> kafkaListenerContainerFactory() {
        ConcurrentKafkaListenerContainerFactory<String, CustomerMessage> factory = new ConcurrentKafkaListenerContainerFactory<>();
        factory.setConsumerFactory(consumerFactory());
        return factory;
    }

}
