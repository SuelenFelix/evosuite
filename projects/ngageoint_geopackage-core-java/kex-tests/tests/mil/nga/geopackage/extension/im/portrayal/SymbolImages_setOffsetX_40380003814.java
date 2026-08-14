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

public class SymbolImages_setOffsetX_40380003814 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term135;
     Object term144;

    public SymbolImages_setOffsetX_40380003814() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term135 = newInstance(Class.forName("mil.nga.geopackage.extension.im.portrayal.SymbolImages"));
        setLongField(term135, term135.getClass(), "id", 1215116475929634177L);
        setLongField(term135, term135.getClass(), "symbol_id", 1597484336218508869L);
        setLongField(term135, term135.getClass(), "content_id", -685023850445639859L);
        setLongField(term135, term135.getClass(), "width", -6950146046121430355L);
        setLongField(term135, term135.getClass(), "height", 1667122142089513324L);
        setLongField(term135, term135.getClass(), "offsetX", -6342139649364011743L);
        setLongField(term135, term135.getClass(), "offsetY", -4924950707540628022L);
        setLongField(term135, term135.getClass(), "pixelRatio", -4393710401270724527L);
        term144 = new Long(-4822736661741380518L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.im.portrayal.SymbolImages");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term144;
        callMethod(klass, "setOffsetX", argTypes, term135, args);
    }

};


