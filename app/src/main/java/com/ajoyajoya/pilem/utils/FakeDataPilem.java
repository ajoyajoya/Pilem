package com.ajoyajoya.pilem.utils;

import com.ajoyajoya.pilem.data.MovieEntity;
import com.ajoyajoya.pilem.data.TvshowEntity;
import com.ajoyajoya.pilem.data.source.DetailMovieEntity;
import com.ajoyajoya.pilem.data.source.remote.response.MovieResponse;
import com.ajoyajoya.pilem.data.source.remote.response.TvshowResponse;

import java.util.ArrayList;
import java.util.List;

public class FakeDataPilem {

    public static ArrayList<MovieEntity> generatePilemMovie() {

        ArrayList<MovieEntity> movieEntities = new ArrayList<>();

        movieEntities.add(new MovieEntity(
                290859,
                "https://image.tmdb.org/t/p/w500/vqzNJRH4YyquRiWxCCOH0aXggHI.jpg",
                "Terminator: Dark Fate",
                "6.5",
                "R | 2h 16min | Drama, Music, Romance | 5 October 2018 (USA)",
                "More than two decades have passed since Sarah Connor prevented Judgment Day, changed the future, and re-wrote the fate of the human race. Dani Ramos is living a simple life in Mexico City with her brother and father when a highly advanced and deadly new Terminator – a Rev-9 – travels back through time to hunt and kill her. Dani's survival depends on her joining forces with two warriors: Grace, an enhanced super-soldier from the future, and a battle-hardened Sarah Connor. As the Rev-9 ruthlessly destroys everything and everyone in its path on the hunt for Dani, the three are led to a T-800 from Sarah’s past that may be their last best hope."));

        movieEntities.add(new MovieEntity(
                330457,
                "https://image.tmdb.org/t/p/w500/qdfARIhgpgZOBh3vfNhWS4hmSo3.jpg",
                "Frozen II",
                "6.8",
                "R | 2h 16min | Drama, Music, Romance | 5 October 2018 (USA)",
                "Elsa, Anna, Kristoff and Olaf are going far in the forest to know the truth about an ancient mystery of their kingdom."));

        movieEntities.add(new MovieEntity(
                568012,
                "https://image.tmdb.org/t/p/w500/4E2lyUGLEr3yH4q6kJxPkQUhX7n.jpg",
                "ワンピーススタンピード",
                "7.3",
                "R | 2h 16min | Drama, Music, Romance | 5 October 2018 (USA)",
                "One Piece: Stampede is a stand-alone film that celebrates the anime's 20th Anniversary and takes place outside the canon of the \\\"One Piece\\\" TV series. Monkey D. Luffy and his Straw Hat pirate crew are invited to a massive Pirate Festival that brings many of the most iconic characters from throughout the franchise to participate in competition with the Straw Hats to find Roger's treasure. It also pits the Straw Hats against a new enemy named Bullet, a former member of Roger's crew."));

        movieEntities.add(new MovieEntity(
                501170,
                "https://image.tmdb.org/t/p/w500/p69QzIBbN06aTYqRRiCOY1emNBh.jpg",
                "Doctor Sleep",
                "7.1",
                "R | 2h 16min | Drama, Music, Romance | 5 October 2018 (USA)",
                "A traumatized, alcoholic Dan Torrance meets Abra, a kid who also has the ability to \\\"shine.\\\" He tries to protect her from the True Knot, a cult whose goal is to feed off of people like them in order to remain immortal."));

        movieEntities.add(new MovieEntity(
                480105,
                "https://image.tmdb.org/t/p/w500/g4z7mDmJmx23vsVg6XNWcnXb6gc.jpg",
                "47 Meters Down: Uncaged",
                "5",
                "R | 2h 16min | Drama, Music, Romance | 5 October 2018 (USA)",
                "A group of backpackers diving in a ruined underwater city discover that they have stumbled into the territory of the ocean's deadliest shark species."));

        return movieEntities;
    }

