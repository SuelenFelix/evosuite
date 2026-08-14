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
import java.util.LinkedList;
import java.lang.Object;

public class TypeRelations_setDoubleDamageTo_14022236786 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4329;
     Object term4354;

    public TypeRelations_setDoubleDamageTo_14022236786() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term4330 = new ArrayList();
        ArrayList term4334 = new ArrayList();
        ArrayList term4338 = new ArrayList();
        ArrayList term4342 = new ArrayList();
        ArrayList term4346 = new ArrayList();
        ArrayList term4350 = new ArrayList();
        term4329 = newInstance(Class.forName("skaro.pokeapi.resource.type.TypeRelations"));
        setField(term4329, term4329.getClass(), "noDamageTo", term4330);
        setField(term4329, term4329.getClass(), "halfDamageTo", term4334);
        setField(term4329, term4329.getClass(), "doubleDamageTo", term4338);
        setField(term4329, term4329.getClass(), "noDamageFrom", term4342);
        setField(term4329, term4329.getClass(), "halfDamageFrom", term4346);
        setField(term4329, term4329.getClass(), "doubleDamageFrom", term4350);
        Object term4357 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term4357, term4357.getClass(), "name", "UqKUbMyPMJ");
        setField(term4357, term4357.getClass(), "url", "QpYltHAdyY");
        Object term4383 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term4383, term4383.getClass(), "name", "");
        setField(term4383, term4383.getClass(), "url", "");
        Object term4387 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term4387, term4387.getClass(), "name", null);
        setField(term4387, term4387.getClass(), "url", null);
        term4354 = new LinkedList();
        ((LinkedList) term4354).add(term4357);
        ((LinkedList) term4354).add(term4383);
        ((LinkedList) term4354).add(term4387);
        ((LinkedList) term4354).add((Object)null);
        ((LinkedList) term4354).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.type.TypeRelations");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term4354;
        callMethod(klass, "setDoubleDamageTo", argTypes, term4329, args);
    }

};


