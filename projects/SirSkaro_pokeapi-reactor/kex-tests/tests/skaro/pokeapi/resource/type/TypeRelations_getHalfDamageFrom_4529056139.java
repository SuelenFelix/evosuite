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

public class TypeRelations_getHalfDamageFrom_4529056139 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4575;

    public TypeRelations_getHalfDamageFrom_4529056139() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term4576 = new ArrayList();
        ArrayList term4580 = new ArrayList();
        ArrayList term4584 = new ArrayList();
        ArrayList term4588 = new ArrayList();
        ArrayList term4592 = new ArrayList();
        ArrayList term4596 = new ArrayList();
        term4575 = newInstance(Class.forName("skaro.pokeapi.resource.type.TypeRelations"));
        setField(term4575, term4575.getClass(), "noDamageTo", term4576);
        setField(term4575, term4575.getClass(), "halfDamageTo", term4580);
        setField(term4575, term4575.getClass(), "doubleDamageTo", term4584);
        setField(term4575, term4575.getClass(), "noDamageFrom", term4588);
        setField(term4575, term4575.getClass(), "halfDamageFrom", term4592);
        setField(term4575, term4575.getClass(), "doubleDamageFrom", term4596);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.type.TypeRelations");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHalfDamageFrom", argTypes, term4575, args);
    }

};


