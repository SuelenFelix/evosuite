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

public class ProjectSelf_getTotalTimeConsumed_13822233033 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term262402;

    public ProjectSelf_getTotalTimeConsumed_13822233033() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term262402 = newInstance(Class.forName("core.task.self.ProjectSelf"));
        setField(term262402, term262402.getClass(), "projectName", null);
        setField(term262402, term262402.getClass(), "type", null);
        setField(term262402, term262402.getClass(), "startDate", null);
        setIntField(term262402, term262402.getClass(), "specifiedDuration", 0);
        setIntField(term262402, term262402.getClass(), "totalTimeConsumed", 0);
        setBooleanField(term262402, term262402.getClass(), "isLive", false);
        setField(term262402, term262402.getClass(), "timer", null);
        setField(term262402, term262402.getClass(), "dateExpectedToComplete", null);
        setField(term262402, term262402.getClass(), "dateCompleted", null);
        setBooleanField(term262402, term262402.getClass(), "eveIsAlerted", false);
        setBooleanField(term262402, term262402.getClass(), "completionIsAlerted", false);
        setField(term262402, term262402.getClass(), "exhibition", null);
        setField(term262402, term262402.getClass(), "terminationButton", null);
        setField(term262402, term262402.getClass(), "completionButton", null);
        setField(term262402, term262402.getClass(), "moreOptions", null);
        setField(term262402, term262402.getClass(), "projectProgression", null);
        setField(term262402, term262402.getClass(), "progressLabelPercentage", null);
        setField(term262402, term262402.getClass(), "projectLayer", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.self.ProjectSelf");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalTimeConsumed", argTypes, term262402, args);
    }

};


