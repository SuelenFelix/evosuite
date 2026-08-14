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

public class Stat_setGameIndex_21001788127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1260;
     Object term1373;

    public Stat_setGameIndex_21001788127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1261 = new Integer(-1034506028);
        Integer term1275 = new Integer(-1263114719);
        Boolean term1277 = new Boolean(true);
        Integer term1283 = new Integer(-894662986);
        Object term1282 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        setField(term1282, term1282.getClass(), "change", term1283);
        setField(term1282, term1282.getClass(), "move", null);
        Integer term1286 = new Integer(304775596);
        Object term1285 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        setField(term1285, term1285.getClass(), "change", term1286);
        setField(term1285, term1285.getClass(), "move", null);
        Integer term1289 = new Integer(-1347665717);
        Object term1288 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        setField(term1288, term1288.getClass(), "change", term1289);
        setField(term1288, term1288.getClass(), "move", null);
        Integer term1292 = new Integer(-1888585309);
        Object term1291 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        setField(term1291, term1291.getClass(), "change", term1292);
        setField(term1291, term1291.getClass(), "move", null);
        Integer term1295 = new Integer(683666002);
        Object term1294 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        setField(term1294, term1294.getClass(), "change", term1295);
        setField(term1294, term1294.getClass(), "move", null);
        Integer term1298 = new Integer(1596213415);
        Object term1297 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        setField(term1297, term1297.getClass(), "change", term1298);
        setField(term1297, term1297.getClass(), "move", null);
        Integer term1301 = new Integer(-268815336);
        Object term1300 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        setField(term1300, term1300.getClass(), "change", term1301);
        setField(term1300, term1300.getClass(), "move", null);
        Integer term1304 = new Integer(-1210583429);
        Object term1303 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        setField(term1303, term1303.getClass(), "change", term1304);
        setField(term1303, term1303.getClass(), "move", null);
        Integer term1307 = new Integer(-663691365);
        Object term1306 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        setField(term1306, term1306.getClass(), "change", term1307);
        setField(term1306, term1306.getClass(), "move", null);
        ArrayList term1280 = new ArrayList();
        ((ArrayList) term1280).add(term1282);
        ((ArrayList) term1280).add(term1285);
        ((ArrayList) term1280).add(term1288);
        ((ArrayList) term1280).add(term1291);
        ((ArrayList) term1280).add(term1294);
        ((ArrayList) term1280).add(term1297);
        ((ArrayList) term1280).add(term1300);
        ((ArrayList) term1280).add(term1303);
        ((ArrayList) term1280).add(term1306);
        Integer term1314 = new Integer(339854490);
        Object term1313 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        setField(term1313, term1313.getClass(), "change", term1314);
        setField(term1313, term1313.getClass(), "move", null);
        ArrayList term1311 = new ArrayList();
        ((ArrayList) term1311).add(term1313);
        ((ArrayList) term1311).add(term1303);
        ((ArrayList) term1311).add(term1306);
        ((ArrayList) term1311).add(term1282);
        ((ArrayList) term1311).add(term1297);
        ((ArrayList) term1311).add(term1291);
        ((ArrayList) term1311).add(term1285);
        ArrayList term1319 = new ArrayList();
        ArrayList term1323 = new ArrayList();
        ArrayList term1327 = new ArrayList();
        Object term1358 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term1360 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1358, term1358.getClass(), "name", "");
        setField(term1360, term1360.getClass(), "name", null);
        setField(term1360, term1360.getClass(), "url", null);
        setField(term1358, term1358.getClass(), "language", term1360);
        Object term1361 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term1363 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1361, term1361.getClass(), "name", "");
        setField(term1363, term1363.getClass(), "name", null);
        setField(term1363, term1363.getClass(), "url", null);
        setField(term1361, term1361.getClass(), "language", term1363);
        Object term1364 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        setField(term1364, term1364.getClass(), "name", "");
        setField(term1364, term1364.getClass(), "language", term1363);
        Object term1366 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term1368 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1366, term1366.getClass(), "name", "");
        setField(term1368, term1368.getClass(), "name", null);
        setField(term1368, term1368.getClass(), "url", null);
        setField(term1366, term1366.getClass(), "language", term1368);
        Object term1369 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        setField(term1369, term1369.getClass(), "name", "");
        setField(term1369, term1369.getClass(), "language", term1360);
        ArrayList term1356 = new ArrayList();
        ((ArrayList) term1356).add(term1358);
        ((ArrayList) term1356).add(term1361);
        ((ArrayList) term1356).add(term1364);
        ((ArrayList) term1356).add(term1366);
        ((ArrayList) term1356).add(term1369);
        term1260 = newInstance(Class.forName("skaro.pokeapi.resource.stat.Stat"));
        Object term1279 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffectSets"));
        Object term1318 = newInstance(Class.forName("skaro.pokeapi.resource.stat.NatureStatAffectSets"));
        Object term1331 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1260, term1260.getClass(), "id", term1261);
        setField(term1260, term1260.getClass(), "name", "HBGNxdNURv");
        setField(term1260, term1260.getClass(), "gameIndex", term1275);
        setField(term1260, term1260.getClass(), "isBattleOnly", term1277);
        setField(term1279, term1279.getClass(), "increase", term1280);
        setField(term1279, term1279.getClass(), "decrease", term1311);
        setField(term1260, term1260.getClass(), "affectingMoves", term1279);
        setField(term1318, term1318.getClass(), "increase", term1319);
        setField(term1318, term1318.getClass(), "decrease", term1323);
        setField(term1260, term1260.getClass(), "affectingNatures", term1318);
        setField(term1260, term1260.getClass(), "characteristics", term1327);
        setField(term1331, term1331.getClass(), "name", "XfRABIFVEp");
        setField(term1331, term1331.getClass(), "url", "MHGKyEnwKc");
        setField(term1260, term1260.getClass(), "moveDamageClass", term1331);
        setField(term1260, term1260.getClass(), "names", term1356);
        term1373 = new Integer(-615654495);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.stat.Stat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term1373;
        callMethod(klass, "setGameIndex", argTypes, term1260, args);
    }

};


