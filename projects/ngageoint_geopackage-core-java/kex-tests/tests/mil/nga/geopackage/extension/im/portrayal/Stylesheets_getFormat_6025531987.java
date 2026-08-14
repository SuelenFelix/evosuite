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

public class Stylesheets_getFormat_6025531987 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1679;

    public Stylesheets_getFormat_6025531987() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1679 = newInstance(Class.forName("mil.nga.geopackage.extension.im.portrayal.Stylesheets"));
        byte[] term1694 = (byte[]) newByteArray(1);
        setLongField(term1679, term1679.getClass(), "id", 3412644969878030772L);
        setLongField(term1679, term1679.getClass(), "style_id", 6698455537431331246L);
        setField(term1679, term1679.getClass(), "format", "xLbjWUgOIL");
        setByteElement(term1694, 0, (byte) 116);
        setField(term1679, term1679.getClass(), "stylesheet", term1694);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.im.portrayal.Stylesheets");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFormat", argTypes, term1679, args);
    }

};


