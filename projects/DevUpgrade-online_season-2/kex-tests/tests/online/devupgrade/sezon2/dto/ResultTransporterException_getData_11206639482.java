package online.devupgrade.sezon2.dto;

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
import static online.devupgrade.sezon2.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ResultTransporterException_getData_11206639482 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4146;

    public ResultTransporterException_getData_11206639482() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4146 = newInstance(Class.forName("online.devupgrade.sezon2.dto.ResultTransporterException"));
        setField(term4146, term4146.getClass(), "data", null);
        setField(term4146, term4146.getClass(), "backtrace", null);
        setField(term4146, term4146.getClass(), "detailMessage", null);
        setField(term4146, term4146.getClass(), "cause", null);
        setField(term4146, term4146.getClass(), "stackTrace", null);
        setIntField(term4146, term4146.getClass(), "depth", 0);
        setField(term4146, term4146.getClass(), "suppressedExceptions", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("online.devupgrade.sezon2.dto.ResultTransporterException");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getData", argTypes, term4146, args);
    }

};


