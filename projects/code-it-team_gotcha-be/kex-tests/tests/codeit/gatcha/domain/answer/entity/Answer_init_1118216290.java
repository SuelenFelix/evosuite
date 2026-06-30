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

public class Answer_init_1118216290 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term16;
     Object term32;

    public Answer_init_1118216290() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term2 = new Integer(568599855);
        term1 = newInstance(Class.forName("codeit.gatcha.api.DTO.question.inputDTO.QuestionAnswer_DTO"));
        setField(term1, term1.getClass(), "questionId", term2);
        setField(term1, term1.getClass(), "answer", "PAEBtnZtTD");
        Integer term17 = new Integer(1162663216);
        term16 = newInstance(Class.forName("codeit.gatcha.domain.question.entity.Question"));
        setField(term16, term16.getClass(), "id", term17);
        setField(term16, term16.getClass(), "body", "sjlJAEtRrb");
        setBooleanField(term16, term16.getClass(), "valid", true);
        Integer term33 = new Integer(1484323161);
        Integer term36 = new Integer(391863371);
        HashMap term51 = new HashMap();
        Set<Object> term112 =  ((Map) term51).keySet();
        HashSet term50 = new HashSet((Collection<? extends Object>) term112);
        term32 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.GatchaUser"));
        Object term35 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.Authority"));
        setField(term32, term32.getClass(), "id", term33);
        setField(term35, term35.getClass(), "id", term36);
        setField(term35, term35.getClass(), "role", "MuLcgQHgqz");
        setField(term35, term35.getClass(), "users", term50);
        setField(term32, term32.getClass(), "authority", term35);
        setField(term32, term32.getClass(), "email", "HyxfbSQYBe");
        setField(term32, term32.getClass(), "password", "pCTimMblYc");
        setBooleanField(term32, term32.getClass(), "enabled", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("codeit.gatcha.domain.answer.entity.Answer");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("codeit.gatcha.api.DTO.question.inputDTO.QuestionAnswer_DTO");
        argTypes[1] = Class.forName("codeit.gatcha.domain.question.entity.Question");
        argTypes[2] = Class.forName("codeit.gatcha.domain.user.entity.GatchaUser");
        Object[] args = new Object[3];
        args[0] = term1;
        args[1] = term16;
        args[2] = term32;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


