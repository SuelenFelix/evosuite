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

public class BillingResponse_hashCode_131576330627 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3313;

    public BillingResponse_hashCode_131576330627() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3313 = newInstance(Class.forName("icu.samnyan.aqua.sega.billing.model.response.BillingResponse"));
        setIntField(term3313, term3313.getClass(), "result", 389427431);
        setIntField(term3313, term3313.getClass(), "waittime", -1945706126);
        setIntField(term3313, term3313.getClass(), "linelimit", 1152356969);
        setField(term3313, term3313.getClass(), "message", "LWyEaeIyAo");
        setIntField(term3313, term3313.getClass(), "playlimit", -1667990367);
        setField(term3313, term3313.getClass(), "playlimitsig", "yVMkkQhvmN");
        setField(term3313, term3313.getClass(), "protocolver", "mvrkADEgpp");
        setIntField(term3313, term3313.getClass(), "nearfull", -1214628358);
        setField(term3313, term3313.getClass(), "nearfullsig", "pXOkjyeIRb");
        setIntField(term3313, term3313.getClass(), "fixlogcnt", 1102721075);
        setIntField(term3313, term3313.getClass(), "fixinterval", -426764678);
        setField(term3313, term3313.getClass(), "playhistory", "GgZWSjxjyE");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.billing.model.response.BillingResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term3313, args);
    }

};


