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

public class Region_getVersionGroups_174222359813 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1291;

    public Region_getVersionGroups_174222359813() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1292 = new Integer(-883034806);
        ArrayList term1294 = new ArrayList();
        Object term1312 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term1314 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1312, term1312.getClass(), "name", "");
        setField(term1314, term1314.getClass(), "name", null);
        setField(term1314, term1314.getClass(), "url", null);
        setField(term1312, term1312.getClass(), "language", term1314);
        ArrayList term1310 = new ArrayList();
        ((ArrayList) term1310).add(term1312);
        ArrayList term1342 = new ArrayList();
        ArrayList term1346 = new ArrayList();
        term1291 = newInstance(Class.forName("skaro.pokeapi.resource.region.Region"));
        Object term1317 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1291, term1291.getClass(), "id", term1292);
        setField(term1291, term1291.getClass(), "locations", term1294);
        setField(term1291, term1291.getClass(), "name", "YpJbIgJWWv");
        setField(term1291, term1291.getClass(), "names", term1310);
        setField(term1317, term1317.getClass(), "name", "vKQukfbJUd");
        setField(term1317, term1317.getClass(), "url", "lFRJFUMVbx");
        setField(term1291, term1291.getClass(), "mainGeneration", term1317);
        setField(term1291, term1291.getClass(), "pokedexes", term1342);
        setField(term1291, term1291.getClass(), "versionGroups", term1346);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.region.Region");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getVersionGroups", argTypes, term1291, args);
    }

};


