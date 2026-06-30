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

public class DanbooruHandler_getSampleURL_17402907434 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1907;

    public DanbooruHandler_getSampleURL_17402907434() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term1936 = newInstance(Class.forName("loliSnatcher.BooruItem"));
        setField(term1936, term1936.getClass(), "fileURL", "");
        setField(term1936, term1936.getClass(), "sampleURL", "");
        setField(term1936, term1936.getClass(), "thumbnailURL", "");
        setField(term1936, term1936.getClass(), "tags", "");
        setField(term1936, term1936.getClass(), "postURL", "");
        setIntField(term1936, term1936.getClass(), "id", -481533957);
        setIntField(term1936, term1936.getClass(), "width", 1240914516);
        setIntField(term1936, term1936.getClass(), "height", -1465035361);
        Object term1945 = newInstance(Class.forName("loliSnatcher.BooruItem"));
        setField(term1945, term1945.getClass(), "fileURL", "");
        setField(term1945, term1945.getClass(), "sampleURL", "");
        setField(term1945, term1945.getClass(), "thumbnailURL", "");
        setField(term1945, term1945.getClass(), "tags", "");
        setField(term1945, term1945.getClass(), "postURL", "");
        setIntField(term1945, term1945.getClass(), "id", 1090617576);
        setIntField(term1945, term1945.getClass(), "width", -1547384488);
        setIntField(term1945, term1945.getClass(), "height", 1442160736);
        Object term1954 = newInstance(Class.forName("loliSnatcher.BooruItem"));
        setField(term1954, term1954.getClass(), "fileURL", "");
        setField(term1954, term1954.getClass(), "sampleURL", "");
        setField(term1954, term1954.getClass(), "thumbnailURL", "");
        setField(term1954, term1954.getClass(), "tags", "");
        setField(term1954, term1954.getClass(), "postURL", "");
        setIntField(term1954, term1954.getClass(), "id", 1114000454);
        setIntField(term1954, term1954.getClass(), "width", -556405712);
        setIntField(term1954, term1954.getClass(), "height", -1772434990);
        Object term1963 = newInstance(Class.forName("loliSnatcher.BooruItem"));
        setField(term1963, term1963.getClass(), "fileURL", "");
        setField(term1963, term1963.getClass(), "sampleURL", "");
        setField(term1963, term1963.getClass(), "thumbnailURL", "");
        setField(term1963, term1963.getClass(), "tags", "");
        setField(term1963, term1963.getClass(), "postURL", "");
        setIntField(term1963, term1963.getClass(), "id", -1845499264);
        setIntField(term1963, term1963.getClass(), "width", -505439934);
        setIntField(term1963, term1963.getClass(), "height", -344842608);
        Object term1972 = newInstance(Class.forName("loliSnatcher.BooruItem"));
        setField(term1972, term1972.getClass(), "fileURL", "");
        setField(term1972, term1972.getClass(), "sampleURL", "");
        setField(term1972, term1972.getClass(), "thumbnailURL", "");
        setField(term1972, term1972.getClass(), "tags", "");
        setField(term1972, term1972.getClass(), "postURL", "");
        setIntField(term1972, term1972.getClass(), "id", 941650513);
        setIntField(term1972, term1972.getClass(), "width", 444029505);
        setIntField(term1972, term1972.getClass(), "height", -1034506028);
        Object term1981 = newInstance(Class.forName("loliSnatcher.BooruItem"));
        setField(term1981, term1981.getClass(), "fileURL", "");
        setField(term1981, term1981.getClass(), "sampleURL", "");
        setField(term1981, term1981.getClass(), "thumbnailURL", "");
        setField(term1981, term1981.getClass(), "tags", "");
        setField(term1981, term1981.getClass(), "postURL", "");
        setIntField(term1981, term1981.getClass(), "id", -1263114719);
        setIntField(term1981, term1981.getClass(), "width", -894662986);
        setIntField(term1981, term1981.getClass(), "height", 304775596);
        ArrayList term1934 = new ArrayList();
        ((ArrayList) term1934).add(term1936);
        ((ArrayList) term1934).add(term1945);
        ((ArrayList) term1934).add(term1954);
        ((ArrayList) term1934).add(term1963);
        ((ArrayList) term1934).add(term1972);
        ((ArrayList) term1934).add(term1981);
        term1907 = newInstance(Class.forName("loliSnatcher.DanbooruHandler"));
        setField(term1907, term1907.getClass(), "baseURL", "ZzIujlwVsw");
        setIntField(term1907, term1907.getClass(), "pageNum", 972867650);
        setIntField(term1907, term1907.getClass(), "limit", 1655935355);
        setField(term1907, term1907.getClass(), "prevTags", "LWyEaeIyAo");
        setField(term1907, term1907.getClass(), "fetched", term1934);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("loliSnatcher.DanbooruHandler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "rLHAoqXgPh";
        callMethod(klass, "getSampleURL", argTypes, term1907, args);
    }

};


