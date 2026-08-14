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

public class Move_getContestType_112869234134 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12508;

    public Move_getContestType_112869234134() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12508 = newInstance(Class.forName("skaro.pokeapi.resource.move.Move"));
        setField(term12508, term12508.getClass(), "id", null);
        setField(term12508, term12508.getClass(), "name", null);
        setField(term12508, term12508.getClass(), "accuracy", null);
        setField(term12508, term12508.getClass(), "effectChance", null);
        setField(term12508, term12508.getClass(), "pp", null);
        setField(term12508, term12508.getClass(), "priority", null);
        setField(term12508, term12508.getClass(), "power", null);
        setField(term12508, term12508.getClass(), "contestCombos", null);
        setField(term12508, term12508.getClass(), "contestType", null);
        setField(term12508, term12508.getClass(), "contestEffect", null);
        setField(term12508, term12508.getClass(), "damageClass", null);
        setField(term12508, term12508.getClass(), "effectEntries", null);
        setField(term12508, term12508.getClass(), "effectChanges", null);
        setField(term12508, term12508.getClass(), "flavorTextEntries", null);
        setField(term12508, term12508.getClass(), "generation", null);
        setField(term12508, term12508.getClass(), "machines", null);
        setField(term12508, term12508.getClass(), "meta", null);
        setField(term12508, term12508.getClass(), "names", null);
        setField(term12508, term12508.getClass(), "pastValues", null);
        setField(term12508, term12508.getClass(), "statChanges", null);
        setField(term12508, term12508.getClass(), "superContestEffect", null);
        setField(term12508, term12508.getClass(), "target", null);
        setField(term12508, term12508.getClass(), "type", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.move.Move");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getContestType", argTypes, term12508, args);
    }

};


