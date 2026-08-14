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

public class Move_getName_21407232646 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6890;

    public Move_getName_21407232646() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6890 = newInstance(Class.forName("skaro.pokeapi.resource.move.Move"));
        setField(term6890, term6890.getClass(), "id", null);
        setField(term6890, term6890.getClass(), "name", null);
        setField(term6890, term6890.getClass(), "accuracy", null);
        setField(term6890, term6890.getClass(), "effectChance", null);
        setField(term6890, term6890.getClass(), "pp", null);
        setField(term6890, term6890.getClass(), "priority", null);
        setField(term6890, term6890.getClass(), "power", null);
        setField(term6890, term6890.getClass(), "contestCombos", null);
        setField(term6890, term6890.getClass(), "contestType", null);
        setField(term6890, term6890.getClass(), "contestEffect", null);
        setField(term6890, term6890.getClass(), "damageClass", null);
        setField(term6890, term6890.getClass(), "effectEntries", null);
        setField(term6890, term6890.getClass(), "effectChanges", null);
        setField(term6890, term6890.getClass(), "flavorTextEntries", null);
        setField(term6890, term6890.getClass(), "generation", null);
        setField(term6890, term6890.getClass(), "machines", null);
        setField(term6890, term6890.getClass(), "meta", null);
        setField(term6890, term6890.getClass(), "names", null);
        setField(term6890, term6890.getClass(), "pastValues", null);
        setField(term6890, term6890.getClass(), "statChanges", null);
        setField(term6890, term6890.getClass(), "superContestEffect", null);
        setField(term6890, term6890.getClass(), "target", null);
        setField(term6890, term6890.getClass(), "type", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.move.Move");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term6890, args);
    }

};


