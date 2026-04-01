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

public class AssignmentSelf_signalSubmissionNotice_163594006732 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term109596;

    public AssignmentSelf_signalSubmissionNotice_163594006732() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term109596 = newInstance(Class.forName("core.task.self.AssignmentSelf"));
        setField(term109596, term109596.getClass(), "courseName", null);
        setField(term109596, term109596.getClass(), "question", null);
        setBooleanField(term109596, term109596.getClass(), "isGroup", false);
        setBooleanField(term109596, term109596.getClass(), "isOn", false);
        setField(term109596, term109596.getClass(), "modeOfSubmission", null);
        setField(term109596, term109596.getClass(), "startDate", null);
        setField(term109596, term109596.getClass(), "deadLine", null);
        setField(term109596, term109596.getClass(), "dateSubmitted", null);
        setField(term109596, term109596.getClass(), "timer", null);
        setField(term109596, term109596.getClass(), "members", null);
        setBooleanField(term109596, term109596.getClass(), "eveIsAlerted", false);
        setBooleanField(term109596, term109596.getClass(), "submissionIsAlerted", false);
        setField(term109596, term109596.getClass(), "deadlineIndicator", null);
        setField(term109596, term109596.getClass(), "groupLabel", null);
        setField(term109596, term109596.getClass(), "deadlineEditor", null);
        setField(term109596, term109596.getClass(), "assignmentExhibitor", null);
        setField(term109596, term109596.getClass(), "assignmentPanel", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.self.AssignmentSelf");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "signalSubmissionNotice", argTypes, term109596, args);
    }

};


