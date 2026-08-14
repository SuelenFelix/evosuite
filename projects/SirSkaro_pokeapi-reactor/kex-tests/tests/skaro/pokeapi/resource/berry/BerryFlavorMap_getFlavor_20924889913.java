package skaro.pokeapi.resource.berry;

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
import static skaro.pokeapi.resource.berry.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;

public class BerryFlavorMap_getFlavor_20924889913 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4858;

    public BerryFlavorMap_getFlavor_20924889913() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term4859 = new Integer(1745276158);
        term4858 = newInstance(Class.forName("skaro.pokeapi.resource.berry.BerryFlavorMap"));
        Object term4861 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term4858, term4858.getClass(), "potency", term4859);
        setField(term4861, term4861.getClass(), "name", "dtGZCsKXbW");
        setField(term4861, term4861.getClass(), "url", "bdyhHbDAmJ");
        setField(term4858, term4858.getClass(), "flavor", term4861);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.berry.BerryFlavorMap");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFlavor", argTypes, term4858, args);
    }

};


