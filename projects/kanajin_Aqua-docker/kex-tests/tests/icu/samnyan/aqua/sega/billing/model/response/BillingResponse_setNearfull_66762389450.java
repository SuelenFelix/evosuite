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

public class BillingResponse_setNearfull_66762389450 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3723;
     Object term3731;

    public BillingResponse_setNearfull_66762389450() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3723 = newInstance(Class.forName("icu.samnyan.aqua.sega.billing.model.response.BillingResponse"));
        setIntField(term3723, term3723.getClass(), "result", 0);
        setIntField(term3723, term3723.getClass(), "waittime", 0);
        setIntField(term3723, term3723.getClass(), "linelimit", 0);
        setField(term3723, term3723.getClass(), "message", null);
        setIntField(term3723, term3723.getClass(), "playlimit", 0);
        setField(term3723, term3723.getClass(), "playlimitsig", null);
        setField(term3723, term3723.getClass(), "protocolver", null);
        setIntField(term3723, term3723.getClass(), "nearfull", 0);
        setField(term3723, term3723.getClass(), "nearfullsig", null);
        setIntField(term3723, term3723.getClass(), "fixlogcnt", 0);
        setIntField(term3723, term3723.getClass(), "fixinterval", 0);
        setField(term3723, term3723.getClass(), "playhistory", null);
        term3731 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.billing.model.response.BillingResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term3731;
        callMethod(klass, "setNearfull", argTypes, term3723, args);
    }

};


