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

public class BillingResponse_setFixinterval_183209490323 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2815;
     Object term2883;

    public BillingResponse_setFixinterval_183209490323() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2815 = newInstance(Class.forName("icu.samnyan.aqua.sega.billing.model.response.BillingResponse"));
        setIntField(term2815, term2815.getClass(), "result", -1002370457);
        setIntField(term2815, term2815.getClass(), "waittime", -2014576105);
        setIntField(term2815, term2815.getClass(), "linelimit", 1296895584);
        setField(term2815, term2815.getClass(), "message", "mXGCWJDOqA");
        setIntField(term2815, term2815.getClass(), "playlimit", 628918458);
        setField(term2815, term2815.getClass(), "playlimitsig", "dpNsDgfPso");
        setField(term2815, term2815.getClass(), "protocolver", "hCWPJQKpdc");
        setIntField(term2815, term2815.getClass(), "nearfull", -1274456137);
        setField(term2815, term2815.getClass(), "nearfullsig", "WzMEhMXkKx");
        setIntField(term2815, term2815.getClass(), "fixlogcnt", 1041916673);
        setIntField(term2815, term2815.getClass(), "fixinterval", -601863069);
        setField(term2815, term2815.getClass(), "playhistory", "XOiDvlDhdc");
        term2883 = new Integer(663292551);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.billing.model.response.BillingResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term2883;
        callMethod(klass, "setFixinterval", argTypes, term2815, args);
    }

};


