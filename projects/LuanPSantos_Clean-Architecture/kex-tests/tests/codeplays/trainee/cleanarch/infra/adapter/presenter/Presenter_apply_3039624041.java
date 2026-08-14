package codeplays.trainee.cleanarch.infra.adapter.presenter;

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
import static codeplays.trainee.cleanarch.infra.adapter.presenter.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Presenter_apply_3039624041 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47;
     Object term48;

    public Presenter_apply_3039624041() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47 = newInstance(Class.forName("codeplays.trainee.cleanarch.infra.adapter.presenter.Presenter"));
        setField(term47, term47.getClass(), "viewAdapter", null);
        term48 = newInstance(Class.forName("codeplays.trainee.cleanarch.domain.usecase.ResponseModel"));
        setField(term48, term48.getClass(), "data", "MuLcgQHgqz");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("codeplays.trainee.cleanarch.infra.adapter.presenter.Presenter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("codeplays.trainee.cleanarch.domain.usecase.ResponseModel");
        Object[] args = new Object[1];
        args[0] = term48;
        callMethod(klass, "apply", argTypes, term47, args);
    }

};


