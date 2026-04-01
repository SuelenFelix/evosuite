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

public class Answer_getBody_10400473745 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term395;

    public Answer_getBody_10400473745() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term396 = new Integer(1876565163);
        Integer term411 = new Integer(-817164822);
        Integer term427 = new Integer(-1016503459);
        Integer term430 = new Integer(-1968847291);
        HashMap term445 = new HashMap();
        Set<Object> term505 =  ((Map) term445).keySet();
        HashSet term444 = new HashSet((Collection<? extends Object>) term505);
        term395 = newInstance(Class.forName("codeit.gatcha.domain.answer.entity.Answer"));
        Object term410 = newInstance(Class.forName("codeit.gatcha.domain.question.entity.Question"));
        Object term426 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.GatchaUser"));
        Object term429 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.Authority"));
        setField(term395, term395.getClass(), "id", term396);
        setField(term395, term395.getClass(), "body", "uWHnvSvaPl");
        setField(term410, term410.getClass(), "id", term411);
        setField(term410, term410.getClass(), "body", "kBdSllIBVz");
        setBooleanField(term410, term410.getClass(), "valid", true);
        setField(term395, term395.getClass(), "question", term410);
        setField(term426, term426.getClass(), "id", term427);
        setField(term429, term429.getClass(), "id", term430);
        setField(term429, term429.getClass(), "role", "TJmVBGfTML");
        setField(term429, term429.getClass(), "users", term444);
        setField(term426, term426.getClass(), "authority", term429);
        setField(term426, term426.getClass(), "email", "xOcJIiQQDu");
        setField(term426, term426.getClass(), "password", "GVizqqzXpy");
        setBooleanField(term426, term426.getClass(), "enabled", true);
        setField(term395, term395.getClass(), "user", term426);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("codeit.gatcha.domain.answer.entity.Answer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBody", argTypes, term395, args);
    }

};


