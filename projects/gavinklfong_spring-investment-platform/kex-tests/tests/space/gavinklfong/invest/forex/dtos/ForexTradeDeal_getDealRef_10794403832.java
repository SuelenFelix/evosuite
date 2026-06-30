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

public class ForexTradeDeal_getDealRef_10794403832 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26306;

    public ForexTradeDeal_getDealRef_10794403832() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term26307 = new Long(-5786861555969446503L);
        Double term26355 = new Double(0.6512870939318848);
        Class<? extends Object> term26415 = Class.forName((String) "space.gavinklfong.invest.forex.dtos.TradeAction");
        Field term26414 = ((Class) term26415).getDeclaredField((String) "SELL");
        ((Field) term26414).setAccessible(true);
        Object enum63 = ((Field) term26414).get((Object) null);
        Long term26382 = new Long(2354625302846375590L);
        term26306 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexTradeDeal"));
        Object term26321 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term26322 = newInstance(Class.forName("java.time.LocalDate"));
        Object term26326 = newInstance(Class.forName("java.time.LocalTime"));
        Object term26365 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term26366 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term26368 = (int[]) newIntArray(6);
        setField(term26306, term26306.getClass(), "id", term26307);
        setField(term26306, term26306.getClass(), "dealRef", "GPSEWEDSTo");
        setIntField(term26322, term26322.getClass(), "year", 2021);
        setShortField(term26322, term26322.getClass(), "month", (short) 9);
        setShortField(term26322, term26322.getClass(), "day", (short) 7);
        setField(term26321, term26321.getClass(), "date", term26322);
        setByteField(term26326, term26326.getClass(), "hour", (byte) 5);
        setByteField(term26326, term26326.getClass(), "minute", (byte) 25);
        setByteField(term26326, term26326.getClass(), "second", (byte) 7);
        setIntField(term26326, term26326.getClass(), "nano", 755924076);
        setField(term26321, term26321.getClass(), "time", term26326);
        setField(term26306, term26306.getClass(), "timestamp", term26321);
        setField(term26306, term26306.getClass(), "baseCurrency", "RCOqfVsRHt");
        setField(term26306, term26306.getClass(), "counterCurrency", "TSyCeEZPaT");
        setField(term26306, term26306.getClass(), "rate", term26355);
        setField(term26306, term26306.getClass(), "tradeAction", enum63);
        setIntField(term26366, term26366.getClass(), "signum", 1);
        setIntElement(term26368, 0, 36308);
        setIntElement(term26368, 1, 1582340785);
        setIntElement(term26368, 2, -1740804909);
        setIntElement(term26368, 3, -1313941430);
        setIntElement(term26368, 4, -799041886);
        setIntElement(term26368, 5, -1009310087);
        setField(term26366, term26366.getClass(), "mag", term26368);
        setIntField(term26366, term26366.getClass(), "bitCountPlusOne", 0);
        setIntField(term26366, term26366.getClass(), "bitLengthPlusOne", 0);
        setIntField(term26366, term26366.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term26366, term26366.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term26365, term26365.getClass(), "intVal", term26366);
        setIntField(term26365, term26365.getClass(), "scale", 53);
        setIntField(term26365, term26365.getClass(), "precision", 0);
        setField(term26365, term26365.getClass(), "stringCache", null);
        setLongField(term26365, term26365.getClass(), "intCompact", -9223372036854775808L);
        setField(term26306, term26306.getClass(), "baseCurrencyAmount", term26365);
        setField(term26306, term26306.getClass(), "customerId", term26382);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexTradeDeal");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDealRef", argTypes, term26306, args);
    }

};


