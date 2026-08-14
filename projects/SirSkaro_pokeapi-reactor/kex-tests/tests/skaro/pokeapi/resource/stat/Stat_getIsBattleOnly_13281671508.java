package skaro.pokeapi.resource.stat;

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
import static skaro.pokeapi.resource.stat.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.Object;
import java.util.ArrayList;

public class Stat_getIsBattleOnly_13281671508 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1405;

    public Stat_getIsBattleOnly_13281671508() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1406 = new Integer(-1476117762);
        Integer term1420 = new Integer(-341962980);
        Boolean term1422 = new Boolean(true);
        ArrayList term1425 = new ArrayList();
        Integer term1432 = new Integer(1532716628);
        Object term1431 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        setField(term1431, term1431.getClass(), "change", term1432);
        setField(term1431, term1431.getClass(), "move", null);
        Integer term1435 = new Integer(-1801760683);
        Object term1434 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        setField(term1434, term1434.getClass(), "change", term1435);
        setField(term1434, term1434.getClass(), "move", null);
        ArrayList term1429 = new ArrayList();
        ((ArrayList) term1429).add(term1431);
        ((ArrayList) term1429).add(term1434);
        ArrayList term1440 = new ArrayList();
        ArrayList term1444 = new ArrayList();
        ArrayList term1448 = new ArrayList();
        Object term1479 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term1481 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1479, term1479.getClass(), "name", "");
        setField(term1481, term1481.getClass(), "name", null);
        setField(term1481, term1481.getClass(), "url", null);
        setField(term1479, term1479.getClass(), "language", term1481);
        Object term1482 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term1484 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1482, term1482.getClass(), "name", "");
        setField(term1484, term1484.getClass(), "name", null);
        setField(term1484, term1484.getClass(), "url", null);
        setField(term1482, term1482.getClass(), "language", term1484);
        Object term1485 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term1487 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1485, term1485.getClass(), "name", "");
        setField(term1487, term1487.getClass(), "name", null);
        setField(term1487, term1487.getClass(), "url", null);
        setField(term1485, term1485.getClass(), "language", term1487);
        Object term1488 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term1490 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1488, term1488.getClass(), "name", "");
        setField(term1490, term1490.getClass(), "name", null);
        setField(term1490, term1490.getClass(), "url", null);
        setField(term1488, term1488.getClass(), "language", term1490);
        Object term1491 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term1493 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1491, term1491.getClass(), "name", "");
        setField(term1493, term1493.getClass(), "name", null);
        setField(term1493, term1493.getClass(), "url", null);
        setField(term1491, term1491.getClass(), "language", term1493);
        Object term1494 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term1496 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1494, term1494.getClass(), "name", "");
        setField(term1496, term1496.getClass(), "name", null);
        setField(term1496, term1496.getClass(), "url", null);
        setField(term1494, term1494.getClass(), "language", term1496);
        Object term1497 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term1499 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1497, term1497.getClass(), "name", "");
        setField(term1499, term1499.getClass(), "name", null);
        setField(term1499, term1499.getClass(), "url", null);
        setField(term1497, term1497.getClass(), "language", term1499);
        ArrayList term1477 = new ArrayList();
        ((ArrayList) term1477).add(term1479);
        ((ArrayList) term1477).add(term1482);
        ((ArrayList) term1477).add(term1485);
        ((ArrayList) term1477).add(term1488);
        ((ArrayList) term1477).add(term1491);
        ((ArrayList) term1477).add(term1494);
        ((ArrayList) term1477).add(term1497);
        term1405 = newInstance(Class.forName("skaro.pokeapi.resource.stat.Stat"));
        Object term1424 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffectSets"));
        Object term1439 = newInstance(Class.forName("skaro.pokeapi.resource.stat.NatureStatAffectSets"));
        Object term1452 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1405, term1405.getClass(), "id", term1406);
        setField(term1405, term1405.getClass(), "name", "ypEdrstygY");
        setField(term1405, term1405.getClass(), "gameIndex", term1420);
        setField(term1405, term1405.getClass(), "isBattleOnly", term1422);
        setField(term1424, term1424.getClass(), "increase", term1425);
        setField(term1424, term1424.getClass(), "decrease", term1429);
        setField(term1405, term1405.getClass(), "affectingMoves", term1424);
        setField(term1439, term1439.getClass(), "increase", term1440);
        setField(term1439, term1439.getClass(), "decrease", term1444);
        setField(term1405, term1405.getClass(), "affectingNatures", term1439);
        setField(term1405, term1405.getClass(), "characteristics", term1448);
        setField(term1452, term1452.getClass(), "name", "beAMpkroCQ");
        setField(term1452, term1452.getClass(), "url", "uSUvKAyuvd");
        setField(term1405, term1405.getClass(), "moveDamageClass", term1452);
        setField(term1405, term1405.getClass(), "names", term1477);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.stat.Stat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getIsBattleOnly", argTypes, term1405, args);
    }

};


