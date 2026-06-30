package icu.samnyan.aqua.sega.billing.model.response;

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
import static icu.samnyan.aqua.sega.billing.model.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class BillingResponse_getWaittime_135178356532 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3571;

    public BillingResponse_getWaittime_135178356532() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3571 = newInstance(Class.forName("icu.samnyan.aqua.sega.billing.model.response.BillingResponse"));
        setIntField(term3571, term3571.getClass(), "result", 0);
        setIntField(term3571, term3571.getClass(), "waittime", 0);
        setIntField(term3571, term3571.getClass(), "linelimit", 0);
        setField(term3571, term3571.getClass(), "message", null);
        setIntField(term3571, term3571.getClass(), "playlimit", 0);
        setField(term3571, term3571.getClass(), "playlimitsig", null);
        setField(term3571, term3571.getClass(), "protocolver", null);
        setIntField(term3571, term3571.getClass(), "nearfull", 0);
        setField(term3571, term3571.getClass(), "nearfullsig", null);
        setIntField(term3571, term3571.getClass(), "fixlogcnt", 0);
        setIntField(term3571, term3571.getClass(), "fixinterval", 0);
        setField(term3571, term3571.getClass(), "playhistory", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.billing.model.response.BillingResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getWaittime", argTypes, term3571, args);
    }

};


