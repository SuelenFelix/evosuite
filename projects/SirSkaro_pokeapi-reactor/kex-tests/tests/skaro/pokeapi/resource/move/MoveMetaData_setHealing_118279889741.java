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

public class MoveMetaData_setHealing_118279889741 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4679;

    public MoveMetaData_setHealing_118279889741() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4679 = newInstance(Class.forName("skaro.pokeapi.resource.move.MoveMetaData"));
        setField(term4679, term4679.getClass(), "ailment", null);
        setField(term4679, term4679.getClass(), "category", null);
        setField(term4679, term4679.getClass(), "minHits", null);
        setField(term4679, term4679.getClass(), "maxHits", null);
        setField(term4679, term4679.getClass(), "minTurns", null);
        setField(term4679, term4679.getClass(), "maxTurns", null);
        setField(term4679, term4679.getClass(), "drain", null);
        setField(term4679, term4679.getClass(), "healing", null);
        setField(term4679, term4679.getClass(), "critRate", null);
        setField(term4679, term4679.getClass(), "ailmentChance", null);
        setField(term4679, term4679.getClass(), "flinchChance", null);
        setField(term4679, term4679.getClass(), "statChance", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.move.MoveMetaData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setHealing", argTypes, term4679, args);
    }

};


