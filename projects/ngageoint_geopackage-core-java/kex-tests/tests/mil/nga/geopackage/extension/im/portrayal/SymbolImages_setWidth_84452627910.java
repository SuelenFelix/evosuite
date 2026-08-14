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

public class SymbolImages_setWidth_84452627910 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term95;
     Object term104;

    public SymbolImages_setWidth_84452627910() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term95 = newInstance(Class.forName("mil.nga.geopackage.extension.im.portrayal.SymbolImages"));
        setLongField(term95, term95.getClass(), "id", -7291743527973326814L);
        setLongField(term95, term95.getClass(), "symbol_id", -5963439350418910964L);
        setLongField(term95, term95.getClass(), "content_id", 9013624480170062917L);
        setLongField(term95, term95.getClass(), "width", 7862575738391801707L);
        setLongField(term95, term95.getClass(), "height", 50358265865610362L);
        setLongField(term95, term95.getClass(), "offsetX", 5510783420697225605L);
        setLongField(term95, term95.getClass(), "offsetY", 6005241913654469005L);
        setLongField(term95, term95.getClass(), "pixelRatio", -1983291584002806658L);
        term104 = new Long(5946780097489996391L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.im.portrayal.SymbolImages");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term104;
        callMethod(klass, "setWidth", argTypes, term95, args);
    }

};


