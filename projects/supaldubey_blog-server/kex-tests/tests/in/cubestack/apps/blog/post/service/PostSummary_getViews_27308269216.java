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

public class PostSummary_getViews_27308269216 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6380;

    public PostSummary_getViews_27308269216() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term6381 = new Long(-4920224193275732920L);
        Object term6517 = newInstance(Class.forName("in.cubestack.apps.blog.post.service.PostSummary$PostMeta"));
        setField(term6517, term6517.getClass(), "name", "");
        setField(term6517, term6517.getClass(), "slug", "");
        Object term6520 = newInstance(Class.forName("in.cubestack.apps.blog.post.service.PostSummary$PostMeta"));
        setField(term6520, term6520.getClass(), "name", "");
        setField(term6520, term6520.getClass(), "slug", "");
        Object term6523 = newInstance(Class.forName("in.cubestack.apps.blog.post.service.PostSummary$PostMeta"));
        setField(term6523, term6523.getClass(), "name", "");
        setField(term6523, term6523.getClass(), "slug", "");
        Object term6526 = newInstance(Class.forName("in.cubestack.apps.blog.post.service.PostSummary$PostMeta"));
        setField(term6526, term6526.getClass(), "name", "");
        setField(term6526, term6526.getClass(), "slug", "");
        Object term6529 = newInstance(Class.forName("in.cubestack.apps.blog.post.service.PostSummary$PostMeta"));
        setField(term6529, term6529.getClass(), "name", "");
        setField(term6529, term6529.getClass(), "slug", "");
        Object term6532 = newInstance(Class.forName("in.cubestack.apps.blog.post.service.PostSummary$PostMeta"));
        setField(term6532, term6532.getClass(), "name", "");
        setField(term6532, term6532.getClass(), "slug", "");
        ArrayList term6515 = new ArrayList();
        ((ArrayList) term6515).add(term6517);
        ((ArrayList) term6515).add(term6520);
        ((ArrayList) term6515).add(term6523);
        ((ArrayList) term6515).add(term6526);
        ((ArrayList) term6515).add(term6529);
        ((ArrayList) term6515).add(term6532);
        Object term6539 = newInstance(Class.forName("in.cubestack.apps.blog.post.service.PostSummary$PostMeta"));
        setField(term6539, term6539.getClass(), "name", "");
        setField(term6539, term6539.getClass(), "slug", "");
        Object term6542 = newInstance(Class.forName("in.cubestack.apps.blog.post.service.PostSummary$PostMeta"));
        setField(term6542, term6542.getClass(), "name", "");
        setField(term6542, term6542.getClass(), "slug", "");
        Object term6545 = newInstance(Class.forName("in.cubestack.apps.blog.post.service.PostSummary$PostMeta"));
        setField(term6545, term6545.getClass(), "name", "");
        setField(term6545, term6545.getClass(), "slug", "");
        Object term6548 = newInstance(Class.forName("in.cubestack.apps.blog.post.service.PostSummary$PostMeta"));
        setField(term6548, term6548.getClass(), "name", "");
        setField(term6548, term6548.getClass(), "slug", "");
        ArrayList term6537 = new ArrayList();
        ((ArrayList) term6537).add(term6539);
        ((ArrayList) term6537).add(term6542);
        ((ArrayList) term6537).add(term6545);
        ((ArrayList) term6537).add(term6548);
        ((ArrayList) term6537).add(term6542);
        ((ArrayList) term6537).add(term6545);
        term6380 = newInstance(Class.forName("in.cubestack.apps.blog.post.service.PostSummary"));
        Object term6553 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term6555 = (int[]) newIntArray(4);
        Object term6564 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term6566 = (int[]) newIntArray(4);
        setField(term6380, term6380.getClass(), "id", term6381);
        setField(term6380, term6380.getClass(), "firstName", "IApvtmfhnq");
        setField(term6380, term6380.getClass(), "lastName", "VSaNnhMpRc");
        setField(term6380, term6380.getClass(), "username", "QNjNTLlUaV");
        setField(term6380, term6380.getClass(), "title", "hIYsRyOZxk");
        setField(term6380, term6380.getClass(), "metaTitle", "RjNoEywJbC");
        setField(term6380, term6380.getClass(), "summary", "RTTvrwwhou");
        setField(term6380, term6380.getClass(), "slug", "lRORwXipuk");
        setField(term6380, term6380.getClass(), "postType", "fVdTcjgHdw");
        setField(term6380, term6380.getClass(), "postStatus", "wwAwLLcLPp");
        setField(term6380, term6380.getClass(), "content", "nHpMKOmlpQ");
        setField(term6380, term6380.getClass(), "publishedAt", "fKhrQsJToZ");
        setField(term6380, term6380.getClass(), "tags", term6515);
        setField(term6380, term6380.getClass(), "categories", term6537);
        setIntField(term6553, term6553.getClass(), "signum", 1);
        setIntElement(term6555, 0, 575708700);
        setIntElement(term6555, 1, 2121050859);
        setIntElement(term6555, 2, 126015623);
        setIntElement(term6555, 3, -1607592672);
        setField(term6553, term6553.getClass(), "mag", term6555);
        setIntField(term6553, term6553.getClass(), "bitCountPlusOne", 0);
        setIntField(term6553, term6553.getClass(), "bitLengthPlusOne", 0);
        setIntField(term6553, term6553.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term6553, term6553.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term6380, term6380.getClass(), "likes", term6553);
        setIntField(term6564, term6564.getClass(), "signum", 1);
        setIntElement(term6566, 0, -360922875);
        setIntElement(term6566, 1, -79459861);
        setIntElement(term6566, 2, -2078380282);
        setIntElement(term6566, 3, -1746405494);
        setField(term6564, term6564.getClass(), "mag", term6566);
        setIntField(term6564, term6564.getClass(), "bitCountPlusOne", 0);
        setIntField(term6564, term6564.getClass(), "bitLengthPlusOne", 0);
        setIntField(term6564, term6564.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term6564, term6564.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term6380, term6380.getClass(), "views", term6564);
        setField(term6380, term6380.getClass(), "htmlContent", "BXTjEyEZxD");
        setField(term6380, term6380.getClass(), "htmlSummary", "oKhVzOKUFW");
        setField(term6380, term6380.getClass(), "readTime", "mNHyqmOAFy");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.post.service.PostSummary");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getViews", argTypes, term6380, args);
    }

};


