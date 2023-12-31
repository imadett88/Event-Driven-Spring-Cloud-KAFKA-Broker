# Event-Driven-Spring-Cloud-KAFKA-Broker


start zookeeper: C:\kafka>.\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties

<img width="960" alt="Capture d'écran 2023-12-31 180839" src="https://github.com/imadett88/Event-Driven-Spring-Cloud-KAFKA-Broker/assets/83021588/fd938d90-3e45-4e75-9750-7dbc95c2df58">


start kafka:     C:\kafka>.\bin\windows\kafka-server-start.bat .\config\server.properties

<img width="960" alt="Capture d'écran 2023-12-31 180827" src="https://github.com/imadett88/Event-Driven-Spring-Cloud-KAFKA-Broker/assets/83021588/a1321ac7-16ff-4903-9dd5-7cc5b6831e1c">


consumer : C:\kafka>bin\windows\kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic R1

<img width="960" alt="Capture d'écran 2023-12-31 181559" src="https://github.com/imadett88/Event-Driven-Spring-Cloud-KAFKA-Broker/assets/83021588/fab39e66-9e14-4478-98e0-756b802d5cb8">


producer : C:\kafka>bin\windows\kafka-console-producer.bat --broker-list localhost:9092 --topic R1

<img width="960" alt="Capture d'écran 2023-12-31 181921" src="https://github.com/imadett88/Event-Driven-Spring-Cloud-KAFKA-Broker/assets/83021588/3f6c498f-c77a-44f8-b0f9-7ec7b9adeff5">

key,value :
bin\windows\kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic R4 --property print.key=true --property print.value=true --property key.deserializer=org.apache.kafka.common.serialization.StringDeserializer --property value.deserializer=org.apache.kafka.common.serialization.LongDeserializer



