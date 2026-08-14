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

public class Move_setMachines_177028185664 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18290;

    public Move_setMachines_177028185664() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18290 = newInstance(Class.forName("skaro.pokeapi.resource.move.Move"));
        setField(term18290, term18290.getClass(), "id", null);
        setField(term18290, term18290.getClass(), "name", null);
        setField(term18290, term18290.getClass(), "accuracy", null);
        setField(term18290, term18290.getClass(), "effectChance", null);
        setField(term18290, term18290.getClass(), "pp", null);
        setField(term18290, term18290.getClass(), "priority", null);
        setField(term18290, term18290.getClass(), "power", null);
        setField(term18290, term18290.getClass(), "contestCombos", null);
        setField(term18290, term18290.getClass(), "contestType", null);
        setField(term18290, term18290.getClass(), "contestEffect", null);
        setField(term18290, term18290.getClass(), "damageClass", null);
        setField(term18290, term18290.getClass(), "effectEntries", null);
        setField(term18290, term18290.getClass(), "effectChanges", null);
        setField(term18290, term18290.getClass(), "flavorTextEntries", null);
        setField(term18290, term18290.getClass(), "generation", null);
        setField(term18290, term18290.getClass(), "machines", null);
        setField(term18290, term18290.getClass(), "meta", null);
        setField(term18290, term18290.getClass(), "names", null);
        setField(term18290, term18290.getClass(), "pastValues", null);
        setField(term18290, term18290.getClass(), "statChanges", null);
        setField(term18290, term18290.getClass(), "superContestEffect", null);
        setField(term18290, term18290.getClass(), "target", null);
        setField(term18290, term18290.getClass(), "type", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.move.Move");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setMachines", argTypes, term18290, args);
    }

};


