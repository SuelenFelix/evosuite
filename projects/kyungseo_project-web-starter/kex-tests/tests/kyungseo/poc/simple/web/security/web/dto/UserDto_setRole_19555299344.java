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

public class UserDto_setRole_19555299344 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term509;
     Object term601;

    public UserDto_setRole_19555299344() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term558 = new Boolean(false);
        Integer term560 = new Integer(-1955890973);
        Integer term599 = new Integer(-2038273078);
        term509 = newInstance(Class.forName("kyungseo.poc.simple.web.security.web.dto.UserDto"));
        setField(term509, term509.getClass(), "membername", "xOEqzGAmDU");
        setField(term509, term509.getClass(), "password", "eZFUvlxvGV");
        setField(term509, term509.getClass(), "matchingPassword", "BYqFIqCKAV");
        setField(term509, term509.getClass(), "email", "vrQLuWIDJX");
        setField(term509, term509.getClass(), "enabled", term558);
        setField(term509, term509.getClass(), "age", term560);
        setField(term509, term509.getClass(), "phoneNumber", "flxyYxBRtu");
        setField(term509, term509.getClass(), "country", "OclPbYPkcH");
        setField(term509, term509.getClass(), "birthdate", "IoAlmYsBwc");
        setBooleanField(term509, term509.getClass(), "isUsing2FA", false);
        setField(term509, term509.getClass(), "role", term599);
        term601 = new Integer(1227103734);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.web.dto.UserDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term601;
        callMethod(klass, "setRole", argTypes, term509, args);
    }

};


