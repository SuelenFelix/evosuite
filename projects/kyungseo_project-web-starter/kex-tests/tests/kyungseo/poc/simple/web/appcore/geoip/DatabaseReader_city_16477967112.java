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
import java.lang.Object;

public class DatabaseReader_city_16477967112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term87;
     Object term88;

    public DatabaseReader_city_16477967112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term87 = newInstance(Class.forName("kyungseo.poc.simple.web.appcore.geoip.DatabaseReader"));
        term88 = newInstance(Class.forName("java.net.InetAddress"));
        Object term89 = newInstance(Class.forName("java.net.InetAddress$InetAddressHolder"));
        setField(term89, term89.getClass(), "originalHostName", null);
        setField(term89, term89.getClass(), "hostName", null);
        setIntField(term89, term89.getClass(), "address", 0);
        setIntField(term89, term89.getClass(), "family", 0);
        setField(term88, term88.getClass(), "holder", term89);
        setField(term88, term88.getClass(), "canonicalHostName", "SzjVpOQTyS");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.appcore.geoip.DatabaseReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.net.InetAddress");
        Object[] args = new Object[1];
        args[0] = term88;
        callMethod(klass, "city", argTypes, term87, args);
    }

};


