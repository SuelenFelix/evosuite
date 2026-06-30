package codeit.gatcha.api.DTO.question.inputDTO;

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
import static codeit.gatcha.api.DTO.question.inputDTO.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Integer;

public class QuestionAnswers_DTO_getQuestionAnswers_13531782531 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term132;

    public QuestionAnswers_DTO_getQuestionAnswers_13531782531() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term136 = new Integer(1227103734);
        Object term135 = newInstance(Class.forName("codeit.gatcha.api.DTO.question.inputDTO.QuestionAnswer_DTO"));
        setField(term135, term135.getClass(), "questionId", term136);
        setField(term135, term135.getClass(), "answer", "");
        Integer term140 = new Integer(-1339778481);
        Object term139 = newInstance(Class.forName("codeit.gatcha.api.DTO.question.inputDTO.QuestionAnswer_DTO"));
        setField(term139, term139.getClass(), "questionId", term140);
        setField(term139, term139.getClass(), "answer", "");
        Integer term144 = new Integer(1725571209);
        Object term143 = newInstance(Class.forName("codeit.gatcha.api.DTO.question.inputDTO.QuestionAnswer_DTO"));
        setField(term143, term143.getClass(), "questionId", term144);
        setField(term143, term143.getClass(), "answer", "");
        Integer term148 = new Integer(-522618178);
        Object term147 = newInstance(Class.forName("codeit.gatcha.api.DTO.question.inputDTO.QuestionAnswer_DTO"));
        setField(term147, term147.getClass(), "questionId", term148);
        setField(term147, term147.getClass(), "answer", "");
        Integer term152 = new Integer(1134449235);
        Object term151 = newInstance(Class.forName("codeit.gatcha.api.DTO.question.inputDTO.QuestionAnswer_DTO"));
        setField(term151, term151.getClass(), "questionId", term152);
        setField(term151, term151.getClass(), "answer", "");
        Integer term156 = new Integer(-883034806);
        Object term155 = newInstance(Class.forName("codeit.gatcha.api.DTO.question.inputDTO.QuestionAnswer_DTO"));
        setField(term155, term155.getClass(), "questionId", term156);
        setField(term155, term155.getClass(), "answer", "");
        Integer term160 = new Integer(1585847225);
        Object term159 = newInstance(Class.forName("codeit.gatcha.api.DTO.question.inputDTO.QuestionAnswer_DTO"));
        setField(term159, term159.getClass(), "questionId", term160);
        setField(term159, term159.getClass(), "answer", "");
        Integer term164 = new Integer(597278769);
        Object term163 = newInstance(Class.forName("codeit.gatcha.api.DTO.question.inputDTO.QuestionAnswer_DTO"));
        setField(term163, term163.getClass(), "questionId", term164);
        setField(term163, term163.getClass(), "answer", "");
        Integer term168 = new Integer(-1685132342);
        Object term167 = newInstance(Class.forName("codeit.gatcha.api.DTO.question.inputDTO.QuestionAnswer_DTO"));
        setField(term167, term167.getClass(), "questionId", term168);
        setField(term167, term167.getClass(), "answer", "");
        ArrayList term133 = new ArrayList();
        ((ArrayList) term133).add(term135);
        ((ArrayList) term133).add(term139);
        ((ArrayList) term133).add(term143);
        ((ArrayList) term133).add(term147);
        ((ArrayList) term133).add(term151);
        ((ArrayList) term133).add(term155);
        ((ArrayList) term133).add(term159);
        ((ArrayList) term133).add(term163);
        ((ArrayList) term133).add(term167);
        term132 = newInstance(Class.forName("codeit.gatcha.api.DTO.question.inputDTO.QuestionAnswers_DTO"));
        setField(term132, term132.getClass(), "questionAnswers", term133);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("codeit.gatcha.api.DTO.question.inputDTO.QuestionAnswers_DTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getQuestionAnswers", argTypes, term132, args);
    }

};


