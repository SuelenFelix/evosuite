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

public class Move_getAccuracy_149111758110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7723;

    public Move_getAccuracy_149111758110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7723 = newInstance(Class.forName("skaro.pokeapi.resource.move.Move"));
        setField(term7723, term7723.getClass(), "id", null);
        setField(term7723, term7723.getClass(), "name", null);
        setField(term7723, term7723.getClass(), "accuracy", null);
        setField(term7723, term7723.getClass(), "effectChance", null);
        setField(term7723, term7723.getClass(), "pp", null);
        setField(term7723, term7723.getClass(), "priority", null);
        setField(term7723, term7723.getClass(), "power", null);
        setField(term7723, term7723.getClass(), "contestCombos", null);
        setField(term7723, term7723.getClass(), "contestType", null);
        setField(term7723, term7723.getClass(), "contestEffect", null);
        setField(term7723, term7723.getClass(), "damageClass", null);
        setField(term7723, term7723.getClass(), "effectEntries", null);
        setField(term7723, term7723.getClass(), "effectChanges", null);
        setField(term7723, term7723.getClass(), "flavorTextEntries", null);
        setField(term7723, term7723.getClass(), "generation", null);
        setField(term7723, term7723.getClass(), "machines", null);
        setField(term7723, term7723.getClass(), "meta", null);
        setField(term7723, term7723.getClass(), "names", null);
        setField(term7723, term7723.getClass(), "pastValues", null);
        setField(term7723, term7723.getClass(), "statChanges", null);
        setField(term7723, term7723.getClass(), "superContestEffect", null);
        setField(term7723, term7723.getClass(), "target", null);
        setField(term7723, term7723.getClass(), "type", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.move.Move");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAccuracy", argTypes, term7723, args);
    }

};


