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

public class Ability_setGeneration_85197590912 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2243;

    public Ability_setGeneration_85197590912() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2243 = newInstance(Class.forName("skaro.pokeapi.resource.ability.Ability"));
        setField(term2243, term2243.getClass(), "id", null);
        setField(term2243, term2243.getClass(), "name", null);
        setField(term2243, term2243.getClass(), "isMainSeries", null);
        setField(term2243, term2243.getClass(), "generation", null);
        setField(term2243, term2243.getClass(), "names", null);
        setField(term2243, term2243.getClass(), "effectEntries", null);
        setField(term2243, term2243.getClass(), "effectChanges", null);
        setField(term2243, term2243.getClass(), "flavorTextEntries", null);
        setField(term2243, term2243.getClass(), "pokemon", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.ability.Ability");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("skaro.pokeapi.resource.NamedApiResource");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setGeneration", argTypes, term2243, args);
    }

};


