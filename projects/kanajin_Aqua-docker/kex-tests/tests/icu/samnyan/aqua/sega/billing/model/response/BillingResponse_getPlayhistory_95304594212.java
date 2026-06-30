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

public class BillingResponse_getPlayhistory_95304594212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1417;

    public BillingResponse_getPlayhistory_95304594212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1417 = newInstance(Class.forName("icu.samnyan.aqua.sega.billing.model.response.BillingResponse"));
        setIntField(term1417, term1417.getClass(), "result", -1465035361);
        setIntField(term1417, term1417.getClass(), "waittime", 1090617576);
        setIntField(term1417, term1417.getClass(), "linelimit", -1547384488);
        setField(term1417, term1417.getClass(), "message", "ieCtQFdkii");
        setIntField(term1417, term1417.getClass(), "playlimit", 1442160736);
        setField(term1417, term1417.getClass(), "playlimitsig", "dEnhdmILtU");
        setField(term1417, term1417.getClass(), "protocolver", "hoicvmsovO");
        setIntField(term1417, term1417.getClass(), "nearfull", 1114000454);
        setField(term1417, term1417.getClass(), "nearfullsig", "eqJfYWRaEL");
        setIntField(term1417, term1417.getClass(), "fixlogcnt", -556405712);
        setIntField(term1417, term1417.getClass(), "fixinterval", -1772434990);
        setField(term1417, term1417.getClass(), "playhistory", "fhkbdRViHi");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.billing.model.response.BillingResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayhistory", argTypes, term1417, args);
    }

};


