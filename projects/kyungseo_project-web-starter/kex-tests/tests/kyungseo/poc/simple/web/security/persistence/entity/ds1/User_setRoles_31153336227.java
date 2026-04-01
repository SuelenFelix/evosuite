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

public class User_setRoles_31153336227 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6793;

    public User_setRoles_31153336227() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6793 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.User"));
        setField(term6793, term6793.getClass(), "id", null);
        setField(term6793, term6793.getClass(), "membername", null);
        setField(term6793, term6793.getClass(), "email", null);
        setField(term6793, term6793.getClass(), "password", null);
        setField(term6793, term6793.getClass(), "enabled", null);
        setField(term6793, term6793.getClass(), "age", null);
        setField(term6793, term6793.getClass(), "phoneNumber", null);
        setField(term6793, term6793.getClass(), "country", null);
        setField(term6793, term6793.getClass(), "birthdate", null);
        setField(term6793, term6793.getClass(), "roles", null);
        setBooleanField(term6793, term6793.getClass(), "isUsing2FA", false);
        setField(term6793, term6793.getClass(), "secret", null);
        setField(term6793, term6793.getClass(), "regDate", null);
        setField(term6793, term6793.getClass(), "modDate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Collection");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setRoles", argTypes, term6793, args);
    }

};


