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

public class BillingResponse_setNearfullsig_111943984451 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3733;

    public BillingResponse_setNearfullsig_111943984451() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3733 = newInstance(Class.forName("icu.samnyan.aqua.sega.billing.model.response.BillingResponse"));
        setIntField(term3733, term3733.getClass(), "result", 0);
        setIntField(term3733, term3733.getClass(), "waittime", 0);
        setIntField(term3733, term3733.getClass(), "linelimit", 0);
        setField(term3733, term3733.getClass(), "message", null);
        setIntField(term3733, term3733.getClass(), "playlimit", 0);
        setField(term3733, term3733.getClass(), "playlimitsig", null);
        setField(term3733, term3733.getClass(), "protocolver", null);
        setIntField(term3733, term3733.getClass(), "nearfull", 0);
        setField(term3733, term3733.getClass(), "nearfullsig", null);
        setIntField(term3733, term3733.getClass(), "fixlogcnt", 0);
        setIntField(term3733, term3733.getClass(), "fixinterval", 0);
        setField(term3733, term3733.getClass(), "playhistory", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.billing.model.response.BillingResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setNearfullsig", argTypes, term3733, args);
    }

};


