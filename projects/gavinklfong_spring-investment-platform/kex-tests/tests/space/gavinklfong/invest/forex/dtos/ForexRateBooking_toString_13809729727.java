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

public class ForexRateBooking_toString_13809729727 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24184;

    public ForexRateBooking_toString_13809729727() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term24185 = new Long(4949335493504695457L);
        Double term24214 = new Double(0.24259014218848696);
        Class<? extends Object> term24278 = Class.forName((String) "space.gavinklfong.invest.forex.dtos.TradeAction");
        Field term24277 = ((Class) term24278).getDeclaredField((String) "BUY");
        ((Field) term24277).setAccessible(true);
        Object enum60 = ((Field) term24277).get((Object) null);
        Long term24255 = new Long(-5216789073301458893L);
        term24184 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexRateBooking"));
        Object term24187 = newInstance(Class.forName("java.time.Instant"));
        Object term24223 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term24224 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term24226 = (int[]) newIntArray(6);
        Object term24252 = newInstance(Class.forName("java.time.Instant"));
        setField(term24184, term24184.getClass(), "id", term24185);
        setLongField(term24187, term24187.getClass(), "seconds", 1762147441L);
        setIntField(term24187, term24187.getClass(), "nanos", 299000000);
        setField(term24184, term24184.getClass(), "timestamp", term24187);
        setField(term24184, term24184.getClass(), "baseCurrency", "zNdorvdUgu");
        setField(term24184, term24184.getClass(), "counterCurrency", "oPxuZbkYio");
        setField(term24184, term24184.getClass(), "rate", term24214);
        setField(term24184, term24184.getClass(), "tradeAction", enum60);
        setIntField(term24224, term24224.getClass(), "signum", 1);
        setIntElement(term24226, 0, 9063);
        setIntElement(term24226, 1, -150290599);
        setIntElement(term24226, 2, 295110779);
        setIntElement(term24226, 3, 268633793);
        setIntElement(term24226, 4, -1292667480);
        setIntElement(term24226, 5, 2137028287);
        setField(term24224, term24224.getClass(), "mag", term24226);
        setIntField(term24224, term24224.getClass(), "bitCountPlusOne", 0);
        setIntField(term24224, term24224.getClass(), "bitLengthPlusOne", 0);
        setIntField(term24224, term24224.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term24224, term24224.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term24223, term24223.getClass(), "intVal", term24224);
        setIntField(term24223, term24223.getClass(), "scale", 53);
        setIntField(term24223, term24223.getClass(), "precision", 0);
        setField(term24223, term24223.getClass(), "stringCache", null);
        setLongField(term24223, term24223.getClass(), "intCompact", -9223372036854775808L);
        setField(term24184, term24184.getClass(), "baseCurrencyAmount", term24223);
        setField(term24184, term24184.getClass(), "bookingRef", "vKitydDVnM");
        setLongField(term24252, term24252.getClass(), "seconds", 1395479491L);
        setIntField(term24252, term24252.getClass(), "nanos", 666000000);
        setField(term24184, term24184.getClass(), "expiryTime", term24252);
        setField(term24184, term24184.getClass(), "customerId", term24255);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexRateBooking");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term24184, args);
    }

};


