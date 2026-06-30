package kyungseo.poc.simple.web.appcore.dto.response.temp;

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
import static kyungseo.poc.simple.web.appcore.dto.response.temp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;

public class ServerResponse_getStatus_87686050610 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4539;

    public ServerResponse_getStatus_87686050610() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term4540 = new Integer(-1922583790);
        term4539 = newInstance(Class.forName("kyungseo.poc.simple.web.appcore.dto.response.temp.ServerResponse"));
        Object term4554 = newInstance(Class.forName("java.lang.Object"));
        setField(term4539, term4539.getClass(), "status", term4540);
        setField(term4539, term4539.getClass(), "msg", "RMFIsYGgne");
        setField(term4539, term4539.getClass(), "data", term4554);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.appcore.dto.response.temp.ServerResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStatus", argTypes, term4539, args);
    }

};


