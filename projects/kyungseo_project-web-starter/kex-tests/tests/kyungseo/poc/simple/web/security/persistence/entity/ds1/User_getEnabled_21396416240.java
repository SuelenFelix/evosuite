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

public class User_getEnabled_21396416240 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7239;

    public User_getEnabled_21396416240() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7239 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.User"));
        setField(term7239, term7239.getClass(), "id", null);
        setField(term7239, term7239.getClass(), "membername", null);
        setField(term7239, term7239.getClass(), "email", null);
        setField(term7239, term7239.getClass(), "password", null);
        setField(term7239, term7239.getClass(), "enabled", null);
        setField(term7239, term7239.getClass(), "age", null);
        setField(term7239, term7239.getClass(), "phoneNumber", null);
        setField(term7239, term7239.getClass(), "country", null);
        setField(term7239, term7239.getClass(), "birthdate", null);
        setField(term7239, term7239.getClass(), "roles", null);
        setBooleanField(term7239, term7239.getClass(), "isUsing2FA", false);
        setField(term7239, term7239.getClass(), "secret", null);
        setField(term7239, term7239.getClass(), "regDate", null);
        setField(term7239, term7239.getClass(), "modDate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEnabled", argTypes, term7239, args);
    }

};


