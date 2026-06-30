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

public class BillingResponse_setNearfullsig_111943984421 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2555;

    public BillingResponse_setNearfullsig_111943984421() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2555 = newInstance(Class.forName("icu.samnyan.aqua.sega.billing.model.response.BillingResponse"));
        setIntField(term2555, term2555.getClass(), "result", -1388471422);
        setIntField(term2555, term2555.getClass(), "waittime", -1498296052);
        setIntField(term2555, term2555.getClass(), "linelimit", 2098647989);
        setField(term2555, term2555.getClass(), "message", "ZVecLZMLHF");
        setIntField(term2555, term2555.getClass(), "playlimit", 1598895173);
        setField(term2555, term2555.getClass(), "playlimitsig", "fztQhjqwdP");
        setField(term2555, term2555.getClass(), "protocolver", "eVpkWxjuki");
        setIntField(term2555, term2555.getClass(), "nearfull", 1830648570);
        setField(term2555, term2555.getClass(), "nearfullsig", "SJiQaLvSKv");
        setIntField(term2555, term2555.getClass(), "fixlogcnt", -227365013);
        setIntField(term2555, term2555.getClass(), "fixinterval", 11724947);
        setField(term2555, term2555.getClass(), "playhistory", "OEXDRUKcFl");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.billing.model.response.BillingResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "RYdKCNNMBR";
        callMethod(klass, "setNearfullsig", argTypes, term2555, args);
    }

};


