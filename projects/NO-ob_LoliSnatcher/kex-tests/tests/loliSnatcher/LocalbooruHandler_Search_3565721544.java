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

public class LocalbooruHandler_Search_3565721544 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5775;

    public LocalbooruHandler_Search_3565721544() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term5804 = newInstance(Class.forName("loliSnatcher.BooruItem"));
        setField(term5804, term5804.getClass(), "fileURL", "");
        setField(term5804, term5804.getClass(), "sampleURL", "");
        setField(term5804, term5804.getClass(), "thumbnailURL", "");
        setField(term5804, term5804.getClass(), "tags", "");
        setField(term5804, term5804.getClass(), "postURL", "");
        setIntField(term5804, term5804.getClass(), "id", -350454594);
        setIntField(term5804, term5804.getClass(), "width", -1148142995);
        setIntField(term5804, term5804.getClass(), "height", -233024044);
        Object term5813 = newInstance(Class.forName("loliSnatcher.BooruItem"));
        setField(term5813, term5813.getClass(), "fileURL", "");
        setField(term5813, term5813.getClass(), "sampleURL", "");
        setField(term5813, term5813.getClass(), "thumbnailURL", "");
        setField(term5813, term5813.getClass(), "tags", "");
        setField(term5813, term5813.getClass(), "postURL", "");
        setIntField(term5813, term5813.getClass(), "id", 1820784228);
        setIntField(term5813, term5813.getClass(), "width", 1390820006);
        setIntField(term5813, term5813.getClass(), "height", -828982065);
        Object term5822 = newInstance(Class.forName("loliSnatcher.BooruItem"));
        setField(term5822, term5822.getClass(), "fileURL", "");
        setField(term5822, term5822.getClass(), "sampleURL", "");
        setField(term5822, term5822.getClass(), "thumbnailURL", "");
        setField(term5822, term5822.getClass(), "tags", "");
        setField(term5822, term5822.getClass(), "postURL", "");
        setIntField(term5822, term5822.getClass(), "id", 1221443226);
        setIntField(term5822, term5822.getClass(), "width", 908108726);
        setIntField(term5822, term5822.getClass(), "height", 1023209512);
        Object term5831 = newInstance(Class.forName("loliSnatcher.BooruItem"));
        setField(term5831, term5831.getClass(), "fileURL", "");
        setField(term5831, term5831.getClass(), "sampleURL", "");
        setField(term5831, term5831.getClass(), "thumbnailURL", "");
        setField(term5831, term5831.getClass(), "tags", "");
        setField(term5831, term5831.getClass(), "postURL", "");
        setIntField(term5831, term5831.getClass(), "id", 1084849225);
        setIntField(term5831, term5831.getClass(), "width", -1702055571);
        setIntField(term5831, term5831.getClass(), "height", -944542900);
        Object term5840 = newInstance(Class.forName("loliSnatcher.BooruItem"));
        setField(term5840, term5840.getClass(), "fileURL", "");
        setField(term5840, term5840.getClass(), "sampleURL", "");
        setField(term5840, term5840.getClass(), "thumbnailURL", "");
        setField(term5840, term5840.getClass(), "tags", "");
        setField(term5840, term5840.getClass(), "postURL", "");
        setIntField(term5840, term5840.getClass(), "id", 2063762142);
        setIntField(term5840, term5840.getClass(), "width", 1658391716);
        setIntField(term5840, term5840.getClass(), "height", 2143282300);
        ArrayList term5802 = new ArrayList();
        ((ArrayList) term5802).add(term5804);
        ((ArrayList) term5802).add(term5813);
        ((ArrayList) term5802).add(term5822);
        ((ArrayList) term5802).add(term5831);
        ((ArrayList) term5802).add(term5840);
        term5775 = newInstance(Class.forName("loliSnatcher.LocalbooruHandler"));
        setField(term5775, term5775.getClass(), "baseURL", "GTmoNrziyc");
        setIntField(term5775, term5775.getClass(), "pageNum", -100825168);
        setIntField(term5775, term5775.getClass(), "limit", 768407648);
        setField(term5775, term5775.getClass(), "prevTags", "LvztehSlhM");
        setField(term5775, term5775.getClass(), "fetched", term5802);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("loliSnatcher.LocalbooruHandler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "TGiJfagfky";
        callMethod(klass, "Search", argTypes, term5775, args);
    }

};


