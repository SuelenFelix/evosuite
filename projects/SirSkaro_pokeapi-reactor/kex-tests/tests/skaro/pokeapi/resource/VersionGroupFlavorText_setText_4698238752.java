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

public class VersionGroupFlavorText_setText_4698238752 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term131812;

    public VersionGroupFlavorText_setText_4698238752() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term131812 = newInstance(Class.forName("skaro.pokeapi.resource.VersionGroupFlavorText"));
        Object term131825 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term131850 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term131812, term131812.getClass(), "text", "tCtbghmxDD");
        setField(term131825, term131825.getClass(), "name", "mBPjGQMugX");
        setField(term131825, term131825.getClass(), "url", "KQzmlrrcHU");
        setField(term131812, term131812.getClass(), "language", term131825);
        setField(term131850, term131850.getClass(), "name", "DoanAlNCXF");
        setField(term131850, term131850.getClass(), "url", "MnzZwTEpUy");
        setField(term131812, term131812.getClass(), "versionGroup", term131850);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.VersionGroupFlavorText");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "OvjcjJnjiM";
        callMethod(klass, "setText", argTypes, term131812, args);
    }

};


