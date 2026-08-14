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

public class Profit_getSellTime_90996551415 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4812;

    public Profit_getSellTime_90996551415() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4813 = new Long(6855071767938501807L);
        Class<? extends Object> term4882 = Class.forName((String) "arghh.tradetracker.services.BaseCurrency");
        Field term4881 = ((Class) term4882).getDeclaredField((String) "USDT");
        ((Field) term4881).setAccessible(true);
        Object enum15 = ((Field) term4881).get((Object) null);
        ArrayList term4875 = new ArrayList();
        term4812 = newInstance(Class.forName("arghh.tradetracker.model.Profit"));
        Object term4823 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term4824 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term4826 = (int[]) newIntArray(6);
        Object term4840 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term4841 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term4843 = (int[]) newIntArray(6);
        Object term4857 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term4858 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term4860 = (int[]) newIntArray(6);
        Object term4879 = newInstance(Class.forName("java.util.Date"));
        setField(term4812, term4812.getClass(), "id", term4813);
        setField(term4812, term4812.getClass(), "baseCurrency", enum15);
        setIntField(term4824, term4824.getClass(), "signum", 1);
        setIntElement(term4826, 0, 204);
        setIntElement(term4826, 1, 1745146299);
        setIntElement(term4826, 2, 845712784);
        setIntElement(term4826, 3, 1465621215);
        setIntElement(term4826, 4, 1308052610);
        setIntElement(term4826, 5, -167172793);
        setField(term4824, term4824.getClass(), "mag", term4826);
        setIntField(term4824, term4824.getClass(), "bitCountPlusOne", 0);
        setIntField(term4824, term4824.getClass(), "bitLengthPlusOne", 0);
        setIntField(term4824, term4824.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term4824, term4824.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term4823, term4823.getClass(), "intVal", term4824);
        setIntField(term4823, term4823.getClass(), "scale", 51);
        setIntField(term4823, term4823.getClass(), "precision", 0);
        setField(term4823, term4823.getClass(), "stringCache", null);
        setLongField(term4823, term4823.getClass(), "intCompact", -9223372036854775808L);
        setField(term4812, term4812.getClass(), "profitValue", term4823);
        setIntField(term4841, term4841.getClass(), "signum", 1);
        setIntElement(term4843, 0, 222);
        setIntElement(term4843, 1, -1087508584);
        setIntElement(term4843, 2, 906884840);
        setIntElement(term4843, 3, 1951789170);
        setIntElement(term4843, 4, -1162620578);
        setIntElement(term4843, 5, -1079967753);
        setField(term4841, term4841.getClass(), "mag", term4843);
        setIntField(term4841, term4841.getClass(), "bitCountPlusOne", 0);
        setIntField(term4841, term4841.getClass(), "bitLengthPlusOne", 0);
        setIntField(term4841, term4841.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term4841, term4841.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term4840, term4840.getClass(), "intVal", term4841);
        setIntField(term4840, term4840.getClass(), "scale", 51);
        setIntField(term4840, term4840.getClass(), "precision", 0);
        setField(term4840, term4840.getClass(), "stringCache", null);
        setLongField(term4840, term4840.getClass(), "intCompact", -9223372036854775808L);
        setField(term4812, term4812.getClass(), "quantity", term4840);
        setIntField(term4858, term4858.getClass(), "signum", 1);
        setIntElement(term4860, 0, 61066);
        setIntElement(term4860, 1, 1460049099);
        setIntElement(term4860, 2, -1451563573);
        setIntElement(term4860, 3, -3429064);
        setIntElement(term4860, 4, 462198911);
        setIntElement(term4860, 5, -1869206977);
        setField(term4858, term4858.getClass(), "mag", term4860);
        setIntField(term4858, term4858.getClass(), "bitCountPlusOne", 0);
        setIntField(term4858, term4858.getClass(), "bitLengthPlusOne", 0);
        setIntField(term4858, term4858.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term4858, term4858.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term4857, term4857.getClass(), "intVal", term4858);
        setIntField(term4857, term4857.getClass(), "scale", 53);
        setIntField(term4857, term4857.getClass(), "precision", 0);
        setField(term4857, term4857.getClass(), "stringCache", null);
        setLongField(term4857, term4857.getClass(), "intCompact", -9223372036854775808L);
        setField(term4812, term4812.getClass(), "priceDifference", term4857);
        setLongField(term4812, term4812.getClass(), "timeDifference", 8428634514691209827L);
        setField(term4812, term4812.getClass(), "aggregatedTrade", term4875);
        setLongField(term4879, term4879.getClass(), "fastTime", 1347400561385L);
        setField(term4879, term4879.getClass(), "cdate", null);
        setField(term4812, term4812.getClass(), "sellTime", term4879);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("arghh.tradetracker.model.Profit");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSellTime", argTypes, term4812, args);
    }

};


