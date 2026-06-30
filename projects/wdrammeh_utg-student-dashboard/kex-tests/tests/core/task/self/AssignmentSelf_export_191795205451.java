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

public class AssignmentSelf_export_191795205451 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23712;

    public AssignmentSelf_export_191795205451() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23712 = newInstance(Class.forName("core.task.self.AssignmentSelf"));
        setField(term23712, term23712.getClass(), "courseName", null);
        setField(term23712, term23712.getClass(), "question", null);
        setBooleanField(term23712, term23712.getClass(), "isGroup", false);
        setBooleanField(term23712, term23712.getClass(), "isOn", false);
        setField(term23712, term23712.getClass(), "modeOfSubmission", null);
        setField(term23712, term23712.getClass(), "startDate", null);
        setField(term23712, term23712.getClass(), "deadLine", null);
        setField(term23712, term23712.getClass(), "dateSubmitted", null);
        setField(term23712, term23712.getClass(), "timer", null);
        setField(term23712, term23712.getClass(), "members", null);
        setBooleanField(term23712, term23712.getClass(), "eveIsAlerted", false);
        setBooleanField(term23712, term23712.getClass(), "submissionIsAlerted", false);
        setField(term23712, term23712.getClass(), "deadlineIndicator", null);
        setField(term23712, term23712.getClass(), "groupLabel", null);
        setField(term23712, term23712.getClass(), "deadlineEditor", null);
        setField(term23712, term23712.getClass(), "assignmentExhibitor", null);
        setField(term23712, term23712.getClass(), "assignmentPanel", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.self.AssignmentSelf");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "export", argTypes, term23712, args);
    }

};


