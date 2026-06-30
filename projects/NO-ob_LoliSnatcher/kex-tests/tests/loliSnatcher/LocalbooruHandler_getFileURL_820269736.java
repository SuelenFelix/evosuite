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

public class LocalbooruHandler_getFileURL_820269736 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6020;

    public LocalbooruHandler_getFileURL_820269736() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term6049 = newInstance(Class.forName("loliSnatcher.BooruItem"));
        setField(term6049, term6049.getClass(), "fileURL", "");
        setField(term6049, term6049.getClass(), "sampleURL", "");
        setField(term6049, term6049.getClass(), "thumbnailURL", "");
        setField(term6049, term6049.getClass(), "tags", "");
        setField(term6049, term6049.getClass(), "postURL", "");
        setIntField(term6049, term6049.getClass(), "id", -1284825282);
        setIntField(term6049, term6049.getClass(), "width", -1941343035);
        setIntField(term6049, term6049.getClass(), "height", 947897214);
        Object term6058 = newInstance(Class.forName("loliSnatcher.BooruItem"));
        setField(term6058, term6058.getClass(), "fileURL", "");
        setField(term6058, term6058.getClass(), "sampleURL", "");
        setField(term6058, term6058.getClass(), "thumbnailURL", "");
        setField(term6058, term6058.getClass(), "tags", "");
        setField(term6058, term6058.getClass(), "postURL", "");
        setIntField(term6058, term6058.getClass(), "id", 1496340209);
        setIntField(term6058, term6058.getClass(), "width", -1748391876);
        setIntField(term6058, term6058.getClass(), "height", 43258317);
        Object term6067 = newInstance(Class.forName("loliSnatcher.BooruItem"));
        setField(term6067, term6067.getClass(), "fileURL", "");
        setField(term6067, term6067.getClass(), "sampleURL", "");
        setField(term6067, term6067.getClass(), "thumbnailURL", "");
        setField(term6067, term6067.getClass(), "tags", "");
        setField(term6067, term6067.getClass(), "postURL", "");
        setIntField(term6067, term6067.getClass(), "id", 1707220033);
        setIntField(term6067, term6067.getClass(), "width", -1792504217);
        setIntField(term6067, term6067.getClass(), "height", 1824538861);
        Object term6076 = newInstance(Class.forName("loliSnatcher.BooruItem"));
        setField(term6076, term6076.getClass(), "fileURL", "");
        setField(term6076, term6076.getClass(), "sampleURL", "");
        setField(term6076, term6076.getClass(), "thumbnailURL", "");
        setField(term6076, term6076.getClass(), "tags", "");
        setField(term6076, term6076.getClass(), "postURL", "");
        setIntField(term6076, term6076.getClass(), "id", 499519708);
        setIntField(term6076, term6076.getClass(), "width", 1501165033);
        setIntField(term6076, term6076.getClass(), "height", 510162332);
        Object term6085 = newInstance(Class.forName("loliSnatcher.BooruItem"));
        setField(term6085, term6085.getClass(), "fileURL", "");
        setField(term6085, term6085.getClass(), "sampleURL", "");
        setField(term6085, term6085.getClass(), "thumbnailURL", "");
        setField(term6085, term6085.getClass(), "tags", "");
        setField(term6085, term6085.getClass(), "postURL", "");
        setIntField(term6085, term6085.getClass(), "id", 888506903);
        setIntField(term6085, term6085.getClass(), "width", 200252898);
        setIntField(term6085, term6085.getClass(), "height", -1831826725);
        ArrayList term6047 = new ArrayList();
        ((ArrayList) term6047).add(term6049);
        ((ArrayList) term6047).add(term6058);
        ((ArrayList) term6047).add(term6067);
        ((ArrayList) term6047).add(term6076);
        ((ArrayList) term6047).add(term6085);
        term6020 = newInstance(Class.forName("loliSnatcher.LocalbooruHandler"));
        setField(term6020, term6020.getClass(), "baseURL", "mdxcgZwsaP");
        setIntField(term6020, term6020.getClass(), "pageNum", -1703035419);
        setIntField(term6020, term6020.getClass(), "limit", 765766290);
        setField(term6020, term6020.getClass(), "prevTags", "XildIRoZHG");
        setField(term6020, term6020.getClass(), "fetched", term6047);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("loliSnatcher.LocalbooruHandler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "PNzNzzjSXM";
        callMethod(klass, "getFileURL", argTypes, term6020, args);
    }

};


