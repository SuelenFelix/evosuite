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

public class Ability_getFlavorTextEntries_36950638337 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3701;

    public Ability_getFlavorTextEntries_36950638337() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3701 = newInstance(Class.forName("skaro.pokeapi.resource.ability.Ability"));
        setField(term3701, term3701.getClass(), "id", null);
        setField(term3701, term3701.getClass(), "name", null);
        setField(term3701, term3701.getClass(), "isMainSeries", null);
        setField(term3701, term3701.getClass(), "generation", null);
        setField(term3701, term3701.getClass(), "names", null);
        setField(term3701, term3701.getClass(), "effectEntries", null);
        setField(term3701, term3701.getClass(), "effectChanges", null);
        setField(term3701, term3701.getClass(), "flavorTextEntries", null);
        setField(term3701, term3701.getClass(), "pokemon", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.ability.Ability");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFlavorTextEntries", argTypes, term3701, args);
    }

};


