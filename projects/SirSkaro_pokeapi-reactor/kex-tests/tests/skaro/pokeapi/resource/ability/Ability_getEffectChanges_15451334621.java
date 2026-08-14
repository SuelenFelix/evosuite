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

public class Ability_getEffectChanges_15451334621 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11877;

    public Ability_getEffectChanges_15451334621() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11877 = newInstance(Class.forName("skaro.pokeapi.resource.ability.Ability"));
        setField(term11877, term11877.getClass(), "id", null);
        setField(term11877, term11877.getClass(), "name", null);
        setField(term11877, term11877.getClass(), "isMainSeries", null);
        setField(term11877, term11877.getClass(), "generation", null);
        setField(term11877, term11877.getClass(), "names", null);
        setField(term11877, term11877.getClass(), "effectEntries", null);
        setField(term11877, term11877.getClass(), "effectChanges", null);
        setField(term11877, term11877.getClass(), "flavorTextEntries", null);
        setField(term11877, term11877.getClass(), "pokemon", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.ability.Ability");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEffectChanges", argTypes, term11877, args);
    }

};


