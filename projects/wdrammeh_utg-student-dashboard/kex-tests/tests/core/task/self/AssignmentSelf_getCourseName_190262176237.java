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

public class AssignmentSelf_getCourseName_190262176237 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term109623;

    public AssignmentSelf_getCourseName_190262176237() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term109623 = newInstance(Class.forName("core.task.self.AssignmentSelf"));
        setField(term109623, term109623.getClass(), "courseName", null);
        setField(term109623, term109623.getClass(), "question", null);
        setBooleanField(term109623, term109623.getClass(), "isGroup", false);
        setBooleanField(term109623, term109623.getClass(), "isOn", false);
        setField(term109623, term109623.getClass(), "modeOfSubmission", null);
        setField(term109623, term109623.getClass(), "startDate", null);
        setField(term109623, term109623.getClass(), "deadLine", null);
        setField(term109623, term109623.getClass(), "dateSubmitted", null);
        setField(term109623, term109623.getClass(), "timer", null);
        setField(term109623, term109623.getClass(), "members", null);
        setBooleanField(term109623, term109623.getClass(), "eveIsAlerted", false);
        setBooleanField(term109623, term109623.getClass(), "submissionIsAlerted", false);
        setField(term109623, term109623.getClass(), "deadlineIndicator", null);
        setField(term109623, term109623.getClass(), "groupLabel", null);
        setField(term109623, term109623.getClass(), "deadlineEditor", null);
        setField(term109623, term109623.getClass(), "assignmentExhibitor", null);
        setField(term109623, term109623.getClass(), "assignmentPanel", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.self.AssignmentSelf");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCourseName", argTypes, term109623, args);
    }

};


