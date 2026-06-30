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

public class BillingResponse_canEqual_6291400226 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3194;
     Object term3262;

    public BillingResponse_canEqual_6291400226() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3194 = newInstance(Class.forName("icu.samnyan.aqua.sega.billing.model.response.BillingResponse"));
        setIntField(term3194, term3194.getClass(), "result", 114754804);
        setIntField(term3194, term3194.getClass(), "waittime", 1687361082);
        setIntField(term3194, term3194.getClass(), "linelimit", 584893196);
        setField(term3194, term3194.getClass(), "message", "fWKJoSoCwE");
        setIntField(term3194, term3194.getClass(), "playlimit", 497269071);
        setField(term3194, term3194.getClass(), "playlimitsig", "wfaXBpWAUH");
        setField(term3194, term3194.getClass(), "protocolver", "VMeAzAHwZj");
        setIntField(term3194, term3194.getClass(), "nearfull", -1899301124);
        setField(term3194, term3194.getClass(), "nearfullsig", "PznxWXsZME");
        setIntField(term3194, term3194.getClass(), "fixlogcnt", -1882480155);
        setIntField(term3194, term3194.getClass(), "fixinterval", -1410220680);
        setField(term3194, term3194.getClass(), "playhistory", "ZzIujlwVsw");
        term3262 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.billing.model.response.BillingResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term3262;
        callMethod(klass, "canEqual", argTypes, term3194, args);
    }

};


