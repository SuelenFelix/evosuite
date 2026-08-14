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

public class Region_getLocations_19855298563 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term205;

    public Region_getLocations_19855298563() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term206 = new Integer(391863371);
        ArrayList term208 = new ArrayList();
        Object term226 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term228 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term226, term226.getClass(), "name", "");
        setField(term228, term228.getClass(), "name", null);
        setField(term228, term228.getClass(), "url", null);
        setField(term226, term226.getClass(), "language", term228);
        ArrayList term224 = new ArrayList();
        ((ArrayList) term224).add(term226);
        ArrayList term256 = new ArrayList();
        ArrayList term260 = new ArrayList();
        term205 = newInstance(Class.forName("skaro.pokeapi.resource.region.Region"));
        Object term231 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term205, term205.getClass(), "id", term206);
        setField(term205, term205.getClass(), "locations", term208);
        setField(term205, term205.getClass(), "name", "xrwlQZdwCp");
        setField(term205, term205.getClass(), "names", term224);
        setField(term231, term231.getClass(), "name", "wSQxaModmm");
        setField(term231, term231.getClass(), "url", "UlajhuVLaP");
        setField(term205, term205.getClass(), "mainGeneration", term231);
        setField(term205, term205.getClass(), "pokedexes", term256);
        setField(term205, term205.getClass(), "versionGroups", term260);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.region.Region");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLocations", argTypes, term205, args);
    }

};


