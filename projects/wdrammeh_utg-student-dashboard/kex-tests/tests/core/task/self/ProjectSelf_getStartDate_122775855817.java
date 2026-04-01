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

public class ProjectSelf_getStartDate_122775855817 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term251673;

    public ProjectSelf_getStartDate_122775855817() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term251673 = newInstance(Class.forName("core.task.self.ProjectSelf"));
        setField(term251673, term251673.getClass(), "projectName", null);
        setField(term251673, term251673.getClass(), "type", null);
        setField(term251673, term251673.getClass(), "startDate", null);
        setIntField(term251673, term251673.getClass(), "specifiedDuration", 0);
        setIntField(term251673, term251673.getClass(), "totalTimeConsumed", 0);
        setBooleanField(term251673, term251673.getClass(), "isLive", false);
        setField(term251673, term251673.getClass(), "timer", null);
        setField(term251673, term251673.getClass(), "dateExpectedToComplete", null);
        setField(term251673, term251673.getClass(), "dateCompleted", null);
        setBooleanField(term251673, term251673.getClass(), "eveIsAlerted", false);
        setBooleanField(term251673, term251673.getClass(), "completionIsAlerted", false);
        setField(term251673, term251673.getClass(), "exhibition", null);
        setField(term251673, term251673.getClass(), "terminationButton", null);
        setField(term251673, term251673.getClass(), "completionButton", null);
        setField(term251673, term251673.getClass(), "moreOptions", null);
        setField(term251673, term251673.getClass(), "projectProgression", null);
        setField(term251673, term251673.getClass(), "progressLabelPercentage", null);
        setField(term251673, term251673.getClass(), "projectLayer", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.self.ProjectSelf");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStartDate", argTypes, term251673, args);
    }

};


