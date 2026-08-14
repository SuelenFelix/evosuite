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

public class Move_setMeta_140213625368 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19271;

    public Move_setMeta_140213625368() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19271 = newInstance(Class.forName("skaro.pokeapi.resource.move.Move"));
        setField(term19271, term19271.getClass(), "id", null);
        setField(term19271, term19271.getClass(), "name", null);
        setField(term19271, term19271.getClass(), "accuracy", null);
        setField(term19271, term19271.getClass(), "effectChance", null);
        setField(term19271, term19271.getClass(), "pp", null);
        setField(term19271, term19271.getClass(), "priority", null);
        setField(term19271, term19271.getClass(), "power", null);
        setField(term19271, term19271.getClass(), "contestCombos", null);
        setField(term19271, term19271.getClass(), "contestType", null);
        setField(term19271, term19271.getClass(), "contestEffect", null);
        setField(term19271, term19271.getClass(), "damageClass", null);
        setField(term19271, term19271.getClass(), "effectEntries", null);
        setField(term19271, term19271.getClass(), "effectChanges", null);
        setField(term19271, term19271.getClass(), "flavorTextEntries", null);
        setField(term19271, term19271.getClass(), "generation", null);
        setField(term19271, term19271.getClass(), "machines", null);
        setField(term19271, term19271.getClass(), "meta", null);
        setField(term19271, term19271.getClass(), "names", null);
        setField(term19271, term19271.getClass(), "pastValues", null);
        setField(term19271, term19271.getClass(), "statChanges", null);
        setField(term19271, term19271.getClass(), "superContestEffect", null);
        setField(term19271, term19271.getClass(), "target", null);
        setField(term19271, term19271.getClass(), "type", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.move.Move");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("skaro.pokeapi.resource.move.MoveMetaData");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setMeta", argTypes, term19271, args);
    }

};


