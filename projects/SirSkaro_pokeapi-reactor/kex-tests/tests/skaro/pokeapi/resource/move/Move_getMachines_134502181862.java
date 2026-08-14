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

public class Move_getMachines_134502181862 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17930;

    public Move_getMachines_134502181862() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17930 = newInstance(Class.forName("skaro.pokeapi.resource.move.Move"));
        setField(term17930, term17930.getClass(), "id", null);
        setField(term17930, term17930.getClass(), "name", null);
        setField(term17930, term17930.getClass(), "accuracy", null);
        setField(term17930, term17930.getClass(), "effectChance", null);
        setField(term17930, term17930.getClass(), "pp", null);
        setField(term17930, term17930.getClass(), "priority", null);
        setField(term17930, term17930.getClass(), "power", null);
        setField(term17930, term17930.getClass(), "contestCombos", null);
        setField(term17930, term17930.getClass(), "contestType", null);
        setField(term17930, term17930.getClass(), "contestEffect", null);
        setField(term17930, term17930.getClass(), "damageClass", null);
        setField(term17930, term17930.getClass(), "effectEntries", null);
        setField(term17930, term17930.getClass(), "effectChanges", null);
        setField(term17930, term17930.getClass(), "flavorTextEntries", null);
        setField(term17930, term17930.getClass(), "generation", null);
        setField(term17930, term17930.getClass(), "machines", null);
        setField(term17930, term17930.getClass(), "meta", null);
        setField(term17930, term17930.getClass(), "names", null);
        setField(term17930, term17930.getClass(), "pastValues", null);
        setField(term17930, term17930.getClass(), "statChanges", null);
        setField(term17930, term17930.getClass(), "superContestEffect", null);
        setField(term17930, term17930.getClass(), "target", null);
        setField(term17930, term17930.getClass(), "type", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.move.Move");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMachines", argTypes, term17930, args);
    }

};


