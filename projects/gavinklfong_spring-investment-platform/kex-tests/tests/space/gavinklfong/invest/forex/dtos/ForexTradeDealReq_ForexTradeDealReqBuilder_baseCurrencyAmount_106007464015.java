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

public class ForexTradeDealReq_ForexTradeDealReqBuilder_baseCurrencyAmount_106007464015 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49394;

    public ForexTradeDealReq_ForexTradeDealReqBuilder_baseCurrencyAmount_106007464015() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49394 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexTradeDealReq$ForexTradeDealReqBuilder"));
        setField(term49394, term49394.getClass(), "baseCurrency", null);
        setField(term49394, term49394.getClass(), "counterCurrency", null);
        setField(term49394, term49394.getClass(), "rate", null);
        setField(term49394, term49394.getClass(), "tradeAction", null);
        setField(term49394, term49394.getClass(), "baseCurrencyAmount", null);
        setField(term49394, term49394.getClass(), "customerId", null);
        setField(term49394, term49394.getClass(), "rateBookingRef", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexTradeDealReq$ForexTradeDealReqBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.math.BigDecimal");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "baseCurrencyAmount", argTypes, term49394, args);
    }

};


