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

public class Move_getEffectChanges_122818731650 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15586;

    public Move_getEffectChanges_122818731650() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15586 = newInstance(Class.forName("skaro.pokeapi.resource.move.Move"));
        setField(term15586, term15586.getClass(), "id", null);
        setField(term15586, term15586.getClass(), "name", null);
        setField(term15586, term15586.getClass(), "accuracy", null);
        setField(term15586, term15586.getClass(), "effectChance", null);
        setField(term15586, term15586.getClass(), "pp", null);
        setField(term15586, term15586.getClass(), "priority", null);
        setField(term15586, term15586.getClass(), "power", null);
        setField(term15586, term15586.getClass(), "contestCombos", null);
        setField(term15586, term15586.getClass(), "contestType", null);
        setField(term15586, term15586.getClass(), "contestEffect", null);
        setField(term15586, term15586.getClass(), "damageClass", null);
        setField(term15586, term15586.getClass(), "effectEntries", null);
        setField(term15586, term15586.getClass(), "effectChanges", null);
        setField(term15586, term15586.getClass(), "flavorTextEntries", null);
        setField(term15586, term15586.getClass(), "generation", null);
        setField(term15586, term15586.getClass(), "machines", null);
        setField(term15586, term15586.getClass(), "meta", null);
        setField(term15586, term15586.getClass(), "names", null);
        setField(term15586, term15586.getClass(), "pastValues", null);
        setField(term15586, term15586.getClass(), "statChanges", null);
        setField(term15586, term15586.getClass(), "superContestEffect", null);
        setField(term15586, term15586.getClass(), "target", null);
        setField(term15586, term15586.getClass(), "type", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.move.Move");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEffectChanges", argTypes, term15586, args);
    }

};


