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

public class AdmUserDTO_getIsUsing2FA_196617707347 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12670;

    public AdmUserDTO_getIsUsing2FA_196617707347() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12670 = newInstance(Class.forName("kyungseo.poc.simple.web.site.admin.usermgmt.web.dto.AdmUserDTO"));
        setField(term12670, term12670.getClass(), "id", null);
        setField(term12670, term12670.getClass(), "membername", null);
        setField(term12670, term12670.getClass(), "email", null);
        setField(term12670, term12670.getClass(), "password", null);
        setField(term12670, term12670.getClass(), "enabled", null);
        setField(term12670, term12670.getClass(), "age", null);
        setField(term12670, term12670.getClass(), "phoneNumber", null);
        setField(term12670, term12670.getClass(), "country", null);
        setField(term12670, term12670.getClass(), "birthdate", null);
        setField(term12670, term12670.getClass(), "isUsing2FA", null);
        setField(term12670, term12670.getClass(), "secret", null);
        setField(term12670, term12670.getClass(), "roles", null);
        setField(term12670, term12670.getClass(), "regDate", null);
        setField(term12670, term12670.getClass(), "modDate", null);
        setField(term12670, term12670.getClass(), "date", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.site.admin.usermgmt.web.dto.AdmUserDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getIsUsing2FA", argTypes, term12670, args);
    }

};


