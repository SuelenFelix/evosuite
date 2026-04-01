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
import java.util.LinkedList;

public class Admin_QuestionsDTO_setQuestions_3212892471 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term502;
     Object term523;

    public Admin_QuestionsDTO_setQuestions_3212892471() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term507 = new Integer(-655067527);
        Object term505 = newInstance(Class.forName("codeit.gatcha.api.DTO.question.outputDTO.Admin_QuestionDTO"));
        setField(term505, term505.getClass(), "body", "");
        setField(term505, term505.getClass(), "id", term507);
        Integer term511 = new Integer(-6029667);
        Object term509 = newInstance(Class.forName("codeit.gatcha.api.DTO.question.outputDTO.Admin_QuestionDTO"));
        setField(term509, term509.getClass(), "body", "");
        setField(term509, term509.getClass(), "id", term511);
        Integer term515 = new Integer(-2068769794);
        Object term513 = newInstance(Class.forName("codeit.gatcha.api.DTO.question.outputDTO.Admin_QuestionDTO"));
        setField(term513, term513.getClass(), "body", "");
        setField(term513, term513.getClass(), "id", term515);
        Integer term519 = new Integer(-117576464);
        Object term517 = newInstance(Class.forName("codeit.gatcha.api.DTO.question.outputDTO.Admin_QuestionDTO"));
        setField(term517, term517.getClass(), "body", "");
        setField(term517, term517.getClass(), "id", term519);
        ArrayList term503 = new ArrayList();
        ((ArrayList) term503).add(term505);
        ((ArrayList) term503).add(term509);
        ((ArrayList) term503).add(term513);
        ((ArrayList) term503).add(term517);
        term502 = newInstance(Class.forName("codeit.gatcha.api.DTO.question.outputDTO.Admin_QuestionsDTO"));
        setField(term502, term502.getClass(), "questions", term503);
        term523 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("codeit.gatcha.api.DTO.question.outputDTO.Admin_QuestionsDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term523;
        callMethod(klass, "setQuestions", argTypes, term502, args);
    }

};


