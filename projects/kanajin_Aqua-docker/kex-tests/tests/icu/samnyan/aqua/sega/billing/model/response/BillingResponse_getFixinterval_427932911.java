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

public class BillingResponse_getFixinterval_427932911 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1299;

    public BillingResponse_getFixinterval_427932911() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1299 = newInstance(Class.forName("icu.samnyan.aqua.sega.billing.model.response.BillingResponse"));
        setIntField(term1299, term1299.getClass(), "result", 1063420942);
        setIntField(term1299, term1299.getClass(), "waittime", 1375330971);
        setIntField(term1299, term1299.getClass(), "linelimit", -478195677);
        setField(term1299, term1299.getClass(), "message", "YRHGsAkhxb");
        setIntField(term1299, term1299.getClass(), "playlimit", 972867650);
        setField(term1299, term1299.getClass(), "playlimitsig", "ffYhPOzlUs");
        setField(term1299, term1299.getClass(), "protocolver", "MLqYREekMl");
        setIntField(term1299, term1299.getClass(), "nearfull", 1655935355);
        setField(term1299, term1299.getClass(), "nearfullsig", "ytSBIKXogI");
        setIntField(term1299, term1299.getClass(), "fixlogcnt", -481533957);
        setIntField(term1299, term1299.getClass(), "fixinterval", 1240914516);
        setField(term1299, term1299.getClass(), "playhistory", "nHXjMycHlU");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.billing.model.response.BillingResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFixinterval", argTypes, term1299, args);
    }

};


