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

public class Move_setDamageClass_124011552244 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14398;

    public Move_setDamageClass_124011552244() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14398 = newInstance(Class.forName("skaro.pokeapi.resource.move.Move"));
        setField(term14398, term14398.getClass(), "id", null);
        setField(term14398, term14398.getClass(), "name", null);
        setField(term14398, term14398.getClass(), "accuracy", null);
        setField(term14398, term14398.getClass(), "effectChance", null);
        setField(term14398, term14398.getClass(), "pp", null);
        setField(term14398, term14398.getClass(), "priority", null);
        setField(term14398, term14398.getClass(), "power", null);
        setField(term14398, term14398.getClass(), "contestCombos", null);
        setField(term14398, term14398.getClass(), "contestType", null);
        setField(term14398, term14398.getClass(), "contestEffect", null);
        setField(term14398, term14398.getClass(), "damageClass", null);
        setField(term14398, term14398.getClass(), "effectEntries", null);
        setField(term14398, term14398.getClass(), "effectChanges", null);
        setField(term14398, term14398.getClass(), "flavorTextEntries", null);
        setField(term14398, term14398.getClass(), "generation", null);
        setField(term14398, term14398.getClass(), "machines", null);
        setField(term14398, term14398.getClass(), "meta", null);
        setField(term14398, term14398.getClass(), "names", null);
        setField(term14398, term14398.getClass(), "pastValues", null);
        setField(term14398, term14398.getClass(), "statChanges", null);
        setField(term14398, term14398.getClass(), "superContestEffect", null);
        setField(term14398, term14398.getClass(), "target", null);
        setField(term14398, term14398.getClass(), "type", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.move.Move");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("skaro.pokeapi.resource.NamedApiResource");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setDamageClass", argTypes, term14398, args);
    }

};


