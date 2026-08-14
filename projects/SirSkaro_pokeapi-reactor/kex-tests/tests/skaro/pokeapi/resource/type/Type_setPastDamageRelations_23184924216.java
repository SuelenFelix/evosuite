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

public class Type_setPastDamageRelations_23184924216 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1978;

    public Type_setPastDamageRelations_23184924216() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1978 = newInstance(Class.forName("skaro.pokeapi.resource.type.Type"));
        setField(term1978, term1978.getClass(), "id", null);
        setField(term1978, term1978.getClass(), "name", null);
        setField(term1978, term1978.getClass(), "damageRelations", null);
        setField(term1978, term1978.getClass(), "pastDamageRelations", null);
        setField(term1978, term1978.getClass(), "gameIndices", null);
        setField(term1978, term1978.getClass(), "generation", null);
        setField(term1978, term1978.getClass(), "moveDamageClass", null);
        setField(term1978, term1978.getClass(), "names", null);
        setField(term1978, term1978.getClass(), "pokemon", null);
        setField(term1978, term1978.getClass(), "moves", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.type.Type");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setPastDamageRelations", argTypes, term1978, args);
    }

};


