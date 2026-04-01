package kyungseo.poc.simple.web.security.service;

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
import static kyungseo.poc.simple.web.security.service.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class JwtUserDeviceService_createUserDevice_1671724983 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1283;

    public JwtUserDeviceService_createUserDevice_1671724983() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1283 = newInstance(Class.forName("kyungseo.poc.simple.web.security.dto.request.DeviceInfo"));
        setField(term1283, term1283.getClass(), "deviceId", "zcorEihhLK");
        setField(term1283, term1283.getClass(), "deviceType", "GrqozDKFOk");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.service.JwtUserDeviceService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("kyungseo.poc.simple.web.security.dto.request.DeviceInfo");
        Object[] args = new Object[1];
        args[0] = term1283;
        callMethod(klass, "createUserDevice", argTypes, null, args);
    }

};


