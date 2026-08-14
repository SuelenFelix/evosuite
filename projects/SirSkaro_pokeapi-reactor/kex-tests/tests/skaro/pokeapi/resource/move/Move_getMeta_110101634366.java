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

public class Move_getMeta_110101634366 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18727;

    public Move_getMeta_110101634366() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18727 = newInstance(Class.forName("skaro.pokeapi.resource.move.Move"));
        setField(term18727, term18727.getClass(), "id", null);
        setField(term18727, term18727.getClass(), "name", null);
        setField(term18727, term18727.getClass(), "accuracy", null);
        setField(term18727, term18727.getClass(), "effectChance", null);
        setField(term18727, term18727.getClass(), "pp", null);
        setField(term18727, term18727.getClass(), "priority", null);
        setField(term18727, term18727.getClass(), "power", null);
        setField(term18727, term18727.getClass(), "contestCombos", null);
        setField(term18727, term18727.getClass(), "contestType", null);
        setField(term18727, term18727.getClass(), "contestEffect", null);
        setField(term18727, term18727.getClass(), "damageClass", null);
        setField(term18727, term18727.getClass(), "effectEntries", null);
        setField(term18727, term18727.getClass(), "effectChanges", null);
        setField(term18727, term18727.getClass(), "flavorTextEntries", null);
        setField(term18727, term18727.getClass(), "generation", null);
        setField(term18727, term18727.getClass(), "machines", null);
        setField(term18727, term18727.getClass(), "meta", null);
        setField(term18727, term18727.getClass(), "names", null);
        setField(term18727, term18727.getClass(), "pastValues", null);
        setField(term18727, term18727.getClass(), "statChanges", null);
        setField(term18727, term18727.getClass(), "superContestEffect", null);
        setField(term18727, term18727.getClass(), "target", null);
        setField(term18727, term18727.getClass(), "type", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.move.Move");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMeta", argTypes, term18727, args);
    }

};


