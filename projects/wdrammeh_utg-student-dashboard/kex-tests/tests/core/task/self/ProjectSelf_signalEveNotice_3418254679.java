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

public class ProjectSelf_signalEveNotice_3418254679 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term246560;

    public ProjectSelf_signalEveNotice_3418254679() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term246560 = newInstance(Class.forName("core.task.self.ProjectSelf"));
        setField(term246560, term246560.getClass(), "projectName", null);
        setField(term246560, term246560.getClass(), "type", null);
        setField(term246560, term246560.getClass(), "startDate", null);
        setIntField(term246560, term246560.getClass(), "specifiedDuration", 0);
        setIntField(term246560, term246560.getClass(), "totalTimeConsumed", 0);
        setBooleanField(term246560, term246560.getClass(), "isLive", false);
        setField(term246560, term246560.getClass(), "timer", null);
        setField(term246560, term246560.getClass(), "dateExpectedToComplete", null);
        setField(term246560, term246560.getClass(), "dateCompleted", null);
        setBooleanField(term246560, term246560.getClass(), "eveIsAlerted", false);
        setBooleanField(term246560, term246560.getClass(), "completionIsAlerted", false);
        setField(term246560, term246560.getClass(), "exhibition", null);
        setField(term246560, term246560.getClass(), "terminationButton", null);
        setField(term246560, term246560.getClass(), "completionButton", null);
        setField(term246560, term246560.getClass(), "moreOptions", null);
        setField(term246560, term246560.getClass(), "projectProgression", null);
        setField(term246560, term246560.getClass(), "progressLabelPercentage", null);
        setField(term246560, term246560.getClass(), "projectLayer", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.self.ProjectSelf");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "signalEveNotice", argTypes, term246560, args);
    }

};


