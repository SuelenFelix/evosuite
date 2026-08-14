package de.rieckpil.courses;

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
import static de.rieckpil.courses.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class RegistrationService_registerUser_14279041121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2;
     Object term16;

    public RegistrationService_registerUser_14279041121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2 = newInstance(Class.forName("de.rieckpil.courses.RegistrationService"));
        Object term3 = newInstance(Class.forName("de.rieckpil.courses.BannedUsersClient"));
        setField(term2, term2.getClass(), "userRepository", null);
        setField(term2, term2.getClass(), "bannedUsersClient", term3);
        Integer term54 = new Integer(568599855);
        term16 = newInstance(Class.forName("de.rieckpil.courses.ContactInformation"));
        Object term29 = newInstance(Class.forName("de.rieckpil.courses.Address"));
        setField(term16, term16.getClass(), "email", "sjlJAEtRrb");
        setField(term29, term29.getClass(), "country", "MuLcgQHgqz");
        setField(term29, term29.getClass(), "city", "xxtlPwDYFs");
        setField(term29, term29.getClass(), "postalCode", term54);
        setField(term16, term16.getClass(), "address", term29);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("de.rieckpil.courses.RegistrationService");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("de.rieckpil.courses.ContactInformation");
        Object[] args = new Object[2];
        args[0] = "PAEBtnZtTD";
        args[1] = term16;
        callMethod(klass, "registerUser", argTypes, term2, args);
    }

};


