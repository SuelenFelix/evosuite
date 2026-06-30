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

public class JwtRefreshToken_hashCode_153225581820 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32153;

    public JwtRefreshToken_hashCode_153225581820() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32153 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.JwtRefreshToken"));
        setField(term32153, term32153.getClass(), "id", null);
        setField(term32153, term32153.getClass(), "token", null);
        setField(term32153, term32153.getClass(), "userDevice", null);
        setField(term32153, term32153.getClass(), "refreshCount", null);
        setField(term32153, term32153.getClass(), "expiryDate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.JwtRefreshToken");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term32153, args);
    }

};


