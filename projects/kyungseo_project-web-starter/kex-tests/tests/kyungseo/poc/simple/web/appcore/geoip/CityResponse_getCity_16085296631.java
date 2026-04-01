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

public class CityResponse_getCity_16085296631 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term282;

    public CityResponse_getCity_16085296631() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term283 = new HashMap();
        term282 = newInstance(Class.forName("kyungseo.poc.simple.web.appcore.geoip.CityResponse"));
        Object term288 = newInstance(Class.forName("java.net.InetAddress"));
        Object term289 = newInstance(Class.forName("java.net.InetAddress$InetAddressHolder"));
        setField(term282, term282.getClass(), "records", term283);
        setField(term289, term289.getClass(), "originalHostName", null);
        setField(term289, term289.getClass(), "hostName", null);
        setIntField(term289, term289.getClass(), "address", 0);
        setIntField(term289, term289.getClass(), "family", 0);
        setField(term288, term288.getClass(), "holder", term289);
        setField(term288, term288.getClass(), "canonicalHostName", "oVcInYnLWB");
        setField(term282, term282.getClass(), "ipAddress", term288);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.appcore.geoip.CityResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCity", argTypes, term282, args);
    }

};


