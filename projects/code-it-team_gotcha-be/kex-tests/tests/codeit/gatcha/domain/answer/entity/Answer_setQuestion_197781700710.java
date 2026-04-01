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

public class Answer_setQuestion_197781700710 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1074;
     Object term1154;

    public Answer_setQuestion_197781700710() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1075 = new Integer(1045657203);
        Integer term1090 = new Integer(1386130016);
        Integer term1106 = new Integer(1072005683);
        Integer term1109 = new Integer(1861318859);
        HashMap term1124 = new HashMap();
        Set<Object> term1200 =  ((Map) term1124).keySet();
        HashSet term1123 = new HashSet((Collection<? extends Object>) term1200);
        term1074 = newInstance(Class.forName("codeit.gatcha.domain.answer.entity.Answer"));
        Object term1089 = newInstance(Class.forName("codeit.gatcha.domain.question.entity.Question"));
        Object term1105 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.GatchaUser"));
        Object term1108 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.Authority"));
        setField(term1074, term1074.getClass(), "id", term1075);
        setField(term1074, term1074.getClass(), "body", "kVEZMHmRtR");
        setField(term1089, term1089.getClass(), "id", term1090);
        setField(term1089, term1089.getClass(), "body", "ekxGuOYIwi");
        setBooleanField(term1089, term1089.getClass(), "valid", true);
        setField(term1074, term1074.getClass(), "question", term1089);
        setField(term1105, term1105.getClass(), "id", term1106);
        setField(term1108, term1108.getClass(), "id", term1109);
        setField(term1108, term1108.getClass(), "role", "RbVQXSpxXy");
        setField(term1108, term1108.getClass(), "users", term1123);
        setField(term1105, term1105.getClass(), "authority", term1108);
        setField(term1105, term1105.getClass(), "email", "tlzpzIjMib");
        setField(term1105, term1105.getClass(), "password", "AZdLeSugwv");
        setBooleanField(term1105, term1105.getClass(), "enabled", true);
        setField(term1074, term1074.getClass(), "user", term1105);
        Integer term1155 = new Integer(-1963464809);
        term1154 = newInstance(Class.forName("codeit.gatcha.domain.question.entity.Question"));
        setField(term1154, term1154.getClass(), "id", term1155);
        setField(term1154, term1154.getClass(), "body", "RMsXuyzKJV");
        setBooleanField(term1154, term1154.getClass(), "valid", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("codeit.gatcha.domain.answer.entity.Answer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("codeit.gatcha.domain.question.entity.Question");
        Object[] args = new Object[1];
        args[0] = term1154;
        callMethod(klass, "setQuestion", argTypes, term1074, args);
    }

};


