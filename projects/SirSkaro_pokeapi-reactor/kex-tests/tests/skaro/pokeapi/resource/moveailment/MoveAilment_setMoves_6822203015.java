package skaro.pokeapi.resource.moveailment;

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
import static skaro.pokeapi.resource.moveailment.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class MoveAilment_setMoves_6822203015 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term399;

    public MoveAilment_setMoves_6822203015() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term399 = newInstance(Class.forName("skaro.pokeapi.resource.moveailment.MoveAilment"));
        setField(term399, term399.getClass(), "id", null);
        setField(term399, term399.getClass(), "name", null);
        setField(term399, term399.getClass(), "moves", null);
        setField(term399, term399.getClass(), "names", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.moveailment.MoveAilment");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setMoves", argTypes, term399, args);
    }

};


