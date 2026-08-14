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
import java.util.LinkedList;
import java.lang.String;
import java.lang.Object;

public class ProfitServiceImpl_calculateProfitProCurrency_206098802915 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4597;
     Object enum9;

    public ProfitServiceImpl_calculateProfitProCurrency_206098802915() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4597 = new LinkedList();
        Class<? extends Object> term4608 = Class.forName((String) "arghh.tradetracker.services.BaseCurrency");
        Field term4607 = ((Class) term4608).getDeclaredField((String) "ETH");
        ((Field) term4607).setAccessible(true);
        enum9 = ((Field) term4607).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("arghh.tradetracker.services.ProfitServiceImpl");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.List");
        argTypes[1] = Class.forName("arghh.tradetracker.services.BaseCurrency");
        Object[] args = new Object[2];
        args[0] = term4597;
        args[1] = enum9;
        callMethod(klass, "calculateProfitProCurrency", argTypes, null, args);
    }

};


