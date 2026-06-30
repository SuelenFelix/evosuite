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

public class ProjectSelf_getSpecifiedDuration_128753624119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46552;

    public ProjectSelf_getSpecifiedDuration_128753624119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term46552 = newInstance(Class.forName("core.task.self.ProjectSelf"));
        setField(term46552, term46552.getClass(), "projectName", null);
        setField(term46552, term46552.getClass(), "type", null);
        setField(term46552, term46552.getClass(), "startDate", null);
        setIntField(term46552, term46552.getClass(), "specifiedDuration", 0);
        setIntField(term46552, term46552.getClass(), "totalTimeConsumed", 0);
        setBooleanField(term46552, term46552.getClass(), "isLive", false);
        setField(term46552, term46552.getClass(), "timer", null);
        setField(term46552, term46552.getClass(), "dateExpectedToComplete", null);
        setField(term46552, term46552.getClass(), "dateCompleted", null);
        setBooleanField(term46552, term46552.getClass(), "eveIsAlerted", false);
        setBooleanField(term46552, term46552.getClass(), "completionIsAlerted", false);
        setField(term46552, term46552.getClass(), "exhibition", null);
        setField(term46552, term46552.getClass(), "terminationButton", null);
        setField(term46552, term46552.getClass(), "completionButton", null);
        setField(term46552, term46552.getClass(), "moreOptions", null);
        setField(term46552, term46552.getClass(), "projectProgression", null);
        setField(term46552, term46552.getClass(), "progressLabelPercentage", null);
        setField(term46552, term46552.getClass(), "projectLayer", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.self.ProjectSelf");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSpecifiedDuration", argTypes, term46552, args);
    }

};


