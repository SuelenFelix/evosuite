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

public class BillingResponse_setResult_13881512043 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3659;
     Object term3667;

    public BillingResponse_setResult_13881512043() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3659 = newInstance(Class.forName("icu.samnyan.aqua.sega.billing.model.response.BillingResponse"));
        setIntField(term3659, term3659.getClass(), "result", 0);
        setIntField(term3659, term3659.getClass(), "waittime", 0);
        setIntField(term3659, term3659.getClass(), "linelimit", 0);
        setField(term3659, term3659.getClass(), "message", null);
        setIntField(term3659, term3659.getClass(), "playlimit", 0);
        setField(term3659, term3659.getClass(), "playlimitsig", null);
        setField(term3659, term3659.getClass(), "protocolver", null);
        setIntField(term3659, term3659.getClass(), "nearfull", 0);
        setField(term3659, term3659.getClass(), "nearfullsig", null);
        setIntField(term3659, term3659.getClass(), "fixlogcnt", 0);
        setIntField(term3659, term3659.getClass(), "fixinterval", 0);
        setField(term3659, term3659.getClass(), "playhistory", null);
        term3667 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.billing.model.response.BillingResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term3667;
        callMethod(klass, "setResult", argTypes, term3659, args);
    }

};


