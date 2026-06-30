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

public class ForexTradeDeal_getTradeAction_16499001557 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28136;

    public ForexTradeDeal_getTradeAction_16499001557() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term28137 = new Long(-4924950707540628022L);
        Double term28185 = new Double(0.7818620200430967);
        Class<? extends Object> term28245 = Class.forName((String) "space.gavinklfong.invest.forex.dtos.TradeAction");
        Field term28244 = ((Class) term28245).getDeclaredField((String) "SELL");
        ((Field) term28244).setAccessible(true);
        Object enum68 = ((Field) term28244).get((Object) null);
        Long term28212 = new Long(-4393710401270724527L);
        term28136 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexTradeDeal"));
        Object term28151 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term28152 = newInstance(Class.forName("java.time.LocalDate"));
        Object term28156 = newInstance(Class.forName("java.time.LocalTime"));
        Object term28195 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term28196 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term28198 = (int[]) newIntArray(6);
        setField(term28136, term28136.getClass(), "id", term28137);
        setField(term28136, term28136.getClass(), "dealRef", "mLwibAPEsa");
        setIntField(term28152, term28152.getClass(), "year", 2017);
        setShortField(term28152, term28152.getClass(), "month", (short) 3);
        setShortField(term28152, term28152.getClass(), "day", (short) 5);
        setField(term28151, term28151.getClass(), "date", term28152);
        setByteField(term28156, term28156.getClass(), "hour", (byte) 20);
        setByteField(term28156, term28156.getClass(), "minute", (byte) 34);
        setByteField(term28156, term28156.getClass(), "second", (byte) 55);
        setIntField(term28156, term28156.getClass(), "nano", 78024496);
        setField(term28151, term28151.getClass(), "time", term28156);
        setField(term28136, term28136.getClass(), "timestamp", term28151);
        setField(term28136, term28136.getClass(), "baseCurrency", "zsWKWiTFuo");
        setField(term28136, term28136.getClass(), "counterCurrency", "UPUbwyHQKN");
        setField(term28136, term28136.getClass(), "rate", term28185);
        setField(term28136, term28136.getClass(), "tradeAction", enum68);
        setIntField(term28196, term28196.getClass(), "signum", 1);
        setIntElement(term28198, 0, 4);
        setIntElement(term28198, 1, -448781957);
        setIntElement(term28198, 2, 955142502);
        setIntElement(term28198, 3, -1250231940);
        setIntElement(term28198, 4, 1125474925);
        setIntElement(term28198, 5, 1350206369);
        setField(term28196, term28196.getClass(), "mag", term28198);
        setIntField(term28196, term28196.getClass(), "bitCountPlusOne", 0);
        setIntField(term28196, term28196.getClass(), "bitLengthPlusOne", 0);
        setIntField(term28196, term28196.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term28196, term28196.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term28195, term28195.getClass(), "intVal", term28196);
        setIntField(term28195, term28195.getClass(), "scale", 49);
        setIntField(term28195, term28195.getClass(), "precision", 0);
        setField(term28195, term28195.getClass(), "stringCache", null);
        setLongField(term28195, term28195.getClass(), "intCompact", -9223372036854775808L);
        setField(term28136, term28136.getClass(), "baseCurrencyAmount", term28195);
        setField(term28136, term28136.getClass(), "customerId", term28212);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexTradeDeal");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTradeAction", argTypes, term28136, args);
    }

};


