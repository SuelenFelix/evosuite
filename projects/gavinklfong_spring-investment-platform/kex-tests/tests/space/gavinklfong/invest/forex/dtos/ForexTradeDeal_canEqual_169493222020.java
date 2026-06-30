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

public class ForexTradeDeal_canEqual_169493222020 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32986;
     Object term33064;

    public ForexTradeDeal_canEqual_169493222020() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term32987 = new Long(-3948863953565024517L);
        Double term33035 = new Double(0.007493740494434409);
        Class<? extends Object> term33096 = Class.forName((String) "space.gavinklfong.invest.forex.dtos.TradeAction");
        Field term33095 = ((Class) term33096).getDeclaredField((String) "SELL");
        ((Field) term33095).setAccessible(true);
        Object enum81 = ((Field) term33095).get((Object) null);
        Long term33062 = new Long(-6587807377747738663L);
        term32986 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexTradeDeal"));
        Object term33001 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term33002 = newInstance(Class.forName("java.time.LocalDate"));
        Object term33006 = newInstance(Class.forName("java.time.LocalTime"));
        Object term33045 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term33046 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term33048 = (int[]) newIntArray(6);
        setField(term32986, term32986.getClass(), "id", term32987);
        setField(term32986, term32986.getClass(), "dealRef", "WXcZEtUKlI");
        setIntField(term33002, term33002.getClass(), "year", 2012);
        setShortField(term33002, term33002.getClass(), "month", (short) 3);
        setShortField(term33002, term33002.getClass(), "day", (short) 27);
        setField(term33001, term33001.getClass(), "date", term33002);
        setByteField(term33006, term33006.getClass(), "hour", (byte) 17);
        setByteField(term33006, term33006.getClass(), "minute", (byte) 49);
        setByteField(term33006, term33006.getClass(), "second", (byte) 24);
        setIntField(term33006, term33006.getClass(), "nano", 530647398);
        setField(term33001, term33001.getClass(), "time", term33006);
        setField(term32986, term32986.getClass(), "timestamp", term33001);
        setField(term32986, term32986.getClass(), "baseCurrency", "IkpjUOuWQU");
        setField(term32986, term32986.getClass(), "counterCurrency", "boSSpezHeU");
        setField(term32986, term32986.getClass(), "rate", term33035);
        setField(term32986, term32986.getClass(), "tradeAction", enum81);
        setIntField(term33046, term33046.getClass(), "signum", 1);
        setIntElement(term33048, 0, 36328);
        setIntElement(term33048, 1, -1170174767);
        setIntElement(term33048, 2, 655972142);
        setIntElement(term33048, 3, 462471887);
        setIntElement(term33048, 4, 119631125);
        setIntElement(term33048, 5, 1339467919);
        setField(term33046, term33046.getClass(), "mag", term33048);
        setIntField(term33046, term33046.getClass(), "bitCountPlusOne", 0);
        setIntField(term33046, term33046.getClass(), "bitLengthPlusOne", 0);
        setIntField(term33046, term33046.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term33046, term33046.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term33045, term33045.getClass(), "intVal", term33046);
        setIntField(term33045, term33045.getClass(), "scale", 53);
        setIntField(term33045, term33045.getClass(), "precision", 0);
        setField(term33045, term33045.getClass(), "stringCache", null);
        setLongField(term33045, term33045.getClass(), "intCompact", -9223372036854775808L);
        setField(term32986, term32986.getClass(), "baseCurrencyAmount", term33045);
        setField(term32986, term32986.getClass(), "customerId", term33062);
        term33064 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexTradeDeal");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term33064;
        callMethod(klass, "canEqual", argTypes, term32986, args);
    }

};


