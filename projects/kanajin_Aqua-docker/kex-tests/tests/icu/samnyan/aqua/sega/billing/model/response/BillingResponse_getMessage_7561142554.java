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

public class BillingResponse_getMessage_7561142554 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term473;

    public BillingResponse_getMessage_7561142554() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term473 = newInstance(Class.forName("icu.samnyan.aqua.sega.billing.model.response.BillingResponse"));
        setIntField(term473, term473.getClass(), "result", -1275173084);
        setIntField(term473, term473.getClass(), "waittime", -244121226);
        setIntField(term473, term473.getClass(), "linelimit", -203030934);
        setField(term473, term473.getClass(), "message", "hNxWaHcfhY");
        setIntField(term473, term473.getClass(), "playlimit", -1179120542);
        setField(term473, term473.getClass(), "playlimitsig", "RkybSrpybU");
        setField(term473, term473.getClass(), "protocolver", "xOEqzGAmDU");
        setIntField(term473, term473.getClass(), "nearfull", -73683645);
        setField(term473, term473.getClass(), "nearfullsig", "eZFUvlxvGV");
        setIntField(term473, term473.getClass(), "fixlogcnt", -226514366);
        setIntField(term473, term473.getClass(), "fixinterval", 1193880199);
        setField(term473, term473.getClass(), "playhistory", "BYqFIqCKAV");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.billing.model.response.BillingResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMessage", argTypes, term473, args);
    }

};


