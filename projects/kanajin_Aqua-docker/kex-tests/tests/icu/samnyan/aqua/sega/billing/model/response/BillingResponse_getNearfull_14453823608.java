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

public class BillingResponse_getNearfull_14453823608 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term945;

    public BillingResponse_getNearfull_14453823608() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term945 = newInstance(Class.forName("icu.samnyan.aqua.sega.billing.model.response.BillingResponse"));
        setIntField(term945, term945.getClass(), "result", 458147407);
        setIntField(term945, term945.getClass(), "waittime", -184153539);
        setIntField(term945, term945.getClass(), "linelimit", 493620644);
        setField(term945, term945.getClass(), "message", "wSQxaModmm");
        setIntField(term945, term945.getClass(), "playlimit", 1328271830);
        setField(term945, term945.getClass(), "playlimitsig", "UlajhuVLaP");
        setField(term945, term945.getClass(), "protocolver", "gGSMzuGICf");
        setIntField(term945, term945.getClass(), "nearfull", 1596070772);
        setField(term945, term945.getClass(), "nearfullsig", "hxCBltsObl");
        setIntField(term945, term945.getClass(), "fixlogcnt", 97029295);
        setIntField(term945, term945.getClass(), "fixinterval", -1371869594);
        setField(term945, term945.getClass(), "playhistory", "BndsHwAFMv");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.billing.model.response.BillingResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNearfull", argTypes, term945, args);
    }

};


