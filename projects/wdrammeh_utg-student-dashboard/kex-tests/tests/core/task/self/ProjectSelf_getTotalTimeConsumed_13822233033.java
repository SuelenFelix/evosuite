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
     Object term55936;

    public ProjectSelf_getTotalTimeConsumed_13822233033() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term55936 = newInstance(Class.forName("core.task.self.ProjectSelf"));
        setField(term55936, term55936.getClass(), "projectName", null);
        setField(term55936, term55936.getClass(), "type", null);
        setField(term55936, term55936.getClass(), "startDate", null);
        setIntField(term55936, term55936.getClass(), "specifiedDuration", 0);
        setIntField(term55936, term55936.getClass(), "totalTimeConsumed", 0);
        setBooleanField(term55936, term55936.getClass(), "isLive", false);
        setField(term55936, term55936.getClass(), "timer", null);
        setField(term55936, term55936.getClass(), "dateExpectedToComplete", null);
        setField(term55936, term55936.getClass(), "dateCompleted", null);
        setBooleanField(term55936, term55936.getClass(), "eveIsAlerted", false);
        setBooleanField(term55936, term55936.getClass(), "completionIsAlerted", false);
        setField(term55936, term55936.getClass(), "exhibition", null);
        setField(term55936, term55936.getClass(), "terminationButton", null);
        setField(term55936, term55936.getClass(), "completionButton", null);
        setField(term55936, term55936.getClass(), "moreOptions", null);
        setField(term55936, term55936.getClass(), "projectProgression", null);
        setField(term55936, term55936.getClass(), "progressLabelPercentage", null);
        setField(term55936, term55936.getClass(), "projectLayer", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.self.ProjectSelf");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalTimeConsumed", argTypes, term55936, args);
    }

};


