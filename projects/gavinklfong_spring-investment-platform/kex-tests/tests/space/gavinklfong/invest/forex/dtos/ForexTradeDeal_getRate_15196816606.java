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

public class ForexTradeDeal_getRate_15196816606 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27768;

    public ForexTradeDeal_getRate_15196816606() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term27769 = new Long(1667122142089513324L);
        Double term27817 = new Double(0.3710067290060264);
        Class<? extends Object> term27877 = Class.forName((String) "space.gavinklfong.invest.forex.dtos.TradeAction");
        Field term27876 = ((Class) term27877).getDeclaredField((String) "SELL");
        ((Field) term27876).setAccessible(true);
        Object enum67 = ((Field) term27876).get((Object) null);
        Long term27844 = new Long(-6342139649364011743L);
        term27768 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexTradeDeal"));
        Object term27783 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term27784 = newInstance(Class.forName("java.time.LocalDate"));
        Object term27788 = newInstance(Class.forName("java.time.LocalTime"));
        Object term27827 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term27828 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term27830 = (int[]) newIntArray(6);
        setField(term27768, term27768.getClass(), "id", term27769);
        setField(term27768, term27768.getClass(), "dealRef", "qFGKIJjlmV");
        setIntField(term27784, term27784.getClass(), "year", 2029);
        setShortField(term27784, term27784.getClass(), "month", (short) 6);
        setShortField(term27784, term27784.getClass(), "day", (short) 23);
        setField(term27783, term27783.getClass(), "date", term27784);
        setByteField(term27788, term27788.getClass(), "hour", (byte) 21);
        setByteField(term27788, term27788.getClass(), "minute", (byte) 55);
        setByteField(term27788, term27788.getClass(), "second", (byte) 27);
        setIntField(term27788, term27788.getClass(), "nano", 66889274);
        setField(term27783, term27783.getClass(), "time", term27788);
        setField(term27768, term27768.getClass(), "timestamp", term27783);
        setField(term27768, term27768.getClass(), "baseCurrency", "IHqvyhMtuM");
        setField(term27768, term27768.getClass(), "counterCurrency", "dAldIGYAXV");
        setField(term27768, term27768.getClass(), "rate", term27817);
        setField(term27768, term27768.getClass(), "tradeAction", enum67);
        setIntField(term27828, term27828.getClass(), "signum", 1);
        setIntElement(term27830, 0, 36321);
        setIntElement(term27830, 1, 890586911);
        setIntElement(term27830, 2, 533461247);
        setIntElement(term27830, 3, -197479270);
        setIntElement(term27830, 4, 441193201);
        setIntElement(term27830, 5, 1818442159);
        setField(term27828, term27828.getClass(), "mag", term27830);
        setIntField(term27828, term27828.getClass(), "bitCountPlusOne", 0);
        setIntField(term27828, term27828.getClass(), "bitLengthPlusOne", 0);
        setIntField(term27828, term27828.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term27828, term27828.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term27827, term27827.getClass(), "intVal", term27828);
        setIntField(term27827, term27827.getClass(), "scale", 53);
        setIntField(term27827, term27827.getClass(), "precision", 0);
        setField(term27827, term27827.getClass(), "stringCache", null);
        setLongField(term27827, term27827.getClass(), "intCompact", -9223372036854775808L);
        setField(term27768, term27768.getClass(), "baseCurrencyAmount", term27827);
        setField(term27768, term27768.getClass(), "customerId", term27844);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexTradeDeal");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRate", argTypes, term27768, args);
    }

};


