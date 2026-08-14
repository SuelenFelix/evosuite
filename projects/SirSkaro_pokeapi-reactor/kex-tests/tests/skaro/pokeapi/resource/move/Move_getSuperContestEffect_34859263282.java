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

public class Move_getSuperContestEffect_34859263282 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21813;

    public Move_getSuperContestEffect_34859263282() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21813 = newInstance(Class.forName("skaro.pokeapi.resource.move.Move"));
        setField(term21813, term21813.getClass(), "id", null);
        setField(term21813, term21813.getClass(), "name", null);
        setField(term21813, term21813.getClass(), "accuracy", null);
        setField(term21813, term21813.getClass(), "effectChance", null);
        setField(term21813, term21813.getClass(), "pp", null);
        setField(term21813, term21813.getClass(), "priority", null);
        setField(term21813, term21813.getClass(), "power", null);
        setField(term21813, term21813.getClass(), "contestCombos", null);
        setField(term21813, term21813.getClass(), "contestType", null);
        setField(term21813, term21813.getClass(), "contestEffect", null);
        setField(term21813, term21813.getClass(), "damageClass", null);
        setField(term21813, term21813.getClass(), "effectEntries", null);
        setField(term21813, term21813.getClass(), "effectChanges", null);
        setField(term21813, term21813.getClass(), "flavorTextEntries", null);
        setField(term21813, term21813.getClass(), "generation", null);
        setField(term21813, term21813.getClass(), "machines", null);
        setField(term21813, term21813.getClass(), "meta", null);
        setField(term21813, term21813.getClass(), "names", null);
        setField(term21813, term21813.getClass(), "pastValues", null);
        setField(term21813, term21813.getClass(), "statChanges", null);
        setField(term21813, term21813.getClass(), "superContestEffect", null);
        setField(term21813, term21813.getClass(), "target", null);
        setField(term21813, term21813.getClass(), "type", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.move.Move");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSuperContestEffect", argTypes, term21813, args);
    }

};


