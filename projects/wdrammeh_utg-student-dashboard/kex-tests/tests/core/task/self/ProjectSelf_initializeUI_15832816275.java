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

public class ProjectSelf_initializeUI_15832816275 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term243906;

    public ProjectSelf_initializeUI_15832816275() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term243906 = newInstance(Class.forName("core.task.self.ProjectSelf"));
        setField(term243906, term243906.getClass(), "projectName", null);
        setField(term243906, term243906.getClass(), "type", null);
        setField(term243906, term243906.getClass(), "startDate", null);
        setIntField(term243906, term243906.getClass(), "specifiedDuration", 0);
        setIntField(term243906, term243906.getClass(), "totalTimeConsumed", 0);
        setBooleanField(term243906, term243906.getClass(), "isLive", false);
        setField(term243906, term243906.getClass(), "timer", null);
        setField(term243906, term243906.getClass(), "dateExpectedToComplete", null);
        setField(term243906, term243906.getClass(), "dateCompleted", null);
        setBooleanField(term243906, term243906.getClass(), "eveIsAlerted", false);
        setBooleanField(term243906, term243906.getClass(), "completionIsAlerted", false);
        setField(term243906, term243906.getClass(), "exhibition", null);
        setField(term243906, term243906.getClass(), "terminationButton", null);
        setField(term243906, term243906.getClass(), "completionButton", null);
        setField(term243906, term243906.getClass(), "moreOptions", null);
        setField(term243906, term243906.getClass(), "projectProgression", null);
        setField(term243906, term243906.getClass(), "progressLabelPercentage", null);
        setField(term243906, term243906.getClass(), "projectLayer", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.self.ProjectSelf");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "initializeUI", argTypes, term243906, args);
    }

};


