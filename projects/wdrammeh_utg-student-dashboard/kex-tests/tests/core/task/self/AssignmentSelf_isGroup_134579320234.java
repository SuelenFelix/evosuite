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

public class AssignmentSelf_isGroup_134579320234 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23625;

    public AssignmentSelf_isGroup_134579320234() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23625 = newInstance(Class.forName("core.task.self.AssignmentSelf"));
        setField(term23625, term23625.getClass(), "courseName", null);
        setField(term23625, term23625.getClass(), "question", null);
        setBooleanField(term23625, term23625.getClass(), "isGroup", false);
        setBooleanField(term23625, term23625.getClass(), "isOn", false);
        setField(term23625, term23625.getClass(), "modeOfSubmission", null);
        setField(term23625, term23625.getClass(), "startDate", null);
        setField(term23625, term23625.getClass(), "deadLine", null);
        setField(term23625, term23625.getClass(), "dateSubmitted", null);
        setField(term23625, term23625.getClass(), "timer", null);
        setField(term23625, term23625.getClass(), "members", null);
        setBooleanField(term23625, term23625.getClass(), "eveIsAlerted", false);
        setBooleanField(term23625, term23625.getClass(), "submissionIsAlerted", false);
        setField(term23625, term23625.getClass(), "deadlineIndicator", null);
        setField(term23625, term23625.getClass(), "groupLabel", null);
        setField(term23625, term23625.getClass(), "deadlineEditor", null);
        setField(term23625, term23625.getClass(), "assignmentExhibitor", null);
        setField(term23625, term23625.getClass(), "assignmentPanel", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.self.AssignmentSelf");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isGroup", argTypes, term23625, args);
    }

};


