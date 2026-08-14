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

public class Profit_setBaseCurrency_74668314012 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3904;
     Object enum12;

    public Profit_setBaseCurrency_74668314012() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3905 = new Long(-4502405999831680926L);
        Class<? extends Object> term3973 = Class.forName((String) "arghh.tradetracker.services.BaseCurrency");
        Field term3972 = ((Class) term3973).getDeclaredField((String) "BNB");
        ((Field) term3972).setAccessible(true);
        enum12 = ((Field) term3972).get((Object) null);
        ArrayList term3966 = new ArrayList();
        term3904 = newInstance(Class.forName("arghh.tradetracker.model.Profit"));
        Object term3914 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term3915 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term3917 = (int[]) newIntArray(6);
        Object term3931 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term3932 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term3934 = (int[]) newIntArray(6);
        Object term3948 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term3949 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term3951 = (int[]) newIntArray(6);
        Object term3970 = newInstance(Class.forName("java.util.Date"));
        setField(term3904, term3904.getClass(), "id", term3905);
        setField(term3904, term3904.getClass(), "baseCurrency", enum12);
        setIntField(term3915, term3915.getClass(), "signum", 1);
        setIntElement(term3917, 0, 43482);
        setIntElement(term3917, 1, -526476822);
        setIntElement(term3917, 2, 630360651);
        setIntElement(term3917, 3, 911878589);
        setIntElement(term3917, 4, -1204105074);
        setIntElement(term3917, 5, 1750111527);
        setField(term3915, term3915.getClass(), "mag", term3917);
        setIntField(term3915, term3915.getClass(), "bitCountPlusOne", 0);
        setIntField(term3915, term3915.getClass(), "bitLengthPlusOne", 0);
        setIntField(term3915, term3915.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term3915, term3915.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term3914, term3914.getClass(), "intVal", term3915);
        setIntField(term3914, term3914.getClass(), "scale", 53);
        setIntField(term3914, term3914.getClass(), "precision", 0);
        setField(term3914, term3914.getClass(), "stringCache", null);
        setLongField(term3914, term3914.getClass(), "intCompact", -9223372036854775808L);
        setField(term3904, term3904.getClass(), "profitValue", term3914);
        setIntField(term3932, term3932.getClass(), "signum", 1);
        setIntElement(term3934, 0, 154);
        setIntElement(term3934, 1, -190767620);
        setIntElement(term3934, 2, 1384068716);
        setIntElement(term3934, 3, -1306517818);
        setIntElement(term3934, 4, 1608452838);
        setIntElement(term3934, 5, -1191314303);
        setField(term3932, term3932.getClass(), "mag", term3934);
        setIntField(term3932, term3932.getClass(), "bitCountPlusOne", 0);
        setIntField(term3932, term3932.getClass(), "bitLengthPlusOne", 0);
        setIntField(term3932, term3932.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term3932, term3932.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term3931, term3931.getClass(), "intVal", term3932);
        setIntField(term3931, term3931.getClass(), "scale", 53);
        setIntField(term3931, term3931.getClass(), "precision", 0);
        setField(term3931, term3931.getClass(), "stringCache", null);
        setLongField(term3931, term3931.getClass(), "intCompact", -9223372036854775808L);
        setField(term3904, term3904.getClass(), "quantity", term3931);
        setIntField(term3949, term3949.getClass(), "signum", 1);
        setIntElement(term3951, 0, 24786);
        setIntElement(term3951, 1, -537812620);
        setIntElement(term3951, 2, 1638771399);
        setIntElement(term3951, 3, 1615160984);
        setIntElement(term3951, 4, 1090385711);
        setIntElement(term3951, 5, 20627819);
        setField(term3949, term3949.getClass(), "mag", term3951);
        setIntField(term3949, term3949.getClass(), "bitCountPlusOne", 0);
        setIntField(term3949, term3949.getClass(), "bitLengthPlusOne", 0);
        setIntField(term3949, term3949.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term3949, term3949.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term3948, term3948.getClass(), "intVal", term3949);
        setIntField(term3948, term3948.getClass(), "scale", 53);
        setIntField(term3948, term3948.getClass(), "precision", 0);
        setField(term3948, term3948.getClass(), "stringCache", null);
        setLongField(term3948, term3948.getClass(), "intCompact", -9223372036854775808L);
        setField(term3904, term3904.getClass(), "priceDifference", term3948);
        setLongField(term3904, term3904.getClass(), "timeDifference", -316468845751588286L);
        setField(term3904, term3904.getClass(), "aggregatedTrade", term3966);
        setLongField(term3970, term3970.getClass(), "fastTime", 1804998087131L);
        setField(term3970, term3970.getClass(), "cdate", null);
        setField(term3904, term3904.getClass(), "sellTime", term3970);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("arghh.tradetracker.model.Profit");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("arghh.tradetracker.services.BaseCurrency");
        Object[] args = new Object[1];
        args[0] = enum12;
        callMethod(klass, "setBaseCurrency", argTypes, term3904, args);
    }

};


