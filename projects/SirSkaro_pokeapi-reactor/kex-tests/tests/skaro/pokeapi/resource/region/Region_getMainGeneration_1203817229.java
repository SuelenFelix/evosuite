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

public class Region_getMainGeneration_1203817229 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term854;

    public Region_getMainGeneration_1203817229() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term855 = new Integer(-1339778481);
        ArrayList term857 = new ArrayList();
        Object term875 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term877 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term875, term875.getClass(), "name", "");
        setField(term877, term877.getClass(), "name", null);
        setField(term877, term877.getClass(), "url", null);
        setField(term875, term875.getClass(), "language", term877);
        Object term878 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term880 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term878, term878.getClass(), "name", "");
        setField(term880, term880.getClass(), "name", null);
        setField(term880, term880.getClass(), "url", null);
        setField(term878, term878.getClass(), "language", term880);
        Object term881 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term883 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term881, term881.getClass(), "name", "");
        setField(term883, term883.getClass(), "name", null);
        setField(term883, term883.getClass(), "url", null);
        setField(term881, term881.getClass(), "language", term883);
        ArrayList term873 = new ArrayList();
        ((ArrayList) term873).add(term875);
        ((ArrayList) term873).add(term878);
        ((ArrayList) term873).add(term881);
        ArrayList term911 = new ArrayList();
        ArrayList term915 = new ArrayList();
        term854 = newInstance(Class.forName("skaro.pokeapi.resource.region.Region"));
        Object term886 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term854, term854.getClass(), "id", term855);
        setField(term854, term854.getClass(), "locations", term857);
        setField(term854, term854.getClass(), "name", "AdxvLJhNLe");
        setField(term854, term854.getClass(), "names", term873);
        setField(term886, term886.getClass(), "name", "gCWtLVKVVe");
        setField(term886, term886.getClass(), "url", "fWKJoSoCwE");
        setField(term854, term854.getClass(), "mainGeneration", term886);
        setField(term854, term854.getClass(), "pokedexes", term911);
        setField(term854, term854.getClass(), "versionGroups", term915);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.region.Region");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMainGeneration", argTypes, term854, args);
    }

};


