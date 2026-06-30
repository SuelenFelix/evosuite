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

public class AssignmentSelf_getMemberText_80337628930 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23603;
     Object term23608;

    public AssignmentSelf_getMemberText_80337628930() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23603 = newInstance(Class.forName("core.task.self.AssignmentSelf"));
        setField(term23603, term23603.getClass(), "courseName", null);
        setField(term23603, term23603.getClass(), "question", null);
        setBooleanField(term23603, term23603.getClass(), "isGroup", false);
        setBooleanField(term23603, term23603.getClass(), "isOn", false);
        setField(term23603, term23603.getClass(), "modeOfSubmission", null);
        setField(term23603, term23603.getClass(), "startDate", null);
        setField(term23603, term23603.getClass(), "deadLine", null);
        setField(term23603, term23603.getClass(), "dateSubmitted", null);
        setField(term23603, term23603.getClass(), "timer", null);
        setField(term23603, term23603.getClass(), "members", null);
        setBooleanField(term23603, term23603.getClass(), "eveIsAlerted", false);
        setBooleanField(term23603, term23603.getClass(), "submissionIsAlerted", false);
        setField(term23603, term23603.getClass(), "deadlineIndicator", null);
        setField(term23603, term23603.getClass(), "groupLabel", null);
        setField(term23603, term23603.getClass(), "deadlineEditor", null);
        setField(term23603, term23603.getClass(), "assignmentExhibitor", null);
        setField(term23603, term23603.getClass(), "assignmentPanel", null);
        term23608 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.self.AssignmentSelf");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term23608;
        callMethod(klass, "getMemberText", argTypes, term23603, args);
    }

};


