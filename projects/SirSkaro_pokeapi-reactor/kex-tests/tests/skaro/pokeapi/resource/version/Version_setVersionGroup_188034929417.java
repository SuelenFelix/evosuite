package skaro.pokeapi.resource.version;

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
import static skaro.pokeapi.resource.version.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Version_setVersionGroup_188034929417 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term819;

    public Version_setVersionGroup_188034929417() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term819 = newInstance(Class.forName("skaro.pokeapi.resource.version.Version"));
        setField(term819, term819.getClass(), "id", null);
        setField(term819, term819.getClass(), "name", null);
        setField(term819, term819.getClass(), "names", null);
        setField(term819, term819.getClass(), "versionGroup", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.version.Version");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("skaro.pokeapi.resource.NamedApiResource");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setVersionGroup", argTypes, term819, args);
    }

};


