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

public class ForexTradeDeal_ForexTradeDealBuilder_id_10706894841 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6586;
     Object term6664;

    public ForexTradeDeal_ForexTradeDealBuilder_id_10706894841() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term6587 = new Long(-316468845751588286L);
        Double term6635 = new Double(0.13238746331190498);
        Class<? extends Object> term6697 = Class.forName((String) "space.gavinklfong.invest.forex.dtos.TradeAction");
        Field term6696 = ((Class) term6697).getDeclaredField((String) "SELL");
        ((Field) term6696).setAccessible(true);
        Object enum18 = ((Field) term6696).get((Object) null);
        Long term6662 = new Long(5127676408959197577L);
        term6586 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexTradeDeal$ForexTradeDealBuilder"));
        Object term6601 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6602 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6606 = newInstance(Class.forName("java.time.LocalTime"));
        Object term6645 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term6646 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term6648 = (int[]) newIntArray(6);
        setField(term6586, term6586.getClass(), "id", term6587);
        setField(term6586, term6586.getClass(), "dealRef", "eqJfYWRaEL");
        setIntField(term6602, term6602.getClass(), "year", 2012);
        setShortField(term6602, term6602.getClass(), "month", (short) 8);
        setShortField(term6602, term6602.getClass(), "day", (short) 25);
        setField(term6601, term6601.getClass(), "date", term6602);
        setByteField(term6606, term6606.getClass(), "hour", (byte) 5);
        setByteField(term6606, term6606.getClass(), "minute", (byte) 20);
        setByteField(term6606, term6606.getClass(), "second", (byte) 50);
        setIntField(term6606, term6606.getClass(), "nano", 345595912);
        setField(term6601, term6601.getClass(), "time", term6606);
        setField(term6586, term6586.getClass(), "timestamp", term6601);
        setField(term6586, term6586.getClass(), "baseCurrency", "fhkbdRViHi");
        setField(term6586, term6586.getClass(), "counterCurrency", "uWHnvSvaPl");
        setField(term6586, term6586.getClass(), "rate", term6635);
        setField(term6586, term6586.getClass(), "tradeAction", enum18);
        setIntField(term6646, term6646.getClass(), "signum", 1);
        setIntElement(term6648, 0, 6724);
        setIntElement(term6648, 1, -459858691);
        setIntElement(term6648, 2, -950374219);
        setIntElement(term6648, 3, -1430160029);
        setIntElement(term6648, 4, 1532735250);
        setIntElement(term6648, 5, 890914777);
        setField(term6646, term6646.getClass(), "mag", term6648);
        setIntField(term6646, term6646.getClass(), "bitCountPlusOne", 0);
        setIntField(term6646, term6646.getClass(), "bitLengthPlusOne", 0);
        setIntField(term6646, term6646.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term6646, term6646.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term6645, term6645.getClass(), "intVal", term6646);
        setIntField(term6645, term6645.getClass(), "scale", 52);
        setIntField(term6645, term6645.getClass(), "precision", 0);
        setField(term6645, term6645.getClass(), "stringCache", null);
        setLongField(term6645, term6645.getClass(), "intCompact", -9223372036854775808L);
        setField(term6586, term6586.getClass(), "baseCurrencyAmount", term6645);
        setField(term6586, term6586.getClass(), "customerId", term6662);
        term6664 = new Long(-6573104506744284592L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexTradeDeal$ForexTradeDealBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term6664;
        callMethod(klass, "id", argTypes, term6586, args);
    }

};


