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

public class ProjectSelf_getDateExpectedToComplete_162915509637 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58570;

    public ProjectSelf_getDateExpectedToComplete_162915509637() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term58570 = newInstance(Class.forName("core.task.self.ProjectSelf"));
        setField(term58570, term58570.getClass(), "projectName", null);
        setField(term58570, term58570.getClass(), "type", null);
        setField(term58570, term58570.getClass(), "startDate", null);
        setIntField(term58570, term58570.getClass(), "specifiedDuration", 0);
        setIntField(term58570, term58570.getClass(), "totalTimeConsumed", 0);
        setBooleanField(term58570, term58570.getClass(), "isLive", false);
        setField(term58570, term58570.getClass(), "timer", null);
        setField(term58570, term58570.getClass(), "dateExpectedToComplete", null);
        setField(term58570, term58570.getClass(), "dateCompleted", null);
        setBooleanField(term58570, term58570.getClass(), "eveIsAlerted", false);
        setBooleanField(term58570, term58570.getClass(), "completionIsAlerted", false);
        setField(term58570, term58570.getClass(), "exhibition", null);
        setField(term58570, term58570.getClass(), "terminationButton", null);
        setField(term58570, term58570.getClass(), "completionButton", null);
        setField(term58570, term58570.getClass(), "moreOptions", null);
        setField(term58570, term58570.getClass(), "projectProgression", null);
        setField(term58570, term58570.getClass(), "progressLabelPercentage", null);
        setField(term58570, term58570.getClass(), "projectLayer", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.self.ProjectSelf");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDateExpectedToComplete", argTypes, term58570, args);
    }

};


