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

public class BillingResponse_getProtocolver_3042858777 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term827;

    public BillingResponse_getProtocolver_3042858777() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term827 = newInstance(Class.forName("icu.samnyan.aqua.sega.billing.model.response.BillingResponse"));
        setIntField(term827, term827.getClass(), "result", -14890619);
        setIntField(term827, term827.getClass(), "waittime", 1632125673);
        setIntField(term827, term827.getClass(), "linelimit", 454281060);
        setField(term827, term827.getClass(), "message", "Ghbwtircqb");
        setIntField(term827, term827.getClass(), "playlimit", -1786399638);
        setField(term827, term827.getClass(), "playlimitsig", "xrwlQZdwCp");
        setField(term827, term827.getClass(), "protocolver", "IDCWpPLRkE");
        setIntField(term827, term827.getClass(), "nearfull", 2055867847);
        setField(term827, term827.getClass(), "nearfullsig", "nyiiPDVjAc");
        setIntField(term827, term827.getClass(), "fixlogcnt", -1048298087);
        setIntField(term827, term827.getClass(), "fixinterval", 292681826);
        setField(term827, term827.getClass(), "playhistory", "aKnKipADSo");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.billing.model.response.BillingResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getProtocolver", argTypes, term827, args);
    }

};


