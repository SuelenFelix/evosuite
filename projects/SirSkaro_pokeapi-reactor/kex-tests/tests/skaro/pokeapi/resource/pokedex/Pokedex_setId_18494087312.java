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

public class Pokedex_setId_18494087312 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term324;
     Object term411;

    public Pokedex_setId_18494087312() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term325 = new Integer(-1339778481);
        Boolean term339 = new Boolean(false);
        Object term343 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term345 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term343, term343.getClass(), "description", "");
        setField(term345, term345.getClass(), "name", null);
        setField(term345, term345.getClass(), "url", null);
        setField(term343, term343.getClass(), "language", term345);
        ArrayList term341 = new ArrayList();
        ((ArrayList) term341).add(term343);
        Object term350 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term352 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term350, term350.getClass(), "name", "");
        setField(term352, term352.getClass(), "name", null);
        setField(term352, term352.getClass(), "url", null);
        setField(term350, term350.getClass(), "language", term352);
        Object term353 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term355 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term353, term353.getClass(), "name", "");
        setField(term355, term355.getClass(), "name", null);
        setField(term355, term355.getClass(), "url", null);
        setField(term353, term353.getClass(), "language", term355);
        Object term356 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term358 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term356, term356.getClass(), "name", "");
        setField(term358, term358.getClass(), "name", null);
        setField(term358, term358.getClass(), "url", null);
        setField(term356, term356.getClass(), "language", term358);
        Object term359 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term361 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term359, term359.getClass(), "name", "");
        setField(term361, term361.getClass(), "name", null);
        setField(term361, term361.getClass(), "url", null);
        setField(term359, term359.getClass(), "language", term361);
        Object term362 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term364 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term362, term362.getClass(), "name", "");
        setField(term364, term364.getClass(), "name", null);
        setField(term364, term364.getClass(), "url", null);
        setField(term362, term362.getClass(), "language", term364);
        Object term365 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term367 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term365, term365.getClass(), "name", "");
        setField(term367, term367.getClass(), "name", null);
        setField(term367, term367.getClass(), "url", null);
        setField(term365, term365.getClass(), "language", term367);
        ArrayList term348 = new ArrayList();
        ((ArrayList) term348).add(term350);
        ((ArrayList) term348).add(term353);
        ((ArrayList) term348).add(term356);
        ((ArrayList) term348).add(term359);
        ((ArrayList) term348).add(term362);
        ((ArrayList) term348).add(term365);
        Integer term373 = new Integer(1725571209);
        Object term372 = newInstance(Class.forName("skaro.pokeapi.resource.pokedex.PokemonEntry"));
        Object term375 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term372, term372.getClass(), "entryNumber", term373);
        setField(term375, term375.getClass(), "name", null);
        setField(term375, term375.getClass(), "url", null);
        setField(term372, term372.getClass(), "pokemonSpecies", term375);
        Integer term377 = new Integer(-522618178);
        Object term376 = newInstance(Class.forName("skaro.pokeapi.resource.pokedex.PokemonEntry"));
        Object term379 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term376, term376.getClass(), "entryNumber", term377);
        setField(term379, term379.getClass(), "name", null);
        setField(term379, term379.getClass(), "url", null);
        setField(term376, term376.getClass(), "pokemonSpecies", term379);
        ArrayList term370 = new ArrayList();
        ((ArrayList) term370).add(term372);
        ((ArrayList) term370).add(term376);
        ArrayList term407 = new ArrayList();
        term324 = newInstance(Class.forName("skaro.pokeapi.resource.pokedex.Pokedex"));
        Object term382 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term324, term324.getClass(), "id", term325);
        setField(term324, term324.getClass(), "name", "gGSMzuGICf");
        setField(term324, term324.getClass(), "isMainSeries", term339);
        setField(term324, term324.getClass(), "descriptions", term341);
        setField(term324, term324.getClass(), "names", term348);
        setField(term324, term324.getClass(), "pokemonEntries", term370);
        setField(term382, term382.getClass(), "name", "tPlsykYBqO");
        setField(term382, term382.getClass(), "url", "bLPjGVBhlX");
        setField(term324, term324.getClass(), "region", term382);
        setField(term324, term324.getClass(), "versionGroups", term407);
        term411 = new Integer(1134449235);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokedex.Pokedex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term411;
        callMethod(klass, "setId", argTypes, term324, args);
    }

};


