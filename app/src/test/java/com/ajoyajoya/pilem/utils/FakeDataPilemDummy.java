package com.ajoyajoya.pilem.utils;

import com.ajoyajoya.pilem.data.DetailMovieItems;
import com.ajoyajoya.pilem.data.MovieEntity;
import com.ajoyajoya.pilem.data.TvshowEntity;
import com.ajoyajoya.pilem.data.source.DetailMovieEntity;
import com.ajoyajoya.pilem.data.source.remote.response.MovieResponse;
import com.ajoyajoya.pilem.data.source.remote.response.TvshowResponse;

import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class FakeDataPilemDummy {

    public static ArrayList<MovieEntity> generatePilemMovie() {

        ArrayList<MovieEntity> movieEntities = new ArrayList<>();

        movieEntities.add(new MovieEntity(
                1,
                "R.drawable.poster_a_star",
                "A Star is Born (2018)",
                "7.8",
                "R | 2h 16min | Drama, Music, Romance | 5 October 2018 (USA)",
                "A musician helps a young singer find fame as age and alcoholism send his own career into a downward spiral. \n Seasoned musician Jackson Maine (Bradley Cooper) discovers-and falls in love with-struggling artist Ally (Gaga). She has just about given up on her dream to make it big as a singer - until Jack coaxes her into the spotlight. But even as Ally s career takes off, the personal side of their relationship is breaking down, as Jack fights an ongoing battle with his own internal demons."));
        movieEntities.add(new MovieEntity(
                2,
                "R.drawable.poster_aquaman",
                "Aquaman (2018)",
                "7.1",
                "PG-13 | 2h 23min | Action, Adventure, Fantasy | 21 December 2018 (USA)",
                "Arthur Curry, the human-born heir to the underwater kingdom of Atlantis, goes on a quest to prevent a war between the worlds of ocean and land. \\nArthur Curry, half human half from Atlantis, goes on a trip of a lifetime. Not only does this adventure compel him to come to terms with his real identity, but it also forces him to discover whether he is entirely worthy of fulfilling his own destiny: becoming a king."));
        movieEntities.add(new MovieEntity(
                3,
                "R.drawable.poster_avengerinfinity",
                "Avengers: Infinity War (2018)",
                "8.5",
                "PG-13 | 2h 29min | Action, Adventure, Sci-Fi | 27 April 2018 (USA)",
                "The Avengers and their allies must be willing to sacrifice all in an attempt to defeat the powerful Thanos before his blitz of devastation and ruin puts an end to the universe. \\nAs the Avengers and their allies have continued to protect the world from threats too large for any one hero to handle, a new danger has emerged from the cosmic shadows: Thanos. A despot of intergalactic infamy, his goal is to collect all six Infinity Stones, artifacts of unimaginable power, and use them to inflict his twisted will on all of reality. Everything the Avengers have fought for has led up to this moment, the fate of Earth and existence has never been more uncertain."));
        movieEntities.add(new MovieEntity(
                4,
                "R.drawable.poster_birdbox",
                "Bird Box 2018",
                "6.6",
                "R | 2h 4min | Drama, Horror, Sci-Fi | 21 December 2018 (USA)",
                "Five years after an ominous unseen presence drives most of society to suicide, a mother and her two children make a desperate bid to reach safety. \\nIn the wake of an unknown global terror, a mother must find the strength to flee with her children down a treacherous river in search of safety. Due to unseen deadly forces, the perilous journey must be made blindly. Directed by Emmy winner Susanne Bier, Bird Box is a thriller starring Academy Award winner Sandra Bullock, John Malkovich, Sarah Paulson, and Trevante Rhodes."));
        movieEntities.add(new MovieEntity(
                5,
                "R.drawable.poster_bohemian",
                "Bohemian Rhapsody (2018)",
                "8.0",
                "PG-13 | 2h 14min | Biography, Drama, Music | 2 November 2018 (USA)",
                "The story of the legendary rock band Queen and lead singer Freddie Mercury, leading up to their famous performance at Live Aid (1985). \\nBohemian Rhapsody is a foot-stomping celebration of Queen, their music and their extraordinary lead singer Freddie Mercury. Freddie defied stereotypes and shattered convention to become one of the most beloved entertainers on the planet. The film traces the meteoric rise of the band through their iconic songs and revolutionary sound. They reach unparalleled success, but in an unexpected turn Freddie, surrounded by darker influences, shuns Queen in pursuit of his solo career. Having suffered greatly without the collaboration of Queen, Freddie manages to reunite with his bandmates just in time for Live Aid. While bravely facing a recent AIDS diagnosis, Freddie leads the band in one of the greatest performances in the history of rock music. Queen cements a legacy that continues to inspire outsiders, dreamers and music lovers to this day."));
        movieEntities.add(new MovieEntity(
                6,
                "R.drawable.poster_bumblebee",
                "Bumblebee (2018)",
                "6.9",
                "PG-13 | 1h 54min | Action, Adventure, Sci-Fi | 21 December 2018 (USA)",
                "On the run in the year 1987, Bumblebee finds refuge in a junkyard in a small California beach town. On the cusp of turning 18 and trying to find her place in the world, Charlie Watson discovers Bumblebee, battle-scarred and broken. \nOn Cybertron, the Autobots, led by Optimus Prime, are on the verge of losing the Great Cybertronian War to their enemies, the Decepticons, and begin making preparations to leave the planet. The Decepticons led by Shockwave, Soundwave and Starscream ambush them during the evacuation, and Optimus sends a young scout, B-127, to Earth in order to set up a base of operations where the Autobots can regroup. B-127 reaches Earth alone in 1987, crash-landing in California and disrupting a training exercise being conducted by Sector 7, a secret government agency that monitors extraterrestrial activity on Earth. Sector 7 agent Colonel Jack Burns presumes B-127 to be a hostile invader and attacks, driving B-127 into the forest, where he is then ambushed by the Decepticon Blitzwing. When B-127 refuses to reveal Optimus  whereabouts, Blitzwing spitefully tears out his voice-box and damages his memory core. B-127 manages to destroy Blitzwing before collapsing from his wounds. Before entering stasis"));

        movieEntities.add(new MovieEntity(
                7,
                "R.drawable.poster_creed",
                "Creed II (2018)",
                "7.2",
                "PG-13 | 2h 10min | Drama, Sport | 21 November 2018 (USA)",
                "Under the tutelage of Rocky Balboa, newly crowned heavyweight champion Adonis Creed faces off against Viktor Drago, the son of Ivan Drago. \\nYears after Adonis Creed made a name for himself under Rocky Balboa s mentorship, the young boxer becomes the Heavyweight Champion of the World. While life is good with that victory and his marriage to Bianca, trouble comes to Philadelphia when Ivan Drago, the Russian boxer who killed Adonis  father, Apollo, arrives with his son, Viktor, to challenge Adonis. Against Rocky s advice, Adonis accepts the challenge without his mentor s participation and pays the price in a punishing bout he wins only by a technicality. Now injured and demoralized, Adonis cannot bring himself to back into the game, leaving his spirit and title in jeopardy. Together, Adonis  family and Rocky must find a way to rekindle Adonis  fighting spirit to face the future in whatever choice he makes. Meanwhile, the Drago family have its own troubles trying to regain the respect in their homeland that they lost at Rocky s hands as they wonder whether is it truly worth it."));

        movieEntities.add(new MovieEntity(
                8,
                "R.drawable.poster_deadpool",
                "Deadpool 2 (2018)",
                "7.8",
                "R | 1h 59min | Action, Adventure, Comedy | 18 May 2018 (USA)",
                "Foul-mouthed mutant mercenary Wade Wilson (AKA. Deadpool), brings together a team of fellow mutant rogues to protect a young boy with supernatural abilities from the brutal, time-traveling cyborg, Cable. \nAfter losing Vanessa (Morena Baccarin), the love of his life, 4th-wall breaking mercenary Wade Wilson aka Deadpool (Ryan Reynolds) must assemble a team and protect a young, full-figured mutant Russell Collins aka Firefist (Julian Dennison) from Cable (Josh Brolin), a no-nonsense, dangerous cyborg from the future, and must also learn the most important lesson of all: to be part of a family again."));

        movieEntities.add(new MovieEntity(
                9,
                "R.drawable.poster_dragon",
                "How to Train Your Dragon: The Hidden World (2019)",
                "7.6",
                "PG | 1h 44min | Animation, Action, Adventure | 22 February 2019 (USA)",
                "When Hiccup discovers Toothless isn t the only Night Fury, he must seek \"The Hidden World\", a secret Dragon Utopia before a hired tyrant named Grimmel finds it first. \nAs Hiccup fulfills his dream of creating a peaceful dragon utopia, Toothless  discovery of an untamed, elusive mate draws the Night Fury away. When danger mounts at home and Hiccup s reign as village chief is tested, both dragon and rider must make impossible decisions to save their kind."));

        movieEntities.add(new MovieEntity(
                10,
                "R.drawable.poster_dragonball",
                "Dragon Ball Super: Broly (2018)",
                "8.0",
                "PG | 1h 40min | Animation, Action, Adventure | 16 January 2019 (USA)",
                "Goku and Vegeta encounter Broly, a Saiyan warrior unlike any fighter they ve faced before. \\nGoku and Vegeta encounter Broly, a Saiyan warrior unlike any fighter they ve faced before.Knowing that there are increasingly powerful forces in the universe that he has yet to encounter, Goku spends all of his time training to achieve even greater strength. But, one fateful day a mysterious new Saiyan appears before Goku and Vegeta: Broly. How can a Saiyan a member of the proud warrior race that was completely annihilated after the destruction of Planet Vegeta appear here on Earth? With Friezas return from hell, a fierce battle awaits the three mighty Saiyans who have followed completely different destinies."));


        return movieEntities;
    }

    public static ArrayList<TvshowEntity> generatePilemTvshow() {

        ArrayList<TvshowEntity> tvshowEntities = new ArrayList<>();

        tvshowEntities.add(new TvshowEntity(
                1,
                "Spoiled billionaire playboy Oliver Queen is missing and presumed dead when his yacht is lost at sea. He returns five years later a changed man, determined to clean up the city as a hooded vigilante armed with a bow.",
                "Arrow (2012)",
                "7.6",
                "TV-14 | 42min | Action, Adventure, Crime | TV Series (2012– )",
                "R.drawable.tv_poster_arrow"));

        tvshowEntities.add(new TvshowEntity(
                2,
                "The adventures of an idealistic mad scientist and his field team of superpowered outcasts.\\n\n" +
                        "A re-imagining of one of DCs most beloved group of outcast Super Heroes: Robotman, Negative Man, Elasti-Girl and Crazy Jane, led by modern-day mad scientist Dr. Niles Caulder (The Chief). The Doom Patrols members each suffered horrible accidents that gave them superhuman abilities - but also left them scarred and disfigured. Traumatized and downtrodden, the team found purpose through The Chief, who brought them together to investigate the weirdest phenomena in existence - and to protect Earth from what they find. \n" +
                        "Part support group, part Super Hero team, the Doom Patrol is a band of super-powered freaks who fight for a world that wants nothing to do with them. Picking up after the events of Titans, Doom Patrol will find these reluctant heroes in a place they never expected to be, called to action by none other than Cyborg, who comes to them with a mission hard to refuse, but with a warning that is hard to ignore: their lives will never, ever be the same.\n" +
                        "",
                "Doom Patrol (2019)",
                "8.2",
                "TV-MA | 1h | Action, Adventure, Comedy | TV Series (2019– )",
                "R.drawable.tv_poster_doom_patrol"));

        tvshowEntities.add(new TvshowEntity(
                3,
                "Son Gokû, a fighter with a monkey tail, goes on a quest with an assortment of odd characters in search of the Dragon Balls, a set of crystals that can give its bearer anything they desire.\\n\n" +
                        "What starts off as a bizarre re-telling of the Chinese legend \"Journey to the West\" quickly transforms into pure madness. On a twisted version of Earth, the ridiculously strong child-fighter Son Gokû is joined by several companions in the quest for the seven \"dragon balls\", which, when assembled, will summon the Grand Dragon, who will grant the bearer of the balls one single wish. The problem is, the Grand Dragon can only be invoked once a year, and villains battle Goku and friends constantly for possession of the Dragon Balls.\n",
                "Dragon Ball (1986)",
                "8.5",
                "TV-Y7 | 24min | Animation, Action, Adventure | TV Series (1986–1989)",
                "R.drawable.tv_poster_dragon_ball"));

        tvshowEntities.add(new TvshowEntity(
                4,
                "Lucy, an aspiring Celestial Wizard, becomes a friend and ally to powerful wizards Natsu, Gray, and Erza, who are part of the (in)famous wizard guild, Fairy Tail.\\n\n" +
                        "Lucy, a 17 year old girl, sets out on journey to become a full-fledged wizard and joins the strongest and most (in) famous guild FAIRY TAIL where she meets Natsu, Happy, Gray and Erza, who treat her more like family than friends. This epic series takes us through all the dangers that the members of fairy tail face and eventually overcome through mutual love and friendship.\n",
                "Fairy Tail (2009)",
                "8.1",
                "TV-14 | 24min | Animation, Action, Adventure | TV Series (2009– )",
                "R.drawable.tv_poster_fairytail"));

        tvshowEntities.add(new TvshowEntity(
                5,
                "In a wacky Rhode Island town, a dysfunctional family strive to cope with everyday life as they are thrown from one crazy scenario to another.\\n\n" +
                        "Sick, twisted and politically incorrect, the animated series features the adventures of the Griffin family. Endearingly ignorant Peter and his stay-at-home wife Lois reside in Quahog, R.I., and have three kids. Meg, the eldest child, is a social outcast, and teenage Chris is awkward and clueless when it comes to the opposite sex. The youngest, Stewie, is a genius baby bent on killing his mother and destroying the world. The talking dog, Brian, keeps Stewie in check while sipping martinis and sorting through his own life issues.\n",
                "Family Guy (1999)",
                "8.2",
                "TV-14 | 22min | Animation, Comedy | TV Series (1999– )",
                "R.drawable.tv_poster_family_guy"));

        tvshowEntities.add(new TvshowEntity(
                6,
                "After being struck by lightning, Barry Allen wakes up from his coma to discover hes been given the power of super speed, becoming the Flash, fighting crime in Central City.\\n\n" +
                        "Barry Allen is a Central City police forensic scientist with a reasonably happy life, despite the childhood trauma of a mysterious red and yellow lightning killing his mother and framing his father. All that changes when a massive particle accelerator accident leads to Barry being struck by lightning in his lab. Coming out of coma nine months later, Barry and his new friends at S.T.A.R labs find that he now has the ability to move at superhuman speed. Furthermore, Barry learns that he is but one of many affected by that event, most of whom are using their powers for evil. Determined to make a difference, Barry dedicates his life to fighting such threats, as The Flash. While he gains allies he never expected, there are also secret forces determined to aid and manipulate him for their own agenda.\n",
                "The Flash (2014)",
                "7.8",
                "TV-PG | 43min | Action, Adventure, Drama | TV Series (2014– )",
                "R.drawable.tv_poster_flash"));

        tvshowEntities.add(new TvshowEntity(
                7,
                "When Dre discovers Zoey is questioning her belief in God, he undergoes a crisis of faith and leans on family members and coworkers for their input. Meanwhile, Bows brother Johan comes to stay with The Johnsons after living abroad and becomes an instant thorn in Dres side.\n",
                "God (2016)",
                "7.5",
                "TV-PG | 21min | Comedy | Episode aired 28 September 2016",
                "R.drawable.tv_poster_god"));

        tvshowEntities.add(new TvshowEntity(
                8,
                "The story behind Detective James Gordons rise to prominence in Gotham City in the years before Batmans arrival.\\n\n" +
                        "In crime ridden Gotham City, Thomas and Martha Wayne are murdered before young Bruce Waynes eyes. Although Gotham City Police Department detectives, James Gordon, and his cynical partner, Harvey Bullock, seem to solaces the case quickly, things are not so simple. Inspired by Bruces traumatized desire for justice, Gordon vows to find it amid Gothams corruption. Thus begins Gordons lonely quest that would set him against his own comrades and the underworld with their own deadly rivalries and mysteries.\\n\n" +
                        "In the coming wars, innocence will be lost and compromises will be made as some criminals will fall as casualties while others will rise as super villains. All the while, young Bruce observes this war with a growing obsession that would one day drive him to seek his own justice against the evil of Gotham as The Batman.\n" +
                        "",
                "Gotham (2014)",
                "7.9",
                "TV-14 | 42min | Action, Crime, Drama | TV Series (2014–2019)",
                "R.drawable.tv_poster_gotham"));

        tvshowEntities.add(new TvshowEntity(
                9,
                "A drama centered on the personal and professional lives of five surgical interns and their supervisors.\\n\n" +
                        "A medical based drama centered around Meredith Grey, an aspiring surgeon and daughter of one of the best surgeons, Dr. Ellis Grey. Throughout the series, Meredith goes through professional and personal challenges along with fellow surgeons at Seattle Grace Hospital.\n",
                "Grey Anatomy (2005)",
                "7.6",
                "TV-14 | 41min | Drama, Romance | TV Series (2005– )",
                "R.drawable.tv_poster_grey_anatomy"));

        tvshowEntities.add(new TvshowEntity(
                10,
                "In equal parts high-concept thriller and coming-of-age drama, HANNA follows the journey of an extraordinary young girl raised in the forest, as she evades the relentless pursuit of an off-book CIA agent and tries to unearth the truth behind who she is.\\n\n" +
                        "In equal parts high-concept thriller and coming-of-age drama, HANNA follows the journey of an extraordinary young girl raised in the forest, as she evades the relentless pursuit of an off-book CIA agent and tries to unearth the truth behind who she is.\n" +
                        "",
                "Hanna (2019)",
                "7.6",
                "TV-MA | 1h | Action, Drama | TV Series (2019– )",
                "R.drawable.tv_poster_hanna"));


        return tvshowEntities;
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

    public static ArrayList<DetailMovieItems> generateRemoteDetailMovie(int idMovie) {

        ArrayList<DetailMovieItems> detailMovieItems = new ArrayList<>();
        try {
            JSONObject[] responseObject = new JSONObject[4];

            responseObject[0].put("id", "290859");
            responseObject[0].put("backdrop_path", "https://image.tmdb.org/t/p/w500/vqzNJRH4YyquRiWxCCOH0aXggHI.jpg");
            responseObject[0].put("poster_path", "https://image.tmdb.org/t/p/w500/vqzNJRH4YyquRiWxCCOH0aXggHI.jpg");
            responseObject[0].put("original_title", "Terminator: Dark Fate");
            responseObject[0].put("vote_average", "6.5");
            responseObject[0].put("genres", "R | 2h 16min | Drama, Music, Romance | 5 October 2018 (USA)");
            responseObject[0].put("overview", "More than two decades have passed since Sarah Connor prevented Judgment Day, changed the future, and re-wrote the fate of the human race. Dani Ramos is living a simple life in Mexico City with her brother and father when a highly advanced and deadly new Terminator – a Rev-9 – travels back through time to hunt and kill her. Dani's survival depends on her joining forces with two warriors: Grace, an enhanced super-soldier from the future, and a battle-hardened Sarah Connor. As the Rev-9 ruthlessly destroys everything and everyone in its path on the hunt for Dani, the three are led to a T-800 from Sarah’s past that may be their last best hope.");
            responseObject[0].put("release_date", "2019-11-01");
            responseObject[1].getJSONArray("crew").getJSONObject(0).put("name", "Tim Miller");
            responseObject[1].getJSONArray("crew").getJSONObject(1).put("name", "James Cameron");
            responseObject[1].getJSONArray("crew").getJSONObject(0).put("job", "Director");
            responseObject[1].getJSONArray("crew").getJSONObject(1).put("job", "Producer");
            responseObject[2].getJSONArray("results").getJSONObject(0).put("key", "8CjYw1hARhY");
            responseObject[2].getJSONArray("results").getJSONObject(0).put("site", "YouTube");

            detailMovieItems.add(new DetailMovieItems(responseObject));

        } catch (Exception ignored) {

        }
        return detailMovieItems;
    }

    public static ArrayList<DetailMovieItems> generateRemoteDetailTv(int idMovie) {

        ArrayList<DetailMovieItems> detailTvItems = new ArrayList<>();
        try {
            JSONObject[] responseObject = new JSONObject[4];

            responseObject[0].put("id", "290859");
            responseObject[0].put("backdrop_path", "https://image.tmdb.org/t/p/w500/vqzNJRH4YyquRiWxCCOH0aXggHI.jpg");
            responseObject[0].put("poster_path", "https://image.tmdb.org/t/p/w500/vqzNJRH4YyquRiWxCCOH0aXggHI.jpg");
            responseObject[0].put("original_title", "Terminator: Dark Fate");
            responseObject[0].put("vote_average", "6.5");
            responseObject[0].put("genres", "R | 2h 16min | Drama, Music, Romance | 5 October 2018 (USA)");
            responseObject[0].put("overview", "More than two decades have passed since Sarah Connor prevented Judgment Day, changed the future, and re-wrote the fate of the human race. Dani Ramos is living a simple life in Mexico City with her brother and father when a highly advanced and deadly new Terminator – a Rev-9 – travels back through time to hunt and kill her. Dani's survival depends on her joining forces with two warriors: Grace, an enhanced super-soldier from the future, and a battle-hardened Sarah Connor. As the Rev-9 ruthlessly destroys everything and everyone in its path on the hunt for Dani, the three are led to a T-800 from Sarah’s past that may be their last best hope.");
            responseObject[0].put("release_date", "2019-11-01");
            responseObject[1].getJSONArray("crew").getJSONObject(0).put("name", "Tim Miller");
            responseObject[1].getJSONArray("crew").getJSONObject(1).put("name", "James Cameron");
            responseObject[1].getJSONArray("crew").getJSONObject(0).put("job", "Director");
            responseObject[1].getJSONArray("crew").getJSONObject(1).put("job", "Producer");
            responseObject[2].getJSONArray("results").getJSONObject(0).put("key", "8CjYw1hARhY");
            responseObject[2].getJSONArray("results").getJSONObject(0).put("site", "YouTube");

            detailTvItems.add(new DetailMovieItems(responseObject));

        } catch (Exception ignored) {

        }
        return detailTvItems;
    }


}
