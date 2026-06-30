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

public class BillingResponse_getNearfullsig_10163890289 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1063;

    public BillingResponse_getNearfullsig_10163890289() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1063 = newInstance(Class.forName("icu.samnyan.aqua.sega.billing.model.response.BillingResponse"));
        setIntField(term1063, term1063.getClass(), "result", -2095575670);
        setIntField(term1063, term1063.getClass(), "waittime", 1225272962);
        setIntField(term1063, term1063.getClass(), "linelimit", 1324040357);
        setField(term1063, term1063.getClass(), "message", "GzFkzHGYFt");
        setIntField(term1063, term1063.getClass(), "playlimit", -1588772968);
        setField(term1063, term1063.getClass(), "playlimitsig", "tShwQLRGNe");
        setField(term1063, term1063.getClass(), "protocolver", "LvtrsXUliU");
        setIntField(term1063, term1063.getClass(), "nearfull", -93135961);
        setField(term1063, term1063.getClass(), "nearfullsig", "xLbjWUgOIL");
        setIntField(term1063, term1063.getClass(), "fixlogcnt", -112921587);
        setIntField(term1063, term1063.getClass(), "fixinterval", 933028652);
        setField(term1063, term1063.getClass(), "playhistory", "jDtqGUpnZN");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.billing.model.response.BillingResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNearfullsig", argTypes, term1063, args);
    }

};


