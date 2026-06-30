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

public class BillingResponse_setNearfull_66762389420 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2435;
     Object term2503;

    public BillingResponse_setNearfull_66762389420() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2435 = newInstance(Class.forName("icu.samnyan.aqua.sega.billing.model.response.BillingResponse"));
        setIntField(term2435, term2435.getClass(), "result", 9726679);
        setIntField(term2435, term2435.getClass(), "waittime", -25637976);
        setIntField(term2435, term2435.getClass(), "linelimit", 1555897383);
        setField(term2435, term2435.getClass(), "message", "vjxIhXHxGR");
        setIntField(term2435, term2435.getClass(), "playlimit", 202001407);
        setField(term2435, term2435.getClass(), "playlimitsig", "QXzGXbEXMu");
        setField(term2435, term2435.getClass(), "protocolver", "qxSDVejjiY");
        setIntField(term2435, term2435.getClass(), "nearfull", 158873461);
        setField(term2435, term2435.getClass(), "nearfullsig", "xBsXSDjXYK");
        setIntField(term2435, term2435.getClass(), "fixlogcnt", -430151637);
        setIntField(term2435, term2435.getClass(), "fixinterval", -1697741339);
        setField(term2435, term2435.getClass(), "playhistory", "sEnIVFtZuQ");
        term2503 = new Integer(98922530);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.billing.model.response.BillingResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term2503;
        callMethod(klass, "setNearfull", argTypes, term2435, args);
    }

};


