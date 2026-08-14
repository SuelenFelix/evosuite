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

public class ViewAdapted_write_4689926191 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term15;

    public ViewAdapted_write_4689926191() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("codeplays.trainee.cleanarch.infra.frameworksdrivers.web.ViewAdapted"));
        Object term2 = newInstance(Class.forName("codeplays.trainee.cleanarch.infra.adapter.presenter.ViewModel"));
        setField(term2, term2.getClass(), "data", "PAEBtnZtTD");
        setField(term1, term1.getClass(), "viewModel", term2);
        term15 = newInstance(Class.forName("codeplays.trainee.cleanarch.infra.adapter.presenter.ViewModel"));
        setField(term15, term15.getClass(), "data", "sjlJAEtRrb");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("codeplays.trainee.cleanarch.infra.frameworksdrivers.web.ViewAdapted");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("codeplays.trainee.cleanarch.infra.adapter.presenter.ViewModel");
        Object[] args = new Object[1];
        args[0] = term15;
        callMethod(klass, "write", argTypes, term1, args);
    }

};


