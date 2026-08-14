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

public class Stylesheets_getStyleid_242818295 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1615;

    public Stylesheets_getStyleid_242818295() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1615 = newInstance(Class.forName("mil.nga.geopackage.extension.im.portrayal.Stylesheets"));
        byte[] term1630 = (byte[]) newByteArray(2);
        setLongField(term1615, term1615.getClass(), "id", -1677189124507026637L);
        setLongField(term1615, term1615.getClass(), "style_id", 4795660804170399986L);
        setField(term1615, term1615.getClass(), "format", "tShwQLRGNe");
        setByteElement(term1630, 0, (byte) 98);
        setByteElement(term1630, 1, (byte) 79);
        setField(term1615, term1615.getClass(), "stylesheet", term1630);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.im.portrayal.Stylesheets");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStyle_id", argTypes, term1615, args);
    }

};


