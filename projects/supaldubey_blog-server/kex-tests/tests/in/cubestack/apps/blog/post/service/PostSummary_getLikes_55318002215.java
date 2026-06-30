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

public class PostSummary_getLikes_55318002215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6004;

    public PostSummary_getLikes_55318002215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term6005 = new Long(-6573104506744284592L);
        Object term6141 = newInstance(Class.forName("in.cubestack.apps.blog.post.service.PostSummary$PostMeta"));
        setField(term6141, term6141.getClass(), "name", "");
        setField(term6141, term6141.getClass(), "slug", "");
        Object term6144 = newInstance(Class.forName("in.cubestack.apps.blog.post.service.PostSummary$PostMeta"));
        setField(term6144, term6144.getClass(), "name", "");
        setField(term6144, term6144.getClass(), "slug", "");
        Object term6147 = newInstance(Class.forName("in.cubestack.apps.blog.post.service.PostSummary$PostMeta"));
        setField(term6147, term6147.getClass(), "name", "");
        setField(term6147, term6147.getClass(), "slug", "");
        Object term6150 = newInstance(Class.forName("in.cubestack.apps.blog.post.service.PostSummary$PostMeta"));
        setField(term6150, term6150.getClass(), "name", "");
        setField(term6150, term6150.getClass(), "slug", "");
        Object term6153 = newInstance(Class.forName("in.cubestack.apps.blog.post.service.PostSummary$PostMeta"));
        setField(term6153, term6153.getClass(), "name", "");
        setField(term6153, term6153.getClass(), "slug", "");
        Object term6156 = newInstance(Class.forName("in.cubestack.apps.blog.post.service.PostSummary$PostMeta"));
        setField(term6156, term6156.getClass(), "name", "");
        setField(term6156, term6156.getClass(), "slug", "");
        Object term6159 = newInstance(Class.forName("in.cubestack.apps.blog.post.service.PostSummary$PostMeta"));
        setField(term6159, term6159.getClass(), "name", "");
        setField(term6159, term6159.getClass(), "slug", "");
        ArrayList term6139 = new ArrayList();
        ((ArrayList) term6139).add(term6141);
        ((ArrayList) term6139).add(term6144);
        ((ArrayList) term6139).add(term6147);
        ((ArrayList) term6139).add(term6150);
        ((ArrayList) term6139).add(term6153);
        ((ArrayList) term6139).add(term6156);
        ((ArrayList) term6139).add(term6159);
        Object term6166 = newInstance(Class.forName("in.cubestack.apps.blog.post.service.PostSummary$PostMeta"));
        setField(term6166, term6166.getClass(), "name", "");
        setField(term6166, term6166.getClass(), "slug", "");
        Object term6169 = newInstance(Class.forName("in.cubestack.apps.blog.post.service.PostSummary$PostMeta"));
        setField(term6169, term6169.getClass(), "name", "");
        setField(term6169, term6169.getClass(), "slug", "");
        ArrayList term6164 = new ArrayList();
        ((ArrayList) term6164).add(term6166);
        ((ArrayList) term6164).add(term6169);
        term6004 = newInstance(Class.forName("in.cubestack.apps.blog.post.service.PostSummary"));
        Object term6174 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term6176 = (int[]) newIntArray(4);
        Object term6185 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term6187 = (int[]) newIntArray(4);
        setField(term6004, term6004.getClass(), "id", term6005);
        setField(term6004, term6004.getClass(), "firstName", "JisaWUxcNb");
        setField(term6004, term6004.getClass(), "lastName", "NxgmYPzWCI");
        setField(term6004, term6004.getClass(), "username", "SqjyKmayBx");
        setField(term6004, term6004.getClass(), "title", "XjDhvToxJy");
        setField(term6004, term6004.getClass(), "metaTitle", "nxSTJflLQy");
        setField(term6004, term6004.getClass(), "summary", "FlHzxEfFzI");
        setField(term6004, term6004.getClass(), "slug", "aSATgQUpoe");
        setField(term6004, term6004.getClass(), "postType", "VkPSXewZfB");
        setField(term6004, term6004.getClass(), "postStatus", "ubodzJoMGW");
        setField(term6004, term6004.getClass(), "content", "weddIktxOA");
        setField(term6004, term6004.getClass(), "publishedAt", "uSlMeISsDD");
        setField(term6004, term6004.getClass(), "tags", term6139);
        setField(term6004, term6004.getClass(), "categories", term6164);
        setIntField(term6174, term6174.getClass(), "signum", 1);
        setIntElement(term6176, 0, 1621794386);
        setIntElement(term6176, 1, 864216383);
        setIntElement(term6176, 2, -881266322);
        setIntElement(term6176, 3, -126622889);
        setField(term6174, term6174.getClass(), "mag", term6176);
        setIntField(term6174, term6174.getClass(), "bitCountPlusOne", 0);
        setIntField(term6174, term6174.getClass(), "bitLengthPlusOne", 0);
        setIntField(term6174, term6174.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term6174, term6174.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term6004, term6004.getClass(), "likes", term6174);
        setIntField(term6185, term6185.getClass(), "signum", 1);
        setIntElement(term6187, 0, -141694687);
        setIntElement(term6187, 1, 1643916803);
        setIntElement(term6187, 2, -759585303);
        setIntElement(term6187, 3, 237895233);
        setField(term6185, term6185.getClass(), "mag", term6187);
        setIntField(term6185, term6185.getClass(), "bitCountPlusOne", 0);
        setIntField(term6185, term6185.getClass(), "bitLengthPlusOne", 0);
        setIntField(term6185, term6185.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term6185, term6185.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term6004, term6004.getClass(), "views", term6185);
        setField(term6004, term6004.getClass(), "htmlContent", "bxyfeicqrK");
        setField(term6004, term6004.getClass(), "htmlSummary", "vBnWPlsZMk");
        setField(term6004, term6004.getClass(), "readTime", "fIZsWucfXz");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.post.service.PostSummary");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLikes", argTypes, term6004, args);
    }

};


