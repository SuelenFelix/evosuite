package codeit.gatcha.api.security.entity;

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
import static codeit.gatcha.api.security.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class ConfirmationToken_setCreatedDate_16308900497 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term748;
     Object term814;

    public ConfirmationToken_setCreatedDate_16308900497() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term749 = new Integer(-341962980);
        Integer term766 = new Integer(1532716628);
        Integer term769 = new Integer(-1801760683);
        HashMap term784 = new HashMap();
        Set<Object> term836 =  ((Map) term784).keySet();
        HashSet term783 = new HashSet((Collection<? extends Object>) term836);
        term748 = newInstance(Class.forName("codeit.gatcha.api.security.entity.ConfirmationToken"));
        Object term763 = newInstance(Class.forName("java.util.Date"));
        Object term765 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.GatchaUser"));
        Object term768 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.Authority"));
        setField(term748, term748.getClass(), "id", term749);
        setField(term748, term748.getClass(), "confirmationToken", "lihXWlGDxk");
        setLongField(term763, term763.getClass(), "fastTime", 1429023851389L);
        setField(term763, term763.getClass(), "cdate", null);
        setField(term748, term748.getClass(), "createdDate", term763);
        setField(term765, term765.getClass(), "id", term766);
        setField(term768, term768.getClass(), "id", term769);
        setField(term768, term768.getClass(), "role", "JmcmxoGhIK");
        setField(term768, term768.getClass(), "users", term783);
        setField(term765, term765.getClass(), "authority", term768);
        setField(term765, term765.getClass(), "email", "VGizxZnyHX");
        setField(term765, term765.getClass(), "password", "kVEZMHmRtR");
        setBooleanField(term765, term765.getClass(), "enabled", true);
        setField(term748, term748.getClass(), "user", term765);
        term814 = newInstance(Class.forName("java.util.Date"));
        setLongField(term814, term814.getClass(), "fastTime", 1495357463288L);
        setField(term814, term814.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("codeit.gatcha.api.security.entity.ConfirmationToken");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Date");
        Object[] args = new Object[1];
        args[0] = term814;
        callMethod(klass, "setCreatedDate", argTypes, term748, args);
    }

};


