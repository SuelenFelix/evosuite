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

public class Move_getEffectEntries_72072979146 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14770;

    public Move_getEffectEntries_72072979146() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14770 = newInstance(Class.forName("skaro.pokeapi.resource.move.Move"));
        setField(term14770, term14770.getClass(), "id", null);
        setField(term14770, term14770.getClass(), "name", null);
        setField(term14770, term14770.getClass(), "accuracy", null);
        setField(term14770, term14770.getClass(), "effectChance", null);
        setField(term14770, term14770.getClass(), "pp", null);
        setField(term14770, term14770.getClass(), "priority", null);
        setField(term14770, term14770.getClass(), "power", null);
        setField(term14770, term14770.getClass(), "contestCombos", null);
        setField(term14770, term14770.getClass(), "contestType", null);
        setField(term14770, term14770.getClass(), "contestEffect", null);
        setField(term14770, term14770.getClass(), "damageClass", null);
        setField(term14770, term14770.getClass(), "effectEntries", null);
        setField(term14770, term14770.getClass(), "effectChanges", null);
        setField(term14770, term14770.getClass(), "flavorTextEntries", null);
        setField(term14770, term14770.getClass(), "generation", null);
        setField(term14770, term14770.getClass(), "machines", null);
        setField(term14770, term14770.getClass(), "meta", null);
        setField(term14770, term14770.getClass(), "names", null);
        setField(term14770, term14770.getClass(), "pastValues", null);
        setField(term14770, term14770.getClass(), "statChanges", null);
        setField(term14770, term14770.getClass(), "superContestEffect", null);
        setField(term14770, term14770.getClass(), "target", null);
        setField(term14770, term14770.getClass(), "type", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.move.Move");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEffectEntries", argTypes, term14770, args);
    }

};


