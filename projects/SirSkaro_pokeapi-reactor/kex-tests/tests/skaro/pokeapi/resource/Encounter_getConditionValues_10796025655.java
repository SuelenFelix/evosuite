package skaro.pokeapi.resource;

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
import static skaro.pokeapi.resource.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.util.ArrayList;
import java.lang.Object;

public class Encounter_getConditionValues_10796025655 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5348;

    public Encounter_getConditionValues_10796025655() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term5349 = new Integer(1292332296);
        Integer term5351 = new Integer(-1415256843);
        ArrayList term5353 = new ArrayList();
        Integer term5357 = new Integer(612177768);
        term5348 = newInstance(Class.forName("skaro.pokeapi.resource.Encounter"));
        Object term5359 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term5348, term5348.getClass(), "minLevel", term5349);
        setField(term5348, term5348.getClass(), "maxLevel", term5351);
        setField(term5348, term5348.getClass(), "conditionValues", term5353);
        setField(term5348, term5348.getClass(), "chance", term5357);
        setField(term5359, term5359.getClass(), "name", "yOQuJXRvOo");
        setField(term5359, term5359.getClass(), "url", "XmLHcnVsch");
        setField(term5348, term5348.getClass(), "method", term5359);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.Encounter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getConditionValues", argTypes, term5348, args);
    }

};


