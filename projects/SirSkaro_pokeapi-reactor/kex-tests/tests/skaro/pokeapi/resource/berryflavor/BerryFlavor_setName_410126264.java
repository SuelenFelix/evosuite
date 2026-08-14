package skaro.pokeapi.resource.berryflavor;

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
import static skaro.pokeapi.resource.berryflavor.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.util.ArrayList;
import java.lang.Object;

public class BerryFlavor_setName_410126264 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term558;

    public BerryFlavor_setName_410126264() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term559 = new Integer(1622346318);
        Integer term576 = new Integer(1048535127);
        Object term575 = newInstance(Class.forName("skaro.pokeapi.resource.berryflavor.FlavorBerryMap"));
        Object term578 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term575, term575.getClass(), "potency", term576);
        setField(term578, term578.getClass(), "name", null);
        setField(term578, term578.getClass(), "url", null);
        setField(term575, term575.getClass(), "berry", term578);
        Integer term580 = new Integer(-655067527);
        Object term579 = newInstance(Class.forName("skaro.pokeapi.resource.berryflavor.FlavorBerryMap"));
        Object term582 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term579, term579.getClass(), "potency", term580);
        setField(term582, term582.getClass(), "name", null);
        setField(term582, term582.getClass(), "url", null);
        setField(term579, term579.getClass(), "berry", term582);
        ArrayList term573 = new ArrayList();
        ((ArrayList) term573).add(term575);
        ((ArrayList) term573).add(term579);
        Object term612 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term614 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term612, term612.getClass(), "name", "");
        setField(term614, term614.getClass(), "name", null);
        setField(term614, term614.getClass(), "url", null);
        setField(term612, term612.getClass(), "language", term614);
        Object term615 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term617 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term615, term615.getClass(), "name", "");
        setField(term617, term617.getClass(), "name", null);
        setField(term617, term617.getClass(), "url", null);
        setField(term615, term615.getClass(), "language", term617);
        Object term618 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term620 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term618, term618.getClass(), "name", "");
        setField(term620, term620.getClass(), "name", null);
        setField(term620, term620.getClass(), "url", null);
        setField(term618, term618.getClass(), "language", term620);
        Object term621 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term623 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term621, term621.getClass(), "name", "");
        setField(term623, term623.getClass(), "name", null);
        setField(term623, term623.getClass(), "url", null);
        setField(term621, term621.getClass(), "language", term623);
        Object term624 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term626 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term624, term624.getClass(), "name", "");
        setField(term626, term626.getClass(), "name", null);
        setField(term626, term626.getClass(), "url", null);
        setField(term624, term624.getClass(), "language", term626);
        Object term627 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term629 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term627, term627.getClass(), "name", "");
        setField(term629, term629.getClass(), "name", null);
        setField(term629, term629.getClass(), "url", null);
        setField(term627, term627.getClass(), "language", term629);
        ArrayList term610 = new ArrayList();
        ((ArrayList) term610).add(term612);
        ((ArrayList) term610).add(term615);
        ((ArrayList) term610).add(term618);
        ((ArrayList) term610).add(term621);
        ((ArrayList) term610).add(term624);
        ((ArrayList) term610).add(term627);
        term558 = newInstance(Class.forName("skaro.pokeapi.resource.berryflavor.BerryFlavor"));
        Object term585 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term558, term558.getClass(), "id", term559);
        setField(term558, term558.getClass(), "name", "VgZnGoIFwQ");
        setField(term558, term558.getClass(), "barries", term573);
        setField(term585, term585.getClass(), "name", "PHvxnGHptP");
        setField(term585, term585.getClass(), "url", "TimdotUuNC");
        setField(term558, term558.getClass(), "contestType", term585);
        setField(term558, term558.getClass(), "names", term610);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.berryflavor.BerryFlavor");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "xBsXSDjXYK";
        callMethod(klass, "setName", argTypes, term558, args);
    }

};


