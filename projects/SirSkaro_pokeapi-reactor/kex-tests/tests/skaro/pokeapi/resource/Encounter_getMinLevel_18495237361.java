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

public class Encounter_getMinLevel_18495237361 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5120;

    public Encounter_getMinLevel_18495237361() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term5121 = new Integer(1709474063);
        Integer term5123 = new Integer(1406617209);
        ArrayList term5125 = new ArrayList();
        Integer term5129 = new Integer(1706047059);
        term5120 = newInstance(Class.forName("skaro.pokeapi.resource.Encounter"));
        Object term5131 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term5120, term5120.getClass(), "minLevel", term5121);
        setField(term5120, term5120.getClass(), "maxLevel", term5123);
        setField(term5120, term5120.getClass(), "conditionValues", term5125);
        setField(term5120, term5120.getClass(), "chance", term5129);
        setField(term5131, term5131.getClass(), "name", "DfWwbodtVw");
        setField(term5131, term5131.getClass(), "url", "kTbFMpVWqx");
        setField(term5120, term5120.getClass(), "method", term5131);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.Encounter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMinLevel", argTypes, term5120, args);
    }

};


