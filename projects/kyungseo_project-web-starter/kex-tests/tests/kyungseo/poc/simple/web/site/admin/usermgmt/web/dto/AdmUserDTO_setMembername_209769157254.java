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

public class AdmUserDTO_setMembername_209769157254 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12677;

    public AdmUserDTO_setMembername_209769157254() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12677 = newInstance(Class.forName("kyungseo.poc.simple.web.site.admin.usermgmt.web.dto.AdmUserDTO"));
        setField(term12677, term12677.getClass(), "id", null);
        setField(term12677, term12677.getClass(), "membername", null);
        setField(term12677, term12677.getClass(), "email", null);
        setField(term12677, term12677.getClass(), "password", null);
        setField(term12677, term12677.getClass(), "enabled", null);
        setField(term12677, term12677.getClass(), "age", null);
        setField(term12677, term12677.getClass(), "phoneNumber", null);
        setField(term12677, term12677.getClass(), "country", null);
        setField(term12677, term12677.getClass(), "birthdate", null);
        setField(term12677, term12677.getClass(), "isUsing2FA", null);
        setField(term12677, term12677.getClass(), "secret", null);
        setField(term12677, term12677.getClass(), "roles", null);
        setField(term12677, term12677.getClass(), "regDate", null);
        setField(term12677, term12677.getClass(), "modDate", null);
        setField(term12677, term12677.getClass(), "date", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.site.admin.usermgmt.web.dto.AdmUserDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setMembername", argTypes, term12677, args);
    }

};


