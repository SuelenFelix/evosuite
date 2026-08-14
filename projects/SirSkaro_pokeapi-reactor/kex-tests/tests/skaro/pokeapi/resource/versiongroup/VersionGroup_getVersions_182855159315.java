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
import java.lang.Integer;
import java.lang.Object;
import java.util.ArrayList;

public class VersionGroup_getVersions_182855159315 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1392;

    public VersionGroup_getVersions_182855159315() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1393 = new Integer(-203030934);
        Integer term1407 = new Integer(-1179120542);
        ArrayList term1434 = new ArrayList();
        ArrayList term1438 = new ArrayList();
        ArrayList term1442 = new ArrayList();
        ArrayList term1446 = new ArrayList();
        term1392 = newInstance(Class.forName("skaro.pokeapi.resource.versiongroup.VersionGroup"));
        Object term1409 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1392, term1392.getClass(), "id", term1393);
        setField(term1392, term1392.getClass(), "name", "TJmVBGfTML");
        setField(term1392, term1392.getClass(), "order", term1407);
        setField(term1409, term1409.getClass(), "name", "tPlsykYBqO");
        setField(term1409, term1409.getClass(), "url", "bLPjGVBhlX");
        setField(term1392, term1392.getClass(), "generation", term1409);
        setField(term1392, term1392.getClass(), "moveLearnMethods", term1434);
        setField(term1392, term1392.getClass(), "pokedexes", term1438);
        setField(term1392, term1392.getClass(), "regions", term1442);
        setField(term1392, term1392.getClass(), "versions", term1446);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.versiongroup.VersionGroup");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getVersions", argTypes, term1392, args);
    }

};


