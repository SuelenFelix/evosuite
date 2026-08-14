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

public class Move_getPriority_64109878622 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10182;

    public Move_getPriority_64109878622() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10182 = newInstance(Class.forName("skaro.pokeapi.resource.move.Move"));
        setField(term10182, term10182.getClass(), "id", null);
        setField(term10182, term10182.getClass(), "name", null);
        setField(term10182, term10182.getClass(), "accuracy", null);
        setField(term10182, term10182.getClass(), "effectChance", null);
        setField(term10182, term10182.getClass(), "pp", null);
        setField(term10182, term10182.getClass(), "priority", null);
        setField(term10182, term10182.getClass(), "power", null);
        setField(term10182, term10182.getClass(), "contestCombos", null);
        setField(term10182, term10182.getClass(), "contestType", null);
        setField(term10182, term10182.getClass(), "contestEffect", null);
        setField(term10182, term10182.getClass(), "damageClass", null);
        setField(term10182, term10182.getClass(), "effectEntries", null);
        setField(term10182, term10182.getClass(), "effectChanges", null);
        setField(term10182, term10182.getClass(), "flavorTextEntries", null);
        setField(term10182, term10182.getClass(), "generation", null);
        setField(term10182, term10182.getClass(), "machines", null);
        setField(term10182, term10182.getClass(), "meta", null);
        setField(term10182, term10182.getClass(), "names", null);
        setField(term10182, term10182.getClass(), "pastValues", null);
        setField(term10182, term10182.getClass(), "statChanges", null);
        setField(term10182, term10182.getClass(), "superContestEffect", null);
        setField(term10182, term10182.getClass(), "target", null);
        setField(term10182, term10182.getClass(), "type", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.move.Move");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPriority", argTypes, term10182, args);
    }

};


