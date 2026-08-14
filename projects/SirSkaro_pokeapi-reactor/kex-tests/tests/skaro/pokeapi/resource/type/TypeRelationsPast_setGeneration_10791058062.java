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

public class TypeRelationsPast_setGeneration_10791058062 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4814;
     Object term4865;

    public TypeRelationsPast_setGeneration_10791058062() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term4841 = new ArrayList();
        ArrayList term4845 = new ArrayList();
        ArrayList term4849 = new ArrayList();
        ArrayList term4853 = new ArrayList();
        ArrayList term4857 = new ArrayList();
        ArrayList term4861 = new ArrayList();
        term4814 = newInstance(Class.forName("skaro.pokeapi.resource.type.TypeRelationsPast"));
        Object term4815 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term4840 = newInstance(Class.forName("skaro.pokeapi.resource.type.TypeRelations"));
        setField(term4815, term4815.getClass(), "name", "UBPHmOICBs");
        setField(term4815, term4815.getClass(), "url", "IDJUVPgUJf");
        setField(term4814, term4814.getClass(), "generation", term4815);
        setField(term4840, term4840.getClass(), "noDamageTo", term4841);
        setField(term4840, term4840.getClass(), "halfDamageTo", term4845);
        setField(term4840, term4840.getClass(), "doubleDamageTo", term4849);
        setField(term4840, term4840.getClass(), "noDamageFrom", term4853);
        setField(term4840, term4840.getClass(), "halfDamageFrom", term4857);
        setField(term4840, term4840.getClass(), "doubleDamageFrom", term4861);
        setField(term4814, term4814.getClass(), "damageRelations", term4840);
        term4865 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term4865, term4865.getClass(), "name", "FIdNVptZpW");
        setField(term4865, term4865.getClass(), "url", "rQjxAhisjm");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.type.TypeRelationsPast");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("skaro.pokeapi.resource.NamedApiResource");
        Object[] args = new Object[1];
        args[0] = term4865;
        callMethod(klass, "setGeneration", argTypes, term4814, args);
    }

};


