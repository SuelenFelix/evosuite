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

public class ProjectSelf_getDateCompleted_184820456125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50648;

    public ProjectSelf_getDateCompleted_184820456125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50648 = newInstance(Class.forName("core.task.self.ProjectSelf"));
        setField(term50648, term50648.getClass(), "projectName", null);
        setField(term50648, term50648.getClass(), "type", null);
        setField(term50648, term50648.getClass(), "startDate", null);
        setIntField(term50648, term50648.getClass(), "specifiedDuration", 0);
        setIntField(term50648, term50648.getClass(), "totalTimeConsumed", 0);
        setBooleanField(term50648, term50648.getClass(), "isLive", false);
        setField(term50648, term50648.getClass(), "timer", null);
        setField(term50648, term50648.getClass(), "dateExpectedToComplete", null);
        setField(term50648, term50648.getClass(), "dateCompleted", null);
        setBooleanField(term50648, term50648.getClass(), "eveIsAlerted", false);
        setBooleanField(term50648, term50648.getClass(), "completionIsAlerted", false);
        setField(term50648, term50648.getClass(), "exhibition", null);
        setField(term50648, term50648.getClass(), "terminationButton", null);
        setField(term50648, term50648.getClass(), "completionButton", null);
        setField(term50648, term50648.getClass(), "moreOptions", null);
        setField(term50648, term50648.getClass(), "projectProgression", null);
        setField(term50648, term50648.getClass(), "progressLabelPercentage", null);
        setField(term50648, term50648.getClass(), "projectLayer", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.self.ProjectSelf");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDateCompleted", argTypes, term50648, args);
    }

};


