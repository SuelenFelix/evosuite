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

public class User_isUsing2FA_203301438646 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7251;

    public User_isUsing2FA_203301438646() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7251 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.User"));
        setField(term7251, term7251.getClass(), "id", null);
        setField(term7251, term7251.getClass(), "membername", null);
        setField(term7251, term7251.getClass(), "email", null);
        setField(term7251, term7251.getClass(), "password", null);
        setField(term7251, term7251.getClass(), "enabled", null);
        setField(term7251, term7251.getClass(), "age", null);
        setField(term7251, term7251.getClass(), "phoneNumber", null);
        setField(term7251, term7251.getClass(), "country", null);
        setField(term7251, term7251.getClass(), "birthdate", null);
        setField(term7251, term7251.getClass(), "roles", null);
        setBooleanField(term7251, term7251.getClass(), "isUsing2FA", false);
        setField(term7251, term7251.getClass(), "secret", null);
        setField(term7251, term7251.getClass(), "regDate", null);
        setField(term7251, term7251.getClass(), "modDate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isUsing2FA", argTypes, term7251, args);
    }

};


