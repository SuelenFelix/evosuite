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

public class AdmUser_setBirthdate_90951343855 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6602;

    public AdmUser_setBirthdate_90951343855() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6602 = newInstance(Class.forName("kyungseo.poc.simple.web.site.admin.usermgmt.model.AdmUser"));
        setField(term6602, term6602.getClass(), "id", null);
        setField(term6602, term6602.getClass(), "membername", null);
        setField(term6602, term6602.getClass(), "email", null);
        setField(term6602, term6602.getClass(), "password", null);
        setField(term6602, term6602.getClass(), "age", null);
        setField(term6602, term6602.getClass(), "phoneNumber", null);
        setField(term6602, term6602.getClass(), "country", null);
        setField(term6602, term6602.getClass(), "birthdate", null);
        setField(term6602, term6602.getClass(), "enabled", null);
        setField(term6602, term6602.getClass(), "roles", null);
        setField(term6602, term6602.getClass(), "isUsing2FA", null);
        setField(term6602, term6602.getClass(), "secret", null);
        setField(term6602, term6602.getClass(), "regDate", null);
        setField(term6602, term6602.getClass(), "modDate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.site.admin.usermgmt.model.AdmUser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setBirthdate", argTypes, term6602, args);
    }

};


