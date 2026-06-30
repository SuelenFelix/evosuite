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

public class BillingResponse_setPlayhistory_84999512624 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2935;

    public BillingResponse_setPlayhistory_84999512624() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2935 = newInstance(Class.forName("icu.samnyan.aqua.sega.billing.model.response.BillingResponse"));
        setIntField(term2935, term2935.getClass(), "result", -1885090354);
        setIntField(term2935, term2935.getClass(), "waittime", -2066804303);
        setIntField(term2935, term2935.getClass(), "linelimit", -1731761810);
        setField(term2935, term2935.getClass(), "message", "AdxvLJhNLe");
        setIntField(term2935, term2935.getClass(), "playlimit", 197109649);
        setField(term2935, term2935.getClass(), "playlimitsig", "lHfTrWKMPk");
        setField(term2935, term2935.getClass(), "protocolver", "JDaAnsVTGV");
        setIntField(term2935, term2935.getClass(), "nearfull", -1239406390);
        setField(term2935, term2935.getClass(), "nearfullsig", "mLUZFTfjle");
        setIntField(term2935, term2935.getClass(), "fixlogcnt", 1557431527);
        setIntField(term2935, term2935.getClass(), "fixinterval", -1504890659);
        setField(term2935, term2935.getClass(), "playhistory", "xIeFjkHkOe");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.billing.model.response.BillingResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "SdCKLMIYnX";
        callMethod(klass, "setPlayhistory", argTypes, term2935, args);
    }

};


