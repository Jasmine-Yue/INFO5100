import javax.crypto.spec.PSource;
import java.lang.reflect.Array;
import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        // Q1:
        int[][] room = {{0, 0, 0, 0},
                {0, 0, 0, 0},
                {-1, 0, 0, 0},
                {0, 0, -1, 0},
        };
        Roomba robat = new Roomba(room);

        // Q2:group the anagrams
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> ls = groupAnagrams(strs);
        System.out.println("Q2 test result:" + ls.toString());

        //Q3 the total number of continuous subarrays
        int[] nums = new int[]{1, 2, 3};
        int k = 3;
        System.out.println("Q3 test result:" + subarrayTotal(nums, k));

        //Q4
        Netflix netflix = new Netflix();
        Genre action = new Genre("action");
        Genre animation = new Genre("animation");
        Genre love = new Genre("animation");
        netflix.addGenres(action);
        netflix.addGenres(animation);
        netflix.addGenres(love);


        Movie movie1 = new Movie("Frozen",
                new GregorianCalendar(2013, Calendar.NOVEMBER, 27).getTime(),
                new ArrayList<>(Arrays.asList("Idina Menzel", "Kristen Bell")),
                "Chris Buck");

        Movie movie2 = new Movie("THE POWER OF THE DOG",
                new GregorianCalendar(2021, Calendar.NOVEMBER, 17).getTime(),
                new ArrayList<>(Arrays.asList("Kirsten Dunst", "Thomasin McKenzie")),
                "Jane Campion");

        Movie movie3 = new Movie("The Godfather",
                new GregorianCalendar(1972, Calendar.NOVEMBER, 17).getTime(),
                new ArrayList<>(Arrays.asList("Al Pacino", "Marlon Brando")),
                "Francis Ford Coppolan");

        Movie movie4 = new Movie("titanic",
                new GregorianCalendar(1997, Calendar.DECEMBER, 19).getTime(),
                new ArrayList<>(Arrays.asList("Kate Winslet", "Leonardo DiCaprio")),
                "James Cameron");

        action.addMovies(movie2);
        action.addMovies(movie3);
        animation.addMovies(movie1);
        love.addMovies(movie4);

        ArrayList<Movie> moviels = new ArrayList<>();
        moviels.add(movie1);
        moviels.add(movie2);
        moviels.add(movie3);
        moviels.add(movie4);

        // For all movies released before 2000, add the string "(Classic)" to the title of the movie using   flatMap.
        netflix.getGenres().stream().flatMap(genre -> genre.getMovies().stream())
                .filter(movie -> movie.getReleaseDate().getYear() < 2000)
                .map((movie) -> "Classic" + movie.getTitle())
                .forEach(System.out::println);

        //  Get the latest 3 movies released using .limit() method of stream.
        netflix.getGenres().stream().flatMap(genre -> genre.getMovies().stream())
                .sorted((m1, m2) -> m2.getReleaseDate().getYear() - m1.getReleaseDate().getYear())
                .limit(3)
                .forEach(System.out::println);

/*
      Create a predicate for release date before 2000 and a predicate for release date before 1990
             and then Chain the predicates for finding movies between 1990 and 2000.
*/

        Predicate<Date> releaseDateAfter1990 = date -> date.getYear() > 1900;
        Predicate<Date> releaseDateBefore2000 = date -> date.getYear() < 2000;
        releaseDateAfter1990.and(releaseDateBefore2000).test(movie1.getReleaseDate());



/*    Write a method which that will add release year in the title of the movie and return the title and
        then use this method for all the movies.*/

        Function<Movie, String> function1 = (movie) -> movie.getReleaseDate().getYear() + " " + movie.getTitle();
        for (Movie movie : moviels)
            System.out.println(function1.apply(movie));


        // Sorting on one of the feature(Ex: Released year or title) which will use comparator
        Collections.sort(moviels, (m1, m2) -> m1.getTitle().compareTo(m2.getTitle()));
        System.out.println(moviels);


    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0)
            return new ArrayList<>();
        ;
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sortedStr = Arrays.toString(chars);
            List<String> ls;
            if (map.containsKey(sortedStr))
                ls = map.get(sortedStr);
            else
                ls = new ArrayList<>();
            ls.add(str);
            map.put(sortedStr, ls);
        }
        List<List<String>> res = map.values().stream().collect(Collectors.toList());
        return res;
    }


    public static int subarrayTotal(int[] nums, int k) {
        int sum = 0;
        int count = 0;
        //Map<sum, no. of occurence of sum>
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for (int i = 0; i < nums.length; i++) {
            sum = nums[i];
            if (map.containsKey(sum - k))
                count += map.get(sum - k);
            map.put(sum, map.putIfAbsent(map.get(sum), 0) + 1);
        }
        return count;
    }
}






