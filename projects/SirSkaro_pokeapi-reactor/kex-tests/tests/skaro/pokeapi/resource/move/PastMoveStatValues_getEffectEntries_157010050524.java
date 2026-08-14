package skaro.pokeapi.resource.move;

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
import static skaro.pokeapi.resource.move.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class PastMoveStatValues_getEffectEntries_157010050524 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1740;

    public PastMoveStatValues_getEffectEntries_157010050524() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1740 = newInstance(Class.forName("skaro.pokeapi.resource.move.PastMoveStatValues"));
        setField(term1740, term1740.getClass(), "accuracy", null);
        setField(term1740, term1740.getClass(), "effectChance", null);
        setField(term1740, term1740.getClass(), "power", null);
        setField(term1740, term1740.getClass(), "pp", null);
        setField(term1740, term1740.getClass(), "effectEntries", null);
        setField(term1740, term1740.getClass(), "type", null);
        setField(term1740, term1740.getClass(), "versionGroup", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.move.PastMoveStatValues");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEffectEntries", argTypes, term1740, args);
    }

};


