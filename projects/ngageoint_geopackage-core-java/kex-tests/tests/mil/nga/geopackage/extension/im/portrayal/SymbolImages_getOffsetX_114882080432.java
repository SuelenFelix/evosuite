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

public class SymbolImages_getOffsetX_114882080432 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term311;

    public SymbolImages_getOffsetX_114882080432() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term311 = newInstance(Class.forName("mil.nga.geopackage.extension.im.portrayal.SymbolImages"));
        setLongField(term311, term311.getClass(), "id", 0L);
        setLongField(term311, term311.getClass(), "symbol_id", 0L);
        setLongField(term311, term311.getClass(), "content_id", 0L);
        setLongField(term311, term311.getClass(), "width", 0L);
        setLongField(term311, term311.getClass(), "height", 0L);
        setLongField(term311, term311.getClass(), "offsetX", 0L);
        setLongField(term311, term311.getClass(), "offsetY", 0L);
        setLongField(term311, term311.getClass(), "pixelRatio", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.im.portrayal.SymbolImages");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getOffsetX", argTypes, term311, args);
    }

};


