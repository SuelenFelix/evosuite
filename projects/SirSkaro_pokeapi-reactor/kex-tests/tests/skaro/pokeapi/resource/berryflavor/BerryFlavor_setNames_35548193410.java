package skaro.pokeapi.resource.berryflavor;

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
import static skaro.pokeapi.resource.berryflavor.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.util.ArrayList;
import java.lang.Object;
import java.util.LinkedList;

public class BerryFlavor_setNames_35548193410 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1242;
     Object term1322;

    public BerryFlavor_setNames_35548193410() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1243 = new Integer(-157887805);
        Integer term1260 = new Integer(1876565163);
        Object term1259 = newInstance(Class.forName("skaro.pokeapi.resource.berryflavor.FlavorBerryMap"));
        Object term1262 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1259, term1259.getClass(), "potency", term1260);
        setField(term1262, term1262.getClass(), "name", null);
        setField(term1262, term1262.getClass(), "url", null);
        setField(term1259, term1259.getClass(), "berry", term1262);
        Integer term1264 = new Integer(-817164822);
        Object term1263 = newInstance(Class.forName("skaro.pokeapi.resource.berryflavor.FlavorBerryMap"));
        Object term1266 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1263, term1263.getClass(), "potency", term1264);
        setField(term1266, term1266.getClass(), "name", null);
        setField(term1266, term1266.getClass(), "url", null);
        setField(term1263, term1263.getClass(), "berry", term1266);
        Integer term1268 = new Integer(-1016503459);
        Object term1267 = newInstance(Class.forName("skaro.pokeapi.resource.berryflavor.FlavorBerryMap"));
        Object term1270 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1267, term1267.getClass(), "potency", term1268);
        setField(term1270, term1270.getClass(), "name", null);
        setField(term1270, term1270.getClass(), "url", null);
        setField(term1267, term1267.getClass(), "berry", term1270);
        Integer term1272 = new Integer(-1968847291);
        Object term1271 = newInstance(Class.forName("skaro.pokeapi.resource.berryflavor.FlavorBerryMap"));
        Object term1274 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1271, term1271.getClass(), "potency", term1272);
        setField(term1274, term1274.getClass(), "name", null);
        setField(term1274, term1274.getClass(), "url", null);
        setField(term1271, term1271.getClass(), "berry", term1274);
        Integer term1276 = new Integer(579005622);
        Object term1275 = newInstance(Class.forName("skaro.pokeapi.resource.berryflavor.FlavorBerryMap"));
        Object term1278 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1275, term1275.getClass(), "potency", term1276);
        setField(term1278, term1278.getClass(), "name", null);
        setField(term1278, term1278.getClass(), "url", null);
        setField(term1275, term1275.getClass(), "berry", term1278);
        ArrayList term1257 = new ArrayList();
        ((ArrayList) term1257).add(term1259);
        ((ArrayList) term1257).add(term1263);
        ((ArrayList) term1257).add(term1267);
        ((ArrayList) term1257).add(term1271);
        ((ArrayList) term1257).add(term1275);
        Object term1308 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term1310 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1308, term1308.getClass(), "name", "");
        setField(term1310, term1310.getClass(), "name", null);
        setField(term1310, term1310.getClass(), "url", null);
        setField(term1308, term1308.getClass(), "language", term1310);
        Object term1311 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term1313 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1311, term1311.getClass(), "name", "");
        setField(term1313, term1313.getClass(), "name", null);
        setField(term1313, term1313.getClass(), "url", null);
        setField(term1311, term1311.getClass(), "language", term1313);
        Object term1314 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term1316 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1314, term1314.getClass(), "name", "");
        setField(term1316, term1316.getClass(), "name", null);
        setField(term1316, term1316.getClass(), "url", null);
        setField(term1314, term1314.getClass(), "language", term1316);
        Object term1317 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term1319 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1317, term1317.getClass(), "name", "");
        setField(term1319, term1319.getClass(), "name", null);
        setField(term1319, term1319.getClass(), "url", null);
        setField(term1317, term1317.getClass(), "language", term1319);
        ArrayList term1306 = new ArrayList();
        ((ArrayList) term1306).add(term1308);
        ((ArrayList) term1306).add(term1311);
        ((ArrayList) term1306).add(term1314);
        ((ArrayList) term1306).add(term1317);
        term1242 = newInstance(Class.forName("skaro.pokeapi.resource.berryflavor.BerryFlavor"));
        Object term1281 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1242, term1242.getClass(), "id", term1243);
        setField(term1242, term1242.getClass(), "name", "hOncybyCAH");
        setField(term1242, term1242.getClass(), "barries", term1257);
        setField(term1281, term1281.getClass(), "name", "OIHoJeysUi");
        setField(term1281, term1281.getClass(), "url", "WXMWFDGcLB");
        setField(term1242, term1242.getClass(), "contestType", term1281);
        setField(term1242, term1242.getClass(), "names", term1306);
        Object term1325 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term1338 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1325, term1325.getClass(), "name", "XfRABIFVEp");
        setField(term1338, term1338.getClass(), "name", "");
        setField(term1338, term1338.getClass(), "url", "");
        setField(term1325, term1325.getClass(), "language", term1338);
        Object term1342 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term1344 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1342, term1342.getClass(), "name", "");
        setField(term1344, term1344.getClass(), "name", null);
        setField(term1344, term1344.getClass(), "url", null);
        setField(term1342, term1342.getClass(), "language", term1344);
        Object term1346 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        setField(term1346, term1346.getClass(), "name", null);
        setField(term1346, term1346.getClass(), "language", null);
        term1322 = new LinkedList();
        ((LinkedList) term1322).add(term1325);
        ((LinkedList) term1322).add(term1342);
        ((LinkedList) term1322).add(term1346);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.berryflavor.BerryFlavor");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term1322;
        callMethod(klass, "setNames", argTypes, term1242, args);
    }

};


