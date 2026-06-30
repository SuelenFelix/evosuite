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

public class CityResponse_init_5481776890 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term256;

    public CityResponse_init_5481776890() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term256 = newInstance(Class.forName("java.net.InetAddress"));
        Object term257 = newInstance(Class.forName("java.net.InetAddress$InetAddressHolder"));
        setField(term257, term257.getClass(), "originalHostName", null);
        setField(term257, term257.getClass(), "hostName", null);
        setIntField(term257, term257.getClass(), "address", 0);
        setIntField(term257, term257.getClass(), "family", 0);
        setField(term256, term256.getClass(), "holder", term257);
        setField(term256, term256.getClass(), "canonicalHostName", "LQFpaHEwXR");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.appcore.geoip.CityResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.net.InetAddress");
        Object[] args = new Object[1];
        args[0] = term256;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


