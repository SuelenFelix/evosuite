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

public class Profit_getQuantity_20409167995 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1263;

    public Profit_getQuantity_20409167995() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1264 = new Long(7411271909051562686L);
        Class<? extends Object> term1332 = Class.forName((String) "arghh.tradetracker.services.BaseCurrency");
        Field term1331 = ((Class) term1332).getDeclaredField((String) "BNB");
        ((Field) term1331).setAccessible(true);
        Object enum4 = ((Field) term1331).get((Object) null);
        ArrayList term1325 = new ArrayList();
        term1263 = newInstance(Class.forName("arghh.tradetracker.model.Profit"));
        Object term1273 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term1274 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term1276 = (int[]) newIntArray(6);
        Object term1290 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term1291 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term1293 = (int[]) newIntArray(6);
        Object term1307 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term1308 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term1310 = (int[]) newIntArray(6);
        Object term1329 = newInstance(Class.forName("java.util.Date"));
        setField(term1263, term1263.getClass(), "id", term1264);
        setField(term1263, term1263.getClass(), "baseCurrency", enum4);
        setIntField(term1274, term1274.getClass(), "signum", 1);
        setIntElement(term1276, 0, 9405);
        setIntElement(term1276, 1, 205999050);
        setIntElement(term1276, 2, 647637684);
        setIntElement(term1276, 3, -896420066);
        setIntElement(term1276, 4, 1280002914);
        setIntElement(term1276, 5, 183404747);
        setField(term1274, term1274.getClass(), "mag", term1276);
        setIntField(term1274, term1274.getClass(), "bitCountPlusOne", 0);
        setIntField(term1274, term1274.getClass(), "bitLengthPlusOne", 0);
        setIntField(term1274, term1274.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term1274, term1274.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term1273, term1273.getClass(), "intVal", term1274);
        setIntField(term1273, term1273.getClass(), "scale", 53);
        setIntField(term1273, term1273.getClass(), "precision", 0);
        setField(term1273, term1273.getClass(), "stringCache", null);
        setLongField(term1273, term1273.getClass(), "intCompact", -9223372036854775808L);
        setField(term1263, term1263.getClass(), "profitValue", term1273);
        setIntField(term1291, term1291.getClass(), "signum", 1);
        setIntElement(term1293, 0, 48108);
        setIntElement(term1293, 1, 419671270);
        setIntElement(term1293, 2, 909082732);
        setIntElement(term1293, 3, 2078883588);
        setIntElement(term1293, 4, 1670017529);
        setIntElement(term1293, 5, -2116499193);
        setField(term1291, term1291.getClass(), "mag", term1293);
        setIntField(term1291, term1291.getClass(), "bitCountPlusOne", 0);
        setIntField(term1291, term1291.getClass(), "bitLengthPlusOne", 0);
        setIntField(term1291, term1291.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term1291, term1291.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term1290, term1290.getClass(), "intVal", term1291);
        setIntField(term1290, term1290.getClass(), "scale", 53);
        setIntField(term1290, term1290.getClass(), "precision", 0);
        setField(term1290, term1290.getClass(), "stringCache", null);
        setLongField(term1290, term1290.getClass(), "intCompact", -9223372036854775808L);
        setField(term1263, term1263.getClass(), "quantity", term1290);
        setIntField(term1308, term1308.getClass(), "signum", 1);
        setIntElement(term1310, 0, 65188);
        setIntElement(term1310, 1, 1319681440);
        setIntElement(term1310, 2, -739534113);
        setIntElement(term1310, 3, -1337808284);
        setIntElement(term1310, 4, 786647436);
        setIntElement(term1310, 5, -1827169985);
        setField(term1308, term1308.getClass(), "mag", term1310);
        setIntField(term1308, term1308.getClass(), "bitCountPlusOne", 0);
        setIntField(term1308, term1308.getClass(), "bitLengthPlusOne", 0);
        setIntField(term1308, term1308.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term1308, term1308.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term1307, term1307.getClass(), "intVal", term1308);
        setIntField(term1307, term1307.getClass(), "scale", 53);
        setIntField(term1307, term1307.getClass(), "precision", 0);
        setField(term1307, term1307.getClass(), "stringCache", null);
        setLongField(term1307, term1307.getClass(), "intCompact", -9223372036854775808L);
        setField(term1263, term1263.getClass(), "priceDifference", term1307);
        setLongField(term1263, term1263.getClass(), "timeDifference", 5270370404989704783L);
        setField(term1263, term1263.getClass(), "aggregatedTrade", term1325);
        setLongField(term1329, term1329.getClass(), "fastTime", 1442639565302L);
        setField(term1329, term1329.getClass(), "cdate", null);
        setField(term1263, term1263.getClass(), "sellTime", term1329);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("arghh.tradetracker.model.Profit");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getQuantity", argTypes, term1263, args);
    }

};


