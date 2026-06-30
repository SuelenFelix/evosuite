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

public class PostSummary_getPublishedAt_84484969214 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5631;

    public PostSummary_getPublishedAt_84484969214() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5632 = new Long(5127676408959197577L);
        Object term5768 = newInstance(Class.forName("in.cubestack.apps.blog.post.service.PostSummary$PostMeta"));
        setField(term5768, term5768.getClass(), "name", "");
        setField(term5768, term5768.getClass(), "slug", "");
        Object term5771 = newInstance(Class.forName("in.cubestack.apps.blog.post.service.PostSummary$PostMeta"));
        setField(term5771, term5771.getClass(), "name", "");
        setField(term5771, term5771.getClass(), "slug", "");
        Object term5774 = newInstance(Class.forName("in.cubestack.apps.blog.post.service.PostSummary$PostMeta"));
        setField(term5774, term5774.getClass(), "name", "");
        setField(term5774, term5774.getClass(), "slug", "");
        Object term5777 = newInstance(Class.forName("in.cubestack.apps.blog.post.service.PostSummary$PostMeta"));
        setField(term5777, term5777.getClass(), "name", "");
        setField(term5777, term5777.getClass(), "slug", "");
        Object term5780 = newInstance(Class.forName("in.cubestack.apps.blog.post.service.PostSummary$PostMeta"));
        setField(term5780, term5780.getClass(), "name", "");
        setField(term5780, term5780.getClass(), "slug", "");
        ArrayList term5766 = new ArrayList();
        ((ArrayList) term5766).add(term5768);
        ((ArrayList) term5766).add(term5771);
        ((ArrayList) term5766).add(term5774);
        ((ArrayList) term5766).add(term5777);
        ((ArrayList) term5766).add(term5780);
        Object term5787 = newInstance(Class.forName("in.cubestack.apps.blog.post.service.PostSummary$PostMeta"));
        setField(term5787, term5787.getClass(), "name", "");
        setField(term5787, term5787.getClass(), "slug", "");
        Object term5790 = newInstance(Class.forName("in.cubestack.apps.blog.post.service.PostSummary$PostMeta"));
        setField(term5790, term5790.getClass(), "name", "");
        setField(term5790, term5790.getClass(), "slug", "");
        Object term5793 = newInstance(Class.forName("in.cubestack.apps.blog.post.service.PostSummary$PostMeta"));
        setField(term5793, term5793.getClass(), "name", "");
        setField(term5793, term5793.getClass(), "slug", "");
        ArrayList term5785 = new ArrayList();
        ((ArrayList) term5785).add(term5787);
        ((ArrayList) term5785).add(term5790);
        ((ArrayList) term5785).add(term5793);
        term5631 = newInstance(Class.forName("in.cubestack.apps.blog.post.service.PostSummary"));
        Object term5798 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term5800 = (int[]) newIntArray(4);
        Object term5809 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term5811 = (int[]) newIntArray(4);
        setField(term5631, term5631.getClass(), "id", term5632);
        setField(term5631, term5631.getClass(), "firstName", "vSeruUyNWX");
        setField(term5631, term5631.getClass(), "lastName", "UkKvaeJfEC");
        setField(term5631, term5631.getClass(), "username", "WPxXsahPRq");
        setField(term5631, term5631.getClass(), "title", "IENRuqmwUU");
        setField(term5631, term5631.getClass(), "metaTitle", "GsWxOwXvSu");
        setField(term5631, term5631.getClass(), "summary", "bKBSncrMEZ");
        setField(term5631, term5631.getClass(), "slug", "yeSXGqQExb");
        setField(term5631, term5631.getClass(), "postType", "uXYcXVYJZM");
        setField(term5631, term5631.getClass(), "postStatus", "BJhjdJUhkz");
        setField(term5631, term5631.getClass(), "content", "cdHYQDgUZR");
        setField(term5631, term5631.getClass(), "publishedAt", "KAORSSPSeV");
        setField(term5631, term5631.getClass(), "tags", term5766);
        setField(term5631, term5631.getClass(), "categories", term5785);
        setIntField(term5798, term5798.getClass(), "signum", 1);
        setIntElement(term5800, 0, 1431346068);
        setIntElement(term5800, 1, -283113660);
        setIntElement(term5800, 2, -1383524811);
        setIntElement(term5800, 3, 815937577);
        setField(term5798, term5798.getClass(), "mag", term5800);
        setIntField(term5798, term5798.getClass(), "bitCountPlusOne", 0);
        setIntField(term5798, term5798.getClass(), "bitLengthPlusOne", 0);
        setIntField(term5798, term5798.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term5798, term5798.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term5631, term5631.getClass(), "likes", term5798);
        setIntField(term5809, term5809.getClass(), "signum", 1);
        setIntElement(term5811, 0, -2141012790);
        setIntElement(term5811, 1, 1180498058);
        setIntElement(term5811, 2, -466025674);
        setIntElement(term5811, 3, 1937134398);
        setField(term5809, term5809.getClass(), "mag", term5811);
        setIntField(term5809, term5809.getClass(), "bitCountPlusOne", 0);
        setIntField(term5809, term5809.getClass(), "bitLengthPlusOne", 0);
        setIntField(term5809, term5809.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term5809, term5809.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term5631, term5631.getClass(), "views", term5809);
        setField(term5631, term5631.getClass(), "htmlContent", "KtuuNAqGCQ");
        setField(term5631, term5631.getClass(), "htmlSummary", "OGQsfjmReM");
        setField(term5631, term5631.getClass(), "readTime", "YsUtbngnRO");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.post.service.PostSummary");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPublishedAt", argTypes, term5631, args);
    }

};


