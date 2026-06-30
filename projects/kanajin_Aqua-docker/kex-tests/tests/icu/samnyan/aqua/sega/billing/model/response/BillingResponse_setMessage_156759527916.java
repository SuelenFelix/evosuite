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

public class BillingResponse_setMessage_156759527916 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1895;

    public BillingResponse_setMessage_156759527916() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1895 = newInstance(Class.forName("icu.samnyan.aqua.sega.billing.model.response.BillingResponse"));
        setIntField(term1895, term1895.getClass(), "result", 691577392);
        setIntField(term1895, term1895.getClass(), "waittime", -893623680);
        setIntField(term1895, term1895.getClass(), "linelimit", -1963434938);
        setField(term1895, term1895.getClass(), "message", "idgaQsnJpQ");
        setIntField(term1895, term1895.getClass(), "playlimit", 906181092);
        setField(term1895, term1895.getClass(), "playlimitsig", "VgZnGoIFwQ");
        setField(term1895, term1895.getClass(), "protocolver", "jUbSRrkrYZ");
        setIntField(term1895, term1895.getClass(), "nearfull", 1045657203);
        setField(term1895, term1895.getClass(), "nearfullsig", "bWWfajKbEX");
        setIntField(term1895, term1895.getClass(), "fixlogcnt", 1386130016);
        setIntField(term1895, term1895.getClass(), "fixinterval", 1072005683);
        setField(term1895, term1895.getClass(), "playhistory", "cAPeiZHKGJ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.billing.model.response.BillingResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "LvJFtLBaxj";
        callMethod(klass, "setMessage", argTypes, term1895, args);
    }

};


