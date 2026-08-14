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

public class Type_getGeneration_62279315136 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4060;

    public Type_getGeneration_62279315136() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4060 = newInstance(Class.forName("skaro.pokeapi.resource.type.Type"));
        setField(term4060, term4060.getClass(), "id", null);
        setField(term4060, term4060.getClass(), "name", null);
        setField(term4060, term4060.getClass(), "damageRelations", null);
        setField(term4060, term4060.getClass(), "pastDamageRelations", null);
        setField(term4060, term4060.getClass(), "gameIndices", null);
        setField(term4060, term4060.getClass(), "generation", null);
        setField(term4060, term4060.getClass(), "moveDamageClass", null);
        setField(term4060, term4060.getClass(), "names", null);
        setField(term4060, term4060.getClass(), "pokemon", null);
        setField(term4060, term4060.getClass(), "moves", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.type.Type");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGeneration", argTypes, term4060, args);
    }

};


