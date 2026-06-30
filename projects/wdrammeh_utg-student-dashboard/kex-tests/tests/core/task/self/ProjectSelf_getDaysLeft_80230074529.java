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

public class ProjectSelf_getDaysLeft_80230074529 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53360;

    public ProjectSelf_getDaysLeft_80230074529() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53360 = newInstance(Class.forName("core.task.self.ProjectSelf"));
        setField(term53360, term53360.getClass(), "projectName", null);
        setField(term53360, term53360.getClass(), "type", null);
        setField(term53360, term53360.getClass(), "startDate", null);
        setIntField(term53360, term53360.getClass(), "specifiedDuration", 0);
        setIntField(term53360, term53360.getClass(), "totalTimeConsumed", 0);
        setBooleanField(term53360, term53360.getClass(), "isLive", false);
        setField(term53360, term53360.getClass(), "timer", null);
        setField(term53360, term53360.getClass(), "dateExpectedToComplete", null);
        setField(term53360, term53360.getClass(), "dateCompleted", null);
        setBooleanField(term53360, term53360.getClass(), "eveIsAlerted", false);
        setBooleanField(term53360, term53360.getClass(), "completionIsAlerted", false);
        setField(term53360, term53360.getClass(), "exhibition", null);
        setField(term53360, term53360.getClass(), "terminationButton", null);
        setField(term53360, term53360.getClass(), "completionButton", null);
        setField(term53360, term53360.getClass(), "moreOptions", null);
        setField(term53360, term53360.getClass(), "projectProgression", null);
        setField(term53360, term53360.getClass(), "progressLabelPercentage", null);
        setField(term53360, term53360.getClass(), "projectLayer", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.self.ProjectSelf");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDaysLeft", argTypes, term53360, args);
    }

};


