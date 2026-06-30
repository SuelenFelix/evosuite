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

public class AdmUser_AdmUserBuilder_build_128373874131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10170;

    public AdmUser_AdmUserBuilder_build_128373874131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10170 = newInstance(Class.forName("kyungseo.poc.simple.web.site.admin.usermgmt.model.AdmUser$AdmUserBuilder"));
        setField(term10170, term10170.getClass(), "id", null);
        setField(term10170, term10170.getClass(), "membername", null);
        setField(term10170, term10170.getClass(), "email", null);
        setField(term10170, term10170.getClass(), "password", null);
        setField(term10170, term10170.getClass(), "age", null);
        setField(term10170, term10170.getClass(), "phoneNumber", null);
        setField(term10170, term10170.getClass(), "country", null);
        setField(term10170, term10170.getClass(), "birthdate", null);
        setField(term10170, term10170.getClass(), "enabled", null);
        setField(term10170, term10170.getClass(), "roles", null);
        setField(term10170, term10170.getClass(), "isUsing2FA", null);
        setField(term10170, term10170.getClass(), "secret", null);
        setField(term10170, term10170.getClass(), "regDate", null);
        setField(term10170, term10170.getClass(), "modDate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.site.admin.usermgmt.model.AdmUser$AdmUserBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term10170, args);
    }

};


