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

public class BillingResponse_setPlaylimit_169708525817 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2035;
     Object term2103;

    public BillingResponse_setPlaylimit_169708525817() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2035 = newInstance(Class.forName("icu.samnyan.aqua.sega.billing.model.response.BillingResponse"));
        setIntField(term2035, term2035.getClass(), "result", 1861318859);
        setIntField(term2035, term2035.getClass(), "waittime", 1474524152);
        setIntField(term2035, term2035.getClass(), "linelimit", 568954359);
        setField(term2035, term2035.getClass(), "message", "PHvxnGHptP");
        setIntField(term2035, term2035.getClass(), "playlimit", 53410913);
        setField(term2035, term2035.getClass(), "playlimitsig", "TimdotUuNC");
        setField(term2035, term2035.getClass(), "protocolver", "PkWMRdJcBb");
        setIntField(term2035, term2035.getClass(), "nearfull", -375014958);
        setField(term2035, term2035.getClass(), "nearfullsig", "jSpAteRute");
        setIntField(term2035, term2035.getClass(), "fixlogcnt", 1107176718);
        setIntField(term2035, term2035.getClass(), "fixinterval", 480137250);
        setField(term2035, term2035.getClass(), "playhistory", "swZVeJAxjt");
        term2103 = new Integer(-341152642);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.billing.model.response.BillingResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term2103;
        callMethod(klass, "setPlaylimit", argTypes, term2035, args);
    }

};


