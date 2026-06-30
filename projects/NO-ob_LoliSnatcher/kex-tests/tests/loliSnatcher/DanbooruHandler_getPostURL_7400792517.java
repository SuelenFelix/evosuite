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

public class DanbooruHandler_getPostURL_7400792517 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2252;

    public DanbooruHandler_getPostURL_7400792517() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term2281 = newInstance(Class.forName("loliSnatcher.BooruItem"));
        setField(term2281, term2281.getClass(), "fileURL", "");
        setField(term2281, term2281.getClass(), "sampleURL", "");
        setField(term2281, term2281.getClass(), "thumbnailURL", "");
        setField(term2281, term2281.getClass(), "tags", "");
        setField(term2281, term2281.getClass(), "postURL", "");
        setIntField(term2281, term2281.getClass(), "id", -2015854073);
        setIntField(term2281, term2281.getClass(), "width", 538259104);
        setIntField(term2281, term2281.getClass(), "height", 96566506);
        Object term2290 = newInstance(Class.forName("loliSnatcher.BooruItem"));
        setField(term2290, term2290.getClass(), "fileURL", "");
        setField(term2290, term2290.getClass(), "sampleURL", "");
        setField(term2290, term2290.getClass(), "thumbnailURL", "");
        setField(term2290, term2290.getClass(), "tags", "");
        setField(term2290, term2290.getClass(), "postURL", "");
        setIntField(term2290, term2290.getClass(), "id", -343325701);
        setIntField(term2290, term2290.getClass(), "width", 107945604);
        setIntField(term2290, term2290.getClass(), "height", -1963464809);
        Object term2299 = newInstance(Class.forName("loliSnatcher.BooruItem"));
        setField(term2299, term2299.getClass(), "fileURL", "");
        setField(term2299, term2299.getClass(), "sampleURL", "");
        setField(term2299, term2299.getClass(), "thumbnailURL", "");
        setField(term2299, term2299.getClass(), "tags", "");
        setField(term2299, term2299.getClass(), "postURL", "");
        setIntField(term2299, term2299.getClass(), "id", 71190297);
        setIntField(term2299, term2299.getClass(), "width", 1202361360);
        setIntField(term2299, term2299.getClass(), "height", -2015048153);
        Object term2308 = newInstance(Class.forName("loliSnatcher.BooruItem"));
        setField(term2308, term2308.getClass(), "fileURL", "");
        setField(term2308, term2308.getClass(), "sampleURL", "");
        setField(term2308, term2308.getClass(), "thumbnailURL", "");
        setField(term2308, term2308.getClass(), "tags", "");
        setField(term2308, term2308.getClass(), "postURL", "");
        setIntField(term2308, term2308.getClass(), "id", -2063457669);
        setIntField(term2308, term2308.getClass(), "width", -1222006000);
        setIntField(term2308, term2308.getClass(), "height", 2095798786);
        Object term2317 = newInstance(Class.forName("loliSnatcher.BooruItem"));
        setField(term2317, term2317.getClass(), "fileURL", "");
        setField(term2317, term2317.getClass(), "sampleURL", "");
        setField(term2317, term2317.getClass(), "thumbnailURL", "");
        setField(term2317, term2317.getClass(), "tags", "");
        setField(term2317, term2317.getClass(), "postURL", "");
        setIntField(term2317, term2317.getClass(), "id", -1565502840);
        setIntField(term2317, term2317.getClass(), "width", 344323424);
        setIntField(term2317, term2317.getClass(), "height", 9726679);
        Object term2326 = newInstance(Class.forName("loliSnatcher.BooruItem"));
        setField(term2326, term2326.getClass(), "fileURL", "");
        setField(term2326, term2326.getClass(), "sampleURL", "");
        setField(term2326, term2326.getClass(), "thumbnailURL", "");
        setField(term2326, term2326.getClass(), "tags", "");
        setField(term2326, term2326.getClass(), "postURL", "");
        setIntField(term2326, term2326.getClass(), "id", -25637976);
        setIntField(term2326, term2326.getClass(), "width", 1555897383);
        setIntField(term2326, term2326.getClass(), "height", 202001407);
        Object term2335 = newInstance(Class.forName("loliSnatcher.BooruItem"));
        setField(term2335, term2335.getClass(), "fileURL", "");
        setField(term2335, term2335.getClass(), "sampleURL", "");
        setField(term2335, term2335.getClass(), "thumbnailURL", "");
        setField(term2335, term2335.getClass(), "tags", "");
        setField(term2335, term2335.getClass(), "postURL", "");
        setIntField(term2335, term2335.getClass(), "id", 158873461);
        setIntField(term2335, term2335.getClass(), "width", -430151637);
        setIntField(term2335, term2335.getClass(), "height", -1697741339);
        ArrayList term2279 = new ArrayList();
        ((ArrayList) term2279).add(term2281);
        ((ArrayList) term2279).add(term2290);
        ((ArrayList) term2279).add(term2299);
        ((ArrayList) term2279).add(term2308);
        ((ArrayList) term2279).add(term2317);
        ((ArrayList) term2279).add(term2326);
        ((ArrayList) term2279).add(term2335);
        term2252 = newInstance(Class.forName("loliSnatcher.DanbooruHandler"));
        setField(term2252, term2252.getClass(), "baseURL", "CFyoseFGLF");
        setIntField(term2252, term2252.getClass(), "pageNum", 480137250);
        setIntField(term2252, term2252.getClass(), "limit", -341152642);
        setField(term2252, term2252.getClass(), "prevTags", "SFqCrhEWLm");
        setField(term2252, term2252.getClass(), "fetched", term2279);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("loliSnatcher.DanbooruHandler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "doQLHkjpNm";
        callMethod(klass, "getPostURL", argTypes, term2252, args);
    }

};


