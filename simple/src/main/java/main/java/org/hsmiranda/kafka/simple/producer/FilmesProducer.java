package main.java.org.hsmiranda.kafka.simple.producer;

import org.eclipse.microprofile.reactive.messaging.Channel;
import org.eclipse.microprofile.reactive.messaging.Emitter;

import com.oracle.svm.core.annotate.Inject;

import io.smallrye.reactive.messaging.kafka.Record;
import jakarta.enterprise.context.ApplicationScoped;
import main.java.org.hsmiranda.kafka.simple.entity.Filme;

@ApplicationScoped
public class FilmesProducer {
    
    @Inject
    @Channel("filmes-out")
    Emitter<Record <Integer, String>> emitter;

    public void enviarFilmeParaKafka(Filme filme) {
        emitter.send(Record.of(filme.getYear(), filme.getTitle()));
    }
}
