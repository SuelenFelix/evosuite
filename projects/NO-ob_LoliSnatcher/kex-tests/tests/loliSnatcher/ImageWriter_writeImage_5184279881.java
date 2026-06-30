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
import java.lang.String;
import java.lang.Boolean;

public class ImageWriter_writeImage_5184279881 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term640;
     Object term717;
     Object term742;

    public ImageWriter_writeImage_5184279881() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term640 = newInstance(Class.forName("loliSnatcher.ImageWriter"));
        Object term641 = newInstance(Class.forName("loliSnatcher.BooruItem"));
        setField(term641, term641.getClass(), "fileURL", "dEnhdmILtU");
        setField(term641, term641.getClass(), "sampleURL", "hoicvmsovO");
        setField(term641, term641.getClass(), "thumbnailURL", "eqJfYWRaEL");
        setField(term641, term641.getClass(), "tags", "fhkbdRViHi");
        setField(term641, term641.getClass(), "postURL", "uWHnvSvaPl");
        setIntField(term641, term641.getClass(), "id", -1087774327);
        setIntField(term641, term641.getClass(), "width", -1530420153);
        setIntField(term641, term641.getClass(), "height", -469968304);
        setField(term640, term640.getClass(), "item", term641);
        setField(term640, term640.getClass(), "localID", "kBdSllIBVz");
        Class<? extends Object> term815 = Class.forName((String) "java.io.File$PathStatus");
        Field term814 = ((Class) term815).getDeclaredField((String) "INVALID");
        ((Field) term814).setAccessible(true);
        Object enum1 = ((Field) term814).get((Object) null);
        term717 = newInstance(Class.forName("java.io.File"));
        setField(term717, term717.getClass(), "path", "TJmVBGfTML");
        setField(term717, term717.getClass(), "status", enum1);
        setIntField(term717, term717.getClass(), "prefixLength", -1145578966);
        setField(term717, term717.getClass(), "filePath", null);
        term742 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("loliSnatcher.ImageWriter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.File");
        argTypes[1] = Class.forName("java.lang.Boolean");
        Object[] args = new Object[2];
        args[0] = term717;
        args[1] = term742;
        callMethod(klass, "writeImage", argTypes, term640, args);
    }

};


