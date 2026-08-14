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

public class Generation_setName_9992698964 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term186;

    public Generation_setName_9992698964() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term187 = new Integer(-1922583790);
        ArrayList term201 = new ArrayList();
        Object term207 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term209 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term207, term207.getClass(), "name", "");
        setField(term209, term209.getClass(), "name", null);
        setField(term209, term209.getClass(), "url", null);
        setField(term207, term207.getClass(), "language", term209);
        Object term210 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term212 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term210, term210.getClass(), "name", "");
        setField(term212, term212.getClass(), "name", null);
        setField(term212, term212.getClass(), "url", null);
        setField(term210, term210.getClass(), "language", term212);
        Object term213 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term215 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term213, term213.getClass(), "name", "");
        setField(term215, term215.getClass(), "name", null);
        setField(term215, term215.getClass(), "url", null);
        setField(term213, term213.getClass(), "language", term215);
        Object term216 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term218 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term216, term216.getClass(), "name", "");
        setField(term218, term218.getClass(), "name", null);
        setField(term218, term218.getClass(), "url", null);
        setField(term216, term216.getClass(), "language", term218);
        Object term219 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term221 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term219, term219.getClass(), "name", "");
        setField(term221, term221.getClass(), "name", null);
        setField(term221, term221.getClass(), "url", null);
        setField(term219, term219.getClass(), "language", term221);
        Object term222 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term224 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term222, term222.getClass(), "name", "");
        setField(term224, term224.getClass(), "name", null);
        setField(term224, term224.getClass(), "url", null);
        setField(term222, term222.getClass(), "language", term224);
        ArrayList term205 = new ArrayList();
        ((ArrayList) term205).add(term207);
        ((ArrayList) term205).add(term210);
        ((ArrayList) term205).add(term213);
        ((ArrayList) term205).add(term216);
        ((ArrayList) term205).add(term219);
        ((ArrayList) term205).add(term222);
        ArrayList term227 = new ArrayList();
        ArrayList term231 = new ArrayList();
        ArrayList term235 = new ArrayList();
        ArrayList term239 = new ArrayList();
        term186 = newInstance(Class.forName("skaro.pokeapi.resource.generation.Generation"));
        setField(term186, term186.getClass(), "id", term187);
        setField(term186, term186.getClass(), "name", "aKnKipADSo");
        setField(term186, term186.getClass(), "abilities", term201);
        setField(term186, term186.getClass(), "names", term205);
        setField(term186, term186.getClass(), "moves", term227);
        setField(term186, term186.getClass(), "pokemonSpecies", term231);
        setField(term186, term186.getClass(), "types", term235);
        setField(term186, term186.getClass(), "versionGroups", term239);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.generation.Generation");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ytSBIKXogI";
        callMethod(klass, "setName", argTypes, term186, args);
    }

};


