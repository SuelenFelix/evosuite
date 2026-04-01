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

public class DatabaseReader_country_7503291651 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60;
     Object term61;

    public DatabaseReader_country_7503291651() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term60 = newInstance(Class.forName("kyungseo.poc.simple.web.appcore.geoip.DatabaseReader"));
        term61 = newInstance(Class.forName("java.net.InetAddress"));
        Object term62 = newInstance(Class.forName("java.net.InetAddress$InetAddressHolder"));
        setField(term62, term62.getClass(), "originalHostName", null);
        setField(term62, term62.getClass(), "hostName", null);
        setIntField(term62, term62.getClass(), "address", 0);
        setIntField(term62, term62.getClass(), "family", 0);
        setField(term61, term61.getClass(), "holder", term62);
        setField(term61, term61.getClass(), "canonicalHostName", "EGtDIRbSSb");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.appcore.geoip.DatabaseReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.net.InetAddress");
        Object[] args = new Object[1];
        args[0] = term61;
        callMethod(klass, "country", argTypes, term60, args);
    }

};


