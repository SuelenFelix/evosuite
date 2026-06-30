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

public class SignUpForm_getEmail_2264614822 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term808;

    public SignUpForm_getEmail_2264614822() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term834 = new HashMap();
        Set<Object> term878 =  ((Map) term834).keySet();
        HashSet term833 = new HashSet((Collection<? extends Object>) term878);
        term808 = newInstance(Class.forName("kyungseo.poc.simple.web.security.dto.request.SignUpForm"));
        setField(term808, term808.getClass(), "membername", "wSQxaModmm");
        setField(term808, term808.getClass(), "email", "UlajhuVLaP");
        setField(term808, term808.getClass(), "role", term833);
        setField(term808, term808.getClass(), "password", "tShwQLRGNe");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.dto.request.SignUpForm");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEmail", argTypes, term808, args);
    }

};


