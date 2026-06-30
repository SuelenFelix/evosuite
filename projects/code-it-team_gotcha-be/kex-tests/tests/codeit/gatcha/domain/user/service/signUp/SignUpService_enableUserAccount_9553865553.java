package codeit.gatcha.domain.user.service.signUp;

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
import static codeit.gatcha.domain.user.service.signUp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class SignUpService_enableUserAccount_9553865553 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term492;

    public SignUpService_enableUserAccount_9553865553() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term493 = new Integer(458147407);
        Integer term496 = new Integer(-184153539);
        HashMap term511 = new HashMap();
        Set<Object> term552 =  ((Map) term511).keySet();
        HashSet term510 = new HashSet((Collection<? extends Object>) term552);
        term492 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.GatchaUser"));
        Object term495 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.Authority"));
        setField(term492, term492.getClass(), "id", term493);
        setField(term495, term495.getClass(), "id", term496);
        setField(term495, term495.getClass(), "role", "GVizqqzXpy");
        setField(term495, term495.getClass(), "users", term510);
        setField(term492, term492.getClass(), "authority", term495);
        setField(term492, term492.getClass(), "email", "ZVecLZMLHF");
        setField(term492, term492.getClass(), "password", "fztQhjqwdP");
        setBooleanField(term492, term492.getClass(), "enabled", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("codeit.gatcha.domain.user.service.signUp.SignUpService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("codeit.gatcha.domain.user.entity.GatchaUser");
        Object[] args = new Object[1];
        args[0] = term492;
        callMethod(klass, "enableUserAccount", argTypes, null, args);
    }

};


