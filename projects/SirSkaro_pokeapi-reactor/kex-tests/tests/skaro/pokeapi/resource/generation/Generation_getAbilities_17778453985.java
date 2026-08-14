package skaro.pokeapi.resource.generation;

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
import static skaro.pokeapi.resource.generation.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.util.ArrayList;
import java.lang.Object;

public class Generation_getAbilities_17778453985 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term275;

    public Generation_getAbilities_17778453985() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term276 = new Integer(-616727354);
        ArrayList term290 = new ArrayList();
        Object term296 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term298 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term296, term296.getClass(), "name", "");
        setField(term298, term298.getClass(), "name", null);
        setField(term298, term298.getClass(), "url", null);
        setField(term296, term296.getClass(), "language", term298);
        Object term299 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term301 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term299, term299.getClass(), "name", "");
        setField(term301, term301.getClass(), "name", null);
        setField(term301, term301.getClass(), "url", null);
        setField(term299, term299.getClass(), "language", term301);
        Object term302 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term304 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term302, term302.getClass(), "name", "");
        setField(term304, term304.getClass(), "name", null);
        setField(term304, term304.getClass(), "url", null);
        setField(term302, term302.getClass(), "language", term304);
        Object term305 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term307 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term305, term305.getClass(), "name", "");
        setField(term307, term307.getClass(), "name", null);
        setField(term307, term307.getClass(), "url", null);
        setField(term305, term305.getClass(), "language", term307);
        Object term308 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term310 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term308, term308.getClass(), "name", "");
        setField(term310, term310.getClass(), "name", null);
        setField(term310, term310.getClass(), "url", null);
        setField(term308, term308.getClass(), "language", term310);
        Object term311 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term313 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term311, term311.getClass(), "name", "");
        setField(term313, term313.getClass(), "name", null);
        setField(term313, term313.getClass(), "url", null);
        setField(term311, term311.getClass(), "language", term313);
        ArrayList term294 = new ArrayList();
        ((ArrayList) term294).add(term296);
        ((ArrayList) term294).add(term299);
        ((ArrayList) term294).add(term302);
        ((ArrayList) term294).add(term305);
        ((ArrayList) term294).add(term308);
        ((ArrayList) term294).add(term311);
        ArrayList term316 = new ArrayList();
        ArrayList term320 = new ArrayList();
        ArrayList term324 = new ArrayList();
        ArrayList term328 = new ArrayList();
        term275 = newInstance(Class.forName("skaro.pokeapi.resource.generation.Generation"));
        setField(term275, term275.getClass(), "id", term276);
        setField(term275, term275.getClass(), "name", "nHXjMycHlU");
        setField(term275, term275.getClass(), "abilities", term290);
        setField(term275, term275.getClass(), "names", term294);
        setField(term275, term275.getClass(), "moves", term316);
        setField(term275, term275.getClass(), "pokemonSpecies", term320);
        setField(term275, term275.getClass(), "types", term324);
        setField(term275, term275.getClass(), "versionGroups", term328);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.generation.Generation");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAbilities", argTypes, term275, args);
    }

};


