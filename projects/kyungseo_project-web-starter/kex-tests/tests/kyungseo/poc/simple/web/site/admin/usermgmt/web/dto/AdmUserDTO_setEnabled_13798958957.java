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

public class AdmUserDTO_setEnabled_13798958957 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12680;

    public AdmUserDTO_setEnabled_13798958957() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12680 = newInstance(Class.forName("kyungseo.poc.simple.web.site.admin.usermgmt.web.dto.AdmUserDTO"));
        setField(term12680, term12680.getClass(), "id", null);
        setField(term12680, term12680.getClass(), "membername", null);
        setField(term12680, term12680.getClass(), "email", null);
        setField(term12680, term12680.getClass(), "password", null);
        setField(term12680, term12680.getClass(), "enabled", null);
        setField(term12680, term12680.getClass(), "age", null);
        setField(term12680, term12680.getClass(), "phoneNumber", null);
        setField(term12680, term12680.getClass(), "country", null);
        setField(term12680, term12680.getClass(), "birthdate", null);
        setField(term12680, term12680.getClass(), "isUsing2FA", null);
        setField(term12680, term12680.getClass(), "secret", null);
        setField(term12680, term12680.getClass(), "roles", null);
        setField(term12680, term12680.getClass(), "regDate", null);
        setField(term12680, term12680.getClass(), "modDate", null);
        setField(term12680, term12680.getClass(), "date", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.site.admin.usermgmt.web.dto.AdmUserDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Boolean");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setEnabled", argTypes, term12680, args);
    }

};


