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

public class Generation_setNames_6027753368 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term507;
     Object term558;

    public Generation_setNames_6027753368() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term508 = new Integer(1227103734);
        ArrayList term522 = new ArrayList();
        Object term528 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term530 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term528, term528.getClass(), "name", "");
        setField(term530, term530.getClass(), "name", null);
        setField(term530, term530.getClass(), "url", null);
        setField(term528, term528.getClass(), "language", term530);
        Object term531 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term533 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term531, term531.getClass(), "name", "");
        setField(term533, term533.getClass(), "name", null);
        setField(term533, term533.getClass(), "url", null);
        setField(term531, term531.getClass(), "language", term533);
        Object term534 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term536 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term534, term534.getClass(), "name", "");
        setField(term536, term536.getClass(), "name", null);
        setField(term536, term536.getClass(), "url", null);
        setField(term534, term534.getClass(), "language", term536);
        Object term537 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term539 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term537, term537.getClass(), "name", "");
        setField(term539, term539.getClass(), "name", null);
        setField(term539, term539.getClass(), "url", null);
        setField(term537, term537.getClass(), "language", term539);
        ArrayList term526 = new ArrayList();
        ((ArrayList) term526).add(term528);
        ((ArrayList) term526).add(term531);
        ((ArrayList) term526).add(term534);
        ((ArrayList) term526).add(term537);
        ArrayList term542 = new ArrayList();
        ArrayList term546 = new ArrayList();
        ArrayList term550 = new ArrayList();
        ArrayList term554 = new ArrayList();
        term507 = newInstance(Class.forName("skaro.pokeapi.resource.generation.Generation"));
        setField(term507, term507.getClass(), "id", term508);
        setField(term507, term507.getClass(), "name", "AWRooQKkdW");
        setField(term507, term507.getClass(), "abilities", term522);
        setField(term507, term507.getClass(), "names", term526);
        setField(term507, term507.getClass(), "moves", term542);
        setField(term507, term507.getClass(), "pokemonSpecies", term546);
        setField(term507, term507.getClass(), "types", term550);
        setField(term507, term507.getClass(), "versionGroups", term554);
        term558 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.generation.Generation");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term558;
        callMethod(klass, "setNames", argTypes, term507, args);
    }

};


