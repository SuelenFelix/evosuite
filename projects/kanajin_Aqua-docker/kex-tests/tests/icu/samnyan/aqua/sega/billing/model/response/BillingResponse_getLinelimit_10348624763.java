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

public class BillingResponse_getLinelimit_10348624763 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term355;

    public BillingResponse_getLinelimit_10348624763() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term355 = newInstance(Class.forName("icu.samnyan.aqua.sega.billing.model.response.BillingResponse"));
        setIntField(term355, term355.getClass(), "result", -6029667);
        setIntField(term355, term355.getClass(), "waittime", -2068769794);
        setIntField(term355, term355.getClass(), "linelimit", -117576464);
        setField(term355, term355.getClass(), "message", "aJlieCFVtF");
        setIntField(term355, term355.getClass(), "playlimit", -1007160944);
        setField(term355, term355.getClass(), "playlimitsig", "ZiaGIbnzTs");
        setField(term355, term355.getClass(), "protocolver", "tbcdzjIfER");
        setIntField(term355, term355.getClass(), "nearfull", 1135664017);
        setField(term355, term355.getClass(), "nearfullsig", "HyxfbSQYBe");
        setIntField(term355, term355.getClass(), "fixlogcnt", 590364439);
        setIntField(term355, term355.getClass(), "fixinterval", 865208305);
        setField(term355, term355.getClass(), "playhistory", "pCTimMblYc");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.billing.model.response.BillingResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLinelimit", argTypes, term355, args);
    }

};


