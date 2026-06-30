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
import java.lang.Object;

public class LogOutRequest_setDeviceInfo_17024420623 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2521;
     Object term2559;

    public LogOutRequest_setDeviceInfo_17024420623() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2521 = newInstance(Class.forName("kyungseo.poc.simple.web.security.dto.request.LogOutRequest"));
        Object term2534 = newInstance(Class.forName("kyungseo.poc.simple.web.security.dto.request.DeviceInfo"));
        setField(term2521, term2521.getClass(), "token", "aNWLJdrZMq");
        setField(term2534, term2534.getClass(), "deviceId", "HHmNoYxIGj");
        setField(term2534, term2534.getClass(), "deviceType", "PtirvZmsGt");
        setField(term2521, term2521.getClass(), "deviceInfo", term2534);
        term2559 = newInstance(Class.forName("kyungseo.poc.simple.web.security.dto.request.DeviceInfo"));
        setField(term2559, term2559.getClass(), "deviceId", "HWkpTmtlrc");
        setField(term2559, term2559.getClass(), "deviceType", "hMmaoREuCK");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.dto.request.LogOutRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("kyungseo.poc.simple.web.security.dto.request.DeviceInfo");
        Object[] args = new Object[1];
        args[0] = term2559;
        callMethod(klass, "setDeviceInfo", argTypes, term2521, args);
    }

};


