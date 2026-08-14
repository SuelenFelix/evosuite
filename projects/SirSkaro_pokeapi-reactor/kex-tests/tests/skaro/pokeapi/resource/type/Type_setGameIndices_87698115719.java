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

public class Type_setGameIndices_87698115719 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2370;

    public Type_setGameIndices_87698115719() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2370 = newInstance(Class.forName("skaro.pokeapi.resource.type.Type"));
        setField(term2370, term2370.getClass(), "id", null);
        setField(term2370, term2370.getClass(), "name", null);
        setField(term2370, term2370.getClass(), "damageRelations", null);
        setField(term2370, term2370.getClass(), "pastDamageRelations", null);
        setField(term2370, term2370.getClass(), "gameIndices", null);
        setField(term2370, term2370.getClass(), "generation", null);
        setField(term2370, term2370.getClass(), "moveDamageClass", null);
        setField(term2370, term2370.getClass(), "names", null);
        setField(term2370, term2370.getClass(), "pokemon", null);
        setField(term2370, term2370.getClass(), "moves", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.type.Type");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setGameIndices", argTypes, term2370, args);
    }

};


