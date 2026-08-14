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

public class SymbolImages_setContentid_10110639427 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term260;
     Object term269;

    public SymbolImages_setContentid_10110639427() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term260 = newInstance(Class.forName("mil.nga.geopackage.extension.im.portrayal.SymbolImages"));
        setLongField(term260, term260.getClass(), "id", 0L);
        setLongField(term260, term260.getClass(), "symbol_id", 0L);
        setLongField(term260, term260.getClass(), "content_id", 0L);
        setLongField(term260, term260.getClass(), "width", 0L);
        setLongField(term260, term260.getClass(), "height", 0L);
        setLongField(term260, term260.getClass(), "offsetX", 0L);
        setLongField(term260, term260.getClass(), "offsetY", 0L);
        setLongField(term260, term260.getClass(), "pixelRatio", 0L);
        term269 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.im.portrayal.SymbolImages");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term269;
        callMethod(klass, "setContent_id", argTypes, term260, args);
    }

};


