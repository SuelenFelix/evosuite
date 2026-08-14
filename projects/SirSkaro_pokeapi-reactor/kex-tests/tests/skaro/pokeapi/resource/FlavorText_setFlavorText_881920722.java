package skaro.pokeapi.resource;

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
import static skaro.pokeapi.resource.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class FlavorText_setFlavorText_881920722 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15040;

    public FlavorText_setFlavorText_881920722() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15040 = newInstance(Class.forName("skaro.pokeapi.resource.FlavorText"));
        Object term15053 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term15078 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term15040, term15040.getClass(), "flavorText", "tMDFwEQAGW");
        setField(term15053, term15053.getClass(), "name", "heAByNySVP");
        setField(term15053, term15053.getClass(), "url", "gPuVkQobYQ");
        setField(term15040, term15040.getClass(), "language", term15053);
        setField(term15078, term15078.getClass(), "name", "sAHDMENVSp");
        setField(term15078, term15078.getClass(), "url", "oLoxfeWIGH");
        setField(term15040, term15040.getClass(), "version", term15078);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.FlavorText");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "vdErTHSsJu";
        callMethod(klass, "setFlavorText", argTypes, term15040, args);
    }

};