    public static ArrayList<TvshowEntity> generatePilemTvshow() {

        ArrayList<TvshowEntity> tvshowEntities = new ArrayList<>();

        tvshowEntities.add(new TvshowEntity(
                290859,
                "https://image.tmdb.org/t/p/w500/vqzNJRH4YyquRiWxCCOH0aXggHI.jpg",
                "Terminator: Dark Fate",
                "6.5",
                "R | 2h 16min | Drama, Music, Romance | 5 October 2018 (USA)",
                "More than two decades have passed since Sarah Connor prevented Judgment Day, changed the future, and re-wrote the fate of the human race. Dani Ramos is living a simple life in Mexico City with her brother and father when a highly advanced and deadly new Terminator – a Rev-9 – travels back through time to hunt and kill her. Dani's survival depends on her joining forces with two warriors: Grace, an enhanced super-soldier from the future, and a battle-hardened Sarah Connor. As the Rev-9 ruthlessly destroys everything and everyone in its path on the hunt for Dani, the three are led to a T-800 from Sarah’s past that may be their last best hope."));

        tvshowEntities.add(new TvshowEntity(
                330457,
                "https://image.tmdb.org/t/p/w500/qdfARIhgpgZOBh3vfNhWS4hmSo3.jpg",
                "Frozen II",
                "6.8",
                "R | 2h 16min | Drama, Music, Romance | 5 October 2018 (USA)",
                "Elsa, Anna, Kristoff and Olaf are going far in the forest to know the truth about an ancient mystery of their kingdom."));

        tvshowEntities.add(new TvshowEntity(
                568012,
                "https://image.tmdb.org/t/p/w500/4E2lyUGLEr3yH4q6kJxPkQUhX7n.jpg",
                "ワンピーススタンピード",
                "7.3",
                "R | 2h 16min | Drama, Music, Romance | 5 October 2018 (USA)",
                "One Piece: Stampede is a stand-alone film that celebrates the anime's 20th Anniversary and takes place outside the canon of the \\\"One Piece\\\" TV series. Monkey D. Luffy and his Straw Hat pirate crew are invited to a massive Pirate Festival that brings many of the most iconic characters from throughout the franchise to participate in competition with the Straw Hats to find Roger's treasure. It also pits the Straw Hats against a new enemy named Bullet, a former member of Roger's crew."));

        tvshowEntities.add(new TvshowEntity(
                501170,
                "https://image.tmdb.org/t/p/w500/p69QzIBbN06aTYqRRiCOY1emNBh.jpg",
                "Doctor Sleep",
                "7.1",
                "R | 2h 16min | Drama, Music, Romance | 5 October 2018 (USA)",
                "A traumatized, alcoholic Dan Torrance meets Abra, a kid who also has the ability to \\\"shine.\\\" He tries to protect her from the True Knot, a cult whose goal is to feed off of people like them in order to remain immortal."));

        tvshowEntities.add(new TvshowEntity(
                480105,
                "https://image.tmdb.org/t/p/w500/g4z7mDmJmx23vsVg6XNWcnXb6gc.jpg",
                "47 Meters Down: Uncaged",
                "5",
                "R | 2h 16min | Drama, Music, Romance | 5 October 2018 (USA)",
                "A group of backpackers diving in a ruined underwater city discover that they have stumbled into the territory of the ocean's deadliest shark species."));


        return tvshowEntities;
    }

