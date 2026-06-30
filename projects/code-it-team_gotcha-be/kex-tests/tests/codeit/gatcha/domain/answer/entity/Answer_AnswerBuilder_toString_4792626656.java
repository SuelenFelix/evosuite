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

public class Answer_AnswerBuilder_toString_4792626656 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2238;

    public Answer_AnswerBuilder_toString_4792626656() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term2239 = new Integer(1743683601);
        Integer term2254 = new Integer(-945116798);
        Integer term2270 = new Integer(1593461795);
        Integer term2273 = new Integer(515182546);
        HashMap term2288 = new HashMap();
        Set<Object> term2348 =  ((Map) term2288).keySet();
        HashSet term2287 = new HashSet((Collection<? extends Object>) term2348);
        term2238 = newInstance(Class.forName("codeit.gatcha.domain.answer.entity.Answer$AnswerBuilder"));
        Object term2253 = newInstance(Class.forName("codeit.gatcha.domain.question.entity.Question"));
        Object term2269 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.GatchaUser"));
        Object term2272 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.Authority"));
        setField(term2238, term2238.getClass(), "id", term2239);
        setField(term2238, term2238.getClass(), "body", "GsWxOwXvSu");
        setField(term2253, term2253.getClass(), "id", term2254);
        setField(term2253, term2253.getClass(), "body", "bKBSncrMEZ");
        setBooleanField(term2253, term2253.getClass(), "valid", true);
        setField(term2238, term2238.getClass(), "question", term2253);
        setField(term2269, term2269.getClass(), "id", term2270);
        setField(term2272, term2272.getClass(), "id", term2273);
        setField(term2272, term2272.getClass(), "role", "yeSXGqQExb");
        setField(term2272, term2272.getClass(), "users", term2287);
        setField(term2269, term2269.getClass(), "authority", term2272);
        setField(term2269, term2269.getClass(), "email", "YsUtbngnRO");
        setField(term2269, term2269.getClass(), "password", "JisaWUxcNb");
        setBooleanField(term2269, term2269.getClass(), "enabled", true);
        setField(term2238, term2238.getClass(), "user", term2269);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("codeit.gatcha.domain.answer.entity.Answer$AnswerBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term2238, args);
    }

};


