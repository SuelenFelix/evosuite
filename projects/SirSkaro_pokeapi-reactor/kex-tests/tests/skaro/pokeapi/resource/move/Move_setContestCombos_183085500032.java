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

public class Move_setContestCombos_183085500032 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12103;

    public Move_setContestCombos_183085500032() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12103 = newInstance(Class.forName("skaro.pokeapi.resource.move.Move"));
        setField(term12103, term12103.getClass(), "id", null);
        setField(term12103, term12103.getClass(), "name", null);
        setField(term12103, term12103.getClass(), "accuracy", null);
        setField(term12103, term12103.getClass(), "effectChance", null);
        setField(term12103, term12103.getClass(), "pp", null);
        setField(term12103, term12103.getClass(), "priority", null);
        setField(term12103, term12103.getClass(), "power", null);
        setField(term12103, term12103.getClass(), "contestCombos", null);
        setField(term12103, term12103.getClass(), "contestType", null);
        setField(term12103, term12103.getClass(), "contestEffect", null);
        setField(term12103, term12103.getClass(), "damageClass", null);
        setField(term12103, term12103.getClass(), "effectEntries", null);
        setField(term12103, term12103.getClass(), "effectChanges", null);
        setField(term12103, term12103.getClass(), "flavorTextEntries", null);
        setField(term12103, term12103.getClass(), "generation", null);
        setField(term12103, term12103.getClass(), "machines", null);
        setField(term12103, term12103.getClass(), "meta", null);
        setField(term12103, term12103.getClass(), "names", null);
        setField(term12103, term12103.getClass(), "pastValues", null);
        setField(term12103, term12103.getClass(), "statChanges", null);
        setField(term12103, term12103.getClass(), "superContestEffect", null);
        setField(term12103, term12103.getClass(), "target", null);
        setField(term12103, term12103.getClass(), "type", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.move.Move");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("skaro.pokeapi.resource.move.ContestComboSets");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setContestCombos", argTypes, term12103, args);
    }

};


