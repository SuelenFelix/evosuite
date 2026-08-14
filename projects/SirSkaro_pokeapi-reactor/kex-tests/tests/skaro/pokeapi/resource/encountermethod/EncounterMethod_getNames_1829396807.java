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

public class EncounterMethod_getNames_1829396807 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term282;

    public EncounterMethod_getNames_1829396807() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term283 = new Integer(1585847225);
        Integer term297 = new Integer(597278769);
        Object term301 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term303 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term301, term301.getClass(), "name", "");
        setField(term303, term303.getClass(), "name", null);
        setField(term303, term303.getClass(), "url", null);
        setField(term301, term301.getClass(), "language", term303);
        Object term304 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term306 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term304, term304.getClass(), "name", "");
        setField(term306, term306.getClass(), "name", null);
        setField(term306, term306.getClass(), "url", null);
        setField(term304, term304.getClass(), "language", term306);
        ArrayList term299 = new ArrayList();
        ((ArrayList) term299).add(term301);
        ((ArrayList) term299).add(term304);
        term282 = newInstance(Class.forName("skaro.pokeapi.resource.encountermethod.EncounterMethod"));
        setField(term282, term282.getClass(), "id", term283);
        setField(term282, term282.getClass(), "name", "oVgzLbrsFr");
        setField(term282, term282.getClass(), "order", term297);
        setField(term282, term282.getClass(), "names", term299);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.encountermethod.EncounterMethod");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNames", argTypes, term282, args);
    }

};


