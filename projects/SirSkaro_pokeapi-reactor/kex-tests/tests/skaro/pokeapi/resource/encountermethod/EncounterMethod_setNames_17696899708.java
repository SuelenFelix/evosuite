package skaro.pokeapi.resource.encountermethod;

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
import static skaro.pokeapi.resource.encountermethod.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.util.ArrayList;
import java.lang.Object;
import java.util.LinkedList;

public class EncounterMethod_setNames_17696899708 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term319;
     Object term358;

    public EncounterMethod_setNames_17696899708() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term320 = new Integer(-1685132342);
        Integer term334 = new Integer(-1456670397);
        Object term338 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term340 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term338, term338.getClass(), "name", "");
        setField(term340, term340.getClass(), "name", null);
        setField(term340, term340.getClass(), "url", null);
        setField(term338, term338.getClass(), "language", term340);
        Object term341 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term343 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term341, term341.getClass(), "name", "");
        setField(term343, term343.getClass(), "name", null);
        setField(term343, term343.getClass(), "url", null);
        setField(term341, term341.getClass(), "language", term343);
        Object term344 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term346 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term344, term344.getClass(), "name", "");
        setField(term346, term346.getClass(), "name", null);
        setField(term346, term346.getClass(), "url", null);
        setField(term344, term344.getClass(), "language", term346);
        Object term347 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term349 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term347, term347.getClass(), "name", "");
        setField(term349, term349.getClass(), "name", null);
        setField(term349, term349.getClass(), "url", null);
        setField(term347, term347.getClass(), "language", term349);
        Object term350 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term352 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term350, term350.getClass(), "name", "");
        setField(term352, term352.getClass(), "name", null);
        setField(term352, term352.getClass(), "url", null);
        setField(term350, term350.getClass(), "language", term352);
        Object term353 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term355 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term353, term353.getClass(), "name", "");
        setField(term355, term355.getClass(), "name", null);
        setField(term355, term355.getClass(), "url", null);
        setField(term353, term353.getClass(), "language", term355);
        ArrayList term336 = new ArrayList();
        ((ArrayList) term336).add(term338);
        ((ArrayList) term336).add(term341);
        ((ArrayList) term336).add(term344);
        ((ArrayList) term336).add(term347);
        ((ArrayList) term336).add(term350);
        ((ArrayList) term336).add(term353);
        term319 = newInstance(Class.forName("skaro.pokeapi.resource.encountermethod.EncounterMethod"));
        setField(term319, term319.getClass(), "id", term320);
        setField(term319, term319.getClass(), "name", "bWWfajKbEX");
        setField(term319, term319.getClass(), "order", term334);
        setField(term319, term319.getClass(), "names", term336);
        term358 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.encountermethod.EncounterMethod");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term358;
        callMethod(klass, "setNames", argTypes, term319, args);
    }

};


