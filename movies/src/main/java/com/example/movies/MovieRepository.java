package com.example.movies;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;
//bunun yaptığı şu: dataya access ediyor, databaseye gidip veriyi alan şey bu interface.
@Repository
public interface MovieRepository extends MongoRepository<Movie, ObjectId> {
    Optional<Movie> findMovieByImdbId(String imdbId); //optional ile null olabileceğini belirttik. amaç tek filme erişirken imdb id'sini göstermek, kendi hakiki id'si yerine.
}
