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

public class Answer_AnswerBuilder_user_16877978264 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1895;
     Object term1975;

    public Answer_AnswerBuilder_user_16877978264() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1896 = new Integer(-2131181468);
        Integer term1911 = new Integer(282916351);
        Integer term1927 = new Integer(880977281);
        Integer term1930 = new Integer(371943306);
        HashMap term1945 = new HashMap();
        Set<Object> term2055 =  ((Map) term1945).keySet();
        HashSet term1944 = new HashSet((Collection<? extends Object>) term2055);
        term1895 = newInstance(Class.forName("codeit.gatcha.domain.answer.entity.Answer$AnswerBuilder"));
        Object term1910 = newInstance(Class.forName("codeit.gatcha.domain.question.entity.Question"));
        Object term1926 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.GatchaUser"));
        Object term1929 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.Authority"));
        setField(term1895, term1895.getClass(), "id", term1896);
        setField(term1895, term1895.getClass(), "body", "RCOqfVsRHt");
        setField(term1910, term1910.getClass(), "id", term1911);
        setField(term1910, term1910.getClass(), "body", "TSyCeEZPaT");
        setBooleanField(term1910, term1910.getClass(), "valid", true);
        setField(term1895, term1895.getClass(), "question", term1910);
        setField(term1926, term1926.getClass(), "id", term1927);
        setField(term1929, term1929.getClass(), "id", term1930);
        setField(term1929, term1929.getClass(), "role", "JeZFtaqkzW");
        setField(term1929, term1929.getClass(), "users", term1944);
        setField(term1926, term1926.getClass(), "authority", term1929);
        setField(term1926, term1926.getClass(), "email", "sUEeHQTWkA");
        setField(term1926, term1926.getClass(), "password", "BDIRCxAWLA");
        setBooleanField(term1926, term1926.getClass(), "enabled", true);
        setField(term1895, term1895.getClass(), "user", term1926);
        Integer term1976 = new Integer(-1254072822);
        Integer term1979 = new Integer(-1111249833);
        HashMap term1994 = new HashMap();
        Set<Object> term2086 =  ((Map) term1994).keySet();
        HashSet term1993 = new HashSet((Collection<? extends Object>) term2086);
        term1975 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.GatchaUser"));
        Object term1978 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.Authority"));
        setField(term1975, term1975.getClass(), "id", term1976);
        setField(term1978, term1978.getClass(), "id", term1979);
        setField(term1978, term1978.getClass(), "role", "eOJfbiZLnb");
        setField(term1978, term1978.getClass(), "users", term1993);
        setField(term1975, term1975.getClass(), "authority", term1978);
        setField(term1975, term1975.getClass(), "email", "mGRiYhnMcR");
        setField(term1975, term1975.getClass(), "password", "NFlvfJCVPO");
        setBooleanField(term1975, term1975.getClass(), "enabled", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("codeit.gatcha.domain.answer.entity.Answer$AnswerBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("codeit.gatcha.domain.user.entity.GatchaUser");
        Object[] args = new Object[1];
        args[0] = term1975;
        callMethod(klass, "user", argTypes, term1895, args);
    }

};


