package skaro.pokeapi.resource.generation;

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
import static skaro.pokeapi.resource.generation.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.util.ArrayList;
import java.lang.Object;
import java.util.LinkedList;

public class Generation_setTypes_111714964114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1056;
     Object term1098;

    public Generation_setTypes_111714964114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1057 = new Integer(1585847225);
        ArrayList term1071 = new ArrayList();
        Object term1077 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term1079 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1077, term1077.getClass(), "name", "");
        setField(term1079, term1079.getClass(), "name", null);
        setField(term1079, term1079.getClass(), "url", null);
        setField(term1077, term1077.getClass(), "language", term1079);
        ArrayList term1075 = new ArrayList();
        ((ArrayList) term1075).add(term1077);
        ArrayList term1082 = new ArrayList();
        ArrayList term1086 = new ArrayList();
        ArrayList term1090 = new ArrayList();
        ArrayList term1094 = new ArrayList();
        term1056 = newInstance(Class.forName("skaro.pokeapi.resource.generation.Generation"));
        setField(term1056, term1056.getClass(), "id", term1057);
        setField(term1056, term1056.getClass(), "name", "NTlKJDDWlk");
        setField(term1056, term1056.getClass(), "abilities", term1071);
        setField(term1056, term1056.getClass(), "names", term1075);
        setField(term1056, term1056.getClass(), "moves", term1082);
        setField(term1056, term1056.getClass(), "pokemonSpecies", term1086);
        setField(term1056, term1056.getClass(), "types", term1090);
        setField(term1056, term1056.getClass(), "versionGroups", term1094);
        Object term1101 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1101, term1101.getClass(), "name", "UBRmXJmfrt");
        setField(term1101, term1101.getClass(), "url", "WZzvmIHhzZ");
        Object term1127 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1127, term1127.getClass(), "name", "");
        setField(term1127, term1127.getClass(), "url", "");
        Object term1131 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1131, term1131.getClass(), "name", null);
        setField(term1131, term1131.getClass(), "url", null);
        term1098 = new LinkedList();
        ((LinkedList) term1098).add(term1101);
        ((LinkedList) term1098).add(term1127);
        ((LinkedList) term1098).add(term1131);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.generation.Generation");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term1098;
        callMethod(klass, "setTypes", argTypes, term1056, args);
    }

};


