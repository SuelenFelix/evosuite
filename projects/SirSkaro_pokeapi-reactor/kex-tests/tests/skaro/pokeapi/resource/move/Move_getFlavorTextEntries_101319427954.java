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

public class Move_getFlavorTextEntries_101319427954 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16369;

    public Move_getFlavorTextEntries_101319427954() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16369 = newInstance(Class.forName("skaro.pokeapi.resource.move.Move"));
        setField(term16369, term16369.getClass(), "id", null);
        setField(term16369, term16369.getClass(), "name", null);
        setField(term16369, term16369.getClass(), "accuracy", null);
        setField(term16369, term16369.getClass(), "effectChance", null);
        setField(term16369, term16369.getClass(), "pp", null);
        setField(term16369, term16369.getClass(), "priority", null);
        setField(term16369, term16369.getClass(), "power", null);
        setField(term16369, term16369.getClass(), "contestCombos", null);
        setField(term16369, term16369.getClass(), "contestType", null);
        setField(term16369, term16369.getClass(), "contestEffect", null);
        setField(term16369, term16369.getClass(), "damageClass", null);
        setField(term16369, term16369.getClass(), "effectEntries", null);
        setField(term16369, term16369.getClass(), "effectChanges", null);
        setField(term16369, term16369.getClass(), "flavorTextEntries", null);
        setField(term16369, term16369.getClass(), "generation", null);
        setField(term16369, term16369.getClass(), "machines", null);
        setField(term16369, term16369.getClass(), "meta", null);
        setField(term16369, term16369.getClass(), "names", null);
        setField(term16369, term16369.getClass(), "pastValues", null);
        setField(term16369, term16369.getClass(), "statChanges", null);
        setField(term16369, term16369.getClass(), "superContestEffect", null);
        setField(term16369, term16369.getClass(), "target", null);
        setField(term16369, term16369.getClass(), "type", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.move.Move");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFlavorTextEntries", argTypes, term16369, args);
    }

};


