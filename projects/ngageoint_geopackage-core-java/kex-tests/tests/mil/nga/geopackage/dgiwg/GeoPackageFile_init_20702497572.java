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

public class GeoPackageFile_init_20702497572 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16887;

    public GeoPackageFile_init_20702497572() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term16936 = new Integer(-1922583790);
        Integer term16938 = new Integer(-616727354);
        Integer term16952 = new Integer(-1955890973);
        Integer term16954 = new Integer(-2038273078);
        ArrayList term16970 = new ArrayList();
        ((ArrayList) term16970).add("WXMWFDGcLB");
        term16887 = newInstance(Class.forName("mil.nga.geopackage.dgiwg.GeoPackageFileName"));
        Object term16968 = newInstance(Class.forName("java.util.Date"));
        setField(term16887, term16887.getClass(), "producer", "zcorEihhLK");
        setField(term16887, term16887.getClass(), "dataProduct", "GrqozDKFOk");
        setField(term16887, term16887.getClass(), "geographicCoverageArea", "CFyoseFGLF");
        setField(term16887, term16887.getClass(), "zoomLevels", "SFqCrhEWLm");
        setField(term16887, term16887.getClass(), "zoomLevel1", term16936);
        setField(term16887, term16887.getClass(), "zoomLevel2", term16938);
        setField(term16887, term16887.getClass(), "version", "GZdcJyZntS");
        setField(term16887, term16887.getClass(), "majorVersion", term16952);
        setField(term16887, term16887.getClass(), "minorVersion", term16954);
        setField(term16887, term16887.getClass(), "creationDateText", "OIHoJeysUi");
        setLongField(term16968, term16968.getClass(), "fastTime", 1480438351369L);
        setField(term16968, term16968.getClass(), "cdate", null);
        setField(term16887, term16887.getClass(), "creationDate", term16968);
        setField(term16887, term16887.getClass(), "additional", term16970);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.dgiwg.GeoPackageFile");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("mil.nga.geopackage.dgiwg.GeoPackageFileName");
        Object[] args = new Object[2];
        args[0] = "PCipZnmBOF";
        args[1] = term16887;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


