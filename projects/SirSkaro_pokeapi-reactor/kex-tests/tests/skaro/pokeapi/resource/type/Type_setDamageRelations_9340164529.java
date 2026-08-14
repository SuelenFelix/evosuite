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

public class Type_setDamageRelations_9340164529 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57973;

    public Type_setDamageRelations_9340164529() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term57973 = newInstance(Class.forName("skaro.pokeapi.resource.type.Type"));
        setField(term57973, term57973.getClass(), "id", null);
        setField(term57973, term57973.getClass(), "name", null);
        setField(term57973, term57973.getClass(), "damageRelations", null);
        setField(term57973, term57973.getClass(), "pastDamageRelations", null);
        setField(term57973, term57973.getClass(), "gameIndices", null);
        setField(term57973, term57973.getClass(), "generation", null);
        setField(term57973, term57973.getClass(), "moveDamageClass", null);
        setField(term57973, term57973.getClass(), "names", null);
        setField(term57973, term57973.getClass(), "pokemon", null);
        setField(term57973, term57973.getClass(), "moves", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.type.Type");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("skaro.pokeapi.resource.type.TypeRelations");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setDamageRelations", argTypes, term57973, args);
    }

};


