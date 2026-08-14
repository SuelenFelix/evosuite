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

public class Ability_getEffectEntries_210343045314 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2437;

    public Ability_getEffectEntries_210343045314() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2437 = newInstance(Class.forName("skaro.pokeapi.resource.ability.Ability"));
        setField(term2437, term2437.getClass(), "id", null);
        setField(term2437, term2437.getClass(), "name", null);
        setField(term2437, term2437.getClass(), "isMainSeries", null);
        setField(term2437, term2437.getClass(), "generation", null);
        setField(term2437, term2437.getClass(), "names", null);
        setField(term2437, term2437.getClass(), "effectEntries", null);
        setField(term2437, term2437.getClass(), "effectChanges", null);
        setField(term2437, term2437.getClass(), "flavorTextEntries", null);
        setField(term2437, term2437.getClass(), "pokemon", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.ability.Ability");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEffectEntries", argTypes, term2437, args);
    }

};


