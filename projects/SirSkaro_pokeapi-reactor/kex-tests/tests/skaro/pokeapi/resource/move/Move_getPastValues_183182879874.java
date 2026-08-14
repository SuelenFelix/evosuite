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

public class Move_getPastValues_183182879874 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20403;

    public Move_getPastValues_183182879874() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20403 = newInstance(Class.forName("skaro.pokeapi.resource.move.Move"));
        setField(term20403, term20403.getClass(), "id", null);
        setField(term20403, term20403.getClass(), "name", null);
        setField(term20403, term20403.getClass(), "accuracy", null);
        setField(term20403, term20403.getClass(), "effectChance", null);
        setField(term20403, term20403.getClass(), "pp", null);
        setField(term20403, term20403.getClass(), "priority", null);
        setField(term20403, term20403.getClass(), "power", null);
        setField(term20403, term20403.getClass(), "contestCombos", null);
        setField(term20403, term20403.getClass(), "contestType", null);
        setField(term20403, term20403.getClass(), "contestEffect", null);
        setField(term20403, term20403.getClass(), "damageClass", null);
        setField(term20403, term20403.getClass(), "effectEntries", null);
        setField(term20403, term20403.getClass(), "effectChanges", null);
        setField(term20403, term20403.getClass(), "flavorTextEntries", null);
        setField(term20403, term20403.getClass(), "generation", null);
        setField(term20403, term20403.getClass(), "machines", null);
        setField(term20403, term20403.getClass(), "meta", null);
        setField(term20403, term20403.getClass(), "names", null);
        setField(term20403, term20403.getClass(), "pastValues", null);
        setField(term20403, term20403.getClass(), "statChanges", null);
        setField(term20403, term20403.getClass(), "superContestEffect", null);
        setField(term20403, term20403.getClass(), "target", null);
        setField(term20403, term20403.getClass(), "type", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.move.Move");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPastValues", argTypes, term20403, args);
    }

};


