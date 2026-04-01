package codeit.gatcha.api.service.question;

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
import static codeit.gatcha.api.service.question.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class API_QuestionFetchService_getUserAnswerToQuestion_3242100343 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82;
     Object term98;

    public API_QuestionFetchService_getUserAnswerToQuestion_3242100343() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term83 = new Integer(1134449235);
        term82 = newInstance(Class.forName("codeit.gatcha.domain.question.entity.Question"));
        setField(term82, term82.getClass(), "id", term83);
        setField(term82, term82.getClass(), "body", "HyxfbSQYBe");
        setBooleanField(term82, term82.getClass(), "valid", true);
        Integer term99 = new Integer(-883034806);
        Integer term102 = new Integer(1585847225);
        HashMap term117 = new HashMap();
        Set<Object> term168 =  ((Map) term117).keySet();
        HashSet term116 = new HashSet((Collection<? extends Object>) term168);
        term98 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.GatchaUser"));
        Object term101 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.Authority"));
        setField(term98, term98.getClass(), "id", term99);
        setField(term101, term101.getClass(), "id", term102);
        setField(term101, term101.getClass(), "role", "pCTimMblYc");
        setField(term101, term101.getClass(), "users", term116);
        setField(term98, term98.getClass(), "authority", term101);
        setField(term98, term98.getClass(), "email", "AijpHYOFuy");
        setField(term98, term98.getClass(), "password", "SbAoxhfrkn");
        setBooleanField(term98, term98.getClass(), "enabled", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("codeit.gatcha.api.service.question.API_QuestionFetchService");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("codeit.gatcha.domain.question.entity.Question");
        argTypes[1] = Class.forName("codeit.gatcha.domain.user.entity.GatchaUser");
        Object[] args = new Object[2];
        args[0] = term82;
        args[1] = term98;
        callMethod(klass, "getUserAnswerToQuestion", argTypes, null, args);
    }

};


