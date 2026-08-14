package skaro.pokeapi.resource.move;

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
import static skaro.pokeapi.resource.move.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;

public class ContestComboSets_setNormal_4696707202 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1811;
     Object term1830;

    public ContestComboSets_setNormal_4696707202() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1813 = new ArrayList();
        ArrayList term1817 = new ArrayList();
        ArrayList term1822 = new ArrayList();
        ArrayList term1826 = new ArrayList();
        term1811 = newInstance(Class.forName("skaro.pokeapi.resource.move.ContestComboSets"));
        Object term1812 = newInstance(Class.forName("skaro.pokeapi.resource.move.ContestComboDetail"));
        Object term1821 = newInstance(Class.forName("skaro.pokeapi.resource.move.ContestComboDetail"));
        setField(term1812, term1812.getClass(), "userBefore", term1813);
        setField(term1812, term1812.getClass(), "userAfter", term1817);
        setField(term1811, term1811.getClass(), "normal", term1812);
        setField(term1821, term1821.getClass(), "userBefore", term1822);
        setField(term1821, term1821.getClass(), "userAfter", term1826);
        setField(term1811, term1811.getClass(), "superb", term1821);
        ArrayList term1831 = new ArrayList();
        ArrayList term1835 = new ArrayList();
        term1830 = newInstance(Class.forName("skaro.pokeapi.resource.move.ContestComboDetail"));
        setField(term1830, term1830.getClass(), "userBefore", term1831);
        setField(term1830, term1830.getClass(), "userAfter", term1835);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.move.ContestComboSets");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("skaro.pokeapi.resource.move.ContestComboDetail");
        Object[] args = new Object[1];
        args[0] = term1830;
        callMethod(klass, "setNormal", argTypes, term1811, args);
    }

};


