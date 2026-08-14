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

public class Ability_setEffectChanges_117105271619 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3057;

    public Ability_setEffectChanges_117105271619() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3057 = newInstance(Class.forName("skaro.pokeapi.resource.ability.Ability"));
        setField(term3057, term3057.getClass(), "id", null);
        setField(term3057, term3057.getClass(), "name", null);
        setField(term3057, term3057.getClass(), "isMainSeries", null);
        setField(term3057, term3057.getClass(), "generation", null);
        setField(term3057, term3057.getClass(), "names", null);
        setField(term3057, term3057.getClass(), "effectEntries", null);
        setField(term3057, term3057.getClass(), "effectChanges", null);
        setField(term3057, term3057.getClass(), "flavorTextEntries", null);
        setField(term3057, term3057.getClass(), "pokemon", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.ability.Ability");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setEffectChanges", argTypes, term3057, args);
    }

};


