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

public class EncounterCondition_getId_154619112510 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term376;

    public EncounterCondition_getId_154619112510() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term376 = newInstance(Class.forName("skaro.pokeapi.resource.encountercondition.EncounterCondition"));
        setField(term376, term376.getClass(), "id", null);
        setField(term376, term376.getClass(), "name", null);
        setField(term376, term376.getClass(), "names", null);
        setField(term376, term376.getClass(), "values", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.encountercondition.EncounterCondition");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term376, args);
    }

};


