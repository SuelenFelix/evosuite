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

public class Gender_getName_11918542723 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term344;

    public Gender_getName_11918542723() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term345 = new Integer(-1685132342);
        Integer term362 = new Integer(-1456670397);
        Object term361 = newInstance(Class.forName("skaro.pokeapi.resource.gender.PokemonSpeciesGender"));
        Object term364 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term361, term361.getClass(), "rate", term362);
        setField(term364, term364.getClass(), "name", null);
        setField(term364, term364.getClass(), "url", null);
        setField(term361, term361.getClass(), "pokemonSpecies", term364);
        ArrayList term359 = new ArrayList();
        ((ArrayList) term359).add(term361);
        ArrayList term367 = new ArrayList();
        term344 = newInstance(Class.forName("skaro.pokeapi.resource.gender.Gender"));
        setField(term344, term344.getClass(), "id", term345);
        setField(term344, term344.getClass(), "name", "OWDIEULEFu");
        setField(term344, term344.getClass(), "pokemonSpeciesDetails", term359);
        setField(term344, term344.getClass(), "requiredForEvolution", term367);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.gender.Gender");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term344, args);
    }

};


