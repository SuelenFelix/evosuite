package mil.nga.geopackage.extension.im.portrayal;

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
import static mil.nga.geopackage.extension.im.portrayal.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Stylesheets_resetId_21341863422 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1503;

    public Stylesheets_resetId_21341863422() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1503 = newInstance(Class.forName("mil.nga.geopackage.extension.im.portrayal.Stylesheets"));
        byte[] term1518 = (byte[]) newByteArray(6);
        setLongField(term1503, term1503.getClass(), "id", -5447369594017685765L);
        setLongField(term1503, term1503.getClass(), "style_id", -5724112525188606013L);
        setField(term1503, term1503.getClass(), "format", "hxCBltsObl");
        setByteElement(term1518, 0, (byte) 72);
        setByteElement(term1518, 1, (byte) 111);
        setByteElement(term1518, 2, (byte) 99);
        setByteElement(term1518, 3, (byte) -12);
        setByteElement(term1518, 4, (byte) -61);
        setByteElement(term1518, 5, (byte) -85);
        setField(term1503, term1503.getClass(), "stylesheet", term1518);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.im.portrayal.Stylesheets");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "resetId", argTypes, term1503, args);
    }

};


