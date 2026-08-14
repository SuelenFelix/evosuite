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

public class SymbolImages_getSymbolid_14881895124 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term231;

    public SymbolImages_getSymbolid_14881895124() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term231 = newInstance(Class.forName("mil.nga.geopackage.extension.im.portrayal.SymbolImages"));
        setLongField(term231, term231.getClass(), "id", 0L);
        setLongField(term231, term231.getClass(), "symbol_id", 0L);
        setLongField(term231, term231.getClass(), "content_id", 0L);
        setLongField(term231, term231.getClass(), "width", 0L);
        setLongField(term231, term231.getClass(), "height", 0L);
        setLongField(term231, term231.getClass(), "offsetX", 0L);
        setLongField(term231, term231.getClass(), "offsetY", 0L);
        setLongField(term231, term231.getClass(), "pixelRatio", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.im.portrayal.SymbolImages");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSymbol_id", argTypes, term231, args);
    }

};


