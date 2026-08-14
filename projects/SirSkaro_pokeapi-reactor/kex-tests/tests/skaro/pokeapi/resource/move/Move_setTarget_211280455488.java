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

public class Move_setTarget_211280455488 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23198;

    public Move_setTarget_211280455488() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23198 = newInstance(Class.forName("skaro.pokeapi.resource.move.Move"));
        setField(term23198, term23198.getClass(), "id", null);
        setField(term23198, term23198.getClass(), "name", null);
        setField(term23198, term23198.getClass(), "accuracy", null);
        setField(term23198, term23198.getClass(), "effectChance", null);
        setField(term23198, term23198.getClass(), "pp", null);
        setField(term23198, term23198.getClass(), "priority", null);
        setField(term23198, term23198.getClass(), "power", null);
        setField(term23198, term23198.getClass(), "contestCombos", null);
        setField(term23198, term23198.getClass(), "contestType", null);
        setField(term23198, term23198.getClass(), "contestEffect", null);
        setField(term23198, term23198.getClass(), "damageClass", null);
        setField(term23198, term23198.getClass(), "effectEntries", null);
        setField(term23198, term23198.getClass(), "effectChanges", null);
        setField(term23198, term23198.getClass(), "flavorTextEntries", null);
        setField(term23198, term23198.getClass(), "generation", null);
        setField(term23198, term23198.getClass(), "machines", null);
        setField(term23198, term23198.getClass(), "meta", null);
        setField(term23198, term23198.getClass(), "names", null);
        setField(term23198, term23198.getClass(), "pastValues", null);
        setField(term23198, term23198.getClass(), "statChanges", null);
        setField(term23198, term23198.getClass(), "superContestEffect", null);
        setField(term23198, term23198.getClass(), "target", null);
        setField(term23198, term23198.getClass(), "type", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.move.Move");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("skaro.pokeapi.resource.NamedApiResource");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setTarget", argTypes, term23198, args);
    }

};


