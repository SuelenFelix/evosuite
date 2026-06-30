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

public class ForexTradeDealReq_setTradeAction_13939265932 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45769;

    public ForexTradeDealReq_setTradeAction_13939265932() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45769 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexTradeDealReq"));
        setField(term45769, term45769.getClass(), "baseCurrency", null);
        setField(term45769, term45769.getClass(), "counterCurrency", null);
        setField(term45769, term45769.getClass(), "rate", null);
        setField(term45769, term45769.getClass(), "tradeAction", null);
        setField(term45769, term45769.getClass(), "baseCurrencyAmount", null);
        setField(term45769, term45769.getClass(), "customerId", null);
        setField(term45769, term45769.getClass(), "rateBookingRef", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexTradeDealReq");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("space.gavinklfong.invest.forex.dtos.TradeAction");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setTradeAction", argTypes, term45769, args);
    }

};


