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

public class Profit_getPriceDifference_8207090387 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1894;

    public Profit_getPriceDifference_8207090387() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1895 = new Long(6811161968424632369L);
        Class<? extends Object> term1963 = Class.forName((String) "arghh.tradetracker.services.BaseCurrency");
        Field term1962 = ((Class) term1963).getDeclaredField((String) "BNB");
        ((Field) term1962).setAccessible(true);
        Object enum6 = ((Field) term1962).get((Object) null);
        ArrayList term1956 = new ArrayList();
        term1894 = newInstance(Class.forName("arghh.tradetracker.model.Profit"));
        Object term1904 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term1905 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term1907 = (int[]) newIntArray(6);
        Object term1921 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term1922 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term1924 = (int[]) newIntArray(6);
        Object term1938 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term1939 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term1941 = (int[]) newIntArray(6);
        Object term1960 = newInstance(Class.forName("java.util.Date"));
        setField(term1894, term1894.getClass(), "id", term1895);
        setField(term1894, term1894.getClass(), "baseCurrency", enum6);
        setIntField(term1905, term1905.getClass(), "signum", 1);
        setIntElement(term1907, 0, 31263);
        setIntElement(term1907, 1, -1965314916);
        setIntElement(term1907, 2, -443046697);
        setIntElement(term1907, 3, -1268253260);
        setIntElement(term1907, 4, -877110081);
        setIntElement(term1907, 5, -1376525969);
        setField(term1905, term1905.getClass(), "mag", term1907);
        setIntField(term1905, term1905.getClass(), "bitCountPlusOne", 0);
        setIntField(term1905, term1905.getClass(), "bitLengthPlusOne", 0);
        setIntField(term1905, term1905.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term1905, term1905.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term1904, term1904.getClass(), "intVal", term1905);
        setIntField(term1904, term1904.getClass(), "scale", 53);
        setIntField(term1904, term1904.getClass(), "precision", 0);
        setField(term1904, term1904.getClass(), "stringCache", null);
        setLongField(term1904, term1904.getClass(), "intCompact", -9223372036854775808L);
        setField(term1894, term1894.getClass(), "profitValue", term1904);
        setIntField(term1922, term1922.getClass(), "signum", 1);
        setIntElement(term1924, 0, 5883);
        setIntElement(term1924, 1, 833709085);
        setIntElement(term1924, 2, 749794735);
        setIntElement(term1924, 3, 825830368);
        setIntElement(term1924, 4, 935494074);
        setIntElement(term1924, 5, -2012885541);
        setField(term1922, term1922.getClass(), "mag", term1924);
        setIntField(term1922, term1922.getClass(), "bitCountPlusOne", 0);
        setIntField(term1922, term1922.getClass(), "bitLengthPlusOne", 0);
        setIntField(term1922, term1922.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term1922, term1922.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term1921, term1921.getClass(), "intVal", term1922);
        setIntField(term1921, term1921.getClass(), "scale", 52);
        setIntField(term1921, term1921.getClass(), "precision", 0);
        setField(term1921, term1921.getClass(), "stringCache", null);
        setLongField(term1921, term1921.getClass(), "intCompact", -9223372036854775808L);
        setField(term1894, term1894.getClass(), "quantity", term1921);
        setIntField(term1939, term1939.getClass(), "signum", 1);
        setIntElement(term1941, 0, 29895);
        setIntElement(term1941, 1, 1752172477);
        setIntElement(term1941, 2, 1964732279);
        setIntElement(term1941, 3, 382594040);
        setIntElement(term1941, 4, 1485746598);
        setIntElement(term1941, 5, -1795307845);
        setField(term1939, term1939.getClass(), "mag", term1941);
        setIntField(term1939, term1939.getClass(), "bitCountPlusOne", 0);
        setIntField(term1939, term1939.getClass(), "bitLengthPlusOne", 0);
        setIntField(term1939, term1939.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term1939, term1939.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term1938, term1938.getClass(), "intVal", term1939);
        setIntField(term1938, term1938.getClass(), "scale", 53);
        setIntField(term1938, term1938.getClass(), "precision", 0);
        setField(term1938, term1938.getClass(), "stringCache", null);
        setLongField(term1938, term1938.getClass(), "intCompact", -9223372036854775808L);
        setField(term1894, term1894.getClass(), "priceDifference", term1938);
        setLongField(term1894, term1894.getClass(), "timeDifference", 4872422362414183754L);
        setField(term1894, term1894.getClass(), "aggregatedTrade", term1956);
        setLongField(term1960, term1960.getClass(), "fastTime", 1429023851389L);
        setField(term1960, term1960.getClass(), "cdate", null);
        setField(term1894, term1894.getClass(), "sellTime", term1960);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("arghh.tradetracker.model.Profit");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPriceDifference", argTypes, term1894, args);
    }

};


