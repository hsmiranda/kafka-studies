package main.java.org.hsmiranda.kafka.simple.consumer;

import org.eclipse.microprofile.reactive.messaging.Incoming;
import org.jboss.logging.Logger;

import io.smallrye.reactive.messaging.kafka.Record;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class FilmeConsumer {
    
    private final Logger logger = Logger.getLogger(FilmeConsumer.class);

    @Incoming("filmes-in")
    public void receber(Record<Integer, String> record){
        logger.infof("O filme e: %d - %s", record.key(), record.value());
    }


}
