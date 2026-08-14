package skaro.pokeapi.resource.encounterconditionvalue;

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
import static skaro.pokeapi.resource.encounterconditionvalue.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class EncounterConditionValue_getNames_22676714616 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term764;

    public EncounterConditionValue_getNames_22676714616() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term764 = newInstance(Class.forName("skaro.pokeapi.resource.encounterconditionvalue.EncounterConditionValue"));
        setField(term764, term764.getClass(), "id", null);
        setField(term764, term764.getClass(), "name", null);
        setField(term764, term764.getClass(), "condition", null);
        setField(term764, term764.getClass(), "names", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.encounterconditionvalue.EncounterConditionValue");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNames", argTypes, term764, args);
    }

};


