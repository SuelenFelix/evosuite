package arghh.tradetracker.model;

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
import static arghh.tradetracker.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;

public class Profit_setProfitValue_18732281694 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term938;
     Object term1006;

    public Profit_setProfitValue_18732281694() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term939 = new Long(5270370404989704783L);
        Class<? extends Object> term1024 = Class.forName((String) "arghh.tradetracker.services.BaseCurrency");
        Field term1023 = ((Class) term1024).getDeclaredField((String) "BTC");
        ((Field) term1023).setAccessible(true);
        Object enum3 = ((Field) term1023).get((Object) null);
        ArrayList term1000 = new ArrayList();
        term938 = newInstance(Class.forName("arghh.tradetracker.model.Profit"));
        Object term948 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term949 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term951 = (int[]) newIntArray(6);
        Object term965 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term966 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term968 = (int[]) newIntArray(6);
        Object term982 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term983 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term985 = (int[]) newIntArray(6);
        Object term1004 = newInstance(Class.forName("java.util.Date"));
        setField(term938, term938.getClass(), "id", term939);
        setField(term938, term938.getClass(), "baseCurrency", enum3);
        setIntField(term949, term949.getClass(), "signum", 1);
        setIntElement(term951, 0, 2584);
        setIntElement(term951, 1, -1946484122);
        setIntElement(term951, 2, 1992026795);
        setIntElement(term951, 3, 1045205752);
        setIntElement(term951, 4, 613377469);
        setIntElement(term951, 5, -1848020175);
        setField(term949, term949.getClass(), "mag", term951);
        setIntField(term949, term949.getClass(), "bitCountPlusOne", 0);
        setIntField(term949, term949.getClass(), "bitLengthPlusOne", 0);
        setIntField(term949, term949.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term949, term949.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term948, term948.getClass(), "intVal", term949);
        setIntField(term948, term948.getClass(), "scale", 52);
        setIntField(term948, term948.getClass(), "precision", 0);
        setField(term948, term948.getClass(), "stringCache", null);
        setLongField(term948, term948.getClass(), "intCompact", -9223372036854775808L);
        setField(term938, term938.getClass(), "profitValue", term948);
        setIntField(term966, term966.getClass(), "signum", 1);
        setIntElement(term968, 0, 579);
        setIntElement(term968, 1, -560540333);
        setIntElement(term968, 2, 1014435409);
        setIntElement(term968, 3, -1248929007);
        setIntElement(term968, 4, -42206956);
        setIntElement(term968, 5, 1817231305);
        setField(term966, term966.getClass(), "mag", term968);
        setIntField(term966, term966.getClass(), "bitCountPlusOne", 0);
        setIntField(term966, term966.getClass(), "bitLengthPlusOne", 0);
        setIntField(term966, term966.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term966, term966.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term965, term965.getClass(), "intVal", term966);
        setIntField(term965, term965.getClass(), "scale", 51);
        setIntField(term965, term965.getClass(), "precision", 0);
        setField(term965, term965.getClass(), "stringCache", null);
        setLongField(term965, term965.getClass(), "intCompact", -9223372036854775808L);
        setField(term938, term938.getClass(), "quantity", term965);
        setIntField(term983, term983.getClass(), "signum", 1);
        setIntElement(term985, 0, 35465);
        setIntElement(term985, 1, 1599162976);
        setIntElement(term985, 2, -1427811280);
        setIntElement(term985, 3, -224241601);
        setIntElement(term985, 4, -1115150417);
        setIntElement(term985, 5, 212641299);
        setField(term983, term983.getClass(), "mag", term985);
        setIntField(term983, term983.getClass(), "bitCountPlusOne", 0);
        setIntField(term983, term983.getClass(), "bitLengthPlusOne", 0);
        setIntField(term983, term983.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term983, term983.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term982, term982.getClass(), "intVal", term983);
        setIntField(term982, term982.getClass(), "scale", 53);
        setIntField(term982, term982.getClass(), "precision", 0);
        setField(term982, term982.getClass(), "stringCache", null);
        setLongField(term982, term982.getClass(), "intCompact", -9223372036854775808L);
        setField(term938, term938.getClass(), "priceDifference", term982);
        setLongField(term938, term938.getClass(), "timeDifference", -8400487765614892086L);
        setField(term938, term938.getClass(), "aggregatedTrade", term1000);
        setLongField(term1004, term1004.getClass(), "fastTime", 1606045635837L);
        setField(term1004, term1004.getClass(), "cdate", null);
        setField(term938, term938.getClass(), "sellTime", term1004);
        term1006 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term1007 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term1009 = (int[]) newIntArray(6);
        setIntField(term1007, term1007.getClass(), "signum", 1);
        setIntElement(term1009, 0, 523);
        setIntElement(term1009, 1, -954467915);
        setIntElement(term1009, 2, 1892307494);
        setIntElement(term1009, 3, -1066736592);
        setIntElement(term1009, 4, 433326655);
        setIntElement(term1009, 5, -242716133);
        setField(term1007, term1007.getClass(), "mag", term1009);
        setIntField(term1007, term1007.getClass(), "bitCountPlusOne", 0);
        setIntField(term1007, term1007.getClass(), "bitLengthPlusOne", 0);
        setIntField(term1007, term1007.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term1007, term1007.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term1006, term1006.getClass(), "intVal", term1007);
        setIntField(term1006, term1006.getClass(), "scale", 51);
        setIntField(term1006, term1006.getClass(), "precision", 0);
        setField(term1006, term1006.getClass(), "stringCache", null);
        setLongField(term1006, term1006.getClass(), "intCompact", -9223372036854775808L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("arghh.tradetracker.model.Profit");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.math.BigDecimal");
        Object[] args = new Object[1];
        args[0] = term1006;
        callMethod(klass, "setProfitValue", argTypes, term938, args);
    }

};


