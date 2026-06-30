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

public class ProjectSelf_wakeDead_166139567943 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62380;

    public ProjectSelf_wakeDead_166139567943() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term62380 = newInstance(Class.forName("core.task.self.ProjectSelf"));
        setField(term62380, term62380.getClass(), "projectName", null);
        setField(term62380, term62380.getClass(), "type", null);
        setField(term62380, term62380.getClass(), "startDate", null);
        setIntField(term62380, term62380.getClass(), "specifiedDuration", 0);
        setIntField(term62380, term62380.getClass(), "totalTimeConsumed", 0);
        setBooleanField(term62380, term62380.getClass(), "isLive", false);
        setField(term62380, term62380.getClass(), "timer", null);
        setField(term62380, term62380.getClass(), "dateExpectedToComplete", null);
        setField(term62380, term62380.getClass(), "dateCompleted", null);
        setBooleanField(term62380, term62380.getClass(), "eveIsAlerted", false);
        setBooleanField(term62380, term62380.getClass(), "completionIsAlerted", false);
        setField(term62380, term62380.getClass(), "exhibition", null);
        setField(term62380, term62380.getClass(), "terminationButton", null);
        setField(term62380, term62380.getClass(), "completionButton", null);
        setField(term62380, term62380.getClass(), "moreOptions", null);
        setField(term62380, term62380.getClass(), "projectProgression", null);
        setField(term62380, term62380.getClass(), "progressLabelPercentage", null);
        setField(term62380, term62380.getClass(), "projectLayer", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.self.ProjectSelf");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "wakeDead", argTypes, term62380, args);
    }

};


