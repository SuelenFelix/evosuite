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

public class ForexRateBooking_setRate_27270222718 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20620;
     Object term20693;

    public ForexRateBooking_setRate_27270222718() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term20621 = new Long(5510783420697225605L);
        Double term20650 = new Double(0.6767213143579776);
        Class<? extends Object> term20716 = Class.forName((String) "space.gavinklfong.invest.forex.dtos.TradeAction");
        Field term20715 = ((Class) term20716).getDeclaredField((String) "BUY");
        ((Field) term20715).setAccessible(true);
        Object enum50 = ((Field) term20715).get((Object) null);
        Long term20691 = new Long(6005241913654469005L);
        term20620 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexRateBooking"));
        Object term20623 = newInstance(Class.forName("java.time.Instant"));
        Object term20659 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term20660 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term20662 = (int[]) newIntArray(6);
        Object term20688 = newInstance(Class.forName("java.time.Instant"));
        setField(term20620, term20620.getClass(), "id", term20621);
        setLongField(term20623, term20623.getClass(), "seconds", 1464421789L);
        setIntField(term20623, term20623.getClass(), "nanos", 888000000);
        setField(term20620, term20620.getClass(), "timestamp", term20623);
        setField(term20620, term20620.getClass(), "baseCurrency", "ZKMLioamsY");
        setField(term20620, term20620.getClass(), "counterCurrency", "WVbxuoDBcn");
        setField(term20620, term20620.getClass(), "rate", term20650);
        setField(term20620, term20620.getClass(), "tradeAction", enum50);
        setIntField(term20660, term20660.getClass(), "signum", 1);
        setIntElement(term20662, 0, 64140);
        setIntElement(term20662, 1, 1295166792);
        setIntElement(term20662, 2, -622874350);
        setIntElement(term20662, 3, 636973014);
        setIntElement(term20662, 4, -1392727662);
        setIntElement(term20662, 5, 1299679439);
        setField(term20660, term20660.getClass(), "mag", term20662);
        setIntField(term20660, term20660.getClass(), "bitCountPlusOne", 0);
        setIntField(term20660, term20660.getClass(), "bitLengthPlusOne", 0);
        setIntField(term20660, term20660.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term20660, term20660.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term20659, term20659.getClass(), "intVal", term20660);
        setIntField(term20659, term20659.getClass(), "scale", 53);
        setIntField(term20659, term20659.getClass(), "precision", 0);
        setField(term20659, term20659.getClass(), "stringCache", null);
        setLongField(term20659, term20659.getClass(), "intCompact", -9223372036854775808L);
        setField(term20620, term20620.getClass(), "baseCurrencyAmount", term20659);
        setField(term20620, term20620.getClass(), "bookingRef", "pvDEABOxLt");
        setLongField(term20688, term20688.getClass(), "seconds", 1405279189L);
        setIntField(term20688, term20688.getClass(), "nanos", 488000000);
        setField(term20620, term20620.getClass(), "expiryTime", term20688);
        setField(term20620, term20620.getClass(), "customerId", term20691);
        term20693 = new Double(0.48862955528902696);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexRateBooking");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Double");
        Object[] args = new Object[1];
        args[0] = term20693;
        callMethod(klass, "setRate", argTypes, term20620, args);
    }

};


