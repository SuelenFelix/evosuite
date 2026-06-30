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

public class AssignmentSelf_getStartDate_89063718042 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23667;

    public AssignmentSelf_getStartDate_89063718042() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23667 = newInstance(Class.forName("core.task.self.AssignmentSelf"));
        setField(term23667, term23667.getClass(), "courseName", null);
        setField(term23667, term23667.getClass(), "question", null);
        setBooleanField(term23667, term23667.getClass(), "isGroup", false);
        setBooleanField(term23667, term23667.getClass(), "isOn", false);
        setField(term23667, term23667.getClass(), "modeOfSubmission", null);
        setField(term23667, term23667.getClass(), "startDate", null);
        setField(term23667, term23667.getClass(), "deadLine", null);
        setField(term23667, term23667.getClass(), "dateSubmitted", null);
        setField(term23667, term23667.getClass(), "timer", null);
        setField(term23667, term23667.getClass(), "members", null);
        setBooleanField(term23667, term23667.getClass(), "eveIsAlerted", false);
        setBooleanField(term23667, term23667.getClass(), "submissionIsAlerted", false);
        setField(term23667, term23667.getClass(), "deadlineIndicator", null);
        setField(term23667, term23667.getClass(), "groupLabel", null);
        setField(term23667, term23667.getClass(), "deadlineEditor", null);
        setField(term23667, term23667.getClass(), "assignmentExhibitor", null);
        setField(term23667, term23667.getClass(), "assignmentPanel", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.self.AssignmentSelf");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStartDate", argTypes, term23667, args);
    }

};


