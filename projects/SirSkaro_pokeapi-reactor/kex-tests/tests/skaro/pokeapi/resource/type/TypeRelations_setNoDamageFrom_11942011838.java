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

public class TypeRelations_setNoDamageFrom_11942011838 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4461;
     Object term4486;

    public TypeRelations_setNoDamageFrom_11942011838() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term4462 = new ArrayList();
        ArrayList term4466 = new ArrayList();
        ArrayList term4470 = new ArrayList();
        ArrayList term4474 = new ArrayList();
        ArrayList term4478 = new ArrayList();
        ArrayList term4482 = new ArrayList();
        term4461 = newInstance(Class.forName("skaro.pokeapi.resource.type.TypeRelations"));
        setField(term4461, term4461.getClass(), "noDamageTo", term4462);
        setField(term4461, term4461.getClass(), "halfDamageTo", term4466);
        setField(term4461, term4461.getClass(), "doubleDamageTo", term4470);
        setField(term4461, term4461.getClass(), "noDamageFrom", term4474);
        setField(term4461, term4461.getClass(), "halfDamageFrom", term4478);
        setField(term4461, term4461.getClass(), "doubleDamageFrom", term4482);
        Object term4489 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term4489, term4489.getClass(), "name", "EkgprvqZlM");
        setField(term4489, term4489.getClass(), "url", "fbnKvthhOz");
        Object term4515 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term4515, term4515.getClass(), "name", "");
        setField(term4515, term4515.getClass(), "url", "");
        Object term4519 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term4519, term4519.getClass(), "name", null);
        setField(term4519, term4519.getClass(), "url", null);
        term4486 = new LinkedList();
        ((LinkedList) term4486).add(term4489);
        ((LinkedList) term4486).add(term4515);
        ((LinkedList) term4486).add(term4519);
        ((LinkedList) term4486).add((Object)null);
        ((LinkedList) term4486).add((Object)null);
        ((LinkedList) term4486).add((Object)null);
        ((LinkedList) term4486).add((Object)null);
        ((LinkedList) term4486).add((Object)null);
        ((LinkedList) term4486).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.type.TypeRelations");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term4486;
        callMethod(klass, "setNoDamageFrom", argTypes, term4461, args);
    }

};


