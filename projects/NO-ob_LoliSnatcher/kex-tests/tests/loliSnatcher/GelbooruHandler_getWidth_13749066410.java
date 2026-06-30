package loliSnatcher;

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
import static loliSnatcher.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;

public class GelbooruHandler_getWidth_13749066410 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5247;

    public GelbooruHandler_getWidth_13749066410() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term5300 = newInstance(Class.forName("loliSnatcher.BooruItem"));
        setField(term5300, term5300.getClass(), "fileURL", "");
        setField(term5300, term5300.getClass(), "sampleURL", "");
        setField(term5300, term5300.getClass(), "thumbnailURL", "");
        setField(term5300, term5300.getClass(), "tags", "");
        setField(term5300, term5300.getClass(), "postURL", "");
        setIntField(term5300, term5300.getClass(), "id", -1422859977);
        setIntField(term5300, term5300.getClass(), "width", -1972436591);
        setIntField(term5300, term5300.getClass(), "height", 68922753);
        ArrayList term5298 = new ArrayList();
        ((ArrayList) term5298).add(term5300);
        term5247 = newInstance(Class.forName("loliSnatcher.GelbooruHandler"));
        setField(term5247, term5247.getClass(), "apiKey", "AobDaplFLl");
        setField(term5247, term5247.getClass(), "userID", "pDkMNnAGgv");
        setField(term5247, term5247.getClass(), "baseURL", "PaCpFXGzdX");
        setIntField(term5247, term5247.getClass(), "pageNum", -1560631747);
        setIntField(term5247, term5247.getClass(), "limit", 1215150180);
        setField(term5247, term5247.getClass(), "prevTags", "FftYCNbnks");
        setField(term5247, term5247.getClass(), "fetched", term5298);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("loliSnatcher.GelbooruHandler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "EkgprvqZlM";
        callMethod(klass, "getWidth", argTypes, term5247, args);
    }

};


