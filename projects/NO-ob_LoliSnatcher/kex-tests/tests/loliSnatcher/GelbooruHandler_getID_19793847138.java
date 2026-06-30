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

public class GelbooruHandler_getID_19793847138 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4941;

    public GelbooruHandler_getID_19793847138() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term4994 = newInstance(Class.forName("loliSnatcher.BooruItem"));
        setField(term4994, term4994.getClass(), "fileURL", "");
        setField(term4994, term4994.getClass(), "sampleURL", "");
        setField(term4994, term4994.getClass(), "thumbnailURL", "");
        setField(term4994, term4994.getClass(), "tags", "");
        setField(term4994, term4994.getClass(), "postURL", "");
        setIntField(term4994, term4994.getClass(), "id", -49052672);
        setIntField(term4994, term4994.getClass(), "width", 339372704);
        setIntField(term4994, term4994.getClass(), "height", -851097944);
        Object term5003 = newInstance(Class.forName("loliSnatcher.BooruItem"));
        setField(term5003, term5003.getClass(), "fileURL", "");
        setField(term5003, term5003.getClass(), "sampleURL", "");
        setField(term5003, term5003.getClass(), "thumbnailURL", "");
        setField(term5003, term5003.getClass(), "tags", "");
        setField(term5003, term5003.getClass(), "postURL", "");
        setIntField(term5003, term5003.getClass(), "id", 803925431);
        setIntField(term5003, term5003.getClass(), "width", 76929641);
        setIntField(term5003, term5003.getClass(), "height", -2003192918);
        Object term5012 = newInstance(Class.forName("loliSnatcher.BooruItem"));
        setField(term5012, term5012.getClass(), "fileURL", "");
        setField(term5012, term5012.getClass(), "sampleURL", "");
        setField(term5012, term5012.getClass(), "thumbnailURL", "");
        setField(term5012, term5012.getClass(), "tags", "");
        setField(term5012, term5012.getClass(), "postURL", "");
        setIntField(term5012, term5012.getClass(), "id", -1362856620);
        setIntField(term5012, term5012.getClass(), "width", -1835839814);
        setIntField(term5012, term5012.getClass(), "height", -1404350380);
        Object term5021 = newInstance(Class.forName("loliSnatcher.BooruItem"));
        setField(term5021, term5021.getClass(), "fileURL", "");
        setField(term5021, term5021.getClass(), "sampleURL", "");
        setField(term5021, term5021.getClass(), "thumbnailURL", "");
        setField(term5021, term5021.getClass(), "tags", "");
        setField(term5021, term5021.getClass(), "postURL", "");
        setIntField(term5021, term5021.getClass(), "id", -2013924238);
        setIntField(term5021, term5021.getClass(), "width", 579006268);
        setIntField(term5021, term5021.getClass(), "height", -1694747156);
        Object term5030 = newInstance(Class.forName("loliSnatcher.BooruItem"));
        setField(term5030, term5030.getClass(), "fileURL", "");
        setField(term5030, term5030.getClass(), "sampleURL", "");
        setField(term5030, term5030.getClass(), "thumbnailURL", "");
        setField(term5030, term5030.getClass(), "tags", "");
        setField(term5030, term5030.getClass(), "postURL", "");
        setIntField(term5030, term5030.getClass(), "id", 1466373988);
        setIntField(term5030, term5030.getClass(), "width", -358526505);
        setIntField(term5030, term5030.getClass(), "height", 1843268026);
        Object term5039 = newInstance(Class.forName("loliSnatcher.BooruItem"));
        setField(term5039, term5039.getClass(), "fileURL", "");
        setField(term5039, term5039.getClass(), "sampleURL", "");
        setField(term5039, term5039.getClass(), "thumbnailURL", "");
        setField(term5039, term5039.getClass(), "tags", "");
        setField(term5039, term5039.getClass(), "postURL", "");
        setIntField(term5039, term5039.getClass(), "id", 954660603);
        setIntField(term5039, term5039.getClass(), "width", -1351605385);
        setIntField(term5039, term5039.getClass(), "height", 278355793);
        ArrayList term4992 = new ArrayList();
        ((ArrayList) term4992).add(term4994);
        ((ArrayList) term4992).add(term5003);
        ((ArrayList) term4992).add(term5012);
        ((ArrayList) term4992).add(term5021);
        ((ArrayList) term4992).add(term5030);
        ((ArrayList) term4992).add(term5039);
        term4941 = newInstance(Class.forName("loliSnatcher.GelbooruHandler"));
        setField(term4941, term4941.getClass(), "apiKey", "ceCWHUTQUM");
        setField(term4941, term4941.getClass(), "userID", "LrqwfrKKtS");
        setField(term4941, term4941.getClass(), "baseURL", "ZUdnQXfzCI");
        setIntField(term4941, term4941.getClass(), "pageNum", -634976996);
        setIntField(term4941, term4941.getClass(), "limit", -1015274146);
        setField(term4941, term4941.getClass(), "prevTags", "EULDrUNQvw");
        setField(term4941, term4941.getClass(), "fetched", term4992);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("loliSnatcher.GelbooruHandler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "nrQjODRMLD";
        callMethod(klass, "getID", argTypes, term4941, args);
    }

};


