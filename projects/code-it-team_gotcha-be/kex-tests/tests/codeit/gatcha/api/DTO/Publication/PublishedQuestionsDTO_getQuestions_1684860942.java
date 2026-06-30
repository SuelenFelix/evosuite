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
import java.util.ArrayList;
import java.lang.Object;

public class PublishedQuestionsDTO_getQuestions_1684860942 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term601;

    public PublishedQuestionsDTO_getQuestions_1684860942() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term604 = newInstance(Class.forName("codeit.gatcha.api.DTO.Publication.PublishedQuestionDTO"));
        setField(term604, term604.getClass(), "body", "");
        setField(term604, term604.getClass(), "answer", "");
        Object term607 = newInstance(Class.forName("codeit.gatcha.api.DTO.Publication.PublishedQuestionDTO"));
        setField(term607, term607.getClass(), "body", "");
        setField(term607, term607.getClass(), "answer", "");
        Object term610 = newInstance(Class.forName("codeit.gatcha.api.DTO.Publication.PublishedQuestionDTO"));
        setField(term610, term610.getClass(), "body", "");
        setField(term610, term610.getClass(), "answer", "");
        ArrayList term602 = new ArrayList();
        ((ArrayList) term602).add(term604);
        ((ArrayList) term602).add(term607);
        ((ArrayList) term602).add(term610);
        term601 = newInstance(Class.forName("codeit.gatcha.api.DTO.Publication.PublishedQuestionsDTO"));
        setField(term601, term601.getClass(), "questions", term602);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("codeit.gatcha.api.DTO.Publication.PublishedQuestionsDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getQuestions", argTypes, term601, args);
    }

};


