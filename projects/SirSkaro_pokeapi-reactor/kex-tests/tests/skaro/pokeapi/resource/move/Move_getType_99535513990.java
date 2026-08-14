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

public class Move_getType_99535513990 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23502;

    public Move_getType_99535513990() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23502 = newInstance(Class.forName("skaro.pokeapi.resource.move.Move"));
        setField(term23502, term23502.getClass(), "id", null);
        setField(term23502, term23502.getClass(), "name", null);
        setField(term23502, term23502.getClass(), "accuracy", null);
        setField(term23502, term23502.getClass(), "effectChance", null);
        setField(term23502, term23502.getClass(), "pp", null);
        setField(term23502, term23502.getClass(), "priority", null);
        setField(term23502, term23502.getClass(), "power", null);
        setField(term23502, term23502.getClass(), "contestCombos", null);
        setField(term23502, term23502.getClass(), "contestType", null);
        setField(term23502, term23502.getClass(), "contestEffect", null);
        setField(term23502, term23502.getClass(), "damageClass", null);
        setField(term23502, term23502.getClass(), "effectEntries", null);
        setField(term23502, term23502.getClass(), "effectChanges", null);
        setField(term23502, term23502.getClass(), "flavorTextEntries", null);
        setField(term23502, term23502.getClass(), "generation", null);
        setField(term23502, term23502.getClass(), "machines", null);
        setField(term23502, term23502.getClass(), "meta", null);
        setField(term23502, term23502.getClass(), "names", null);
        setField(term23502, term23502.getClass(), "pastValues", null);
        setField(term23502, term23502.getClass(), "statChanges", null);
        setField(term23502, term23502.getClass(), "superContestEffect", null);
        setField(term23502, term23502.getClass(), "target", null);
        setField(term23502, term23502.getClass(), "type", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.move.Move");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getType", argTypes, term23502, args);
    }

};


