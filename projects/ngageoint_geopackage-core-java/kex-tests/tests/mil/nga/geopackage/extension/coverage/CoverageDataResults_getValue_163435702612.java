package mil.nga.geopackage.extension.coverage;

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
import static mil.nga.geopackage.extension.coverage.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class CoverageDataResults_getValue_163435702612 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10195;
     Object term10198;
     Object term10200;

    public CoverageDataResults_getValue_163435702612() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10195 = newInstance(Class.forName("mil.nga.geopackage.extension.coverage.CoverageDataResults"));
        setField(term10195, term10195.getClass(), "values", null);
        setField(term10195, term10195.getClass(), "tileMatrix", null);
        setIntField(term10195, term10195.getClass(), "height", 0);
        setIntField(term10195, term10195.getClass(), "width", 0);
        term10198 = new Integer(0);
        term10200 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.coverage.CoverageDataResults");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term10198;
        args[1] = term10200;
        callMethod(klass, "getValue", argTypes, term10195, args);
    }

};


