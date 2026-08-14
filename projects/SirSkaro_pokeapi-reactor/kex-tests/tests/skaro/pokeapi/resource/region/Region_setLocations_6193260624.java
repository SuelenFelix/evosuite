package skaro.pokeapi.resource.region;

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
import static skaro.pokeapi.resource.region.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.util.ArrayList;
import java.lang.Object;
import java.util.LinkedList;

public class Region_setLocations_6193260624 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term294;
     Object term356;

    public Region_setLocations_6193260624() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term295 = new Integer(-1922583790);
        ArrayList term297 = new ArrayList();
        Object term315 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term317 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term315, term315.getClass(), "name", "");
        setField(term317, term317.getClass(), "name", null);
        setField(term317, term317.getClass(), "url", null);
        setField(term315, term315.getClass(), "language", term317);
        Object term318 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term320 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term318, term318.getClass(), "name", "");
        setField(term320, term320.getClass(), "name", null);
        setField(term320, term320.getClass(), "url", null);
        setField(term318, term318.getClass(), "language", term320);
        ArrayList term313 = new ArrayList();
        ((ArrayList) term313).add(term315);
        ((ArrayList) term313).add(term318);
        ArrayList term348 = new ArrayList();
        ArrayList term352 = new ArrayList();
        term294 = newInstance(Class.forName("skaro.pokeapi.resource.region.Region"));
        Object term323 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term294, term294.getClass(), "id", term295);
        setField(term294, term294.getClass(), "locations", term297);
        setField(term294, term294.getClass(), "name", "gGSMzuGICf");
        setField(term294, term294.getClass(), "names", term313);
        setField(term323, term323.getClass(), "name", "jDtqGUpnZN");
        setField(term323, term323.getClass(), "url", "nGKItKLYNC");
        setField(term294, term294.getClass(), "mainGeneration", term323);
        setField(term294, term294.getClass(), "pokedexes", term348);
        setField(term294, term294.getClass(), "versionGroups", term352);
        term356 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.region.Region");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term356;
        callMethod(klass, "setLocations", argTypes, term294, args);
    }

};


