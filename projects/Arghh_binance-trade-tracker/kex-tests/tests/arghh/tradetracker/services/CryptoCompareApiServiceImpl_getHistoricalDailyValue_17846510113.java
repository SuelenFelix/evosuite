package arghh.tradetracker.services;

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
import static arghh.tradetracker.services.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class CryptoCompareApiServiceImpl_getHistoricalDailyValue_17846510113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term695;

    public CryptoCompareApiServiceImpl_getHistoricalDailyValue_17846510113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term695 = newInstance(Class.forName("java.util.Date"));
        setLongField(term695, term695.getClass(), "fastTime", 1345871412244L);
        setField(term695, term695.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("arghh.tradetracker.services.CryptoCompareApiServiceImpl");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.util.Date");
        Object[] args = new Object[2];
        args[0] = "ZiaGIbnzTs";
        args[1] = term695;
        callMethod(klass, "getHistoricalDailyValue", argTypes, null, args);
    }

};


