package skaro.pokeapi.resource.contesttype;

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
import static skaro.pokeapi.resource.contesttype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;
import java.util.ArrayList;
import java.util.LinkedList;

public class ContestType_setNames_16534007308 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1323;
     Object term1391;

    public ContestType_setNames_16534007308() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1324 = new Integer(1227103734);
        Object term1365 = newInstance(Class.forName("skaro.pokeapi.resource.contesttype.ContestName"));
        Object term1368 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1365, term1365.getClass(), "name", "");
        setField(term1365, term1365.getClass(), "color", "");
        setField(term1368, term1368.getClass(), "name", null);
        setField(term1368, term1368.getClass(), "url", null);
        setField(term1365, term1365.getClass(), "language", term1368);
        Object term1369 = newInstance(Class.forName("skaro.pokeapi.resource.contesttype.ContestName"));
        Object term1372 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1369, term1369.getClass(), "name", "");
        setField(term1369, term1369.getClass(), "color", "");
        setField(term1372, term1372.getClass(), "name", null);
        setField(term1372, term1372.getClass(), "url", null);
        setField(term1369, term1369.getClass(), "language", term1372);
        Object term1373 = newInstance(Class.forName("skaro.pokeapi.resource.contesttype.ContestName"));
        Object term1376 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1373, term1373.getClass(), "name", "");
        setField(term1373, term1373.getClass(), "color", "");
        setField(term1376, term1376.getClass(), "name", null);
        setField(term1376, term1376.getClass(), "url", null);
        setField(term1373, term1373.getClass(), "language", term1376);
        Object term1377 = newInstance(Class.forName("skaro.pokeapi.resource.contesttype.ContestName"));
        Object term1380 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1377, term1377.getClass(), "name", "");
        setField(term1377, term1377.getClass(), "color", "");
        setField(term1380, term1380.getClass(), "name", null);
        setField(term1380, term1380.getClass(), "url", null);
        setField(term1377, term1377.getClass(), "language", term1380);
        Object term1381 = newInstance(Class.forName("skaro.pokeapi.resource.contesttype.ContestName"));
        Object term1384 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1381, term1381.getClass(), "name", "");
        setField(term1381, term1381.getClass(), "color", "");
        setField(term1384, term1384.getClass(), "name", null);
        setField(term1384, term1384.getClass(), "url", null);
        setField(term1381, term1381.getClass(), "language", term1384);
        Object term1385 = newInstance(Class.forName("skaro.pokeapi.resource.contesttype.ContestName"));
        Object term1388 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1385, term1385.getClass(), "name", "");
        setField(term1385, term1385.getClass(), "color", "");
        setField(term1388, term1388.getClass(), "name", null);
        setField(term1388, term1388.getClass(), "url", null);
        setField(term1385, term1385.getClass(), "language", term1388);
        ArrayList term1363 = new ArrayList();
        ((ArrayList) term1363).add(term1365);
        ((ArrayList) term1363).add(term1369);
        ((ArrayList) term1363).add(term1373);
        ((ArrayList) term1363).add(term1377);
        ((ArrayList) term1363).add(term1381);
        ((ArrayList) term1363).add(term1385);
        term1323 = newInstance(Class.forName("skaro.pokeapi.resource.contesttype.ContestType"));
        Object term1338 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1323, term1323.getClass(), "id", term1324);
        setField(term1323, term1323.getClass(), "name", "HHmNoYxIGj");
        setField(term1338, term1338.getClass(), "name", "PtirvZmsGt");
        setField(term1338, term1338.getClass(), "url", "HWkpTmtlrc");
        setField(term1323, term1323.getClass(), "berryFlavor", term1338);
        setField(term1323, term1323.getClass(), "names", term1363);
        term1391 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.contesttype.ContestType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term1391;
        callMethod(klass, "setNames", argTypes, term1323, args);
    }

};


