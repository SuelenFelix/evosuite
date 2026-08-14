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

public class Profit_getTimeDifference_136980049313 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4206;

    public Profit_getTimeDifference_136980049313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4207 = new Long(1967728129628047933L);
        Class<? extends Object> term4275 = Class.forName((String) "arghh.tradetracker.services.BaseCurrency");
        Field term4274 = ((Class) term4275).getDeclaredField((String) "ETH");
        ((Field) term4274).setAccessible(true);
        Object enum13 = ((Field) term4274).get((Object) null);
        ArrayList term4268 = new ArrayList();
        term4206 = newInstance(Class.forName("arghh.tradetracker.model.Profit"));
        Object term4216 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term4217 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term4219 = (int[]) newIntArray(6);
        Object term4233 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term4234 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term4236 = (int[]) newIntArray(6);
        Object term4250 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term4251 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term4253 = (int[]) newIntArray(6);
        Object term4272 = newInstance(Class.forName("java.util.Date"));
        setField(term4206, term4206.getClass(), "id", term4207);
        setField(term4206, term4206.getClass(), "baseCurrency", enum13);
        setIntField(term4217, term4217.getClass(), "signum", 1);
        setIntElement(term4219, 0, 2531);
        setIntElement(term4219, 1, 1414134);
        setIntElement(term4219, 2, -621204468);
        setIntElement(term4219, 3, -1114901499);
        setIntElement(term4219, 4, 1687079292);
        setIntElement(term4219, 5, -788578123);
        setField(term4217, term4217.getClass(), "mag", term4219);
        setIntField(term4217, term4217.getClass(), "bitCountPlusOne", 0);
        setIntField(term4217, term4217.getClass(), "bitLengthPlusOne", 0);
        setIntField(term4217, term4217.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term4217, term4217.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term4216, term4216.getClass(), "intVal", term4217);
        setIntField(term4216, term4216.getClass(), "scale", 53);
        setIntField(term4216, term4216.getClass(), "precision", 0);
        setField(term4216, term4216.getClass(), "stringCache", null);
        setLongField(term4216, term4216.getClass(), "intCompact", -9223372036854775808L);
        setField(term4206, term4206.getClass(), "profitValue", term4216);
        setIntField(term4234, term4234.getClass(), "signum", 1);
        setIntElement(term4236, 0, 41376);
        setIntElement(term4236, 1, 842109249);
        setIntElement(term4236, 2, 1543605109);
        setIntElement(term4236, 3, -2086772896);
        setIntElement(term4236, 4, 1084436163);
        setIntElement(term4236, 5, -159037963);
        setField(term4234, term4234.getClass(), "mag", term4236);
        setIntField(term4234, term4234.getClass(), "bitCountPlusOne", 0);
        setIntField(term4234, term4234.getClass(), "bitLengthPlusOne", 0);
        setIntField(term4234, term4234.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term4234, term4234.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term4233, term4233.getClass(), "intVal", term4234);
        setIntField(term4233, term4233.getClass(), "scale", 53);
        setIntField(term4233, term4233.getClass(), "precision", 0);
        setField(term4233, term4233.getClass(), "stringCache", null);
        setLongField(term4233, term4233.getClass(), "intCompact", -9223372036854775808L);
        setField(term4206, term4206.getClass(), "quantity", term4233);
        setIntField(term4251, term4251.getClass(), "signum", 1);
        setIntElement(term4253, 0, 46);
        setIntElement(term4253, 1, 1302024911);
        setIntElement(term4253, 2, 897622581);
        setIntElement(term4253, 3, -292675792);
        setIntElement(term4253, 4, 1807181852);
        setIntElement(term4253, 5, 286838441);
        setField(term4251, term4251.getClass(), "mag", term4253);
        setIntField(term4251, term4251.getClass(), "bitCountPlusOne", 0);
        setIntField(term4251, term4251.getClass(), "bitLengthPlusOne", 0);
        setIntField(term4251, term4251.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term4251, term4251.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term4250, term4250.getClass(), "intVal", term4251);
        setIntField(term4250, term4250.getClass(), "scale", 50);
        setIntField(term4250, term4250.getClass(), "precision", 0);
        setField(term4250, term4250.getClass(), "stringCache", null);
        setLongField(term4250, term4250.getClass(), "intCompact", -9223372036854775808L);
        setField(term4206, term4206.getClass(), "priceDifference", term4250);
        setLongField(term4206, term4206.getClass(), "timeDifference", 5127676408959197577L);
        setField(term4206, term4206.getClass(), "aggregatedTrade", term4268);
        setLongField(term4272, term4272.getClass(), "fastTime", 1538078916394L);
        setField(term4272, term4272.getClass(), "cdate", null);
        setField(term4206, term4206.getClass(), "sellTime", term4272);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("arghh.tradetracker.model.Profit");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTimeDifference", argTypes, term4206, args);
    }

};


