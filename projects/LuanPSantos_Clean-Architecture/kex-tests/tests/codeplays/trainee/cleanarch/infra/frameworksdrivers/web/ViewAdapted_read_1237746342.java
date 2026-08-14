package codeplays.trainee.cleanarch.infra.frameworksdrivers.web;

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
import static codeplays.trainee.cleanarch.infra.frameworksdrivers.web.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ViewAdapted_read_1237746342 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48;

    public ViewAdapted_read_1237746342() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48 = newInstance(Class.forName("codeplays.trainee.cleanarch.infra.frameworksdrivers.web.ViewAdapted"));
        Object term49 = newInstance(Class.forName("codeplays.trainee.cleanarch.infra.adapter.presenter.ViewModel"));
        setField(term49, term49.getClass(), "data", "MuLcgQHgqz");
        setField(term48, term48.getClass(), "viewModel", term49);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("codeplays.trainee.cleanarch.infra.frameworksdrivers.web.ViewAdapted");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "read", argTypes, term48, args);
    }

};


