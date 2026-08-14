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

public class SymbolImages_getContentid_10154871327 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66;

    public SymbolImages_getContentid_10154871327() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term66 = newInstance(Class.forName("mil.nga.geopackage.extension.im.portrayal.SymbolImages"));
        setLongField(term66, term66.getClass(), "id", -5788180182343976541L);
        setLongField(term66, term66.getClass(), "symbol_id", 2936323121573284007L);
        setLongField(term66, term66.getClass(), "content_id", -1154553077993834885L);
        setLongField(term66, term66.getClass(), "width", -2850532706972744550L);
        setLongField(term66, term66.getClass(), "height", -2644215923136513282L);
        setLongField(term66, term66.getClass(), "offsetX", -1468719814009985452L);
        setLongField(term66, term66.getClass(), "offsetY", -7738503207562305297L);
        setLongField(term66, term66.getClass(), "pixelRatio", 3825396310311739952L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.im.portrayal.SymbolImages");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getContent_id", argTypes, term66, args);
    }

};


