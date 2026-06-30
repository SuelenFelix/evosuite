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

public class DanbooruHandler_getID_7646300548 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2388;

    public DanbooruHandler_getID_7646300548() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term2417 = newInstance(Class.forName("loliSnatcher.BooruItem"));
        setField(term2417, term2417.getClass(), "fileURL", "");
        setField(term2417, term2417.getClass(), "sampleURL", "");
        setField(term2417, term2417.getClass(), "thumbnailURL", "");
        setField(term2417, term2417.getClass(), "tags", "");
        setField(term2417, term2417.getClass(), "postURL", "");
        setIntField(term2417, term2417.getClass(), "id", -1498296052);
        setIntField(term2417, term2417.getClass(), "width", 2098647989);
        setIntField(term2417, term2417.getClass(), "height", 1598895173);
        ArrayList term2415 = new ArrayList();
        ((ArrayList) term2415).add(term2417);
        term2388 = newInstance(Class.forName("loliSnatcher.DanbooruHandler"));
        setField(term2388, term2388.getClass(), "baseURL", "lCyLIcSuom");
        setIntField(term2388, term2388.getClass(), "pageNum", 98922530);
        setIntField(term2388, term2388.getClass(), "limit", -1388471422);
        setField(term2388, term2388.getClass(), "prevTags", "CGOpQSZZwI");
        setField(term2388, term2388.getClass(), "fetched", term2415);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("loliSnatcher.DanbooruHandler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "beAMpkroCQ";
        callMethod(klass, "getID", argTypes, term2388, args);
    }

};


