package core.task;

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
import static core.task.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class TaskActivity_answerActivity_6101666429 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term239587;

    public TaskActivity_answerActivity_6101666429() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term239587 = newInstance(Class.forName("core.task.TaskActivity"));
        setField(term239587, term239587.getClass(), "hintLabel", null);
        setField(term239587, term239587.getClass(), "inPanel", null);
        setField(term239587, term239587.getClass(), "cardLayout", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.TaskActivity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "answerActivity", argTypes, term239587, args);
    }

};


