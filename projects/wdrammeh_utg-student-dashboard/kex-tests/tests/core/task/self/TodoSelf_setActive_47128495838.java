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
import java.lang.Boolean;

public class TodoSelf_setActive_47128495838 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term95122;
     Object term95128;

    public TodoSelf_setActive_47128495838() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term95122 = newInstance(Class.forName("core.task.self.TodoSelf"));
        setField(term95122, term95122.getClass(), "description", null);
        setField(term95122, term95122.getClass(), "startDate", null);
        setIntField(term95122, term95122.getClass(), "specifiedDuration", 0);
        setIntField(term95122, term95122.getClass(), "totalTimeConsumed", 0);
        setBooleanField(term95122, term95122.getClass(), "isActive", false);
        setField(term95122, term95122.getClass(), "dateExpectedToComplete", null);
        setField(term95122, term95122.getClass(), "dateCompleted", null);
        setField(term95122, term95122.getClass(), "timer", null);
        setBooleanField(term95122, term95122.getClass(), "eveIsAlerted", false);
        setBooleanField(term95122, term95122.getClass(), "doneIsAlerted", false);
        setField(term95122, term95122.getClass(), "togoLabel", null);
        setField(term95122, term95122.getClass(), "exhibition", null);
        setField(term95122, term95122.getClass(), "layerPanel", null);
        term95128 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.self.TodoSelf");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term95128;
        callMethod(klass, "setActive", argTypes, term95122, args);
    }

};


