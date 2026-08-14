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

public class EncounterMethod_getName_40890619812 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term373;

    public EncounterMethod_getName_40890619812() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term373 = newInstance(Class.forName("skaro.pokeapi.resource.encountermethod.EncounterMethod"));
        setField(term373, term373.getClass(), "id", null);
        setField(term373, term373.getClass(), "name", null);
        setField(term373, term373.getClass(), "order", null);
        setField(term373, term373.getClass(), "names", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.encountermethod.EncounterMethod");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term373, args);
    }

};


