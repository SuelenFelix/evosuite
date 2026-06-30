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

public class BillingResponse_equals_86707663125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3075;
     Object term3143;

    public BillingResponse_equals_86707663125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3075 = newInstance(Class.forName("icu.samnyan.aqua.sega.billing.model.response.BillingResponse"));
        setIntField(term3075, term3075.getClass(), "result", 1358829571);
        setIntField(term3075, term3075.getClass(), "waittime", 991356662);
        setIntField(term3075, term3075.getClass(), "linelimit", -506958186);
        setField(term3075, term3075.getClass(), "message", "OJJtVNPyKZ");
        setIntField(term3075, term3075.getClass(), "playlimit", -507387516);
        setField(term3075, term3075.getClass(), "playlimitsig", "AKNapTAfmD");
        setField(term3075, term3075.getClass(), "protocolver", "xJgPlLxpgC");
        setIntField(term3075, term3075.getClass(), "nearfull", -1970452551);
        setField(term3075, term3075.getClass(), "nearfullsig", "EYtfuJaxiM");
        setIntField(term3075, term3075.getClass(), "fixlogcnt", -1896376975);
        setIntField(term3075, term3075.getClass(), "fixinterval", 729658803);
        setField(term3075, term3075.getClass(), "playhistory", "gCWtLVKVVe");
        term3143 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.billing.model.response.BillingResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term3143;
        callMethod(klass, "equals", argTypes, term3075, args);
    }

};


