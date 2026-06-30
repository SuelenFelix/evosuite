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

public class Admin_QuestionsDTO_canEqual_19888953113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term548;
     Object term573;

    public Admin_QuestionsDTO_canEqual_19888953113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term553 = new Integer(-1275173084);
        Object term551 = newInstance(Class.forName("codeit.gatcha.api.DTO.question.outputDTO.Admin_QuestionDTO"));
        setField(term551, term551.getClass(), "body", "");
        setField(term551, term551.getClass(), "id", term553);
        Integer term557 = new Integer(-244121226);
        Object term555 = newInstance(Class.forName("codeit.gatcha.api.DTO.question.outputDTO.Admin_QuestionDTO"));
        setField(term555, term555.getClass(), "body", "");
        setField(term555, term555.getClass(), "id", term557);
        Integer term561 = new Integer(-203030934);
        Object term559 = newInstance(Class.forName("codeit.gatcha.api.DTO.question.outputDTO.Admin_QuestionDTO"));
        setField(term559, term559.getClass(), "body", "");
        setField(term559, term559.getClass(), "id", term561);
        Integer term565 = new Integer(-1179120542);
        Object term563 = newInstance(Class.forName("codeit.gatcha.api.DTO.question.outputDTO.Admin_QuestionDTO"));
        setField(term563, term563.getClass(), "body", "");
        setField(term563, term563.getClass(), "id", term565);
        Integer term569 = new Integer(-73683645);
        Object term567 = newInstance(Class.forName("codeit.gatcha.api.DTO.question.outputDTO.Admin_QuestionDTO"));
        setField(term567, term567.getClass(), "body", "");
        setField(term567, term567.getClass(), "id", term569);
        ArrayList term549 = new ArrayList();
        ((ArrayList) term549).add(term551);
        ((ArrayList) term549).add(term555);
        ((ArrayList) term549).add(term559);
        ((ArrayList) term549).add(term563);
        ((ArrayList) term549).add(term567);
        term548 = newInstance(Class.forName("codeit.gatcha.api.DTO.question.outputDTO.Admin_QuestionsDTO"));
        setField(term548, term548.getClass(), "questions", term549);
        term573 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("codeit.gatcha.api.DTO.question.outputDTO.Admin_QuestionsDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term573;
        callMethod(klass, "canEqual", argTypes, term548, args);
    }

};


