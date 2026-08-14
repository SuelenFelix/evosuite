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

public class Type_getDamageRelations_113139737410 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1320;

    public Type_getDamageRelations_113139737410() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1320 = newInstance(Class.forName("skaro.pokeapi.resource.type.Type"));
        setField(term1320, term1320.getClass(), "id", null);
        setField(term1320, term1320.getClass(), "name", null);
        setField(term1320, term1320.getClass(), "damageRelations", null);
        setField(term1320, term1320.getClass(), "pastDamageRelations", null);
        setField(term1320, term1320.getClass(), "gameIndices", null);
        setField(term1320, term1320.getClass(), "generation", null);
        setField(term1320, term1320.getClass(), "moveDamageClass", null);
        setField(term1320, term1320.getClass(), "names", null);
        setField(term1320, term1320.getClass(), "pokemon", null);
        setField(term1320, term1320.getClass(), "moves", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.type.Type");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDamageRelations", argTypes, term1320, args);
    }

};


