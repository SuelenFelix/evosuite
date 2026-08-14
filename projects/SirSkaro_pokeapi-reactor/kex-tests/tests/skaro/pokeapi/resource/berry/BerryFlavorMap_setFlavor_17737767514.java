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

public class BerryFlavorMap_setFlavor_17737767514 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4906;
     Object term4934;

    public BerryFlavorMap_setFlavor_17737767514() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term4907 = new Integer(2009020256);
        term4906 = newInstance(Class.forName("skaro.pokeapi.resource.berry.BerryFlavorMap"));
        Object term4909 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term4906, term4906.getClass(), "potency", term4907);
        setField(term4909, term4909.getClass(), "name", "BBXiTNHqGE");
        setField(term4909, term4909.getClass(), "url", "IEYhJmgCVd");
        setField(term4906, term4906.getClass(), "flavor", term4909);
        term4934 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term4934, term4934.getClass(), "name", "mGRiYhnMcR");
        setField(term4934, term4934.getClass(), "url", "NFlvfJCVPO");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.berry.BerryFlavorMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("skaro.pokeapi.resource.NamedApiResource");
        Object[] args = new Object[1];
        args[0] = term4934;
        callMethod(klass, "setFlavor", argTypes, term4906, args);
    }

};


