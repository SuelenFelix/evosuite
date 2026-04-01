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

public class ProjectSelf_wakeDead_166139567943 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term269113;

    public ProjectSelf_wakeDead_166139567943() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term269113 = newInstance(Class.forName("core.task.self.ProjectSelf"));
        setField(term269113, term269113.getClass(), "projectName", null);
        setField(term269113, term269113.getClass(), "type", null);
        setField(term269113, term269113.getClass(), "startDate", null);
        setIntField(term269113, term269113.getClass(), "specifiedDuration", 0);
        setIntField(term269113, term269113.getClass(), "totalTimeConsumed", 0);
        setBooleanField(term269113, term269113.getClass(), "isLive", false);
        setField(term269113, term269113.getClass(), "timer", null);
        setField(term269113, term269113.getClass(), "dateExpectedToComplete", null);
        setField(term269113, term269113.getClass(), "dateCompleted", null);
        setBooleanField(term269113, term269113.getClass(), "eveIsAlerted", false);
        setBooleanField(term269113, term269113.getClass(), "completionIsAlerted", false);
        setField(term269113, term269113.getClass(), "exhibition", null);
        setField(term269113, term269113.getClass(), "terminationButton", null);
        setField(term269113, term269113.getClass(), "completionButton", null);
        setField(term269113, term269113.getClass(), "moreOptions", null);
        setField(term269113, term269113.getClass(), "projectProgression", null);
        setField(term269113, term269113.getClass(), "progressLabelPercentage", null);
        setField(term269113, term269113.getClass(), "projectLayer", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.self.ProjectSelf");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "wakeDead", argTypes, term269113, args);
    }

};


