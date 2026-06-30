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

public class ProjectSelf_isLive_91465245521 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47963;

    public ProjectSelf_isLive_91465245521() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47963 = newInstance(Class.forName("core.task.self.ProjectSelf"));
        setField(term47963, term47963.getClass(), "projectName", null);
        setField(term47963, term47963.getClass(), "type", null);
        setField(term47963, term47963.getClass(), "startDate", null);
        setIntField(term47963, term47963.getClass(), "specifiedDuration", 0);
        setIntField(term47963, term47963.getClass(), "totalTimeConsumed", 0);
        setBooleanField(term47963, term47963.getClass(), "isLive", false);
        setField(term47963, term47963.getClass(), "timer", null);
        setField(term47963, term47963.getClass(), "dateExpectedToComplete", null);
        setField(term47963, term47963.getClass(), "dateCompleted", null);
        setBooleanField(term47963, term47963.getClass(), "eveIsAlerted", false);
        setBooleanField(term47963, term47963.getClass(), "completionIsAlerted", false);
        setField(term47963, term47963.getClass(), "exhibition", null);
        setField(term47963, term47963.getClass(), "terminationButton", null);
        setField(term47963, term47963.getClass(), "completionButton", null);
        setField(term47963, term47963.getClass(), "moreOptions", null);
        setField(term47963, term47963.getClass(), "projectProgression", null);
        setField(term47963, term47963.getClass(), "progressLabelPercentage", null);
        setField(term47963, term47963.getClass(), "projectLayer", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.self.ProjectSelf");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isLive", argTypes, term47963, args);
    }

};


