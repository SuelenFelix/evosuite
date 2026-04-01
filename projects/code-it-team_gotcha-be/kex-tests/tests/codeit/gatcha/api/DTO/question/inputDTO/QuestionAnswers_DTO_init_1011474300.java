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
import java.util.LinkedList;
import java.lang.Object;
import java.lang.Integer;

public class QuestionAnswers_DTO_init_1011474300 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term77;

    public QuestionAnswers_DTO_init_1011474300() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term81 = new Integer(391863371);
        Object term80 = newInstance(Class.forName("codeit.gatcha.api.DTO.question.inputDTO.QuestionAnswer_DTO"));
        setField(term80, term80.getClass(), "questionId", term81);
        setField(term80, term80.getClass(), "answer", "xxtlPwDYFs");
        Integer term97 = new Integer(-1922583790);
        Object term96 = newInstance(Class.forName("codeit.gatcha.api.DTO.question.inputDTO.QuestionAnswer_DTO"));
        setField(term96, term96.getClass(), "questionId", term97);
        setField(term96, term96.getClass(), "answer", "");
        Integer term102 = new Integer(-616727354);
        Object term101 = newInstance(Class.forName("codeit.gatcha.api.DTO.question.inputDTO.QuestionAnswer_DTO"));
        setField(term101, term101.getClass(), "questionId", term102);
        setField(term101, term101.getClass(), "answer", null);
        term77 = new LinkedList();
        ((LinkedList) term77).add(term80);
        ((LinkedList) term77).add(term96);
        ((LinkedList) term77).add(term101);
        ((LinkedList) term77).add((Object)null);
        ((LinkedList) term77).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("codeit.gatcha.api.DTO.question.inputDTO.QuestionAnswers_DTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term77;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


