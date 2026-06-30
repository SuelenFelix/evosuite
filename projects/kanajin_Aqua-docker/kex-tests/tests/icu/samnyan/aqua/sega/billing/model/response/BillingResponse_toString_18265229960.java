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

public class BillingResponse_toString_18265229960 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public BillingResponse_toString_18265229960() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("icu.samnyan.aqua.sega.billing.model.response.BillingResponse"));
        setIntField(term1, term1.getClass(), "result", 568599855);
        setIntField(term1, term1.getClass(), "waittime", 1162663216);
        setIntField(term1, term1.getClass(), "linelimit", 1484323161);
        setField(term1, term1.getClass(), "message", "PAEBtnZtTD");
        setIntField(term1, term1.getClass(), "playlimit", 391863371);
        setField(term1, term1.getClass(), "playlimitsig", "sjlJAEtRrb");
        setField(term1, term1.getClass(), "protocolver", "MuLcgQHgqz");
        setIntField(term1, term1.getClass(), "nearfull", -1922583790);
        setField(term1, term1.getClass(), "nearfullsig", "xxtlPwDYFs");
        setIntField(term1, term1.getClass(), "fixlogcnt", -616727354);
        setIntField(term1, term1.getClass(), "fixinterval", -1955890973);
        setField(term1, term1.getClass(), "playhistory", "jJCZpVmanW");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.billing.model.response.BillingResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term1, args);
    }

};


