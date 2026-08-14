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

public class GeoPackageFileName_hasMajorVersion_86740020920 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25289;

    public GeoPackageFileName_hasMajorVersion_86740020920() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term25338 = new Integer(-1801760683);
        Integer term25340 = new Integer(1141317871);
        Integer term25354 = new Integer(890669485);
        Integer term25356 = new Integer(691577392);
        ArrayList term25372 = new ArrayList();
        ((ArrayList) term25372).add("NWldOLAbqk");
        ((ArrayList) term25372).add("qnYaYSpDwO");
        ((ArrayList) term25372).add("dgbFDCdHtj");
        ((ArrayList) term25372).add("EKpdCBubDE");
        ((ArrayList) term25372).add("zMsSLTfGhl");
        ((ArrayList) term25372).add("bEmHScVZaQ");
        ((ArrayList) term25372).add("TcuXODkzBV");
        ((ArrayList) term25372).add("coJPjrBZNe");
        ((ArrayList) term25372).add("vMsWjuPTnO");
        term25289 = newInstance(Class.forName("mil.nga.geopackage.dgiwg.GeoPackageFileName"));
        Object term25370 = newInstance(Class.forName("java.util.Date"));
        setField(term25289, term25289.getClass(), "producer", "DGRqjjdhzy");
        setField(term25289, term25289.getClass(), "dataProduct", "lQFkjJUPAR");
        setField(term25289, term25289.getClass(), "geographicCoverageArea", "BsuVlGUUjV");
        setField(term25289, term25289.getClass(), "zoomLevels", "bHHjfDCntT");
        setField(term25289, term25289.getClass(), "zoomLevel1", term25338);
        setField(term25289, term25289.getClass(), "zoomLevel2", term25340);
        setField(term25289, term25289.getClass(), "version", "sEphiduvkv");
        setField(term25289, term25289.getClass(), "majorVersion", term25354);
        setField(term25289, term25289.getClass(), "minorVersion", term25356);
        setField(term25289, term25289.getClass(), "creationDateText", "PbLgCSAHce");
        setLongField(term25370, term25370.getClass(), "fastTime", 1329640267573L);
        setField(term25370, term25370.getClass(), "cdate", null);
        setField(term25289, term25289.getClass(), "creationDate", term25370);
        setField(term25289, term25289.getClass(), "additional", term25372);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.dgiwg.GeoPackageFileName");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hasMajorVersion", argTypes, term25289, args);
    }

};


