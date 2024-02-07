package com.example.movies;
import java.util.Optional;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


//bu service'in yaptığı şey: gidip repository interfacesindeki datayı isteyip gelen veriyi api layer'e gönderir.
@Service
public class MovieService {
    @Autowired //bu movierepository'i instantialize ediyor, constructor ile yapmaktan daha kısa
    private MovieRepository movieRepository;
    public List<Movie> allMovies(){
        return movieRepository.findAll(); //findAll mongo repository'de tanımlı geliyormuş zaten.
    }

    public Optional<Movie> singleMovie(String imdbId){ //null olabileceğini optional ile belirtmiş olduk
        return movieRepository.findMovieByImdbId(imdbId);
    }
}
