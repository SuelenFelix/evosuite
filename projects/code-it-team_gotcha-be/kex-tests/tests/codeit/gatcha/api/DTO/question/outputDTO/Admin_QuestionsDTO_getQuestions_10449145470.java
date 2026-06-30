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

public class Admin_QuestionsDTO_getQuestions_10449145470 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term477;

    public Admin_QuestionsDTO_getQuestions_10449145470() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term482 = new Integer(597278769);
        Object term480 = newInstance(Class.forName("codeit.gatcha.api.DTO.question.outputDTO.Admin_QuestionDTO"));
        setField(term480, term480.getClass(), "body", "");
        setField(term480, term480.getClass(), "id", term482);
        Integer term486 = new Integer(-1685132342);
        Object term484 = newInstance(Class.forName("codeit.gatcha.api.DTO.question.outputDTO.Admin_QuestionDTO"));
        setField(term484, term484.getClass(), "body", "");
        setField(term484, term484.getClass(), "id", term486);
        Integer term490 = new Integer(-1456670397);
        Object term488 = newInstance(Class.forName("codeit.gatcha.api.DTO.question.outputDTO.Admin_QuestionDTO"));
        setField(term488, term488.getClass(), "body", "");
        setField(term488, term488.getClass(), "id", term490);
        Integer term494 = new Integer(1622346318);
        Object term492 = newInstance(Class.forName("codeit.gatcha.api.DTO.question.outputDTO.Admin_QuestionDTO"));
        setField(term492, term492.getClass(), "body", "");
        setField(term492, term492.getClass(), "id", term494);
        Integer term498 = new Integer(1048535127);
        Object term496 = newInstance(Class.forName("codeit.gatcha.api.DTO.question.outputDTO.Admin_QuestionDTO"));
        setField(term496, term496.getClass(), "body", "");
        setField(term496, term496.getClass(), "id", term498);
        ArrayList term478 = new ArrayList();
        ((ArrayList) term478).add(term480);
        ((ArrayList) term478).add(term484);
        ((ArrayList) term478).add(term488);
        ((ArrayList) term478).add(term492);
        ((ArrayList) term478).add(term496);
        term477 = newInstance(Class.forName("codeit.gatcha.api.DTO.question.outputDTO.Admin_QuestionsDTO"));
        setField(term477, term477.getClass(), "questions", term478);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("codeit.gatcha.api.DTO.question.outputDTO.Admin_QuestionsDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getQuestions", argTypes, term477, args);
    }

};


