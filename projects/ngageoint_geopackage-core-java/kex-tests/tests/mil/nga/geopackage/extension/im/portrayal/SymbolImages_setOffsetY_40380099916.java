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

public class SymbolImages_setOffsetY_40380099916 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term155;
     Object term164;

    public SymbolImages_setOffsetY_40380099916() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term155 = newInstance(Class.forName("mil.nga.geopackage.extension.im.portrayal.SymbolImages"));
        setLongField(term155, term155.getClass(), "id", 8313800941204938919L);
        setLongField(term155, term155.getClass(), "symbol_id", -1214968196781083707L);
        setLongField(term155, term155.getClass(), "content_id", -1804015692891701666L);
        setLongField(term155, term155.getClass(), "width", -6432617521836576658L);
        setLongField(term155, term155.getClass(), "height", -2255965562447970862L);
        setLongField(term155, term155.getClass(), "offsetX", 148047808219672941L);
        setLongField(term155, term155.getClass(), "offsetY", 7489064039921396098L);
        setLongField(term155, term155.getClass(), "pixelRatio", 6843866297465638866L);
        term164 = new Long(-4023935540989049732L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.im.portrayal.SymbolImages");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term164;
        callMethod(klass, "setOffsetY", argTypes, term155, args);
    }

};


