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

public class ForexTradeDeal_toString_6867677422 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33719;

    public ForexTradeDeal_toString_6867677422() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term33720 = new Long(-4598158870068953328L);
        Double term33768 = new Double(0.9276995636844321);
        Class<? extends Object> term33828 = Class.forName((String) "space.gavinklfong.invest.forex.dtos.TradeAction");
        Field term33827 = ((Class) term33828).getDeclaredField((String) "SELL");
        ((Field) term33827).setAccessible(true);
        Object enum83 = ((Field) term33827).get((Object) null);
        Long term33795 = new Long(138235087558060686L);
        term33719 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexTradeDeal"));
        Object term33734 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term33735 = newInstance(Class.forName("java.time.LocalDate"));
        Object term33739 = newInstance(Class.forName("java.time.LocalTime"));
        Object term33778 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term33779 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term33781 = (int[]) newIntArray(6);
        setField(term33719, term33719.getClass(), "id", term33720);
        setField(term33719, term33719.getClass(), "dealRef", "sOdkipUKRu");
        setIntField(term33735, term33735.getClass(), "year", 2010);
        setShortField(term33735, term33735.getClass(), "month", (short) 5);
        setShortField(term33735, term33735.getClass(), "day", (short) 2);
        setField(term33734, term33734.getClass(), "date", term33735);
        setByteField(term33739, term33739.getClass(), "hour", (byte) 2);
        setByteField(term33739, term33739.getClass(), "minute", (byte) 22);
        setByteField(term33739, term33739.getClass(), "second", (byte) 33);
        setIntField(term33739, term33739.getClass(), "nano", 530835039);
        setField(term33734, term33734.getClass(), "time", term33739);
        setField(term33719, term33719.getClass(), "timestamp", term33734);
        setField(term33719, term33719.getClass(), "baseCurrency", "oKwCDqywym");
        setField(term33719, term33719.getClass(), "counterCurrency", "zjZYTddemL");
        setField(term33719, term33719.getClass(), "rate", term33768);
        setField(term33719, term33719.getClass(), "tradeAction", enum83);
        setIntField(term33779, term33779.getClass(), "signum", 1);
        setIntElement(term33781, 0, 16598);
        setIntElement(term33781, 1, -1326719369);
        setIntElement(term33781, 2, 2036173152);
        setIntElement(term33781, 3, 1998345281);
        setIntElement(term33781, 4, -1560656273);
        setIntElement(term33781, 5, -22232257);
        setField(term33779, term33779.getClass(), "mag", term33781);
        setIntField(term33779, term33779.getClass(), "bitCountPlusOne", 0);
        setIntField(term33779, term33779.getClass(), "bitLengthPlusOne", 0);
        setIntField(term33779, term33779.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term33779, term33779.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term33778, term33778.getClass(), "intVal", term33779);
        setIntField(term33778, term33778.getClass(), "scale", 53);
        setIntField(term33778, term33778.getClass(), "precision", 0);
        setField(term33778, term33778.getClass(), "stringCache", null);
        setLongField(term33778, term33778.getClass(), "intCompact", -9223372036854775808L);
        setField(term33719, term33719.getClass(), "baseCurrencyAmount", term33778);
        setField(term33719, term33719.getClass(), "customerId", term33795);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexTradeDeal");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term33719, args);
    }

};


