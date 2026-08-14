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

public class Move_getContestCombos_40484086030 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11655;

    public Move_getContestCombos_40484086030() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11655 = newInstance(Class.forName("skaro.pokeapi.resource.move.Move"));
        setField(term11655, term11655.getClass(), "id", null);
        setField(term11655, term11655.getClass(), "name", null);
        setField(term11655, term11655.getClass(), "accuracy", null);
        setField(term11655, term11655.getClass(), "effectChance", null);
        setField(term11655, term11655.getClass(), "pp", null);
        setField(term11655, term11655.getClass(), "priority", null);
        setField(term11655, term11655.getClass(), "power", null);
        setField(term11655, term11655.getClass(), "contestCombos", null);
        setField(term11655, term11655.getClass(), "contestType", null);
        setField(term11655, term11655.getClass(), "contestEffect", null);
        setField(term11655, term11655.getClass(), "damageClass", null);
        setField(term11655, term11655.getClass(), "effectEntries", null);
        setField(term11655, term11655.getClass(), "effectChanges", null);
        setField(term11655, term11655.getClass(), "flavorTextEntries", null);
        setField(term11655, term11655.getClass(), "generation", null);
        setField(term11655, term11655.getClass(), "machines", null);
        setField(term11655, term11655.getClass(), "meta", null);
        setField(term11655, term11655.getClass(), "names", null);
        setField(term11655, term11655.getClass(), "pastValues", null);
        setField(term11655, term11655.getClass(), "statChanges", null);
        setField(term11655, term11655.getClass(), "superContestEffect", null);
        setField(term11655, term11655.getClass(), "target", null);
        setField(term11655, term11655.getClass(), "type", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.move.Move");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getContestCombos", argTypes, term11655, args);
    }

};


