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

public class AssignmentSelf_wakeAlive_122179669849 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term109683;

    public AssignmentSelf_wakeAlive_122179669849() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term109683 = newInstance(Class.forName("core.task.self.AssignmentSelf"));
        setField(term109683, term109683.getClass(), "courseName", null);
        setField(term109683, term109683.getClass(), "question", null);
        setBooleanField(term109683, term109683.getClass(), "isGroup", false);
        setBooleanField(term109683, term109683.getClass(), "isOn", false);
        setField(term109683, term109683.getClass(), "modeOfSubmission", null);
        setField(term109683, term109683.getClass(), "startDate", null);
        setField(term109683, term109683.getClass(), "deadLine", null);
        setField(term109683, term109683.getClass(), "dateSubmitted", null);
        setField(term109683, term109683.getClass(), "timer", null);
        setField(term109683, term109683.getClass(), "members", null);
        setBooleanField(term109683, term109683.getClass(), "eveIsAlerted", false);
        setBooleanField(term109683, term109683.getClass(), "submissionIsAlerted", false);
        setField(term109683, term109683.getClass(), "deadlineIndicator", null);
        setField(term109683, term109683.getClass(), "groupLabel", null);
        setField(term109683, term109683.getClass(), "deadlineEditor", null);
        setField(term109683, term109683.getClass(), "assignmentExhibitor", null);
        setField(term109683, term109683.getClass(), "assignmentPanel", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.self.AssignmentSelf");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "wakeAlive", argTypes, term109683, args);
    }

};


