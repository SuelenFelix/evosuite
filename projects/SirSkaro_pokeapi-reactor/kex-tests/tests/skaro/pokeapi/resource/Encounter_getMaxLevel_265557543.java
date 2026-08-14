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

public class Encounter_getMaxLevel_265557543 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5234;

    public Encounter_getMaxLevel_265557543() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term5235 = new Integer(5603560);
        Integer term5237 = new Integer(-1079020032);
        ArrayList term5239 = new ArrayList();
        Integer term5243 = new Integer(-1973791064);
        term5234 = newInstance(Class.forName("skaro.pokeapi.resource.Encounter"));
        Object term5245 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term5234, term5234.getClass(), "minLevel", term5235);
        setField(term5234, term5234.getClass(), "maxLevel", term5237);
        setField(term5234, term5234.getClass(), "conditionValues", term5239);
        setField(term5234, term5234.getClass(), "chance", term5243);
        setField(term5245, term5245.getClass(), "name", "FBCXbjHVXO");
        setField(term5245, term5245.getClass(), "url", "dIWAnvmLiC");
        setField(term5234, term5234.getClass(), "method", term5245);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.Encounter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMaxLevel", argTypes, term5234, args);
    }

};


