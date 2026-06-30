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

public class BillingResponse_setResult_13881512013 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1535;
     Object term1603;

    public BillingResponse_setResult_13881512013() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1535 = newInstance(Class.forName("icu.samnyan.aqua.sega.billing.model.response.BillingResponse"));
        setIntField(term1535, term1535.getClass(), "result", -1845499264);
        setIntField(term1535, term1535.getClass(), "waittime", -505439934);
        setIntField(term1535, term1535.getClass(), "linelimit", -344842608);
        setField(term1535, term1535.getClass(), "message", "uWHnvSvaPl");
        setIntField(term1535, term1535.getClass(), "playlimit", 941650513);
        setField(term1535, term1535.getClass(), "playlimitsig", "kBdSllIBVz");
        setField(term1535, term1535.getClass(), "protocolver", "TJmVBGfTML");
        setIntField(term1535, term1535.getClass(), "nearfull", 444029505);
        setField(term1535, term1535.getClass(), "nearfullsig", "tPlsykYBqO");
        setIntField(term1535, term1535.getClass(), "fixlogcnt", -1034506028);
        setIntField(term1535, term1535.getClass(), "fixinterval", -1263114719);
        setField(term1535, term1535.getClass(), "playhistory", "bLPjGVBhlX");
        term1603 = new Integer(-894662986);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.billing.model.response.BillingResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1603;
        callMethod(klass, "setResult", argTypes, term1535, args);
    }

};


