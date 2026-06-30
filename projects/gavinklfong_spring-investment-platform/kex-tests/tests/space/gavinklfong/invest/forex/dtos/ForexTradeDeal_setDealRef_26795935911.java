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

public class ForexTradeDeal_setDealRef_26795935911 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29598;

    public ForexTradeDeal_setDealRef_26795935911() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term29599 = new Long(6273754186658578034L);
        Double term29647 = new Double(0.4772043271031934);
        Class<? extends Object> term29718 = Class.forName((String) "space.gavinklfong.invest.forex.dtos.TradeAction");
        Field term29717 = ((Class) term29718).getDeclaredField((String) "BUY");
        ((Field) term29717).setAccessible(true);
        Object enum72 = ((Field) term29717).get((Object) null);
        Long term29673 = new Long(3620247240684476031L);
        term29598 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexTradeDeal"));
        Object term29613 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term29614 = newInstance(Class.forName("java.time.LocalDate"));
        Object term29618 = newInstance(Class.forName("java.time.LocalTime"));
        Object term29656 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term29657 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term29659 = (int[]) newIntArray(6);
        setField(term29598, term29598.getClass(), "id", term29599);
        setField(term29598, term29598.getClass(), "dealRef", "llRfwANcVF");
        setIntField(term29614, term29614.getClass(), "year", 2015);
        setShortField(term29614, term29614.getClass(), "month", (short) 3);
        setShortField(term29614, term29614.getClass(), "day", (short) 10);
        setField(term29613, term29613.getClass(), "date", term29614);
        setByteField(term29618, term29618.getClass(), "hour", (byte) 23);
        setByteField(term29618, term29618.getClass(), "minute", (byte) 34);
        setByteField(term29618, term29618.getClass(), "second", (byte) 44);
        setIntField(term29618, term29618.getClass(), "nano", 587322824);
        setField(term29613, term29613.getClass(), "time", term29618);
        setField(term29598, term29598.getClass(), "timestamp", term29613);
        setField(term29598, term29598.getClass(), "baseCurrency", "sUEeHQTWkA");
        setField(term29598, term29598.getClass(), "counterCurrency", "BDIRCxAWLA");
        setField(term29598, term29598.getClass(), "rate", term29647);
        setField(term29598, term29598.getClass(), "tradeAction", enum72);
        setIntField(term29657, term29657.getClass(), "signum", 1);
        setIntElement(term29659, 0, 2531);
        setIntElement(term29659, 1, 1414134);
        setIntElement(term29659, 2, -621204468);
        setIntElement(term29659, 3, -1114901499);
        setIntElement(term29659, 4, 1687079292);
        setIntElement(term29659, 5, -788578123);
        setField(term29657, term29657.getClass(), "mag", term29659);
        setIntField(term29657, term29657.getClass(), "bitCountPlusOne", 0);
        setIntField(term29657, term29657.getClass(), "bitLengthPlusOne", 0);
        setIntField(term29657, term29657.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term29657, term29657.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term29656, term29656.getClass(), "intVal", term29657);
        setIntField(term29656, term29656.getClass(), "scale", 53);
        setIntField(term29656, term29656.getClass(), "precision", 0);
        setField(term29656, term29656.getClass(), "stringCache", null);
        setLongField(term29656, term29656.getClass(), "intCompact", -9223372036854775808L);
        setField(term29598, term29598.getClass(), "baseCurrencyAmount", term29656);
        setField(term29598, term29598.getClass(), "customerId", term29673);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexTradeDeal");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "eOJfbiZLnb";
        callMethod(klass, "setDealRef", argTypes, term29598, args);
    }

};


