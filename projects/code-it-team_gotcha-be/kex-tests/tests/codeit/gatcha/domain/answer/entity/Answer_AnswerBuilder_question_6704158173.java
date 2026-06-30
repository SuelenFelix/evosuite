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

public class Answer_AnswerBuilder_question_6704158173 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1738;
     Object term1818;

    public Answer_AnswerBuilder_question_6704158173() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1739 = new Integer(-1667990367);
        Integer term1754 = new Integer(-1214628358);
        Integer term1770 = new Integer(1102721075);
        Integer term1773 = new Integer(-426764678);
        HashMap term1788 = new HashMap();
        Set<Object> term1864 =  ((Map) term1788).keySet();
        HashSet term1787 = new HashSet((Collection<? extends Object>) term1864);
        term1738 = newInstance(Class.forName("codeit.gatcha.domain.answer.entity.Answer$AnswerBuilder"));
        Object term1753 = newInstance(Class.forName("codeit.gatcha.domain.question.entity.Question"));
        Object term1769 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.GatchaUser"));
        Object term1772 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.Authority"));
        setField(term1738, term1738.getClass(), "id", term1739);
        setField(term1738, term1738.getClass(), "body", "NTWMiBEaDF");
        setField(term1753, term1753.getClass(), "id", term1754);
        setField(term1753, term1753.getClass(), "body", "SPBstwKFVr");
        setBooleanField(term1753, term1753.getClass(), "valid", true);
        setField(term1738, term1738.getClass(), "question", term1753);
        setField(term1769, term1769.getClass(), "id", term1770);
        setField(term1772, term1772.getClass(), "id", term1773);
        setField(term1772, term1772.getClass(), "role", "WxYUTuqmIq");
        setField(term1772, term1772.getClass(), "users", term1787);
        setField(term1769, term1769.getClass(), "authority", term1772);
        setField(term1769, term1769.getClass(), "email", "lZIgPZPgTu");
        setField(term1769, term1769.getClass(), "password", "iuCxnHGMoW");
        setBooleanField(term1769, term1769.getClass(), "enabled", true);
        setField(term1738, term1738.getClass(), "user", term1769);
        Integer term1819 = new Integer(-916584829);
        term1818 = newInstance(Class.forName("codeit.gatcha.domain.question.entity.Question"));
        setField(term1818, term1818.getClass(), "id", term1819);
        setField(term1818, term1818.getClass(), "body", "GPSEWEDSTo");
        setBooleanField(term1818, term1818.getClass(), "valid", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("codeit.gatcha.domain.answer.entity.Answer$AnswerBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("codeit.gatcha.domain.question.entity.Question");
        Object[] args = new Object[1];
        args[0] = term1818;
        callMethod(klass, "question", argTypes, term1738, args);
    }

};


