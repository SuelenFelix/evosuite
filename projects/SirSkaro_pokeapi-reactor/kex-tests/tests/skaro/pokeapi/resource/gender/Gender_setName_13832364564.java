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

public class Gender_setName_13832364564 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term381;

    public Gender_setName_13832364564() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term382 = new Integer(1622346318);
        Integer term399 = new Integer(1048535127);
        Object term398 = newInstance(Class.forName("skaro.pokeapi.resource.gender.PokemonSpeciesGender"));
        Object term401 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term398, term398.getClass(), "rate", term399);
        setField(term401, term401.getClass(), "name", null);
        setField(term401, term401.getClass(), "url", null);
        setField(term398, term398.getClass(), "pokemonSpecies", term401);
        Integer term403 = new Integer(-655067527);
        Object term402 = newInstance(Class.forName("skaro.pokeapi.resource.gender.PokemonSpeciesGender"));
        Object term405 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term402, term402.getClass(), "rate", term403);
        setField(term405, term405.getClass(), "name", null);
        setField(term405, term405.getClass(), "url", null);
        setField(term402, term402.getClass(), "pokemonSpecies", term405);
        ArrayList term396 = new ArrayList();
        ((ArrayList) term396).add(term398);
        ((ArrayList) term396).add(term402);
        ArrayList term408 = new ArrayList();
        term381 = newInstance(Class.forName("skaro.pokeapi.resource.gender.Gender"));
        setField(term381, term381.getClass(), "id", term382);
        setField(term381, term381.getClass(), "name", "SbAoxhfrkn");
        setField(term381, term381.getClass(), "pokemonSpeciesDetails", term396);
        setField(term381, term381.getClass(), "requiredForEvolution", term408);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.gender.Gender");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "nyiiPDVjAc";
        callMethod(klass, "setName", argTypes, term381, args);
    }

};


