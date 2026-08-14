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

public class Encounter_setMaxLevel_2912282844 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5290;
     Object term5326;

    public Encounter_setMaxLevel_2912282844() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term5291 = new Integer(-2072158633);
        Integer term5293 = new Integer(-355469363);
        ArrayList term5295 = new ArrayList();
        Integer term5299 = new Integer(1465188553);
        term5290 = newInstance(Class.forName("skaro.pokeapi.resource.Encounter"));
        Object term5301 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term5290, term5290.getClass(), "minLevel", term5291);
        setField(term5290, term5290.getClass(), "maxLevel", term5293);
        setField(term5290, term5290.getClass(), "conditionValues", term5295);
        setField(term5290, term5290.getClass(), "chance", term5299);
        setField(term5301, term5301.getClass(), "name", "CuWebzZQjZ");
        setField(term5301, term5301.getClass(), "url", "wRVaaJxKYI");
        setField(term5290, term5290.getClass(), "method", term5301);
        term5326 = new Integer(1633913667);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.Encounter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term5326;
        callMethod(klass, "setMaxLevel", argTypes, term5290, args);
    }

};


