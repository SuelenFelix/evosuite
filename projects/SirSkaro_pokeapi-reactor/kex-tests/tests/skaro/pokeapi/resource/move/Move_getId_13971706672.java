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

public class Move_getId_13971706672 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6117;

    public Move_getId_13971706672() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6117 = newInstance(Class.forName("skaro.pokeapi.resource.move.Move"));
        setField(term6117, term6117.getClass(), "id", null);
        setField(term6117, term6117.getClass(), "name", null);
        setField(term6117, term6117.getClass(), "accuracy", null);
        setField(term6117, term6117.getClass(), "effectChance", null);
        setField(term6117, term6117.getClass(), "pp", null);
        setField(term6117, term6117.getClass(), "priority", null);
        setField(term6117, term6117.getClass(), "power", null);
        setField(term6117, term6117.getClass(), "contestCombos", null);
        setField(term6117, term6117.getClass(), "contestType", null);
        setField(term6117, term6117.getClass(), "contestEffect", null);
        setField(term6117, term6117.getClass(), "damageClass", null);
        setField(term6117, term6117.getClass(), "effectEntries", null);
        setField(term6117, term6117.getClass(), "effectChanges", null);
        setField(term6117, term6117.getClass(), "flavorTextEntries", null);
        setField(term6117, term6117.getClass(), "generation", null);
        setField(term6117, term6117.getClass(), "machines", null);
        setField(term6117, term6117.getClass(), "meta", null);
        setField(term6117, term6117.getClass(), "names", null);
        setField(term6117, term6117.getClass(), "pastValues", null);
        setField(term6117, term6117.getClass(), "statChanges", null);
        setField(term6117, term6117.getClass(), "superContestEffect", null);
        setField(term6117, term6117.getClass(), "target", null);
        setField(term6117, term6117.getClass(), "type", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.move.Move");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term6117, args);
    }

};


