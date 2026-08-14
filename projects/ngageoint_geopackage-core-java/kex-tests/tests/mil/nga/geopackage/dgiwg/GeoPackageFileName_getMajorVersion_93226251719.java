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

public class GeoPackageFileName_getMajorVersion_93226251719 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24966;

    public GeoPackageFileName_getMajorVersion_93226251719() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term25015 = new Integer(-615654495);
        Integer term25017 = new Integer(-1476117762);
        Integer term25031 = new Integer(-341962980);
        Integer term25033 = new Integer(1532716628);
        ArrayList term25049 = new ArrayList();
        ((ArrayList) term25049).add("jQWttOAiwL");
        ((ArrayList) term25049).add("DzKFxEuEEC");
        ((ArrayList) term25049).add("CAMnvfDLJL");
        ((ArrayList) term25049).add("mfHtgSbdjD");
        ((ArrayList) term25049).add("cmuaUiHMVL");
        ((ArrayList) term25049).add("xjoSGPWUgu");
        ((ArrayList) term25049).add("uzmqjnOUXu");
        ((ArrayList) term25049).add("xeyjTOCOJb");
        term24966 = newInstance(Class.forName("mil.nga.geopackage.dgiwg.GeoPackageFileName"));
        Object term25047 = newInstance(Class.forName("java.util.Date"));
        setField(term24966, term24966.getClass(), "producer", "LrqwfrKKtS");
        setField(term24966, term24966.getClass(), "dataProduct", "ZUdnQXfzCI");
        setField(term24966, term24966.getClass(), "geographicCoverageArea", "EULDrUNQvw");
        setField(term24966, term24966.getClass(), "zoomLevels", "BtvAvsJSei");
        setField(term24966, term24966.getClass(), "zoomLevel1", term25015);
        setField(term24966, term24966.getClass(), "zoomLevel2", term25017);
        setField(term24966, term24966.getClass(), "version", "vqnBkkxoIa");
        setField(term24966, term24966.getClass(), "majorVersion", term25031);
        setField(term24966, term24966.getClass(), "minorVersion", term25033);
        setField(term24966, term24966.getClass(), "creationDateText", "bycpZjxXFn");
        setLongField(term25047, term25047.getClass(), "fastTime", 1739417792956L);
        setField(term25047, term25047.getClass(), "cdate", null);
        setField(term24966, term24966.getClass(), "creationDate", term25047);
        setField(term24966, term24966.getClass(), "additional", term25049);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.dgiwg.GeoPackageFileName");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMajorVersion", argTypes, term24966, args);
    }

};


