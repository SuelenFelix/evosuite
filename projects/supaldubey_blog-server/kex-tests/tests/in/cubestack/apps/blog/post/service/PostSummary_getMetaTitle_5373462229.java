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

public class PostSummary_getMetaTitle_5373462229 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3781;

    public PostSummary_getMetaTitle_5373462229() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3782 = new Long(-4325723315152823407L);
        ArrayList term3916 = new ArrayList();
        Object term3922 = newInstance(Class.forName("in.cubestack.apps.blog.post.service.PostSummary$PostMeta"));
        setField(term3922, term3922.getClass(), "name", "");
        setField(term3922, term3922.getClass(), "slug", "");
        Object term3925 = newInstance(Class.forName("in.cubestack.apps.blog.post.service.PostSummary$PostMeta"));
        setField(term3925, term3925.getClass(), "name", "");
        setField(term3925, term3925.getClass(), "slug", "");
        ArrayList term3920 = new ArrayList();
        ((ArrayList) term3920).add(term3922);
        ((ArrayList) term3920).add(term3925);
        term3781 = newInstance(Class.forName("in.cubestack.apps.blog.post.service.PostSummary"));
        Object term3930 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term3932 = (int[]) newIntArray(4);
        Object term3941 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term3943 = (int[]) newIntArray(4);
        setField(term3781, term3781.getClass(), "id", term3782);
        setField(term3781, term3781.getClass(), "firstName", "onQLVONGuf");
        setField(term3781, term3781.getClass(), "lastName", "SOrEHbcbmn");
        setField(term3781, term3781.getClass(), "username", "bnsyeQXFdu");
        setField(term3781, term3781.getClass(), "title", "BwtdjiefJn");
        setField(term3781, term3781.getClass(), "metaTitle", "jDmhBrIoDa");
        setField(term3781, term3781.getClass(), "summary", "SPtPatHeOm");
        setField(term3781, term3781.getClass(), "slug", "ywmcuThdfL");
        setField(term3781, term3781.getClass(), "postType", "GBOEuByOfr");
        setField(term3781, term3781.getClass(), "postStatus", "NHbOFFjyVK");
        setField(term3781, term3781.getClass(), "content", "zaloBqlrSo");
        setField(term3781, term3781.getClass(), "publishedAt", "vvoLrMGCoN");
        setField(term3781, term3781.getClass(), "tags", term3916);
        setField(term3781, term3781.getClass(), "categories", term3920);
        setIntField(term3930, term3930.getClass(), "signum", 1);
        setIntElement(term3932, 0, 763680091);
        setIntElement(term3932, 1, -647074485);
        setIntElement(term3932, 2, -328599277);
        setIntElement(term3932, 3, 182874972);
        setField(term3930, term3930.getClass(), "mag", term3932);
        setIntField(term3930, term3930.getClass(), "bitCountPlusOne", 0);
        setIntField(term3930, term3930.getClass(), "bitLengthPlusOne", 0);
        setIntField(term3930, term3930.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term3930, term3930.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term3781, term3781.getClass(), "likes", term3930);
        setIntField(term3941, term3941.getClass(), "signum", 1);
        setIntElement(term3943, 0, 1296639623);
        setIntElement(term3943, 1, 243556927);
        setIntElement(term3943, 2, -1679623855);
        setIntElement(term3943, 3, 592478179);
        setField(term3941, term3941.getClass(), "mag", term3943);
        setIntField(term3941, term3941.getClass(), "bitCountPlusOne", 0);
        setIntField(term3941, term3941.getClass(), "bitLengthPlusOne", 0);
        setIntField(term3941, term3941.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term3941, term3941.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term3781, term3781.getClass(), "views", term3941);
        setField(term3781, term3781.getClass(), "htmlContent", "NBrvVzvQHe");
        setField(term3781, term3781.getClass(), "htmlSummary", "FjOiNAfBOc");
        setField(term3781, term3781.getClass(), "readTime", "iCCsaLHohG");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.post.service.PostSummary");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMetaTitle", argTypes, term3781, args);
    }

};


