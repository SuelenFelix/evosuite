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

public class SymbolImages_getOffsetY_114881984315 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term146;

    public SymbolImages_getOffsetY_114881984315() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term146 = newInstance(Class.forName("mil.nga.geopackage.extension.im.portrayal.SymbolImages"));
        setLongField(term146, term146.getClass(), "id", -5386201758403679145L);
        setLongField(term146, term146.getClass(), "symbol_id", -7268507582722666254L);
        setLongField(term146, term146.getClass(), "content_id", 5671808784468963649L);
        setLongField(term146, term146.getClass(), "width", 2297097306706899827L);
        setLongField(term146, term146.getClass(), "height", -900457279156388404L);
        setLongField(term146, term146.getClass(), "offsetX", 1084801489398441516L);
        setLongField(term146, term146.getClass(), "offsetY", 6273754186658578034L);
        setLongField(term146, term146.getClass(), "pixelRatio", 3620247240684476031L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.im.portrayal.SymbolImages");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getOffsetY", argTypes, term146, args);
    }

};


