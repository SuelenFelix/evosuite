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
import java.lang.Object;

public class ImageWriter_makeFile_1923752903 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1294;
     Object term1395;

    public ImageWriter_makeFile_1923752903() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1294 = newInstance(Class.forName("loliSnatcher.ImageWriter"));
        Object term1295 = newInstance(Class.forName("loliSnatcher.BooruItem"));
        setField(term1295, term1295.getClass(), "fileURL", "oVgzLbrsFr");
        setField(term1295, term1295.getClass(), "sampleURL", "vQVyKLdtaz");
        setField(term1295, term1295.getClass(), "thumbnailURL", "OWKQODBLzb");
        setField(term1295, term1295.getClass(), "tags", "wGmYcqUkgE");
        setField(term1295, term1295.getClass(), "postURL", "idgaQsnJpQ");
        setIntField(term1295, term1295.getClass(), "id", -157887805);
        setIntField(term1295, term1295.getClass(), "width", 1876565163);
        setIntField(term1295, term1295.getClass(), "height", -817164822);
        setField(term1294, term1294.getClass(), "item", term1295);
        setField(term1294, term1294.getClass(), "localID", "VgZnGoIFwQ");
        term1395 = newInstance(Class.forName("loliSnatcher.BooruItem"));
        setField(term1395, term1395.getClass(), "fileURL", "cAPeiZHKGJ");
        setField(term1395, term1395.getClass(), "sampleURL", "LvJFtLBaxj");
        setField(term1395, term1395.getClass(), "thumbnailURL", "PHvxnGHptP");
        setField(term1395, term1395.getClass(), "tags", "TimdotUuNC");
        setField(term1395, term1395.getClass(), "postURL", "PkWMRdJcBb");
        setIntField(term1395, term1395.getClass(), "id", -1016503459);
        setIntField(term1395, term1395.getClass(), "width", -1968847291);
        setIntField(term1395, term1395.getClass(), "height", 579005622);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("loliSnatcher.ImageWriter");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("loliSnatcher.BooruItem");
        argTypes[3] = Class.forName("java.lang.String");
        Object[] args = new Object[4];
        args[0] = "jUbSRrkrYZ";
        args[1] = "bWWfajKbEX";
        args[2] = term1395;
        args[3] = "jSpAteRute";
        callMethod(klass, "makeFile", argTypes, term1294, args);
    }

};


