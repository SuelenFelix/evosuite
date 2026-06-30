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

public class BooruItem_getThumbnailURL_20517238845 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3319;

    public BooruItem_getThumbnailURL_20517238845() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3319 = newInstance(Class.forName("loliSnatcher.BooruItem"));
        setField(term3319, term3319.getClass(), "fileURL", "mLwibAPEsa");
        setField(term3319, term3319.getClass(), "sampleURL", "zsWKWiTFuo");
        setField(term3319, term3319.getClass(), "thumbnailURL", "UPUbwyHQKN");
        setField(term3319, term3319.getClass(), "tags", "lgQkrXANyI");
        setField(term3319, term3319.getClass(), "postURL", "MeTmRZXErV");
        setIntField(term3319, term3319.getClass(), "id", 318591690);
        setIntField(term3319, term3319.getClass(), "width", -165587447);
        setIntField(term3319, term3319.getClass(), "height", -1347358701);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("loliSnatcher.BooruItem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getThumbnailURL", argTypes, term3319, args);
    }

};


