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

public class BillingResponse_getResult_2237676941 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term119;

    public BillingResponse_getResult_2237676941() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term119 = newInstance(Class.forName("icu.samnyan.aqua.sega.billing.model.response.BillingResponse"));
        setIntField(term119, term119.getClass(), "result", -2038273078);
        setIntField(term119, term119.getClass(), "waittime", 1227103734);
        setIntField(term119, term119.getClass(), "linelimit", -1339778481);
        setField(term119, term119.getClass(), "message", "EGtDIRbSSb");
        setIntField(term119, term119.getClass(), "playlimit", 1725571209);
        setField(term119, term119.getClass(), "playlimitsig", "SzjVpOQTyS");
        setField(term119, term119.getClass(), "protocolver", "MjGYSRKTNF");
        setIntField(term119, term119.getClass(), "nearfull", -522618178);
        setField(term119, term119.getClass(), "nearfullsig", "hRNSzYYIrc");
        setIntField(term119, term119.getClass(), "fixlogcnt", 1134449235);
        setIntField(term119, term119.getClass(), "fixinterval", -883034806);
        setField(term119, term119.getClass(), "playhistory", "RMFIsYGgne");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.billing.model.response.BillingResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getResult", argTypes, term119, args);
    }

};


