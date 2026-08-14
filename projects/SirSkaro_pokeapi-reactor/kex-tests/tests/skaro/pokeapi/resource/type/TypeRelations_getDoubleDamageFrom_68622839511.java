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

public class TypeRelations_getDoubleDamageFrom_68622839511 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4678;

    public TypeRelations_getDoubleDamageFrom_68622839511() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term4679 = new ArrayList();
        ArrayList term4683 = new ArrayList();
        ArrayList term4687 = new ArrayList();
        ArrayList term4691 = new ArrayList();
        ArrayList term4695 = new ArrayList();
        ArrayList term4699 = new ArrayList();
        term4678 = newInstance(Class.forName("skaro.pokeapi.resource.type.TypeRelations"));
        setField(term4678, term4678.getClass(), "noDamageTo", term4679);
        setField(term4678, term4678.getClass(), "halfDamageTo", term4683);
        setField(term4678, term4678.getClass(), "doubleDamageTo", term4687);
        setField(term4678, term4678.getClass(), "noDamageFrom", term4691);
        setField(term4678, term4678.getClass(), "halfDamageFrom", term4695);
        setField(term4678, term4678.getClass(), "doubleDamageFrom", term4699);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.type.TypeRelations");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDoubleDamageFrom", argTypes, term4678, args);
    }

};


