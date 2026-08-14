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

public class GeoPackageFileName_getDateConverter_98820903138 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29882;

    public GeoPackageFileName_getDateConverter_98820903138() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term29931 = new Integer(-506958186);
        Integer term29933 = new Integer(-507387516);
        Integer term29947 = new Integer(-1970452551);
        Integer term29949 = new Integer(-1896376975);
        ArrayList term29965 = new ArrayList();
        ((ArrayList) term29965).add("FlxVmiMYKP");
        ((ArrayList) term29965).add("fgOpAWlGYN");
        ((ArrayList) term29965).add("PNzNzzjSXM");
        ((ArrayList) term29965).add("ktKcSZiuGM");
        ((ArrayList) term29965).add("PSOttyUeqv");
        ((ArrayList) term29965).add("HmEvTlmzXo");
        ((ArrayList) term29965).add("BMMonTIZgJ");
        ((ArrayList) term29965).add("QXyFXBjFde");
        term29882 = newInstance(Class.forName("mil.nga.geopackage.dgiwg.GeoPackageFileName"));
        Object term29963 = newInstance(Class.forName("java.util.Date"));
        setField(term29882, term29882.getClass(), "producer", "gXFNBHJSey");
        setField(term29882, term29882.getClass(), "dataProduct", "wUcSfItZgv");
        setField(term29882, term29882.getClass(), "geographicCoverageArea", "rOfPCPHmtJ");
        setField(term29882, term29882.getClass(), "zoomLevels", "EnmiAvfpJv");
        setField(term29882, term29882.getClass(), "zoomLevel1", term29931);
        setField(term29882, term29882.getClass(), "zoomLevel2", term29933);
        setField(term29882, term29882.getClass(), "version", "AdYzLPMcwe");
        setField(term29882, term29882.getClass(), "majorVersion", term29947);
        setField(term29882, term29882.getClass(), "minorVersion", term29949);
        setField(term29882, term29882.getClass(), "creationDateText", "FrTZLybkKk");
        setLongField(term29963, term29963.getClass(), "fastTime", 1400691778698L);
        setField(term29963, term29963.getClass(), "cdate", null);
        setField(term29882, term29882.getClass(), "creationDate", term29963);
        setField(term29882, term29882.getClass(), "additional", term29965);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.dgiwg.GeoPackageFileName");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDateConverter", argTypes, term29882, args);
    }

};


