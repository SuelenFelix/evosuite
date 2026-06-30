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
import java.lang.Double;
import java.lang.String;
import java.lang.Object;
import java.lang.Long;

public class ForexTradeDealReq_ForexTradeDealReqBuilder_baseCurrencyAmount_10600746405 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47579;
     Object term47644;

    public ForexTradeDealReq_ForexTradeDealReqBuilder_baseCurrencyAmount_10600746405() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term47604 = new Double(0.9184034277897645);
        Class<? extends Object> term47682 = Class.forName((String) "space.gavinklfong.invest.forex.dtos.TradeAction");
        Field term47681 = ((Class) term47682).getDeclaredField((String) "BUY");
        ((Field) term47681).setAccessible(true);
        Object enum120 = ((Field) term47681).get((Object) null);
        Long term47630 = new Long(-1885698929232124806L);
        term47579 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexTradeDealReq$ForexTradeDealReqBuilder"));
        Object term47613 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term47614 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term47616 = (int[]) newIntArray(6);
        setField(term47579, term47579.getClass(), "baseCurrency", "lQFkjJUPAR");
        setField(term47579, term47579.getClass(), "counterCurrency", "BsuVlGUUjV");
        setField(term47579, term47579.getClass(), "rate", term47604);
        setField(term47579, term47579.getClass(), "tradeAction", enum120);
        setIntField(term47614, term47614.getClass(), "signum", 1);
        setIntElement(term47616, 0, 13428);
        setIntElement(term47616, 1, 1042899539);
        setIntElement(term47616, 2, -1933856116);
        setIntElement(term47616, 3, 1429984762);
        setIntElement(term47616, 4, 1203897118);
        setIntElement(term47616, 5, -216093233);
        setField(term47614, term47614.getClass(), "mag", term47616);
        setIntField(term47614, term47614.getClass(), "bitCountPlusOne", 0);
        setIntField(term47614, term47614.getClass(), "bitLengthPlusOne", 0);
        setIntField(term47614, term47614.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term47614, term47614.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term47613, term47613.getClass(), "intVal", term47614);
        setIntField(term47613, term47613.getClass(), "scale", 53);
        setIntField(term47613, term47613.getClass(), "precision", 0);
        setField(term47613, term47613.getClass(), "stringCache", null);
        setLongField(term47613, term47613.getClass(), "intCompact", -9223372036854775808L);
        setField(term47579, term47579.getClass(), "baseCurrencyAmount", term47613);
        setField(term47579, term47579.getClass(), "customerId", term47630);
        setField(term47579, term47579.getClass(), "rateBookingRef", "bHHjfDCntT");
        term47644 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term47645 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term47647 = (int[]) newIntArray(6);
        setIntField(term47645, term47645.getClass(), "signum", 1);
        setIntElement(term47647, 0, 30837);
        setIntElement(term47647, 1, -1712396398);
        setIntElement(term47647, 2, 1603360048);
        setIntElement(term47647, 3, 1099339554);
        setIntElement(term47647, 4, 1480066179);
        setIntElement(term47647, 5, -1490187447);
        setField(term47645, term47645.getClass(), "mag", term47647);
        setIntField(term47645, term47645.getClass(), "bitCountPlusOne", 0);
        setIntField(term47645, term47645.getClass(), "bitLengthPlusOne", 0);
        setIntField(term47645, term47645.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term47645, term47645.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term47644, term47644.getClass(), "intVal", term47645);
        setIntField(term47644, term47644.getClass(), "scale", 53);
        setIntField(term47644, term47644.getClass(), "precision", 0);
        setField(term47644, term47644.getClass(), "stringCache", null);
        setLongField(term47644, term47644.getClass(), "intCompact", -9223372036854775808L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexTradeDealReq$ForexTradeDealReqBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.math.BigDecimal");
        Object[] args = new Object[1];
        args[0] = term47644;
        callMethod(klass, "baseCurrencyAmount", argTypes, term47579, args);
    }

};


