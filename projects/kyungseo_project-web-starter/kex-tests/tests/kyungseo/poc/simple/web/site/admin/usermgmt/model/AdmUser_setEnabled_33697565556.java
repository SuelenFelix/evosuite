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

public class AdmUser_setEnabled_33697565556 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6603;

    public AdmUser_setEnabled_33697565556() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6603 = newInstance(Class.forName("kyungseo.poc.simple.web.site.admin.usermgmt.model.AdmUser"));
        setField(term6603, term6603.getClass(), "id", null);
        setField(term6603, term6603.getClass(), "membername", null);
        setField(term6603, term6603.getClass(), "email", null);
        setField(term6603, term6603.getClass(), "password", null);
        setField(term6603, term6603.getClass(), "age", null);
        setField(term6603, term6603.getClass(), "phoneNumber", null);
        setField(term6603, term6603.getClass(), "country", null);
        setField(term6603, term6603.getClass(), "birthdate", null);
        setField(term6603, term6603.getClass(), "enabled", null);
        setField(term6603, term6603.getClass(), "roles", null);
        setField(term6603, term6603.getClass(), "isUsing2FA", null);
        setField(term6603, term6603.getClass(), "secret", null);
        setField(term6603, term6603.getClass(), "regDate", null);
        setField(term6603, term6603.getClass(), "modDate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.site.admin.usermgmt.model.AdmUser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Boolean");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setEnabled", argTypes, term6603, args);
    }

};


