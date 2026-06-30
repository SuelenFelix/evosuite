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

public class ProjectSelf_signalCompletionNotice_141082478711 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41367;

    public ProjectSelf_signalCompletionNotice_141082478711() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41367 = newInstance(Class.forName("core.task.self.ProjectSelf"));
        setField(term41367, term41367.getClass(), "projectName", null);
        setField(term41367, term41367.getClass(), "type", null);
        setField(term41367, term41367.getClass(), "startDate", null);
        setIntField(term41367, term41367.getClass(), "specifiedDuration", 0);
        setIntField(term41367, term41367.getClass(), "totalTimeConsumed", 0);
        setBooleanField(term41367, term41367.getClass(), "isLive", false);
        setField(term41367, term41367.getClass(), "timer", null);
        setField(term41367, term41367.getClass(), "dateExpectedToComplete", null);
        setField(term41367, term41367.getClass(), "dateCompleted", null);
        setBooleanField(term41367, term41367.getClass(), "eveIsAlerted", false);
        setBooleanField(term41367, term41367.getClass(), "completionIsAlerted", false);
        setField(term41367, term41367.getClass(), "exhibition", null);
        setField(term41367, term41367.getClass(), "terminationButton", null);
        setField(term41367, term41367.getClass(), "completionButton", null);
        setField(term41367, term41367.getClass(), "moreOptions", null);
        setField(term41367, term41367.getClass(), "projectProgression", null);
        setField(term41367, term41367.getClass(), "progressLabelPercentage", null);
        setField(term41367, term41367.getClass(), "projectLayer", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.self.ProjectSelf");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "signalCompletionNotice", argTypes, term41367, args);
    }

};


