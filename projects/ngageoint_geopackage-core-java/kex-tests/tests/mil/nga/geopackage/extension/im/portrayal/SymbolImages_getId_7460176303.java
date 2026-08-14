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

public class SymbolImages_getId_7460176303 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26;

    public SymbolImages_getId_7460176303() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26 = newInstance(Class.forName("mil.nga.geopackage.extension.im.portrayal.SymbolImages"));
        setLongField(term26, term26.getClass(), "id", -316468845751588286L);
        setLongField(term26, term26.getClass(), "symbol_id", 5127676408959197577L);
        setLongField(term26, term26.getClass(), "content_id", -6573104506744284592L);
        setLongField(term26, term26.getClass(), "width", -4920224193275732920L);
        setLongField(term26, term26.getClass(), "height", 8428634514691209827L);
        setLongField(term26, term26.getClass(), "offsetX", -2585684163342970173L);
        setLongField(term26, term26.getClass(), "offsetY", 8059786003080744426L);
        setLongField(term26, term26.getClass(), "pixelRatio", -4365849114644724155L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.im.portrayal.SymbolImages");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term26, args);
    }

};


