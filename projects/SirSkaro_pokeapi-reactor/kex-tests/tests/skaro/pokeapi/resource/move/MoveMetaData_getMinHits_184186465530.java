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

public class MoveMetaData_getMinHits_184186465530 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4668;

    public MoveMetaData_getMinHits_184186465530() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4668 = newInstance(Class.forName("skaro.pokeapi.resource.move.MoveMetaData"));
        setField(term4668, term4668.getClass(), "ailment", null);
        setField(term4668, term4668.getClass(), "category", null);
        setField(term4668, term4668.getClass(), "minHits", null);
        setField(term4668, term4668.getClass(), "maxHits", null);
        setField(term4668, term4668.getClass(), "minTurns", null);
        setField(term4668, term4668.getClass(), "maxTurns", null);
        setField(term4668, term4668.getClass(), "drain", null);
        setField(term4668, term4668.getClass(), "healing", null);
        setField(term4668, term4668.getClass(), "critRate", null);
        setField(term4668, term4668.getClass(), "ailmentChance", null);
        setField(term4668, term4668.getClass(), "flinchChance", null);
        setField(term4668, term4668.getClass(), "statChance", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.move.MoveMetaData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMinHits", argTypes, term4668, args);
    }

};


