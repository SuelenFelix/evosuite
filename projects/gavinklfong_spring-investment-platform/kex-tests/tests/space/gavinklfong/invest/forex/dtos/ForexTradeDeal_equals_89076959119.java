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

public class ForexTradeDeal_equals_89076959119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32621;
     Object term32698;

    public ForexTradeDeal_equals_89076959119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term32622 = new Long(8034714140377562739L);
        Double term32670 = new Double(0.7507333108648018);
        Class<? extends Object> term32730 = Class.forName((String) "space.gavinklfong.invest.forex.dtos.TradeAction");
        Field term32729 = ((Class) term32730).getDeclaredField((String) "BUY");
        ((Field) term32729).setAccessible(true);
        Object enum80 = ((Field) term32729).get((Object) null);
        Long term32696 = new Long(-2924531382671518368L);
        term32621 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexTradeDeal"));
        Object term32636 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term32637 = newInstance(Class.forName("java.time.LocalDate"));
        Object term32641 = newInstance(Class.forName("java.time.LocalTime"));
        Object term32679 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term32680 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term32682 = (int[]) newIntArray(6);
        setField(term32621, term32621.getClass(), "id", term32622);
        setField(term32621, term32621.getClass(), "dealRef", "OzXRsFGTIp");
        setIntField(term32637, term32637.getClass(), "year", 2012);
        setShortField(term32637, term32637.getClass(), "month", (short) 8);
        setShortField(term32637, term32637.getClass(), "day", (short) 25);
        setField(term32636, term32636.getClass(), "date", term32637);
        setByteField(term32641, term32641.getClass(), "hour", (byte) 19);
        setByteField(term32641, term32641.getClass(), "minute", (byte) 49);
        setByteField(term32641, term32641.getClass(), "second", (byte) 8);
        setIntField(term32641, term32641.getClass(), "nano", 912685024);
        setField(term32636, term32636.getClass(), "time", term32641);
        setField(term32621, term32621.getClass(), "timestamp", term32636);
        setField(term32621, term32621.getClass(), "baseCurrency", "TjWpyghUWN");
        setField(term32621, term32621.getClass(), "counterCurrency", "dkZFDZxcde");
        setField(term32621, term32621.getClass(), "rate", term32670);
        setField(term32621, term32621.getClass(), "tradeAction", enum80);
        setIntField(term32680, term32680.getClass(), "signum", 1);
        setIntElement(term32682, 0, 22057);
        setIntElement(term32682, 1, -716778402);
        setIntElement(term32682, 2, 987820395);
        setIntElement(term32682, 3, 841089094);
        setIntElement(term32682, 4, 1231499164);
        setIntElement(term32682, 5, -164218385);
        setField(term32680, term32680.getClass(), "mag", term32682);
        setIntField(term32680, term32680.getClass(), "bitCountPlusOne", 0);
        setIntField(term32680, term32680.getClass(), "bitLengthPlusOne", 0);
        setIntField(term32680, term32680.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term32680, term32680.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term32679, term32679.getClass(), "intVal", term32680);
        setIntField(term32679, term32679.getClass(), "scale", 53);
        setIntField(term32679, term32679.getClass(), "precision", 0);
        setField(term32679, term32679.getClass(), "stringCache", null);
        setLongField(term32679, term32679.getClass(), "intCompact", -9223372036854775808L);
        setField(term32621, term32621.getClass(), "baseCurrencyAmount", term32679);
        setField(term32621, term32621.getClass(), "customerId", term32696);
        term32698 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexTradeDeal");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term32698;
        callMethod(klass, "equals", argTypes, term32621, args);
    }

};


