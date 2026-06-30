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

public class BooruItem_getFileURL_4494150001 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2863;

    public BooruItem_getFileURL_4494150001() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2863 = newInstance(Class.forName("loliSnatcher.BooruItem"));
        setField(term2863, term2863.getClass(), "fileURL", "VVNNlAePXF");
        setField(term2863, term2863.getClass(), "sampleURL", "jnwVnmKAFv");
        setField(term2863, term2863.getClass(), "thumbnailURL", "TXyHhqeCjR");
        setField(term2863, term2863.getClass(), "tags", "lZIgPZPgTu");
        setField(term2863, term2863.getClass(), "postURL", "iuCxnHGMoW");
        setIntField(term2863, term2863.getClass(), "id", 389427431);
        setIntField(term2863, term2863.getClass(), "width", -1945706126);
        setIntField(term2863, term2863.getClass(), "height", 1152356969);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("loliSnatcher.BooruItem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFileURL", argTypes, term2863, args);
    }

};


