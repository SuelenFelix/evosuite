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
import java.lang.Integer;

public class AssignmentSelf_initializeTimer_29116823228 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term109572;
     Object term109577;

    public AssignmentSelf_initializeTimer_29116823228() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term109572 = newInstance(Class.forName("core.task.self.AssignmentSelf"));
        setField(term109572, term109572.getClass(), "courseName", null);
        setField(term109572, term109572.getClass(), "question", null);
        setBooleanField(term109572, term109572.getClass(), "isGroup", false);
        setBooleanField(term109572, term109572.getClass(), "isOn", false);
        setField(term109572, term109572.getClass(), "modeOfSubmission", null);
        setField(term109572, term109572.getClass(), "startDate", null);
        setField(term109572, term109572.getClass(), "deadLine", null);
        setField(term109572, term109572.getClass(), "dateSubmitted", null);
        setField(term109572, term109572.getClass(), "timer", null);
        setField(term109572, term109572.getClass(), "members", null);
        setBooleanField(term109572, term109572.getClass(), "eveIsAlerted", false);
        setBooleanField(term109572, term109572.getClass(), "submissionIsAlerted", false);
        setField(term109572, term109572.getClass(), "deadlineIndicator", null);
        setField(term109572, term109572.getClass(), "groupLabel", null);
        setField(term109572, term109572.getClass(), "deadlineEditor", null);
        setField(term109572, term109572.getClass(), "assignmentExhibitor", null);
        setField(term109572, term109572.getClass(), "assignmentPanel", null);
        term109577 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.self.AssignmentSelf");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term109577;
        callMethod(klass, "initializeTimer", argTypes, term109572, args);
    }

};


