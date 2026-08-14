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
import java.lang.Integer;
import java.util.ArrayList;
import java.lang.Object;

public class Version_getNames_2530052565 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term369;

    public Version_getNames_2530052565() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term370 = new Integer(-616727354);
        Object term386 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term388 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term386, term386.getClass(), "name", "");
        setField(term388, term388.getClass(), "name", null);
        setField(term388, term388.getClass(), "url", null);
        setField(term386, term386.getClass(), "language", term388);
        ArrayList term384 = new ArrayList();
        ((ArrayList) term384).add(term386);
        term369 = newInstance(Class.forName("skaro.pokeapi.resource.version.Version"));
        Object term391 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term369, term369.getClass(), "id", term370);
        setField(term369, term369.getClass(), "name", "dEnhdmILtU");
        setField(term369, term369.getClass(), "names", term384);
        setField(term391, term391.getClass(), "name", "uWHnvSvaPl");
        setField(term391, term391.getClass(), "url", "kBdSllIBVz");
        setField(term369, term369.getClass(), "versionGroup", term391);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.version.Version");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNames", argTypes, term369, args);
    }

};


