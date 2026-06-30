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

public class ForexTradeDealReq_ForexTradeDealReqBuilder_toString_61357327719 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49398;

    public ForexTradeDealReq_ForexTradeDealReqBuilder_toString_61357327719() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49398 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexTradeDealReq$ForexTradeDealReqBuilder"));
        setField(term49398, term49398.getClass(), "baseCurrency", null);
        setField(term49398, term49398.getClass(), "counterCurrency", null);
        setField(term49398, term49398.getClass(), "rate", null);
        setField(term49398, term49398.getClass(), "tradeAction", null);
        setField(term49398, term49398.getClass(), "baseCurrencyAmount", null);
        setField(term49398, term49398.getClass(), "customerId", null);
        setField(term49398, term49398.getClass(), "rateBookingRef", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexTradeDealReq$ForexTradeDealReqBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term49398, args);
    }

};


