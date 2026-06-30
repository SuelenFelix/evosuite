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

public class BillingResponse_getPlaylimitsig_18030648326 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term709;

    public BillingResponse_getPlaylimitsig_18030648326() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term709 = newInstance(Class.forName("icu.samnyan.aqua.sega.billing.model.response.BillingResponse"));
        setIntField(term709, term709.getClass(), "result", -602026508);
        setIntField(term709, term709.getClass(), "waittime", -157887805);
        setIntField(term709, term709.getClass(), "linelimit", 1876565163);
        setField(term709, term709.getClass(), "message", "OWDIEULEFu");
        setIntField(term709, term709.getClass(), "playlimit", -817164822);
        setField(term709, term709.getClass(), "playlimitsig", "dWRymuLBtr");
        setField(term709, term709.getClass(), "protocolver", "AijpHYOFuy");
        setIntField(term709, term709.getClass(), "nearfull", -1016503459);
        setField(term709, term709.getClass(), "nearfullsig", "SbAoxhfrkn");
        setIntField(term709, term709.getClass(), "fixlogcnt", -1968847291);
        setIntField(term709, term709.getClass(), "fixinterval", 579005622);
        setField(term709, term709.getClass(), "playhistory", "kuTXqwMtDB");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.billing.model.response.BillingResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlaylimitsig", argTypes, term709, args);
    }

};


