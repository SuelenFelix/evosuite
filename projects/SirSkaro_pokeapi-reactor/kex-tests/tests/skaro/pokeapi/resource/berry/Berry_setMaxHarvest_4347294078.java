package skaro.pokeapi.resource.berry;

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
import static skaro.pokeapi.resource.berry.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;
import java.util.ArrayList;

public class Berry_setMaxHarvest_4347294078 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1359;
     Object term1489;

    public Berry_setMaxHarvest_4347294078() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1360 = new Integer(-2027534003);
        Integer term1374 = new Integer(1063420942);
        Integer term1376 = new Integer(1375330971);
        Integer term1378 = new Integer(-478195677);
        Integer term1380 = new Integer(972867650);
        Integer term1382 = new Integer(1655935355);
        Integer term1384 = new Integer(-481533957);
        Integer term1414 = new Integer(1240914516);
        Object term1413 = newInstance(Class.forName("skaro.pokeapi.resource.berry.BerryFlavorMap"));
        Object term1416 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1413, term1413.getClass(), "potency", term1414);
        setField(term1416, term1416.getClass(), "name", null);
        setField(term1416, term1416.getClass(), "url", null);
        setField(term1413, term1413.getClass(), "flavor", term1416);
        Integer term1418 = new Integer(-1465035361);
        Object term1417 = newInstance(Class.forName("skaro.pokeapi.resource.berry.BerryFlavorMap"));
        Object term1420 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1417, term1417.getClass(), "potency", term1418);
        setField(term1420, term1420.getClass(), "name", null);
        setField(term1420, term1420.getClass(), "url", null);
        setField(term1417, term1417.getClass(), "flavor", term1420);
        Integer term1422 = new Integer(1090617576);
        Object term1421 = newInstance(Class.forName("skaro.pokeapi.resource.berry.BerryFlavorMap"));
        Object term1424 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1421, term1421.getClass(), "potency", term1422);
        setField(term1424, term1424.getClass(), "name", null);
        setField(term1424, term1424.getClass(), "url", null);
        setField(term1421, term1421.getClass(), "flavor", term1424);
        Integer term1426 = new Integer(-1547384488);
        Object term1425 = newInstance(Class.forName("skaro.pokeapi.resource.berry.BerryFlavorMap"));
        Object term1428 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1425, term1425.getClass(), "potency", term1426);
        setField(term1428, term1428.getClass(), "name", null);
        setField(term1428, term1428.getClass(), "url", null);
        setField(term1425, term1425.getClass(), "flavor", term1428);
        Integer term1430 = new Integer(1442160736);
        Object term1429 = newInstance(Class.forName("skaro.pokeapi.resource.berry.BerryFlavorMap"));
        Object term1432 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1429, term1429.getClass(), "potency", term1430);
        setField(term1432, term1432.getClass(), "name", null);
        setField(term1432, term1432.getClass(), "url", null);
        setField(term1429, term1429.getClass(), "flavor", term1432);
        Integer term1434 = new Integer(1114000454);
        Object term1433 = newInstance(Class.forName("skaro.pokeapi.resource.berry.BerryFlavorMap"));
        Object term1436 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1433, term1433.getClass(), "potency", term1434);
        setField(term1436, term1436.getClass(), "name", null);
        setField(term1436, term1436.getClass(), "url", null);
        setField(term1433, term1433.getClass(), "flavor", term1436);
        ArrayList term1411 = new ArrayList();
        ((ArrayList) term1411).add(term1413);
        ((ArrayList) term1411).add(term1417);
        ((ArrayList) term1411).add(term1421);
        ((ArrayList) term1411).add(term1425);
        ((ArrayList) term1411).add(term1429);
        ((ArrayList) term1411).add(term1433);
        term1359 = newInstance(Class.forName("skaro.pokeapi.resource.berry.Berry"));
        Object term1386 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term1439 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term1464 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1359, term1359.getClass(), "id", term1360);
        setField(term1359, term1359.getClass(), "name", "SPpkrGcPRr");
        setField(term1359, term1359.getClass(), "growthTime", term1374);
        setField(term1359, term1359.getClass(), "maxHarvest", term1376);
        setField(term1359, term1359.getClass(), "naturalGiftPower", term1378);
        setField(term1359, term1359.getClass(), "size", term1380);
        setField(term1359, term1359.getClass(), "smoothness", term1382);
        setField(term1359, term1359.getClass(), "soilDryness", term1384);
        setField(term1386, term1386.getClass(), "name", "sEccwbJKYE");
        setField(term1386, term1386.getClass(), "url", "AWRooQKkdW");
        setField(term1359, term1359.getClass(), "firmness", term1386);
        setField(term1359, term1359.getClass(), "flavors", term1411);
        setField(term1439, term1439.getClass(), "name", "MvRIxilFMJ");
        setField(term1439, term1439.getClass(), "url", "iNwOJRBEjp");
        setField(term1359, term1359.getClass(), "item", term1439);
        setField(term1464, term1464.getClass(), "name", "XylxrMBraH");
        setField(term1464, term1464.getClass(), "url", "pORebkoRdD");
        setField(term1359, term1359.getClass(), "naturalGiftType", term1464);
        term1489 = new Integer(-556405712);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.berry.Berry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term1489;
        callMethod(klass, "setMaxHarvest", argTypes, term1359, args);
    }

};


