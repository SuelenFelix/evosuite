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

public class SignUpForm_SignUpFormBuilder_build_13580616505 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2136;

    public SignUpForm_SignUpFormBuilder_build_13580616505() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2162 = new HashMap();
        Set<Object> term2199 =  ((Map) term2162).keySet();
        HashSet term2161 = new HashSet((Collection<? extends Object>) term2199);
        term2136 = newInstance(Class.forName("kyungseo.poc.simple.web.security.dto.request.SignUpForm$SignUpFormBuilder"));
        setField(term2136, term2136.getClass(), "membername", "VMeAzAHwZj");
        setField(term2136, term2136.getClass(), "email", "PznxWXsZME");
        setField(term2136, term2136.getClass(), "role", term2161);
        setField(term2136, term2136.getClass(), "password", "ZzIujlwVsw");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.dto.request.SignUpForm$SignUpFormBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term2136, args);
    }

};


