package strategies;

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
import static strategies.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.String;

public class DualMovingAverageCrossoverStrategy_run_74941562 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1213;

    public DualMovingAverageCrossoverStrategy_run_74941562() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1230 = new ArrayList();
        Class<? extends Object> term1315 = Class.forName((String) "strategies.Position$PositionType");
        Field term1314 = ((Class) term1315).getDeclaredField((String) "SHORT");
        ((Field) term1314).setAccessible(true);
        Object enum3 = ((Field) term1314).get((Object) null);
        Object term1228 = newInstance(Class.forName("strategies.Position"));
        Object term1229 = newInstance(Class.forName("java.time.format.DateTimeFormatter"));
        Object term1239 = newInstance(Class.forName("java.time.Instant"));
        Object term1242 = newInstance(Class.forName("java.time.Instant"));
        setField(term1229, term1229.getClass(), "printerParser", null);
        setField(term1229, term1229.getClass(), "locale", null);
        setField(term1229, term1229.getClass(), "decimalStyle", null);
        setField(term1229, term1229.getClass(), "resolverStyle", null);
        setField(term1229, term1229.getClass(), "resolverFields", null);
        setField(term1229, term1229.getClass(), "chrono", null);
        setField(term1229, term1229.getClass(), "zone", null);
        setField(term1228, term1228.getClass(), "formatter", term1229);
        setField(term1228, term1228.getClass(), "signals", term1230);
        setField(term1228, term1228.getClass(), "pt", enum3);
        setField(term1228, term1228.getClass(), "sId", "");
        setIntField(term1228, term1228.getClass(), "initVolume", -1456670397);
        setIntField(term1228, term1228.getClass(), "currVolume", 1622346318);
        setDoubleField(term1228, term1228.getClass(), "pr", 0.8598297828918529);
        setLongField(term1239, term1239.getClass(), "seconds", 1645834034L);
        setIntField(term1239, term1239.getClass(), "nanos", 896000000);
        setField(term1228, term1228.getClass(), "openInst", term1239);
        setLongField(term1242, term1242.getClass(), "seconds", 1500721068L);
        setIntField(term1242, term1242.getClass(), "nanos", 23000000);
        setField(term1228, term1228.getClass(), "closeInst", term1242);
        setBooleanField(term1228, term1228.getClass(), "open", true);
        setDoubleField(term1228, term1228.getClass(), "currWinLoss", 0.43692187681405226);
        setField(term1228, term1228.getClass(), "uuid", "");
        ArrayList term1250 = new ArrayList();
        Object term1248 = newInstance(Class.forName("strategies.Position"));
        Object term1249 = newInstance(Class.forName("java.time.format.DateTimeFormatter"));
        Object term1257 = newInstance(Class.forName("java.time.Instant"));
        Object term1260 = newInstance(Class.forName("java.time.Instant"));
        setField(term1249, term1249.getClass(), "printerParser", null);
        setField(term1249, term1249.getClass(), "locale", null);
        setField(term1249, term1249.getClass(), "decimalStyle", null);
        setField(term1249, term1249.getClass(), "resolverStyle", null);
        setField(term1249, term1249.getClass(), "resolverFields", null);
        setField(term1249, term1249.getClass(), "chrono", null);
        setField(term1249, term1249.getClass(), "zone", null);
        setField(term1248, term1248.getClass(), "formatter", term1249);
        setField(term1248, term1248.getClass(), "signals", term1250);
        setField(term1248, term1248.getClass(), "pt", enum3);
        setField(term1248, term1248.getClass(), "sId", "");
        setIntField(term1248, term1248.getClass(), "initVolume", 1048535127);
        setIntField(term1248, term1248.getClass(), "currVolume", -655067527);
        setDoubleField(term1248, term1248.getClass(), "pr", 0.7633268466829064);
        setLongField(term1257, term1257.getClass(), "seconds", 1797203628L);
        setIntField(term1257, term1257.getClass(), "nanos", 25000000);
        setField(term1248, term1248.getClass(), "openInst", term1257);
        setLongField(term1260, term1260.getClass(), "seconds", 1589457921L);
        setIntField(term1260, term1260.getClass(), "nanos", 30000000);
        setField(term1248, term1248.getClass(), "closeInst", term1260);
        setBooleanField(term1248, term1248.getClass(), "open", true);
        setDoubleField(term1248, term1248.getClass(), "currWinLoss", 0.13481025392611334);
        setField(term1248, term1248.getClass(), "uuid", "");
        ArrayList term1268 = new ArrayList();
        Object term1266 = newInstance(Class.forName("strategies.Position"));
        Object term1267 = newInstance(Class.forName("java.time.format.DateTimeFormatter"));
        Object term1275 = newInstance(Class.forName("java.time.Instant"));
        Object term1278 = newInstance(Class.forName("java.time.Instant"));
        setField(term1267, term1267.getClass(), "printerParser", null);
        setField(term1267, term1267.getClass(), "locale", null);
        setField(term1267, term1267.getClass(), "decimalStyle", null);
        setField(term1267, term1267.getClass(), "resolverStyle", null);
        setField(term1267, term1267.getClass(), "resolverFields", null);
        setField(term1267, term1267.getClass(), "chrono", null);
        setField(term1267, term1267.getClass(), "zone", null);
        setField(term1266, term1266.getClass(), "formatter", term1267);
        setField(term1266, term1266.getClass(), "signals", term1268);
        setField(term1266, term1266.getClass(), "pt", enum3);
        setField(term1266, term1266.getClass(), "sId", "");
        setIntField(term1266, term1266.getClass(), "initVolume", -6029667);
        setIntField(term1266, term1266.getClass(), "currVolume", -2068769794);
        setDoubleField(term1266, term1266.getClass(), "pr", 0.3800088629986428);
        setLongField(term1275, term1275.getClass(), "seconds", 1745462962L);
        setIntField(term1275, term1275.getClass(), "nanos", 80000000);
        setField(term1266, term1266.getClass(), "openInst", term1275);
        setLongField(term1278, term1278.getClass(), "seconds", 1349069753L);
        setIntField(term1278, term1278.getClass(), "nanos", 960000000);
        setField(term1266, term1266.getClass(), "closeInst", term1278);
        setBooleanField(term1266, term1266.getClass(), "open", true);
        setDoubleField(term1266, term1266.getClass(), "currWinLoss", 0.5840714198152577);
        setField(term1266, term1266.getClass(), "uuid", "");
        ArrayList term1286 = new ArrayList();
        Object term1284 = newInstance(Class.forName("strategies.Position"));
        Object term1285 = newInstance(Class.forName("java.time.format.DateTimeFormatter"));
        Object term1293 = newInstance(Class.forName("java.time.Instant"));
        Object term1296 = newInstance(Class.forName("java.time.Instant"));
        setField(term1285, term1285.getClass(), "printerParser", null);
        setField(term1285, term1285.getClass(), "locale", null);
        setField(term1285, term1285.getClass(), "decimalStyle", null);
        setField(term1285, term1285.getClass(), "resolverStyle", null);
        setField(term1285, term1285.getClass(), "resolverFields", null);
        setField(term1285, term1285.getClass(), "chrono", null);
        setField(term1285, term1285.getClass(), "zone", null);
        setField(term1284, term1284.getClass(), "formatter", term1285);
        setField(term1284, term1284.getClass(), "signals", term1286);
        setField(term1284, term1284.getClass(), "pt", enum3);
        setField(term1284, term1284.getClass(), "sId", "");
        setIntField(term1284, term1284.getClass(), "initVolume", -117576464);
        setIntField(term1284, term1284.getClass(), "currVolume", -1007160944);
        setDoubleField(term1284, term1284.getClass(), "pr", 0.7559240768573477);
        setLongField(term1293, term1293.getClass(), "seconds", 1706078172L);
        setIntField(term1293, term1293.getClass(), "nanos", 457000000);
        setField(term1284, term1284.getClass(), "openInst", term1293);
        setLongField(term1296, term1296.getClass(), "seconds", 1863631094L);
        setIntField(term1296, term1296.getClass(), "nanos", 992000000);
        setField(term1284, term1284.getClass(), "closeInst", term1296);
        setBooleanField(term1284, term1284.getClass(), "open", true);
        setDoubleField(term1284, term1284.getClass(), "currWinLoss", 0.10667076642995188);
        setField(term1284, term1284.getClass(), "uuid", "");
        ArrayList term1226 = new ArrayList();
        ((ArrayList) term1226).add(term1228);
        ((ArrayList) term1226).add(term1248);
        ((ArrayList) term1226).add(term1266);
        ((ArrayList) term1226).add(term1284);
        term1213 = newInstance(Class.forName("strategies.DualMovingAverageCrossoverStrategy"));
        setField(term1213, term1213.getClass(), "itsRef", null);
        setField(term1213, term1213.getClass(), "stma", null);
        setField(term1213, term1213.getClass(), "ltma", null);
        setField(term1213, term1213.getClass(), "source", "tbcdzjIfER");
        setField(term1213, term1213.getClass(), "positions", term1226);
        setField(term1213, term1213.getClass(), "positionSizing", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("strategies.DualMovingAverageCrossoverStrategy");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "run", argTypes, term1213, args);
    }

};


