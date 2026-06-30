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

public class ProjectSelf_initializeUI_15832816275 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37464;

    public ProjectSelf_initializeUI_15832816275() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37464 = newInstance(Class.forName("core.task.self.ProjectSelf"));
        setField(term37464, term37464.getClass(), "projectName", null);
        setField(term37464, term37464.getClass(), "type", null);
        setField(term37464, term37464.getClass(), "startDate", null);
        setIntField(term37464, term37464.getClass(), "specifiedDuration", 0);
        setIntField(term37464, term37464.getClass(), "totalTimeConsumed", 0);
        setBooleanField(term37464, term37464.getClass(), "isLive", false);
        setField(term37464, term37464.getClass(), "timer", null);
        setField(term37464, term37464.getClass(), "dateExpectedToComplete", null);
        setField(term37464, term37464.getClass(), "dateCompleted", null);
        setBooleanField(term37464, term37464.getClass(), "eveIsAlerted", false);
        setBooleanField(term37464, term37464.getClass(), "completionIsAlerted", false);
        setField(term37464, term37464.getClass(), "exhibition", null);
        setField(term37464, term37464.getClass(), "terminationButton", null);
        setField(term37464, term37464.getClass(), "completionButton", null);
        setField(term37464, term37464.getClass(), "moreOptions", null);
        setField(term37464, term37464.getClass(), "projectProgression", null);
        setField(term37464, term37464.getClass(), "progressLabelPercentage", null);
        setField(term37464, term37464.getClass(), "projectLayer", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.self.ProjectSelf");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "initializeUI", argTypes, term37464, args);
    }

};


