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

public class SymbolImages_getWidth_10959071719 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term86;

    public SymbolImages_getWidth_10959071719() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term86 = newInstance(Class.forName("mil.nga.geopackage.extension.im.portrayal.SymbolImages"));
        setLongField(term86, term86.getClass(), "id", 463622836963501975L);
        setLongField(term86, term86.getClass(), "symbol_id", 305759998609888272L);
        setLongField(term86, term86.getClass(), "content_id", -8654565919063661957L);
        setLongField(term86, term86.getClass(), "width", -5248475803419977214L);
        setLongField(term86, term86.getClass(), "height", -6723783499250797216L);
        setLongField(term86, term86.getClass(), "offsetX", 41775768178052008L);
        setLongField(term86, term86.getClass(), "offsetY", 6682528376118987775L);
        setLongField(term86, term86.getClass(), "pixelRatio", 682356318767179819L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.im.portrayal.SymbolImages");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getWidth", argTypes, term86, args);
    }

};


