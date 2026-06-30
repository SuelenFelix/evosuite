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

public class ForexRateBookingReq_hashCode_186514605313 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5584;

    public ForexRateBookingReq_hashCode_186514605313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term5663 = Class.forName((String) "space.gavinklfong.invest.forex.dtos.TradeAction");
        Field term5662 = ((Class) term5663).getDeclaredField((String) "SELL");
        ((Field) term5662).setAccessible(true);
        Object enum15 = ((Field) term5662).get((Object) null);
        Long term5634 = new Long(2535595959091595249L);
        term5584 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexRateBookingReq"));
        Object term5609 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term5610 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term5612 = (int[]) newIntArray(6);
        setField(term5584, term5584.getClass(), "baseCurrency", "MLqYREekMl");
        setField(term5584, term5584.getClass(), "counterCurrency", "ytSBIKXogI");
        setIntField(term5610, term5610.getClass(), "signum", 1);
        setIntElement(term5612, 0, 9405);
        setIntElement(term5612, 1, 205999050);
        setIntElement(term5612, 2, 647637684);
        setIntElement(term5612, 3, -896420066);
        setIntElement(term5612, 4, 1280002914);
        setIntElement(term5612, 5, 183404747);
        setField(term5610, term5610.getClass(), "mag", term5612);
        setIntField(term5610, term5610.getClass(), "bitCountPlusOne", 0);
        setIntField(term5610, term5610.getClass(), "bitLengthPlusOne", 0);
        setIntField(term5610, term5610.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term5610, term5610.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term5609, term5609.getClass(), "intVal", term5610);
        setIntField(term5609, term5609.getClass(), "scale", 53);
        setIntField(term5609, term5609.getClass(), "precision", 0);
        setField(term5609, term5609.getClass(), "stringCache", null);
        setLongField(term5609, term5609.getClass(), "intCompact", -9223372036854775808L);
        setField(term5584, term5584.getClass(), "baseCurrencyAmount", term5609);
        setField(term5584, term5584.getClass(), "tradeAction", enum15);
        setField(term5584, term5584.getClass(), "customerId", term5634);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexRateBookingReq");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term5584, args);
    }

};


