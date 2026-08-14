package skaro.pokeapi.resource.region;

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
import static skaro.pokeapi.resource.region.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.util.ArrayList;
import java.lang.Object;
import java.util.LinkedList;

public class Region_setVersionGroups_122717763614 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1380;
     Object term1451;

    public Region_setVersionGroups_122717763614() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1381 = new Integer(1585847225);
        ArrayList term1383 = new ArrayList();
        Object term1401 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term1403 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1401, term1401.getClass(), "name", "");
        setField(term1403, term1403.getClass(), "name", null);
        setField(term1403, term1403.getClass(), "url", null);
        setField(term1401, term1401.getClass(), "language", term1403);
        Object term1404 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term1406 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1404, term1404.getClass(), "name", "");
        setField(term1406, term1406.getClass(), "name", null);
        setField(term1406, term1406.getClass(), "url", null);
        setField(term1404, term1404.getClass(), "language", term1406);
        Object term1407 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term1409 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1407, term1407.getClass(), "name", "");
        setField(term1409, term1409.getClass(), "name", null);
        setField(term1409, term1409.getClass(), "url", null);
        setField(term1407, term1407.getClass(), "language", term1409);
        Object term1410 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term1412 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1410, term1410.getClass(), "name", "");
        setField(term1412, term1412.getClass(), "name", null);
        setField(term1412, term1412.getClass(), "url", null);
        setField(term1410, term1410.getClass(), "language", term1412);
        Object term1413 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term1415 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1413, term1413.getClass(), "name", "");
        setField(term1415, term1415.getClass(), "name", null);
        setField(term1415, term1415.getClass(), "url", null);
        setField(term1413, term1413.getClass(), "language", term1415);
        ArrayList term1399 = new ArrayList();
        ((ArrayList) term1399).add(term1401);
        ((ArrayList) term1399).add(term1404);
        ((ArrayList) term1399).add(term1407);
        ((ArrayList) term1399).add(term1410);
        ((ArrayList) term1399).add(term1413);
        ArrayList term1443 = new ArrayList();
        ArrayList term1447 = new ArrayList();
        term1380 = newInstance(Class.forName("skaro.pokeapi.resource.region.Region"));
        Object term1418 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1380, term1380.getClass(), "id", term1381);
        setField(term1380, term1380.getClass(), "locations", term1383);
        setField(term1380, term1380.getClass(), "name", "sZdUNdggUW");
        setField(term1380, term1380.getClass(), "names", term1399);
        setField(term1418, term1418.getClass(), "name", "AZdLeSugwv");
        setField(term1418, term1418.getClass(), "url", "RMsXuyzKJV");
        setField(term1380, term1380.getClass(), "mainGeneration", term1418);
        setField(term1380, term1380.getClass(), "pokedexes", term1443);
        setField(term1380, term1380.getClass(), "versionGroups", term1447);
        Object term1454 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1454, term1454.getClass(), "name", "QduALnDSVo");
        setField(term1454, term1454.getClass(), "url", "izPpKDErnQ");
        Object term1480 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1480, term1480.getClass(), "name", "");
        setField(term1480, term1480.getClass(), "url", "");
        term1451 = new LinkedList();
        ((LinkedList) term1451).add(term1454);
        ((LinkedList) term1451).add(term1480);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.region.Region");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term1451;
        callMethod(klass, "setVersionGroups", argTypes, term1380, args);
    }

};


