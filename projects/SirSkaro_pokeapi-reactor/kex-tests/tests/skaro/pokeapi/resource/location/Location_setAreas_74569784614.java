package skaro.pokeapi.resource.location;

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
import static skaro.pokeapi.resource.location.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;
import java.util.ArrayList;
import java.util.LinkedList;

public class Location_setAreas_74569784614 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1327;
     Object term1408;

    public Location_setAreas_74569784614() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1328 = new Integer(1225272962);
        Object term1369 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term1371 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1369, term1369.getClass(), "name", "");
        setField(term1371, term1371.getClass(), "name", null);
        setField(term1371, term1371.getClass(), "url", null);
        setField(term1369, term1369.getClass(), "language", term1371);
        Object term1372 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term1374 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1372, term1372.getClass(), "name", "");
        setField(term1374, term1374.getClass(), "name", null);
        setField(term1374, term1374.getClass(), "url", null);
        setField(term1372, term1372.getClass(), "language", term1374);
        Object term1375 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term1377 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1375, term1375.getClass(), "name", "");
        setField(term1377, term1377.getClass(), "name", null);
        setField(term1377, term1377.getClass(), "url", null);
        setField(term1375, term1375.getClass(), "language", term1377);
        ArrayList term1367 = new ArrayList();
        ((ArrayList) term1367).add(term1369);
        ((ArrayList) term1367).add(term1372);
        ((ArrayList) term1367).add(term1375);
        Integer term1383 = new Integer(1324040357);
        Object term1382 = newInstance(Class.forName("skaro.pokeapi.resource.GenerationGameIndex"));
        Object term1385 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1382, term1382.getClass(), "gameIndex", term1383);
        setField(term1385, term1385.getClass(), "name", null);
        setField(term1385, term1385.getClass(), "url", null);
        setField(term1382, term1382.getClass(), "generation", term1385);
        Integer term1387 = new Integer(-1588772968);
        Object term1386 = newInstance(Class.forName("skaro.pokeapi.resource.GenerationGameIndex"));
        Object term1389 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1386, term1386.getClass(), "gameIndex", term1387);
        setField(term1389, term1389.getClass(), "name", null);
        setField(term1389, term1389.getClass(), "url", null);
        setField(term1386, term1386.getClass(), "generation", term1389);
        Integer term1391 = new Integer(-93135961);
        Object term1390 = newInstance(Class.forName("skaro.pokeapi.resource.GenerationGameIndex"));
        Object term1393 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1390, term1390.getClass(), "gameIndex", term1391);
        setField(term1393, term1393.getClass(), "name", null);
        setField(term1393, term1393.getClass(), "url", null);
        setField(term1390, term1390.getClass(), "generation", term1393);
        Integer term1395 = new Integer(-112921587);
        Object term1394 = newInstance(Class.forName("skaro.pokeapi.resource.GenerationGameIndex"));
        Object term1397 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1394, term1394.getClass(), "gameIndex", term1395);
        setField(term1397, term1397.getClass(), "name", null);
        setField(term1397, term1397.getClass(), "url", null);
        setField(term1394, term1394.getClass(), "generation", term1397);
        Integer term1399 = new Integer(933028652);
        Object term1398 = newInstance(Class.forName("skaro.pokeapi.resource.GenerationGameIndex"));
        Object term1401 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1398, term1398.getClass(), "gameIndex", term1399);
        setField(term1401, term1401.getClass(), "name", null);
        setField(term1401, term1401.getClass(), "url", null);
        setField(term1398, term1398.getClass(), "generation", term1401);
        ArrayList term1380 = new ArrayList();
        ((ArrayList) term1380).add(term1382);
        ((ArrayList) term1380).add(term1386);
        ((ArrayList) term1380).add(term1390);
        ((ArrayList) term1380).add(term1394);
        ((ArrayList) term1380).add(term1398);
        ArrayList term1404 = new ArrayList();
        term1327 = newInstance(Class.forName("skaro.pokeapi.resource.location.Location"));
        Object term1342 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1327, term1327.getClass(), "id", term1328);
        setField(term1327, term1327.getClass(), "name", "WBAOTqErtm");
        setField(term1342, term1342.getClass(), "name", "PqtVXXZMqK");
        setField(term1342, term1342.getClass(), "url", "rYbtIDVdnd");
        setField(term1327, term1327.getClass(), "region", term1342);
        setField(term1327, term1327.getClass(), "names", term1367);
        setField(term1327, term1327.getClass(), "gameIndices", term1380);
        setField(term1327, term1327.getClass(), "areas", term1404);
        Object term1411 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1411, term1411.getClass(), "name", "SOrEHbcbmn");
        setField(term1411, term1411.getClass(), "url", "bnsyeQXFdu");
        Object term1437 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1437, term1437.getClass(), "name", "");
        setField(term1437, term1437.getClass(), "url", "");
        Object term1441 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1441, term1441.getClass(), "name", null);
        setField(term1441, term1441.getClass(), "url", null);
        term1408 = new LinkedList();
        ((LinkedList) term1408).add(term1411);
        ((LinkedList) term1408).add(term1437);
        ((LinkedList) term1408).add(term1441);
        ((LinkedList) term1408).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.location.Location");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term1408;
        callMethod(klass, "setAreas", argTypes, term1327, args);
    }

};


