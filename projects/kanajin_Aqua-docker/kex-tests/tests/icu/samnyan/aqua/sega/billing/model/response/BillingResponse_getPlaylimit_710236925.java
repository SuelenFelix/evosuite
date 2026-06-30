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

public class BillingResponse_getPlaylimit_710236925 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term591;

    public BillingResponse_getPlaylimit_710236925() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term591 = newInstance(Class.forName("icu.samnyan.aqua.sega.billing.model.response.BillingResponse"));
        setIntField(term591, term591.getClass(), "result", -1087774327);
        setIntField(term591, term591.getClass(), "waittime", -1530420153);
        setIntField(term591, term591.getClass(), "linelimit", -469968304);
        setField(term591, term591.getClass(), "message", "vrQLuWIDJX");
        setIntField(term591, term591.getClass(), "playlimit", -1145578966);
        setField(term591, term591.getClass(), "playlimitsig", "flxyYxBRtu");
        setField(term591, term591.getClass(), "protocolver", "OclPbYPkcH");
        setIntField(term591, term591.getClass(), "nearfull", 679763016);
        setField(term591, term591.getClass(), "nearfullsig", "IoAlmYsBwc");
        setIntField(term591, term591.getClass(), "fixlogcnt", 1962444399);
        setIntField(term591, term591.getClass(), "fixinterval", 767834723);
        setField(term591, term591.getClass(), "playhistory", "TEParAifyi");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.billing.model.response.BillingResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlaylimit", argTypes, term591, args);
    }

};


