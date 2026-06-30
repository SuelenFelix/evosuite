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
     Object term36108;
     Object term36114;

    public ProjectSelf_initializeTimer_18272275063() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36108 = newInstance(Class.forName("core.task.self.ProjectSelf"));
        setField(term36108, term36108.getClass(), "projectName", null);
        setField(term36108, term36108.getClass(), "type", null);
        setField(term36108, term36108.getClass(), "startDate", null);
        setIntField(term36108, term36108.getClass(), "specifiedDuration", 0);
        setIntField(term36108, term36108.getClass(), "totalTimeConsumed", 0);
        setBooleanField(term36108, term36108.getClass(), "isLive", false);
        setField(term36108, term36108.getClass(), "timer", null);
        setField(term36108, term36108.getClass(), "dateExpectedToComplete", null);
        setField(term36108, term36108.getClass(), "dateCompleted", null);
        setBooleanField(term36108, term36108.getClass(), "eveIsAlerted", false);
        setBooleanField(term36108, term36108.getClass(), "completionIsAlerted", false);
        setField(term36108, term36108.getClass(), "exhibition", null);
        setField(term36108, term36108.getClass(), "terminationButton", null);
        setField(term36108, term36108.getClass(), "completionButton", null);
        setField(term36108, term36108.getClass(), "moreOptions", null);
        setField(term36108, term36108.getClass(), "projectProgression", null);
        setField(term36108, term36108.getClass(), "progressLabelPercentage", null);
        setField(term36108, term36108.getClass(), "projectLayer", null);
        term36114 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.self.ProjectSelf");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term36114;
        callMethod(klass, "initializeTimer", argTypes, term36108, args);
    }

};


