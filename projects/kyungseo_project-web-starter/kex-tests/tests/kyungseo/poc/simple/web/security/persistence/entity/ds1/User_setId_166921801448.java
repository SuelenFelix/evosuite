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

public class User_setId_166921801448 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7255;

    public User_setId_166921801448() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7255 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.User"));
        setField(term7255, term7255.getClass(), "id", null);
        setField(term7255, term7255.getClass(), "membername", null);
        setField(term7255, term7255.getClass(), "email", null);
        setField(term7255, term7255.getClass(), "password", null);
        setField(term7255, term7255.getClass(), "enabled", null);
        setField(term7255, term7255.getClass(), "age", null);
        setField(term7255, term7255.getClass(), "phoneNumber", null);
        setField(term7255, term7255.getClass(), "country", null);
        setField(term7255, term7255.getClass(), "birthdate", null);
        setField(term7255, term7255.getClass(), "roles", null);
        setBooleanField(term7255, term7255.getClass(), "isUsing2FA", false);
        setField(term7255, term7255.getClass(), "secret", null);
        setField(term7255, term7255.getClass(), "regDate", null);
        setField(term7255, term7255.getClass(), "modDate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setId", argTypes, term7255, args);
    }

};


