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

public class Type_setId_2113381414 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term662;

    public Type_setId_2113381414() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term662 = newInstance(Class.forName("skaro.pokeapi.resource.type.Type"));
        setField(term662, term662.getClass(), "id", null);
        setField(term662, term662.getClass(), "name", null);
        setField(term662, term662.getClass(), "damageRelations", null);
        setField(term662, term662.getClass(), "pastDamageRelations", null);
        setField(term662, term662.getClass(), "gameIndices", null);
        setField(term662, term662.getClass(), "generation", null);
        setField(term662, term662.getClass(), "moveDamageClass", null);
        setField(term662, term662.getClass(), "names", null);
        setField(term662, term662.getClass(), "pokemon", null);
        setField(term662, term662.getClass(), "moves", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.type.Type");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setId", argTypes, term662, args);
    }

};


