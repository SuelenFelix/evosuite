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

public class UserDto_setCountry_149420641518 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2871;

    public UserDto_setCountry_149420641518() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term2920 = new Boolean(false);
        Integer term2922 = new Integer(-1530420153);
        Integer term2961 = new Integer(-469968304);
        term2871 = newInstance(Class.forName("kyungseo.poc.simple.web.security.web.dto.UserDto"));
        setField(term2871, term2871.getClass(), "membername", "AdxvLJhNLe");
        setField(term2871, term2871.getClass(), "password", "lHfTrWKMPk");
        setField(term2871, term2871.getClass(), "matchingPassword", "JDaAnsVTGV");
        setField(term2871, term2871.getClass(), "email", "mLUZFTfjle");
        setField(term2871, term2871.getClass(), "enabled", term2920);
        setField(term2871, term2871.getClass(), "age", term2922);
        setField(term2871, term2871.getClass(), "phoneNumber", "xIeFjkHkOe");
        setField(term2871, term2871.getClass(), "country", "SdCKLMIYnX");
        setField(term2871, term2871.getClass(), "birthdate", "OJJtVNPyKZ");
        setBooleanField(term2871, term2871.getClass(), "isUsing2FA", true);
        setField(term2871, term2871.getClass(), "role", term2961);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.web.dto.UserDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "AKNapTAfmD";
        callMethod(klass, "setCountry", argTypes, term2871, args);
    }

};


