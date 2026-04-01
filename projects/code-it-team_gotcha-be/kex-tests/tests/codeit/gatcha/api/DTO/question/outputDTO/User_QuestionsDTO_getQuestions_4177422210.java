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
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Integer;

public class User_QuestionsDTO_getQuestions_4177422210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term629;

    public User_QuestionsDTO_getQuestions_4177422210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term634 = new Integer(-602026508);
        Object term632 = newInstance(Class.forName("codeit.gatcha.api.DTO.question.outputDTO.User_QuestionDTO"));
        setField(term632, term632.getClass(), "body", "");
        setField(term632, term632.getClass(), "id", term634);
        setField(term632, term632.getClass(), "answer", "");
        Integer term639 = new Integer(-157887805);
        Object term637 = newInstance(Class.forName("codeit.gatcha.api.DTO.question.outputDTO.User_QuestionDTO"));
        setField(term637, term637.getClass(), "body", "");
        setField(term637, term637.getClass(), "id", term639);
        setField(term637, term637.getClass(), "answer", "");
        Integer term644 = new Integer(1876565163);
        Object term642 = newInstance(Class.forName("codeit.gatcha.api.DTO.question.outputDTO.User_QuestionDTO"));
        setField(term642, term642.getClass(), "body", "");
        setField(term642, term642.getClass(), "id", term644);
        setField(term642, term642.getClass(), "answer", "");
        Integer term649 = new Integer(-817164822);
        Object term647 = newInstance(Class.forName("codeit.gatcha.api.DTO.question.outputDTO.User_QuestionDTO"));
        setField(term647, term647.getClass(), "body", "");
        setField(term647, term647.getClass(), "id", term649);
        setField(term647, term647.getClass(), "answer", "");
        Integer term654 = new Integer(-1016503459);
        Object term652 = newInstance(Class.forName("codeit.gatcha.api.DTO.question.outputDTO.User_QuestionDTO"));
        setField(term652, term652.getClass(), "body", "");
        setField(term652, term652.getClass(), "id", term654);
        setField(term652, term652.getClass(), "answer", "");
        Integer term659 = new Integer(-1968847291);
        Object term657 = newInstance(Class.forName("codeit.gatcha.api.DTO.question.outputDTO.User_QuestionDTO"));
        setField(term657, term657.getClass(), "body", "");
        setField(term657, term657.getClass(), "id", term659);
        setField(term657, term657.getClass(), "answer", "");
        ArrayList term630 = new ArrayList();
        ((ArrayList) term630).add(term632);
        ((ArrayList) term630).add(term637);
        ((ArrayList) term630).add(term642);
        ((ArrayList) term630).add(term647);
        ((ArrayList) term630).add(term652);
        ((ArrayList) term630).add(term657);
        term629 = newInstance(Class.forName("codeit.gatcha.api.DTO.question.outputDTO.User_QuestionsDTO"));
        setField(term629, term629.getClass(), "questions", term630);
        setBooleanField(term629, term629.getClass(), "published", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("codeit.gatcha.api.DTO.question.outputDTO.User_QuestionsDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getQuestions", argTypes, term629, args);
    }

};


