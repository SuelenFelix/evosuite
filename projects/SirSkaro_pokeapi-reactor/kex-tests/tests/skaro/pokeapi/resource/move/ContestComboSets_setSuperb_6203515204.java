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

public class ContestComboSets_setSuperb_6203515204 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1858;
     Object term1877;

    public ContestComboSets_setSuperb_6203515204() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1860 = new ArrayList();
        ArrayList term1864 = new ArrayList();
        ArrayList term1869 = new ArrayList();
        ArrayList term1873 = new ArrayList();
        term1858 = newInstance(Class.forName("skaro.pokeapi.resource.move.ContestComboSets"));
        Object term1859 = newInstance(Class.forName("skaro.pokeapi.resource.move.ContestComboDetail"));
        Object term1868 = newInstance(Class.forName("skaro.pokeapi.resource.move.ContestComboDetail"));
        setField(term1859, term1859.getClass(), "userBefore", term1860);
        setField(term1859, term1859.getClass(), "userAfter", term1864);
        setField(term1858, term1858.getClass(), "normal", term1859);
        setField(term1868, term1868.getClass(), "userBefore", term1869);
        setField(term1868, term1868.getClass(), "userAfter", term1873);
        setField(term1858, term1858.getClass(), "superb", term1868);
        ArrayList term1878 = new ArrayList();
        ArrayList term1882 = new ArrayList();
        term1877 = newInstance(Class.forName("skaro.pokeapi.resource.move.ContestComboDetail"));
        setField(term1877, term1877.getClass(), "userBefore", term1878);
        setField(term1877, term1877.getClass(), "userAfter", term1882);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.move.ContestComboSets");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("skaro.pokeapi.resource.move.ContestComboDetail");
        Object[] args = new Object[1];
        args[0] = term1877;
        callMethod(klass, "setSuperb", argTypes, term1858, args);
    }

};


