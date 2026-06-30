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

public class User_QuestionsDTO_isPublished_18007048681 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term665;

    public User_QuestionsDTO_isPublished_18007048681() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term670 = new Integer(579005622);
        Object term668 = newInstance(Class.forName("codeit.gatcha.api.DTO.question.outputDTO.User_QuestionDTO"));
        setField(term668, term668.getClass(), "body", "");
        setField(term668, term668.getClass(), "id", term670);
        setField(term668, term668.getClass(), "answer", "");
        Integer term675 = new Integer(-14890619);
        Object term673 = newInstance(Class.forName("codeit.gatcha.api.DTO.question.outputDTO.User_QuestionDTO"));
        setField(term673, term673.getClass(), "body", "");
        setField(term673, term673.getClass(), "id", term675);
        setField(term673, term673.getClass(), "answer", "");
        Integer term680 = new Integer(1632125673);
        Object term678 = newInstance(Class.forName("codeit.gatcha.api.DTO.question.outputDTO.User_QuestionDTO"));
        setField(term678, term678.getClass(), "body", "");
        setField(term678, term678.getClass(), "id", term680);
        setField(term678, term678.getClass(), "answer", "");
        Integer term685 = new Integer(454281060);
        Object term683 = newInstance(Class.forName("codeit.gatcha.api.DTO.question.outputDTO.User_QuestionDTO"));
        setField(term683, term683.getClass(), "body", "");
        setField(term683, term683.getClass(), "id", term685);
        setField(term683, term683.getClass(), "answer", "");
        Integer term690 = new Integer(-1786399638);
        Object term688 = newInstance(Class.forName("codeit.gatcha.api.DTO.question.outputDTO.User_QuestionDTO"));
        setField(term688, term688.getClass(), "body", "");
        setField(term688, term688.getClass(), "id", term690);
        setField(term688, term688.getClass(), "answer", "");
        Integer term695 = new Integer(2055867847);
        Object term693 = newInstance(Class.forName("codeit.gatcha.api.DTO.question.outputDTO.User_QuestionDTO"));
        setField(term693, term693.getClass(), "body", "");
        setField(term693, term693.getClass(), "id", term695);
        setField(term693, term693.getClass(), "answer", "");
        Integer term700 = new Integer(-1048298087);
        Object term698 = newInstance(Class.forName("codeit.gatcha.api.DTO.question.outputDTO.User_QuestionDTO"));
        setField(term698, term698.getClass(), "body", "");
        setField(term698, term698.getClass(), "id", term700);
        setField(term698, term698.getClass(), "answer", "");
        ArrayList term666 = new ArrayList();
        ((ArrayList) term666).add(term668);
        ((ArrayList) term666).add(term673);
        ((ArrayList) term666).add(term678);
        ((ArrayList) term666).add(term683);
        ((ArrayList) term666).add(term688);
        ((ArrayList) term666).add(term693);
        ((ArrayList) term666).add(term698);
        term665 = newInstance(Class.forName("codeit.gatcha.api.DTO.question.outputDTO.User_QuestionsDTO"));
        setField(term665, term665.getClass(), "questions", term666);
        setBooleanField(term665, term665.getClass(), "published", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("codeit.gatcha.api.DTO.question.outputDTO.User_QuestionsDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isPublished", argTypes, term665, args);
    }

};


