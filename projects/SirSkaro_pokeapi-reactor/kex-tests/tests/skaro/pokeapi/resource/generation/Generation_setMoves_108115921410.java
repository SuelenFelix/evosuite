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

public class Generation_setMoves_108115921410 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term629;
     Object term689;

    public Generation_setMoves_108115921410() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term630 = new Integer(1725571209);
        ArrayList term644 = new ArrayList();
        Object term650 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term652 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term650, term650.getClass(), "name", "");
        setField(term652, term652.getClass(), "name", null);
        setField(term652, term652.getClass(), "url", null);
        setField(term650, term650.getClass(), "language", term652);
        Object term653 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term655 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term653, term653.getClass(), "name", "");
        setField(term655, term655.getClass(), "name", null);
        setField(term655, term655.getClass(), "url", null);
        setField(term653, term653.getClass(), "language", term655);
        Object term656 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term658 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term656, term656.getClass(), "name", "");
        setField(term658, term658.getClass(), "name", null);
        setField(term658, term658.getClass(), "url", null);
        setField(term656, term656.getClass(), "language", term658);
        Object term659 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term661 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term659, term659.getClass(), "name", "");
        setField(term661, term661.getClass(), "name", null);
        setField(term661, term661.getClass(), "url", null);
        setField(term659, term659.getClass(), "language", term661);
        Object term662 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term664 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term662, term662.getClass(), "name", "");
        setField(term664, term664.getClass(), "name", null);
        setField(term664, term664.getClass(), "url", null);
        setField(term662, term662.getClass(), "language", term664);
        Object term665 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term667 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term665, term665.getClass(), "name", "");
        setField(term667, term667.getClass(), "name", null);
        setField(term667, term667.getClass(), "url", null);
        setField(term665, term665.getClass(), "language", term667);
        Object term668 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term670 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term668, term668.getClass(), "name", "");
        setField(term670, term670.getClass(), "name", null);
        setField(term670, term670.getClass(), "url", null);
        setField(term668, term668.getClass(), "language", term670);
        ArrayList term648 = new ArrayList();
        ((ArrayList) term648).add(term650);
        ((ArrayList) term648).add(term653);
        ((ArrayList) term648).add(term656);
        ((ArrayList) term648).add(term659);
        ((ArrayList) term648).add(term662);
        ((ArrayList) term648).add(term665);
        ((ArrayList) term648).add(term668);
        ArrayList term673 = new ArrayList();
        ArrayList term677 = new ArrayList();
        ArrayList term681 = new ArrayList();
        ArrayList term685 = new ArrayList();
        term629 = newInstance(Class.forName("skaro.pokeapi.resource.generation.Generation"));
        setField(term629, term629.getClass(), "id", term630);
        setField(term629, term629.getClass(), "name", "lHfTrWKMPk");
        setField(term629, term629.getClass(), "abilities", term644);
        setField(term629, term629.getClass(), "names", term648);
        setField(term629, term629.getClass(), "moves", term673);
        setField(term629, term629.getClass(), "pokemonSpecies", term677);
        setField(term629, term629.getClass(), "types", term681);
        setField(term629, term629.getClass(), "versionGroups", term685);
        Object term692 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term692, term692.getClass(), "name", "HzqpegHiRq");
        setField(term692, term692.getClass(), "url", "jwsfVjMoJT");
        Object term718 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term718, term718.getClass(), "name", "");
        setField(term718, term718.getClass(), "url", "");
        Object term722 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term722, term722.getClass(), "name", null);
        setField(term722, term722.getClass(), "url", null);
        term689 = new LinkedList();
        ((LinkedList) term689).add(term692);
        ((LinkedList) term689).add(term718);
        ((LinkedList) term689).add(term722);
        ((LinkedList) term689).add((Object)null);
        ((LinkedList) term689).add((Object)null);
        ((LinkedList) term689).add((Object)null);
        ((LinkedList) term689).add((Object)null);
        ((LinkedList) term689).add((Object)null);
        ((LinkedList) term689).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.generation.Generation");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term689;
        callMethod(klass, "setMoves", argTypes, term629, args);
    }

};


