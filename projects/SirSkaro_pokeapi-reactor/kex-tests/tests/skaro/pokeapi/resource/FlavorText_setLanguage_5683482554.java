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

public class FlavorText_setLanguage_5683482554 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15288;
     Object term15351;

    public FlavorText_setLanguage_5683482554() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15288 = newInstance(Class.forName("skaro.pokeapi.resource.FlavorText"));
        Object term15301 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term15326 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term15288, term15288.getClass(), "flavorText", "mDLwflwlja");
        setField(term15301, term15301.getClass(), "name", "RqkgPxDFnv");
        setField(term15301, term15301.getClass(), "url", "egaLajwFgY");
        setField(term15288, term15288.getClass(), "language", term15301);
        setField(term15326, term15326.getClass(), "name", "wUXTYOJezz");
        setField(term15326, term15326.getClass(), "url", "dovCZEmPER");
        setField(term15288, term15288.getClass(), "version", term15326);
        term15351 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term15351, term15351.getClass(), "name", "PbkTntqZDZ");
        setField(term15351, term15351.getClass(), "url", "yDWoqUswuW");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.FlavorText");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("skaro.pokeapi.resource.NamedApiResource");
        Object[] args = new Object[1];
        args[0] = term15351;
        callMethod(klass, "setLanguage", argTypes, term15288, args);
    }

};


