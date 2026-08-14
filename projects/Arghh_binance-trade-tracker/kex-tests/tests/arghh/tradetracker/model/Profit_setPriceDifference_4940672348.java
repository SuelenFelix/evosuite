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

public class Profit_setPriceDifference_4940672348 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2196;
     Object term2264;

    public Profit_setPriceDifference_4940672348() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2197 = new Long(-7237588299778557629L);
        Class<? extends Object> term2282 = Class.forName((String) "arghh.tradetracker.services.BaseCurrency");
        Field term2281 = ((Class) term2282).getDeclaredField((String) "BNB");
        ((Field) term2281).setAccessible(true);
        Object enum7 = ((Field) term2281).get((Object) null);
        ArrayList term2258 = new ArrayList();
        term2196 = newInstance(Class.forName("arghh.tradetracker.model.Profit"));
        Object term2206 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term2207 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term2209 = (int[]) newIntArray(6);
        Object term2223 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term2224 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term2226 = (int[]) newIntArray(6);
        Object term2240 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term2241 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term2243 = (int[]) newIntArray(6);
        Object term2262 = newInstance(Class.forName("java.util.Date"));
        setField(term2196, term2196.getClass(), "id", term2197);
        setField(term2196, term2196.getClass(), "baseCurrency", enum7);
        setIntField(term2207, term2207.getClass(), "signum", 1);
        setIntElement(term2209, 0, 5222);
        setIntElement(term2209, 1, -454284340);
        setIntElement(term2209, 2, -1412298361);
        setIntElement(term2209, 3, -225970664);
        setIntElement(term2209, 4, -1354448185);
        setIntElement(term2209, 5, -1168679607);
        setField(term2207, term2207.getClass(), "mag", term2209);
        setIntField(term2207, term2207.getClass(), "bitCountPlusOne", 0);
        setIntField(term2207, term2207.getClass(), "bitLengthPlusOne", 0);
        setIntField(term2207, term2207.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term2207, term2207.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term2206, term2206.getClass(), "intVal", term2207);
        setIntField(term2206, term2206.getClass(), "scale", 52);
        setIntField(term2206, term2206.getClass(), "precision", 0);
        setField(term2206, term2206.getClass(), "stringCache", null);
        setLongField(term2206, term2206.getClass(), "intCompact", -9223372036854775808L);
        setField(term2196, term2196.getClass(), "profitValue", term2206);
        setIntField(term2224, term2224.getClass(), "signum", 1);
        setIntElement(term2226, 0, 92);
        setIntElement(term2226, 1, 1034738575);
        setIntElement(term2226, 2, -1456630577);
        setIntElement(term2226, 3, -1449292938);
        setIntElement(term2226, 4, -1319116780);
        setIntElement(term2226, 5, 1851590535);
        setField(term2224, term2224.getClass(), "mag", term2226);
        setIntField(term2224, term2224.getClass(), "bitCountPlusOne", 0);
        setIntField(term2224, term2224.getClass(), "bitLengthPlusOne", 0);
        setIntField(term2224, term2224.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term2224, term2224.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term2223, term2223.getClass(), "intVal", term2224);
        setIntField(term2223, term2223.getClass(), "scale", 51);
        setIntField(term2223, term2223.getClass(), "precision", 0);
        setField(term2223, term2223.getClass(), "stringCache", null);
        setLongField(term2223, term2223.getClass(), "intCompact", -9223372036854775808L);
        setField(term2196, term2196.getClass(), "quantity", term2223);
        setIntField(term2241, term2241.getClass(), "signum", 1);
        setIntElement(term2243, 0, 26001);
        setIntElement(term2243, 1, 1123266030);
        setIntElement(term2243, 2, 1277036849);
        setIntElement(term2243, 3, 2128028609);
        setIntElement(term2243, 4, -171954480);
        setIntElement(term2243, 5, -1359520521);
        setField(term2241, term2241.getClass(), "mag", term2243);
        setIntField(term2241, term2241.getClass(), "bitCountPlusOne", 0);
        setIntField(term2241, term2241.getClass(), "bitLengthPlusOne", 0);
        setIntField(term2241, term2241.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term2241, term2241.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term2240, term2240.getClass(), "intVal", term2241);
        setIntField(term2240, term2240.getClass(), "scale", 53);
        setIntField(term2240, term2240.getClass(), "precision", 0);
        setField(term2240, term2240.getClass(), "stringCache", null);
        setLongField(term2240, term2240.getClass(), "intCompact", -9223372036854775808L);
        setField(term2196, term2196.getClass(), "priceDifference", term2240);
        setLongField(term2196, term2196.getClass(), "timeDifference", 6811161968424632369L);
        setField(term2196, term2196.getClass(), "aggregatedTrade", term2258);
        setLongField(term2262, term2262.getClass(), "fastTime", 1495357463288L);
        setField(term2262, term2262.getClass(), "cdate", null);
        setField(term2196, term2196.getClass(), "sellTime", term2262);
        term2264 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term2265 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term2267 = (int[]) newIntArray(6);
        setIntField(term2265, term2265.getClass(), "signum", 1);
        setIntElement(term2267, 0, 3996);
        setIntElement(term2267, 1, 1627046923);
        setIntElement(term2267, 2, -1280614629);
        setIntElement(term2267, 3, 917260100);
        setIntElement(term2267, 4, -74841886);
        setIntElement(term2267, 5, 597293319);
        setField(term2265, term2265.getClass(), "mag", term2267);
        setIntField(term2265, term2265.getClass(), "bitCountPlusOne", 0);
        setIntField(term2265, term2265.getClass(), "bitLengthPlusOne", 0);
        setIntField(term2265, term2265.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term2265, term2265.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term2264, term2264.getClass(), "intVal", term2265);
        setIntField(term2264, term2264.getClass(), "scale", 52);
        setIntField(term2264, term2264.getClass(), "precision", 0);
        setField(term2264, term2264.getClass(), "stringCache", null);
        setLongField(term2264, term2264.getClass(), "intCompact", -9223372036854775808L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("arghh.tradetracker.model.Profit");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.math.BigDecimal");
        Object[] args = new Object[1];
        args[0] = term2264;
        callMethod(klass, "setPriceDifference", argTypes, term2196, args);
    }

};


