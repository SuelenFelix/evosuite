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
     Object term270377;

    public ProjectSelf_export_20044368445() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term270377 = newInstance(Class.forName("core.task.self.ProjectSelf"));
        setField(term270377, term270377.getClass(), "projectName", null);
        setField(term270377, term270377.getClass(), "type", null);
        setField(term270377, term270377.getClass(), "startDate", null);
        setIntField(term270377, term270377.getClass(), "specifiedDuration", 0);
        setIntField(term270377, term270377.getClass(), "totalTimeConsumed", 0);
        setBooleanField(term270377, term270377.getClass(), "isLive", false);
        setField(term270377, term270377.getClass(), "timer", null);
        setField(term270377, term270377.getClass(), "dateExpectedToComplete", null);
        setField(term270377, term270377.getClass(), "dateCompleted", null);
        setBooleanField(term270377, term270377.getClass(), "eveIsAlerted", false);
        setBooleanField(term270377, term270377.getClass(), "completionIsAlerted", false);
        setField(term270377, term270377.getClass(), "exhibition", null);
        setField(term270377, term270377.getClass(), "terminationButton", null);
        setField(term270377, term270377.getClass(), "completionButton", null);
        setField(term270377, term270377.getClass(), "moreOptions", null);
        setField(term270377, term270377.getClass(), "projectProgression", null);
        setField(term270377, term270377.getClass(), "progressLabelPercentage", null);
        setField(term270377, term270377.getClass(), "projectLayer", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.self.ProjectSelf");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "export", argTypes, term270377, args);
    }

};


