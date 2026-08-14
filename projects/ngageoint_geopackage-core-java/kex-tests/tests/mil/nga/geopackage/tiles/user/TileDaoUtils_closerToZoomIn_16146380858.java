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
import java.lang.Double;
import java.lang.Integer;

public class TileDaoUtils_closerToZoomIn_16146380858 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3882;
     Object term3890;
     Object term3892;

    public TileDaoUtils_closerToZoomIn_16146380858() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3882 = (double[]) newDoubleArray(7);
        setDoubleElement(term3882, 0, 0.16988691727397487);
        setDoubleElement(term3882, 1, 0.39286935532362843);
        setDoubleElement(term3882, 2, 0.11577948268926874);
        setDoubleElement(term3882, 3, 0.5617009352394552);
        setDoubleElement(term3882, 4, 0.09067063848644474);
        setDoubleElement(term3882, 5, 0.268304014379393);
        setDoubleElement(term3882, 6, 0.7171972879282721);
        term3890 = new Double(0.9006361024877096);
        term3892 = new Integer(890669485);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.tiles.user.TileDaoUtils");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = double.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term3882;
        args[1] = term3890;
        args[2] = term3892;
        callMethod(klass, "closerToZoomIn", argTypes, null, args);
    }

};


