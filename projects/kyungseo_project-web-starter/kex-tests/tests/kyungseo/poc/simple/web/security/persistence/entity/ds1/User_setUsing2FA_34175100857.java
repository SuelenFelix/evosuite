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
import java.lang.Boolean;

public class User_setUsing2FA_34175100857 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7273;
     Object term7275;

    public User_setUsing2FA_34175100857() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7273 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.User"));
        setField(term7273, term7273.getClass(), "id", null);
        setField(term7273, term7273.getClass(), "membername", null);
        setField(term7273, term7273.getClass(), "email", null);
        setField(term7273, term7273.getClass(), "password", null);
        setField(term7273, term7273.getClass(), "enabled", null);
        setField(term7273, term7273.getClass(), "age", null);
        setField(term7273, term7273.getClass(), "phoneNumber", null);
        setField(term7273, term7273.getClass(), "country", null);
        setField(term7273, term7273.getClass(), "birthdate", null);
        setField(term7273, term7273.getClass(), "roles", null);
        setBooleanField(term7273, term7273.getClass(), "isUsing2FA", false);
        setField(term7273, term7273.getClass(), "secret", null);
        setField(term7273, term7273.getClass(), "regDate", null);
        setField(term7273, term7273.getClass(), "modDate", null);
        term7275 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term7275;
        callMethod(klass, "setUsing2FA", argTypes, term7273, args);
    }

};


