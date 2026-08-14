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
import java.lang.Object;
import java.util.ArrayList;

public class TypeRelationsPast_getGeneration_18978168981 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4743;

    public TypeRelationsPast_getGeneration_18978168981() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term4770 = new ArrayList();
        ArrayList term4774 = new ArrayList();
        ArrayList term4778 = new ArrayList();
        ArrayList term4782 = new ArrayList();
        ArrayList term4786 = new ArrayList();
        ArrayList term4790 = new ArrayList();
        term4743 = newInstance(Class.forName("skaro.pokeapi.resource.type.TypeRelationsPast"));
        Object term4744 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term4769 = newInstance(Class.forName("skaro.pokeapi.resource.type.TypeRelations"));
        setField(term4744, term4744.getClass(), "name", "pdSvedKgPq");
        setField(term4744, term4744.getClass(), "url", "epPTwvcoyb");
        setField(term4743, term4743.getClass(), "generation", term4744);
        setField(term4769, term4769.getClass(), "noDamageTo", term4770);
        setField(term4769, term4769.getClass(), "halfDamageTo", term4774);
        setField(term4769, term4769.getClass(), "doubleDamageTo", term4778);
        setField(term4769, term4769.getClass(), "noDamageFrom", term4782);
        setField(term4769, term4769.getClass(), "halfDamageFrom", term4786);
        setField(term4769, term4769.getClass(), "doubleDamageFrom", term4790);
        setField(term4743, term4743.getClass(), "damageRelations", term4769);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.type.TypeRelationsPast");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGeneration", argTypes, term4743, args);
    }

};


