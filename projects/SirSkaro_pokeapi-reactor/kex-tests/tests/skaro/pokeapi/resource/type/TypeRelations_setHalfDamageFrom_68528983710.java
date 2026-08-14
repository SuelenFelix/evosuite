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

public class TypeRelations_setHalfDamageFrom_68528983710 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4600;
     Object term4625;

    public TypeRelations_setHalfDamageFrom_68528983710() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term4601 = new ArrayList();
        ArrayList term4605 = new ArrayList();
        ArrayList term4609 = new ArrayList();
        ArrayList term4613 = new ArrayList();
        ArrayList term4617 = new ArrayList();
        ArrayList term4621 = new ArrayList();
        term4600 = newInstance(Class.forName("skaro.pokeapi.resource.type.TypeRelations"));
        setField(term4600, term4600.getClass(), "noDamageTo", term4601);
        setField(term4600, term4600.getClass(), "halfDamageTo", term4605);
        setField(term4600, term4600.getClass(), "doubleDamageTo", term4609);
        setField(term4600, term4600.getClass(), "noDamageFrom", term4613);
        setField(term4600, term4600.getClass(), "halfDamageFrom", term4617);
        setField(term4600, term4600.getClass(), "doubleDamageFrom", term4621);
        Object term4628 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term4628, term4628.getClass(), "name", "IkfarsYNJO");
        setField(term4628, term4628.getClass(), "url", "aZKOWhHMEh");
        Object term4654 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term4654, term4654.getClass(), "name", "");
        setField(term4654, term4654.getClass(), "url", "");
        term4625 = new LinkedList();
        ((LinkedList) term4625).add(term4628);
        ((LinkedList) term4625).add(term4654);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.type.TypeRelations");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term4625;
        callMethod(klass, "setHalfDamageFrom", argTypes, term4600, args);
    }

};


