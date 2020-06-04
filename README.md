# ActiveMq Kafka Simple Bridge



Simply create the bridge SpringBoot App using Camel


### Usage

Change the routes.xml, yourqueue->queue source, customtopic->kafkatopic

```sh
<routes xmlns="http://camel.apache.org/schema/spring">
    <route id="routeId">
        <from uri="activemq:yourqueue?destination.consumer.exclusive=true&amp;destination.consumer.prefetchSize=50"/>
        <to uri="kafka://localhost:9092?topic=customtopic&amp;" />
    </route>
</routes>

```

And in application.properties set the brokers

```sh
camel.component.kafka.brokers=localhost:9092
```

Install and run

```sh
mvn clean install
mvn spring-boot:run
```

Enjoy!

User Hawtio to admin activemq and Camel if you need it
