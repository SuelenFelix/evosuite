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

public class ForexTradeDealReq_getBaseCurrency_1064335801 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38938;

    public ForexTradeDealReq_getBaseCurrency_1064335801() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term38963 = new Double(0.28292420012823627);
        Class<? extends Object> term39024 = Class.forName((String) "space.gavinklfong.invest.forex.dtos.TradeAction");
        Field term39023 = ((Class) term39024).getDeclaredField((String) "BUY");
        ((Field) term39023).setAccessible(true);
        Object enum97 = ((Field) term39023).get((Object) null);
        Long term38989 = new Long(5465527210299101732L);
        term38938 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexTradeDealReq"));
        Object term38972 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term38973 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term38975 = (int[]) newIntArray(6);
        setField(term38938, term38938.getClass(), "baseCurrency", "ubodzJoMGW");
        setField(term38938, term38938.getClass(), "counterCurrency", "weddIktxOA");
        setField(term38938, term38938.getClass(), "rate", term38963);
        setField(term38938, term38938.getClass(), "tradeAction", enum97);
        setIntField(term38973, term38973.getClass(), "signum", 1);
        setIntElement(term38975, 0, 6162);
        setIntElement(term38975, 1, 1727787570);
        setIntElement(term38975, 2, -1562538545);
        setIntElement(term38975, 3, -1171334198);
        setIntElement(term38975, 4, 133034016);
        setIntElement(term38975, 5, -156584143);
        setField(term38973, term38973.getClass(), "mag", term38975);
        setIntField(term38973, term38973.getClass(), "bitCountPlusOne", 0);
        setIntField(term38973, term38973.getClass(), "bitLengthPlusOne", 0);
        setIntField(term38973, term38973.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term38973, term38973.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term38972, term38972.getClass(), "intVal", term38973);
        setIntField(term38972, term38972.getClass(), "scale", 52);
        setIntField(term38972, term38972.getClass(), "precision", 0);
        setField(term38972, term38972.getClass(), "stringCache", null);
        setLongField(term38972, term38972.getClass(), "intCompact", -9223372036854775808L);
        setField(term38938, term38938.getClass(), "baseCurrencyAmount", term38972);
        setField(term38938, term38938.getClass(), "customerId", term38989);
        setField(term38938, term38938.getClass(), "rateBookingRef", "uSlMeISsDD");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexTradeDealReq");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBaseCurrency", argTypes, term38938, args);
    }

};


