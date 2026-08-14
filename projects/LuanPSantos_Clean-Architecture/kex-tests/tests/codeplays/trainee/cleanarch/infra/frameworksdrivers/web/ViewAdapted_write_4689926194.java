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

public class ViewAdapted_write_4689926194 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term72;

    public ViewAdapted_write_4689926194() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term72 = newInstance(Class.forName("codeplays.trainee.cleanarch.infra.frameworksdrivers.web.ViewAdapted"));
        setField(term72, term72.getClass(), "viewModel", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("codeplays.trainee.cleanarch.infra.frameworksdrivers.web.ViewAdapted");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("codeplays.trainee.cleanarch.infra.adapter.presenter.ViewModel");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "write", argTypes, term72, args);
    }

};


