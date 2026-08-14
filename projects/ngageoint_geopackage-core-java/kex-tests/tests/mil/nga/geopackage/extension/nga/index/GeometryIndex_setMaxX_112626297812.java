package mil.nga.geopackage.extension.nga.index;

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
import static mil.nga.geopackage.extension.nga.index.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Double;

public class GeometryIndex_setMaxX_112626297812 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term672;
     Object term698;

    public GeometryIndex_setMaxX_112626297812() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term690 = new Double(0.25937345430928016);
        Double term692 = new Double(0.5873228247510078);
        Double term694 = new Double(0.8823181080774973);
        Double term696 = new Double(0.2192450926212024);
        term672 = newInstance(Class.forName("mil.nga.geopackage.extension.nga.index.GeometryIndex"));
        setField(term672, term672.getClass(), "tableIndex", null);
        setField(term672, term672.getClass(), "tableName", "RkybSrpybU");
        setLongField(term672, term672.getClass(), "geomId", 8059786003080744426L);
        setDoubleField(term672, term672.getClass(), "minX", 0.5873228247510078);
        setDoubleField(term672, term672.getClass(), "maxX", 0.8823181080774973);
        setDoubleField(term672, term672.getClass(), "minY", 0.2192450926212024);
        setDoubleField(term672, term672.getClass(), "maxY", 0.7591353014991907);
        setField(term672, term672.getClass(), "minZ", term690);
        setField(term672, term672.getClass(), "maxZ", term692);
        setField(term672, term672.getClass(), "minM", term694);
        setField(term672, term672.getClass(), "maxM", term696);
        term698 = new Double(0.791695029600875);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.nga.index.GeometryIndex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term698;
        callMethod(klass, "setMaxX", argTypes, term672, args);
    }

};


