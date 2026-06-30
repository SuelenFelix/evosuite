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

public class SignUpForm_SignUpFormBuilder_email_10461146482 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1838;

    public SignUpForm_SignUpFormBuilder_email_10461146482() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1864 = new HashMap();
        Set<Object> term1924 =  ((Map) term1864).keySet();
        HashSet term1863 = new HashSet((Collection<? extends Object>) term1924);
        term1838 = newInstance(Class.forName("kyungseo.poc.simple.web.security.dto.request.SignUpForm$SignUpFormBuilder"));
        setField(term1838, term1838.getClass(), "membername", "yGtHPyvYiQ");
        setField(term1838, term1838.getClass(), "email", "MvRIxilFMJ");
        setField(term1838, term1838.getClass(), "role", term1863);
        setField(term1838, term1838.getClass(), "password", "WzMEhMXkKx");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.dto.request.SignUpForm$SignUpFormBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "XOiDvlDhdc";
        callMethod(klass, "email", argTypes, term1838, args);
    }

};


