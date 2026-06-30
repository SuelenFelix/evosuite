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

public class BillingResponse_getWaittime_13517835652 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term237;

    public BillingResponse_getWaittime_13517835652() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term237 = newInstance(Class.forName("icu.samnyan.aqua.sega.billing.model.response.BillingResponse"));
        setIntField(term237, term237.getClass(), "result", 1585847225);
        setIntField(term237, term237.getClass(), "waittime", 597278769);
        setIntField(term237, term237.getClass(), "linelimit", -1685132342);
        setField(term237, term237.getClass(), "message", "NRdvgJlhkX");
        setIntField(term237, term237.getClass(), "playlimit", -1456670397);
        setField(term237, term237.getClass(), "playlimitsig", "uuaPigETmJ");
        setField(term237, term237.getClass(), "protocolver", "MxlszYVzRf");
        setIntField(term237, term237.getClass(), "nearfull", 1622346318);
        setField(term237, term237.getClass(), "nearfullsig", "LQFpaHEwXR");
        setIntField(term237, term237.getClass(), "fixlogcnt", 1048535127);
        setIntField(term237, term237.getClass(), "fixinterval", -655067527);
        setField(term237, term237.getClass(), "playhistory", "oVcInYnLWB");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.billing.model.response.BillingResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getWaittime", argTypes, term237, args);
    }

};


