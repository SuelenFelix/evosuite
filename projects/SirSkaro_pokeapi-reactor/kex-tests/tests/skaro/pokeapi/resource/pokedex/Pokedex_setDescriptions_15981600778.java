package skaro.pokeapi.resource.pokedex;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static skaro.pokeapi.resource.pokedex.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Boolean;
import java.util.ArrayList;
import java.lang.Object;
import java.util.LinkedList;

public class Pokedex_setDescriptions_15981600778 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term887;
     Object term966;

    public Pokedex_setDescriptions_15981600778() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term888 = new Integer(-14890619);
        Boolean term902 = new Boolean(false);
        Object term906 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term908 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term906, term906.getClass(), "description", "");
        setField(term908, term908.getClass(), "name", null);
        setField(term908, term908.getClass(), "url", null);
        setField(term906, term906.getClass(), "language", term908);
        Object term909 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term911 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term909, term909.getClass(), "description", "");
        setField(term911, term911.getClass(), "name", null);
        setField(term911, term911.getClass(), "url", null);
        setField(term909, term909.getClass(), "language", term911);
        Object term912 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term914 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term912, term912.getClass(), "description", "");
        setField(term914, term914.getClass(), "name", null);
        setField(term914, term914.getClass(), "url", null);
        setField(term912, term912.getClass(), "language", term914);
        Object term915 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term917 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term915, term915.getClass(), "description", "");
        setField(term917, term917.getClass(), "name", null);
        setField(term917, term917.getClass(), "url", null);
        setField(term915, term915.getClass(), "language", term917);
        Object term918 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term920 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term918, term918.getClass(), "description", "");
        setField(term920, term920.getClass(), "name", null);
        setField(term920, term920.getClass(), "url", null);
        setField(term918, term918.getClass(), "language", term920);
        Object term921 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term923 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term921, term921.getClass(), "description", "");
        setField(term923, term923.getClass(), "name", null);
        setField(term923, term923.getClass(), "url", null);
        setField(term921, term921.getClass(), "language", term923);
        Object term924 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term926 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term924, term924.getClass(), "description", "");
        setField(term926, term926.getClass(), "name", null);
        setField(term926, term926.getClass(), "url", null);
        setField(term924, term924.getClass(), "language", term926);
        ArrayList term904 = new ArrayList();
        ((ArrayList) term904).add(term906);
        ((ArrayList) term904).add(term909);
        ((ArrayList) term904).add(term912);
        ((ArrayList) term904).add(term915);
        ((ArrayList) term904).add(term918);
        ((ArrayList) term904).add(term921);
        ((ArrayList) term904).add(term924);
        Object term931 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term933 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term931, term931.getClass(), "name", "");
        setField(term933, term933.getClass(), "name", null);
        setField(term933, term933.getClass(), "url", null);
        setField(term931, term931.getClass(), "language", term933);
        Object term934 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term936 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term934, term934.getClass(), "name", "");
        setField(term936, term936.getClass(), "name", null);
        setField(term936, term936.getClass(), "url", null);
        setField(term934, term934.getClass(), "language", term936);
        ArrayList term929 = new ArrayList();
        ((ArrayList) term929).add(term931);
        ((ArrayList) term929).add(term934);
        Integer term942 = new Integer(1632125673);
        Object term941 = newInstance(Class.forName("skaro.pokeapi.resource.pokedex.PokemonEntry"));
        Object term944 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term941, term941.getClass(), "entryNumber", term942);
        setField(term944, term944.getClass(), "name", null);
        setField(term944, term944.getClass(), "url", null);
        setField(term941, term941.getClass(), "pokemonSpecies", term944);
        Integer term946 = new Integer(454281060);
        Object term945 = newInstance(Class.forName("skaro.pokeapi.resource.pokedex.PokemonEntry"));
        setField(term945, term945.getClass(), "entryNumber", term946);
        setField(term945, term945.getClass(), "pokemonSpecies", term933);
        Integer term949 = new Integer(-1786399638);
        Object term948 = newInstance(Class.forName("skaro.pokeapi.resource.pokedex.PokemonEntry"));
        setField(term948, term948.getClass(), "entryNumber", term949);
        setField(term948, term948.getClass(), "pokemonSpecies", term936);
        Integer term952 = new Integer(2055867847);
        Object term951 = newInstance(Class.forName("skaro.pokeapi.resource.pokedex.PokemonEntry"));
        setField(term951, term951.getClass(), "entryNumber", term952);
        setField(term951, term951.getClass(), "pokemonSpecies", term908);
        Integer term955 = new Integer(-1048298087);
        Object term954 = newInstance(Class.forName("skaro.pokeapi.resource.pokedex.PokemonEntry"));
        setField(term954, term954.getClass(), "entryNumber", term955);
        setField(term954, term954.getClass(), "pokemonSpecies", term923);
        Integer term958 = new Integer(292681826);
        Object term957 = newInstance(Class.forName("skaro.pokeapi.resource.pokedex.PokemonEntry"));
        setField(term957, term957.getClass(), "entryNumber", term958);
        setField(term957, term957.getClass(), "pokemonSpecies", term917);
        ArrayList term939 = new ArrayList();
        ((ArrayList) term939).add(term941);
        ((ArrayList) term939).add(term945);
        ((ArrayList) term939).add(term948);
        ((ArrayList) term939).add(term951);
        ((ArrayList) term939).add(term954);
        ((ArrayList) term939).add(term957);
        ArrayList term962 = new ArrayList();
        term887 = newInstance(Class.forName("skaro.pokeapi.resource.pokedex.Pokedex"));
        setField(term887, term887.getClass(), "id", term888);
        setField(term887, term887.getClass(), "name", "AZdLeSugwv");
        setField(term887, term887.getClass(), "isMainSeries", term902);
        setField(term887, term887.getClass(), "descriptions", term904);
        setField(term887, term887.getClass(), "names", term929);
        setField(term887, term887.getClass(), "pokemonEntries", term939);
        setField(term887, term887.getClass(), "region", term911);
        setField(term887, term887.getClass(), "versionGroups", term962);
        Object term969 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term982 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term969, term969.getClass(), "description", "ShIELyuULw");
        setField(term982, term982.getClass(), "name", "");
        setField(term982, term982.getClass(), "url", "");
        setField(term969, term969.getClass(), "language", term982);
        Object term986 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term988 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term986, term986.getClass(), "description", "");
        setField(term988, term988.getClass(), "name", null);
        setField(term988, term988.getClass(), "url", null);
        setField(term986, term986.getClass(), "language", term988);
        term966 = new LinkedList();
        ((LinkedList) term966).add(term969);
        ((LinkedList) term966).add(term986);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokedex.Pokedex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term966;
        callMethod(klass, "setDescriptions", argTypes, term887, args);
    }

};


