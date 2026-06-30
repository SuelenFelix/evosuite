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

public class Answer_AnswerBuilder_body_1081741742 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1585;

    public Answer_AnswerBuilder_body_1081741742() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1586 = new Integer(991356662);
        Integer term1601 = new Integer(-506958186);
        Integer term1617 = new Integer(-507387516);
        Integer term1620 = new Integer(-1970452551);
        HashMap term1635 = new HashMap();
        Set<Object> term1707 =  ((Map) term1635).keySet();
        HashSet term1634 = new HashSet((Collection<? extends Object>) term1707);
        term1585 = newInstance(Class.forName("codeit.gatcha.domain.answer.entity.Answer$AnswerBuilder"));
        Object term1600 = newInstance(Class.forName("codeit.gatcha.domain.question.entity.Question"));
        Object term1616 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.GatchaUser"));
        Object term1619 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.Authority"));
        setField(term1585, term1585.getClass(), "id", term1586);
        setField(term1585, term1585.getClass(), "body", "FjOiNAfBOc");
        setField(term1600, term1600.getClass(), "id", term1601);
        setField(term1600, term1600.getClass(), "body", "iCCsaLHohG");
        setBooleanField(term1600, term1600.getClass(), "valid", true);
        setField(term1585, term1585.getClass(), "question", term1600);
        setField(term1616, term1616.getClass(), "id", term1617);
        setField(term1619, term1619.getClass(), "id", term1620);
        setField(term1619, term1619.getClass(), "role", "NJhGgctbdj");
        setField(term1619, term1619.getClass(), "users", term1634);
        setField(term1616, term1616.getClass(), "authority", term1619);
        setField(term1616, term1616.getClass(), "email", "ZfBIVGBQOE");
        setField(term1616, term1616.getClass(), "password", "QSrDQfEsTR");
        setBooleanField(term1616, term1616.getClass(), "enabled", true);
        setField(term1585, term1585.getClass(), "user", term1616);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("codeit.gatcha.domain.answer.entity.Answer$AnswerBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "PsqusYmejD";
        callMethod(klass, "body", argTypes, term1585, args);
    }

};


