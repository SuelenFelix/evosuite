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

public class AdmUser_setPhoneNumber_114900596453 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6600;

    public AdmUser_setPhoneNumber_114900596453() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6600 = newInstance(Class.forName("kyungseo.poc.simple.web.site.admin.usermgmt.model.AdmUser"));
        setField(term6600, term6600.getClass(), "id", null);
        setField(term6600, term6600.getClass(), "membername", null);
        setField(term6600, term6600.getClass(), "email", null);
        setField(term6600, term6600.getClass(), "password", null);
        setField(term6600, term6600.getClass(), "age", null);
        setField(term6600, term6600.getClass(), "phoneNumber", null);
        setField(term6600, term6600.getClass(), "country", null);
        setField(term6600, term6600.getClass(), "birthdate", null);
        setField(term6600, term6600.getClass(), "enabled", null);
        setField(term6600, term6600.getClass(), "roles", null);
        setField(term6600, term6600.getClass(), "isUsing2FA", null);
        setField(term6600, term6600.getClass(), "secret", null);
        setField(term6600, term6600.getClass(), "regDate", null);
        setField(term6600, term6600.getClass(), "modDate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.site.admin.usermgmt.model.AdmUser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setPhoneNumber", argTypes, term6600, args);
    }

};


