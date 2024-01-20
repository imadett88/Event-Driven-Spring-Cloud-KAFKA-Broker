# Event-Driven-Spring-Cloud-KAFKA-Broker

start zookeeper & kafka with Docker :
<img width="960" alt="Capture d'écran 2024-01-20 211911" src="https://github.com/imadett88/Event-Driven-Spring-Cloud-KAFKA-Broker/assets/83021588/7cdc2107-9b1e-4d85-83dd-edaa75c5df63">
<img width="960" alt="Capture d'écran 2024-01-20 211919" src="https://github.com/imadett88/Event-Driven-Spring-Cloud-KAFKA-Broker/assets/83021588/b0a4cdae-98ea-45ba-843b-3ea92c3bd269">


start zookeeper (CMD): C:\kafka>.\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties

<img width="960" alt="Capture d'écran 2023-12-31 180839" src="https://github.com/imadett88/Event-Driven-Spring-Cloud-KAFKA-Broker/assets/83021588/fd938d90-3e45-4e75-9750-7dbc95c2df58">


start kafka (CMD): C:\kafka>.\bin\windows\kafka-server-start.bat .\config\server.properties

<img width="960" alt="Capture d'écran 2023-12-31 180827" src="https://github.com/imadett88/Event-Driven-Spring-Cloud-KAFKA-Broker/assets/83021588/a1321ac7-16ff-4903-9dd5-7cc5b6831e1c">


consumer : C:\kafka>bin\windows\kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic R1

<img width="960" alt="Capture d'écran 2023-12-31 181559" src="https://github.com/imadett88/Event-Driven-Spring-Cloud-KAFKA-Broker/assets/83021588/fab39e66-9e14-4478-98e0-756b802d5cb8">


producer : C:\kafka>bin\windows\kafka-console-producer.bat --broker-list localhost:9092 --topic R1

<img width="960" alt="Capture d'écran 2023-12-31 181921" src="https://github.com/imadett88/Event-Driven-Spring-Cloud-KAFKA-Broker/assets/83021588/3f6c498f-c77a-44f8-b0f9-7ec7b9adeff5">


key,value :
bin\windows\kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic R4 --property print.key=true --property print.value=true --property key.deserializer=org.apache.kafka.common.serialization.StringDeserializer --property value.deserializer=org.apache.kafka.common.serialization.LongDeserializer

R1:
<img width="960" alt="Capture d'écran 2024-01-20 212447" src="https://github.com/imadett88/Event-Driven-Spring-Cloud-KAFKA-Broker/assets/83021588/74b54a4d-0bad-404b-b101-a7258d37200b">

Analytique avec Smoothie js :
![297206131-814a7639-8192-4e45-baa6-c237b000bae0](https://github.com/imadett88/Event-Driven-Spring-Cloud-KAFKA-Broker/assets/83021588/6258e70c-da9e-419c-ab4d-d5d80a1f5dbd)

