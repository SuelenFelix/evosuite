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

public class AdmUserDTO_setRoles_111893651927 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10862;

    public AdmUserDTO_setRoles_111893651927() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10862 = newInstance(Class.forName("kyungseo.poc.simple.web.site.admin.usermgmt.web.dto.AdmUserDTO"));
        setField(term10862, term10862.getClass(), "id", null);
        setField(term10862, term10862.getClass(), "membername", null);
        setField(term10862, term10862.getClass(), "email", null);
        setField(term10862, term10862.getClass(), "password", null);
        setField(term10862, term10862.getClass(), "enabled", null);
        setField(term10862, term10862.getClass(), "age", null);
        setField(term10862, term10862.getClass(), "phoneNumber", null);
        setField(term10862, term10862.getClass(), "country", null);
        setField(term10862, term10862.getClass(), "birthdate", null);
        setField(term10862, term10862.getClass(), "isUsing2FA", null);
        setField(term10862, term10862.getClass(), "secret", null);
        setField(term10862, term10862.getClass(), "roles", null);
        setField(term10862, term10862.getClass(), "regDate", null);
        setField(term10862, term10862.getClass(), "modDate", null);
        setField(term10862, term10862.getClass(), "date", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.site.admin.usermgmt.web.dto.AdmUserDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Collection");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setRoles", argTypes, term10862, args);
    }

};


