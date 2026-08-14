package skaro.pokeapi.resource.movetarget;

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
import static skaro.pokeapi.resource.movetarget.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class MoveTarget_getName_191160928014 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term628;

    public MoveTarget_getName_191160928014() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term628 = newInstance(Class.forName("skaro.pokeapi.resource.movetarget.MoveTarget"));
        setField(term628, term628.getClass(), "id", null);
        setField(term628, term628.getClass(), "name", null);
        setField(term628, term628.getClass(), "descriptions", null);
        setField(term628, term628.getClass(), "moves", null);
        setField(term628, term628.getClass(), "names", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.movetarget.MoveTarget");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term628, args);
    }

};


