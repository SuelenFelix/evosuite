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

public class GeoPackageFileName_getCreationDate_51506008926 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26857;

    public GeoPackageFileName_getCreationDate_51506008926() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term26906 = new Integer(71190297);
        Integer term26908 = new Integer(1202361360);
        Integer term26922 = new Integer(-2015048153);
        Integer term26924 = new Integer(-2063457669);
        ArrayList term26940 = new ArrayList();
        term26857 = newInstance(Class.forName("mil.nga.geopackage.dgiwg.GeoPackageFileName"));
        Object term26938 = newInstance(Class.forName("java.util.Date"));
        setField(term26857, term26857.getClass(), "producer", "wWWidPCHzx");
        setField(term26857, term26857.getClass(), "dataProduct", "OwPIiBRuKK");
        setField(term26857, term26857.getClass(), "geographicCoverageArea", "sgfGySMODT");
        setField(term26857, term26857.getClass(), "zoomLevels", "ndAITnOsny");
        setField(term26857, term26857.getClass(), "zoomLevel1", term26906);
        setField(term26857, term26857.getClass(), "zoomLevel2", term26908);
        setField(term26857, term26857.getClass(), "version", "CVZnTiJucs");
        setField(term26857, term26857.getClass(), "majorVersion", term26922);
        setField(term26857, term26857.getClass(), "minorVersion", term26924);
        setField(term26857, term26857.getClass(), "creationDateText", "ecHEQufXoq");
        setLongField(term26938, term26938.getClass(), "fastTime", 1876872800559L);
        setField(term26938, term26938.getClass(), "cdate", null);
        setField(term26857, term26857.getClass(), "creationDate", term26938);
        setField(term26857, term26857.getClass(), "additional", term26940);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.dgiwg.GeoPackageFileName");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCreationDate", argTypes, term26857, args);
    }

};


