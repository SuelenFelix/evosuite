package skaro.pokeapi.resource.type;

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
import static skaro.pokeapi.resource.type.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Type_getName_19897173446 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term871;

    public Type_getName_19897173446() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term871 = newInstance(Class.forName("skaro.pokeapi.resource.type.Type"));
        setField(term871, term871.getClass(), "id", null);
        setField(term871, term871.getClass(), "name", null);
        setField(term871, term871.getClass(), "damageRelations", null);
        setField(term871, term871.getClass(), "pastDamageRelations", null);
        setField(term871, term871.getClass(), "gameIndices", null);
        setField(term871, term871.getClass(), "generation", null);
        setField(term871, term871.getClass(), "moveDamageClass", null);
        setField(term871, term871.getClass(), "names", null);
        setField(term871, term871.getClass(), "pokemon", null);
        setField(term871, term871.getClass(), "moves", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.type.Type");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term871, args);
    }

};


