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

public class TripleMovingAverageCrossoverStrategy_run_1692115422 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16087;

    public TripleMovingAverageCrossoverStrategy_run_1692115422() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term16101 = new ArrayList();
        ArrayList term16109 = new ArrayList();
        Class<? extends Object> term16160 = Class.forName((String) "strategies.Position$PositionType");
        Field term16159 = ((Class) term16160).getDeclaredField((String) "SHORT");
        ((Field) term16159).setAccessible(true);
        Object enum51 = ((Field) term16159).get((Object) null);
        Object term16107 = newInstance(Class.forName("strategies.Position"));
        Object term16108 = newInstance(Class.forName("java.time.format.DateTimeFormatter"));
        Object term16118 = newInstance(Class.forName("java.time.Instant"));
        Object term16121 = newInstance(Class.forName("java.time.Instant"));
        setField(term16108, term16108.getClass(), "printerParser", null);
        setField(term16108, term16108.getClass(), "locale", null);
        setField(term16108, term16108.getClass(), "decimalStyle", null);
        setField(term16108, term16108.getClass(), "resolverStyle", null);
        setField(term16108, term16108.getClass(), "resolverFields", null);
        setField(term16108, term16108.getClass(), "chrono", null);
        setField(term16108, term16108.getClass(), "zone", null);
        setField(term16107, term16107.getClass(), "formatter", term16108);
        setField(term16107, term16107.getClass(), "signals", term16109);
        setField(term16107, term16107.getClass(), "pt", enum51);
        setField(term16107, term16107.getClass(), "sId", "");
        setIntField(term16107, term16107.getClass(), "initVolume", 34470066);
        setIntField(term16107, term16107.getClass(), "currVolume", 2058711405);
        setDoubleField(term16107, term16107.getClass(), "pr", 0.6037093070161561);
        setLongField(term16118, term16118.getClass(), "seconds", 1589746751L);
        setIntField(term16118, term16118.getClass(), "nanos", 309000000);
        setField(term16107, term16107.getClass(), "openInst", term16118);
        setLongField(term16121, term16121.getClass(), "seconds", 1291280367L);
        setIntField(term16121, term16121.getClass(), "nanos", 982000000);
        setField(term16107, term16107.getClass(), "closeInst", term16121);
        setBooleanField(term16107, term16107.getClass(), "open", true);
        setDoubleField(term16107, term16107.getClass(), "currWinLoss", 0.48050706663913145);
        setField(term16107, term16107.getClass(), "uuid", "");
        ArrayList term16129 = new ArrayList();
        Class<? extends Object> term16342 = Class.forName((String) "strategies.Position$PositionType");
        Field term16341 = ((Class) term16342).getDeclaredField((String) "SHORT");
        ((Field) term16341).setAccessible(true);
        Object enum52 = ((Field) term16341).get((Object) null);
        Object term16127 = newInstance(Class.forName("strategies.Position"));
        Object term16128 = newInstance(Class.forName("java.time.format.DateTimeFormatter"));
        Object term16138 = newInstance(Class.forName("java.time.Instant"));
        Object term16141 = newInstance(Class.forName("java.time.Instant"));
        setField(term16128, term16128.getClass(), "printerParser", null);
        setField(term16128, term16128.getClass(), "locale", null);
        setField(term16128, term16128.getClass(), "decimalStyle", null);
        setField(term16128, term16128.getClass(), "resolverStyle", null);
        setField(term16128, term16128.getClass(), "resolverFields", null);
        setField(term16128, term16128.getClass(), "chrono", null);
        setField(term16128, term16128.getClass(), "zone", null);
        setField(term16127, term16127.getClass(), "formatter", term16128);
        setField(term16127, term16127.getClass(), "signals", term16129);
        setField(term16127, term16127.getClass(), "pt", enum52);
        setField(term16127, term16127.getClass(), "sId", "");
        setIntField(term16127, term16127.getClass(), "initVolume", 1743683601);
        setIntField(term16127, term16127.getClass(), "currVolume", -945116798);
        setDoubleField(term16127, term16127.getClass(), "pr", 0.4990217874180345);
        setLongField(term16138, term16138.getClass(), "seconds", 1491181740L);
        setIntField(term16138, term16138.getClass(), "nanos", 539000000);
        setField(term16127, term16127.getClass(), "openInst", term16138);
        setLongField(term16141, term16141.getClass(), "seconds", 1461996881L);
        setIntField(term16141, term16141.getClass(), "nanos", 310000000);
        setField(term16127, term16127.getClass(), "closeInst", term16141);
        setBooleanField(term16127, term16127.getClass(), "open", true);
        setDoubleField(term16127, term16127.getClass(), "currWinLoss", 0.22767631814145395);
        setField(term16127, term16127.getClass(), "uuid", "");
        ArrayList term16105 = new ArrayList();
        ((ArrayList) term16105).add(term16107);
        ((ArrayList) term16105).add(term16127);
        term16087 = newInstance(Class.forName("strategies.TripleMovingAverageCrossoverStrategy"));
        setField(term16087, term16087.getClass(), "itsRef", null);
        setField(term16087, term16087.getClass(), "stma", null);
        setField(term16087, term16087.getClass(), "mtma", null);
        setField(term16087, term16087.getClass(), "ltma", null);
        setField(term16087, term16087.getClass(), "source", "OYbzXylRWW");
        setDoubleField(term16087, term16087.getClass(), "targetRange", 0.2382345237223229);
        setField(term16087, term16087.getClass(), "crossList", term16101);
        setField(term16087, term16087.getClass(), "positions", term16105);
        setField(term16087, term16087.getClass(), "positionSizing", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("strategies.TripleMovingAverageCrossoverStrategy");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "run", argTypes, term16087, args);
    }

};


