package arghh.tradetracker.services;

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
import static arghh.tradetracker.services.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;

public class ProfitServiceImpl_saveOrUpdate_10460149841 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3172;

    public ProfitServiceImpl_saveOrUpdate_10460149841() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3173 = new Long(305759998609888272L);
        Class<? extends Object> term3241 = Class.forName((String) "arghh.tradetracker.services.BaseCurrency");
        Field term3240 = ((Class) term3241).getDeclaredField((String) "BNB");
        ((Field) term3240).setAccessible(true);
        Object enum6 = ((Field) term3240).get((Object) null);
        ArrayList term3234 = new ArrayList();
        term3172 = newInstance(Class.forName("arghh.tradetracker.model.Profit"));
        Object term3182 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term3183 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term3185 = (int[]) newIntArray(6);
        Object term3199 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term3200 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term3202 = (int[]) newIntArray(6);
        Object term3216 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term3217 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term3219 = (int[]) newIntArray(6);
        Object term3238 = newInstance(Class.forName("java.util.Date"));
        setField(term3172, term3172.getClass(), "id", term3173);
        setField(term3172, term3172.getClass(), "baseCurrency", enum6);
        setIntField(term3183, term3183.getClass(), "signum", 1);
        setIntElement(term3185, 0, 545);
        setIntElement(term3185, 1, -688770266);
        setIntElement(term3185, 2, 1799312273);
        setIntElement(term3185, 3, -430724263);
        setIntElement(term3185, 4, 1287317652);
        setIntElement(term3185, 5, -1765317069);
        setField(term3183, term3183.getClass(), "mag", term3185);
        setIntField(term3183, term3183.getClass(), "bitCountPlusOne", 0);
        setIntField(term3183, term3183.getClass(), "bitLengthPlusOne", 0);
        setIntField(term3183, term3183.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term3183, term3183.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term3182, term3182.getClass(), "intVal", term3183);
        setIntField(term3182, term3182.getClass(), "scale", 51);
        setIntField(term3182, term3182.getClass(), "precision", 0);
        setField(term3182, term3182.getClass(), "stringCache", null);
        setLongField(term3182, term3182.getClass(), "intCompact", -9223372036854775808L);
        setField(term3172, term3172.getClass(), "profitValue", term3182);
        setIntField(term3200, term3200.getClass(), "signum", 1);
        setIntElement(term3202, 0, 3646);
        setIntElement(term3202, 1, -520226555);
        setIntElement(term3202, 2, -500867287);
        setIntElement(term3202, 3, 2058130326);
        setIntElement(term3202, 4, 630142228);
        setIntElement(term3202, 5, -1611343891);
        setField(term3200, term3200.getClass(), "mag", term3202);
        setIntField(term3200, term3200.getClass(), "bitCountPlusOne", 0);
        setIntField(term3200, term3200.getClass(), "bitLengthPlusOne", 0);
        setIntField(term3200, term3200.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term3200, term3200.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term3199, term3199.getClass(), "intVal", term3200);
        setIntField(term3199, term3199.getClass(), "scale", 52);
        setIntField(term3199, term3199.getClass(), "precision", 0);
        setField(term3199, term3199.getClass(), "stringCache", null);
        setLongField(term3199, term3199.getClass(), "intCompact", -9223372036854775808L);
        setField(term3172, term3172.getClass(), "quantity", term3199);
        setIntField(term3217, term3217.getClass(), "signum", 1);
        setIntElement(term3219, 0, 48217);
        setIntElement(term3219, 1, 1542340153);
        setIntElement(term3219, 2, -337283179);
        setIntElement(term3219, 3, 126048541);
        setIntElement(term3219, 4, 1007604812);
        setIntElement(term3219, 5, -1994095901);
        setField(term3217, term3217.getClass(), "mag", term3219);
        setIntField(term3217, term3217.getClass(), "bitCountPlusOne", 0);
        setIntField(term3217, term3217.getClass(), "bitLengthPlusOne", 0);
        setIntField(term3217, term3217.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term3217, term3217.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term3216, term3216.getClass(), "intVal", term3217);
        setIntField(term3216, term3216.getClass(), "scale", 53);
        setIntField(term3216, term3216.getClass(), "precision", 0);
        setField(term3216, term3216.getClass(), "stringCache", null);
        setLongField(term3216, term3216.getClass(), "intCompact", -9223372036854775808L);
        setField(term3172, term3172.getClass(), "priceDifference", term3216);
        setLongField(term3172, term3172.getClass(), "timeDifference", -316468845751588286L);
        setField(term3172, term3172.getClass(), "aggregatedTrade", term3234);
        setLongField(term3238, term3238.getClass(), "fastTime", 1741444563811L);
        setField(term3238, term3238.getClass(), "cdate", null);
        setField(term3172, term3172.getClass(), "sellTime", term3238);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("arghh.tradetracker.services.ProfitServiceImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("arghh.tradetracker.model.Profit");
        Object[] args = new Object[1];
        args[0] = term3172;
        callMethod(klass, "saveOrUpdate", argTypes, null, args);
    }

};


