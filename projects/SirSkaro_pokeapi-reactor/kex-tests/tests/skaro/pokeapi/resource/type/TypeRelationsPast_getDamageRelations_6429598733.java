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

public class TypeRelationsPast_getDamageRelations_6429598733 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4930;

    public TypeRelationsPast_getDamageRelations_6429598733() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term4957 = new ArrayList();
        ArrayList term4961 = new ArrayList();
        ArrayList term4965 = new ArrayList();
        ArrayList term4969 = new ArrayList();
        ArrayList term4973 = new ArrayList();
        ArrayList term4977 = new ArrayList();
        term4930 = newInstance(Class.forName("skaro.pokeapi.resource.type.TypeRelationsPast"));
        Object term4931 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term4956 = newInstance(Class.forName("skaro.pokeapi.resource.type.TypeRelations"));
        setField(term4931, term4931.getClass(), "name", "ZDhASPHjDG");
        setField(term4931, term4931.getClass(), "url", "HNVOAXYNEZ");
        setField(term4930, term4930.getClass(), "generation", term4931);
        setField(term4956, term4956.getClass(), "noDamageTo", term4957);
        setField(term4956, term4956.getClass(), "halfDamageTo", term4961);
        setField(term4956, term4956.getClass(), "doubleDamageTo", term4965);
        setField(term4956, term4956.getClass(), "noDamageFrom", term4969);
        setField(term4956, term4956.getClass(), "halfDamageFrom", term4973);
        setField(term4956, term4956.getClass(), "doubleDamageFrom", term4977);
        setField(term4930, term4930.getClass(), "damageRelations", term4956);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.type.TypeRelationsPast");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDamageRelations", argTypes, term4930, args);
    }

};


