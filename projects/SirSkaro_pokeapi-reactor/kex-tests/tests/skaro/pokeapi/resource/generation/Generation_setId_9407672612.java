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

public class Generation_setId_9407672612 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62;
     Object term119;

    public Generation_setId_9407672612() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term63 = new Integer(1162663216);
        ArrayList term77 = new ArrayList();
        Object term83 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term85 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term83, term83.getClass(), "name", "");
        setField(term85, term85.getClass(), "name", null);
        setField(term85, term85.getClass(), "url", null);
        setField(term83, term83.getClass(), "language", term85);
        Object term86 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term88 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term86, term86.getClass(), "name", "");
        setField(term88, term88.getClass(), "name", null);
        setField(term88, term88.getClass(), "url", null);
        setField(term86, term86.getClass(), "language", term88);
        Object term89 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term91 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term89, term89.getClass(), "name", "");
        setField(term91, term91.getClass(), "name", null);
        setField(term91, term91.getClass(), "url", null);
        setField(term89, term89.getClass(), "language", term91);
        Object term92 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term94 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term92, term92.getClass(), "name", "");
        setField(term94, term94.getClass(), "name", null);
        setField(term94, term94.getClass(), "url", null);
        setField(term92, term92.getClass(), "language", term94);
        Object term95 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term97 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term95, term95.getClass(), "name", "");
        setField(term97, term97.getClass(), "name", null);
        setField(term97, term97.getClass(), "url", null);
        setField(term95, term95.getClass(), "language", term97);
        Object term98 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term100 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term98, term98.getClass(), "name", "");
        setField(term100, term100.getClass(), "name", null);
        setField(term100, term100.getClass(), "url", null);
        setField(term98, term98.getClass(), "language", term100);
        ArrayList term81 = new ArrayList();
        ((ArrayList) term81).add(term83);
        ((ArrayList) term81).add(term86);
        ((ArrayList) term81).add(term89);
        ((ArrayList) term81).add(term92);
        ((ArrayList) term81).add(term95);
        ((ArrayList) term81).add(term98);
        ArrayList term103 = new ArrayList();
        ArrayList term107 = new ArrayList();
        ArrayList term111 = new ArrayList();
        ArrayList term115 = new ArrayList();
        term62 = newInstance(Class.forName("skaro.pokeapi.resource.generation.Generation"));
        setField(term62, term62.getClass(), "id", term63);
        setField(term62, term62.getClass(), "name", "LQFpaHEwXR");
        setField(term62, term62.getClass(), "abilities", term77);
        setField(term62, term62.getClass(), "names", term81);
        setField(term62, term62.getClass(), "moves", term103);
        setField(term62, term62.getClass(), "pokemonSpecies", term107);
        setField(term62, term62.getClass(), "types", term111);
        setField(term62, term62.getClass(), "versionGroups", term115);
        term119 = new Integer(1484323161);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.generation.Generation");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term119;
        callMethod(klass, "setId", argTypes, term62, args);
    }

};


