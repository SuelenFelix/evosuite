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
import java.lang.Long;
import java.lang.Object;
import java.lang.Double;
import java.lang.String;

public class ForexRateBooking_hashCode_64885698726 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23824;

    public ForexRateBooking_hashCode_64885698726() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term23825 = new Long(-8085190702504231560L);
        Double term23854 = new Double(0.146431486357265);
        Class<? extends Object> term23918 = Class.forName((String) "space.gavinklfong.invest.forex.dtos.TradeAction");
        Field term23917 = ((Class) term23918).getDeclaredField((String) "BUY");
        ((Field) term23917).setAccessible(true);
        Object enum59 = ((Field) term23917).get((Object) null);
        Long term23895 = new Long(1672578078364590450L);
        term23824 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexRateBooking"));
        Object term23827 = newInstance(Class.forName("java.time.Instant"));
        Object term23863 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term23864 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term23866 = (int[]) newIntArray(6);
        Object term23892 = newInstance(Class.forName("java.time.Instant"));
        setField(term23824, term23824.getClass(), "id", term23825);
        setLongField(term23827, term23827.getClass(), "seconds", 1628695316L);
        setIntField(term23827, term23827.getClass(), "nanos", 832000000);
        setField(term23824, term23824.getClass(), "timestamp", term23827);
        setField(term23824, term23824.getClass(), "baseCurrency", "tsTGdgQYUL");
        setField(term23824, term23824.getClass(), "counterCurrency", "TtGbVmKcnX");
        setField(term23824, term23824.getClass(), "rate", term23854);
        setField(term23824, term23824.getClass(), "tradeAction", enum59);
        setIntField(term23864, term23864.getClass(), "signum", 1);
        setIntElement(term23866, 0, 29652);
        setIntElement(term23866, 1, -2060047100);
        setIntElement(term23866, 2, 1632887548);
        setIntElement(term23866, 3, 552729650);
        setIntElement(term23866, 4, 1012508025);
        setIntElement(term23866, 5, 1261026219);
        setField(term23864, term23864.getClass(), "mag", term23866);
        setIntField(term23864, term23864.getClass(), "bitCountPlusOne", 0);
        setIntField(term23864, term23864.getClass(), "bitLengthPlusOne", 0);
        setIntField(term23864, term23864.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term23864, term23864.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term23863, term23863.getClass(), "intVal", term23864);
        setIntField(term23863, term23863.getClass(), "scale", 53);
        setIntField(term23863, term23863.getClass(), "precision", 0);
        setField(term23863, term23863.getClass(), "stringCache", null);
        setLongField(term23863, term23863.getClass(), "intCompact", -9223372036854775808L);
        setField(term23824, term23824.getClass(), "baseCurrencyAmount", term23863);
        setField(term23824, term23824.getClass(), "bookingRef", "GJVkUrCVdD");
        setLongField(term23892, term23892.getClass(), "seconds", 1393200035L);
        setIntField(term23892, term23892.getClass(), "nanos", 243000000);
        setField(term23824, term23824.getClass(), "expiryTime", term23892);
        setField(term23824, term23824.getClass(), "customerId", term23895);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexRateBooking");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term23824, args);
    }

};


