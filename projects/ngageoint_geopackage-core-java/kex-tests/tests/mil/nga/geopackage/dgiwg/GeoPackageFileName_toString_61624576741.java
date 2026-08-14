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

public class GeoPackageFileName_toString_61624576741 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30637;

    public GeoPackageFileName_toString_61624576741() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term30686 = new Integer(389427431);
        Integer term30688 = new Integer(-1945706126);
        Integer term30702 = new Integer(1152356969);
        Integer term30704 = new Integer(-1667990367);
        ArrayList term30720 = new ArrayList();
        ((ArrayList) term30720).add("DWEsVQwuaE");
        ((ArrayList) term30720).add("qGkNzZAeDN");
        term30637 = newInstance(Class.forName("mil.nga.geopackage.dgiwg.GeoPackageFileName"));
        Object term30718 = newInstance(Class.forName("java.util.Date"));
        setField(term30637, term30637.getClass(), "producer", "JydxSNTMYt");
        setField(term30637, term30637.getClass(), "dataProduct", "KpurAcrHYT");
        setField(term30637, term30637.getClass(), "geographicCoverageArea", "QjvDwgKJGz");
        setField(term30637, term30637.getClass(), "zoomLevels", "ngYxiXTZrk");
        setField(term30637, term30637.getClass(), "zoomLevel1", term30686);
        setField(term30637, term30637.getClass(), "zoomLevel2", term30688);
        setField(term30637, term30637.getClass(), "version", "YTxBqWRAlo");
        setField(term30637, term30637.getClass(), "majorVersion", term30702);
        setField(term30637, term30637.getClass(), "minorVersion", term30704);
        setField(term30637, term30637.getClass(), "creationDateText", "ReruUQRXwl");
        setLongField(term30718, term30718.getClass(), "fastTime", 1695425269458L);
        setField(term30718, term30718.getClass(), "cdate", null);
        setField(term30637, term30637.getClass(), "creationDate", term30718);
        setField(term30637, term30637.getClass(), "additional", term30720);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.dgiwg.GeoPackageFileName");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term30637, args);
    }

};


