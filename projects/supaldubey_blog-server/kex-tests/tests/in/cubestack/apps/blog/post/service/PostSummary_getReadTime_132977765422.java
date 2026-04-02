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

public class PostSummary_getReadTime_132977765422 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8646;

    public PostSummary_getReadTime_132977765422() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term8647 = new Long(7009926388951271268L);
        Object term8783 = newInstance(Class.forName("in.cubestack.apps.blog.post.service.PostSummary$PostMeta"));
        setField(term8783, term8783.getClass(), "name", "");
        setField(term8783, term8783.getClass(), "slug", "");
        Object term8786 = newInstance(Class.forName("in.cubestack.apps.blog.post.service.PostSummary$PostMeta"));
        setField(term8786, term8786.getClass(), "name", "");
        setField(term8786, term8786.getClass(), "slug", "");
        Object term8789 = newInstance(Class.forName("in.cubestack.apps.blog.post.service.PostSummary$PostMeta"));
        setField(term8789, term8789.getClass(), "name", "");
        setField(term8789, term8789.getClass(), "slug", "");
        Object term8792 = newInstance(Class.forName("in.cubestack.apps.blog.post.service.PostSummary$PostMeta"));
        setField(term8792, term8792.getClass(), "name", "");
        setField(term8792, term8792.getClass(), "slug", "");
        Object term8795 = newInstance(Class.forName("in.cubestack.apps.blog.post.service.PostSummary$PostMeta"));
        setField(term8795, term8795.getClass(), "name", "");
        setField(term8795, term8795.getClass(), "slug", "");
        Object term8798 = newInstance(Class.forName("in.cubestack.apps.blog.post.service.PostSummary$PostMeta"));
        setField(term8798, term8798.getClass(), "name", "");
        setField(term8798, term8798.getClass(), "slug", "");
        ArrayList term8781 = new ArrayList();
        ((ArrayList) term8781).add(term8783);
        ((ArrayList) term8781).add(term8786);
        ((ArrayList) term8781).add(term8789);
        ((ArrayList) term8781).add(term8792);
        ((ArrayList) term8781).add(term8795);
        ((ArrayList) term8781).add(term8798);
        Object term8805 = newInstance(Class.forName("in.cubestack.apps.blog.post.service.PostSummary$PostMeta"));
        setField(term8805, term8805.getClass(), "name", "");
        setField(term8805, term8805.getClass(), "slug", "");
        Object term8808 = newInstance(Class.forName("in.cubestack.apps.blog.post.service.PostSummary$PostMeta"));
        setField(term8808, term8808.getClass(), "name", "");
        setField(term8808, term8808.getClass(), "slug", "");
        ArrayList term8803 = new ArrayList();
        ((ArrayList) term8803).add(term8805);
        ((ArrayList) term8803).add(term8808);
        term8646 = newInstance(Class.forName("in.cubestack.apps.blog.post.service.PostSummary"));
        Object term8813 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term8815 = (int[]) newIntArray(4);
        Object term8824 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term8826 = (int[]) newIntArray(4);
        setField(term8646, term8646.getClass(), "id", term8647);
        setField(term8646, term8646.getClass(), "firstName", "NZdTuwSCIM");
        setField(term8646, term8646.getClass(), "lastName", "dDHcmzPAmP");
        setField(term8646, term8646.getClass(), "username", "HEaTkWYBgv");
        setField(term8646, term8646.getClass(), "title", "MpJsPKLTIU");
        setField(term8646, term8646.getClass(), "metaTitle", "IiNCZfdouL");
        setField(term8646, term8646.getClass(), "summary", "AhOHzCsHKW");
        setField(term8646, term8646.getClass(), "slug", "UqgLPaaAHi");
        setField(term8646, term8646.getClass(), "postType", "xypryEkUPF");
        setField(term8646, term8646.getClass(), "postStatus", "zyZTzHNjQr");
        setField(term8646, term8646.getClass(), "content", "YSrFKQQwXE");
        setField(term8646, term8646.getClass(), "publishedAt", "qxhOsmyyjm");
        setField(term8646, term8646.getClass(), "tags", term8781);
        setField(term8646, term8646.getClass(), "categories", term8803);
        setIntField(term8813, term8813.getClass(), "signum", 1);
        setIntElement(term8815, 0, -1324232828);
        setIntElement(term8815, 1, 1852426136);
        setIntElement(term8815, 2, -1851277557);
        setIntElement(term8815, 3, -903339850);
        setField(term8813, term8813.getClass(), "mag", term8815);
        setIntField(term8813, term8813.getClass(), "bitCountPlusOne", 0);
        setIntField(term8813, term8813.getClass(), "bitLengthPlusOne", 0);
        setIntField(term8813, term8813.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term8813, term8813.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term8646, term8646.getClass(), "likes", term8813);
        setIntField(term8824, term8824.getClass(), "signum", 1);
        setIntElement(term8826, 0, -410725284);
        setIntElement(term8826, 1, -584036954);
        setIntElement(term8826, 2, 51969616);
        setIntElement(term8826, 3, -152693189);
        setField(term8824, term8824.getClass(), "mag", term8826);
        setIntField(term8824, term8824.getClass(), "bitCountPlusOne", 0);
        setIntField(term8824, term8824.getClass(), "bitLengthPlusOne", 0);
        setIntField(term8824, term8824.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term8824, term8824.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term8646, term8646.getClass(), "views", term8824);
        setField(term8646, term8646.getClass(), "htmlContent", "BcENaQFYSd");
        setField(term8646, term8646.getClass(), "htmlSummary", "POPYycoDBy");
        setField(term8646, term8646.getClass(), "readTime", "LuWMOXdAPA");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.post.service.PostSummary");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getReadTime", argTypes, term8646, args);
    }

};


