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

public class VersionGroupFlavorText_getLanguage_4122969383 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term131947;

    public VersionGroupFlavorText_getLanguage_4122969383() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term131947 = newInstance(Class.forName("skaro.pokeapi.resource.VersionGroupFlavorText"));
        Object term131960 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term131985 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term131947, term131947.getClass(), "text", "csmhCQJfzH");
        setField(term131960, term131960.getClass(), "name", "bkRYIsgLhM");
        setField(term131960, term131960.getClass(), "url", "hRRsUvvCEJ");
        setField(term131947, term131947.getClass(), "language", term131960);
        setField(term131985, term131985.getClass(), "name", "soFTyJVZSV");
        setField(term131985, term131985.getClass(), "url", "csgQmxagry");
        setField(term131947, term131947.getClass(), "versionGroup", term131985);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.VersionGroupFlavorText");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLanguage", argTypes, term131947, args);
    }

};


