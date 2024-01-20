package ma.emsi.spring_kafka_demo.serializers;

import com.fasterxml.jackson.databind.ObjectMapper;
import ma.emsi.spring_kafka_demo.entities.PageEvent;
import org.apache.kafka.common.errors.SerializationException;
import org.apache.kafka.common.serialization.Deserializer;


public class CustomDeSerializer implements Deserializer<PageEvent> {
    @Override
    public PageEvent deserialize(String s, byte[] data) {
        try {
            return new ObjectMapper().readValue(new String(data),PageEvent.class);
        } catch (Exception e) {
            throw new SerializationException(e);
        }
    }
}

