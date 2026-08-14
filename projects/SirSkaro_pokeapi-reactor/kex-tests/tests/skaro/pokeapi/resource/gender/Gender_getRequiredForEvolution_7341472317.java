package skaro.pokeapi.resource.gender;

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
import static skaro.pokeapi.resource.gender.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.util.ArrayList;
import java.lang.Object;

public class Gender_getRequiredForEvolution_7341472317 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term565;

    public Gender_getRequiredForEvolution_7341472317() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term566 = new Integer(-1530420153);
        Integer term583 = new Integer(-469968304);
        Object term582 = newInstance(Class.forName("skaro.pokeapi.resource.gender.PokemonSpeciesGender"));
        Object term585 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term582, term582.getClass(), "rate", term583);
        setField(term585, term585.getClass(), "name", null);
        setField(term585, term585.getClass(), "url", null);
        setField(term582, term582.getClass(), "pokemonSpecies", term585);
        ArrayList term580 = new ArrayList();
        ((ArrayList) term580).add(term582);
        ArrayList term588 = new ArrayList();
        term565 = newInstance(Class.forName("skaro.pokeapi.resource.gender.Gender"));
        setField(term565, term565.getClass(), "id", term566);
        setField(term565, term565.getClass(), "name", "TJmVBGfTML");
        setField(term565, term565.getClass(), "pokemonSpeciesDetails", term580);
        setField(term565, term565.getClass(), "requiredForEvolution", term588);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.gender.Gender");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRequiredForEvolution", argTypes, term565, args);
    }

};


