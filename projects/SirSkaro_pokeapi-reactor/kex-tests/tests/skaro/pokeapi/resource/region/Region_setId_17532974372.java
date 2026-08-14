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

public class Region_setId_17532974372 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term99;
     Object term173;

    public Region_setId_17532974372() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term100 = new Integer(1162663216);
        ArrayList term102 = new ArrayList();
        Object term120 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term122 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term120, term120.getClass(), "name", "");
        setField(term122, term122.getClass(), "name", null);
        setField(term122, term122.getClass(), "url", null);
        setField(term120, term120.getClass(), "language", term122);
        Object term123 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term125 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term123, term123.getClass(), "name", "");
        setField(term125, term125.getClass(), "name", null);
        setField(term125, term125.getClass(), "url", null);
        setField(term123, term123.getClass(), "language", term125);
        Object term126 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term128 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term126, term126.getClass(), "name", "");
        setField(term128, term128.getClass(), "name", null);
        setField(term128, term128.getClass(), "url", null);
        setField(term126, term126.getClass(), "language", term128);
        Object term129 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term131 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term129, term129.getClass(), "name", "");
        setField(term131, term131.getClass(), "name", null);
        setField(term131, term131.getClass(), "url", null);
        setField(term129, term129.getClass(), "language", term131);
        Object term132 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term134 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term132, term132.getClass(), "name", "");
        setField(term134, term134.getClass(), "name", null);
        setField(term134, term134.getClass(), "url", null);
        setField(term132, term132.getClass(), "language", term134);
        Object term135 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term137 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term135, term135.getClass(), "name", "");
        setField(term137, term137.getClass(), "name", null);
        setField(term137, term137.getClass(), "url", null);
        setField(term135, term135.getClass(), "language", term137);
        ArrayList term118 = new ArrayList();
        ((ArrayList) term118).add(term120);
        ((ArrayList) term118).add(term123);
        ((ArrayList) term118).add(term126);
        ((ArrayList) term118).add(term129);
        ((ArrayList) term118).add(term132);
        ((ArrayList) term118).add(term135);
        ArrayList term165 = new ArrayList();
        ArrayList term169 = new ArrayList();
        term99 = newInstance(Class.forName("skaro.pokeapi.resource.region.Region"));
        Object term140 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term99, term99.getClass(), "id", term100);
        setField(term99, term99.getClass(), "locations", term102);
        setField(term99, term99.getClass(), "name", "aJlieCFVtF");
        setField(term99, term99.getClass(), "names", term118);
        setField(term140, term140.getClass(), "name", "kuTXqwMtDB");
        setField(term140, term140.getClass(), "url", "Ghbwtircqb");
        setField(term99, term99.getClass(), "mainGeneration", term140);
        setField(term99, term99.getClass(), "pokedexes", term165);
        setField(term99, term99.getClass(), "versionGroups", term169);
        term173 = new Integer(1484323161);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.region.Region");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term173;
        callMethod(klass, "setId", argTypes, term99, args);
    }

};


