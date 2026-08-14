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

public class Type_setGeneration_69525144135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59587;

    public Type_setGeneration_69525144135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term59587 = newInstance(Class.forName("skaro.pokeapi.resource.type.Type"));
        setField(term59587, term59587.getClass(), "id", null);
        setField(term59587, term59587.getClass(), "name", null);
        setField(term59587, term59587.getClass(), "damageRelations", null);
        setField(term59587, term59587.getClass(), "pastDamageRelations", null);
        setField(term59587, term59587.getClass(), "gameIndices", null);
        setField(term59587, term59587.getClass(), "generation", null);
        setField(term59587, term59587.getClass(), "moveDamageClass", null);
        setField(term59587, term59587.getClass(), "names", null);
        setField(term59587, term59587.getClass(), "pokemon", null);
        setField(term59587, term59587.getClass(), "moves", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.type.Type");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("skaro.pokeapi.resource.NamedApiResource");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setGeneration", argTypes, term59587, args);
    }

};


