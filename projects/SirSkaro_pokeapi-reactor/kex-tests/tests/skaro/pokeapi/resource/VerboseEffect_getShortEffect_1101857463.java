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

public class VerboseEffect_getShortEffect_1101857463 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term134510;

    public VerboseEffect_getShortEffect_1101857463() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term134510 = newInstance(Class.forName("skaro.pokeapi.resource.VerboseEffect"));
        Object term134535 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term134510, term134510.getClass(), "effect", "AJSnXggbdd");
        setField(term134510, term134510.getClass(), "shortEffect", "vEnYUdiwDw");
        setField(term134535, term134535.getClass(), "name", "DLdaubjuex");
        setField(term134535, term134535.getClass(), "url", "yuQtqVLgHK");
        setField(term134510, term134510.getClass(), "language", term134535);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.VerboseEffect");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getShortEffect", argTypes, term134510, args);
    }

};


