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

public class ProjectSelf_isLive_91465245521 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term254321;

    public ProjectSelf_isLive_91465245521() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term254321 = newInstance(Class.forName("core.task.self.ProjectSelf"));
        setField(term254321, term254321.getClass(), "projectName", null);
        setField(term254321, term254321.getClass(), "type", null);
        setField(term254321, term254321.getClass(), "startDate", null);
        setIntField(term254321, term254321.getClass(), "specifiedDuration", 0);
        setIntField(term254321, term254321.getClass(), "totalTimeConsumed", 0);
        setBooleanField(term254321, term254321.getClass(), "isLive", false);
        setField(term254321, term254321.getClass(), "timer", null);
        setField(term254321, term254321.getClass(), "dateExpectedToComplete", null);
        setField(term254321, term254321.getClass(), "dateCompleted", null);
        setBooleanField(term254321, term254321.getClass(), "eveIsAlerted", false);
        setBooleanField(term254321, term254321.getClass(), "completionIsAlerted", false);
        setField(term254321, term254321.getClass(), "exhibition", null);
        setField(term254321, term254321.getClass(), "terminationButton", null);
        setField(term254321, term254321.getClass(), "completionButton", null);
        setField(term254321, term254321.getClass(), "moreOptions", null);
        setField(term254321, term254321.getClass(), "projectProgression", null);
        setField(term254321, term254321.getClass(), "progressLabelPercentage", null);
        setField(term254321, term254321.getClass(), "projectLayer", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.self.ProjectSelf");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isLive", argTypes, term254321, args);
    }

};


