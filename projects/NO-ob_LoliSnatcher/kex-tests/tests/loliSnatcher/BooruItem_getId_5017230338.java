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

public class BooruItem_getId_5017230338 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3661;

    public BooruItem_getId_5017230338() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3661 = newInstance(Class.forName("loliSnatcher.BooruItem"));
        setField(term3661, term3661.getClass(), "fileURL", "eOJfbiZLnb");
        setField(term3661, term3661.getClass(), "sampleURL", "nKZKnxWYCK");
        setField(term3661, term3661.getClass(), "thumbnailURL", "JOqQxuzRuZ");
        setField(term3661, term3661.getClass(), "tags", "RSaoipUlsg");
        setField(term3661, term3661.getClass(), "postURL", "cSHGbqKqlN");
        setIntField(term3661, term3661.getClass(), "id", -2131181468);
        setIntField(term3661, term3661.getClass(), "width", 282916351);
        setIntField(term3661, term3661.getClass(), "height", 880977281);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("loliSnatcher.BooruItem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term3661, args);
    }

};


