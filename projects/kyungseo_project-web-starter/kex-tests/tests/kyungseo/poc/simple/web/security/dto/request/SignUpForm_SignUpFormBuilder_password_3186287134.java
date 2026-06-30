package kyungseo.poc.simple.web.security.dto.request;

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
import static kyungseo.poc.simple.web.security.dto.request.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class SignUpForm_SignUpFormBuilder_password_3186287134 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2037;

    public SignUpForm_SignUpFormBuilder_password_3186287134() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2063 = new HashMap();
        Set<Object> term2115 =  ((Map) term2063).keySet();
        HashSet term2062 = new HashSet((Collection<? extends Object>) term2115);
        term2037 = newInstance(Class.forName("kyungseo.poc.simple.web.security.dto.request.SignUpForm$SignUpFormBuilder"));
        setField(term2037, term2037.getClass(), "membername", "xJgPlLxpgC");
        setField(term2037, term2037.getClass(), "email", "EYtfuJaxiM");
        setField(term2037, term2037.getClass(), "role", term2062);
        setField(term2037, term2037.getClass(), "password", "fWKJoSoCwE");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.dto.request.SignUpForm$SignUpFormBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "wfaXBpWAUH";
        callMethod(klass, "password", argTypes, term2037, args);
    }

};


