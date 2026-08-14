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

public class SymbolImages_getOffsetY_114881984334 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term331;

    public SymbolImages_getOffsetY_114881984334() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term331 = newInstance(Class.forName("mil.nga.geopackage.extension.im.portrayal.SymbolImages"));
        setLongField(term331, term331.getClass(), "id", 0L);
        setLongField(term331, term331.getClass(), "symbol_id", 0L);
        setLongField(term331, term331.getClass(), "content_id", 0L);
        setLongField(term331, term331.getClass(), "width", 0L);
        setLongField(term331, term331.getClass(), "height", 0L);
        setLongField(term331, term331.getClass(), "offsetX", 0L);
        setLongField(term331, term331.getClass(), "offsetY", 0L);
        setLongField(term331, term331.getClass(), "pixelRatio", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.im.portrayal.SymbolImages");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getOffsetY", argTypes, term331, args);
    }

};


