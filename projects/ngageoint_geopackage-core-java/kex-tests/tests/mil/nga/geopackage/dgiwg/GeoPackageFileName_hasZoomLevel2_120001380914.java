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

public class GeoPackageFileName_hasZoomLevel2_120001380914 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23651;

    public GeoPackageFileName_hasZoomLevel2_120001380914() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term23700 = new Integer(1114000454);
        Integer term23702 = new Integer(-556405712);
        Integer term23716 = new Integer(-1772434990);
        Integer term23718 = new Integer(-1845499264);
        ArrayList term23734 = new ArrayList();
        ((ArrayList) term23734).add("fIZsWucfXz");
        ((ArrayList) term23734).add("IApvtmfhnq");
        ((ArrayList) term23734).add("VSaNnhMpRc");
        ((ArrayList) term23734).add("QNjNTLlUaV");
        ((ArrayList) term23734).add("hIYsRyOZxk");
        ((ArrayList) term23734).add("RjNoEywJbC");
        term23651 = newInstance(Class.forName("mil.nga.geopackage.dgiwg.GeoPackageFileName"));
        Object term23732 = newInstance(Class.forName("java.util.Date"));
        setField(term23651, term23651.getClass(), "producer", "QITgiBrmfj");
        setField(term23651, term23651.getClass(), "dataProduct", "pXxkiXgQnq");
        setField(term23651, term23651.getClass(), "geographicCoverageArea", "tKmrUDURku");
        setField(term23651, term23651.getClass(), "zoomLevels", "JeZbrwZmsP");
        setField(term23651, term23651.getClass(), "zoomLevel1", term23700);
        setField(term23651, term23651.getClass(), "zoomLevel2", term23702);
        setField(term23651, term23651.getClass(), "version", "bxyfeicqrK");
        setField(term23651, term23651.getClass(), "majorVersion", term23716);
        setField(term23651, term23651.getClass(), "minorVersion", term23718);
        setField(term23651, term23651.getClass(), "creationDateText", "vBnWPlsZMk");
        setLongField(term23732, term23732.getClass(), "fastTime", 1538078916394L);
        setField(term23732, term23732.getClass(), "cdate", null);
        setField(term23651, term23651.getClass(), "creationDate", term23732);
        setField(term23651, term23651.getClass(), "additional", term23734);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.dgiwg.GeoPackageFileName");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hasZoomLevel2", argTypes, term23651, args);
    }

};


