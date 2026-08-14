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
import java.lang.Long;

public class SymbolImages_setWidth_84452627929 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term280;
     Object term289;

    public SymbolImages_setWidth_84452627929() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term280 = newInstance(Class.forName("mil.nga.geopackage.extension.im.portrayal.SymbolImages"));
        setLongField(term280, term280.getClass(), "id", 0L);
        setLongField(term280, term280.getClass(), "symbol_id", 0L);
        setLongField(term280, term280.getClass(), "content_id", 0L);
        setLongField(term280, term280.getClass(), "width", 0L);
        setLongField(term280, term280.getClass(), "height", 0L);
        setLongField(term280, term280.getClass(), "offsetX", 0L);
        setLongField(term280, term280.getClass(), "offsetY", 0L);
        setLongField(term280, term280.getClass(), "pixelRatio", 0L);
        term289 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.im.portrayal.SymbolImages");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term289;
        callMethod(klass, "setWidth", argTypes, term280, args);
    }

};


