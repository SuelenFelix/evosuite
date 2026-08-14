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

public class Ability_setName_18170681267 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10190;

    public Ability_setName_18170681267() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10190 = newInstance(Class.forName("skaro.pokeapi.resource.ability.Ability"));
        setField(term10190, term10190.getClass(), "id", null);
        setField(term10190, term10190.getClass(), "name", null);
        setField(term10190, term10190.getClass(), "isMainSeries", null);
        setField(term10190, term10190.getClass(), "generation", null);
        setField(term10190, term10190.getClass(), "names", null);
        setField(term10190, term10190.getClass(), "effectEntries", null);
        setField(term10190, term10190.getClass(), "effectChanges", null);
        setField(term10190, term10190.getClass(), "flavorTextEntries", null);
        setField(term10190, term10190.getClass(), "pokemon", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.ability.Ability");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setName", argTypes, term10190, args);
    }

};


