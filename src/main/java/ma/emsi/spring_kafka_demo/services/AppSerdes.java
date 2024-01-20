package ma.emsi.spring_kafka_demo.services;

import ma.emsi.spring_kafka_demo.entities.PageEvent;
import org.apache.kafka.common.serialization.Serde;
import org.apache.kafka.common.serialization.Serdes;
import org.springframework.kafka.support.serializer.JsonDeserializer;
import org.springframework.kafka.support.serializer.JsonSerializer;

public class AppSerdes {
    public static Serde<PageEvent> PageEventSerdes(){
        JsonSerializer<PageEvent> pageEventJsonSerializer=new JsonSerializer<>();
        JsonDeserializer<PageEvent> pageEventJsonDeserializer=new JsonDeserializer<>(PageEvent.class);
        return Serdes.serdeFrom(pageEventJsonSerializer,pageEventJsonDeserializer);

    }
}
