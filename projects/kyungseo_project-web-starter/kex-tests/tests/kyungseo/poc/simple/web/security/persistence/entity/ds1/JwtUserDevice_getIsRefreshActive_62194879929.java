package kyungseo.poc.simple.web.security.persistence.entity.ds1;

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
import static kyungseo.poc.simple.web.security.persistence.entity.ds1.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class JwtUserDevice_getIsRefreshActive_62194879929 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26696;

    public JwtUserDevice_getIsRefreshActive_62194879929() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26696 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.JwtUserDevice"));
        setField(term26696, term26696.getClass(), "id", null);
        setField(term26696, term26696.getClass(), "user", null);
        setField(term26696, term26696.getClass(), "deviceType", null);
        setField(term26696, term26696.getClass(), "deviceId", null);
        setField(term26696, term26696.getClass(), "refreshToken", null);
        setField(term26696, term26696.getClass(), "isRefreshActive", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.JwtUserDevice");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getIsRefreshActive", argTypes, term26696, args);
    }

};


