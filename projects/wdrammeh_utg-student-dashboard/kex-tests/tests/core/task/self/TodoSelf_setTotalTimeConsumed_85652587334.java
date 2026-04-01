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
import java.lang.Integer;

public class TodoSelf_setTotalTimeConsumed_85652587334 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term392607;
     Object term392613;

    public TodoSelf_setTotalTimeConsumed_85652587334() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term392607 = newInstance(Class.forName("core.task.self.TodoSelf"));
        setField(term392607, term392607.getClass(), "description", null);
        setField(term392607, term392607.getClass(), "startDate", null);
        setIntField(term392607, term392607.getClass(), "specifiedDuration", 0);
        setIntField(term392607, term392607.getClass(), "totalTimeConsumed", 0);
        setBooleanField(term392607, term392607.getClass(), "isActive", false);
        setField(term392607, term392607.getClass(), "dateExpectedToComplete", null);
        setField(term392607, term392607.getClass(), "dateCompleted", null);
        setField(term392607, term392607.getClass(), "timer", null);
        setBooleanField(term392607, term392607.getClass(), "eveIsAlerted", false);
        setBooleanField(term392607, term392607.getClass(), "doneIsAlerted", false);
        setField(term392607, term392607.getClass(), "togoLabel", null);
        setField(term392607, term392607.getClass(), "exhibition", null);
        setField(term392607, term392607.getClass(), "layerPanel", null);
        term392613 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.self.TodoSelf");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term392613;
        callMethod(klass, "setTotalTimeConsumed", argTypes, term392607, args);
    }

};


