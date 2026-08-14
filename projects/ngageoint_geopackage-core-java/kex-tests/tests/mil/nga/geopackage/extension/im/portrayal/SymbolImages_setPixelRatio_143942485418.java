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

public class SymbolImages_setPixelRatio_143942485418 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term175;
     Object term184;

    public SymbolImages_setPixelRatio_143942485418() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term175 = newInstance(Class.forName("mil.nga.geopackage.extension.im.portrayal.SymbolImages"));
        setLongField(term175, term175.getClass(), "id", -3948863953565024517L);
        setLongField(term175, term175.getClass(), "symbol_id", -6587807377747738663L);
        setLongField(term175, term175.getClass(), "content_id", -6301101997917060727L);
        setLongField(term175, term175.getClass(), "width", 8166095254618543564L);
        setLongField(term175, term175.getClass(), "height", -4598158870068953328L);
        setLongField(term175, term175.getClass(), "offsetX", 138235087558060686L);
        setLongField(term175, term175.getClass(), "offsetY", 5381386339318883012L);
        setLongField(term175, term175.getClass(), "pixelRatio", -1333707622307134180L);
        term184 = new Long(-4360569253593381888L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.im.portrayal.SymbolImages");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term184;
        callMethod(klass, "setPixelRatio", argTypes, term175, args);
    }

};


