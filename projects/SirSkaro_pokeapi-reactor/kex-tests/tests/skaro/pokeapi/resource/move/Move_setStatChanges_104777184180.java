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

public class Move_setStatChanges_104777184180 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21421;

    public Move_setStatChanges_104777184180() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21421 = newInstance(Class.forName("skaro.pokeapi.resource.move.Move"));
        setField(term21421, term21421.getClass(), "id", null);
        setField(term21421, term21421.getClass(), "name", null);
        setField(term21421, term21421.getClass(), "accuracy", null);
        setField(term21421, term21421.getClass(), "effectChance", null);
        setField(term21421, term21421.getClass(), "pp", null);
        setField(term21421, term21421.getClass(), "priority", null);
        setField(term21421, term21421.getClass(), "power", null);
        setField(term21421, term21421.getClass(), "contestCombos", null);
        setField(term21421, term21421.getClass(), "contestType", null);
        setField(term21421, term21421.getClass(), "contestEffect", null);
        setField(term21421, term21421.getClass(), "damageClass", null);
        setField(term21421, term21421.getClass(), "effectEntries", null);
        setField(term21421, term21421.getClass(), "effectChanges", null);
        setField(term21421, term21421.getClass(), "flavorTextEntries", null);
        setField(term21421, term21421.getClass(), "generation", null);
        setField(term21421, term21421.getClass(), "machines", null);
        setField(term21421, term21421.getClass(), "meta", null);
        setField(term21421, term21421.getClass(), "names", null);
        setField(term21421, term21421.getClass(), "pastValues", null);
        setField(term21421, term21421.getClass(), "statChanges", null);
        setField(term21421, term21421.getClass(), "superContestEffect", null);
        setField(term21421, term21421.getClass(), "target", null);
        setField(term21421, term21421.getClass(), "type", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.move.Move");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setStatChanges", argTypes, term21421, args);
    }

};


