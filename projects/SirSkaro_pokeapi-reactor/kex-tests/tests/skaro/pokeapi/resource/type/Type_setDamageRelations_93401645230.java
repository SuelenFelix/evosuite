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

public class Type_setDamageRelations_93401645230 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59582;

    public Type_setDamageRelations_93401645230() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term59582 = newInstance(Class.forName("skaro.pokeapi.resource.type.Type"));
        setField(term59582, term59582.getClass(), "id", null);
        setField(term59582, term59582.getClass(), "name", null);
        setField(term59582, term59582.getClass(), "damageRelations", null);
        setField(term59582, term59582.getClass(), "pastDamageRelations", null);
        setField(term59582, term59582.getClass(), "gameIndices", null);
        setField(term59582, term59582.getClass(), "generation", null);
        setField(term59582, term59582.getClass(), "moveDamageClass", null);
        setField(term59582, term59582.getClass(), "names", null);
        setField(term59582, term59582.getClass(), "pokemon", null);
        setField(term59582, term59582.getClass(), "moves", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.type.Type");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("skaro.pokeapi.resource.type.TypeRelations");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setDamageRelations", argTypes, term59582, args);
    }

};


