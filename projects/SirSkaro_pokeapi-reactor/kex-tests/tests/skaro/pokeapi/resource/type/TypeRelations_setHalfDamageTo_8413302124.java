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

public class TypeRelations_setHalfDamageTo_8413302124 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4190;
     Object term4215;

    public TypeRelations_setHalfDamageTo_8413302124() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term4191 = new ArrayList();
        ArrayList term4195 = new ArrayList();
        ArrayList term4199 = new ArrayList();
        ArrayList term4203 = new ArrayList();
        ArrayList term4207 = new ArrayList();
        ArrayList term4211 = new ArrayList();
        term4190 = newInstance(Class.forName("skaro.pokeapi.resource.type.TypeRelations"));
        setField(term4190, term4190.getClass(), "noDamageTo", term4191);
        setField(term4190, term4190.getClass(), "halfDamageTo", term4195);
        setField(term4190, term4190.getClass(), "doubleDamageTo", term4199);
        setField(term4190, term4190.getClass(), "noDamageFrom", term4203);
        setField(term4190, term4190.getClass(), "halfDamageFrom", term4207);
        setField(term4190, term4190.getClass(), "doubleDamageFrom", term4211);
        Object term4218 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term4218, term4218.getClass(), "name", "jQWttOAiwL");
        setField(term4218, term4218.getClass(), "url", "DzKFxEuEEC");
        Object term4244 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term4244, term4244.getClass(), "name", "");
        setField(term4244, term4244.getClass(), "url", "");
        Object term4248 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term4248, term4248.getClass(), "name", null);
        setField(term4248, term4248.getClass(), "url", null);
        term4215 = new LinkedList();
        ((LinkedList) term4215).add(term4218);
        ((LinkedList) term4215).add(term4244);
        ((LinkedList) term4215).add(term4248);
        ((LinkedList) term4215).add((Object)null);
        ((LinkedList) term4215).add((Object)null);
        ((LinkedList) term4215).add((Object)null);
        ((LinkedList) term4215).add((Object)null);
        ((LinkedList) term4215).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.type.TypeRelations");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term4215;
        callMethod(klass, "setHalfDamageTo", argTypes, term4190, args);
    }

};


