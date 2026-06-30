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

public class PostSummary_getPostType_80441158512 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4873;

    public PostSummary_getPostType_80441158512() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4874 = new Long(-872011222785455006L);
        Object term5010 = newInstance(Class.forName("in.cubestack.apps.blog.post.service.PostSummary$PostMeta"));
        setField(term5010, term5010.getClass(), "name", "");
        setField(term5010, term5010.getClass(), "slug", "");
        Object term5013 = newInstance(Class.forName("in.cubestack.apps.blog.post.service.PostSummary$PostMeta"));
        setField(term5013, term5013.getClass(), "name", "");
        setField(term5013, term5013.getClass(), "slug", "");
        Object term5016 = newInstance(Class.forName("in.cubestack.apps.blog.post.service.PostSummary$PostMeta"));
        setField(term5016, term5016.getClass(), "name", "");
        setField(term5016, term5016.getClass(), "slug", "");
        Object term5019 = newInstance(Class.forName("in.cubestack.apps.blog.post.service.PostSummary$PostMeta"));
        setField(term5019, term5019.getClass(), "name", "");
        setField(term5019, term5019.getClass(), "slug", "");
        Object term5022 = newInstance(Class.forName("in.cubestack.apps.blog.post.service.PostSummary$PostMeta"));
        setField(term5022, term5022.getClass(), "name", "");
        setField(term5022, term5022.getClass(), "slug", "");
        Object term5025 = newInstance(Class.forName("in.cubestack.apps.blog.post.service.PostSummary$PostMeta"));
        setField(term5025, term5025.getClass(), "name", "");
        setField(term5025, term5025.getClass(), "slug", "");
        Object term5028 = newInstance(Class.forName("in.cubestack.apps.blog.post.service.PostSummary$PostMeta"));
        setField(term5028, term5028.getClass(), "name", "");
        setField(term5028, term5028.getClass(), "slug", "");
        Object term5031 = newInstance(Class.forName("in.cubestack.apps.blog.post.service.PostSummary$PostMeta"));
        setField(term5031, term5031.getClass(), "name", "");
        setField(term5031, term5031.getClass(), "slug", "");
        Object term5034 = newInstance(Class.forName("in.cubestack.apps.blog.post.service.PostSummary$PostMeta"));
        setField(term5034, term5034.getClass(), "name", "");
        setField(term5034, term5034.getClass(), "slug", "");
        ArrayList term5008 = new ArrayList();
        ((ArrayList) term5008).add(term5010);
        ((ArrayList) term5008).add(term5013);
        ((ArrayList) term5008).add(term5016);
        ((ArrayList) term5008).add(term5019);
        ((ArrayList) term5008).add(term5022);
        ((ArrayList) term5008).add(term5025);
        ((ArrayList) term5008).add(term5028);
        ((ArrayList) term5008).add(term5031);
        ((ArrayList) term5008).add(term5034);
        Object term5041 = newInstance(Class.forName("in.cubestack.apps.blog.post.service.PostSummary$PostMeta"));
        setField(term5041, term5041.getClass(), "name", "");
        setField(term5041, term5041.getClass(), "slug", "");
        ArrayList term5039 = new ArrayList();
        ((ArrayList) term5039).add(term5041);
        ((ArrayList) term5039).add(term5031);
        ((ArrayList) term5039).add(term5034);
        term4873 = newInstance(Class.forName("in.cubestack.apps.blog.post.service.PostSummary"));
        Object term5046 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term5048 = (int[]) newIntArray(4);
        Object term5057 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term5059 = (int[]) newIntArray(4);
        setField(term4873, term4873.getClass(), "id", term4874);
        setField(term4873, term4873.getClass(), "firstName", "TSyCeEZPaT");
        setField(term4873, term4873.getClass(), "lastName", "JeZFtaqkzW");
        setField(term4873, term4873.getClass(), "username", "vOVuNSCCLe");
        setField(term4873, term4873.getClass(), "title", "fzeqPnzpnt");
        setField(term4873, term4873.getClass(), "metaTitle", "RxbhrFBjkO");
        setField(term4873, term4873.getClass(), "summary", "aanyiAOJCl");
        setField(term4873, term4873.getClass(), "slug", "VDokbsCuqq");
        setField(term4873, term4873.getClass(), "postType", "xClUIcPECX");
        setField(term4873, term4873.getClass(), "postStatus", "avhRaGZaBF");
        setField(term4873, term4873.getClass(), "content", "JkgoRtImdE");
        setField(term4873, term4873.getClass(), "publishedAt", "qFGKIJjlmV");
        setField(term4873, term4873.getClass(), "tags", term5008);
        setField(term4873, term4873.getClass(), "categories", term5039);
        setIntField(term5046, term5046.getClass(), "signum", 1);
        setIntElement(term5048, 0, -726640958);
        setIntElement(term5048, 1, 560379572);
        setIntElement(term5048, 2, -1232687926);
        setIntElement(term5048, 3, -1400821230);
        setField(term5046, term5046.getClass(), "mag", term5048);
        setIntField(term5046, term5046.getClass(), "bitCountPlusOne", 0);
        setIntField(term5046, term5046.getClass(), "bitLengthPlusOne", 0);
        setIntField(term5046, term5046.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term5046, term5046.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term4873, term4873.getClass(), "likes", term5046);
        setIntField(term5057, term5057.getClass(), "signum", 1);
        setIntElement(term5059, 0, -884953937);
        setIntElement(term5059, 1, -1552322929);
        setIntElement(term5059, 2, 1391116072);
        setIntElement(term5059, 3, -1488444321);
        setField(term5057, term5057.getClass(), "mag", term5059);
        setIntField(term5057, term5057.getClass(), "bitCountPlusOne", 0);
        setIntField(term5057, term5057.getClass(), "bitLengthPlusOne", 0);
        setIntField(term5057, term5057.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term5057, term5057.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term4873, term4873.getClass(), "views", term5057);
        setField(term4873, term4873.getClass(), "htmlContent", "RSaoipUlsg");
        setField(term4873, term4873.getClass(), "htmlSummary", "cSHGbqKqlN");
        setField(term4873, term4873.getClass(), "readTime", "pFAfANnxup");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.post.service.PostSummary");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPostType", argTypes, term4873, args);
    }

};


