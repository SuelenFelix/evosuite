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

public class TypeRelations_setNoDamageTo_10151021302 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4091;
     Object term4116;

    public TypeRelations_setNoDamageTo_10151021302() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term4092 = new ArrayList();
        ArrayList term4096 = new ArrayList();
        ArrayList term4100 = new ArrayList();
        ArrayList term4104 = new ArrayList();
        ArrayList term4108 = new ArrayList();
        ArrayList term4112 = new ArrayList();
        term4091 = newInstance(Class.forName("skaro.pokeapi.resource.type.TypeRelations"));
        setField(term4091, term4091.getClass(), "noDamageTo", term4092);
        setField(term4091, term4091.getClass(), "halfDamageTo", term4096);
        setField(term4091, term4091.getClass(), "doubleDamageTo", term4100);
        setField(term4091, term4091.getClass(), "noDamageFrom", term4104);
        setField(term4091, term4091.getClass(), "halfDamageFrom", term4108);
        setField(term4091, term4091.getClass(), "doubleDamageFrom", term4112);
        Object term4119 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term4119, term4119.getClass(), "name", "EULDrUNQvw");
        setField(term4119, term4119.getClass(), "url", "BtvAvsJSei");
        term4116 = new LinkedList();
        ((LinkedList) term4116).add(term4119);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.type.TypeRelations");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term4116;
        callMethod(klass, "setNoDamageTo", argTypes, term4091, args);
    }

};


