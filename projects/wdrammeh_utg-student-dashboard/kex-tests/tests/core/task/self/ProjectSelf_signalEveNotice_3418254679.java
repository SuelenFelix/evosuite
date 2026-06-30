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
     Object term40076;

    public ProjectSelf_signalEveNotice_3418254679() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term40076 = newInstance(Class.forName("core.task.self.ProjectSelf"));
        setField(term40076, term40076.getClass(), "projectName", null);
        setField(term40076, term40076.getClass(), "type", null);
        setField(term40076, term40076.getClass(), "startDate", null);
        setIntField(term40076, term40076.getClass(), "specifiedDuration", 0);
        setIntField(term40076, term40076.getClass(), "totalTimeConsumed", 0);
        setBooleanField(term40076, term40076.getClass(), "isLive", false);
        setField(term40076, term40076.getClass(), "timer", null);
        setField(term40076, term40076.getClass(), "dateExpectedToComplete", null);
        setField(term40076, term40076.getClass(), "dateCompleted", null);
        setBooleanField(term40076, term40076.getClass(), "eveIsAlerted", false);
        setBooleanField(term40076, term40076.getClass(), "completionIsAlerted", false);
        setField(term40076, term40076.getClass(), "exhibition", null);
        setField(term40076, term40076.getClass(), "terminationButton", null);
        setField(term40076, term40076.getClass(), "completionButton", null);
        setField(term40076, term40076.getClass(), "moreOptions", null);
        setField(term40076, term40076.getClass(), "projectProgression", null);
        setField(term40076, term40076.getClass(), "progressLabelPercentage", null);
        setField(term40076, term40076.getClass(), "projectLayer", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.self.ProjectSelf");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "signalEveNotice", argTypes, term40076, args);
    }

};


