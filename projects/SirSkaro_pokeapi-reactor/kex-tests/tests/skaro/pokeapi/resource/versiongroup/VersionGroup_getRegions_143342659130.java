package skaro.pokeapi.resource.versiongroup;

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
import static skaro.pokeapi.resource.versiongroup.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class VersionGroup_getRegions_143342659130 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1636;

    public VersionGroup_getRegions_143342659130() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1636 = newInstance(Class.forName("skaro.pokeapi.resource.versiongroup.VersionGroup"));
        setField(term1636, term1636.getClass(), "id", null);
        setField(term1636, term1636.getClass(), "name", null);
        setField(term1636, term1636.getClass(), "order", null);
        setField(term1636, term1636.getClass(), "generation", null);
        setField(term1636, term1636.getClass(), "moveLearnMethods", null);
        setField(term1636, term1636.getClass(), "pokedexes", null);
        setField(term1636, term1636.getClass(), "regions", null);
        setField(term1636, term1636.getClass(), "versions", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.versiongroup.VersionGroup");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRegions", argTypes, term1636, args);
    }

};


