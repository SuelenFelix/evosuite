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

public class BooruItem_getPostURL_5263045882 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2977;

    public BooruItem_getPostURL_5263045882() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2977 = newInstance(Class.forName("loliSnatcher.BooruItem"));
        setField(term2977, term2977.getClass(), "fileURL", "GPSEWEDSTo");
        setField(term2977, term2977.getClass(), "sampleURL", "RCOqfVsRHt");
        setField(term2977, term2977.getClass(), "thumbnailURL", "TSyCeEZPaT");
        setField(term2977, term2977.getClass(), "tags", "JeZFtaqkzW");
        setField(term2977, term2977.getClass(), "postURL", "vOVuNSCCLe");
        setIntField(term2977, term2977.getClass(), "id", -1667990367);
        setIntField(term2977, term2977.getClass(), "width", -1214628358);
        setIntField(term2977, term2977.getClass(), "height", 1102721075);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("loliSnatcher.BooruItem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPostURL", argTypes, term2977, args);
    }

};


