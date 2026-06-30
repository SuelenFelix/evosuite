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

public class ForexTradeDeal_hashCode_44208291621 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33355;

    public ForexTradeDeal_hashCode_44208291621() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term33356 = new Long(-6301101997917060727L);
        Double term33404 = new Double(0.29172553321356776);
        Class<? extends Object> term33463 = Class.forName((String) "space.gavinklfong.invest.forex.dtos.TradeAction");
        Field term33462 = ((Class) term33463).getDeclaredField((String) "BUY");
        ((Field) term33462).setAccessible(true);
        Object enum82 = ((Field) term33462).get((Object) null);
        Long term33430 = new Long(8166095254618543564L);
        term33355 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexTradeDeal"));
        Object term33370 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term33371 = newInstance(Class.forName("java.time.LocalDate"));
        Object term33375 = newInstance(Class.forName("java.time.LocalTime"));
        Object term33413 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term33414 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term33416 = (int[]) newIntArray(6);
        setField(term33355, term33355.getClass(), "id", term33356);
        setField(term33355, term33355.getClass(), "dealRef", "OUeBWNTQDh");
        setIntField(term33371, term33371.getClass(), "year", 2010);
        setShortField(term33371, term33371.getClass(), "month", (short) 6);
        setShortField(term33371, term33371.getClass(), "day", (short) 14);
        setField(term33370, term33370.getClass(), "date", term33371);
        setByteField(term33375, term33375.getClass(), "hour", (byte) 6);
        setByteField(term33375, term33375.getClass(), "minute", (byte) 22);
        setByteField(term33375, term33375.getClass(), "second", (byte) 20);
        setIntField(term33375, term33375.getClass(), "nano", 25133051);
        setField(term33370, term33370.getClass(), "time", term33375);
        setField(term33355, term33355.getClass(), "timestamp", term33370);
        setField(term33355, term33355.getClass(), "baseCurrency", "gltJarNuUk");
        setField(term33355, term33355.getClass(), "counterCurrency", "ZwZIDwYcSW");
        setField(term33355, term33355.getClass(), "rate", term33404);
        setField(term33355, term33355.getClass(), "tradeAction", enum82);
        setIntField(term33414, term33414.getClass(), "signum", 1);
        setIntElement(term33416, 0, 10019);
        setIntElement(term33416, 1, 1068910244);
        setIntElement(term33416, 2, -144922776);
        setIntElement(term33416, 3, 1698242623);
        setIntElement(term33416, 4, -217106671);
        setIntElement(term33416, 5, 25951329);
        setField(term33414, term33414.getClass(), "mag", term33416);
        setIntField(term33414, term33414.getClass(), "bitCountPlusOne", 0);
        setIntField(term33414, term33414.getClass(), "bitLengthPlusOne", 0);
        setIntField(term33414, term33414.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term33414, term33414.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term33413, term33413.getClass(), "intVal", term33414);
        setIntField(term33413, term33413.getClass(), "scale", 53);
        setIntField(term33413, term33413.getClass(), "precision", 0);
        setField(term33413, term33413.getClass(), "stringCache", null);
        setLongField(term33413, term33413.getClass(), "intCompact", -9223372036854775808L);
        setField(term33355, term33355.getClass(), "baseCurrencyAmount", term33413);
        setField(term33355, term33355.getClass(), "customerId", term33430);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexTradeDeal");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term33355, args);
    }

};


