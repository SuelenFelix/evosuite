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

public class ForexTradeDeal_ForexTradeDealBuilder_build_45671309810 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9991;

    public ForexTradeDeal_ForexTradeDealBuilder_build_45671309810() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term9992 = new Long(6617340557564669657L);
        Double term10040 = new Double(0.8474802076607362);
        Class<? extends Object> term10099 = Class.forName((String) "space.gavinklfong.invest.forex.dtos.TradeAction");
        Field term10098 = ((Class) term10099).getDeclaredField((String) "BUY");
        ((Field) term10098).setAccessible(true);
        Object enum27 = ((Field) term10098).get((Object) null);
        Long term10066 = new Long(1439298019805881866L);
        term9991 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexTradeDeal$ForexTradeDealBuilder"));
        Object term10006 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term10007 = newInstance(Class.forName("java.time.LocalDate"));
        Object term10011 = newInstance(Class.forName("java.time.LocalTime"));
        Object term10049 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term10050 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term10052 = (int[]) newIntArray(6);
        setField(term9991, term9991.getClass(), "id", term9992);
        setField(term9991, term9991.getClass(), "dealRef", "JqXGgAhZPl");
        setIntField(term10007, term10007.getClass(), "year", 2019);
        setShortField(term10007, term10007.getClass(), "month", (short) 2);
        setShortField(term10007, term10007.getClass(), "day", (short) 21);
        setField(term10006, term10006.getClass(), "date", term10007);
        setByteField(term10011, term10011.getClass(), "hour", (byte) 5);
        setByteField(term10011, term10011.getClass(), "minute", (byte) 41);
        setByteField(term10011, term10011.getClass(), "second", (byte) 11);
        setIntField(term10011, term10011.getClass(), "nano", 859829782);
        setField(term10006, term10006.getClass(), "time", term10011);
        setField(term9991, term9991.getClass(), "timestamp", term10006);
        setField(term9991, term9991.getClass(), "baseCurrency", "jiKYgYHqIS");
        setField(term9991, term9991.getClass(), "counterCurrency", "DfISiziTgG");
        setField(term9991, term9991.getClass(), "rate", term10040);
        setField(term9991, term9991.getClass(), "tradeAction", enum27);
        setIntField(term10050, term10050.getClass(), "signum", 1);
        setIntElement(term10052, 0, 3996);
        setIntElement(term10052, 1, 1627046923);
        setIntElement(term10052, 2, -1280614629);
        setIntElement(term10052, 3, 917260100);
        setIntElement(term10052, 4, -74841886);
        setIntElement(term10052, 5, 597293319);
        setField(term10050, term10050.getClass(), "mag", term10052);
        setIntField(term10050, term10050.getClass(), "bitCountPlusOne", 0);
        setIntField(term10050, term10050.getClass(), "bitLengthPlusOne", 0);
        setIntField(term10050, term10050.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term10050, term10050.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term10049, term10049.getClass(), "intVal", term10050);
        setIntField(term10049, term10049.getClass(), "scale", 52);
        setIntField(term10049, term10049.getClass(), "precision", 0);
        setField(term10049, term10049.getClass(), "stringCache", null);
        setLongField(term10049, term10049.getClass(), "intCompact", -9223372036854775808L);
        setField(term9991, term9991.getClass(), "baseCurrencyAmount", term10049);
        setField(term9991, term9991.getClass(), "customerId", term10066);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexTradeDeal$ForexTradeDealBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term9991, args);
    }

};


