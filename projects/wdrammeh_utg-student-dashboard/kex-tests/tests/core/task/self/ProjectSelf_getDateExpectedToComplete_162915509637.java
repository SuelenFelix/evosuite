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
     Object term265117;

    public ProjectSelf_getDateExpectedToComplete_162915509637() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term265117 = newInstance(Class.forName("core.task.self.ProjectSelf"));
        setField(term265117, term265117.getClass(), "projectName", null);
        setField(term265117, term265117.getClass(), "type", null);
        setField(term265117, term265117.getClass(), "startDate", null);
        setIntField(term265117, term265117.getClass(), "specifiedDuration", 0);
        setIntField(term265117, term265117.getClass(), "totalTimeConsumed", 0);
        setBooleanField(term265117, term265117.getClass(), "isLive", false);
        setField(term265117, term265117.getClass(), "timer", null);
        setField(term265117, term265117.getClass(), "dateExpectedToComplete", null);
        setField(term265117, term265117.getClass(), "dateCompleted", null);
        setBooleanField(term265117, term265117.getClass(), "eveIsAlerted", false);
        setBooleanField(term265117, term265117.getClass(), "completionIsAlerted", false);
        setField(term265117, term265117.getClass(), "exhibition", null);
        setField(term265117, term265117.getClass(), "terminationButton", null);
        setField(term265117, term265117.getClass(), "completionButton", null);
        setField(term265117, term265117.getClass(), "moreOptions", null);
        setField(term265117, term265117.getClass(), "projectProgression", null);
        setField(term265117, term265117.getClass(), "progressLabelPercentage", null);
        setField(term265117, term265117.getClass(), "projectLayer", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.self.ProjectSelf");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDateExpectedToComplete", argTypes, term265117, args);
    }

};


