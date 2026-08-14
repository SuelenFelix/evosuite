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

public class Ability_getId_15150959672 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9612;

    public Ability_getId_15150959672() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9612 = newInstance(Class.forName("skaro.pokeapi.resource.ability.Ability"));
        setField(term9612, term9612.getClass(), "id", null);
        setField(term9612, term9612.getClass(), "name", null);
        setField(term9612, term9612.getClass(), "isMainSeries", null);
        setField(term9612, term9612.getClass(), "generation", null);
        setField(term9612, term9612.getClass(), "names", null);
        setField(term9612, term9612.getClass(), "effectEntries", null);
        setField(term9612, term9612.getClass(), "effectChanges", null);
        setField(term9612, term9612.getClass(), "flavorTextEntries", null);
        setField(term9612, term9612.getClass(), "pokemon", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.ability.Ability");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term9612, args);
    }

};


