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

public class ForexTradeDeal_setBaseCurrencyAmount_114124484817 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31864;
     Object term31942;

    public ForexTradeDeal_setBaseCurrencyAmount_114124484817() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term31865 = new Long(-1616722610139554082L);
        Double term31913 = new Double(0.6584165706677267);
        Class<? extends Object> term31990 = Class.forName((String) "space.gavinklfong.invest.forex.dtos.TradeAction");
        Field term31989 = ((Class) term31990).getDeclaredField((String) "SELL");
        ((Field) term31989).setAccessible(true);
        Object enum78 = ((Field) term31989).get((Object) null);
        Long term31940 = new Long(7495904023107549024L);
        term31864 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexTradeDeal"));
        Object term31879 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term31880 = newInstance(Class.forName("java.time.LocalDate"));
        Object term31884 = newInstance(Class.forName("java.time.LocalTime"));
        Object term31923 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term31924 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term31926 = (int[]) newIntArray(6);
        setField(term31864, term31864.getClass(), "id", term31865);
        setField(term31864, term31864.getClass(), "dealRef", "KarbTXFmUU");
        setIntField(term31880, term31880.getClass(), "year", 2025);
        setShortField(term31880, term31880.getClass(), "month", (short) 11);
        setShortField(term31880, term31880.getClass(), "day", (short) 3);
        setField(term31879, term31879.getClass(), "date", term31880);
        setByteField(term31884, term31884.getClass(), "hour", (byte) 21);
        setByteField(term31884, term31884.getClass(), "minute", (byte) 24);
        setByteField(term31884, term31884.getClass(), "second", (byte) 23);
        setIntField(term31884, term31884.getClass(), "nano", 210986721);
        setField(term31879, term31879.getClass(), "time", term31884);
        setField(term31864, term31864.getClass(), "timestamp", term31879);
        setField(term31864, term31864.getClass(), "baseCurrency", "jiUSjqwSIQ");
        setField(term31864, term31864.getClass(), "counterCurrency", "MgLCedQfoj");
        setField(term31864, term31864.getClass(), "rate", term31913);
        setField(term31864, term31864.getClass(), "tradeAction", enum78);
        setIntField(term31924, term31924.getClass(), "signum", 1);
        setIntElement(term31926, 0, 204);
        setIntElement(term31926, 1, 1745146299);
        setIntElement(term31926, 2, 845712784);
        setIntElement(term31926, 3, 1465621215);
        setIntElement(term31926, 4, 1308052610);
        setIntElement(term31926, 5, -167172793);
        setField(term31924, term31924.getClass(), "mag", term31926);
        setIntField(term31924, term31924.getClass(), "bitCountPlusOne", 0);
        setIntField(term31924, term31924.getClass(), "bitLengthPlusOne", 0);
        setIntField(term31924, term31924.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term31924, term31924.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term31923, term31923.getClass(), "intVal", term31924);
        setIntField(term31923, term31923.getClass(), "scale", 51);
        setIntField(term31923, term31923.getClass(), "precision", 0);
        setField(term31923, term31923.getClass(), "stringCache", null);
        setLongField(term31923, term31923.getClass(), "intCompact", -9223372036854775808L);
        setField(term31864, term31864.getClass(), "baseCurrencyAmount", term31923);
        setField(term31864, term31864.getClass(), "customerId", term31940);
        term31942 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term31943 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term31945 = (int[]) newIntArray(6);
        setIntField(term31943, term31943.getClass(), "signum", 1);
        setIntElement(term31945, 0, 222);
        setIntElement(term31945, 1, -1087508584);
        setIntElement(term31945, 2, 906884840);
        setIntElement(term31945, 3, 1951789170);
        setIntElement(term31945, 4, -1162620578);
        setIntElement(term31945, 5, -1079967753);
        setField(term31943, term31943.getClass(), "mag", term31945);
        setIntField(term31943, term31943.getClass(), "bitCountPlusOne", 0);
        setIntField(term31943, term31943.getClass(), "bitLengthPlusOne", 0);
        setIntField(term31943, term31943.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term31943, term31943.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term31942, term31942.getClass(), "intVal", term31943);
        setIntField(term31942, term31942.getClass(), "scale", 51);
        setIntField(term31942, term31942.getClass(), "precision", 0);
        setField(term31942, term31942.getClass(), "stringCache", null);
        setLongField(term31942, term31942.getClass(), "intCompact", -9223372036854775808L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexTradeDeal");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.math.BigDecimal");
        Object[] args = new Object[1];
        args[0] = term31942;
        callMethod(klass, "setBaseCurrencyAmount", argTypes, term31864, args);
    }

};


