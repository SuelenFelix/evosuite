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

public class TypeRelations_getHalfDamageTo_137595062216 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4733;

    public TypeRelations_getHalfDamageTo_137595062216() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4733 = newInstance(Class.forName("skaro.pokeapi.resource.type.TypeRelations"));
        setField(term4733, term4733.getClass(), "noDamageTo", null);
        setField(term4733, term4733.getClass(), "halfDamageTo", null);
        setField(term4733, term4733.getClass(), "doubleDamageTo", null);
        setField(term4733, term4733.getClass(), "noDamageFrom", null);
        setField(term4733, term4733.getClass(), "halfDamageFrom", null);
        setField(term4733, term4733.getClass(), "doubleDamageFrom", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.type.TypeRelations");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHalfDamageTo", argTypes, term4733, args);
    }

};


