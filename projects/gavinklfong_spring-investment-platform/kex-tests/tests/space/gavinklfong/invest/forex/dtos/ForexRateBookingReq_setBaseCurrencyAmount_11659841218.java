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
import java.lang.Object;
import java.lang.String;
import java.lang.Long;

public class ForexRateBookingReq_setBaseCurrencyAmount_11659841218 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3647;
     Object term3699;

    public ForexRateBookingReq_setBaseCurrencyAmount_11659841218() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3743 = Class.forName((String) "space.gavinklfong.invest.forex.dtos.TradeAction");
        Field term3742 = ((Class) term3743).getDeclaredField((String) "SELL");
        ((Field) term3742).setAccessible(true);
        Object enum9 = ((Field) term3742).get((Object) null);
        Long term3697 = new Long(6811161968424632369L);
        term3647 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexRateBookingReq"));
        Object term3672 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term3673 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term3675 = (int[]) newIntArray(6);
        setField(term3647, term3647.getClass(), "baseCurrency", "LvtrsXUliU");
        setField(term3647, term3647.getClass(), "counterCurrency", "xLbjWUgOIL");
        setIntField(term3673, term3673.getClass(), "signum", 1);
        setIntElement(term3675, 0, 25264);
        setIntElement(term3675, 1, 13306318);
        setIntElement(term3675, 2, 145344007);
        setIntElement(term3675, 3, -1015263393);
        setIntElement(term3675, 4, -1366378930);
        setIntElement(term3675, 5, 983206517);
        setField(term3673, term3673.getClass(), "mag", term3675);
        setIntField(term3673, term3673.getClass(), "bitCountPlusOne", 0);
        setIntField(term3673, term3673.getClass(), "bitLengthPlusOne", 0);
        setIntField(term3673, term3673.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term3673, term3673.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term3672, term3672.getClass(), "intVal", term3673);
        setIntField(term3672, term3672.getClass(), "scale", 53);
        setIntField(term3672, term3672.getClass(), "precision", 0);
        setField(term3672, term3672.getClass(), "stringCache", null);
        setLongField(term3672, term3672.getClass(), "intCompact", -9223372036854775808L);
        setField(term3647, term3647.getClass(), "baseCurrencyAmount", term3672);
        setField(term3647, term3647.getClass(), "tradeAction", enum9);
        setField(term3647, term3647.getClass(), "customerId", term3697);
        term3699 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term3700 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term3702 = (int[]) newIntArray(6);
        setIntField(term3700, term3700.getClass(), "signum", 1);
        setIntElement(term3702, 0, 4157);
        setIntElement(term3702, 1, -1258399411);
        setIntElement(term3702, 2, -1445096589);
        setIntElement(term3702, 3, 1602721280);
        setIntElement(term3702, 4, 1738795194);
        setIntElement(term3702, 5, -481877419);
        setField(term3700, term3700.getClass(), "mag", term3702);
        setIntField(term3700, term3700.getClass(), "bitCountPlusOne", 0);
        setIntField(term3700, term3700.getClass(), "bitLengthPlusOne", 0);
        setIntField(term3700, term3700.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term3700, term3700.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term3699, term3699.getClass(), "intVal", term3700);
        setIntField(term3699, term3699.getClass(), "scale", 52);
        setIntField(term3699, term3699.getClass(), "precision", 0);
        setField(term3699, term3699.getClass(), "stringCache", null);
        setLongField(term3699, term3699.getClass(), "intCompact", -9223372036854775808L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexRateBookingReq");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.math.BigDecimal");
        Object[] args = new Object[1];
        args[0] = term3699;
        callMethod(klass, "setBaseCurrencyAmount", argTypes, term3647, args);
    }

};


