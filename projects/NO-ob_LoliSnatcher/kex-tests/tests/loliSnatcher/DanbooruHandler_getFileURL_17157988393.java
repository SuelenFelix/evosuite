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
import java.util.ArrayList;
import java.lang.Object;

public class DanbooruHandler_getFileURL_17157988393 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1825;

    public DanbooruHandler_getFileURL_17157988393() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term1854 = newInstance(Class.forName("loliSnatcher.BooruItem"));
        setField(term1854, term1854.getClass(), "fileURL", "");
        setField(term1854, term1854.getClass(), "sampleURL", "");
        setField(term1854, term1854.getClass(), "thumbnailURL", "");
        setField(term1854, term1854.getClass(), "tags", "");
        setField(term1854, term1854.getClass(), "postURL", "");
        setIntField(term1854, term1854.getClass(), "id", 1063420942);
        setIntField(term1854, term1854.getClass(), "width", 1375330971);
        setIntField(term1854, term1854.getClass(), "height", -478195677);
        ArrayList term1852 = new ArrayList();
        ((ArrayList) term1852).add(term1854);
        term1825 = newInstance(Class.forName("loliSnatcher.DanbooruHandler"));
        setField(term1825, term1825.getClass(), "baseURL", "AKNapTAfmD");
        setIntField(term1825, term1825.getClass(), "pageNum", 1551099402);
        setIntField(term1825, term1825.getClass(), "limit", -2027534003);
        setField(term1825, term1825.getClass(), "prevTags", "xJgPlLxpgC");
        setField(term1825, term1825.getClass(), "fetched", term1852);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("loliSnatcher.DanbooruHandler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "PznxWXsZME";
        callMethod(klass, "getFileURL", argTypes, term1825, args);
    }

};


