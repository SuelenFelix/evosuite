package codeit.gatcha.api.service.question;

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
import static codeit.gatcha.api.service.question.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class API_QuestionFetchService_getAllValidQuestionsDTO_890891340 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);

    public API_QuestionFetchService_getAllValidQuestionsDTO_890891340() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("codeit.gatcha.api.service.question.API_QuestionFetchService");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAllValidQuestions_DTO", argTypes, null, args);
    }

};


