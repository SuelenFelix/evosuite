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

public class Answer_getQuestion_5542592756 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term526;

    public Answer_getQuestion_5542592756() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term527 = new Integer(-1371869594);
        Integer term542 = new Integer(-2095575670);
        Integer term558 = new Integer(1225272962);
        Integer term561 = new Integer(1324040357);
        HashMap term576 = new HashMap();
        Set<Object> term636 =  ((Map) term576).keySet();
        HashSet term575 = new HashSet((Collection<? extends Object>) term636);
        term526 = newInstance(Class.forName("codeit.gatcha.domain.answer.entity.Answer"));
        Object term541 = newInstance(Class.forName("codeit.gatcha.domain.question.entity.Question"));
        Object term557 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.GatchaUser"));
        Object term560 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.Authority"));
        setField(term526, term526.getClass(), "id", term527);
        setField(term526, term526.getClass(), "body", "JqXGgAhZPl");
        setField(term541, term541.getClass(), "id", term542);
        setField(term541, term541.getClass(), "body", "jiKYgYHqIS");
        setBooleanField(term541, term541.getClass(), "valid", true);
        setField(term526, term526.getClass(), "question", term541);
        setField(term557, term557.getClass(), "id", term558);
        setField(term560, term560.getClass(), "id", term561);
        setField(term560, term560.getClass(), "role", "DfISiziTgG");
        setField(term560, term560.getClass(), "users", term575);
        setField(term557, term557.getClass(), "authority", term560);
        setField(term557, term557.getClass(), "email", "pORebkoRdD");
        setField(term557, term557.getClass(), "password", "mXGCWJDOqA");
        setBooleanField(term557, term557.getClass(), "enabled", true);
        setField(term526, term526.getClass(), "user", term557);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("codeit.gatcha.domain.answer.entity.Answer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getQuestion", argTypes, term526, args);
    }

};


