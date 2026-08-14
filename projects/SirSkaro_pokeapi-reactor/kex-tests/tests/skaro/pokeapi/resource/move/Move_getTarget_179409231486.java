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

public class Move_getTarget_179409231486 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22708;

    public Move_getTarget_179409231486() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22708 = newInstance(Class.forName("skaro.pokeapi.resource.move.Move"));
        setField(term22708, term22708.getClass(), "id", null);
        setField(term22708, term22708.getClass(), "name", null);
        setField(term22708, term22708.getClass(), "accuracy", null);
        setField(term22708, term22708.getClass(), "effectChance", null);
        setField(term22708, term22708.getClass(), "pp", null);
        setField(term22708, term22708.getClass(), "priority", null);
        setField(term22708, term22708.getClass(), "power", null);
        setField(term22708, term22708.getClass(), "contestCombos", null);
        setField(term22708, term22708.getClass(), "contestType", null);
        setField(term22708, term22708.getClass(), "contestEffect", null);
        setField(term22708, term22708.getClass(), "damageClass", null);
        setField(term22708, term22708.getClass(), "effectEntries", null);
        setField(term22708, term22708.getClass(), "effectChanges", null);
        setField(term22708, term22708.getClass(), "flavorTextEntries", null);
        setField(term22708, term22708.getClass(), "generation", null);
        setField(term22708, term22708.getClass(), "machines", null);
        setField(term22708, term22708.getClass(), "meta", null);
        setField(term22708, term22708.getClass(), "names", null);
        setField(term22708, term22708.getClass(), "pastValues", null);
        setField(term22708, term22708.getClass(), "statChanges", null);
        setField(term22708, term22708.getClass(), "superContestEffect", null);
        setField(term22708, term22708.getClass(), "target", null);
        setField(term22708, term22708.getClass(), "type", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.move.Move");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTarget", argTypes, term22708, args);
    }

};


