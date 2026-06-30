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

public class ForexRateBooking_setBaseCurrencyAmount_134801891920 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21604;
     Object term21677;

    public ForexRateBooking_setBaseCurrencyAmount_134801891920() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term21605 = new Long(-8652538484981166496L);
        Double term21634 = new Double(0.0027299293098262956);
        Class<? extends Object> term21715 = Class.forName((String) "space.gavinklfong.invest.forex.dtos.TradeAction");
        Field term21714 = ((Class) term21715).getDeclaredField((String) "BUY");
        ((Field) term21714).setAccessible(true);
        Object enum53 = ((Field) term21714).get((Object) null);
        Long term21675 = new Long(2701184207686293431L);
        term21604 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexRateBooking"));
        Object term21607 = newInstance(Class.forName("java.time.Instant"));
        Object term21643 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term21644 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term21646 = (int[]) newIntArray(6);
        Object term21672 = newInstance(Class.forName("java.time.Instant"));
        setField(term21604, term21604.getClass(), "id", term21605);
        setLongField(term21607, term21607.getClass(), "seconds", 1666076287L);
        setIntField(term21607, term21607.getClass(), "nanos", 186000000);
        setField(term21604, term21604.getClass(), "timestamp", term21607);
        setField(term21604, term21604.getClass(), "baseCurrency", "SOrEHbcbmn");
        setField(term21604, term21604.getClass(), "counterCurrency", "bnsyeQXFdu");
        setField(term21604, term21604.getClass(), "rate", term21634);
        setField(term21604, term21604.getClass(), "tradeAction", enum53);
        setIntField(term21644, term21644.getClass(), "signum", 1);
        setIntElement(term21646, 0, 58614);
        setIntElement(term21646, 1, -709694229);
        setIntElement(term21646, 2, 1407215675);
        setIntElement(term21646, 3, -239411125);
        setIntElement(term21646, 4, -1649217575);
        setIntElement(term21646, 5, 483357507);
        setField(term21644, term21644.getClass(), "mag", term21646);
        setIntField(term21644, term21644.getClass(), "bitCountPlusOne", 0);
        setIntField(term21644, term21644.getClass(), "bitLengthPlusOne", 0);
        setIntField(term21644, term21644.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term21644, term21644.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term21643, term21643.getClass(), "intVal", term21644);
        setIntField(term21643, term21643.getClass(), "scale", 53);
        setIntField(term21643, term21643.getClass(), "precision", 0);
        setField(term21643, term21643.getClass(), "stringCache", null);
        setLongField(term21643, term21643.getClass(), "intCompact", -9223372036854775808L);
        setField(term21604, term21604.getClass(), "baseCurrencyAmount", term21643);
        setField(term21604, term21604.getClass(), "bookingRef", "BwtdjiefJn");
        setLongField(term21672, term21672.getClass(), "seconds", 1426018874L);
        setIntField(term21672, term21672.getClass(), "nanos", 434000000);
        setField(term21604, term21604.getClass(), "expiryTime", term21672);
        setField(term21604, term21604.getClass(), "customerId", term21675);
        term21677 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term21678 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term21680 = (int[]) newIntArray(6);
        setIntField(term21678, term21678.getClass(), "signum", 1);
        setIntElement(term21680, 0, 6297);
        setIntElement(term21680, 1, 2144014472);
        setIntElement(term21680, 2, -314503122);
        setIntElement(term21680, 3, 1351966126);
        setIntElement(term21680, 4, 1891335233);
        setIntElement(term21680, 5, -318624823);
        setField(term21678, term21678.getClass(), "mag", term21680);
        setIntField(term21678, term21678.getClass(), "bitCountPlusOne", 0);
        setIntField(term21678, term21678.getClass(), "bitLengthPlusOne", 0);
        setIntField(term21678, term21678.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term21678, term21678.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term21677, term21677.getClass(), "intVal", term21678);
        setIntField(term21677, term21677.getClass(), "scale", 52);
        setIntField(term21677, term21677.getClass(), "precision", 0);
        setField(term21677, term21677.getClass(), "stringCache", null);
        setLongField(term21677, term21677.getClass(), "intCompact", -9223372036854775808L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexRateBooking");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.math.BigDecimal");
        Object[] args = new Object[1];
        args[0] = term21677;
        callMethod(klass, "setBaseCurrencyAmount", argTypes, term21604, args);
    }

};


