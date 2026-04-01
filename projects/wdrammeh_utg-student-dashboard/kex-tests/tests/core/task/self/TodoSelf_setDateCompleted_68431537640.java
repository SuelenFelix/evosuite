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

public class TodoSelf_setDateCompleted_68431537640 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term392647;

    public TodoSelf_setDateCompleted_68431537640() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term392647 = newInstance(Class.forName("core.task.self.TodoSelf"));
        setField(term392647, term392647.getClass(), "description", null);
        setField(term392647, term392647.getClass(), "startDate", null);
        setIntField(term392647, term392647.getClass(), "specifiedDuration", 0);
        setIntField(term392647, term392647.getClass(), "totalTimeConsumed", 0);
        setBooleanField(term392647, term392647.getClass(), "isActive", false);
        setField(term392647, term392647.getClass(), "dateExpectedToComplete", null);
        setField(term392647, term392647.getClass(), "dateCompleted", null);
        setField(term392647, term392647.getClass(), "timer", null);
        setBooleanField(term392647, term392647.getClass(), "eveIsAlerted", false);
        setBooleanField(term392647, term392647.getClass(), "doneIsAlerted", false);
        setField(term392647, term392647.getClass(), "togoLabel", null);
        setField(term392647, term392647.getClass(), "exhibition", null);
        setField(term392647, term392647.getClass(), "layerPanel", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.self.TodoSelf");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setDateCompleted", argTypes, term392647, args);
    }

};


