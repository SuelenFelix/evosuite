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

public class LocalbooruHandler_getThumbnailURL_18758553858 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6238;

    public LocalbooruHandler_getThumbnailURL_18758553858() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term6267 = newInstance(Class.forName("loliSnatcher.BooruItem"));
        setField(term6267, term6267.getClass(), "fileURL", "");
        setField(term6267, term6267.getClass(), "sampleURL", "");
        setField(term6267, term6267.getClass(), "thumbnailURL", "");
        setField(term6267, term6267.getClass(), "tags", "");
        setField(term6267, term6267.getClass(), "postURL", "");
        setIntField(term6267, term6267.getClass(), "id", -525570815);
        setIntField(term6267, term6267.getClass(), "width", 754055848);
        setIntField(term6267, term6267.getClass(), "height", -19246901);
        Object term6276 = newInstance(Class.forName("loliSnatcher.BooruItem"));
        setField(term6276, term6276.getClass(), "fileURL", "");
        setField(term6276, term6276.getClass(), "sampleURL", "");
        setField(term6276, term6276.getClass(), "thumbnailURL", "");
        setField(term6276, term6276.getClass(), "tags", "");
        setField(term6276, term6276.getClass(), "postURL", "");
        setIntField(term6276, term6276.getClass(), "id", -370828664);
        setIntField(term6276, term6276.getClass(), "width", 1168633950);
        setIntField(term6276, term6276.getClass(), "height", 1607082164);
        Object term6285 = newInstance(Class.forName("loliSnatcher.BooruItem"));
        setField(term6285, term6285.getClass(), "fileURL", "");
        setField(term6285, term6285.getClass(), "sampleURL", "");
        setField(term6285, term6285.getClass(), "thumbnailURL", "");
        setField(term6285, term6285.getClass(), "tags", "");
        setField(term6285, term6285.getClass(), "postURL", "");
        setIntField(term6285, term6285.getClass(), "id", 1890399366);
        setIntField(term6285, term6285.getClass(), "width", -1867239125);
        setIntField(term6285, term6285.getClass(), "height", 952869601);
        Object term6294 = newInstance(Class.forName("loliSnatcher.BooruItem"));
        setField(term6294, term6294.getClass(), "fileURL", "");
        setField(term6294, term6294.getClass(), "sampleURL", "");
        setField(term6294, term6294.getClass(), "thumbnailURL", "");
        setField(term6294, term6294.getClass(), "tags", "");
        setField(term6294, term6294.getClass(), "postURL", "");
        setIntField(term6294, term6294.getClass(), "id", 91958879);
        setIntField(term6294, term6294.getClass(), "width", -645429025);
        setIntField(term6294, term6294.getClass(), "height", -688213483);
        Object term6303 = newInstance(Class.forName("loliSnatcher.BooruItem"));
        setField(term6303, term6303.getClass(), "fileURL", "");
        setField(term6303, term6303.getClass(), "sampleURL", "");
        setField(term6303, term6303.getClass(), "thumbnailURL", "");
        setField(term6303, term6303.getClass(), "tags", "");
        setField(term6303, term6303.getClass(), "postURL", "");
        setIntField(term6303, term6303.getClass(), "id", 644154104);
        setIntField(term6303, term6303.getClass(), "width", 76650923);
        setIntField(term6303, term6303.getClass(), "height", 1003743923);
        Object term6312 = newInstance(Class.forName("loliSnatcher.BooruItem"));
        setField(term6312, term6312.getClass(), "fileURL", "");
        setField(term6312, term6312.getClass(), "sampleURL", "");
        setField(term6312, term6312.getClass(), "thumbnailURL", "");
        setField(term6312, term6312.getClass(), "tags", "");
        setField(term6312, term6312.getClass(), "postURL", "");
        setIntField(term6312, term6312.getClass(), "id", 1887772522);
        setIntField(term6312, term6312.getClass(), "width", 354196060);
        setIntField(term6312, term6312.getClass(), "height", -1840305774);
        Object term6321 = newInstance(Class.forName("loliSnatcher.BooruItem"));
        setField(term6321, term6321.getClass(), "fileURL", "");
        setField(term6321, term6321.getClass(), "sampleURL", "");
        setField(term6321, term6321.getClass(), "thumbnailURL", "");
        setField(term6321, term6321.getClass(), "tags", "");
        setField(term6321, term6321.getClass(), "postURL", "");
        setIntField(term6321, term6321.getClass(), "id", 1365087144);
        setIntField(term6321, term6321.getClass(), "width", -1537255112);
        setIntField(term6321, term6321.getClass(), "height", 934477462);
        ArrayList term6265 = new ArrayList();
        ((ArrayList) term6265).add(term6267);
        ((ArrayList) term6265).add(term6276);
        ((ArrayList) term6265).add(term6285);
        ((ArrayList) term6265).add(term6294);
        ((ArrayList) term6265).add(term6303);
        ((ArrayList) term6265).add(term6312);
        ((ArrayList) term6265).add(term6321);
        term6238 = newInstance(Class.forName("loliSnatcher.LocalbooruHandler"));
        setField(term6238, term6238.getClass(), "baseURL", "mxVLTgCwki");
        setIntField(term6238, term6238.getClass(), "pageNum", 1160010161);
        setIntField(term6238, term6238.getClass(), "limit", -423900705);
        setField(term6238, term6238.getClass(), "prevTags", "wCurppnDSA");
        setField(term6238, term6238.getClass(), "fetched", term6265);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("loliSnatcher.LocalbooruHandler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "OFTJwdPiTG";
        callMethod(klass, "getThumbnailURL", argTypes, term6238, args);
    }

};


