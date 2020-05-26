# spring-cloud-stream-producer
spring-cloud-stream-producer
This is a project which uses rabbit mq as a messaging platofrm provider.
Please note the following steps to set up rabbit mq on your local machine.

I have used the docker version of the same.

1. docker run -it --rm --name rabbitmq -p 5672:5672 -p 15672:15672 rabbitmq:3-management

2. rabbit mq management console can be accessed by http://localhost:15672/. Username and password is guest , guest.


Reference referred is

https://www.javainuse.com/spring/cloud-stream-rabbitmq-1
