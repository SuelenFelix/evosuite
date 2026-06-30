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

public class PostSummary_getTags_207697200720 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7891;

    public PostSummary_getTags_207697200720() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term7892 = new Long(-4365849114644724155L);
        ArrayList term8026 = new ArrayList();
        Object term8032 = newInstance(Class.forName("in.cubestack.apps.blog.post.service.PostSummary$PostMeta"));
        setField(term8032, term8032.getClass(), "name", "");
        setField(term8032, term8032.getClass(), "slug", "");
        Object term8035 = newInstance(Class.forName("in.cubestack.apps.blog.post.service.PostSummary$PostMeta"));
        setField(term8035, term8035.getClass(), "name", "");
        setField(term8035, term8035.getClass(), "slug", "");
        Object term8038 = newInstance(Class.forName("in.cubestack.apps.blog.post.service.PostSummary$PostMeta"));
        setField(term8038, term8038.getClass(), "name", "");
        setField(term8038, term8038.getClass(), "slug", "");
        Object term8041 = newInstance(Class.forName("in.cubestack.apps.blog.post.service.PostSummary$PostMeta"));
        setField(term8041, term8041.getClass(), "name", "");
        setField(term8041, term8041.getClass(), "slug", "");
        Object term8044 = newInstance(Class.forName("in.cubestack.apps.blog.post.service.PostSummary$PostMeta"));
        setField(term8044, term8044.getClass(), "name", "");
        setField(term8044, term8044.getClass(), "slug", "");
        Object term8047 = newInstance(Class.forName("in.cubestack.apps.blog.post.service.PostSummary$PostMeta"));
        setField(term8047, term8047.getClass(), "name", "");
        setField(term8047, term8047.getClass(), "slug", "");
        Object term8050 = newInstance(Class.forName("in.cubestack.apps.blog.post.service.PostSummary$PostMeta"));
        setField(term8050, term8050.getClass(), "name", "");
        setField(term8050, term8050.getClass(), "slug", "");
        Object term8053 = newInstance(Class.forName("in.cubestack.apps.blog.post.service.PostSummary$PostMeta"));
        setField(term8053, term8053.getClass(), "name", "");
        setField(term8053, term8053.getClass(), "slug", "");
        Object term8056 = newInstance(Class.forName("in.cubestack.apps.blog.post.service.PostSummary$PostMeta"));
        setField(term8056, term8056.getClass(), "name", "");
        setField(term8056, term8056.getClass(), "slug", "");
        ArrayList term8030 = new ArrayList();
        ((ArrayList) term8030).add(term8032);
        ((ArrayList) term8030).add(term8035);
        ((ArrayList) term8030).add(term8038);
        ((ArrayList) term8030).add(term8041);
        ((ArrayList) term8030).add(term8044);
        ((ArrayList) term8030).add(term8047);
        ((ArrayList) term8030).add(term8050);
        ((ArrayList) term8030).add(term8053);
        ((ArrayList) term8030).add(term8056);
        term7891 = newInstance(Class.forName("in.cubestack.apps.blog.post.service.PostSummary"));
        Object term8061 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term8063 = (int[]) newIntArray(4);
        Object term8072 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term8074 = (int[]) newIntArray(4);
        setField(term7891, term7891.getClass(), "id", term7892);
        setField(term7891, term7891.getClass(), "firstName", "EMiMtYgfvr");
        setField(term7891, term7891.getClass(), "lastName", "OyYyYYnJuF");
        setField(term7891, term7891.getClass(), "username", "aYLvcxZohT");
        setField(term7891, term7891.getClass(), "title", "mnHyQbMyld");
        setField(term7891, term7891.getClass(), "metaTitle", "KHtaDOIcJZ");
        setField(term7891, term7891.getClass(), "summary", "vgdwrCZczl");
        setField(term7891, term7891.getClass(), "slug", "gKMNrpKBpu");
        setField(term7891, term7891.getClass(), "postType", "ZbHJVEqcoa");
        setField(term7891, term7891.getClass(), "postStatus", "awDQVEVIKi");
        setField(term7891, term7891.getClass(), "content", "HJwNgUzZZR");
        setField(term7891, term7891.getClass(), "publishedAt", "FvUCZgTXhq");
        setField(term7891, term7891.getClass(), "tags", term8026);
        setField(term7891, term7891.getClass(), "categories", term8030);
        setIntField(term8061, term8061.getClass(), "signum", 1);
        setIntElement(term8063, 0, 1396472396);
        setIntElement(term8063, 1, -2060859936);
        setIntElement(term8063, 2, -1259907501);
        setIntElement(term8063, 3, -1922979571);
        setField(term8061, term8061.getClass(), "mag", term8063);
        setIntField(term8061, term8061.getClass(), "bitCountPlusOne", 0);
        setIntField(term8061, term8061.getClass(), "bitLengthPlusOne", 0);
        setIntField(term8061, term8061.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term8061, term8061.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term7891, term7891.getClass(), "likes", term8061);
        setIntField(term8072, term8072.getClass(), "signum", 1);
        setIntElement(term8074, 0, -789677596);
        setIntElement(term8074, 1, 2125233649);
        setIntElement(term8074, 2, -30111918);
        setIntElement(term8074, 3, 1728725444);
        setField(term8072, term8072.getClass(), "mag", term8074);
        setIntField(term8072, term8072.getClass(), "bitCountPlusOne", 0);
        setIntField(term8072, term8072.getClass(), "bitLengthPlusOne", 0);
        setIntField(term8072, term8072.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term8072, term8072.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term7891, term7891.getClass(), "views", term8072);
        setField(term7891, term7891.getClass(), "htmlContent", "xmzSoVgiED");
        setField(term7891, term7891.getClass(), "htmlSummary", "pdSvedKgPq");
        setField(term7891, term7891.getClass(), "readTime", "epPTwvcoyb");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.post.service.PostSummary");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTags", argTypes, term7891, args);
    }

};


