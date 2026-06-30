package kyungseo.poc.simple.web.site.admin.usermgmt.web.dto;

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
import static kyungseo.poc.simple.web.site.admin.usermgmt.web.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class AdmUserDTO_AdmUserDTOBuilder_age_104297767424 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4275;

    public AdmUserDTO_AdmUserDTOBuilder_age_104297767424() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4275 = newInstance(Class.forName("kyungseo.poc.simple.web.site.admin.usermgmt.web.dto.AdmUserDTO$AdmUserDTOBuilder"));
        setField(term4275, term4275.getClass(), "id", null);
        setField(term4275, term4275.getClass(), "membername", null);
        setField(term4275, term4275.getClass(), "email", null);
        setField(term4275, term4275.getClass(), "password", null);
        setField(term4275, term4275.getClass(), "enabled", null);
        setField(term4275, term4275.getClass(), "age", null);
        setField(term4275, term4275.getClass(), "phoneNumber", null);
        setField(term4275, term4275.getClass(), "country", null);
        setField(term4275, term4275.getClass(), "birthdate", null);
        setField(term4275, term4275.getClass(), "isUsing2FA", null);
        setField(term4275, term4275.getClass(), "secret", null);
        setField(term4275, term4275.getClass(), "roles", null);
        setField(term4275, term4275.getClass(), "regDate", null);
        setField(term4275, term4275.getClass(), "modDate", null);
        setField(term4275, term4275.getClass(), "date", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.site.admin.usermgmt.web.dto.AdmUserDTO$AdmUserDTOBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "age", argTypes, term4275, args);
    }

};


