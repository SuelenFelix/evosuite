package kyungseo.poc.simple.web.site.admin.usermgmt.model;

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
import static kyungseo.poc.simple.web.site.admin.usermgmt.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class AdmUser_setRoles_131792258525 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5410;

    public AdmUser_setRoles_131792258525() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5410 = newInstance(Class.forName("kyungseo.poc.simple.web.site.admin.usermgmt.model.AdmUser"));
        setField(term5410, term5410.getClass(), "id", null);
        setField(term5410, term5410.getClass(), "membername", null);
        setField(term5410, term5410.getClass(), "email", null);
        setField(term5410, term5410.getClass(), "password", null);
        setField(term5410, term5410.getClass(), "age", null);
        setField(term5410, term5410.getClass(), "phoneNumber", null);
        setField(term5410, term5410.getClass(), "country", null);
        setField(term5410, term5410.getClass(), "birthdate", null);
        setField(term5410, term5410.getClass(), "enabled", null);
        setField(term5410, term5410.getClass(), "roles", null);
        setField(term5410, term5410.getClass(), "isUsing2FA", null);
        setField(term5410, term5410.getClass(), "secret", null);
        setField(term5410, term5410.getClass(), "regDate", null);
        setField(term5410, term5410.getClass(), "modDate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.site.admin.usermgmt.model.AdmUser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Collection");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setRoles", argTypes, term5410, args);
    }

};


