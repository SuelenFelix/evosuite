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

public class Move_setPp_37564476020 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9757;

    public Move_setPp_37564476020() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9757 = newInstance(Class.forName("skaro.pokeapi.resource.move.Move"));
        setField(term9757, term9757.getClass(), "id", null);
        setField(term9757, term9757.getClass(), "name", null);
        setField(term9757, term9757.getClass(), "accuracy", null);
        setField(term9757, term9757.getClass(), "effectChance", null);
        setField(term9757, term9757.getClass(), "pp", null);
        setField(term9757, term9757.getClass(), "priority", null);
        setField(term9757, term9757.getClass(), "power", null);
        setField(term9757, term9757.getClass(), "contestCombos", null);
        setField(term9757, term9757.getClass(), "contestType", null);
        setField(term9757, term9757.getClass(), "contestEffect", null);
        setField(term9757, term9757.getClass(), "damageClass", null);
        setField(term9757, term9757.getClass(), "effectEntries", null);
        setField(term9757, term9757.getClass(), "effectChanges", null);
        setField(term9757, term9757.getClass(), "flavorTextEntries", null);
        setField(term9757, term9757.getClass(), "generation", null);
        setField(term9757, term9757.getClass(), "machines", null);
        setField(term9757, term9757.getClass(), "meta", null);
        setField(term9757, term9757.getClass(), "names", null);
        setField(term9757, term9757.getClass(), "pastValues", null);
        setField(term9757, term9757.getClass(), "statChanges", null);
        setField(term9757, term9757.getClass(), "superContestEffect", null);
        setField(term9757, term9757.getClass(), "target", null);
        setField(term9757, term9757.getClass(), "type", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.move.Move");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setPp", argTypes, term9757, args);
    }

};


