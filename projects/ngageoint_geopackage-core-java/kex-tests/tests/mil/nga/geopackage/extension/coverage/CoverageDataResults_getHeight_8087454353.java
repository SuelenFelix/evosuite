package mil.nga.geopackage.extension.coverage;

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
import static mil.nga.geopackage.extension.coverage.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Double;

public class CoverageDataResults_getHeight_8087454353 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9929;

    public CoverageDataResults_getHeight_8087454353() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term9932 = new Double(0.40598298281353484);
        Double term9934 = new Double(0.3710067290060264);
        Double term9936 = new Double(0.7818620200430967);
        Double term9938 = new Double(0.04640022995603543);
        Double term9940 = new Double(0.9123572866833729);
        Double term9943 = new Double(0.40635376375558196);
        Double term9945 = new Double(0.4772043271031934);
        Double term9948 = new Double(0.2446504549754045);
        Double term9950 = new Double(0.6142723998707854);
        Double term9952 = new Double(0.4355627280318103);
        Double term9955 = new Double(0.841460835734741);
        term9929 = newInstance(Class.forName("mil.nga.geopackage.extension.coverage.CoverageDataResults"));
        Object[] term9930 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.lang.Double"), 0).getClass(), 5);
        Object[] term9931 = (Object[]) newArray("java.lang.Double", 5);
        Object[] term9942 = (Object[]) newArray("java.lang.Double", 2);
        Object[] term9947 = (Object[]) newArray("java.lang.Double", 3);
        Object[] term9954 = (Object[]) newArray("java.lang.Double", 1);
        Object[] term9957 = (Object[]) newArray("java.lang.Double", 0);
        Object term9958 = newInstance(Class.forName("mil.nga.geopackage.tiles.matrix.TileMatrix"));
        setElement(term9931, 0, term9932);
        setElement(term9931, 1, term9934);
        setElement(term9931, 2, term9936);
        setElement(term9931, 3, term9938);
        setElement(term9931, 4, term9940);
        setElement(term9930, 0, term9931);
        setElement(term9942, 0, term9943);
        setElement(term9942, 1, term9945);
        setElement(term9930, 1, term9942);
        setElement(term9947, 0, term9948);
        setElement(term9947, 1, term9950);
        setElement(term9947, 2, term9952);
        setElement(term9930, 2, term9947);
        setElement(term9954, 0, term9955);
        setElement(term9930, 3, term9954);
        setElement(term9930, 4, term9957);
        setField(term9929, term9929.getClass(), "values", term9930);
        setField(term9958, term9958.getClass(), "contents", null);
        setField(term9958, term9958.getClass(), "tableName", "RMsXuyzKJV");
        setLongField(term9958, term9958.getClass(), "zoomLevel", -5786861555969446503L);
        setLongField(term9958, term9958.getClass(), "matrixWidth", 2354625302846375590L);
        setLongField(term9958, term9958.getClass(), "matrixHeight", 7276637106827860087L);
        setLongField(term9958, term9958.getClass(), "tileWidth", -3936701866695933852L);
        setLongField(term9958, term9958.getClass(), "tileHeight", 1215116475929634177L);
        setDoubleField(term9958, term9958.getClass(), "pixelXSize", 0.06480976831423468);
        setDoubleField(term9958, term9958.getClass(), "pixelYSize", 0.8490790645379176);
        setField(term9929, term9929.getClass(), "tileMatrix", term9958);
        setIntField(term9929, term9929.getClass(), "height", -1007160944);
        setIntField(term9929, term9929.getClass(), "width", 1135664017);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.coverage.CoverageDataResults");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHeight", argTypes, term9929, args);
    }

};


