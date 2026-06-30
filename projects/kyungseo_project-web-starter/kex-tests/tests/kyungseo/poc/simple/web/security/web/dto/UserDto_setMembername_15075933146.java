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

public class UserDto_setMembername_15075933146 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term835;

    public UserDto_setMembername_15075933146() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term884 = new Boolean(true);
        Integer term886 = new Integer(-522618178);
        Integer term925 = new Integer(1134449235);
        term835 = newInstance(Class.forName("kyungseo.poc.simple.web.security.web.dto.UserDto"));
        setField(term835, term835.getClass(), "membername", "xrwlQZdwCp");
        setField(term835, term835.getClass(), "password", "IDCWpPLRkE");
        setField(term835, term835.getClass(), "matchingPassword", "nyiiPDVjAc");
        setField(term835, term835.getClass(), "email", "aKnKipADSo");
        setField(term835, term835.getClass(), "enabled", term884);
        setField(term835, term835.getClass(), "age", term886);
        setField(term835, term835.getClass(), "phoneNumber", "wSQxaModmm");
        setField(term835, term835.getClass(), "country", "UlajhuVLaP");
        setField(term835, term835.getClass(), "birthdate", "gGSMzuGICf");
        setBooleanField(term835, term835.getClass(), "isUsing2FA", true);
        setField(term835, term835.getClass(), "role", term925);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.web.dto.UserDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "hxCBltsObl";
        callMethod(klass, "setMembername", argTypes, term835, args);
    }

};


