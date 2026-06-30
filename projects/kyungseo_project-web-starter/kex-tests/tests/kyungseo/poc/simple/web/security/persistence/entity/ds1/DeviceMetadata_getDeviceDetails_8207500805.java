package kyungseo.poc.simple.web.security.persistence.entity.ds1;

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
import static kyungseo.poc.simple.web.security.persistence.entity.ds1.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;

public class DeviceMetadata_getDeviceDetails_8207500805 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term209;

    public DeviceMetadata_getDeviceDetails_8207500805() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term210 = new Long(-2813493605142626659L);
        Long term212 = new Long(-8885298608300233488L);
        term209 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.DeviceMetadata"));
        Object term238 = newInstance(Class.forName("java.util.Date"));
        setField(term209, term209.getClass(), "id", term210);
        setField(term209, term209.getClass(), "userId", term212);
        setField(term209, term209.getClass(), "deviceDetails", "hRNSzYYIrc");
        setField(term209, term209.getClass(), "location", "RMFIsYGgne");
        setLongField(term238, term238.getClass(), "fastTime", 1442639565302L);
        setField(term238, term238.getClass(), "cdate", null);
        setField(term209, term209.getClass(), "lastLoggedIn", term238);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.DeviceMetadata");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDeviceDetails", argTypes, term209, args);
    }

};


