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
     Object term392633;
     Object term392639;

    public TodoSelf_setActive_47128495838() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term392633 = newInstance(Class.forName("core.task.self.TodoSelf"));
        setField(term392633, term392633.getClass(), "description", null);
        setField(term392633, term392633.getClass(), "startDate", null);
        setIntField(term392633, term392633.getClass(), "specifiedDuration", 0);
        setIntField(term392633, term392633.getClass(), "totalTimeConsumed", 0);
        setBooleanField(term392633, term392633.getClass(), "isActive", false);
        setField(term392633, term392633.getClass(), "dateExpectedToComplete", null);
        setField(term392633, term392633.getClass(), "dateCompleted", null);
        setField(term392633, term392633.getClass(), "timer", null);
        setBooleanField(term392633, term392633.getClass(), "eveIsAlerted", false);
        setBooleanField(term392633, term392633.getClass(), "doneIsAlerted", false);
        setField(term392633, term392633.getClass(), "togoLabel", null);
        setField(term392633, term392633.getClass(), "exhibition", null);
        setField(term392633, term392633.getClass(), "layerPanel", null);
        term392639 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.self.TodoSelf");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term392639;
        callMethod(klass, "setActive", argTypes, term392633, args);
    }

};


