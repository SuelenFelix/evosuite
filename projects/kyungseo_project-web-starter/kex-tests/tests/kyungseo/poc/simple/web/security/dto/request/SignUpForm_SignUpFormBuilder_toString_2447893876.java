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

public class SignUpForm_SignUpFormBuilder_toString_2447893876 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2210;

    public SignUpForm_SignUpFormBuilder_toString_2447893876() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2236 = new HashMap();
        Set<Object> term2278 =  ((Map) term2236).keySet();
        HashSet term2235 = new HashSet((Collection<? extends Object>) term2278);
        term2210 = newInstance(Class.forName("kyungseo.poc.simple.web.security.dto.request.SignUpForm$SignUpFormBuilder"));
        setField(term2210, term2210.getClass(), "membername", "LWyEaeIyAo");
        setField(term2210, term2210.getClass(), "email", "yVMkkQhvmN");
        setField(term2210, term2210.getClass(), "role", term2235);
        setField(term2210, term2210.getClass(), "password", "GgZWSjxjyE");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.dto.request.SignUpForm$SignUpFormBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term2210, args);
    }

};


