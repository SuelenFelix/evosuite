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

public class MoveDamageClass_getMoves_181777095818 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term632;

    public MoveDamageClass_getMoves_181777095818() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term632 = newInstance(Class.forName("skaro.pokeapi.resource.movedamageclass.MoveDamageClass"));
        setField(term632, term632.getClass(), "id", null);
        setField(term632, term632.getClass(), "name", null);
        setField(term632, term632.getClass(), "descriptions", null);
        setField(term632, term632.getClass(), "moves", null);
        setField(term632, term632.getClass(), "names", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.movedamageclass.MoveDamageClass");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMoves", argTypes, term632, args);
    }

};


