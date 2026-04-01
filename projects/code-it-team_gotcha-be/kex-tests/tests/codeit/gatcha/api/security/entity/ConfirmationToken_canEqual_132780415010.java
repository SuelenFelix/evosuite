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

public class ConfirmationToken_canEqual_132780415010 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1153;
     Object term1219;

    public ConfirmationToken_canEqual_132780415010() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1154 = new Integer(1830648570);
        Integer term1171 = new Integer(-227365013);
        Integer term1174 = new Integer(11724947);
        HashMap term1189 = new HashMap();
        Set<Object> term1240 =  ((Map) term1189).keySet();
        HashSet term1188 = new HashSet((Collection<? extends Object>) term1240);
        term1153 = newInstance(Class.forName("codeit.gatcha.api.security.entity.ConfirmationToken"));
        Object term1168 = newInstance(Class.forName("java.util.Date"));
        Object term1170 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.GatchaUser"));
        Object term1173 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.Authority"));
        setField(term1153, term1153.getClass(), "id", term1154);
        setField(term1153, term1153.getClass(), "confirmationToken", "SIODFGaQhr");
        setLongField(term1168, term1168.getClass(), "fastTime", 1797203628025L);
        setField(term1168, term1168.getClass(), "cdate", null);
        setField(term1153, term1153.getClass(), "createdDate", term1168);
        setField(term1170, term1170.getClass(), "id", term1171);
        setField(term1173, term1173.getClass(), "id", term1174);
        setField(term1173, term1173.getClass(), "role", "qYzsiuXOgS");
        setField(term1173, term1173.getClass(), "users", term1188);
        setField(term1170, term1170.getClass(), "authority", term1173);
        setField(term1170, term1170.getClass(), "email", "zaloBqlrSo");
        setField(term1170, term1170.getClass(), "password", "vvoLrMGCoN");
        setBooleanField(term1170, term1170.getClass(), "enabled", true);
        setField(term1153, term1153.getClass(), "user", term1170);
        term1219 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("codeit.gatcha.api.security.entity.ConfirmationToken");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term1219;
        callMethod(klass, "canEqual", argTypes, term1153, args);
    }

};


