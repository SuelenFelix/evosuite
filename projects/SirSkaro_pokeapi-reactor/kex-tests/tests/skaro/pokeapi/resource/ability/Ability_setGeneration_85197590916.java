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

public class Ability_setGeneration_85197590916 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11378;

    public Ability_setGeneration_85197590916() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11378 = newInstance(Class.forName("skaro.pokeapi.resource.ability.Ability"));
        setField(term11378, term11378.getClass(), "id", null);
        setField(term11378, term11378.getClass(), "name", null);
        setField(term11378, term11378.getClass(), "isMainSeries", null);
        setField(term11378, term11378.getClass(), "generation", null);
        setField(term11378, term11378.getClass(), "names", null);
        setField(term11378, term11378.getClass(), "effectEntries", null);
        setField(term11378, term11378.getClass(), "effectChanges", null);
        setField(term11378, term11378.getClass(), "flavorTextEntries", null);
        setField(term11378, term11378.getClass(), "pokemon", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.ability.Ability");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("skaro.pokeapi.resource.NamedApiResource");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setGeneration", argTypes, term11378, args);
    }

};


