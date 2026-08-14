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

public class Region_setMainGeneration_101605407010 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term949;
     Object term1005;

    public Region_setMainGeneration_101605407010() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term950 = new Integer(1725571209);
        ArrayList term952 = new ArrayList();
        ArrayList term968 = new ArrayList();
        ArrayList term997 = new ArrayList();
        ArrayList term1001 = new ArrayList();
        term949 = newInstance(Class.forName("skaro.pokeapi.resource.region.Region"));
        Object term972 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term949, term949.getClass(), "id", term950);
        setField(term949, term949.getClass(), "locations", term952);
        setField(term949, term949.getClass(), "name", "wfaXBpWAUH");
        setField(term949, term949.getClass(), "names", term968);
        setField(term972, term972.getClass(), "name", "VMeAzAHwZj");
        setField(term972, term972.getClass(), "url", "PznxWXsZME");
        setField(term949, term949.getClass(), "mainGeneration", term972);
        setField(term949, term949.getClass(), "pokedexes", term997);
        setField(term949, term949.getClass(), "versionGroups", term1001);
        term1005 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1005, term1005.getClass(), "name", "yVMkkQhvmN");
        setField(term1005, term1005.getClass(), "url", "mvrkADEgpp");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.region.Region");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("skaro.pokeapi.resource.NamedApiResource");
        Object[] args = new Object[1];
        args[0] = term1005;
        callMethod(klass, "setMainGeneration", argTypes, term949, args);
    }

};


