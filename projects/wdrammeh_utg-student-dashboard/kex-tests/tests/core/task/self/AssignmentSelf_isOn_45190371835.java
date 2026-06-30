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

public class AssignmentSelf_isOn_45190371835 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23630;

    public AssignmentSelf_isOn_45190371835() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23630 = newInstance(Class.forName("core.task.self.AssignmentSelf"));
        setField(term23630, term23630.getClass(), "courseName", null);
        setField(term23630, term23630.getClass(), "question", null);
        setBooleanField(term23630, term23630.getClass(), "isGroup", false);
        setBooleanField(term23630, term23630.getClass(), "isOn", false);
        setField(term23630, term23630.getClass(), "modeOfSubmission", null);
        setField(term23630, term23630.getClass(), "startDate", null);
        setField(term23630, term23630.getClass(), "deadLine", null);
        setField(term23630, term23630.getClass(), "dateSubmitted", null);
        setField(term23630, term23630.getClass(), "timer", null);
        setField(term23630, term23630.getClass(), "members", null);
        setBooleanField(term23630, term23630.getClass(), "eveIsAlerted", false);
        setBooleanField(term23630, term23630.getClass(), "submissionIsAlerted", false);
        setField(term23630, term23630.getClass(), "deadlineIndicator", null);
        setField(term23630, term23630.getClass(), "groupLabel", null);
        setField(term23630, term23630.getClass(), "deadlineEditor", null);
        setField(term23630, term23630.getClass(), "assignmentExhibitor", null);
        setField(term23630, term23630.getClass(), "assignmentPanel", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.self.AssignmentSelf");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isOn", argTypes, term23630, args);
    }

};


