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
import java.util.LinkedList;

public class Generation_setPokemonSpecies_38864114912 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term861;
     Object term906;

    public Generation_setPokemonSpecies_38864114912() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term862 = new Integer(1134449235);
        ArrayList term876 = new ArrayList();
        Object term882 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term884 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term882, term882.getClass(), "name", "");
        setField(term884, term884.getClass(), "name", null);
        setField(term884, term884.getClass(), "url", null);
        setField(term882, term882.getClass(), "language", term884);
        Object term885 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term887 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term885, term885.getClass(), "name", "");
        setField(term887, term887.getClass(), "name", null);
        setField(term887, term887.getClass(), "url", null);
        setField(term885, term885.getClass(), "language", term887);
        ArrayList term880 = new ArrayList();
        ((ArrayList) term880).add(term882);
        ((ArrayList) term880).add(term885);
        ArrayList term890 = new ArrayList();
        ArrayList term894 = new ArrayList();
        ArrayList term898 = new ArrayList();
        ArrayList term902 = new ArrayList();
        term861 = newInstance(Class.forName("skaro.pokeapi.resource.generation.Generation"));
        setField(term861, term861.getClass(), "id", term862);
        setField(term861, term861.getClass(), "name", "RMsXuyzKJV");
        setField(term861, term861.getClass(), "abilities", term876);
        setField(term861, term861.getClass(), "names", term880);
        setField(term861, term861.getClass(), "moves", term890);
        setField(term861, term861.getClass(), "pokemonSpecies", term894);
        setField(term861, term861.getClass(), "types", term898);
        setField(term861, term861.getClass(), "versionGroups", term902);
        Object term909 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term909, term909.getClass(), "name", "GrqozDKFOk");
        setField(term909, term909.getClass(), "url", "CFyoseFGLF");
        Object term935 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term935, term935.getClass(), "name", "");
        setField(term935, term935.getClass(), "url", "");
        Object term939 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term939, term939.getClass(), "name", null);
        setField(term939, term939.getClass(), "url", null);
        term906 = new LinkedList();
        ((LinkedList) term906).add(term909);
        ((LinkedList) term906).add(term935);
        ((LinkedList) term906).add(term939);
        ((LinkedList) term906).add((Object)null);
        ((LinkedList) term906).add((Object)null);
        ((LinkedList) term906).add((Object)null);
        ((LinkedList) term906).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.generation.Generation");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term906;
        callMethod(klass, "setPokemonSpecies", argTypes, term861, args);
    }

};


