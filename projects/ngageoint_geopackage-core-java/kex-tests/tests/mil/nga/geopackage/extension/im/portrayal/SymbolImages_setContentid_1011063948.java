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

public class SymbolImages_setContentid_1011063948 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75;
     Object term84;

    public SymbolImages_setContentid_1011063948() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term75 = newInstance(Class.forName("mil.nga.geopackage.extension.im.portrayal.SymbolImages"));
        setLongField(term75, term75.getClass(), "id", -3838084482494604218L);
        setLongField(term75, term75.getClass(), "symbol_id", 3892018155439224435L);
        setLongField(term75, term75.getClass(), "content_id", 5953383087795962419L);
        setLongField(term75, term75.getClass(), "width", 7994303628307559416L);
        setLongField(term75, term75.getClass(), "height", 2443640364875054177L);
        setLongField(term75, term75.getClass(), "offsetX", -1610676979013636850L);
        setLongField(term75, term75.getClass(), "offsetY", 2062173786000223358L);
        setLongField(term75, term75.getClass(), "pixelRatio", -8658027316505137504L);
        term84 = new Long(414749984815662075L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.im.portrayal.SymbolImages");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term84;
        callMethod(klass, "setContent_id", argTypes, term75, args);
    }

};


