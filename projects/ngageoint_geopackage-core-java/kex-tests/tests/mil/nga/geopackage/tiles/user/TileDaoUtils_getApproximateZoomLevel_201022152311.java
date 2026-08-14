package mil.nga.geopackage.tiles.user;

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
import static mil.nga.geopackage.tiles.user.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.LinkedList;
import java.lang.Object;
import java.lang.Double;

public class TileDaoUtils_getApproximateZoomLevel_201022152311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4043;
     Object term4050;
     Object term4058;
     Object term4143;
     Object term4145;

    public TileDaoUtils_getApproximateZoomLevel_201022152311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4043 = (double[]) newDoubleArray(6);
        setDoubleElement(term4043, 0, 0.05880719443135807);
        setDoubleElement(term4043, 1, 0.34010089048558567);
        setDoubleElement(term4043, 2, 0.19625398866403143);
        setDoubleElement(term4043, 3, 0.45069204793711093);
        setDoubleElement(term4043, 4, 0.9341364461850963);
        setDoubleElement(term4043, 5, 0.9022041121474429);
        term4050 = (double[]) newDoubleArray(7);
        setDoubleElement(term4050, 0, 0.6512870939318848);
        setDoubleElement(term4050, 1, 0.8777038609128434);
        setDoubleElement(term4050, 2, 0.008025683154629148);
        setDoubleElement(term4050, 3, 0.40598298281353484);
        setDoubleElement(term4050, 4, 0.3710067290060264);
        setDoubleElement(term4050, 5, 0.7818620200430967);
        setDoubleElement(term4050, 6, 0.04640022995603543);
        Object term4061 = newInstance(Class.forName("mil.nga.geopackage.tiles.matrix.TileMatrix"));
        setField(term4061, term4061.getClass(), "contents", null);
        setField(term4061, term4061.getClass(), "tableName", "vOuMEpOQAg");
        setLongField(term4061, term4061.getClass(), "zoomLevel", 2354625302846375590L);
        setLongField(term4061, term4061.getClass(), "matrixWidth", 7276637106827860087L);
        setLongField(term4061, term4061.getClass(), "matrixHeight", -3936701866695933852L);
        setLongField(term4061, term4061.getClass(), "tileWidth", 1215116475929634177L);
        setLongField(term4061, term4061.getClass(), "tileHeight", 1597484336218508869L);
        setDoubleField(term4061, term4061.getClass(), "pixelXSize", 0.9123572866833729);
        setDoubleField(term4061, term4061.getClass(), "pixelYSize", 0.40635376375558196);
        Object term4082 = newInstance(Class.forName("mil.nga.geopackage.tiles.matrix.TileMatrix"));
        setField(term4082, term4082.getClass(), "contents", null);
        setField(term4082, term4082.getClass(), "tableName", "");
        setLongField(term4082, term4082.getClass(), "zoomLevel", -685023850445639859L);
        setLongField(term4082, term4082.getClass(), "matrixWidth", -6950146046121430355L);
        setLongField(term4082, term4082.getClass(), "matrixHeight", 1667122142089513324L);
        setLongField(term4082, term4082.getClass(), "tileWidth", -6342139649364011743L);
        setLongField(term4082, term4082.getClass(), "tileHeight", -4924950707540628022L);
        setDoubleField(term4082, term4082.getClass(), "pixelXSize", 0.4772043271031934);
        setDoubleField(term4082, term4082.getClass(), "pixelYSize", 0.2446504549754045);
        Object term4092 = newInstance(Class.forName("mil.nga.geopackage.tiles.matrix.TileMatrix"));
        setField(term4092, term4092.getClass(), "contents", null);
        setField(term4092, term4092.getClass(), "tableName", null);
        setLongField(term4092, term4092.getClass(), "zoomLevel", -4393710401270724527L);
        setLongField(term4092, term4092.getClass(), "matrixWidth", -4822736661741380518L);
        setLongField(term4092, term4092.getClass(), "matrixHeight", -5386201758403679145L);
        setLongField(term4092, term4092.getClass(), "tileWidth", -7268507582722666254L);
        setLongField(term4092, term4092.getClass(), "tileHeight", 5671808784468963649L);
        setDoubleField(term4092, term4092.getClass(), "pixelXSize", 0.6142723998707854);
        setDoubleField(term4092, term4092.getClass(), "pixelYSize", 0.4355627280318103);
        term4058 = new LinkedList();
        ((LinkedList) term4058).add(term4061);
        ((LinkedList) term4058).add(term4082);
        ((LinkedList) term4058).add(term4092);
        ((LinkedList) term4058).add((Object)null);
        ((LinkedList) term4058).add((Object)null);
        ((LinkedList) term4058).add((Object)null);
        ((LinkedList) term4058).add((Object)null);
        ((LinkedList) term4058).add((Object)null);
        ((LinkedList) term4058).add((Object)null);
        term4143 = new Double(0.5335953039331021);
        term4145 = new Double(0.5725602309856443);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.tiles.user.TileDaoUtils");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = Array.newInstance(double.class, 0).getClass();
        argTypes[2] = Class.forName("java.util.List");
        argTypes[3] = double.class;
        argTypes[4] = double.class;
        Object[] args = new Object[5];
        args[0] = term4043;
        args[1] = term4050;
        args[2] = term4058;
        args[3] = term4143;
        args[4] = term4145;
        callMethod(klass, "getApproximateZoomLevel", argTypes, null, args);
    }

};


