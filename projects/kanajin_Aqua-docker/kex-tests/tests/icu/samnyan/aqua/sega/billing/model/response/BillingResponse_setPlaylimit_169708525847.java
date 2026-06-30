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
import java.lang.Integer;

public class BillingResponse_setPlaylimit_169708525847 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3697;
     Object term3705;

    public BillingResponse_setPlaylimit_169708525847() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3697 = newInstance(Class.forName("icu.samnyan.aqua.sega.billing.model.response.BillingResponse"));
        setIntField(term3697, term3697.getClass(), "result", 0);
        setIntField(term3697, term3697.getClass(), "waittime", 0);
        setIntField(term3697, term3697.getClass(), "linelimit", 0);
        setField(term3697, term3697.getClass(), "message", null);
        setIntField(term3697, term3697.getClass(), "playlimit", 0);
        setField(term3697, term3697.getClass(), "playlimitsig", null);
        setField(term3697, term3697.getClass(), "protocolver", null);
        setIntField(term3697, term3697.getClass(), "nearfull", 0);
        setField(term3697, term3697.getClass(), "nearfullsig", null);
        setIntField(term3697, term3697.getClass(), "fixlogcnt", 0);
        setIntField(term3697, term3697.getClass(), "fixinterval", 0);
        setField(term3697, term3697.getClass(), "playhistory", null);
        term3705 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.billing.model.response.BillingResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term3705;
        callMethod(klass, "setPlaylimit", argTypes, term3697, args);
    }

};


