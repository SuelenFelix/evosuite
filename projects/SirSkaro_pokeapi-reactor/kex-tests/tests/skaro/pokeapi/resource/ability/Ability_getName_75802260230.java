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

public class Ability_getName_75802260230 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3694;

    public Ability_getName_75802260230() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3694 = newInstance(Class.forName("skaro.pokeapi.resource.ability.Ability"));
        setField(term3694, term3694.getClass(), "id", null);
        setField(term3694, term3694.getClass(), "name", null);
        setField(term3694, term3694.getClass(), "isMainSeries", null);
        setField(term3694, term3694.getClass(), "generation", null);
        setField(term3694, term3694.getClass(), "names", null);
        setField(term3694, term3694.getClass(), "effectEntries", null);
        setField(term3694, term3694.getClass(), "effectChanges", null);
        setField(term3694, term3694.getClass(), "flavorTextEntries", null);
        setField(term3694, term3694.getClass(), "pokemon", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.ability.Ability");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term3694, args);
    }

};


