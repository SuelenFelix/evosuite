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

public class AdmUser_getEnabled_79242506142 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6589;

    public AdmUser_getEnabled_79242506142() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6589 = newInstance(Class.forName("kyungseo.poc.simple.web.site.admin.usermgmt.model.AdmUser"));
        setField(term6589, term6589.getClass(), "id", null);
        setField(term6589, term6589.getClass(), "membername", null);
        setField(term6589, term6589.getClass(), "email", null);
        setField(term6589, term6589.getClass(), "password", null);
        setField(term6589, term6589.getClass(), "age", null);
        setField(term6589, term6589.getClass(), "phoneNumber", null);
        setField(term6589, term6589.getClass(), "country", null);
        setField(term6589, term6589.getClass(), "birthdate", null);
        setField(term6589, term6589.getClass(), "enabled", null);
        setField(term6589, term6589.getClass(), "roles", null);
        setField(term6589, term6589.getClass(), "isUsing2FA", null);
        setField(term6589, term6589.getClass(), "secret", null);
        setField(term6589, term6589.getClass(), "regDate", null);
        setField(term6589, term6589.getClass(), "modDate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.site.admin.usermgmt.model.AdmUser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEnabled", argTypes, term6589, args);
    }

};


