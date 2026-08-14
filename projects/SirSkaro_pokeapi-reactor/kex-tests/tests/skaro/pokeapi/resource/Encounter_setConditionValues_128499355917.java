package skaro.pokeapi.resource;

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
import static skaro.pokeapi.resource.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Encounter_setConditionValues_128499355917 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5739;

    public Encounter_setConditionValues_128499355917() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5739 = newInstance(Class.forName("skaro.pokeapi.resource.Encounter"));
        setField(term5739, term5739.getClass(), "minLevel", null);
        setField(term5739, term5739.getClass(), "maxLevel", null);
        setField(term5739, term5739.getClass(), "conditionValues", null);
        setField(term5739, term5739.getClass(), "chance", null);
        setField(term5739, term5739.getClass(), "method", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.Encounter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setConditionValues", argTypes, term5739, args);
    }

};


