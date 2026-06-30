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

public class PostSummary_getHtmlContent_77432975117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6759;

    public PostSummary_getHtmlContent_77432975117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term6760 = new Long(8428634514691209827L);
        Object term6896 = newInstance(Class.forName("in.cubestack.apps.blog.post.service.PostSummary$PostMeta"));
        setField(term6896, term6896.getClass(), "name", "");
        setField(term6896, term6896.getClass(), "slug", "");
        Object term6899 = newInstance(Class.forName("in.cubestack.apps.blog.post.service.PostSummary$PostMeta"));
        setField(term6899, term6899.getClass(), "name", "");
        setField(term6899, term6899.getClass(), "slug", "");
        ArrayList term6894 = new ArrayList();
        ((ArrayList) term6894).add(term6896);
        ((ArrayList) term6894).add(term6899);
        Object term6906 = newInstance(Class.forName("in.cubestack.apps.blog.post.service.PostSummary$PostMeta"));
        setField(term6906, term6906.getClass(), "name", "");
        setField(term6906, term6906.getClass(), "slug", "");
        Object term6909 = newInstance(Class.forName("in.cubestack.apps.blog.post.service.PostSummary$PostMeta"));
        setField(term6909, term6909.getClass(), "name", "");
        setField(term6909, term6909.getClass(), "slug", "");
        Object term6912 = newInstance(Class.forName("in.cubestack.apps.blog.post.service.PostSummary$PostMeta"));
        setField(term6912, term6912.getClass(), "name", "");
        setField(term6912, term6912.getClass(), "slug", "");
        Object term6915 = newInstance(Class.forName("in.cubestack.apps.blog.post.service.PostSummary$PostMeta"));
        setField(term6915, term6915.getClass(), "name", "");
        setField(term6915, term6915.getClass(), "slug", "");
        Object term6918 = newInstance(Class.forName("in.cubestack.apps.blog.post.service.PostSummary$PostMeta"));
        setField(term6918, term6918.getClass(), "name", "");
        setField(term6918, term6918.getClass(), "slug", "");
        ArrayList term6904 = new ArrayList();
        ((ArrayList) term6904).add(term6906);
        ((ArrayList) term6904).add(term6909);
        ((ArrayList) term6904).add(term6912);
        ((ArrayList) term6904).add(term6915);
        ((ArrayList) term6904).add(term6918);
        term6759 = newInstance(Class.forName("in.cubestack.apps.blog.post.service.PostSummary"));
        Object term6923 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term6925 = (int[]) newIntArray(4);
        Object term6934 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term6936 = (int[]) newIntArray(4);
        setField(term6759, term6759.getClass(), "id", term6760);
        setField(term6759, term6759.getClass(), "firstName", "UxgSdhxPCH");
        setField(term6759, term6759.getClass(), "lastName", "DAujxZPHJC");
        setField(term6759, term6759.getClass(), "username", "IlBhdrCvHq");
        setField(term6759, term6759.getClass(), "title", "OirVUQhauU");
        setField(term6759, term6759.getClass(), "metaTitle", "GLbyDfbNZI");
        setField(term6759, term6759.getClass(), "summary", "oNLcCYDAsO");
        setField(term6759, term6759.getClass(), "slug", "CNqMxLvtcJ");
        setField(term6759, term6759.getClass(), "postType", "ktbqerIaKW");
        setField(term6759, term6759.getClass(), "postStatus", "VoghngXfsK");
        setField(term6759, term6759.getClass(), "content", "GbahCBMvct");
        setField(term6759, term6759.getClass(), "publishedAt", "iiHBhsNFgk");
        setField(term6759, term6759.getClass(), "tags", term6894);
        setField(term6759, term6759.getClass(), "categories", term6904);
        setIntField(term6923, term6923.getClass(), "signum", 1);
        setIntElement(term6925, 0, 424099332);
        setIntElement(term6925, 1, 278178375);
        setIntElement(term6925, 2, 667870343);
        setIntElement(term6925, 3, 2065826437);
        setField(term6923, term6923.getClass(), "mag", term6925);
        setIntField(term6923, term6923.getClass(), "bitCountPlusOne", 0);
        setIntField(term6923, term6923.getClass(), "bitLengthPlusOne", 0);
        setIntField(term6923, term6923.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term6923, term6923.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term6759, term6759.getClass(), "likes", term6923);
        setIntField(term6934, term6934.getClass(), "signum", 1);
        setIntElement(term6936, 0, 279652791);
        setIntElement(term6936, 1, 39512956);
        setIntElement(term6936, 2, -2007846750);
        setIntElement(term6936, 3, 1626703124);
        setField(term6934, term6934.getClass(), "mag", term6936);
        setIntField(term6934, term6934.getClass(), "bitCountPlusOne", 0);
        setIntField(term6934, term6934.getClass(), "bitLengthPlusOne", 0);
        setIntField(term6934, term6934.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term6934, term6934.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term6759, term6759.getClass(), "views", term6934);
        setField(term6759, term6759.getClass(), "htmlContent", "cmuaUiHMVL");
        setField(term6759, term6759.getClass(), "htmlSummary", "xjoSGPWUgu");
        setField(term6759, term6759.getClass(), "readTime", "uzmqjnOUXu");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.post.service.PostSummary");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHtmlContent", argTypes, term6759, args);
    }

};


