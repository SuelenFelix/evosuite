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

public class Move_setSuperContestEffect_13670528284 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22263;

    public Move_setSuperContestEffect_13670528284() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22263 = newInstance(Class.forName("skaro.pokeapi.resource.move.Move"));
        setField(term22263, term22263.getClass(), "id", null);
        setField(term22263, term22263.getClass(), "name", null);
        setField(term22263, term22263.getClass(), "accuracy", null);
        setField(term22263, term22263.getClass(), "effectChance", null);
        setField(term22263, term22263.getClass(), "pp", null);
        setField(term22263, term22263.getClass(), "priority", null);
        setField(term22263, term22263.getClass(), "power", null);
        setField(term22263, term22263.getClass(), "contestCombos", null);
        setField(term22263, term22263.getClass(), "contestType", null);
        setField(term22263, term22263.getClass(), "contestEffect", null);
        setField(term22263, term22263.getClass(), "damageClass", null);
        setField(term22263, term22263.getClass(), "effectEntries", null);
        setField(term22263, term22263.getClass(), "effectChanges", null);
        setField(term22263, term22263.getClass(), "flavorTextEntries", null);
        setField(term22263, term22263.getClass(), "generation", null);
        setField(term22263, term22263.getClass(), "machines", null);
        setField(term22263, term22263.getClass(), "meta", null);
        setField(term22263, term22263.getClass(), "names", null);
        setField(term22263, term22263.getClass(), "pastValues", null);
        setField(term22263, term22263.getClass(), "statChanges", null);
        setField(term22263, term22263.getClass(), "superContestEffect", null);
        setField(term22263, term22263.getClass(), "target", null);
        setField(term22263, term22263.getClass(), "type", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.move.Move");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("skaro.pokeapi.resource.ApiResource");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setSuperContestEffect", argTypes, term22263, args);
    }

};


