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

public class ForexRateBooking_ForexRateBookingBuilder_build_174267863711 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38198;

    public ForexRateBooking_ForexRateBookingBuilder_build_174267863711() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term38199 = new Long(-8614778293741404325L);
        Double term38228 = new Double(0.6047138318674447);
        Class<? extends Object> term38293 = Class.forName((String) "space.gavinklfong.invest.forex.dtos.TradeAction");
        Field term38292 = ((Class) term38293).getDeclaredField((String) "SELL");
        ((Field) term38292).setAccessible(true);
        Object enum95 = ((Field) term38292).get((Object) null);
        Long term38270 = new Long(-5447369594017685765L);
        term38198 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexRateBooking$ForexRateBookingBuilder"));
        Object term38201 = newInstance(Class.forName("java.time.Instant"));
        Object term38238 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term38239 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term38241 = (int[]) newIntArray(6);
        Object term38267 = newInstance(Class.forName("java.time.Instant"));
        setField(term38198, term38198.getClass(), "id", term38199);
        setLongField(term38201, term38201.getClass(), "seconds", 1584136591L);
        setIntField(term38201, term38201.getClass(), "nanos", 305000000);
        setField(term38198, term38198.getClass(), "timestamp", term38201);
        setField(term38198, term38198.getClass(), "baseCurrency", "SqjyKmayBx");
        setField(term38198, term38198.getClass(), "counterCurrency", "XjDhvToxJy");
        setField(term38198, term38198.getClass(), "rate", term38228);
        setField(term38198, term38198.getClass(), "tradeAction", enum95);
        setIntField(term38239, term38239.getClass(), "signum", 1);
        setIntElement(term38241, 0, 18358);
        setIntElement(term38241, 1, 453681511);
        setIntElement(term38241, 2, -1864796906);
        setIntElement(term38241, 3, -2098854418);
        setIntElement(term38241, 4, -674540457);
        setIntElement(term38241, 5, -312714327);
        setField(term38239, term38239.getClass(), "mag", term38241);
        setIntField(term38239, term38239.getClass(), "bitCountPlusOne", 0);
        setIntField(term38239, term38239.getClass(), "bitLengthPlusOne", 0);
        setIntField(term38239, term38239.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term38239, term38239.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term38238, term38238.getClass(), "intVal", term38239);
        setIntField(term38238, term38238.getClass(), "scale", 53);
        setIntField(term38238, term38238.getClass(), "precision", 0);
        setField(term38238, term38238.getClass(), "stringCache", null);
        setLongField(term38238, term38238.getClass(), "intCompact", -9223372036854775808L);
        setField(term38198, term38198.getClass(), "baseCurrencyAmount", term38238);
        setField(term38198, term38198.getClass(), "bookingRef", "nxSTJflLQy");
        setLongField(term38267, term38267.getClass(), "seconds", 1309132342L);
        setIntField(term38267, term38267.getClass(), "nanos", 717000000);
        setField(term38198, term38198.getClass(), "expiryTime", term38267);
        setField(term38198, term38198.getClass(), "customerId", term38270);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexRateBooking$ForexRateBookingBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term38198, args);
    }

};


