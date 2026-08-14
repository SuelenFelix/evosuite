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

public class MoveMetaData_getCategory_77593682428 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4666;

    public MoveMetaData_getCategory_77593682428() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4666 = newInstance(Class.forName("skaro.pokeapi.resource.move.MoveMetaData"));
        setField(term4666, term4666.getClass(), "ailment", null);
        setField(term4666, term4666.getClass(), "category", null);
        setField(term4666, term4666.getClass(), "minHits", null);
        setField(term4666, term4666.getClass(), "maxHits", null);
        setField(term4666, term4666.getClass(), "minTurns", null);
        setField(term4666, term4666.getClass(), "maxTurns", null);
        setField(term4666, term4666.getClass(), "drain", null);
        setField(term4666, term4666.getClass(), "healing", null);
        setField(term4666, term4666.getClass(), "critRate", null);
        setField(term4666, term4666.getClass(), "ailmentChance", null);
        setField(term4666, term4666.getClass(), "flinchChance", null);
        setField(term4666, term4666.getClass(), "statChance", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.move.MoveMetaData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCategory", argTypes, term4666, args);
    }

};


