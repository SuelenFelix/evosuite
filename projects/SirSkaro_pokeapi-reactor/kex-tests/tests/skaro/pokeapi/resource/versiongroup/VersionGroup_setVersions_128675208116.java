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
import java.util.LinkedList;

public class VersionGroup_setVersions_128675208116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1480;
     Object term1538;

    public VersionGroup_setVersions_128675208116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1481 = new Integer(-73683645);
        Integer term1495 = new Integer(-226514366);
        ArrayList term1522 = new ArrayList();
        ArrayList term1526 = new ArrayList();
        ArrayList term1530 = new ArrayList();
        ArrayList term1534 = new ArrayList();
        term1480 = newInstance(Class.forName("skaro.pokeapi.resource.versiongroup.VersionGroup"));
        Object term1497 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1480, term1480.getClass(), "id", term1481);
        setField(term1480, term1480.getClass(), "name", "whBvTVIIlC");
        setField(term1480, term1480.getClass(), "order", term1495);
        setField(term1497, term1497.getClass(), "name", "IgRJUzaCwW");
        setField(term1497, term1497.getClass(), "url", "JUmudUmaaV");
        setField(term1480, term1480.getClass(), "generation", term1497);
        setField(term1480, term1480.getClass(), "moveLearnMethods", term1522);
        setField(term1480, term1480.getClass(), "pokedexes", term1526);
        setField(term1480, term1480.getClass(), "regions", term1530);
        setField(term1480, term1480.getClass(), "versions", term1534);
        Object term1541 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1541, term1541.getClass(), "name", "MAcUBcBckh");
        setField(term1541, term1541.getClass(), "url", "oVgzLbrsFr");
        Object term1567 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1567, term1567.getClass(), "name", "");
        setField(term1567, term1567.getClass(), "url", "");
        Object term1571 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1571, term1571.getClass(), "name", null);
        setField(term1571, term1571.getClass(), "url", null);
        term1538 = new LinkedList();
        ((LinkedList) term1538).add(term1541);
        ((LinkedList) term1538).add(term1567);
        ((LinkedList) term1538).add(term1571);
        ((LinkedList) term1538).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.versiongroup.VersionGroup");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term1538;
        callMethod(klass, "setVersions", argTypes, term1480, args);
    }

};


