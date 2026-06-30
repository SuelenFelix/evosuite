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

public class BillingResponse_getFixlogcnt_5206976140 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3635;

    public BillingResponse_getFixlogcnt_5206976140() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3635 = newInstance(Class.forName("icu.samnyan.aqua.sega.billing.model.response.BillingResponse"));
        setIntField(term3635, term3635.getClass(), "result", 0);
        setIntField(term3635, term3635.getClass(), "waittime", 0);
        setIntField(term3635, term3635.getClass(), "linelimit", 0);
        setField(term3635, term3635.getClass(), "message", null);
        setIntField(term3635, term3635.getClass(), "playlimit", 0);
        setField(term3635, term3635.getClass(), "playlimitsig", null);
        setField(term3635, term3635.getClass(), "protocolver", null);
        setIntField(term3635, term3635.getClass(), "nearfull", 0);
        setField(term3635, term3635.getClass(), "nearfullsig", null);
        setIntField(term3635, term3635.getClass(), "fixlogcnt", 0);
        setIntField(term3635, term3635.getClass(), "fixinterval", 0);
        setField(term3635, term3635.getClass(), "playhistory", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.billing.model.response.BillingResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFixlogcnt", argTypes, term3635, args);
    }

};


