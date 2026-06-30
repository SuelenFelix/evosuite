package codeit.gatcha.api.DTO.Publication;

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
import static codeit.gatcha.api.DTO.Publication.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class PublishedQuestionDTO_init_16670381600 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term245;

    public PublishedQuestionDTO_init_16670381600() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term246 = new Integer(-1685132342);
        Integer term261 = new Integer(-1456670397);
        Integer term277 = new Integer(1622346318);
        Integer term280 = new Integer(1048535127);
        HashMap term295 = new HashMap();
        Set<Object> term355 =  ((Map) term295).keySet();
        HashSet term294 = new HashSet((Collection<? extends Object>) term355);
        term245 = newInstance(Class.forName("codeit.gatcha.domain.answer.entity.Answer"));
        Object term260 = newInstance(Class.forName("codeit.gatcha.domain.question.entity.Question"));
        Object term276 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.GatchaUser"));
        Object term279 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.Authority"));
        setField(term245, term245.getClass(), "id", term246);
        setField(term245, term245.getClass(), "body", "AijpHYOFuy");
        setField(term260, term260.getClass(), "id", term261);
        setField(term260, term260.getClass(), "body", "SbAoxhfrkn");
        setBooleanField(term260, term260.getClass(), "valid", true);
        setField(term245, term245.getClass(), "question", term260);
        setField(term276, term276.getClass(), "id", term277);
        setField(term279, term279.getClass(), "id", term280);
        setField(term279, term279.getClass(), "role", "kuTXqwMtDB");
        setField(term279, term279.getClass(), "users", term294);
        setField(term276, term276.getClass(), "authority", term279);
        setField(term276, term276.getClass(), "email", "ffYhPOzlUs");
        setField(term276, term276.getClass(), "password", "MLqYREekMl");
        setBooleanField(term276, term276.getClass(), "enabled", true);
        setField(term245, term245.getClass(), "user", term276);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("codeit.gatcha.api.DTO.Publication.PublishedQuestionDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("codeit.gatcha.domain.answer.entity.Answer");
        Object[] args = new Object[1];
        args[0] = term245;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


