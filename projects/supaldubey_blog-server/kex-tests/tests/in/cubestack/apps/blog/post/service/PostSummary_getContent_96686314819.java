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

public class PostSummary_getContent_96686314819 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7524;

    public PostSummary_getContent_96686314819() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term7525 = new Long(8059786003080744426L);
        Object term7661 = newInstance(Class.forName("in.cubestack.apps.blog.post.service.PostSummary$PostMeta"));
        setField(term7661, term7661.getClass(), "name", "");
        setField(term7661, term7661.getClass(), "slug", "");
        Object term7664 = newInstance(Class.forName("in.cubestack.apps.blog.post.service.PostSummary$PostMeta"));
        setField(term7664, term7664.getClass(), "name", "");
        setField(term7664, term7664.getClass(), "slug", "");
        Object term7667 = newInstance(Class.forName("in.cubestack.apps.blog.post.service.PostSummary$PostMeta"));
        setField(term7667, term7667.getClass(), "name", "");
        setField(term7667, term7667.getClass(), "slug", "");
        Object term7670 = newInstance(Class.forName("in.cubestack.apps.blog.post.service.PostSummary$PostMeta"));
        setField(term7670, term7670.getClass(), "name", "");
        setField(term7670, term7670.getClass(), "slug", "");
        Object term7673 = newInstance(Class.forName("in.cubestack.apps.blog.post.service.PostSummary$PostMeta"));
        setField(term7673, term7673.getClass(), "name", "");
        setField(term7673, term7673.getClass(), "slug", "");
        ArrayList term7659 = new ArrayList();
        ((ArrayList) term7659).add(term7661);
        ((ArrayList) term7659).add(term7664);
        ((ArrayList) term7659).add(term7667);
        ((ArrayList) term7659).add(term7670);
        ((ArrayList) term7659).add(term7673);
        Object term7680 = newInstance(Class.forName("in.cubestack.apps.blog.post.service.PostSummary$PostMeta"));
        setField(term7680, term7680.getClass(), "name", "");
        setField(term7680, term7680.getClass(), "slug", "");
        ArrayList term7678 = new ArrayList();
        ((ArrayList) term7678).add(term7680);
        term7524 = newInstance(Class.forName("in.cubestack.apps.blog.post.service.PostSummary"));
        Object term7685 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term7687 = (int[]) newIntArray(4);
        Object term7696 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term7698 = (int[]) newIntArray(4);
        setField(term7524, term7524.getClass(), "id", term7525);
        setField(term7524, term7524.getClass(), "firstName", "UiWhvbypdr");
        setField(term7524, term7524.getClass(), "lastName", "CgleElJNje");
        setField(term7524, term7524.getClass(), "username", "ZrchvNGMtd");
        setField(term7524, term7524.getClass(), "title", "WaEcyVlcIx");
        setField(term7524, term7524.getClass(), "metaTitle", "ONcbPCQnHd");
        setField(term7524, term7524.getClass(), "summary", "AobDaplFLl");
        setField(term7524, term7524.getClass(), "slug", "pDkMNnAGgv");
        setField(term7524, term7524.getClass(), "postType", "PaCpFXGzdX");
        setField(term7524, term7524.getClass(), "postStatus", "FftYCNbnks");
        setField(term7524, term7524.getClass(), "content", "lJoltmsadS");
        setField(term7524, term7524.getClass(), "publishedAt", "mvfDtZNEHr");
        setField(term7524, term7524.getClass(), "tags", term7659);
        setField(term7524, term7524.getClass(), "categories", term7678);
        setIntField(term7685, term7685.getClass(), "signum", 1);
        setIntElement(term7687, 0, -2103755347);
        setIntElement(term7687, 1, 215069094);
        setIntElement(term7687, 2, -1244457347);
        setIntElement(term7687, 3, 1161055583);
        setField(term7685, term7685.getClass(), "mag", term7687);
        setIntField(term7685, term7685.getClass(), "bitCountPlusOne", 0);
        setIntField(term7685, term7685.getClass(), "bitLengthPlusOne", 0);
        setIntField(term7685, term7685.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term7685, term7685.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term7524, term7524.getClass(), "likes", term7685);
        setIntField(term7696, term7696.getClass(), "signum", 1);
        setIntElement(term7698, 0, -92660371);
        setIntElement(term7698, 1, 1806660338);
        setIntElement(term7698, 2, -1813466624);
        setIntElement(term7698, 3, 2057596020);
        setField(term7696, term7696.getClass(), "mag", term7698);
        setIntField(term7696, term7696.getClass(), "bitCountPlusOne", 0);
        setIntField(term7696, term7696.getClass(), "bitLengthPlusOne", 0);
        setIntField(term7696, term7696.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term7696, term7696.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term7524, term7524.getClass(), "views", term7696);
        setField(term7524, term7524.getClass(), "htmlContent", "IVacFDAZcj");
        setField(term7524, term7524.getClass(), "htmlSummary", "EEYmuwyVDP");
        setField(term7524, term7524.getClass(), "readTime", "EWFbEDAVrE");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.post.service.PostSummary");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getContent", argTypes, term7524, args);
    }

};


