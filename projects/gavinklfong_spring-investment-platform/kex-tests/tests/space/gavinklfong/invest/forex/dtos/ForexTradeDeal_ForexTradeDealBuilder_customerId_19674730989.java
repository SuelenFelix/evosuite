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

public class ForexTradeDeal_ForexTradeDealBuilder_customerId_19674730989 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9625;
     Object term9702;

    public ForexTradeDeal_ForexTradeDealBuilder_customerId_19674730989() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term9626 = new Long(-6823727938421990489L);
        Double term9674 = new Double(0.37773193782763337);
        Class<? extends Object> term9735 = Class.forName((String) "space.gavinklfong.invest.forex.dtos.TradeAction");
        Field term9734 = ((Class) term9735).getDeclaredField((String) "BUY");
        ((Field) term9734).setAccessible(true);
        Object enum26 = ((Field) term9734).get((Object) null);
        Long term9700 = new Long(-484994522244390100L);
        term9625 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexTradeDeal$ForexTradeDealBuilder"));
        Object term9640 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term9641 = newInstance(Class.forName("java.time.LocalDate"));
        Object term9645 = newInstance(Class.forName("java.time.LocalTime"));
        Object term9683 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term9684 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term9686 = (int[]) newIntArray(6);
        setField(term9625, term9625.getClass(), "id", term9626);
        setField(term9625, term9625.getClass(), "dealRef", "swZVeJAxjt");
        setIntField(term9641, term9641.getClass(), "year", 2022);
        setShortField(term9641, term9641.getClass(), "month", (short) 11);
        setShortField(term9641, term9641.getClass(), "day", (short) 16);
        setField(term9640, term9640.getClass(), "date", term9641);
        setByteField(term9645, term9645.getClass(), "hour", (byte) 15);
        setByteField(term9645, term9645.getClass(), "minute", (byte) 54);
        setByteField(term9645, term9645.getClass(), "second", (byte) 2);
        setIntField(term9645, term9645.getClass(), "nano", 733274103);
        setField(term9640, term9640.getClass(), "time", term9645);
        setField(term9625, term9625.getClass(), "timestamp", term9640);
        setField(term9625, term9625.getClass(), "baseCurrency", "xOcJIiQQDu");
        setField(term9625, term9625.getClass(), "counterCurrency", "GVizqqzXpy");
        setField(term9625, term9625.getClass(), "rate", term9674);
        setField(term9625, term9625.getClass(), "tradeAction", enum26);
        setIntField(term9684, term9684.getClass(), "signum", 1);
        setIntElement(term9686, 0, 26001);
        setIntElement(term9686, 1, 1123266030);
        setIntElement(term9686, 2, 1277036849);
        setIntElement(term9686, 3, 2128028609);
        setIntElement(term9686, 4, -171954480);
        setIntElement(term9686, 5, -1359520521);
        setField(term9684, term9684.getClass(), "mag", term9686);
        setIntField(term9684, term9684.getClass(), "bitCountPlusOne", 0);
        setIntField(term9684, term9684.getClass(), "bitLengthPlusOne", 0);
        setIntField(term9684, term9684.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term9684, term9684.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term9683, term9683.getClass(), "intVal", term9684);
        setIntField(term9683, term9683.getClass(), "scale", 53);
        setIntField(term9683, term9683.getClass(), "precision", 0);
        setField(term9683, term9683.getClass(), "stringCache", null);
        setLongField(term9683, term9683.getClass(), "intCompact", -9223372036854775808L);
        setField(term9625, term9625.getClass(), "baseCurrencyAmount", term9683);
        setField(term9625, term9625.getClass(), "customerId", term9700);
        term9702 = new Long(1233889271256172047L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexTradeDeal$ForexTradeDealBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term9702;
        callMethod(klass, "customerId", argTypes, term9625, args);
    }

};


