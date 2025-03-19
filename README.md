# kafka-tour

// install kafka CLI:
https://kafka.apache.org/quickstart

// create first topic kafka:
sh kafka-topics.sh --bootstrap-server localhost:9092 --create --topic first-topic --partitions 3
sh kafka-topics.sh --bootstrap-server localhost:9092 --create --topic second-topic --partitions 3 --replication-factor 3

// Kiểm tra list topic trong kafka
sh kafka-topics.sh --bootstrap-server localhost:9092 --list

// Xem thông tin của topic:
sh kafka-topics.sh --bootstrap-server localhost:9092 --describe --topic first-topic

// producer
sh kafka-console-producer.sh --bootstrap-server localhost:9092 --topic first-topic

// consumer:
sh kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic first-topic

// pub/sub message key:value
sh kafka-console-producer.sh --bootstrap-server localhost:9092 --topic second-topic --producer-property acks=all


sh kafka-console-producer.sh --bootstrap-server localhost:9092 --topic second-topic --property parse.key=true \--property key.separator=:

sh kafka-console-consumer.sh --bootstrap
-server localhost:9092 --topic second-topic --from-beginning

sh kafka-console-consumer.sh --bootstrap
-server localhost:9092 --topic second-topic --formatter kafka.tools.DefaultMessageFormatter --property print.timestamp=true --property print.key=true --property print.value = true --property print.partition=true --from beginning

// consumer group
sh kafka-console-producer.sh --bootstrap-server localhost:9092 --topic second-topic \--producer-property partitioner.class=org.apache.kafka.clients.producer.RoundRobinPartitioner

sh kafka-console-consumer.sh --bootstrap
-server localhost:9092 --topic second-topic --group G00 \
--formatter kafka.tools.DefaultMessageFormatter \
--property print.partition=true \
--property print.value=true

// thêm 1 consumer vào group G00
sh kafka-console-consumer.sh --bootstrap
-server localhost:9092 --topic second-topic --group G00 

sh kafka-consumer-groups.sh --bootstrap-server localhost:9092

Kafka + Java
