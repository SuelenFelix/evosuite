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

public class ContestComboSets_getSuperb_3029904603 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1839;

    public ContestComboSets_getSuperb_3029904603() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1841 = new ArrayList();
        ArrayList term1845 = new ArrayList();
        ArrayList term1850 = new ArrayList();
        ArrayList term1854 = new ArrayList();
        term1839 = newInstance(Class.forName("skaro.pokeapi.resource.move.ContestComboSets"));
        Object term1840 = newInstance(Class.forName("skaro.pokeapi.resource.move.ContestComboDetail"));
        Object term1849 = newInstance(Class.forName("skaro.pokeapi.resource.move.ContestComboDetail"));
        setField(term1840, term1840.getClass(), "userBefore", term1841);
        setField(term1840, term1840.getClass(), "userAfter", term1845);
        setField(term1839, term1839.getClass(), "normal", term1840);
        setField(term1849, term1849.getClass(), "userBefore", term1850);
        setField(term1849, term1849.getClass(), "userAfter", term1854);
        setField(term1839, term1839.getClass(), "superb", term1849);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.move.ContestComboSets");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSuperb", argTypes, term1839, args);
    }

};


