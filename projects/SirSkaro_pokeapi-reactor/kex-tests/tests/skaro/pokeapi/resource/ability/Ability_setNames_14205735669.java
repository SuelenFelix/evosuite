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

public class Ability_setNames_14205735669 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1831;

    public Ability_setNames_14205735669() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1831 = newInstance(Class.forName("skaro.pokeapi.resource.ability.Ability"));
        setField(term1831, term1831.getClass(), "id", null);
        setField(term1831, term1831.getClass(), "name", null);
        setField(term1831, term1831.getClass(), "isMainSeries", null);
        setField(term1831, term1831.getClass(), "generation", null);
        setField(term1831, term1831.getClass(), "names", null);
        setField(term1831, term1831.getClass(), "effectEntries", null);
        setField(term1831, term1831.getClass(), "effectChanges", null);
        setField(term1831, term1831.getClass(), "flavorTextEntries", null);
        setField(term1831, term1831.getClass(), "pokemon", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.ability.Ability");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setNames", argTypes, term1831, args);
    }

};


