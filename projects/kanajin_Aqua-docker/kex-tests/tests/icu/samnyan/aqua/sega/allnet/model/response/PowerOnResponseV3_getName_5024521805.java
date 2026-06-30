package icu.samnyan.aqua.sega.allnet.model.response;

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
import static icu.samnyan.aqua.sega.allnet.model.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class PowerOnResponseV3_getName_5024521805 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1881;

    public PowerOnResponseV3_getName_5024521805() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1881 = newInstance(Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV3"));
        setIntField(term1881, term1881.getClass(), "stat", -616727354);
        setField(term1881, term1881.getClass(), "uri", "LvJFtLBaxj");
        setField(term1881, term1881.getClass(), "host", "PHvxnGHptP");
        setField(term1881, term1881.getClass(), "place_id", "TimdotUuNC");
        setField(term1881, term1881.getClass(), "name", "PkWMRdJcBb");
        setField(term1881, term1881.getClass(), "nickname", "jSpAteRute");
        setField(term1881, term1881.getClass(), "region0", "swZVeJAxjt");
        setField(term1881, term1881.getClass(), "region_name0", "xOcJIiQQDu");
        setField(term1881, term1881.getClass(), "region_name1", "GVizqqzXpy");
        setField(term1881, term1881.getClass(), "region_name2", "JqXGgAhZPl");
        setField(term1881, term1881.getClass(), "region_name3", "jiKYgYHqIS");
        setField(term1881, term1881.getClass(), "country", "DfISiziTgG");
        setField(term1881, term1881.getClass(), "allnet_id", "XqgfKFvPSD");
        setField(term1881, term1881.getClass(), "client_timezone", "JiVRgTZvKc");
        setField(term1881, term1881.getClass(), "utc_time", "XPKmummaqg");
        setField(term1881, term1881.getClass(), "setting", "BKLfkLiZTH");
        setField(term1881, term1881.getClass(), "res_ver", "SPpkrGcPRr");
        setField(term1881, term1881.getClass(), "token", "sEccwbJKYE");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV3");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term1881, args);
    }

};


