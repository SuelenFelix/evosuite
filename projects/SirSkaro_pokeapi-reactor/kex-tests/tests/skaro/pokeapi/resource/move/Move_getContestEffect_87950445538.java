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

public class Move_getContestEffect_87950445538 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13273;

    public Move_getContestEffect_87950445538() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13273 = newInstance(Class.forName("skaro.pokeapi.resource.move.Move"));
        setField(term13273, term13273.getClass(), "id", null);
        setField(term13273, term13273.getClass(), "name", null);
        setField(term13273, term13273.getClass(), "accuracy", null);
        setField(term13273, term13273.getClass(), "effectChance", null);
        setField(term13273, term13273.getClass(), "pp", null);
        setField(term13273, term13273.getClass(), "priority", null);
        setField(term13273, term13273.getClass(), "power", null);
        setField(term13273, term13273.getClass(), "contestCombos", null);
        setField(term13273, term13273.getClass(), "contestType", null);
        setField(term13273, term13273.getClass(), "contestEffect", null);
        setField(term13273, term13273.getClass(), "damageClass", null);
        setField(term13273, term13273.getClass(), "effectEntries", null);
        setField(term13273, term13273.getClass(), "effectChanges", null);
        setField(term13273, term13273.getClass(), "flavorTextEntries", null);
        setField(term13273, term13273.getClass(), "generation", null);
        setField(term13273, term13273.getClass(), "machines", null);
        setField(term13273, term13273.getClass(), "meta", null);
        setField(term13273, term13273.getClass(), "names", null);
        setField(term13273, term13273.getClass(), "pastValues", null);
        setField(term13273, term13273.getClass(), "statChanges", null);
        setField(term13273, term13273.getClass(), "superContestEffect", null);
        setField(term13273, term13273.getClass(), "target", null);
        setField(term13273, term13273.getClass(), "type", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.move.Move");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getContestEffect", argTypes, term13273, args);
    }

};


