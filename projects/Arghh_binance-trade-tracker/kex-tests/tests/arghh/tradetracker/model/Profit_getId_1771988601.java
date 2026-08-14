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

public class Profit_getId_1771988601 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public Profit_getId_1771988601() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2 = new Long(2442117782898005296L);
        Class<? extends Object> term99 = Class.forName((String) "arghh.tradetracker.services.BaseCurrency");
        Field term98 = ((Class) term99).getDeclaredField((String) "BTC");
        ((Field) term98).setAccessible(true);
        Object enum0 = ((Field) term98).get((Object) null);
        ArrayList term63 = new ArrayList();
        term1 = newInstance(Class.forName("arghh.tradetracker.model.Profit"));
        Object term11 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term12 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term14 = (int[]) newIntArray(6);
        Object term28 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term29 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term31 = (int[]) newIntArray(6);
        Object term45 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term46 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term48 = (int[]) newIntArray(6);
        Object term67 = newInstance(Class.forName("java.util.Date"));
        setField(term1, term1.getClass(), "id", term2);
        setField(term1, term1.getClass(), "baseCurrency", enum0);
        setIntField(term12, term12.getClass(), "signum", 1);
        setIntElement(term14, 0, 9058);
        setIntElement(term14, 1, 1365043541);
        setIntElement(term14, 2, 1239861896);
        setIntElement(term14, 3, -1338148297);
        setIntElement(term14, 4, -418263970);
        setIntElement(term14, 5, -265097411);
        setField(term12, term12.getClass(), "mag", term14);
        setIntField(term12, term12.getClass(), "bitCountPlusOne", 0);
        setIntField(term12, term12.getClass(), "bitLengthPlusOne", 0);
        setIntField(term12, term12.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term12, term12.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term11, term11.getClass(), "intVal", term12);
        setIntField(term11, term11.getClass(), "scale", 53);
        setIntField(term11, term11.getClass(), "precision", 0);
        setField(term11, term11.getClass(), "stringCache", null);
        setLongField(term11, term11.getClass(), "intCompact", -9223372036854775808L);
        setField(term1, term1.getClass(), "profitValue", term11);
        setIntField(term29, term29.getClass(), "signum", 1);
        setIntElement(term31, 0, 2364);
        setIntElement(term31, 1, -1446584625);
        setIntElement(term31, 2, 1957600567);
        setIntElement(term31, 3, -336418707);
        setIntElement(term31, 4, -1905211145);
        setIntElement(term31, 5, 86968353);
        setField(term29, term29.getClass(), "mag", term31);
        setIntField(term29, term29.getClass(), "bitCountPlusOne", 0);
        setIntField(term29, term29.getClass(), "bitLengthPlusOne", 0);
        setIntField(term29, term29.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term29, term29.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term28, term28.getClass(), "intVal", term29);
        setIntField(term28, term28.getClass(), "scale", 52);
        setIntField(term28, term28.getClass(), "precision", 0);
        setField(term28, term28.getClass(), "stringCache", null);
        setLongField(term28, term28.getClass(), "intCompact", -9223372036854775808L);
        setField(term1, term1.getClass(), "quantity", term28);
        setIntField(term46, term46.getClass(), "signum", 1);
        setIntElement(term48, 0, 3779);
        setIntElement(term48, 1, 1825499203);
        setIntElement(term48, 2, 189827582);
        setIntElement(term48, 3, 731025545);
        setIntElement(term48, 4, -475097163);
        setIntElement(term48, 5, 890127363);
        setField(term46, term46.getClass(), "mag", term48);
        setIntField(term46, term46.getClass(), "bitCountPlusOne", 0);
        setIntField(term46, term46.getClass(), "bitLengthPlusOne", 0);
        setIntField(term46, term46.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term46, term46.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term45, term45.getClass(), "intVal", term46);
        setIntField(term45, term45.getClass(), "scale", 52);
        setIntField(term45, term45.getClass(), "precision", 0);
        setField(term45, term45.getClass(), "stringCache", null);
        setLongField(term45, term45.getClass(), "intCompact", -9223372036854775808L);
        setField(term1, term1.getClass(), "priceDifference", term45);
        setLongField(term1, term1.getClass(), "timeDifference", 2442117782898005296L);
        setField(term1, term1.getClass(), "aggregatedTrade", term63);
        setLongField(term67, term67.getClass(), "fastTime", 1345871412244L);
        setField(term67, term67.getClass(), "cdate", null);
        setField(term1, term1.getClass(), "sellTime", term67);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("arghh.tradetracker.model.Profit");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term1, args);
    }

};


