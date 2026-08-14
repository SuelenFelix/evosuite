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

public class TodoSelf_setUpUI_16255355927 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term392587;

    public TodoSelf_setUpUI_16255355927() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term392587 = newInstance(Class.forName("core.task.self.TodoSelf"));
        setField(term392587, term392587.getClass(), "description", null);
        setField(term392587, term392587.getClass(), "startDate", null);
        setIntField(term392587, term392587.getClass(), "specifiedDuration", 0);
        setIntField(term392587, term392587.getClass(), "totalTimeConsumed", 0);
        setBooleanField(term392587, term392587.getClass(), "isActive", false);
        setField(term392587, term392587.getClass(), "dateExpectedToComplete", null);
        setField(term392587, term392587.getClass(), "dateCompleted", null);
        setField(term392587, term392587.getClass(), "timer", null);
        setBooleanField(term392587, term392587.getClass(), "eveIsAlerted", false);
        setBooleanField(term392587, term392587.getClass(), "doneIsAlerted", false);
        setField(term392587, term392587.getClass(), "togoLabel", null);
        setField(term392587, term392587.getClass(), "exhibition", null);
        setField(term392587, term392587.getClass(), "layerPanel", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.self.TodoSelf");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "setUpUI", argTypes, term392587, args);
    }

};


