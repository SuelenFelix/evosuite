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

public class VersionGroup_setMoveLearnMethods_49876949127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1633;

    public VersionGroup_setMoveLearnMethods_49876949127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1633 = newInstance(Class.forName("skaro.pokeapi.resource.versiongroup.VersionGroup"));
        setField(term1633, term1633.getClass(), "id", null);
        setField(term1633, term1633.getClass(), "name", null);
        setField(term1633, term1633.getClass(), "order", null);
        setField(term1633, term1633.getClass(), "generation", null);
        setField(term1633, term1633.getClass(), "moveLearnMethods", null);
        setField(term1633, term1633.getClass(), "pokedexes", null);
        setField(term1633, term1633.getClass(), "regions", null);
        setField(term1633, term1633.getClass(), "versions", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.versiongroup.VersionGroup");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setMoveLearnMethods", argTypes, term1633, args);
    }

};


