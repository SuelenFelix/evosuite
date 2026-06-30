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

public class ProjectSelf_export_20044368445 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63629;

    public ProjectSelf_export_20044368445() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term63629 = newInstance(Class.forName("core.task.self.ProjectSelf"));
        setField(term63629, term63629.getClass(), "projectName", null);
        setField(term63629, term63629.getClass(), "type", null);
        setField(term63629, term63629.getClass(), "startDate", null);
        setIntField(term63629, term63629.getClass(), "specifiedDuration", 0);
        setIntField(term63629, term63629.getClass(), "totalTimeConsumed", 0);
        setBooleanField(term63629, term63629.getClass(), "isLive", false);
        setField(term63629, term63629.getClass(), "timer", null);
        setField(term63629, term63629.getClass(), "dateExpectedToComplete", null);
        setField(term63629, term63629.getClass(), "dateCompleted", null);
        setBooleanField(term63629, term63629.getClass(), "eveIsAlerted", false);
        setBooleanField(term63629, term63629.getClass(), "completionIsAlerted", false);
        setField(term63629, term63629.getClass(), "exhibition", null);
        setField(term63629, term63629.getClass(), "terminationButton", null);
        setField(term63629, term63629.getClass(), "completionButton", null);
        setField(term63629, term63629.getClass(), "moreOptions", null);
        setField(term63629, term63629.getClass(), "projectProgression", null);
        setField(term63629, term63629.getClass(), "progressLabelPercentage", null);
        setField(term63629, term63629.getClass(), "projectLayer", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.self.ProjectSelf");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "export", argTypes, term63629, args);
    }

};


