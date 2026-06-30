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

public class LogOutRequest_setToken_3098519102 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2431;

    public LogOutRequest_setToken_3098519102() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2431 = newInstance(Class.forName("kyungseo.poc.simple.web.security.dto.request.LogOutRequest"));
        Object term2444 = newInstance(Class.forName("kyungseo.poc.simple.web.security.dto.request.DeviceInfo"));
        setField(term2431, term2431.getClass(), "token", "ZfdXfCCFDf");
        setField(term2444, term2444.getClass(), "deviceId", "MwwjNtdOFT");
        setField(term2444, term2444.getClass(), "deviceType", "VYkqXKVlAJ");
        setField(term2431, term2431.getClass(), "deviceInfo", term2444);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.dto.request.LogOutRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "XkIoWJRNwN";
        callMethod(klass, "setToken", argTypes, term2431, args);
    }

};


