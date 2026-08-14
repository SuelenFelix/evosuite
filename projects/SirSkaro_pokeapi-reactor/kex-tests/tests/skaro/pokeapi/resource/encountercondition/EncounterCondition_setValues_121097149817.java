package skaro.pokeapi.resource.encountercondition;

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
import static skaro.pokeapi.resource.encountercondition.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class EncounterCondition_setValues_121097149817 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term383;

    public EncounterCondition_setValues_121097149817() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term383 = newInstance(Class.forName("skaro.pokeapi.resource.encountercondition.EncounterCondition"));
        setField(term383, term383.getClass(), "id", null);
        setField(term383, term383.getClass(), "name", null);
        setField(term383, term383.getClass(), "names", null);
        setField(term383, term383.getClass(), "values", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.encountercondition.EncounterCondition");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setValues", argTypes, term383, args);
    }

};


