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

public class SignUpForm_SignUpFormBuilder_role_17814037333 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1945;
     Object term1999;

    public SignUpForm_SignUpFormBuilder_role_17814037333() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1971 = new HashMap();
        Set<Object> term2025 =  ((Map) term1971).keySet();
        HashSet term1970 = new HashSet((Collection<? extends Object>) term2025);
        term1945 = newInstance(Class.forName("kyungseo.poc.simple.web.security.dto.request.SignUpForm$SignUpFormBuilder"));
        setField(term1945, term1945.getClass(), "membername", "AdxvLJhNLe");
        setField(term1945, term1945.getClass(), "email", "lHfTrWKMPk");
        setField(term1945, term1945.getClass(), "role", term1970);
        setField(term1945, term1945.getClass(), "password", "AKNapTAfmD");
        HashMap term2000 = new HashMap();
        Set<Object> term2036 =  ((Map) term2000).keySet();
        term1999 = new HashSet((Collection<? extends Object>) term2036);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.dto.request.SignUpForm$SignUpFormBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Set");
        Object[] args = new Object[1];
        args[0] = term1999;
        callMethod(klass, "role", argTypes, term1945, args);
    }

};


