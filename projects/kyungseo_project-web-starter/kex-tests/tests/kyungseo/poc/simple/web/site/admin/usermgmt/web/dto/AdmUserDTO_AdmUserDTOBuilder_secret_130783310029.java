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

public class AdmUserDTO_AdmUserDTOBuilder_secret_130783310029 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4280;

    public AdmUserDTO_AdmUserDTOBuilder_secret_130783310029() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4280 = newInstance(Class.forName("kyungseo.poc.simple.web.site.admin.usermgmt.web.dto.AdmUserDTO$AdmUserDTOBuilder"));
        setField(term4280, term4280.getClass(), "id", null);
        setField(term4280, term4280.getClass(), "membername", null);
        setField(term4280, term4280.getClass(), "email", null);
        setField(term4280, term4280.getClass(), "password", null);
        setField(term4280, term4280.getClass(), "enabled", null);
        setField(term4280, term4280.getClass(), "age", null);
        setField(term4280, term4280.getClass(), "phoneNumber", null);
        setField(term4280, term4280.getClass(), "country", null);
        setField(term4280, term4280.getClass(), "birthdate", null);
        setField(term4280, term4280.getClass(), "isUsing2FA", null);
        setField(term4280, term4280.getClass(), "secret", null);
        setField(term4280, term4280.getClass(), "roles", null);
        setField(term4280, term4280.getClass(), "regDate", null);
        setField(term4280, term4280.getClass(), "modDate", null);
        setField(term4280, term4280.getClass(), "date", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.site.admin.usermgmt.web.dto.AdmUserDTO$AdmUserDTOBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "secret", argTypes, term4280, args);
    }

};


