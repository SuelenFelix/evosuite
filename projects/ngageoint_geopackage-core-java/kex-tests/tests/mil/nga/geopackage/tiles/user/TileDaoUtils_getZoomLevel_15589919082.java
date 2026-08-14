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
import java.lang.Double;

public class TileDaoUtils_getZoomLevel_15589919082 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3628;
     Object term3637;
     Object term3644;
     Object term3647;

    public TileDaoUtils_getZoomLevel_15589919082() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3628 = (double[]) newDoubleArray(8);
        setDoubleElement(term3628, 0, 0.7031006357544823);
        setDoubleElement(term3628, 1, 0.9527281779865117);
        setDoubleElement(term3628, 2, 0.9828442029246764);
        setDoubleElement(term3628, 3, 0.2779719046761513);
        setDoubleElement(term3628, 4, 0.6436713023569729);
        setDoubleElement(term3628, 5, 0.7332741045694002);
        setDoubleElement(term3628, 6, 0.4569171842750229);
        setDoubleElement(term3628, 7, 0.8598297828918529);
        term3637 = (double[]) newDoubleArray(6);
        setDoubleElement(term3637, 0, 0.43692187681405226);
        setDoubleElement(term3637, 1, 0.7633268466829064);
        setDoubleElement(term3637, 2, 0.13481025392611334);
        setDoubleElement(term3637, 3, 0.3800088629986428);
        setDoubleElement(term3637, 4, 0.5840714198152577);
        setDoubleElement(term3637, 5, 0.7559240768573477);
        term3644 = new LinkedList();
        term3647 = new Double(0.10667076642995188);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.tiles.user.TileDaoUtils");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = Array.newInstance(double.class, 0).getClass();
        argTypes[2] = Class.forName("java.util.List");
        argTypes[3] = double.class;
        Object[] args = new Object[4];
        args[0] = term3628;
        args[1] = term3637;
        args[2] = term3644;
        args[3] = term3647;
        callMethod(klass, "getZoomLevel", argTypes, null, args);
    }

};


