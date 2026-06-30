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

public class ProjectSelf_getLayer_70802598239 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59834;

    public ProjectSelf_getLayer_70802598239() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term59834 = newInstance(Class.forName("core.task.self.ProjectSelf"));
        setField(term59834, term59834.getClass(), "projectName", null);
        setField(term59834, term59834.getClass(), "type", null);
        setField(term59834, term59834.getClass(), "startDate", null);
        setIntField(term59834, term59834.getClass(), "specifiedDuration", 0);
        setIntField(term59834, term59834.getClass(), "totalTimeConsumed", 0);
        setBooleanField(term59834, term59834.getClass(), "isLive", false);
        setField(term59834, term59834.getClass(), "timer", null);
        setField(term59834, term59834.getClass(), "dateExpectedToComplete", null);
        setField(term59834, term59834.getClass(), "dateCompleted", null);
        setBooleanField(term59834, term59834.getClass(), "eveIsAlerted", false);
        setBooleanField(term59834, term59834.getClass(), "completionIsAlerted", false);
        setField(term59834, term59834.getClass(), "exhibition", null);
        setField(term59834, term59834.getClass(), "terminationButton", null);
        setField(term59834, term59834.getClass(), "completionButton", null);
        setField(term59834, term59834.getClass(), "moreOptions", null);
        setField(term59834, term59834.getClass(), "projectProgression", null);
        setField(term59834, term59834.getClass(), "progressLabelPercentage", null);
        setField(term59834, term59834.getClass(), "projectLayer", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.self.ProjectSelf");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLayer", argTypes, term59834, args);
    }

};


