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

public class CoverageDataResults_getWidth_19917970064 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9990;

    public CoverageDataResults_getWidth_19917970064() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term9993 = new Double(0.7859316615744082);
        Double term9995 = new Double(0.6428742553484879);
        Double term9997 = new Double(0.6584165706677267);
        Double term9999 = new Double(0.44268490778872205);
        Double term10001 = new Double(0.7507333108648018);
        Double term10003 = new Double(0.007493740494434409);
        Double term10005 = new Double(0.29172553321356776);
        Double term10007 = new Double(0.9276995636844321);
        Double term10010 = new Double(0.7636130748477434);
        Double term10012 = new Double(0.07901636960861558);
        Double term10014 = new Double(0.18717846301066243);
        Double term10016 = new Double(0.5335953039331021);
        Double term10018 = new Double(0.5725602309856443);
        Double term10020 = new Double(0.5310967137636303);
        term9990 = newInstance(Class.forName("mil.nga.geopackage.extension.coverage.CoverageDataResults"));
        Object[] term9991 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.lang.Double"), 0).getClass(), 2);
        Object[] term9992 = (Object[]) newArray("java.lang.Double", 8);
        Object[] term10009 = (Object[]) newArray("java.lang.Double", 6);
        Object term10022 = newInstance(Class.forName("mil.nga.geopackage.tiles.matrix.TileMatrix"));
        setElement(term9992, 0, term9993);
        setElement(term9992, 1, term9995);
        setElement(term9992, 2, term9997);
        setElement(term9992, 3, term9999);
        setElement(term9992, 4, term10001);
        setElement(term9992, 5, term10003);
        setElement(term9992, 6, term10005);
        setElement(term9992, 7, term10007);
        setElement(term9991, 0, term9992);
        setElement(term10009, 0, term10010);
        setElement(term10009, 1, term10012);
        setElement(term10009, 2, term10014);
        setElement(term10009, 3, term10016);
        setElement(term10009, 4, term10018);
        setElement(term10009, 5, term10020);
        setElement(term9991, 1, term10009);
        setField(term9990, term9990.getClass(), "values", term9991);
        setField(term10022, term10022.getClass(), "contents", null);
        setField(term10022, term10022.getClass(), "tableName", "FwPbDZcHmB");
        setLongField(term10022, term10022.getClass(), "zoomLevel", 1597484336218508869L);
        setLongField(term10022, term10022.getClass(), "matrixWidth", -685023850445639859L);
        setLongField(term10022, term10022.getClass(), "matrixHeight", -6950146046121430355L);
        setLongField(term10022, term10022.getClass(), "tileWidth", 1667122142089513324L);
        setLongField(term10022, term10022.getClass(), "tileHeight", -6342139649364011743L);
        setDoubleField(term10022, term10022.getClass(), "pixelXSize", 0.23129126164078717);
        setDoubleField(term10022, term10022.getClass(), "pixelYSize", 0.6047138318674447);
        setField(term9990, term9990.getClass(), "tileMatrix", term10022);
        setIntField(term9990, term9990.getClass(), "height", 590364439);
        setIntField(term9990, term9990.getClass(), "width", 865208305);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.coverage.CoverageDataResults");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getWidth", argTypes, term9990, args);
    }

};


