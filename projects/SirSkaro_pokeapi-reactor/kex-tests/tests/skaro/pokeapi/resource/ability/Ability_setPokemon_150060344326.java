package skaro.pokeapi.resource.ability;

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
import static skaro.pokeapi.resource.ability.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Ability_setPokemon_150060344326 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3691;

    public Ability_setPokemon_150060344326() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3691 = newInstance(Class.forName("skaro.pokeapi.resource.ability.Ability"));
        setField(term3691, term3691.getClass(), "id", null);
        setField(term3691, term3691.getClass(), "name", null);
        setField(term3691, term3691.getClass(), "isMainSeries", null);
        setField(term3691, term3691.getClass(), "generation", null);
        setField(term3691, term3691.getClass(), "names", null);
        setField(term3691, term3691.getClass(), "effectEntries", null);
        setField(term3691, term3691.getClass(), "effectChanges", null);
        setField(term3691, term3691.getClass(), "flavorTextEntries", null);
        setField(term3691, term3691.getClass(), "pokemon", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.ability.Ability");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setPokemon", argTypes, term3691, args);
    }

};


