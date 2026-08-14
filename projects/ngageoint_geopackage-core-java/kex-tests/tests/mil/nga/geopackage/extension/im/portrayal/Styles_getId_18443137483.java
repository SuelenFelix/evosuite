package mil.nga.geopackage.extension.im.portrayal;

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
import static mil.nga.geopackage.extension.im.portrayal.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Styles_getId_18443137483 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term507;

    public Styles_getId_18443137483() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term507 = newInstance(Class.forName("mil.nga.geopackage.extension.im.portrayal.Styles"));
        setLongField(term507, term507.getClass(), "id", -8603648071751666348L);
        setField(term507, term507.getClass(), "style", "SzjVpOQTyS");
        setField(term507, term507.getClass(), "description", "MjGYSRKTNF");
        setField(term507, term507.getClass(), "uri", "hRNSzYYIrc");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.im.portrayal.Styles");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term507, args);
    }

};


