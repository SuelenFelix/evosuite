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

public class TodoSelf_wakeAlive_121860639943 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term95154;

    public TodoSelf_wakeAlive_121860639943() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term95154 = newInstance(Class.forName("core.task.self.TodoSelf"));
        setField(term95154, term95154.getClass(), "description", null);
        setField(term95154, term95154.getClass(), "startDate", null);
        setIntField(term95154, term95154.getClass(), "specifiedDuration", 0);
        setIntField(term95154, term95154.getClass(), "totalTimeConsumed", 0);
        setBooleanField(term95154, term95154.getClass(), "isActive", false);
        setField(term95154, term95154.getClass(), "dateExpectedToComplete", null);
        setField(term95154, term95154.getClass(), "dateCompleted", null);
        setField(term95154, term95154.getClass(), "timer", null);
        setBooleanField(term95154, term95154.getClass(), "eveIsAlerted", false);
        setBooleanField(term95154, term95154.getClass(), "doneIsAlerted", false);
        setField(term95154, term95154.getClass(), "togoLabel", null);
        setField(term95154, term95154.getClass(), "exhibition", null);
        setField(term95154, term95154.getClass(), "layerPanel", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.self.TodoSelf");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "wakeAlive", argTypes, term95154, args);
    }

};


