package space.gavinklfong.invest.forex.dtos;

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
import static space.gavinklfong.invest.forex.dtos.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Double;
import java.lang.String;
import java.lang.Object;
import java.lang.Long;

public class ForexTradeDealReq_ForexTradeDealReqBuilder_rate_13512929563 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46873;
     Object term46938;

    public ForexTradeDealReq_ForexTradeDealReqBuilder_rate_13512929563() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term46898 = new Double(0.36312400202399575);
        Class<? extends Object> term46961 = Class.forName((String) "space.gavinklfong.invest.forex.dtos.TradeAction");
        Field term46960 = ((Class) term46961).getDeclaredField((String) "BUY");
        ((Field) term46960).setAccessible(true);
        Object enum118 = ((Field) term46960).get((Object) null);
        Long term46924 = new Long(8540994973773607992L);
        term46873 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexTradeDealReq$ForexTradeDealReqBuilder"));
        Object term46907 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term46908 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term46910 = (int[]) newIntArray(6);
        setField(term46873, term46873.getClass(), "baseCurrency", "mfHtgSbdjD");
        setField(term46873, term46873.getClass(), "counterCurrency", "cmuaUiHMVL");
        setField(term46873, term46873.getClass(), "rate", term46898);
        setField(term46873, term46873.getClass(), "tradeAction", enum118);
        setIntField(term46908, term46908.getClass(), "signum", 1);
        setIntElement(term46910, 0, 4023);
        setIntElement(term46910, 1, -1067188662);
        setIntElement(term46910, 2, 1387789178);
        setIntElement(term46910, 3, -1376108851);
        setIntElement(term46910, 4, 624117249);
        setIntElement(term46910, 5, -503987355);
        setField(term46908, term46908.getClass(), "mag", term46910);
        setIntField(term46908, term46908.getClass(), "bitCountPlusOne", 0);
        setIntField(term46908, term46908.getClass(), "bitLengthPlusOne", 0);
        setIntField(term46908, term46908.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term46908, term46908.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term46907, term46907.getClass(), "intVal", term46908);
        setIntField(term46907, term46907.getClass(), "scale", 53);
        setIntField(term46907, term46907.getClass(), "precision", 0);
        setField(term46907, term46907.getClass(), "stringCache", null);
        setLongField(term46907, term46907.getClass(), "intCompact", -9223372036854775808L);
        setField(term46873, term46873.getClass(), "baseCurrencyAmount", term46907);
        setField(term46873, term46873.getClass(), "customerId", term46924);
        setField(term46873, term46873.getClass(), "rateBookingRef", "xjoSGPWUgu");
        term46938 = new Double(0.5485690030548175);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexTradeDealReq$ForexTradeDealReqBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Double");
        Object[] args = new Object[1];
        args[0] = term46938;
        callMethod(klass, "rate", argTypes, term46873, args);
    }

};


