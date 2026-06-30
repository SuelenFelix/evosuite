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
     Object term95096;
     Object term95102;

    public TodoSelf_setTotalTimeConsumed_85652587334() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term95096 = newInstance(Class.forName("core.task.self.TodoSelf"));
        setField(term95096, term95096.getClass(), "description", null);
        setField(term95096, term95096.getClass(), "startDate", null);
        setIntField(term95096, term95096.getClass(), "specifiedDuration", 0);
        setIntField(term95096, term95096.getClass(), "totalTimeConsumed", 0);
        setBooleanField(term95096, term95096.getClass(), "isActive", false);
        setField(term95096, term95096.getClass(), "dateExpectedToComplete", null);
        setField(term95096, term95096.getClass(), "dateCompleted", null);
        setField(term95096, term95096.getClass(), "timer", null);
        setBooleanField(term95096, term95096.getClass(), "eveIsAlerted", false);
        setBooleanField(term95096, term95096.getClass(), "doneIsAlerted", false);
        setField(term95096, term95096.getClass(), "togoLabel", null);
        setField(term95096, term95096.getClass(), "exhibition", null);
        setField(term95096, term95096.getClass(), "layerPanel", null);
        term95102 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.self.TodoSelf");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term95102;
        callMethod(klass, "setTotalTimeConsumed", argTypes, term95096, args);
    }

};


