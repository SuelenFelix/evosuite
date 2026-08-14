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

public class VersionGroupFlavorText_setLanguage_15937202184 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term132060;
     Object term132123;

    public VersionGroupFlavorText_setLanguage_15937202184() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term132060 = newInstance(Class.forName("skaro.pokeapi.resource.VersionGroupFlavorText"));
        Object term132073 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term132098 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term132060, term132060.getClass(), "text", "dLYBBSlMOV");
        setField(term132073, term132073.getClass(), "name", "bDvFnxvggm");
        setField(term132073, term132073.getClass(), "url", "rViGLXQUBs");
        setField(term132060, term132060.getClass(), "language", term132073);
        setField(term132098, term132098.getClass(), "name", "JiEGnMOCRo");
        setField(term132098, term132098.getClass(), "url", "qSgkugdLIe");
        setField(term132060, term132060.getClass(), "versionGroup", term132098);
        term132123 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term132123, term132123.getClass(), "name", "dqmIPkSuEB");
        setField(term132123, term132123.getClass(), "url", "DeGoaYPkEl");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.VersionGroupFlavorText");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("skaro.pokeapi.resource.NamedApiResource");
        Object[] args = new Object[1];
        args[0] = term132123;
        callMethod(klass, "setLanguage", argTypes, term132060, args);
    }

};


