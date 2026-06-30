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

public class LocalbooruHandler_getItems_17386005165 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5893;

    public LocalbooruHandler_getItems_17386005165() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term5922 = newInstance(Class.forName("loliSnatcher.BooruItem"));
        setField(term5922, term5922.getClass(), "fileURL", "");
        setField(term5922, term5922.getClass(), "sampleURL", "");
        setField(term5922, term5922.getClass(), "thumbnailURL", "");
        setField(term5922, term5922.getClass(), "tags", "");
        setField(term5922, term5922.getClass(), "postURL", "");
        setIntField(term5922, term5922.getClass(), "id", 301401782);
        setIntField(term5922, term5922.getClass(), "width", 1988605357);
        setIntField(term5922, term5922.getClass(), "height", 808203320);
        Object term5931 = newInstance(Class.forName("loliSnatcher.BooruItem"));
        setField(term5931, term5931.getClass(), "fileURL", "");
        setField(term5931, term5931.getClass(), "sampleURL", "");
        setField(term5931, term5931.getClass(), "thumbnailURL", "");
        setField(term5931, term5931.getClass(), "tags", "");
        setField(term5931, term5931.getClass(), "postURL", "");
        setIntField(term5931, term5931.getClass(), "id", -544382127);
        setIntField(term5931, term5931.getClass(), "width", -1830198043);
        setIntField(term5931, term5931.getClass(), "height", -439048495);
        Object term5940 = newInstance(Class.forName("loliSnatcher.BooruItem"));
        setField(term5940, term5940.getClass(), "fileURL", "");
        setField(term5940, term5940.getClass(), "sampleURL", "");
        setField(term5940, term5940.getClass(), "thumbnailURL", "");
        setField(term5940, term5940.getClass(), "tags", "");
        setField(term5940, term5940.getClass(), "postURL", "");
        setIntField(term5940, term5940.getClass(), "id", -1849105286);
        setIntField(term5940, term5940.getClass(), "width", 1334483645);
        setIntField(term5940, term5940.getClass(), "height", 917513193);
        Object term5949 = newInstance(Class.forName("loliSnatcher.BooruItem"));
        setField(term5949, term5949.getClass(), "fileURL", "");
        setField(term5949, term5949.getClass(), "sampleURL", "");
        setField(term5949, term5949.getClass(), "thumbnailURL", "");
        setField(term5949, term5949.getClass(), "tags", "");
        setField(term5949, term5949.getClass(), "postURL", "");
        setIntField(term5949, term5949.getClass(), "id", 787278105);
        setIntField(term5949, term5949.getClass(), "width", -2063843486);
        setIntField(term5949, term5949.getClass(), "height", 833762980);
        Object term5958 = newInstance(Class.forName("loliSnatcher.BooruItem"));
        setField(term5958, term5958.getClass(), "fileURL", "");
        setField(term5958, term5958.getClass(), "sampleURL", "");
        setField(term5958, term5958.getClass(), "thumbnailURL", "");
        setField(term5958, term5958.getClass(), "tags", "");
        setField(term5958, term5958.getClass(), "postURL", "");
        setIntField(term5958, term5958.getClass(), "id", 320711637);
        setIntField(term5958, term5958.getClass(), "width", 1241164745);
        setIntField(term5958, term5958.getClass(), "height", 1723148410);
        Object term5967 = newInstance(Class.forName("loliSnatcher.BooruItem"));
        setField(term5967, term5967.getClass(), "fileURL", "");
        setField(term5967, term5967.getClass(), "sampleURL", "");
        setField(term5967, term5967.getClass(), "thumbnailURL", "");
        setField(term5967, term5967.getClass(), "tags", "");
        setField(term5967, term5967.getClass(), "postURL", "");
        setIntField(term5967, term5967.getClass(), "id", -920797484);
        setIntField(term5967, term5967.getClass(), "width", -1631697577);
        setIntField(term5967, term5967.getClass(), "height", 765731371);
        ArrayList term5920 = new ArrayList();
        ((ArrayList) term5920).add(term5922);
        ((ArrayList) term5920).add(term5931);
        ((ArrayList) term5920).add(term5940);
        ((ArrayList) term5920).add(term5949);
        ((ArrayList) term5920).add(term5958);
        ((ArrayList) term5920).add(term5967);
        term5893 = newInstance(Class.forName("loliSnatcher.LocalbooruHandler"));
        setField(term5893, term5893.getClass(), "baseURL", "BJklinBmhN");
        setIntField(term5893, term5893.getClass(), "pageNum", 1137624258);
        setIntField(term5893, term5893.getClass(), "limit", 977862393);
        setField(term5893, term5893.getClass(), "prevTags", "IOddzvEWcl");
        setField(term5893, term5893.getClass(), "fetched", term5920);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("loliSnatcher.LocalbooruHandler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "SvGTualQPa";
        callMethod(klass, "getItems", argTypes, term5893, args);
    }

};


