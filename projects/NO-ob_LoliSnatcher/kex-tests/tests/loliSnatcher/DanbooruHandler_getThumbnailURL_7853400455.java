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

public class DanbooruHandler_getThumbnailURL_7853400455 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2034;

    public DanbooruHandler_getThumbnailURL_7853400455() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term2063 = newInstance(Class.forName("loliSnatcher.BooruItem"));
        setField(term2063, term2063.getClass(), "fileURL", "");
        setField(term2063, term2063.getClass(), "sampleURL", "");
        setField(term2063, term2063.getClass(), "thumbnailURL", "");
        setField(term2063, term2063.getClass(), "tags", "");
        setField(term2063, term2063.getClass(), "postURL", "");
        setIntField(term2063, term2063.getClass(), "id", 683666002);
        setIntField(term2063, term2063.getClass(), "width", 1596213415);
        setIntField(term2063, term2063.getClass(), "height", -268815336);
        Object term2072 = newInstance(Class.forName("loliSnatcher.BooruItem"));
        setField(term2072, term2072.getClass(), "fileURL", "");
        setField(term2072, term2072.getClass(), "sampleURL", "");
        setField(term2072, term2072.getClass(), "thumbnailURL", "");
        setField(term2072, term2072.getClass(), "tags", "");
        setField(term2072, term2072.getClass(), "postURL", "");
        setIntField(term2072, term2072.getClass(), "id", -1210583429);
        setIntField(term2072, term2072.getClass(), "width", -663691365);
        setIntField(term2072, term2072.getClass(), "height", 339854490);
        ArrayList term2061 = new ArrayList();
        ((ArrayList) term2061).add(term2063);
        ((ArrayList) term2061).add(term2072);
        term2034 = newInstance(Class.forName("loliSnatcher.DanbooruHandler"));
        setField(term2034, term2034.getClass(), "baseURL", "zUlRdimJtU");
        setIntField(term2034, term2034.getClass(), "pageNum", -1347665717);
        setIntField(term2034, term2034.getClass(), "limit", -1888585309);
        setField(term2034, term2034.getClass(), "prevTags", "vwbEQQNQrx");
        setField(term2034, term2034.getClass(), "fetched", term2061);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("loliSnatcher.DanbooruHandler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "RbVQXSpxXy";
        callMethod(klass, "getThumbnailURL", argTypes, term2034, args);
    }

};


