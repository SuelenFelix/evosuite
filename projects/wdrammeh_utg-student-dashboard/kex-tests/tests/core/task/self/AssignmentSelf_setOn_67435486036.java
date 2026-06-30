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
import java.lang.Boolean;

public class AssignmentSelf_setOn_67435486036 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23635;
     Object term23640;

    public AssignmentSelf_setOn_67435486036() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23635 = newInstance(Class.forName("core.task.self.AssignmentSelf"));
        setField(term23635, term23635.getClass(), "courseName", null);
        setField(term23635, term23635.getClass(), "question", null);
        setBooleanField(term23635, term23635.getClass(), "isGroup", false);
        setBooleanField(term23635, term23635.getClass(), "isOn", false);
        setField(term23635, term23635.getClass(), "modeOfSubmission", null);
        setField(term23635, term23635.getClass(), "startDate", null);
        setField(term23635, term23635.getClass(), "deadLine", null);
        setField(term23635, term23635.getClass(), "dateSubmitted", null);
        setField(term23635, term23635.getClass(), "timer", null);
        setField(term23635, term23635.getClass(), "members", null);
        setBooleanField(term23635, term23635.getClass(), "eveIsAlerted", false);
        setBooleanField(term23635, term23635.getClass(), "submissionIsAlerted", false);
        setField(term23635, term23635.getClass(), "deadlineIndicator", null);
        setField(term23635, term23635.getClass(), "groupLabel", null);
        setField(term23635, term23635.getClass(), "deadlineEditor", null);
        setField(term23635, term23635.getClass(), "assignmentExhibitor", null);
        setField(term23635, term23635.getClass(), "assignmentPanel", null);
        term23640 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.self.AssignmentSelf");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term23640;
        callMethod(klass, "setOn", argTypes, term23635, args);
    }

};


