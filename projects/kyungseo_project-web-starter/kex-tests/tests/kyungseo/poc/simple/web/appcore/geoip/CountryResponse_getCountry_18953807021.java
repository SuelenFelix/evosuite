package kyungseo.poc.simple.web.appcore.geoip;

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
import static kyungseo.poc.simple.web.appcore.geoip.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.lang.Object;

public class CountryResponse_getCountry_18953807021 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27;

    public CountryResponse_getCountry_18953807021() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term28 = new HashMap();
        term27 = newInstance(Class.forName("kyungseo.poc.simple.web.appcore.geoip.CountryResponse"));
        Object term33 = newInstance(Class.forName("java.net.InetAddress"));
        Object term34 = newInstance(Class.forName("java.net.InetAddress$InetAddressHolder"));
        setField(term27, term27.getClass(), "records", term28);
        setField(term34, term34.getClass(), "originalHostName", null);
        setField(term34, term34.getClass(), "hostName", null);
        setIntField(term34, term34.getClass(), "address", 0);
        setIntField(term34, term34.getClass(), "family", 0);
        setField(term33, term33.getClass(), "holder", term34);
        setField(term33, term33.getClass(), "canonicalHostName", "jJCZpVmanW");
        setField(term27, term27.getClass(), "ipAddress", term33);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.appcore.geoip.CountryResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCountry", argTypes, term27, args);
    }

};


