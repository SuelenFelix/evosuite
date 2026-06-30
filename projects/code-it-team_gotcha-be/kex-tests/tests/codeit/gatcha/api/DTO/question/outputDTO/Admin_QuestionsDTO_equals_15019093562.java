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

public class Admin_QuestionsDTO_equals_15019093562 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term526;
     Object term547;

    public Admin_QuestionsDTO_equals_15019093562() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term531 = new Integer(-1007160944);
        Object term529 = newInstance(Class.forName("codeit.gatcha.api.DTO.question.outputDTO.Admin_QuestionDTO"));
        setField(term529, term529.getClass(), "body", "");
        setField(term529, term529.getClass(), "id", term531);
        Integer term535 = new Integer(1135664017);
        Object term533 = newInstance(Class.forName("codeit.gatcha.api.DTO.question.outputDTO.Admin_QuestionDTO"));
        setField(term533, term533.getClass(), "body", "");
        setField(term533, term533.getClass(), "id", term535);
        Integer term539 = new Integer(590364439);
        Object term537 = newInstance(Class.forName("codeit.gatcha.api.DTO.question.outputDTO.Admin_QuestionDTO"));
        setField(term537, term537.getClass(), "body", "");
        setField(term537, term537.getClass(), "id", term539);
        Integer term543 = new Integer(865208305);
        Object term541 = newInstance(Class.forName("codeit.gatcha.api.DTO.question.outputDTO.Admin_QuestionDTO"));
        setField(term541, term541.getClass(), "body", "");
        setField(term541, term541.getClass(), "id", term543);
        ArrayList term527 = new ArrayList();
        ((ArrayList) term527).add(term529);
        ((ArrayList) term527).add(term533);
        ((ArrayList) term527).add(term537);
        ((ArrayList) term527).add(term541);
        term526 = newInstance(Class.forName("codeit.gatcha.api.DTO.question.outputDTO.Admin_QuestionsDTO"));
        setField(term526, term526.getClass(), "questions", term527);
        term547 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("codeit.gatcha.api.DTO.question.outputDTO.Admin_QuestionsDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term547;
        callMethod(klass, "equals", argTypes, term526, args);
    }

};


