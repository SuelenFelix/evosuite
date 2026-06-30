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

public class GelbooruHandler_getSampleURL_5255360844 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4374;

    public GelbooruHandler_getSampleURL_5255360844() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term4427 = newInstance(Class.forName("loliSnatcher.BooruItem"));
        setField(term4427, term4427.getClass(), "fileURL", "");
        setField(term4427, term4427.getClass(), "sampleURL", "");
        setField(term4427, term4427.getClass(), "thumbnailURL", "");
        setField(term4427, term4427.getClass(), "tags", "");
        setField(term4427, term4427.getClass(), "postURL", "");
        setIntField(term4427, term4427.getClass(), "id", 34470066);
        setIntField(term4427, term4427.getClass(), "width", 2058711405);
        setIntField(term4427, term4427.getClass(), "height", 1743683601);
        ArrayList term4425 = new ArrayList();
        ((ArrayList) term4425).add(term4427);
        term4374 = newInstance(Class.forName("loliSnatcher.GelbooruHandler"));
        setField(term4374, term4374.getClass(), "apiKey", "FlHzxEfFzI");
        setField(term4374, term4374.getClass(), "userID", "aSATgQUpoe");
        setField(term4374, term4374.getClass(), "baseURL", "VkPSXewZfB");
        setIntField(term4374, term4374.getClass(), "pageNum", -525257914);
        setIntField(term4374, term4374.getClass(), "limit", 147209682);
        setField(term4374, term4374.getClass(), "prevTags", "ubodzJoMGW");
        setField(term4374, term4374.getClass(), "fetched", term4425);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("loliSnatcher.GelbooruHandler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "AyrEXuGrEj";
        callMethod(klass, "getSampleURL", argTypes, term4374, args);
    }

};


