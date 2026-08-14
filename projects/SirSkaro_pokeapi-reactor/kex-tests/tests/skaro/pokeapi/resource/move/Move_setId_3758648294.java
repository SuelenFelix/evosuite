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

public class Move_setId_3758648294 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6469;

    public Move_setId_3758648294() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6469 = newInstance(Class.forName("skaro.pokeapi.resource.move.Move"));
        setField(term6469, term6469.getClass(), "id", null);
        setField(term6469, term6469.getClass(), "name", null);
        setField(term6469, term6469.getClass(), "accuracy", null);
        setField(term6469, term6469.getClass(), "effectChance", null);
        setField(term6469, term6469.getClass(), "pp", null);
        setField(term6469, term6469.getClass(), "priority", null);
        setField(term6469, term6469.getClass(), "power", null);
        setField(term6469, term6469.getClass(), "contestCombos", null);
        setField(term6469, term6469.getClass(), "contestType", null);
        setField(term6469, term6469.getClass(), "contestEffect", null);
        setField(term6469, term6469.getClass(), "damageClass", null);
        setField(term6469, term6469.getClass(), "effectEntries", null);
        setField(term6469, term6469.getClass(), "effectChanges", null);
        setField(term6469, term6469.getClass(), "flavorTextEntries", null);
        setField(term6469, term6469.getClass(), "generation", null);
        setField(term6469, term6469.getClass(), "machines", null);
        setField(term6469, term6469.getClass(), "meta", null);
        setField(term6469, term6469.getClass(), "names", null);
        setField(term6469, term6469.getClass(), "pastValues", null);
        setField(term6469, term6469.getClass(), "statChanges", null);
        setField(term6469, term6469.getClass(), "superContestEffect", null);
        setField(term6469, term6469.getClass(), "target", null);
        setField(term6469, term6469.getClass(), "type", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.move.Move");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setId", argTypes, term6469, args);
    }

};


