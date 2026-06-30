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

public class BillingResponse_getFixlogcnt_5206976110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1181;

    public BillingResponse_getFixlogcnt_5206976110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1181 = newInstance(Class.forName("icu.samnyan.aqua.sega.billing.model.response.BillingResponse"));
        setIntField(term1181, term1181.getClass(), "result", 287287233);
        setIntField(term1181, term1181.getClass(), "waittime", 962840079);
        setIntField(term1181, term1181.getClass(), "linelimit", 1540719661);
        setField(term1181, term1181.getClass(), "message", "nGKItKLYNC");
        setIntField(term1181, term1181.getClass(), "playlimit", 1265463001);
        setField(term1181, term1181.getClass(), "playlimitsig", "UiUYnPrcCi");
        setField(term1181, term1181.getClass(), "protocolver", "UoYtihxVaS");
        setIntField(term1181, term1181.getClass(), "nearfull", 335112684);
        setField(term1181, term1181.getClass(), "nearfullsig", "JDswTTCZHV");
        setIntField(term1181, term1181.getClass(), "fixlogcnt", 1551099402);
        setIntField(term1181, term1181.getClass(), "fixinterval", -2027534003);
        setField(term1181, term1181.getClass(), "playhistory", "onpbIeEKoi");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.billing.model.response.BillingResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFixlogcnt", argTypes, term1181, args);
    }

};


