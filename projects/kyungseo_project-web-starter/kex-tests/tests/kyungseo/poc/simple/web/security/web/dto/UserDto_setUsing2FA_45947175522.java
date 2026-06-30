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

public class UserDto_setUsing2FA_45947175522 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3563;
     Object term3655;

    public UserDto_setUsing2FA_45947175522() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term3612 = new Boolean(true);
        Integer term3614 = new Integer(1876565163);
        Integer term3653 = new Integer(-817164822);
        term3563 = newInstance(Class.forName("kyungseo.poc.simple.web.security.web.dto.UserDto"));
        setField(term3563, term3563.getClass(), "membername", "XkIoWJRNwN");
        setField(term3563, term3563.getClass(), "password", "aNWLJdrZMq");
        setField(term3563, term3563.getClass(), "matchingPassword", "HHmNoYxIGj");
        setField(term3563, term3563.getClass(), "email", "PtirvZmsGt");
        setField(term3563, term3563.getClass(), "enabled", term3612);
        setField(term3563, term3563.getClass(), "age", term3614);
        setField(term3563, term3563.getClass(), "phoneNumber", "HWkpTmtlrc");
        setField(term3563, term3563.getClass(), "country", "hMmaoREuCK");
        setField(term3563, term3563.getClass(), "birthdate", "VeDtgDzGAN");
        setBooleanField(term3563, term3563.getClass(), "isUsing2FA", true);
        setField(term3563, term3563.getClass(), "role", term3653);
        term3655 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.web.dto.UserDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term3655;
        callMethod(klass, "setUsing2FA", argTypes, term3563, args);
    }

};


