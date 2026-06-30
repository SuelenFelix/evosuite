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

public class LogInForm_getEmail_2994832630 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public LogInForm_getEmail_2994832630() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("kyungseo.poc.simple.web.security.dto.request.LogInForm"));
        Object term26 = newInstance(Class.forName("kyungseo.poc.simple.web.security.dto.request.DeviceInfo"));
        setField(term1, term1.getClass(), "email", "PAEBtnZtTD");
        setField(term1, term1.getClass(), "password", "sjlJAEtRrb");
        setField(term26, term26.getClass(), "deviceId", "MuLcgQHgqz");
        setField(term26, term26.getClass(), "deviceType", "xxtlPwDYFs");
        setField(term1, term1.getClass(), "deviceInfo", term26);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.dto.request.LogInForm");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEmail", argTypes, term1, args);
    }

};


