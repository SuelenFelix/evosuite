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

public class UserDto_toString_155738634123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3727;

    public UserDto_toString_155738634123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term3776 = new Boolean(true);
        Integer term3778 = new Integer(-1016503459);
        Integer term3817 = new Integer(-1968847291);
        term3727 = newInstance(Class.forName("kyungseo.poc.simple.web.security.web.dto.UserDto"));
        setField(term3727, term3727.getClass(), "membername", "aWYOWZFyaX");
        setField(term3727, term3727.getClass(), "password", "BRIVNtfUWU");
        setField(term3727, term3727.getClass(), "matchingPassword", "DbiCVtPPCT");
        setField(term3727, term3727.getClass(), "email", "WzFopsaDuG");
        setField(term3727, term3727.getClass(), "enabled", term3776);
        setField(term3727, term3727.getClass(), "age", term3778);
        setField(term3727, term3727.getClass(), "phoneNumber", "PapWxkhEWe");
        setField(term3727, term3727.getClass(), "country", "smnHEqRFRx");
        setField(term3727, term3727.getClass(), "birthdate", "XYtryyobou");
        setBooleanField(term3727, term3727.getClass(), "isUsing2FA", true);
        setField(term3727, term3727.getClass(), "role", term3817);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.web.dto.UserDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term3727, args);
    }

};


