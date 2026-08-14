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
import java.util.ArrayList;

public class TypeRelations_getDoubleDamageTo_2640282285 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4304;

    public TypeRelations_getDoubleDamageTo_2640282285() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term4305 = new ArrayList();
        ArrayList term4309 = new ArrayList();
        ArrayList term4313 = new ArrayList();
        ArrayList term4317 = new ArrayList();
        ArrayList term4321 = new ArrayList();
        ArrayList term4325 = new ArrayList();
        term4304 = newInstance(Class.forName("skaro.pokeapi.resource.type.TypeRelations"));
        setField(term4304, term4304.getClass(), "noDamageTo", term4305);
        setField(term4304, term4304.getClass(), "halfDamageTo", term4309);
        setField(term4304, term4304.getClass(), "doubleDamageTo", term4313);
        setField(term4304, term4304.getClass(), "noDamageFrom", term4317);
        setField(term4304, term4304.getClass(), "halfDamageFrom", term4321);
        setField(term4304, term4304.getClass(), "doubleDamageFrom", term4325);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.type.TypeRelations");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDoubleDamageTo", argTypes, term4304, args);
    }

};


