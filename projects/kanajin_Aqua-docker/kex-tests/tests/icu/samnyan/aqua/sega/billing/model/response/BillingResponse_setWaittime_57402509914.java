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

public class BillingResponse_setWaittime_57402509914 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1655;
     Object term1723;

    public BillingResponse_setWaittime_57402509914() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1655 = newInstance(Class.forName("icu.samnyan.aqua.sega.billing.model.response.BillingResponse"));
        setIntField(term1655, term1655.getClass(), "result", 304775596);
        setIntField(term1655, term1655.getClass(), "waittime", -1347665717);
        setIntField(term1655, term1655.getClass(), "linelimit", -1888585309);
        setField(term1655, term1655.getClass(), "message", "whBvTVIIlC");
        setIntField(term1655, term1655.getClass(), "playlimit", 683666002);
        setField(term1655, term1655.getClass(), "playlimitsig", "IgRJUzaCwW");
        setField(term1655, term1655.getClass(), "protocolver", "JUmudUmaaV");
        setIntField(term1655, term1655.getClass(), "nearfull", 1596213415);
        setField(term1655, term1655.getClass(), "nearfullsig", "KoyGrUJeJW");
        setIntField(term1655, term1655.getClass(), "fixlogcnt", -268815336);
        setIntField(term1655, term1655.getClass(), "fixinterval", -1210583429);
        setField(term1655, term1655.getClass(), "playhistory", "HqBOwkVqjD");
        term1723 = new Integer(-663691365);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.billing.model.response.BillingResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1723;
        callMethod(klass, "setWaittime", argTypes, term1655, args);
    }

};


