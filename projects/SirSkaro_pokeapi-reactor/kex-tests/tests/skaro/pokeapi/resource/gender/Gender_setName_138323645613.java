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

public class Gender_setName_138323645613 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term649;

    public Gender_setName_138323645613() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term649 = newInstance(Class.forName("skaro.pokeapi.resource.gender.Gender"));
        setField(term649, term649.getClass(), "id", null);
        setField(term649, term649.getClass(), "name", null);
        setField(term649, term649.getClass(), "pokemonSpeciesDetails", null);
        setField(term649, term649.getClass(), "requiredForEvolution", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.gender.Gender");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setName", argTypes, term649, args);
    }

};


