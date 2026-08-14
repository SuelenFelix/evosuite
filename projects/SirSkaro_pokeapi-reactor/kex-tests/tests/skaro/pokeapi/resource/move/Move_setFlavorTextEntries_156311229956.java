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

public class Move_setFlavorTextEntries_156311229956 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16741;

    public Move_setFlavorTextEntries_156311229956() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16741 = newInstance(Class.forName("skaro.pokeapi.resource.move.Move"));
        setField(term16741, term16741.getClass(), "id", null);
        setField(term16741, term16741.getClass(), "name", null);
        setField(term16741, term16741.getClass(), "accuracy", null);
        setField(term16741, term16741.getClass(), "effectChance", null);
        setField(term16741, term16741.getClass(), "pp", null);
        setField(term16741, term16741.getClass(), "priority", null);
        setField(term16741, term16741.getClass(), "power", null);
        setField(term16741, term16741.getClass(), "contestCombos", null);
        setField(term16741, term16741.getClass(), "contestType", null);
        setField(term16741, term16741.getClass(), "contestEffect", null);
        setField(term16741, term16741.getClass(), "damageClass", null);
        setField(term16741, term16741.getClass(), "effectEntries", null);
        setField(term16741, term16741.getClass(), "effectChanges", null);
        setField(term16741, term16741.getClass(), "flavorTextEntries", null);
        setField(term16741, term16741.getClass(), "generation", null);
        setField(term16741, term16741.getClass(), "machines", null);
        setField(term16741, term16741.getClass(), "meta", null);
        setField(term16741, term16741.getClass(), "names", null);
        setField(term16741, term16741.getClass(), "pastValues", null);
        setField(term16741, term16741.getClass(), "statChanges", null);
        setField(term16741, term16741.getClass(), "superContestEffect", null);
        setField(term16741, term16741.getClass(), "target", null);
        setField(term16741, term16741.getClass(), "type", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.move.Move");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setFlavorTextEntries", argTypes, term16741, args);
    }

};


