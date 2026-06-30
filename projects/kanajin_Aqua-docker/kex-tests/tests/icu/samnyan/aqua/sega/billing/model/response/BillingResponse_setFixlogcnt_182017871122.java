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
import java.lang.Integer;

public class BillingResponse_setFixlogcnt_182017871122 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2695;
     Object term2763;

    public BillingResponse_setFixlogcnt_182017871122() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2695 = newInstance(Class.forName("icu.samnyan.aqua.sega.billing.model.response.BillingResponse"));
        setIntField(term2695, term2695.getClass(), "result", 1953277050);
        setIntField(term2695, term2695.getClass(), "waittime", 1283079251);
        setIntField(term2695, term2695.getClass(), "linelimit", -523949691);
        setField(term2695, term2695.getClass(), "message", "yGtHPyvYiQ");
        setIntField(term2695, term2695.getClass(), "playlimit", 1398204340);
        setField(term2695, term2695.getClass(), "playlimitsig", "MvRIxilFMJ");
        setField(term2695, term2695.getClass(), "protocolver", "iNwOJRBEjp");
        setIntField(term2695, term2695.getClass(), "nearfull", 229204365);
        setField(term2695, term2695.getClass(), "nearfullsig", "XylxrMBraH");
        setIntField(term2695, term2695.getClass(), "fixlogcnt", -461771056);
        setIntField(term2695, term2695.getClass(), "fixinterval", -243422082);
        setField(term2695, term2695.getClass(), "playhistory", "pORebkoRdD");
        term2763 = new Integer(1384592638);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.billing.model.response.BillingResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term2763;
        callMethod(klass, "setFixlogcnt", argTypes, term2695, args);
    }

};


