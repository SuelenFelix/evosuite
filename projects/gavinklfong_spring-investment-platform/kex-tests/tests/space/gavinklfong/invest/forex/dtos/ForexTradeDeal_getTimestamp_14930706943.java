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

public class ForexTradeDeal_getTimestamp_14930706943 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26674;

    public ForexTradeDeal_getTimestamp_14930706943() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term26675 = new Long(7276637106827860087L);
        Double term26723 = new Double(0.8777038609128434);
        Class<? extends Object> term26782 = Class.forName((String) "space.gavinklfong.invest.forex.dtos.TradeAction");
        Field term26781 = ((Class) term26782).getDeclaredField((String) "BUY");
        ((Field) term26781).setAccessible(true);
        Object enum64 = ((Field) term26781).get((Object) null);
        Long term26749 = new Long(-3936701866695933852L);
        term26674 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexTradeDeal"));
        Object term26689 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term26690 = newInstance(Class.forName("java.time.LocalDate"));
        Object term26694 = newInstance(Class.forName("java.time.LocalTime"));
        Object term26732 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term26733 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term26735 = (int[]) newIntArray(6);
        setField(term26674, term26674.getClass(), "id", term26675);
        setField(term26674, term26674.getClass(), "dealRef", "JeZFtaqkzW");
        setIntField(term26690, term26690.getClass(), "year", 2012);
        setShortField(term26690, term26690.getClass(), "month", (short) 2);
        setShortField(term26690, term26690.getClass(), "day", (short) 19);
        setField(term26689, term26689.getClass(), "date", term26690);
        setByteField(term26694, term26694.getClass(), "hour", (byte) 8);
        setByteField(term26694, term26694.getClass(), "minute", (byte) 4);
        setByteField(term26694, term26694.getClass(), "second", (byte) 43);
        setIntField(term26694, term26694.getClass(), "nano", 114930008);
        setField(term26689, term26689.getClass(), "time", term26694);
        setField(term26674, term26674.getClass(), "timestamp", term26689);
        setField(term26674, term26674.getClass(), "baseCurrency", "vOVuNSCCLe");
        setField(term26674, term26674.getClass(), "counterCurrency", "fzeqPnzpnt");
        setField(term26674, term26674.getClass(), "rate", term26723);
        setField(term26674, term26674.getClass(), "tradeAction", enum64);
        setIntField(term26733, term26733.getClass(), "signum", 1);
        setIntElement(term26735, 0, 1538);
        setIntElement(term26735, 1, 1689918996);
        setIntElement(term26735, 2, 1389720354);
        setIntElement(term26735, 3, -962958693);
        setIntElement(term26735, 4, -1542439675);
        setIntElement(term26735, 5, -651559893);
        setField(term26733, term26733.getClass(), "mag", term26735);
        setIntField(term26733, term26733.getClass(), "bitCountPlusOne", 0);
        setIntField(term26733, term26733.getClass(), "bitLengthPlusOne", 0);
        setIntField(term26733, term26733.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term26733, term26733.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term26732, term26732.getClass(), "intVal", term26733);
        setIntField(term26732, term26732.getClass(), "scale", 53);
        setIntField(term26732, term26732.getClass(), "precision", 0);
        setField(term26732, term26732.getClass(), "stringCache", null);
        setLongField(term26732, term26732.getClass(), "intCompact", -9223372036854775808L);
        setField(term26674, term26674.getClass(), "baseCurrencyAmount", term26732);
        setField(term26674, term26674.getClass(), "customerId", term26749);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexTradeDeal");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTimestamp", argTypes, term26674, args);
    }

};


