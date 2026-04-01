package codeit.gatcha.api.DTO.question.outputDTO;

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
import static codeit.gatcha.api.DTO.question.outputDTO.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.LinkedList;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Boolean;

public class User_QuestionsDTO_init_7838103083 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term706;
     Object term787;

    public User_QuestionsDTO_init_7838103083() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term722 = new Integer(292681826);
        Object term709 = newInstance(Class.forName("codeit.gatcha.api.DTO.question.outputDTO.User_QuestionDTO"));
        setField(term709, term709.getClass(), "body", "JUmudUmaaV");
        setField(term709, term709.getClass(), "id", term722);
        setField(term709, term709.getClass(), "answer", "KoyGrUJeJW");
        Integer term739 = new Integer(458147407);
        Object term737 = newInstance(Class.forName("codeit.gatcha.api.DTO.question.outputDTO.User_QuestionDTO"));
        setField(term737, term737.getClass(), "body", "");
        setField(term737, term737.getClass(), "id", term739);
        setField(term737, term737.getClass(), "answer", "");
        Integer term744 = new Integer(-184153539);
        Object term743 = newInstance(Class.forName("codeit.gatcha.api.DTO.question.outputDTO.User_QuestionDTO"));
        setField(term743, term743.getClass(), "body", null);
        setField(term743, term743.getClass(), "id", term744);
        setField(term743, term743.getClass(), "answer", null);
        term706 = new LinkedList();
        ((LinkedList) term706).add(term709);
        ((LinkedList) term706).add(term737);
        ((LinkedList) term706).add(term743);
        ((LinkedList) term706).add((Object)null);
        ((LinkedList) term706).add((Object)null);
        ((LinkedList) term706).add((Object)null);
        ((LinkedList) term706).add((Object)null);
        ((LinkedList) term706).add((Object)null);
        term787 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("codeit.gatcha.api.DTO.question.outputDTO.User_QuestionsDTO");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.List");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term706;
        args[1] = term787;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


