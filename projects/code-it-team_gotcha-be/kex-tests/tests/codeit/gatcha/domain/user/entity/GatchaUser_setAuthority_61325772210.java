package codeit.gatcha.domain.user.entity;

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
import static codeit.gatcha.domain.user.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class GatchaUser_setAuthority_61325772210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term663;
     Object term713;

    public GatchaUser_setAuthority_61325772210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term664 = new Integer(-1210583429);
        Integer term667 = new Integer(-663691365);
        HashMap term682 = new HashMap();
        Set<Object> term753 =  ((Map) term682).keySet();
        HashSet term681 = new HashSet((Collection<? extends Object>) term753);
        term663 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.GatchaUser"));
        Object term666 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.Authority"));
        setField(term663, term663.getClass(), "id", term664);
        setField(term666, term666.getClass(), "id", term667);
        setField(term666, term666.getClass(), "role", "DbiCVtPPCT");
        setField(term666, term666.getClass(), "users", term681);
        setField(term663, term663.getClass(), "authority", term666);
        setField(term663, term663.getClass(), "email", "igCAtimmYB");
        setField(term663, term663.getClass(), "password", "DyiXbeYIaN");
        setBooleanField(term663, term663.getClass(), "enabled", true);
        Integer term714 = new Integer(-1963434938);
        HashMap term729 = new HashMap();
        Set<Object> term784 =  ((Map) term729).keySet();
        HashSet term728 = new HashSet((Collection<? extends Object>) term784);
        term713 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.Authority"));
        setField(term713, term713.getClass(), "id", term714);
        setField(term713, term713.getClass(), "role", "VGizxZnyHX");
        setField(term713, term713.getClass(), "users", term728);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("codeit.gatcha.domain.user.entity.GatchaUser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("codeit.gatcha.domain.user.entity.Authority");
        Object[] args = new Object[1];
        args[0] = term713;
        callMethod(klass, "setAuthority", argTypes, term663, args);
    }

};


