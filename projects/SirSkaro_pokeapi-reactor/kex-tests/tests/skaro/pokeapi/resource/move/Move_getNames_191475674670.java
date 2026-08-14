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

public class Move_getNames_191475674670 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19625;

    public Move_getNames_191475674670() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19625 = newInstance(Class.forName("skaro.pokeapi.resource.move.Move"));
        setField(term19625, term19625.getClass(), "id", null);
        setField(term19625, term19625.getClass(), "name", null);
        setField(term19625, term19625.getClass(), "accuracy", null);
        setField(term19625, term19625.getClass(), "effectChance", null);
        setField(term19625, term19625.getClass(), "pp", null);
        setField(term19625, term19625.getClass(), "priority", null);
        setField(term19625, term19625.getClass(), "power", null);
        setField(term19625, term19625.getClass(), "contestCombos", null);
        setField(term19625, term19625.getClass(), "contestType", null);
        setField(term19625, term19625.getClass(), "contestEffect", null);
        setField(term19625, term19625.getClass(), "damageClass", null);
        setField(term19625, term19625.getClass(), "effectEntries", null);
        setField(term19625, term19625.getClass(), "effectChanges", null);
        setField(term19625, term19625.getClass(), "flavorTextEntries", null);
        setField(term19625, term19625.getClass(), "generation", null);
        setField(term19625, term19625.getClass(), "machines", null);
        setField(term19625, term19625.getClass(), "meta", null);
        setField(term19625, term19625.getClass(), "names", null);
        setField(term19625, term19625.getClass(), "pastValues", null);
        setField(term19625, term19625.getClass(), "statChanges", null);
        setField(term19625, term19625.getClass(), "superContestEffect", null);
        setField(term19625, term19625.getClass(), "target", null);
        setField(term19625, term19625.getClass(), "type", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.move.Move");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNames", argTypes, term19625, args);
    }

};


