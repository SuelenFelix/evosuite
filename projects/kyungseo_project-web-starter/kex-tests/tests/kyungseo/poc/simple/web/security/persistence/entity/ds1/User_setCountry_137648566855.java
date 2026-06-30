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

public class User_setCountry_137648566855 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7269;

    public User_setCountry_137648566855() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7269 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.User"));
        setField(term7269, term7269.getClass(), "id", null);
        setField(term7269, term7269.getClass(), "membername", null);
        setField(term7269, term7269.getClass(), "email", null);
        setField(term7269, term7269.getClass(), "password", null);
        setField(term7269, term7269.getClass(), "enabled", null);
        setField(term7269, term7269.getClass(), "age", null);
        setField(term7269, term7269.getClass(), "phoneNumber", null);
        setField(term7269, term7269.getClass(), "country", null);
        setField(term7269, term7269.getClass(), "birthdate", null);
        setField(term7269, term7269.getClass(), "roles", null);
        setBooleanField(term7269, term7269.getClass(), "isUsing2FA", false);
        setField(term7269, term7269.getClass(), "secret", null);
        setField(term7269, term7269.getClass(), "regDate", null);
        setField(term7269, term7269.getClass(), "modDate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setCountry", argTypes, term7269, args);
    }

};


