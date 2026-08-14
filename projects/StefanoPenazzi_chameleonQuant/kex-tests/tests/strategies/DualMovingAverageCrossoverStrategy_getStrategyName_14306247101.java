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

public class DualMovingAverageCrossoverStrategy_getStrategyName_14306247101 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term913;

    public DualMovingAverageCrossoverStrategy_getStrategyName_14306247101() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term930 = new ArrayList();
        Class<? extends Object> term1032 = Class.forName((String) "strategies.Position$PositionType");
        Field term1031 = ((Class) term1032).getDeclaredField((String) "SHORT");
        ((Field) term1031).setAccessible(true);
        Object enum2 = ((Field) term1031).get((Object) null);
        Object term928 = newInstance(Class.forName("strategies.Position"));
        Object term929 = newInstance(Class.forName("java.time.format.DateTimeFormatter"));
        Object term939 = newInstance(Class.forName("java.time.Instant"));
        Object term942 = newInstance(Class.forName("java.time.Instant"));
        setField(term929, term929.getClass(), "printerParser", null);
        setField(term929, term929.getClass(), "locale", null);
        setField(term929, term929.getClass(), "decimalStyle", null);
        setField(term929, term929.getClass(), "resolverStyle", null);
        setField(term929, term929.getClass(), "resolverFields", null);
        setField(term929, term929.getClass(), "chrono", null);
        setField(term929, term929.getClass(), "zone", null);
        setField(term928, term928.getClass(), "formatter", term929);
        setField(term928, term928.getClass(), "signals", term930);
        setField(term928, term928.getClass(), "pt", enum2);
        setField(term928, term928.getClass(), "sId", "");
        setIntField(term928, term928.getClass(), "initVolume", -1339778481);
        setIntField(term928, term928.getClass(), "currVolume", 1725571209);
        setDoubleField(term928, term928.getClass(), "pr", 0.1374549299694151);
        setLongField(term939, term939.getClass(), "seconds", 1345871412L);
        setIntField(term939, term939.getClass(), "nanos", 244000000);
        setField(term928, term928.getClass(), "openInst", term939);
        setLongField(term942, term942.getClass(), "seconds", 1480438351L);
        setIntField(term942, term942.getClass(), "nanos", 369000000);
        setField(term928, term928.getClass(), "closeInst", term942);
        setBooleanField(term928, term928.getClass(), "open", false);
        setDoubleField(term928, term928.getClass(), "currWinLoss", 0.7031006357544823);
        setField(term928, term928.getClass(), "uuid", "");
        ArrayList term950 = new ArrayList();
        Object term948 = newInstance(Class.forName("strategies.Position"));
        Object term949 = newInstance(Class.forName("java.time.format.DateTimeFormatter"));
        Object term957 = newInstance(Class.forName("java.time.Instant"));
        Object term960 = newInstance(Class.forName("java.time.Instant"));
        setField(term949, term949.getClass(), "printerParser", null);
        setField(term949, term949.getClass(), "locale", null);
        setField(term949, term949.getClass(), "decimalStyle", null);
        setField(term949, term949.getClass(), "resolverStyle", null);
        setField(term949, term949.getClass(), "resolverFields", null);
        setField(term949, term949.getClass(), "chrono", null);
        setField(term949, term949.getClass(), "zone", null);
        setField(term948, term948.getClass(), "formatter", term949);
        setField(term948, term948.getClass(), "signals", term950);
        setField(term948, term948.getClass(), "pt", enum2);
        setField(term948, term948.getClass(), "sId", "");
        setIntField(term948, term948.getClass(), "initVolume", -522618178);
        setIntField(term948, term948.getClass(), "currVolume", 1134449235);
        setDoubleField(term948, term948.getClass(), "pr", 0.9527281779865117);
        setLongField(term957, term957.getClass(), "seconds", 1610940182L);
        setIntField(term957, term957.getClass(), "nanos", 830000000);
        setField(term948, term948.getClass(), "openInst", term957);
        setLongField(term960, term960.getClass(), "seconds", 1606045635L);
        setIntField(term960, term960.getClass(), "nanos", 837000000);
        setField(term948, term948.getClass(), "closeInst", term960);
        setBooleanField(term948, term948.getClass(), "open", false);
        setDoubleField(term948, term948.getClass(), "currWinLoss", 0.9828442029246764);
        setField(term948, term948.getClass(), "uuid", "");
        ArrayList term968 = new ArrayList();
        Object term966 = newInstance(Class.forName("strategies.Position"));
        Object term967 = newInstance(Class.forName("java.time.format.DateTimeFormatter"));
        Object term975 = newInstance(Class.forName("java.time.Instant"));
        Object term978 = newInstance(Class.forName("java.time.Instant"));
        setField(term967, term967.getClass(), "printerParser", null);
        setField(term967, term967.getClass(), "locale", null);
        setField(term967, term967.getClass(), "decimalStyle", null);
        setField(term967, term967.getClass(), "resolverStyle", null);
        setField(term967, term967.getClass(), "resolverFields", null);
        setField(term967, term967.getClass(), "chrono", null);
        setField(term967, term967.getClass(), "zone", null);
        setField(term966, term966.getClass(), "formatter", term967);
        setField(term966, term966.getClass(), "signals", term968);
        setField(term966, term966.getClass(), "pt", enum2);
        setField(term966, term966.getClass(), "sId", "");
        setIntField(term966, term966.getClass(), "initVolume", -883034806);
        setIntField(term966, term966.getClass(), "currVolume", 1585847225);
        setDoubleField(term966, term966.getClass(), "pr", 0.2779719046761513);
        setLongField(term975, term975.getClass(), "seconds", 1442639565L);
        setIntField(term975, term975.getClass(), "nanos", 302000000);
        setField(term966, term966.getClass(), "openInst", term975);
        setLongField(term978, term978.getClass(), "seconds", 1515890130L);
        setIntField(term978, term978.getClass(), "nanos", 18000000);
        setField(term966, term966.getClass(), "closeInst", term978);
        setBooleanField(term966, term966.getClass(), "open", false);
        setDoubleField(term966, term966.getClass(), "currWinLoss", 0.6436713023569729);
        setField(term966, term966.getClass(), "uuid", "");
        ArrayList term986 = new ArrayList();
        Object term984 = newInstance(Class.forName("strategies.Position"));
        Object term985 = newInstance(Class.forName("java.time.format.DateTimeFormatter"));
        Object term993 = newInstance(Class.forName("java.time.Instant"));
        Object term996 = newInstance(Class.forName("java.time.Instant"));
        setField(term985, term985.getClass(), "printerParser", null);
        setField(term985, term985.getClass(), "locale", null);
        setField(term985, term985.getClass(), "decimalStyle", null);
        setField(term985, term985.getClass(), "resolverStyle", null);
        setField(term985, term985.getClass(), "resolverFields", null);
        setField(term985, term985.getClass(), "chrono", null);
        setField(term985, term985.getClass(), "zone", null);
        setField(term984, term984.getClass(), "formatter", term985);
        setField(term984, term984.getClass(), "signals", term986);
        setField(term984, term984.getClass(), "pt", enum2);
        setField(term984, term984.getClass(), "sId", "");
        setIntField(term984, term984.getClass(), "initVolume", 597278769);
        setIntField(term984, term984.getClass(), "currVolume", -1685132342);
        setDoubleField(term984, term984.getClass(), "pr", 0.7332741045694002);
        setLongField(term993, term993.getClass(), "seconds", 1429023851L);
        setIntField(term993, term993.getClass(), "nanos", 389000000);
        setField(term984, term984.getClass(), "openInst", term993);
        setLongField(term996, term996.getClass(), "seconds", 1495357463L);
        setIntField(term996, term996.getClass(), "nanos", 288000000);
        setField(term984, term984.getClass(), "closeInst", term996);
        setBooleanField(term984, term984.getClass(), "open", false);
        setDoubleField(term984, term984.getClass(), "currWinLoss", 0.4569171842750229);
        setField(term984, term984.getClass(), "uuid", "");
        ArrayList term926 = new ArrayList();
        ((ArrayList) term926).add(term928);
        ((ArrayList) term926).add(term948);
        ((ArrayList) term926).add(term966);
        ((ArrayList) term926).add(term984);
        term913 = newInstance(Class.forName("strategies.DualMovingAverageCrossoverStrategy"));
        setField(term913, term913.getClass(), "itsRef", null);
        setField(term913, term913.getClass(), "stma", null);
        setField(term913, term913.getClass(), "ltma", null);
        setField(term913, term913.getClass(), "source", "hRNSzYYIrc");
        setField(term913, term913.getClass(), "positions", term926);
        setField(term913, term913.getClass(), "positionSizing", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("strategies.DualMovingAverageCrossoverStrategy");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStrategyName", argTypes, term913, args);
    }

};


