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

public class Move_setEffectChance_50683290916 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8961;

    public Move_setEffectChance_50683290916() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8961 = newInstance(Class.forName("skaro.pokeapi.resource.move.Move"));
        setField(term8961, term8961.getClass(), "id", null);
        setField(term8961, term8961.getClass(), "name", null);
        setField(term8961, term8961.getClass(), "accuracy", null);
        setField(term8961, term8961.getClass(), "effectChance", null);
        setField(term8961, term8961.getClass(), "pp", null);
        setField(term8961, term8961.getClass(), "priority", null);
        setField(term8961, term8961.getClass(), "power", null);
        setField(term8961, term8961.getClass(), "contestCombos", null);
        setField(term8961, term8961.getClass(), "contestType", null);
        setField(term8961, term8961.getClass(), "contestEffect", null);
        setField(term8961, term8961.getClass(), "damageClass", null);
        setField(term8961, term8961.getClass(), "effectEntries", null);
        setField(term8961, term8961.getClass(), "effectChanges", null);
        setField(term8961, term8961.getClass(), "flavorTextEntries", null);
        setField(term8961, term8961.getClass(), "generation", null);
        setField(term8961, term8961.getClass(), "machines", null);
        setField(term8961, term8961.getClass(), "meta", null);
        setField(term8961, term8961.getClass(), "names", null);
        setField(term8961, term8961.getClass(), "pastValues", null);
        setField(term8961, term8961.getClass(), "statChanges", null);
        setField(term8961, term8961.getClass(), "superContestEffect", null);
        setField(term8961, term8961.getClass(), "target", null);
        setField(term8961, term8961.getClass(), "type", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.move.Move");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setEffectChance", argTypes, term8961, args);
    }

};


