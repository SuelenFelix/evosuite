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

public class Move_setPower_22519940128 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11285;

    public Move_setPower_22519940128() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11285 = newInstance(Class.forName("skaro.pokeapi.resource.move.Move"));
        setField(term11285, term11285.getClass(), "id", null);
        setField(term11285, term11285.getClass(), "name", null);
        setField(term11285, term11285.getClass(), "accuracy", null);
        setField(term11285, term11285.getClass(), "effectChance", null);
        setField(term11285, term11285.getClass(), "pp", null);
        setField(term11285, term11285.getClass(), "priority", null);
        setField(term11285, term11285.getClass(), "power", null);
        setField(term11285, term11285.getClass(), "contestCombos", null);
        setField(term11285, term11285.getClass(), "contestType", null);
        setField(term11285, term11285.getClass(), "contestEffect", null);
        setField(term11285, term11285.getClass(), "damageClass", null);
        setField(term11285, term11285.getClass(), "effectEntries", null);
        setField(term11285, term11285.getClass(), "effectChanges", null);
        setField(term11285, term11285.getClass(), "flavorTextEntries", null);
        setField(term11285, term11285.getClass(), "generation", null);
        setField(term11285, term11285.getClass(), "machines", null);
        setField(term11285, term11285.getClass(), "meta", null);
        setField(term11285, term11285.getClass(), "names", null);
        setField(term11285, term11285.getClass(), "pastValues", null);
        setField(term11285, term11285.getClass(), "statChanges", null);
        setField(term11285, term11285.getClass(), "superContestEffect", null);
        setField(term11285, term11285.getClass(), "target", null);
        setField(term11285, term11285.getClass(), "type", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.move.Move");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setPower", argTypes, term11285, args);
    }

};


