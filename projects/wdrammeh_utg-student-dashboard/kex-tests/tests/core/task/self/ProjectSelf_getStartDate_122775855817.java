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

public class ProjectSelf_getStartDate_122775855817 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45231;

    public ProjectSelf_getStartDate_122775855817() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45231 = newInstance(Class.forName("core.task.self.ProjectSelf"));
        setField(term45231, term45231.getClass(), "projectName", null);
        setField(term45231, term45231.getClass(), "type", null);
        setField(term45231, term45231.getClass(), "startDate", null);
        setIntField(term45231, term45231.getClass(), "specifiedDuration", 0);
        setIntField(term45231, term45231.getClass(), "totalTimeConsumed", 0);
        setBooleanField(term45231, term45231.getClass(), "isLive", false);
        setField(term45231, term45231.getClass(), "timer", null);
        setField(term45231, term45231.getClass(), "dateExpectedToComplete", null);
        setField(term45231, term45231.getClass(), "dateCompleted", null);
        setBooleanField(term45231, term45231.getClass(), "eveIsAlerted", false);
        setBooleanField(term45231, term45231.getClass(), "completionIsAlerted", false);
        setField(term45231, term45231.getClass(), "exhibition", null);
        setField(term45231, term45231.getClass(), "terminationButton", null);
        setField(term45231, term45231.getClass(), "completionButton", null);
        setField(term45231, term45231.getClass(), "moreOptions", null);
        setField(term45231, term45231.getClass(), "projectProgression", null);
        setField(term45231, term45231.getClass(), "progressLabelPercentage", null);
        setField(term45231, term45231.getClass(), "projectLayer", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.self.ProjectSelf");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStartDate", argTypes, term45231, args);
    }

};