    public static List<MovieResponse> generateRemoteDummyMovie() {

        List<MovieResponse> movieResponses = new ArrayList<>();

        movieResponses.add(new MovieResponse(
                290859,
                "https://image.tmdb.org/t/p/w500/vqzNJRH4YyquRiWxCCOH0aXggHI.jpg",
                "Terminator: Dark Fate",
                "6.5",
                "R | 2h 16min | Drama, Music, Romance | 5 October 2018 (USA)",
                "More than two decades have passed since Sarah Connor prevented Judgment Day, changed the future, and re-wrote the fate of the human race. Dani Ramos is living a simple life in Mexico City with her brother and father when a highly advanced and deadly new Terminator – a Rev-9 – travels back through time to hunt and kill her. Dani's survival depends on her joining forces with two warriors: Grace, an enhanced super-soldier from the future, and a battle-hardened Sarah Connor. As the Rev-9 ruthlessly destroys everything and everyone in its path on the hunt for Dani, the three are led to a T-800 from Sarah’s past that may be their last best hope.",
                "2019-11-01"));

        movieResponses.add(new MovieResponse(
                330457,
                "https://image.tmdb.org/t/p/w500/qdfARIhgpgZOBh3vfNhWS4hmSo3.jpg",
                "Frozen II",
                "6.8",
                "R | 2h 16min | Drama, Music, Romance | 5 October 2018 (USA)",
                "Elsa, Anna, Kristoff and Olaf are going far in the forest to know the truth about an ancient mystery of their kingdom.",
                "2019-11-22"));

        movieResponses.add(new MovieResponse(
                568012,
                "https://image.tmdb.org/t/p/w500/4E2lyUGLEr3yH4q6kJxPkQUhX7n.jpg",
                "ワンピーススタンピード",
                "7.3",
                "R | 2h 16min | Drama, Music, Romance | 5 October 2018 (USA)",
                "One Piece: Stampede is a stand-alone film that celebrates the anime's 20th Anniversary and takes place outside the canon of the \\\"One Piece\\\" TV series. Monkey D. Luffy and his Straw Hat pirate crew are invited to a massive Pirate Festival that brings many of the most iconic characters from throughout the franchise to participate in competition with the Straw Hats to find Roger's treasure. It also pits the Straw Hats against a new enemy named Bullet, a former member of Roger's crew.",
                "2019-10-24"));

        movieResponses.add(new MovieResponse(
                501170,
                "https://image.tmdb.org/t/p/w500/p69QzIBbN06aTYqRRiCOY1emNBh.jpg",
                "Doctor Sleep",
                "7.1",
                "R | 2h 16min | Drama, Music, Romance | 5 October 2018 (USA)",
                "A traumatized, alcoholic Dan Torrance meets Abra, a kid who also has the ability to \\\"shine.\\\" He tries to protect her from the True Knot, a cult whose goal is to feed off of people like them in order to remain immortal.",
                "2019-11-08"));

        movieResponses.add(new MovieResponse(
                480105,
                "https://image.tmdb.org/t/p/w500/g4z7mDmJmx23vsVg6XNWcnXb6gc.jpg",
                "47 Meters Down: Uncaged",
                "5",
                "R | 2h 16min | Drama, Music, Romance | 5 October 2018 (USA)",
                "A group of backpackers diving in a ruined underwater city discover that they have stumbled into the territory of the ocean's deadliest shark species.",
                "2019-08-16"));

        return movieResponses;
    }

    public static List<TvshowResponse> generateRemoteDummyTvShow() {

        List<TvshowResponse> tvshowResponses = new ArrayList<>();

        tvshowResponses.add(new TvshowResponse(
                290859,
                "https://image.tmdb.org/t/p/w500/vqzNJRH4YyquRiWxCCOH0aXggHI.jpg",
                "Terminator: Dark Fate",
                "6.5",
                "R | 2h 16min | Drama, Music, Romance | 5 October 2018 (USA)",
                "More than two decades have passed since Sarah Connor prevented Judgment Day, changed the future, and re-wrote the fate of the human race. Dani Ramos is living a simple life in Mexico City with her brother and father when a highly advanced and deadly new Terminator – a Rev-9 – travels back through time to hunt and kill her. Dani's survival depends on her joining forces with two warriors: Grace, an enhanced super-soldier from the future, and a battle-hardened Sarah Connor. As the Rev-9 ruthlessly destroys everything and everyone in its path on the hunt for Dani, the three are led to a T-800 from Sarah’s past that may be their last best hope.",
                "2019-11-01"));

        tvshowResponses.add(new TvshowResponse(
                330457,
                "https://image.tmdb.org/t/p/w500/qdfARIhgpgZOBh3vfNhWS4hmSo3.jpg",
                "Frozen II",
                "6.8",
                "R | 2h 16min | Drama, Music, Romance | 5 October 2018 (USA)",
                "Elsa, Anna, Kristoff and Olaf are going far in the forest to know the truth about an ancient mystery of their kingdom.",
                "2019-11-22"));

        tvshowResponses.add(new TvshowResponse(
                568012,
                "https://image.tmdb.org/t/p/w500/4E2lyUGLEr3yH4q6kJxPkQUhX7n.jpg",
                "ワンピーススタンピード",
                "7.3",
                "R | 2h 16min | Drama, Music, Romance | 5 October 2018 (USA)",
                "One Piece: Stampede is a stand-alone film that celebrates the anime's 20th Anniversary and takes place outside the canon of the \\\"One Piece\\\" TV series. Monkey D. Luffy and his Straw Hat pirate crew are invited to a massive Pirate Festival that brings many of the most iconic characters from throughout the franchise to participate in competition with the Straw Hats to find Roger's treasure. It also pits the Straw Hats against a new enemy named Bullet, a former member of Roger's crew.",
                "2019-10-24"));

        tvshowResponses.add(new TvshowResponse(
                501170,
                "https://image.tmdb.org/t/p/w500/p69QzIBbN06aTYqRRiCOY1emNBh.jpg",
                "Doctor Sleep",
                "7.1",
                "R | 2h 16min | Drama, Music, Romance | 5 October 2018 (USA)",
                "A traumatized, alcoholic Dan Torrance meets Abra, a kid who also has the ability to \\\"shine.\\\" He tries to protect her from the True Knot, a cult whose goal is to feed off of people like them in order to remain immortal.",
                "2019-11-08"));

        tvshowResponses.add(new TvshowResponse(
                480105,
                "https://image.tmdb.org/t/p/w500/g4z7mDmJmx23vsVg6XNWcnXb6gc.jpg",
                "47 Meters Down: Uncaged",
                "5",
                "R | 2h 16min | Drama, Music, Romance | 5 October 2018 (USA)",
                "A group of backpackers diving in a ruined underwater city discover that they have stumbled into the territory of the ocean's deadliest shark species.",
                "2019-08-16"));

        return tvshowResponses;
    }

