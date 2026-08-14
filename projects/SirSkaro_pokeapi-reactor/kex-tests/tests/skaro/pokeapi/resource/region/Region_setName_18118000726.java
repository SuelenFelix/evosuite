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

public class Region_setName_18118000726 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term490;

    public Region_setName_18118000726() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term491 = new Integer(-1955890973);
        ArrayList term493 = new ArrayList();
        Object term511 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term513 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term511, term511.getClass(), "name", "");
        setField(term513, term513.getClass(), "name", null);
        setField(term513, term513.getClass(), "url", null);
        setField(term511, term511.getClass(), "language", term513);
        Object term514 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term516 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term514, term514.getClass(), "name", "");
        setField(term516, term516.getClass(), "name", null);
        setField(term516, term516.getClass(), "url", null);
        setField(term514, term514.getClass(), "language", term516);
        ArrayList term509 = new ArrayList();
        ((ArrayList) term509).add(term511);
        ((ArrayList) term509).add(term514);
        ArrayList term544 = new ArrayList();
        ArrayList term548 = new ArrayList();
        term490 = newInstance(Class.forName("skaro.pokeapi.resource.region.Region"));
        Object term519 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term490, term490.getClass(), "id", term491);
        setField(term490, term490.getClass(), "locations", term493);
        setField(term490, term490.getClass(), "name", "bLPjGVBhlX");
        setField(term490, term490.getClass(), "names", term509);
        setField(term519, term519.getClass(), "name", "oVgzLbrsFr");
        setField(term519, term519.getClass(), "url", "vQVyKLdtaz");
        setField(term490, term490.getClass(), "mainGeneration", term519);
        setField(term490, term490.getClass(), "pokedexes", term544);
        setField(term490, term490.getClass(), "versionGroups", term548);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.region.Region");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "OWKQODBLzb";
        callMethod(klass, "setName", argTypes, term490, args);
    }

};


