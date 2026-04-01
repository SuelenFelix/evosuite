package kyungseo.poc.simple.web.security.web.dto;

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
import static kyungseo.poc.simple.web.security.web.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Boolean;
import java.lang.Integer;

public class UserDto_getEnabled_9624341511 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1711;

    public UserDto_getEnabled_9624341511() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term1760 = new Boolean(false);
        Integer term1762 = new Integer(-6029667);
        Integer term1801 = new Integer(-2068769794);
        term1711 = newInstance(Class.forName("kyungseo.poc.simple.web.security.web.dto.UserDto"));
        setField(term1711, term1711.getClass(), "membername", "HqBOwkVqjD");
        setField(term1711, term1711.getClass(), "password", "MAcUBcBckh");
        setField(term1711, term1711.getClass(), "matchingPassword", "oVgzLbrsFr");
        setField(term1711, term1711.getClass(), "email", "vQVyKLdtaz");
        setField(term1711, term1711.getClass(), "enabled", term1760);
        setField(term1711, term1711.getClass(), "age", term1762);
        setField(term1711, term1711.getClass(), "phoneNumber", "OWKQODBLzb");
        setField(term1711, term1711.getClass(), "country", "wGmYcqUkgE");
        setField(term1711, term1711.getClass(), "birthdate", "idgaQsnJpQ");
        setBooleanField(term1711, term1711.getClass(), "isUsing2FA", false);
        setField(term1711, term1711.getClass(), "role", term1801);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.web.dto.UserDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEnabled", argTypes, term1711, args);
    }

};


