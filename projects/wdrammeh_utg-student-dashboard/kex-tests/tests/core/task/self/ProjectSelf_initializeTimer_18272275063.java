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

public class ProjectSelf_initializeTimer_18272275063 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term242505;
     Object term242511;

    public ProjectSelf_initializeTimer_18272275063() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term242505 = newInstance(Class.forName("core.task.self.ProjectSelf"));
        setField(term242505, term242505.getClass(), "projectName", null);
        setField(term242505, term242505.getClass(), "type", null);
        setField(term242505, term242505.getClass(), "startDate", null);
        setIntField(term242505, term242505.getClass(), "specifiedDuration", 0);
        setIntField(term242505, term242505.getClass(), "totalTimeConsumed", 0);
        setBooleanField(term242505, term242505.getClass(), "isLive", false);
        setField(term242505, term242505.getClass(), "timer", null);
        setField(term242505, term242505.getClass(), "dateExpectedToComplete", null);
        setField(term242505, term242505.getClass(), "dateCompleted", null);
        setBooleanField(term242505, term242505.getClass(), "eveIsAlerted", false);
        setBooleanField(term242505, term242505.getClass(), "completionIsAlerted", false);
        setField(term242505, term242505.getClass(), "exhibition", null);
        setField(term242505, term242505.getClass(), "terminationButton", null);
        setField(term242505, term242505.getClass(), "completionButton", null);
        setField(term242505, term242505.getClass(), "moreOptions", null);
        setField(term242505, term242505.getClass(), "projectProgression", null);
        setField(term242505, term242505.getClass(), "progressLabelPercentage", null);
        setField(term242505, term242505.getClass(), "projectLayer", null);
        term242511 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.self.ProjectSelf");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term242511;
        callMethod(klass, "initializeTimer", argTypes, term242505, args);
    }

};


