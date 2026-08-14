package au.csiro.fhir.owl;

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
import static au.csiro.fhir.owl.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Application_1_checkServerTrusted_16276013443 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17313;

    public Application_1_checkServerTrusted_16276013443() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17313 = (Object[]) newArray("java.security.cert.X509Certificate", 6);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("au.csiro.fhir.owl.Application$1");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Class.forName("java.security.cert.X509Certificate"), 0).getClass();
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term17313;
        args[1] = "oVcInYnLWB";
        callMethod(klass, "checkServerTrusted", argTypes, null, args);
    }

};


