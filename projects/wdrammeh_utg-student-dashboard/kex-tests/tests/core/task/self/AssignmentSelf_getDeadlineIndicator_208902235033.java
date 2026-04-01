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

public class AssignmentSelf_getDeadlineIndicator_208902235033 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term109601;

    public AssignmentSelf_getDeadlineIndicator_208902235033() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term109601 = newInstance(Class.forName("core.task.self.AssignmentSelf"));
        setField(term109601, term109601.getClass(), "courseName", null);
        setField(term109601, term109601.getClass(), "question", null);
        setBooleanField(term109601, term109601.getClass(), "isGroup", false);
        setBooleanField(term109601, term109601.getClass(), "isOn", false);
        setField(term109601, term109601.getClass(), "modeOfSubmission", null);
        setField(term109601, term109601.getClass(), "startDate", null);
        setField(term109601, term109601.getClass(), "deadLine", null);
        setField(term109601, term109601.getClass(), "dateSubmitted", null);
        setField(term109601, term109601.getClass(), "timer", null);
        setField(term109601, term109601.getClass(), "members", null);
        setBooleanField(term109601, term109601.getClass(), "eveIsAlerted", false);
        setBooleanField(term109601, term109601.getClass(), "submissionIsAlerted", false);
        setField(term109601, term109601.getClass(), "deadlineIndicator", null);
        setField(term109601, term109601.getClass(), "groupLabel", null);
        setField(term109601, term109601.getClass(), "deadlineEditor", null);
        setField(term109601, term109601.getClass(), "assignmentExhibitor", null);
        setField(term109601, term109601.getClass(), "assignmentPanel", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.self.AssignmentSelf");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDeadlineIndicator", argTypes, term109601, args);
    }

};


