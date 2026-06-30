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

public class AdmUser_setIsUsing2FA_107147362957 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6604;

    public AdmUser_setIsUsing2FA_107147362957() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6604 = newInstance(Class.forName("kyungseo.poc.simple.web.site.admin.usermgmt.model.AdmUser"));
        setField(term6604, term6604.getClass(), "id", null);
        setField(term6604, term6604.getClass(), "membername", null);
        setField(term6604, term6604.getClass(), "email", null);
        setField(term6604, term6604.getClass(), "password", null);
        setField(term6604, term6604.getClass(), "age", null);
        setField(term6604, term6604.getClass(), "phoneNumber", null);
        setField(term6604, term6604.getClass(), "country", null);
        setField(term6604, term6604.getClass(), "birthdate", null);
        setField(term6604, term6604.getClass(), "enabled", null);
        setField(term6604, term6604.getClass(), "roles", null);
        setField(term6604, term6604.getClass(), "isUsing2FA", null);
        setField(term6604, term6604.getClass(), "secret", null);
        setField(term6604, term6604.getClass(), "regDate", null);
        setField(term6604, term6604.getClass(), "modDate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.site.admin.usermgmt.model.AdmUser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Boolean");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setIsUsing2FA", argTypes, term6604, args);
    }

};


