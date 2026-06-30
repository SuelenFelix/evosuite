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

public class Answer_AnswerBuilder_build_18004336125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2107;

    public Answer_AnswerBuilder_build_18004336125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term2108 = new Integer(1460722225);
        Integer term2123 = new Integer(1743224434);
        Integer term2139 = new Integer(842904495);
        Integer term2142 = new Integer(1008080511);
        HashMap term2157 = new HashMap();
        Set<Object> term2217 =  ((Map) term2157).keySet();
        HashSet term2156 = new HashSet((Collection<? extends Object>) term2217);
        term2107 = newInstance(Class.forName("codeit.gatcha.domain.answer.entity.Answer$AnswerBuilder"));
        Object term2122 = newInstance(Class.forName("codeit.gatcha.domain.question.entity.Question"));
        Object term2138 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.GatchaUser"));
        Object term2141 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.Authority"));
        setField(term2107, term2107.getClass(), "id", term2108);
        setField(term2107, term2107.getClass(), "body", "KarbTXFmUU");
        setField(term2122, term2122.getClass(), "id", term2123);
        setField(term2122, term2122.getClass(), "body", "jiUSjqwSIQ");
        setBooleanField(term2122, term2122.getClass(), "valid", true);
        setField(term2107, term2107.getClass(), "question", term2122);
        setField(term2138, term2138.getClass(), "id", term2139);
        setField(term2141, term2141.getClass(), "id", term2142);
        setField(term2141, term2141.getClass(), "role", "MgLCedQfoj");
        setField(term2141, term2141.getClass(), "users", term2156);
        setField(term2138, term2138.getClass(), "authority", term2141);
        setField(term2138, term2138.getClass(), "email", "WPxXsahPRq");
        setField(term2138, term2138.getClass(), "password", "IENRuqmwUU");
        setBooleanField(term2138, term2138.getClass(), "enabled", true);
        setField(term2107, term2107.getClass(), "user", term2138);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("codeit.gatcha.domain.answer.entity.Answer$AnswerBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term2107, args);
    }

};


