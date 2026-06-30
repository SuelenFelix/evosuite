package loliSnatcher;

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
import static loliSnatcher.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class BooruItem_getHeight_7682678916 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3433;

    public BooruItem_getHeight_7682678916() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3433 = newInstance(Class.forName("loliSnatcher.BooruItem"));
        setField(term3433, term3433.getClass(), "fileURL", "jNxbVmoZgq");
        setField(term3433, term3433.getClass(), "sampleURL", "PvmBHIXaMY");
        setField(term3433, term3433.getClass(), "thumbnailURL", "hulYxtowxw");
        setField(term3433, term3433.getClass(), "tags", "GNEmuHPNcU");
        setField(term3433, term3433.getClass(), "postURL", "IoSfuKDFRe");
        setIntField(term3433, term3433.getClass(), "id", 806595993);
        setIntField(term3433, term3433.getClass(), "width", 548228925);
        setIntField(term3433, term3433.getClass(), "height", -749861210);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("loliSnatcher.BooruItem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHeight", argTypes, term3433, args);
    }

};


