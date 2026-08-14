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

public class Move_setContestEffect_73803169140 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13670;

    public Move_setContestEffect_73803169140() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13670 = newInstance(Class.forName("skaro.pokeapi.resource.move.Move"));
        setField(term13670, term13670.getClass(), "id", null);
        setField(term13670, term13670.getClass(), "name", null);
        setField(term13670, term13670.getClass(), "accuracy", null);
        setField(term13670, term13670.getClass(), "effectChance", null);
        setField(term13670, term13670.getClass(), "pp", null);
        setField(term13670, term13670.getClass(), "priority", null);
        setField(term13670, term13670.getClass(), "power", null);
        setField(term13670, term13670.getClass(), "contestCombos", null);
        setField(term13670, term13670.getClass(), "contestType", null);
        setField(term13670, term13670.getClass(), "contestEffect", null);
        setField(term13670, term13670.getClass(), "damageClass", null);
        setField(term13670, term13670.getClass(), "effectEntries", null);
        setField(term13670, term13670.getClass(), "effectChanges", null);
        setField(term13670, term13670.getClass(), "flavorTextEntries", null);
        setField(term13670, term13670.getClass(), "generation", null);
        setField(term13670, term13670.getClass(), "machines", null);
        setField(term13670, term13670.getClass(), "meta", null);
        setField(term13670, term13670.getClass(), "names", null);
        setField(term13670, term13670.getClass(), "pastValues", null);
        setField(term13670, term13670.getClass(), "statChanges", null);
        setField(term13670, term13670.getClass(), "superContestEffect", null);
        setField(term13670, term13670.getClass(), "target", null);
        setField(term13670, term13670.getClass(), "type", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.move.Move");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("skaro.pokeapi.resource.ApiResource");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setContestEffect", argTypes, term13670, args);
    }

};


