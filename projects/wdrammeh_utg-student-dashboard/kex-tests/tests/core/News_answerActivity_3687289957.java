package core;

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
import static core.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class News_answerActivity_3687289957 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term175738;

    public News_answerActivity_3687289957() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term175738 = newInstance(Class.forName("core.News"));
        setField(term175738, term175738.getClass(), "present", null);
        setField(term175738, term175738.getClass(), "scrollPane", null);
        setField(term175738, term175738.getClass(), "refreshButton", null);
        setField(term175738, term175738.getClass(), "accessLabel", null);
        setField(term175738, term175738.getClass(), "accessResident", null);
        setBooleanField(term175738, term175738.getClass(), "isFirstView", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.News");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "answerActivity", argTypes, term175738, args);
    }

};


