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

public class Move_setGeneration_53072475360 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17565;

    public Move_setGeneration_53072475360() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17565 = newInstance(Class.forName("skaro.pokeapi.resource.move.Move"));
        setField(term17565, term17565.getClass(), "id", null);
        setField(term17565, term17565.getClass(), "name", null);
        setField(term17565, term17565.getClass(), "accuracy", null);
        setField(term17565, term17565.getClass(), "effectChance", null);
        setField(term17565, term17565.getClass(), "pp", null);
        setField(term17565, term17565.getClass(), "priority", null);
        setField(term17565, term17565.getClass(), "power", null);
        setField(term17565, term17565.getClass(), "contestCombos", null);
        setField(term17565, term17565.getClass(), "contestType", null);
        setField(term17565, term17565.getClass(), "contestEffect", null);
        setField(term17565, term17565.getClass(), "damageClass", null);
        setField(term17565, term17565.getClass(), "effectEntries", null);
        setField(term17565, term17565.getClass(), "effectChanges", null);
        setField(term17565, term17565.getClass(), "flavorTextEntries", null);
        setField(term17565, term17565.getClass(), "generation", null);
        setField(term17565, term17565.getClass(), "machines", null);
        setField(term17565, term17565.getClass(), "meta", null);
        setField(term17565, term17565.getClass(), "names", null);
        setField(term17565, term17565.getClass(), "pastValues", null);
        setField(term17565, term17565.getClass(), "statChanges", null);
        setField(term17565, term17565.getClass(), "superContestEffect", null);
        setField(term17565, term17565.getClass(), "target", null);
        setField(term17565, term17565.getClass(), "type", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.move.Move");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("skaro.pokeapi.resource.NamedApiResource");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setGeneration", argTypes, term17565, args);
    }

};


