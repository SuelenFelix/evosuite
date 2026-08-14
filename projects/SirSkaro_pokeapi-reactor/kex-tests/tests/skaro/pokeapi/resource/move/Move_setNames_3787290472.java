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

public class Move_setNames_3787290472 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20036;

    public Move_setNames_3787290472() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20036 = newInstance(Class.forName("skaro.pokeapi.resource.move.Move"));
        setField(term20036, term20036.getClass(), "id", null);
        setField(term20036, term20036.getClass(), "name", null);
        setField(term20036, term20036.getClass(), "accuracy", null);
        setField(term20036, term20036.getClass(), "effectChance", null);
        setField(term20036, term20036.getClass(), "pp", null);
        setField(term20036, term20036.getClass(), "priority", null);
        setField(term20036, term20036.getClass(), "power", null);
        setField(term20036, term20036.getClass(), "contestCombos", null);
        setField(term20036, term20036.getClass(), "contestType", null);
        setField(term20036, term20036.getClass(), "contestEffect", null);
        setField(term20036, term20036.getClass(), "damageClass", null);
        setField(term20036, term20036.getClass(), "effectEntries", null);
        setField(term20036, term20036.getClass(), "effectChanges", null);
        setField(term20036, term20036.getClass(), "flavorTextEntries", null);
        setField(term20036, term20036.getClass(), "generation", null);
        setField(term20036, term20036.getClass(), "machines", null);
        setField(term20036, term20036.getClass(), "meta", null);
        setField(term20036, term20036.getClass(), "names", null);
        setField(term20036, term20036.getClass(), "pastValues", null);
        setField(term20036, term20036.getClass(), "statChanges", null);
        setField(term20036, term20036.getClass(), "superContestEffect", null);
        setField(term20036, term20036.getClass(), "target", null);
        setField(term20036, term20036.getClass(), "type", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.move.Move");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setNames", argTypes, term20036, args);
    }

};