    public static ArrayList<DetailMovieEntity> generatePilemDetailMovie(int idMovie) {

        ArrayList<DetailMovieEntity> detailMovieEntities = new ArrayList<>();

        detailMovieEntities.add(new DetailMovieEntity(
                290859,
                "https://image.tmdb.org/t/p/w500/vqzNJRH4YyquRiWxCCOH0aXggHI.jpg",
                "https://image.tmdb.org/t/p/w500/vqzNJRH4YyquRiWxCCOH0aXggHI.jpg",
                "Terminator: Dark Fate",
                "6.5",
                "R | 2h 16min | Drama, Music, Romance | 5 October 2018 (USA)",
                "More than two decades have passed since Sarah Connor prevented Judgment Day, changed the future, and re-wrote the fate of the human race. Dani Ramos is living a simple life in Mexico City with her brother and father when a highly advanced and deadly new Terminator – a Rev-9 – travels back through time to hunt and kill her. Dani's survival depends on her joining forces with two warriors: Grace, an enhanced super-soldier from the future, and a battle-hardened Sarah Connor. As the Rev-9 ruthlessly destroys everything and everyone in its path on the hunt for Dani, the three are led to a T-800 from Sarah’s past that may be their last best hope.",
                "2019-11-01",
                "Tim Miller",
                "James Cameron",
                "Director",
                "Producer",
                "8CjYw1hARhY",
                "YouTube"));

        return detailMovieEntities;
    }

    public static ArrayList<DetailMovieEntity> generatePilemDetailTvshow(int idMovie) {

        ArrayList<DetailMovieEntity> tvshowEntities = new ArrayList<>();

        tvshowEntities.add(new DetailMovieEntity(
                290859,
                "https://image.tmdb.org/t/p/w500/vqzNJRH4YyquRiWxCCOH0aXggHI.jpg",
                "https://image.tmdb.org/t/p/w500/vqzNJRH4YyquRiWxCCOH0aXggHI.jpg",
                "Terminator: Dark Fate",
                "6.5",
                "R | 2h 16min | Drama, Music, Romance | 5 October 2018 (USA)",
                "More than two decades have passed since Sarah Connor prevented Judgment Day, changed the future, and re-wrote the fate of the human race. Dani Ramos is living a simple life in Mexico City with her brother and father when a highly advanced and deadly new Terminator – a Rev-9 – travels back through time to hunt and kill her. Dani's survival depends on her joining forces with two warriors: Grace, an enhanced super-soldier from the future, and a battle-hardened Sarah Connor. As the Rev-9 ruthlessly destroys everything and everyone in its path on the hunt for Dani, the three are led to a T-800 from Sarah’s past that may be their last best hope.",
                "2019-11-01",
                "Tim Miller",
                "James Cameron",
                "Director",
                "Producer",
                "8CjYw1hARhY",
                "YouTube"));
        return tvshowEntities;
    }


}
