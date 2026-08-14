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

public class GeoPackageFileName_hasAdditional_141669317529 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27498;

    public GeoPackageFileName_hasAdditional_141669317529() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term27547 = new Integer(158873461);
        Integer term27549 = new Integer(-430151637);
        Integer term27563 = new Integer(-1697741339);
        Integer term27565 = new Integer(98922530);
        ArrayList term27581 = new ArrayList();
        ((ArrayList) term27581).add("mNgDshwZNc");
        ((ArrayList) term27581).add("pDqgDbJoFw");
        term27498 = newInstance(Class.forName("mil.nga.geopackage.dgiwg.GeoPackageFileName"));
        Object term27579 = newInstance(Class.forName("java.util.Date"));
        setField(term27498, term27498.getClass(), "producer", "ZDhASPHjDG");
        setField(term27498, term27498.getClass(), "dataProduct", "HNVOAXYNEZ");
        setField(term27498, term27498.getClass(), "geographicCoverageArea", "gbbYBYyfvr");
        setField(term27498, term27498.getClass(), "zoomLevels", "SrWMUlbtWV");
        setField(term27498, term27498.getClass(), "zoomLevel1", term27547);
        setField(term27498, term27498.getClass(), "zoomLevel2", term27549);
        setField(term27498, term27498.getClass(), "version", "VePIumgrrU");
        setField(term27498, term27498.getClass(), "majorVersion", term27563);
        setField(term27498, term27498.getClass(), "minorVersion", term27565);
        setField(term27498, term27498.getClass(), "creationDateText", "DPwIqlszZo");
        setLongField(term27579, term27579.getClass(), "fastTime", 1595517583842L);
        setField(term27579, term27579.getClass(), "cdate", null);
        setField(term27498, term27498.getClass(), "creationDate", term27579);
        setField(term27498, term27498.getClass(), "additional", term27581);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.dgiwg.GeoPackageFileName");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hasAdditional", argTypes, term27498, args);
    }

};


