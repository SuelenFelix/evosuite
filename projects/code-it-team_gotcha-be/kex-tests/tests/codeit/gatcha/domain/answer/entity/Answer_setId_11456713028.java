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

public class Answer_setId_11456713028 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term788;
     Object term868;

    public Answer_setId_11456713028() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term789 = new Integer(444029505);
        Integer term804 = new Integer(-1034506028);
        Integer term820 = new Integer(-1263114719);
        Integer term823 = new Integer(-894662986);
        HashMap term838 = new HashMap();
        Set<Object> term900 =  ((Map) term838).keySet();
        HashSet term837 = new HashSet((Collection<? extends Object>) term900);
        term788 = newInstance(Class.forName("codeit.gatcha.domain.answer.entity.Answer"));
        Object term803 = newInstance(Class.forName("codeit.gatcha.domain.question.entity.Question"));
        Object term819 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.GatchaUser"));
        Object term822 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.Authority"));
        setField(term788, term788.getClass(), "id", term789);
        setField(term788, term788.getClass(), "body", "UfQtPRyWRC");
        setField(term803, term803.getClass(), "id", term804);
        setField(term803, term803.getClass(), "body", "FPvxVzzSvD");
        setBooleanField(term803, term803.getClass(), "valid", true);
        setField(term788, term788.getClass(), "question", term803);
        setField(term819, term819.getClass(), "id", term820);
        setField(term822, term822.getClass(), "id", term823);
        setField(term822, term822.getClass(), "role", "WHcwFgsGFC");
        setField(term822, term822.getClass(), "users", term837);
        setField(term819, term819.getClass(), "authority", term822);
        setField(term819, term819.getClass(), "email", "rLHAoqXgPh");
        setField(term819, term819.getClass(), "password", "zUlRdimJtU");
        setBooleanField(term819, term819.getClass(), "enabled", true);
        setField(term788, term788.getClass(), "user", term819);
        term868 = new Integer(-1801760683);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("codeit.gatcha.domain.answer.entity.Answer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term868;
        callMethod(klass, "setId", argTypes, term788, args);
    }

};


