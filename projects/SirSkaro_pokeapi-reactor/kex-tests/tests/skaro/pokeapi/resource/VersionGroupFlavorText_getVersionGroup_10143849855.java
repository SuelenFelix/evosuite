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

public class VersionGroupFlavorText_getVersionGroup_10143849855 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term132218;

    public VersionGroupFlavorText_getVersionGroup_10143849855() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term132218 = newInstance(Class.forName("skaro.pokeapi.resource.VersionGroupFlavorText"));
        Object term132231 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term132256 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term132218, term132218.getClass(), "text", "nAjksCnUef");
        setField(term132231, term132231.getClass(), "name", "iltnxYkCZH");
        setField(term132231, term132231.getClass(), "url", "EGnGCdEjaM");
        setField(term132218, term132218.getClass(), "language", term132231);
        setField(term132256, term132256.getClass(), "name", "JfpSzteqyn");
        setField(term132256, term132256.getClass(), "url", "xgUdESFOIg");
        setField(term132218, term132218.getClass(), "versionGroup", term132256);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.VersionGroupFlavorText");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getVersionGroup", argTypes, term132218, args);
    }

};


