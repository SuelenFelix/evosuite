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

public class SignUpForm_setRole_9541854297 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1259;
     Object term1307;

    public SignUpForm_setRole_9541854297() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1285 = new HashMap();
        Set<Object> term1348 =  ((Map) term1285).keySet();
        HashSet term1284 = new HashSet((Collection<? extends Object>) term1348);
        term1259 = newInstance(Class.forName("kyungseo.poc.simple.web.security.dto.request.SignUpForm"));
        setField(term1259, term1259.getClass(), "membername", "MAcUBcBckh");
        setField(term1259, term1259.getClass(), "email", "oVgzLbrsFr");
        setField(term1259, term1259.getClass(), "role", term1284);
        setField(term1259, term1259.getClass(), "password", "wGmYcqUkgE");
        HashMap term1308 = new HashMap();
        Set<Object> term1359 =  ((Map) term1308).keySet();
        term1307 = new HashSet((Collection<? extends Object>) term1359);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.dto.request.SignUpForm");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Set");
        Object[] args = new Object[1];
        args[0] = term1307;
        callMethod(klass, "setRole", argTypes, term1259, args);
    }

};


