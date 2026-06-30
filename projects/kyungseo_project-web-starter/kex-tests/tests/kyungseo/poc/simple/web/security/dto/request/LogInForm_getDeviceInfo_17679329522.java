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

public class LogInForm_getDeviceInfo_17679329522 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term181;

    public LogInForm_getDeviceInfo_17679329522() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term181 = newInstance(Class.forName("kyungseo.poc.simple.web.security.dto.request.LogInForm"));
        Object term206 = newInstance(Class.forName("kyungseo.poc.simple.web.security.dto.request.DeviceInfo"));
        setField(term181, term181.getClass(), "email", "hRNSzYYIrc");
        setField(term181, term181.getClass(), "password", "RMFIsYGgne");
        setField(term206, term206.getClass(), "deviceId", "NRdvgJlhkX");
        setField(term206, term206.getClass(), "deviceType", "uuaPigETmJ");
        setField(term181, term181.getClass(), "deviceInfo", term206);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.dto.request.LogInForm");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDeviceInfo", argTypes, term181, args);
    }

};


