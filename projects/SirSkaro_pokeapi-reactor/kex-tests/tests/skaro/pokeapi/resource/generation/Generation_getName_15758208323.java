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

public class Generation_getName_15758208323 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term131;

    public Generation_getName_15758208323() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term132 = new Integer(391863371);
        ArrayList term146 = new ArrayList();
        Object term152 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term154 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term152, term152.getClass(), "name", "");
        setField(term154, term154.getClass(), "name", null);
        setField(term154, term154.getClass(), "url", null);
        setField(term152, term152.getClass(), "language", term154);
        Object term155 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term157 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term155, term155.getClass(), "name", "");
        setField(term157, term157.getClass(), "name", null);
        setField(term157, term157.getClass(), "url", null);
        setField(term155, term155.getClass(), "language", term157);
        ArrayList term150 = new ArrayList();
        ((ArrayList) term150).add(term152);
        ((ArrayList) term150).add(term155);
        ArrayList term160 = new ArrayList();
        ArrayList term164 = new ArrayList();
        ArrayList term168 = new ArrayList();
        ArrayList term172 = new ArrayList();
        term131 = newInstance(Class.forName("skaro.pokeapi.resource.generation.Generation"));
        setField(term131, term131.getClass(), "id", term132);
        setField(term131, term131.getClass(), "name", "AijpHYOFuy");
        setField(term131, term131.getClass(), "abilities", term146);
        setField(term131, term131.getClass(), "names", term150);
        setField(term131, term131.getClass(), "moves", term160);
        setField(term131, term131.getClass(), "pokemonSpecies", term164);
        setField(term131, term131.getClass(), "types", term168);
        setField(term131, term131.getClass(), "versionGroups", term172);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.generation.Generation");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term131, args);
    }

};


