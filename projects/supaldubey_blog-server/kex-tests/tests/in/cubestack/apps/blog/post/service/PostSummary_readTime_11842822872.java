package in.cubestack.apps.blog.post.service;

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
import static in.cubestack.apps.blog.post.service.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.util.ArrayList;
import java.lang.Object;

public class PostSummary_readTime_11842822872 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1161;

    public PostSummary_readTime_11842822872() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1162 = new Long(7411271909051562686L);
        Object term1298 = newInstance(Class.forName("in.cubestack.apps.blog.post.service.PostSummary$PostMeta"));
        setField(term1298, term1298.getClass(), "name", "");
        setField(term1298, term1298.getClass(), "slug", "");
        Object term1301 = newInstance(Class.forName("in.cubestack.apps.blog.post.service.PostSummary$PostMeta"));
        setField(term1301, term1301.getClass(), "name", "");
        setField(term1301, term1301.getClass(), "slug", "");
        Object term1304 = newInstance(Class.forName("in.cubestack.apps.blog.post.service.PostSummary$PostMeta"));
        setField(term1304, term1304.getClass(), "name", "");
        setField(term1304, term1304.getClass(), "slug", "");
        ArrayList term1296 = new ArrayList();
        ((ArrayList) term1296).add(term1298);
        ((ArrayList) term1296).add(term1301);
        ((ArrayList) term1296).add(term1304);
        Object term1311 = newInstance(Class.forName("in.cubestack.apps.blog.post.service.PostSummary$PostMeta"));
        setField(term1311, term1311.getClass(), "name", "");
        setField(term1311, term1311.getClass(), "slug", "");
        Object term1314 = newInstance(Class.forName("in.cubestack.apps.blog.post.service.PostSummary$PostMeta"));
        setField(term1314, term1314.getClass(), "name", "");
        setField(term1314, term1314.getClass(), "slug", "");
        Object term1317 = newInstance(Class.forName("in.cubestack.apps.blog.post.service.PostSummary$PostMeta"));
        setField(term1317, term1317.getClass(), "name", "");
        setField(term1317, term1317.getClass(), "slug", "");
        Object term1320 = newInstance(Class.forName("in.cubestack.apps.blog.post.service.PostSummary$PostMeta"));
        setField(term1320, term1320.getClass(), "name", "");
        setField(term1320, term1320.getClass(), "slug", "");
        ArrayList term1309 = new ArrayList();
        ((ArrayList) term1309).add(term1311);
        ((ArrayList) term1309).add(term1314);
        ((ArrayList) term1309).add(term1317);
        ((ArrayList) term1309).add(term1320);
        term1161 = newInstance(Class.forName("in.cubestack.apps.blog.post.service.PostSummary"));
        Object term1325 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term1327 = (int[]) newIntArray(4);
        Object term1336 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term1338 = (int[]) newIntArray(4);
        setField(term1161, term1161.getClass(), "id", term1162);
        setField(term1161, term1161.getClass(), "firstName", "fhkbdRViHi");
        setField(term1161, term1161.getClass(), "lastName", "uWHnvSvaPl");
        setField(term1161, term1161.getClass(), "username", "kBdSllIBVz");
        setField(term1161, term1161.getClass(), "title", "TJmVBGfTML");
        setField(term1161, term1161.getClass(), "metaTitle", "tPlsykYBqO");
        setField(term1161, term1161.getClass(), "summary", "bLPjGVBhlX");
        setField(term1161, term1161.getClass(), "slug", "whBvTVIIlC");
        setField(term1161, term1161.getClass(), "postType", "IgRJUzaCwW");
        setField(term1161, term1161.getClass(), "postStatus", "JUmudUmaaV");
        setField(term1161, term1161.getClass(), "content", "KoyGrUJeJW");
        setField(term1161, term1161.getClass(), "publishedAt", "HqBOwkVqjD");
        setField(term1161, term1161.getClass(), "tags", term1296);
        setField(term1161, term1161.getClass(), "categories", term1309);
        setIntField(term1325, term1325.getClass(), "signum", 1);
        setIntElement(term1327, 0, -890532197);
        setIntElement(term1327, 1, 1140403369);
        setIntElement(term1327, 2, 1309324128);
        setIntElement(term1327, 3, 1465941822);
        setField(term1325, term1325.getClass(), "mag", term1327);
        setIntField(term1325, term1325.getClass(), "bitCountPlusOne", 0);
        setIntField(term1325, term1325.getClass(), "bitLengthPlusOne", 0);
        setIntField(term1325, term1325.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term1325, term1325.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term1161, term1161.getClass(), "likes", term1325);
        setIntField(term1336, term1336.getClass(), "signum", 1);
        setIntElement(term1338, 0, 2037839064);
        setIntElement(term1338, 1, -1644256257);
        setIntElement(term1338, 2, -32263804);
        setIntElement(term1338, 3, -252903944);
        setField(term1336, term1336.getClass(), "mag", term1338);
        setIntField(term1336, term1336.getClass(), "bitCountPlusOne", 0);
        setIntField(term1336, term1336.getClass(), "bitLengthPlusOne", 0);
        setIntField(term1336, term1336.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term1336, term1336.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term1161, term1161.getClass(), "views", term1336);
        setField(term1161, term1161.getClass(), "htmlContent", "jSpAteRute");
        setField(term1161, term1161.getClass(), "htmlSummary", "swZVeJAxjt");
        setField(term1161, term1161.getClass(), "readTime", "xOcJIiQQDu");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.post.service.PostSummary");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "GVizqqzXpy";
        callMethod(klass, "readTime", argTypes, term1161, args);
    }

};


