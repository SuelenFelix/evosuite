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
     Object term259724;

    public ProjectSelf_getDaysLeft_80230074529() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term259724 = newInstance(Class.forName("core.task.self.ProjectSelf"));
        setField(term259724, term259724.getClass(), "projectName", null);
        setField(term259724, term259724.getClass(), "type", null);
        setField(term259724, term259724.getClass(), "startDate", null);
        setIntField(term259724, term259724.getClass(), "specifiedDuration", 0);
        setIntField(term259724, term259724.getClass(), "totalTimeConsumed", 0);
        setBooleanField(term259724, term259724.getClass(), "isLive", false);
        setField(term259724, term259724.getClass(), "timer", null);
        setField(term259724, term259724.getClass(), "dateExpectedToComplete", null);
        setField(term259724, term259724.getClass(), "dateCompleted", null);
        setBooleanField(term259724, term259724.getClass(), "eveIsAlerted", false);
        setBooleanField(term259724, term259724.getClass(), "completionIsAlerted", false);
        setField(term259724, term259724.getClass(), "exhibition", null);
        setField(term259724, term259724.getClass(), "terminationButton", null);
        setField(term259724, term259724.getClass(), "completionButton", null);
        setField(term259724, term259724.getClass(), "moreOptions", null);
        setField(term259724, term259724.getClass(), "projectProgression", null);
        setField(term259724, term259724.getClass(), "progressLabelPercentage", null);
        setField(term259724, term259724.getClass(), "projectLayer", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.self.ProjectSelf");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDaysLeft", argTypes, term259724, args);
    }

};


