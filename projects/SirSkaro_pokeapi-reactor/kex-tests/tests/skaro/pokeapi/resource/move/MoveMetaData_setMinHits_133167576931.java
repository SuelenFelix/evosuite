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

public class MoveMetaData_setMinHits_133167576931 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4669;

    public MoveMetaData_setMinHits_133167576931() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4669 = newInstance(Class.forName("skaro.pokeapi.resource.move.MoveMetaData"));
        setField(term4669, term4669.getClass(), "ailment", null);
        setField(term4669, term4669.getClass(), "category", null);
        setField(term4669, term4669.getClass(), "minHits", null);
        setField(term4669, term4669.getClass(), "maxHits", null);
        setField(term4669, term4669.getClass(), "minTurns", null);
        setField(term4669, term4669.getClass(), "maxTurns", null);
        setField(term4669, term4669.getClass(), "drain", null);
        setField(term4669, term4669.getClass(), "healing", null);
        setField(term4669, term4669.getClass(), "critRate", null);
        setField(term4669, term4669.getClass(), "ailmentChance", null);
        setField(term4669, term4669.getClass(), "flinchChance", null);
        setField(term4669, term4669.getClass(), "statChance", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.move.MoveMetaData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setMinHits", argTypes, term4669, args);
    }

};


