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
     Object term95136;

    public TodoSelf_setDateCompleted_68431537640() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term95136 = newInstance(Class.forName("core.task.self.TodoSelf"));
        setField(term95136, term95136.getClass(), "description", null);
        setField(term95136, term95136.getClass(), "startDate", null);
        setIntField(term95136, term95136.getClass(), "specifiedDuration", 0);
        setIntField(term95136, term95136.getClass(), "totalTimeConsumed", 0);
        setBooleanField(term95136, term95136.getClass(), "isActive", false);
        setField(term95136, term95136.getClass(), "dateExpectedToComplete", null);
        setField(term95136, term95136.getClass(), "dateCompleted", null);
        setField(term95136, term95136.getClass(), "timer", null);
        setBooleanField(term95136, term95136.getClass(), "eveIsAlerted", false);
        setBooleanField(term95136, term95136.getClass(), "doneIsAlerted", false);
        setField(term95136, term95136.getClass(), "togoLabel", null);
        setField(term95136, term95136.getClass(), "exhibition", null);
        setField(term95136, term95136.getClass(), "layerPanel", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.self.TodoSelf");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setDateCompleted", argTypes, term95136, args);
    }

};


