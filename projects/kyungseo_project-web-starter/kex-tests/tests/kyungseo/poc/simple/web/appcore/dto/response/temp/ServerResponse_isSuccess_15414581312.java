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

public class ServerResponse_isSuccess_15414581312 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4421;

    public ServerResponse_isSuccess_15414581312() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term4422 = new Integer(391863371);
        term4421 = newInstance(Class.forName("kyungseo.poc.simple.web.appcore.dto.response.temp.ServerResponse"));
        Object term4436 = newInstance(Class.forName("java.lang.Object"));
        setField(term4421, term4421.getClass(), "status", term4422);
        setField(term4421, term4421.getClass(), "msg", "jJCZpVmanW");
        setField(term4421, term4421.getClass(), "data", term4436);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.appcore.dto.response.temp.ServerResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isSuccess", argTypes, term4421, args);
    }

};


