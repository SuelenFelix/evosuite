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

public class ForexRateBooking_setTradeAction_89711021819 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20982;
     Object enum52;

    public ForexRateBooking_setTradeAction_89711021819() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term20983 = new Long(-1983291584002806658L);
        Double term21012 = new Double(0.426231085465289);
        Class<? extends Object> term21084 = Class.forName((String) "space.gavinklfong.invest.forex.dtos.TradeAction");
        Field term21083 = ((Class) term21084).getDeclaredField((String) "BUY");
        ((Field) term21083).setAccessible(true);
        Object enum51 = ((Field) term21083).get((Object) null);
        Long term21053 = new Long(5946780097489996391L);
        term20982 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexRateBooking"));
        Object term20985 = newInstance(Class.forName("java.time.Instant"));
        Object term21021 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term21022 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term21024 = (int[]) newIntArray(6);
        Object term21050 = newInstance(Class.forName("java.time.Instant"));
        setField(term20982, term20982.getClass(), "id", term20983);
        setLongField(term20985, term20985.getClass(), "seconds", 1822704644L);
        setIntField(term20985, term20985.getClass(), "nanos", 50000000);
        setField(term20982, term20982.getClass(), "timestamp", term20985);
        setField(term20982, term20982.getClass(), "baseCurrency", "beAMpkroCQ");
        setField(term20982, term20982.getClass(), "counterCurrency", "uSUvKAyuvd");
        setField(term20982, term20982.getClass(), "rate", term21012);
        setField(term20982, term20982.getClass(), "tradeAction", enum51);
        setIntField(term21022, term21022.getClass(), "signum", 1);
        setIntElement(term21024, 0, 578);
        setIntElement(term21024, 1, 2128705114);
        setIntElement(term21024, 2, -712640435);
        setIntElement(term21024, 3, 577857247);
        setIntElement(term21024, 4, -1413700914);
        setIntElement(term21024, 5, 1963347493);
        setField(term21022, term21022.getClass(), "mag", term21024);
        setIntField(term21022, term21022.getClass(), "bitCountPlusOne", 0);
        setIntField(term21022, term21022.getClass(), "bitLengthPlusOne", 0);
        setIntField(term21022, term21022.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term21022, term21022.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term21021, term21021.getClass(), "intVal", term21022);
        setIntField(term21021, term21021.getClass(), "scale", 51);
        setIntField(term21021, term21021.getClass(), "precision", 0);
        setField(term21021, term21021.getClass(), "stringCache", null);
        setLongField(term21021, term21021.getClass(), "intCompact", -9223372036854775808L);
        setField(term20982, term20982.getClass(), "baseCurrencyAmount", term21021);
        setField(term20982, term20982.getClass(), "bookingRef", "onQLVONGuf");
        setLongField(term21050, term21050.getClass(), "seconds", 1678177615L);
        setIntField(term21050, term21050.getClass(), "nanos", 298000000);
        setField(term20982, term20982.getClass(), "expiryTime", term21050);
        setField(term20982, term20982.getClass(), "customerId", term21053);
        Class<? extends Object> term21351 = Class.forName((String) "space.gavinklfong.invest.forex.dtos.TradeAction");
        Field term21350 = ((Class) term21351).getDeclaredField((String) "SELL");
        ((Field) term21350).setAccessible(true);
        enum52 = ((Field) term21350).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexRateBooking");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("space.gavinklfong.invest.forex.dtos.TradeAction");
        Object[] args = new Object[1];
        args[0] = enum52;
        callMethod(klass, "setTradeAction", argTypes, term20982, args);
    }

};


