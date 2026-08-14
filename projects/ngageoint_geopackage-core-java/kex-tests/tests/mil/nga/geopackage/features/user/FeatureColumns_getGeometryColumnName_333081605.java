package mil.nga.geopackage.features.user;

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
import static mil.nga.geopackage.features.user.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.util.HashMap;

public class FeatureColumns_getGeometryColumnName_333081605 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term614;

    public FeatureColumns_getGeometryColumnName_333081605() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term713 = new ArrayList();
        HashMap term718 = new HashMap();
        term614 = newInstance(Class.forName("mil.nga.geopackage.features.user.FeatureColumns"));
        Object[] term640 = (Object[]) newArray("java.lang.String", 6);
        setField(term614, term614.getClass(), "geometryColumn", "OclPbYPkcH");
        setIntField(term614, term614.getClass(), "geometryIndex", -1955890973);
        setField(term614, term614.getClass(), "tableName", "IoAlmYsBwc");
        setElement(term640, 0, "TEParAifyi");
        setElement(term640, 1, "OWDIEULEFu");
        setElement(term640, 2, "dWRymuLBtr");
        setElement(term640, 3, "AijpHYOFuy");
        setElement(term640, 4, "SbAoxhfrkn");
        setElement(term640, 5, "kuTXqwMtDB");
        setField(term614, term614.getClass(), "columnNames", term640);
        setField(term614, term614.getClass(), "columns", term713);
        setBooleanField(term614, term614.getClass(), "custom", false);
        setField(term614, term614.getClass(), "nameToIndex", term718);
        setIntField(term614, term614.getClass(), "pkIndex", -2038273078);
        setBooleanField(term614, term614.getClass(), "pkModifiable", true);
        setBooleanField(term614, term614.getClass(), "valueValidation", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.features.user.FeatureColumns");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGeometryColumnName", argTypes, term614, args);
    }

};


