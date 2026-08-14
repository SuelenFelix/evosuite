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

public class Move_getEffectChance_180917782514 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8562;

    public Move_getEffectChance_180917782514() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8562 = newInstance(Class.forName("skaro.pokeapi.resource.move.Move"));
        setField(term8562, term8562.getClass(), "id", null);
        setField(term8562, term8562.getClass(), "name", null);
        setField(term8562, term8562.getClass(), "accuracy", null);
        setField(term8562, term8562.getClass(), "effectChance", null);
        setField(term8562, term8562.getClass(), "pp", null);
        setField(term8562, term8562.getClass(), "priority", null);
        setField(term8562, term8562.getClass(), "power", null);
        setField(term8562, term8562.getClass(), "contestCombos", null);
        setField(term8562, term8562.getClass(), "contestType", null);
        setField(term8562, term8562.getClass(), "contestEffect", null);
        setField(term8562, term8562.getClass(), "damageClass", null);
        setField(term8562, term8562.getClass(), "effectEntries", null);
        setField(term8562, term8562.getClass(), "effectChanges", null);
        setField(term8562, term8562.getClass(), "flavorTextEntries", null);
        setField(term8562, term8562.getClass(), "generation", null);
        setField(term8562, term8562.getClass(), "machines", null);
        setField(term8562, term8562.getClass(), "meta", null);
        setField(term8562, term8562.getClass(), "names", null);
        setField(term8562, term8562.getClass(), "pastValues", null);
        setField(term8562, term8562.getClass(), "statChanges", null);
        setField(term8562, term8562.getClass(), "superContestEffect", null);
        setField(term8562, term8562.getClass(), "target", null);
        setField(term8562, term8562.getClass(), "type", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.move.Move");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEffectChance", argTypes, term8562, args);
    }

};


