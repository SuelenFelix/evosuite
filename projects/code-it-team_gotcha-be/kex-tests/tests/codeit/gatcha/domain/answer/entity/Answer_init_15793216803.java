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

public class Answer_init_15793216803 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term133;
     Object term147;
     Object term163;

    public Answer_init_15793216803() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term133 = new Integer(1585847225);
        Integer term148 = new Integer(597278769);
        term147 = newInstance(Class.forName("codeit.gatcha.domain.question.entity.Question"));
        setField(term147, term147.getClass(), "id", term148);
        setField(term147, term147.getClass(), "body", "RkybSrpybU");
        setBooleanField(term147, term147.getClass(), "valid", true);
        Integer term164 = new Integer(-1685132342);
        Integer term167 = new Integer(-1456670397);
        HashMap term182 = new HashMap();
        Set<Object> term243 =  ((Map) term182).keySet();
        HashSet term181 = new HashSet((Collection<? extends Object>) term243);
        term163 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.GatchaUser"));
        Object term166 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.Authority"));
        setField(term163, term163.getClass(), "id", term164);
        setField(term166, term166.getClass(), "id", term167);
        setField(term166, term166.getClass(), "role", "xOEqzGAmDU");
        setField(term166, term166.getClass(), "users", term181);
        setField(term163, term163.getClass(), "authority", term166);
        setField(term163, term163.getClass(), "email", "Ghbwtircqb");
        setField(term163, term163.getClass(), "password", "xrwlQZdwCp");
        setBooleanField(term163, term163.getClass(), "enabled", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("codeit.gatcha.domain.answer.entity.Answer");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.Integer");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("codeit.gatcha.domain.question.entity.Question");
        argTypes[3] = Class.forName("codeit.gatcha.domain.user.entity.GatchaUser");
        Object[] args = new Object[4];
        args[0] = term133;
        args[1] = "hNxWaHcfhY";
        args[2] = term147;
        args[3] = term163;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


