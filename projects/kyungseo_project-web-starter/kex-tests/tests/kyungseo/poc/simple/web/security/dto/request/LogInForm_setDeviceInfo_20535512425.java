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

public class LogInForm_setDeviceInfo_20535512425 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term495;
     Object term545;

    public LogInForm_setDeviceInfo_20535512425() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term495 = newInstance(Class.forName("kyungseo.poc.simple.web.security.dto.request.LogInForm"));
        Object term520 = newInstance(Class.forName("kyungseo.poc.simple.web.security.dto.request.DeviceInfo"));
        setField(term495, term495.getClass(), "email", "xOEqzGAmDU");
        setField(term495, term495.getClass(), "password", "eZFUvlxvGV");
        setField(term520, term520.getClass(), "deviceId", "BYqFIqCKAV");
        setField(term520, term520.getClass(), "deviceType", "vrQLuWIDJX");
        setField(term495, term495.getClass(), "deviceInfo", term520);
        term545 = newInstance(Class.forName("kyungseo.poc.simple.web.security.dto.request.DeviceInfo"));
        setField(term545, term545.getClass(), "deviceId", "flxyYxBRtu");
        setField(term545, term545.getClass(), "deviceType", "OclPbYPkcH");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.dto.request.LogInForm");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("kyungseo.poc.simple.web.security.dto.request.DeviceInfo");
        Object[] args = new Object[1];
        args[0] = term545;
        callMethod(klass, "setDeviceInfo", argTypes, term495, args);
    }

};


