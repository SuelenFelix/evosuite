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

public class VerboseEffect_setShortEffect_2132365624 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term134600;

    public VerboseEffect_setShortEffect_2132365624() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term134600 = newInstance(Class.forName("skaro.pokeapi.resource.VerboseEffect"));
        Object term134625 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term134600, term134600.getClass(), "effect", "hmHbpMyMBB");
        setField(term134600, term134600.getClass(), "shortEffect", "qoiRkEWTBz");
        setField(term134625, term134625.getClass(), "name", "WUCBulfLrJ");
        setField(term134625, term134625.getClass(), "url", "WdMZhnoBNg");
        setField(term134600, term134600.getClass(), "language", term134625);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.VerboseEffect");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "XEeljuMyXS";
        callMethod(klass, "setShortEffect", argTypes, term134600, args);
    }

};


