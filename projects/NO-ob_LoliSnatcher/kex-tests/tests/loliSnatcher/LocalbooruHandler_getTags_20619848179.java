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

public class LocalbooruHandler_getTags_20619848179 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6374;

    public LocalbooruHandler_getTags_20619848179() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term6403 = newInstance(Class.forName("loliSnatcher.BooruItem"));
        setField(term6403, term6403.getClass(), "fileURL", "");
        setField(term6403, term6403.getClass(), "sampleURL", "");
        setField(term6403, term6403.getClass(), "thumbnailURL", "");
        setField(term6403, term6403.getClass(), "tags", "");
        setField(term6403, term6403.getClass(), "postURL", "");
        setIntField(term6403, term6403.getClass(), "id", -2063365430);
        setIntField(term6403, term6403.getClass(), "width", 812570053);
        setIntField(term6403, term6403.getClass(), "height", -1488938905);
        Object term6412 = newInstance(Class.forName("loliSnatcher.BooruItem"));
        setField(term6412, term6412.getClass(), "fileURL", "");
        setField(term6412, term6412.getClass(), "sampleURL", "");
        setField(term6412, term6412.getClass(), "thumbnailURL", "");
        setField(term6412, term6412.getClass(), "tags", "");
        setField(term6412, term6412.getClass(), "postURL", "");
        setIntField(term6412, term6412.getClass(), "id", 1916544127);
        setIntField(term6412, term6412.getClass(), "width", -1133405894);
        setIntField(term6412, term6412.getClass(), "height", 1289741214);
        ArrayList term6401 = new ArrayList();
        ((ArrayList) term6401).add(term6403);
        ((ArrayList) term6401).add(term6412);
        term6374 = newInstance(Class.forName("loliSnatcher.LocalbooruHandler"));
        setField(term6374, term6374.getClass(), "baseURL", "QiUprSEluR");
        setIntField(term6374, term6374.getClass(), "pageNum", 4900410);
        setIntField(term6374, term6374.getClass(), "limit", -1252345779);
        setField(term6374, term6374.getClass(), "prevTags", "cDOXXottZh");
        setField(term6374, term6374.getClass(), "fetched", term6401);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("loliSnatcher.LocalbooruHandler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "HqitWglYWX";
        callMethod(klass, "getTags", argTypes, term6374, args);
    }

};


