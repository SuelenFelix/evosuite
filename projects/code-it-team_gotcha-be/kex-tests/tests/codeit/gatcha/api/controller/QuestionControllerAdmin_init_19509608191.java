package codeit.gatcha.api.controller;

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
import static codeit.gatcha.api.controller.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class QuestionControllerAdmin_init_19509608191 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);

    public QuestionControllerAdmin_init_19509608191() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("codeit.gatcha.api.controller.QuestionControllerAdmin");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("codeit.gatcha.domain.question.service.QuestionCreationService");
        argTypes[1] = Class.forName("codeit.gatcha.api.service.question.API_QuestionFetchService");
        argTypes[2] = Class.forName("codeit.gatcha.api.service.question.API_QuestionDeletionService");
        argTypes[3] = Class.forName("codeit.gatcha.api.service.question.API_QuestionUpdateService");
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


