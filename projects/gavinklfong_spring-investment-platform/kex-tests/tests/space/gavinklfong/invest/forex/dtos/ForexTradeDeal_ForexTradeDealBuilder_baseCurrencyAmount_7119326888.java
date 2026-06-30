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

public class ForexTradeDeal_ForexTradeDealBuilder_baseCurrencyAmount_7119326888 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9234;
     Object term9312;

    public ForexTradeDeal_ForexTradeDealBuilder_baseCurrencyAmount_7119326888() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term9235 = new Long(-5892135042702373494L);
        Double term9283 = new Double(0.6076495596892013);
        Class<? extends Object> term9360 = Class.forName((String) "space.gavinklfong.invest.forex.dtos.TradeAction");
        Field term9359 = ((Class) term9360).getDeclaredField((String) "SELL");
        ((Field) term9359).setAccessible(true);
        Object enum25 = ((Field) term9359).get((Object) null);
        Long term9310 = new Long(5262507301787091109L);
        term9234 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexTradeDeal$ForexTradeDealBuilder"));
        Object term9249 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term9250 = newInstance(Class.forName("java.time.LocalDate"));
        Object term9254 = newInstance(Class.forName("java.time.LocalTime"));
        Object term9293 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term9294 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term9296 = (int[]) newIntArray(6);
        setField(term9234, term9234.getClass(), "id", term9235);
        setField(term9234, term9234.getClass(), "dealRef", "TimdotUuNC");
        setIntField(term9250, term9250.getClass(), "year", 2029);
        setShortField(term9250, term9250.getClass(), "month", (short) 8);
        setShortField(term9250, term9250.getClass(), "day", (short) 29);
        setField(term9249, term9249.getClass(), "date", term9250);
        setByteField(term9254, term9254.getClass(), "hour", (byte) 15);
        setByteField(term9254, term9254.getClass(), "minute", (byte) 50);
        setByteField(term9254, term9254.getClass(), "second", (byte) 1);
        setIntField(term9254, term9254.getClass(), "nano", 277971904);
        setField(term9249, term9249.getClass(), "time", term9254);
        setField(term9234, term9234.getClass(), "timestamp", term9249);
        setField(term9234, term9234.getClass(), "baseCurrency", "PkWMRdJcBb");
        setField(term9234, term9234.getClass(), "counterCurrency", "jSpAteRute");
        setField(term9234, term9234.getClass(), "rate", term9283);
        setField(term9234, term9234.getClass(), "tradeAction", enum25);
        setIntField(term9294, term9294.getClass(), "signum", 1);
        setIntElement(term9296, 0, 5222);
        setIntElement(term9296, 1, -454284340);
        setIntElement(term9296, 2, -1412298361);
        setIntElement(term9296, 3, -225970664);
        setIntElement(term9296, 4, -1354448185);
        setIntElement(term9296, 5, -1168679607);
        setField(term9294, term9294.getClass(), "mag", term9296);
        setIntField(term9294, term9294.getClass(), "bitCountPlusOne", 0);
        setIntField(term9294, term9294.getClass(), "bitLengthPlusOne", 0);
        setIntField(term9294, term9294.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term9294, term9294.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term9293, term9293.getClass(), "intVal", term9294);
        setIntField(term9293, term9293.getClass(), "scale", 52);
        setIntField(term9293, term9293.getClass(), "precision", 0);
        setField(term9293, term9293.getClass(), "stringCache", null);
        setLongField(term9293, term9293.getClass(), "intCompact", -9223372036854775808L);
        setField(term9234, term9234.getClass(), "baseCurrencyAmount", term9293);
        setField(term9234, term9234.getClass(), "customerId", term9310);
        term9312 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term9313 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term9315 = (int[]) newIntArray(6);
        setIntField(term9313, term9313.getClass(), "signum", 1);
        setIntElement(term9315, 0, 92);
        setIntElement(term9315, 1, 1034738575);
        setIntElement(term9315, 2, -1456630577);
        setIntElement(term9315, 3, -1449292938);
        setIntElement(term9315, 4, -1319116780);
        setIntElement(term9315, 5, 1851590535);
        setField(term9313, term9313.getClass(), "mag", term9315);
        setIntField(term9313, term9313.getClass(), "bitCountPlusOne", 0);
        setIntField(term9313, term9313.getClass(), "bitLengthPlusOne", 0);
        setIntField(term9313, term9313.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term9313, term9313.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term9312, term9312.getClass(), "intVal", term9313);
        setIntField(term9312, term9312.getClass(), "scale", 51);
        setIntField(term9312, term9312.getClass(), "precision", 0);
        setField(term9312, term9312.getClass(), "stringCache", null);
        setLongField(term9312, term9312.getClass(), "intCompact", -9223372036854775808L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexTradeDeal$ForexTradeDealBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.math.BigDecimal");
        Object[] args = new Object[1];
        args[0] = term9312;
        callMethod(klass, "baseCurrencyAmount", argTypes, term9234, args);
    }

};


