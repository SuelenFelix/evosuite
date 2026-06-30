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

public class LogInForm_setPassword_2902106204 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term383;

    public LogInForm_setPassword_2902106204() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term383 = newInstance(Class.forName("kyungseo.poc.simple.web.security.dto.request.LogInForm"));
        Object term408 = newInstance(Class.forName("kyungseo.poc.simple.web.security.dto.request.DeviceInfo"));
        setField(term383, term383.getClass(), "email", "tbcdzjIfER");
        setField(term383, term383.getClass(), "password", "HyxfbSQYBe");
        setField(term408, term408.getClass(), "deviceId", "pCTimMblYc");
        setField(term408, term408.getClass(), "deviceType", "hNxWaHcfhY");
        setField(term383, term383.getClass(), "deviceInfo", term408);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.dto.request.LogInForm");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "RkybSrpybU";
        callMethod(klass, "setPassword", argTypes, term383, args);
    }

};


