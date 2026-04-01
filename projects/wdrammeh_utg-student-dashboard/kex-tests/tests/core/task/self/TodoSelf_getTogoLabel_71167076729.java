package core.task.self;

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
import static core.task.self.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class TodoSelf_getTogoLabel_71167076729 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term392577;

    public TodoSelf_getTogoLabel_71167076729() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term392577 = newInstance(Class.forName("core.task.self.TodoSelf"));
        setField(term392577, term392577.getClass(), "description", null);
        setField(term392577, term392577.getClass(), "startDate", null);
        setIntField(term392577, term392577.getClass(), "specifiedDuration", 0);
        setIntField(term392577, term392577.getClass(), "totalTimeConsumed", 0);
        setBooleanField(term392577, term392577.getClass(), "isActive", false);
        setField(term392577, term392577.getClass(), "dateExpectedToComplete", null);
        setField(term392577, term392577.getClass(), "dateCompleted", null);
        setField(term392577, term392577.getClass(), "timer", null);
        setBooleanField(term392577, term392577.getClass(), "eveIsAlerted", false);
        setBooleanField(term392577, term392577.getClass(), "doneIsAlerted", false);
        setField(term392577, term392577.getClass(), "togoLabel", null);
        setField(term392577, term392577.getClass(), "exhibition", null);
        setField(term392577, term392577.getClass(), "layerPanel", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.self.TodoSelf");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTogoLabel", argTypes, term392577, args);
    }

};


