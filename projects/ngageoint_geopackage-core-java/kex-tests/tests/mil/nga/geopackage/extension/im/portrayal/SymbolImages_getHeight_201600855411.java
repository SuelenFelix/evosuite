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

public class SymbolImages_getHeight_201600855411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term106;

    public SymbolImages_getHeight_201600855411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term106 = newInstance(Class.forName("mil.nga.geopackage.extension.im.portrayal.SymbolImages"));
        setLongField(term106, term106.getClass(), "id", -8652538484981166496L);
        setLongField(term106, term106.getClass(), "symbol_id", 2701184207686293431L);
        setLongField(term106, term106.getClass(), "content_id", 4474998035090263139L);
        setLongField(term106, term106.getClass(), "width", 2848819812340321742L);
        setLongField(term106, term106.getClass(), "height", -8876856890348836498L);
        setLongField(term106, term106.getClass(), "offsetX", 846579494941632714L);
        setLongField(term106, term106.getClass(), "offsetY", 6689117472719450333L);
        setLongField(term106, term106.getClass(), "pixelRatio", 5836128569274066678L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.im.portrayal.SymbolImages");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHeight", argTypes, term106, args);
    }

};


