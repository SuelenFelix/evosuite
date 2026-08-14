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

public class EncounterMethod_getOrder_10711850105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term197;

    public EncounterMethod_getOrder_10711850105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term198 = new Integer(-1339778481);
        Integer term212 = new Integer(1725571209);
        Object term216 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term218 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term216, term216.getClass(), "name", "");
        setField(term218, term218.getClass(), "name", null);
        setField(term218, term218.getClass(), "url", null);
        setField(term216, term216.getClass(), "language", term218);
        ArrayList term214 = new ArrayList();
        ((ArrayList) term214).add(term216);
        term197 = newInstance(Class.forName("skaro.pokeapi.resource.encountermethod.EncounterMethod"));
        setField(term197, term197.getClass(), "id", term198);
        setField(term197, term197.getClass(), "name", "JDswTTCZHV");
        setField(term197, term197.getClass(), "order", term212);
        setField(term197, term197.getClass(), "names", term214);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.encountermethod.EncounterMethod");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getOrder", argTypes, term197, args);
    }

};


