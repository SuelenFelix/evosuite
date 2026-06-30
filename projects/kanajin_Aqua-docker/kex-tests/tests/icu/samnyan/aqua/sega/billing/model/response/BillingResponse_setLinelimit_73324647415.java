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

public class BillingResponse_setLinelimit_73324647415 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1775;
     Object term1843;

    public BillingResponse_setLinelimit_73324647415() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1775 = newInstance(Class.forName("icu.samnyan.aqua.sega.billing.model.response.BillingResponse"));
        setIntField(term1775, term1775.getClass(), "result", 339854490);
        setIntField(term1775, term1775.getClass(), "waittime", -615654495);
        setIntField(term1775, term1775.getClass(), "linelimit", -1476117762);
        setField(term1775, term1775.getClass(), "message", "MAcUBcBckh");
        setIntField(term1775, term1775.getClass(), "playlimit", -341962980);
        setField(term1775, term1775.getClass(), "playlimitsig", "oVgzLbrsFr");
        setField(term1775, term1775.getClass(), "protocolver", "vQVyKLdtaz");
        setIntField(term1775, term1775.getClass(), "nearfull", 1532716628);
        setField(term1775, term1775.getClass(), "nearfullsig", "OWKQODBLzb");
        setIntField(term1775, term1775.getClass(), "fixlogcnt", -1801760683);
        setIntField(term1775, term1775.getClass(), "fixinterval", 1141317871);
        setField(term1775, term1775.getClass(), "playhistory", "wGmYcqUkgE");
        term1843 = new Integer(890669485);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.billing.model.response.BillingResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1843;
        callMethod(klass, "setLinelimit", argTypes, term1775, args);
    }

};


