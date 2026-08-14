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

public class Move_setType_118803013192 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23958;

    public Move_setType_118803013192() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23958 = newInstance(Class.forName("skaro.pokeapi.resource.move.Move"));
        setField(term23958, term23958.getClass(), "id", null);
        setField(term23958, term23958.getClass(), "name", null);
        setField(term23958, term23958.getClass(), "accuracy", null);
        setField(term23958, term23958.getClass(), "effectChance", null);
        setField(term23958, term23958.getClass(), "pp", null);
        setField(term23958, term23958.getClass(), "priority", null);
        setField(term23958, term23958.getClass(), "power", null);
        setField(term23958, term23958.getClass(), "contestCombos", null);
        setField(term23958, term23958.getClass(), "contestType", null);
        setField(term23958, term23958.getClass(), "contestEffect", null);
        setField(term23958, term23958.getClass(), "damageClass", null);
        setField(term23958, term23958.getClass(), "effectEntries", null);
        setField(term23958, term23958.getClass(), "effectChanges", null);
        setField(term23958, term23958.getClass(), "flavorTextEntries", null);
        setField(term23958, term23958.getClass(), "generation", null);
        setField(term23958, term23958.getClass(), "machines", null);
        setField(term23958, term23958.getClass(), "meta", null);
        setField(term23958, term23958.getClass(), "names", null);
        setField(term23958, term23958.getClass(), "pastValues", null);
        setField(term23958, term23958.getClass(), "statChanges", null);
        setField(term23958, term23958.getClass(), "superContestEffect", null);
        setField(term23958, term23958.getClass(), "target", null);
        setField(term23958, term23958.getClass(), "type", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.move.Move");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("skaro.pokeapi.resource.NamedApiResource");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setType", argTypes, term23958, args);
    }

};


