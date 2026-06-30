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

public class SignUpForm_setEmail_1972069346 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1152;

    public SignUpForm_setEmail_1972069346() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1178 = new HashMap();
        Set<Object> term1238 =  ((Map) term1178).keySet();
        HashSet term1177 = new HashSet((Collection<? extends Object>) term1238);
        term1152 = newInstance(Class.forName("kyungseo.poc.simple.web.security.dto.request.SignUpForm"));
        setField(term1152, term1152.getClass(), "membername", "uWHnvSvaPl");
        setField(term1152, term1152.getClass(), "email", "kBdSllIBVz");
        setField(term1152, term1152.getClass(), "role", term1177);
        setField(term1152, term1152.getClass(), "password", "KoyGrUJeJW");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.dto.request.SignUpForm");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "HqBOwkVqjD";
        callMethod(klass, "setEmail", argTypes, term1152, args);
    }

};


