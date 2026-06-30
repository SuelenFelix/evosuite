package kyungseo.poc.simple.web.security.dto.request;

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
import static kyungseo.poc.simple.web.security.dto.request.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class DeviceInfo_getDeviceId_10430585634 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1737;

    public DeviceInfo_getDeviceId_10430585634() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1737 = newInstance(Class.forName("kyungseo.poc.simple.web.security.dto.request.DeviceInfo"));
        setField(term1737, term1737.getClass(), "deviceId", null);
        setField(term1737, term1737.getClass(), "deviceType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.dto.request.DeviceInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDeviceId", argTypes, term1737, args);
    }

};


