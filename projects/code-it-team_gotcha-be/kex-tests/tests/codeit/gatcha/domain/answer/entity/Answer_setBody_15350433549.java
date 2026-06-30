package codeit.gatcha.domain.answer.entity;

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
import static codeit.gatcha.domain.answer.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class Answer_setBody_15350433549 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term921;

    public Answer_setBody_15350433549() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term922 = new Integer(1141317871);
        Integer term937 = new Integer(890669485);
        Integer term953 = new Integer(691577392);
        Integer term956 = new Integer(-893623680);
        HashMap term971 = new HashMap();
        Set<Object> term1043 =  ((Map) term971).keySet();
        HashSet term970 = new HashSet((Collection<? extends Object>) term1043);
        term921 = newInstance(Class.forName("codeit.gatcha.domain.answer.entity.Answer"));
        Object term936 = newInstance(Class.forName("codeit.gatcha.domain.question.entity.Question"));
        Object term952 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.GatchaUser"));
        Object term955 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.Authority"));
        setField(term921, term921.getClass(), "id", term922);
        setField(term921, term921.getClass(), "body", "vwbEQQNQrx");
        setField(term936, term936.getClass(), "id", term937);
        setField(term936, term936.getClass(), "body", "xtftXXMbem");
        setBooleanField(term936, term936.getClass(), "valid", true);
        setField(term921, term921.getClass(), "question", term936);
        setField(term952, term952.getClass(), "id", term953);
        setField(term955, term955.getClass(), "id", term956);
        setField(term955, term955.getClass(), "role", "cudZvLMQon");
        setField(term955, term955.getClass(), "users", term970);
        setField(term952, term952.getClass(), "authority", term955);
        setField(term952, term952.getClass(), "email", "igCAtimmYB");
        setField(term952, term952.getClass(), "password", "DyiXbeYIaN");
        setBooleanField(term952, term952.getClass(), "enabled", true);
        setField(term921, term921.getClass(), "user", term952);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("codeit.gatcha.domain.answer.entity.Answer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "VGizxZnyHX";
        callMethod(klass, "setBody", argTypes, term921, args);
    }

};


