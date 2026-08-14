package mil.nga.geopackage.dgiwg;

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
import static mil.nga.geopackage.dgiwg.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;
import java.util.ArrayList;

public class GeoPackageFileName_getFile_92477414435 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29111;

    public GeoPackageFileName_getFile_92477414435() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term29160 = new Integer(1041916673);
        Integer term29162 = new Integer(-601863069);
        Integer term29176 = new Integer(663292551);
        Integer term29178 = new Integer(-1885090354);
        ArrayList term29194 = new ArrayList();
        term29111 = newInstance(Class.forName("mil.nga.geopackage.dgiwg.GeoPackageFileName"));
        Object term29192 = newInstance(Class.forName("java.util.Date"));
        setField(term29111, term29111.getClass(), "producer", "EHoNUaeyvT");
        setField(term29111, term29111.getClass(), "dataProduct", "ZwKmasCVIy");
        setField(term29111, term29111.getClass(), "geographicCoverageArea", "pxokrVaeMd");
        setField(term29111, term29111.getClass(), "zoomLevels", "ujxmmZZcbT");
        setField(term29111, term29111.getClass(), "zoomLevel1", term29160);
        setField(term29111, term29111.getClass(), "zoomLevel2", term29162);
        setField(term29111, term29111.getClass(), "version", "BOvgwHfoHQ");
        setField(term29111, term29111.getClass(), "majorVersion", term29176);
        setField(term29111, term29111.getClass(), "minorVersion", term29178);
        setField(term29111, term29111.getClass(), "creationDateText", "hPpFNeDBIb");
        setLongField(term29192, term29192.getClass(), "fastTime", 1426018874434L);
        setField(term29192, term29192.getClass(), "cdate", null);
        setField(term29111, term29111.getClass(), "creationDate", term29192);
        setField(term29111, term29111.getClass(), "additional", term29194);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.dgiwg.GeoPackageFileName");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFile", argTypes, term29111, args);
    }

};


