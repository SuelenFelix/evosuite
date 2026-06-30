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

public class Answer_AnswerBuilder_id_24833421 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1452;
     Object term1532;

    public Answer_AnswerBuilder_id_24833421() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1453 = new Integer(-461771056);
        Integer term1468 = new Integer(-243422082);
        Integer term1484 = new Integer(1384592638);
        Integer term1487 = new Integer(-1002370457);
        HashMap term1502 = new HashMap();
        Set<Object> term1564 =  ((Map) term1502).keySet();
        HashSet term1501 = new HashSet((Collection<? extends Object>) term1564);
        term1452 = newInstance(Class.forName("codeit.gatcha.domain.answer.entity.Answer$AnswerBuilder"));
        Object term1467 = newInstance(Class.forName("codeit.gatcha.domain.question.entity.Question"));
        Object term1483 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.GatchaUser"));
        Object term1486 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.Authority"));
        setField(term1452, term1452.getClass(), "id", term1453);
        setField(term1452, term1452.getClass(), "body", "UBRmXJmfrt");
        setField(term1467, term1467.getClass(), "id", term1468);
        setField(term1467, term1467.getClass(), "body", "WZzvmIHhzZ");
        setBooleanField(term1467, term1467.getClass(), "valid", true);
        setField(term1452, term1452.getClass(), "question", term1467);
        setField(term1483, term1483.getClass(), "id", term1484);
        setField(term1486, term1486.getClass(), "id", term1487);
        setField(term1486, term1486.getClass(), "role", "doQLHkjpNm");
        setField(term1486, term1486.getClass(), "users", term1501);
        setField(term1483, term1483.getClass(), "authority", term1486);
        setField(term1483, term1483.getClass(), "email", "TweMFhxNdj");
        setField(term1483, term1483.getClass(), "password", "NBrvVzvQHe");
        setBooleanField(term1483, term1483.getClass(), "enabled", true);
        setField(term1452, term1452.getClass(), "user", term1483);
        term1532 = new Integer(1358829571);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("codeit.gatcha.domain.answer.entity.Answer$AnswerBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term1532;
        callMethod(klass, "id", argTypes, term1452, args);
    }

};


