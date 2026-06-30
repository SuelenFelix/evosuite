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

public class AssignmentSelf_setDeadLine_29476255241 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23662;

    public AssignmentSelf_setDeadLine_29476255241() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23662 = newInstance(Class.forName("core.task.self.AssignmentSelf"));
        setField(term23662, term23662.getClass(), "courseName", null);
        setField(term23662, term23662.getClass(), "question", null);
        setBooleanField(term23662, term23662.getClass(), "isGroup", false);
        setBooleanField(term23662, term23662.getClass(), "isOn", false);
        setField(term23662, term23662.getClass(), "modeOfSubmission", null);
        setField(term23662, term23662.getClass(), "startDate", null);
        setField(term23662, term23662.getClass(), "deadLine", null);
        setField(term23662, term23662.getClass(), "dateSubmitted", null);
        setField(term23662, term23662.getClass(), "timer", null);
        setField(term23662, term23662.getClass(), "members", null);
        setBooleanField(term23662, term23662.getClass(), "eveIsAlerted", false);
        setBooleanField(term23662, term23662.getClass(), "submissionIsAlerted", false);
        setField(term23662, term23662.getClass(), "deadlineIndicator", null);
        setField(term23662, term23662.getClass(), "groupLabel", null);
        setField(term23662, term23662.getClass(), "deadlineEditor", null);
        setField(term23662, term23662.getClass(), "assignmentExhibitor", null);
        setField(term23662, term23662.getClass(), "assignmentPanel", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.self.AssignmentSelf");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setDeadLine", argTypes, term23662, args);
    }

};


