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

public class BillingResponse_setProtocolver_40733669319 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2295;

    public BillingResponse_setProtocolver_40733669319() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2295 = newInstance(Class.forName("icu.samnyan.aqua.sega.billing.model.response.BillingResponse"));
        setIntField(term2295, term2295.getClass(), "result", 1202361360);
        setIntField(term2295, term2295.getClass(), "waittime", -2015048153);
        setIntField(term2295, term2295.getClass(), "linelimit", -2063457669);
        setField(term2295, term2295.getClass(), "message", "JiVRgTZvKc");
        setIntField(term2295, term2295.getClass(), "playlimit", -1222006000);
        setField(term2295, term2295.getClass(), "playlimitsig", "XPKmummaqg");
        setField(term2295, term2295.getClass(), "protocolver", "BKLfkLiZTH");
        setIntField(term2295, term2295.getClass(), "nearfull", 2095798786);
        setField(term2295, term2295.getClass(), "nearfullsig", "SPpkrGcPRr");
        setIntField(term2295, term2295.getClass(), "fixlogcnt", -1565502840);
        setIntField(term2295, term2295.getClass(), "fixinterval", 344323424);
        setField(term2295, term2295.getClass(), "playhistory", "sEccwbJKYE");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.billing.model.response.BillingResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "AWRooQKkdW";
        callMethod(klass, "setProtocolver", argTypes, term2295, args);
    }

};


