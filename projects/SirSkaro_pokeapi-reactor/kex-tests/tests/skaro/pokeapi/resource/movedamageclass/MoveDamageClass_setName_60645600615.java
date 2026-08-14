package skaro.pokeapi.resource.movedamageclass;

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
import static skaro.pokeapi.resource.movedamageclass.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class MoveDamageClass_setName_60645600615 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term629;

    public MoveDamageClass_setName_60645600615() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term629 = newInstance(Class.forName("skaro.pokeapi.resource.movedamageclass.MoveDamageClass"));
        setField(term629, term629.getClass(), "id", null);
        setField(term629, term629.getClass(), "name", null);
        setField(term629, term629.getClass(), "descriptions", null);
        setField(term629, term629.getClass(), "moves", null);
        setField(term629, term629.getClass(), "names", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.movedamageclass.MoveDamageClass");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setName", argTypes, term629, args);
    }

};


