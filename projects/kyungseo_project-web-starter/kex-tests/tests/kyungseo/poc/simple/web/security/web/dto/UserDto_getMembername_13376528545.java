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

public class UserDto_getMembername_13376528545 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term673;

    public UserDto_getMembername_13376528545() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term722 = new Boolean(true);
        Integer term724 = new Integer(-1339778481);
        Integer term763 = new Integer(1725571209);
        term673 = newInstance(Class.forName("kyungseo.poc.simple.web.security.web.dto.UserDto"));
        setField(term673, term673.getClass(), "membername", "TEParAifyi");
        setField(term673, term673.getClass(), "password", "OWDIEULEFu");
        setField(term673, term673.getClass(), "matchingPassword", "dWRymuLBtr");
        setField(term673, term673.getClass(), "email", "AijpHYOFuy");
        setField(term673, term673.getClass(), "enabled", term722);
        setField(term673, term673.getClass(), "age", term724);
        setField(term673, term673.getClass(), "phoneNumber", "SbAoxhfrkn");
        setField(term673, term673.getClass(), "country", "kuTXqwMtDB");
        setField(term673, term673.getClass(), "birthdate", "Ghbwtircqb");
        setBooleanField(term673, term673.getClass(), "isUsing2FA", true);
        setField(term673, term673.getClass(), "role", term763);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.web.dto.UserDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMembername", argTypes, term673, args);
    }

};


