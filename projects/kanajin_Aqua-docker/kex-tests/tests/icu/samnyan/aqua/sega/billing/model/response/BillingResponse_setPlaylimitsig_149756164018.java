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

public class BillingResponse_setPlaylimitsig_149756164018 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2155;

    public BillingResponse_setPlaylimitsig_149756164018() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2155 = newInstance(Class.forName("icu.samnyan.aqua.sega.billing.model.response.BillingResponse"));
        setIntField(term2155, term2155.getClass(), "result", -2015854073);
        setIntField(term2155, term2155.getClass(), "waittime", 538259104);
        setIntField(term2155, term2155.getClass(), "linelimit", 96566506);
        setField(term2155, term2155.getClass(), "message", "xOcJIiQQDu");
        setIntField(term2155, term2155.getClass(), "playlimit", -343325701);
        setField(term2155, term2155.getClass(), "playlimitsig", "GVizqqzXpy");
        setField(term2155, term2155.getClass(), "protocolver", "JqXGgAhZPl");
        setIntField(term2155, term2155.getClass(), "nearfull", 107945604);
        setField(term2155, term2155.getClass(), "nearfullsig", "jiKYgYHqIS");
        setIntField(term2155, term2155.getClass(), "fixlogcnt", -1963464809);
        setIntField(term2155, term2155.getClass(), "fixinterval", 71190297);
        setField(term2155, term2155.getClass(), "playhistory", "DfISiziTgG");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.billing.model.response.BillingResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "XqgfKFvPSD";
        callMethod(klass, "setPlaylimitsig", argTypes, term2155, args);
    }

};


