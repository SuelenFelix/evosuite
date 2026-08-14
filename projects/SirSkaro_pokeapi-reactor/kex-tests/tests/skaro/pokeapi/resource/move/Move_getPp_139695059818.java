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

public class Move_getPp_139695059818 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9338;

    public Move_getPp_139695059818() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9338 = newInstance(Class.forName("skaro.pokeapi.resource.move.Move"));
        setField(term9338, term9338.getClass(), "id", null);
        setField(term9338, term9338.getClass(), "name", null);
        setField(term9338, term9338.getClass(), "accuracy", null);
        setField(term9338, term9338.getClass(), "effectChance", null);
        setField(term9338, term9338.getClass(), "pp", null);
        setField(term9338, term9338.getClass(), "priority", null);
        setField(term9338, term9338.getClass(), "power", null);
        setField(term9338, term9338.getClass(), "contestCombos", null);
        setField(term9338, term9338.getClass(), "contestType", null);
        setField(term9338, term9338.getClass(), "contestEffect", null);
        setField(term9338, term9338.getClass(), "damageClass", null);
        setField(term9338, term9338.getClass(), "effectEntries", null);
        setField(term9338, term9338.getClass(), "effectChanges", null);
        setField(term9338, term9338.getClass(), "flavorTextEntries", null);
        setField(term9338, term9338.getClass(), "generation", null);
        setField(term9338, term9338.getClass(), "machines", null);
        setField(term9338, term9338.getClass(), "meta", null);
        setField(term9338, term9338.getClass(), "names", null);
        setField(term9338, term9338.getClass(), "pastValues", null);
        setField(term9338, term9338.getClass(), "statChanges", null);
        setField(term9338, term9338.getClass(), "superContestEffect", null);
        setField(term9338, term9338.getClass(), "target", null);
        setField(term9338, term9338.getClass(), "type", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.move.Move");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPp", argTypes, term9338, args);
    }

};


