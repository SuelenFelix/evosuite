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

public class TileDaoUtils_getClosestZoomLevel_2750199774 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3688;
     Object term3695;
     Object term3704;
     Object term3707;

    public TileDaoUtils_getClosestZoomLevel_2750199774() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3688 = (double[]) newDoubleArray(6);
        setDoubleElement(term3688, 0, 0.3202192021706908);
        setDoubleElement(term3688, 1, 0.22651340641904605);
        setDoubleElement(term3688, 2, 0.8878841294187743);
        setDoubleElement(term3688, 3, 0.6588948704887806);
        setDoubleElement(term3688, 4, 0.6397214730945112);
        setDoubleElement(term3688, 5, 0.25937345430928016);
        term3695 = (double[]) newDoubleArray(8);
        setDoubleElement(term3695, 0, 0.5873228247510078);
        setDoubleElement(term3695, 1, 0.8823181080774973);
        setDoubleElement(term3695, 2, 0.2192450926212024);
        setDoubleElement(term3695, 3, 0.7591353014991907);
        setDoubleElement(term3695, 4, 0.791695029600875);
        setDoubleElement(term3695, 5, 0.6862221294683138);
        setDoubleElement(term3695, 6, 0.15917839663695388);
        setDoubleElement(term3695, 7, 0.9374115574082594);
        term3704 = new LinkedList();
        term3707 = new Double(0.8454723071922143);
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
        args[0] = term3688;
        args[1] = term3695;
        args[2] = term3704;
        args[3] = term3707;
        callMethod(klass, "getClosestZoomLevel", argTypes, null, args);
    }

};


