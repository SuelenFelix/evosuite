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

public class UserDto_isUsing2FA_214423216321 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3401;

    public UserDto_isUsing2FA_214423216321() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term3450 = new Boolean(true);
        Integer term3452 = new Integer(-602026508);
        Integer term3491 = new Integer(-157887805);
        term3401 = newInstance(Class.forName("kyungseo.poc.simple.web.security.web.dto.UserDto"));
        setField(term3401, term3401.getClass(), "membername", "FPvxVzzSvD");
        setField(term3401, term3401.getClass(), "password", "WHcwFgsGFC");
        setField(term3401, term3401.getClass(), "matchingPassword", "HzqpegHiRq");
        setField(term3401, term3401.getClass(), "email", "jwsfVjMoJT");
        setField(term3401, term3401.getClass(), "enabled", term3450);
        setField(term3401, term3401.getClass(), "age", term3452);
        setField(term3401, term3401.getClass(), "phoneNumber", "ZfdXfCCFDf");
        setField(term3401, term3401.getClass(), "country", "MwwjNtdOFT");
        setField(term3401, term3401.getClass(), "birthdate", "VYkqXKVlAJ");
        setBooleanField(term3401, term3401.getClass(), "isUsing2FA", true);
        setField(term3401, term3401.getClass(), "role", term3491);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.web.dto.UserDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isUsing2FA", argTypes, term3401, args);
    }

};


