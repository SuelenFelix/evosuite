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

public class BooruItem_getExt_5565991309 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3775;

    public BooruItem_getExt_5565991309() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3775 = newInstance(Class.forName("loliSnatcher.BooruItem"));
        setField(term3775, term3775.getClass(), "fileURL", "pFAfANnxup");
        setField(term3775, term3775.getClass(), "sampleURL", "FbSIUZyBXZ");
        setField(term3775, term3775.getClass(), "thumbnailURL", "mhQDwIyrRi");
        setField(term3775, term3775.getClass(), "tags", "HpZXWDPhlg");
        setField(term3775, term3775.getClass(), "postURL", "lBOokzEPfe");
        setIntField(term3775, term3775.getClass(), "id", 371943306);
        setIntField(term3775, term3775.getClass(), "width", 982388293);
        setIntField(term3775, term3775.getClass(), "height", -159494544);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("loliSnatcher.BooruItem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getExt", argTypes, term3775, args);
    }

};


