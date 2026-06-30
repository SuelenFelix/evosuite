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

public class LocalbooruHandler_getHeight_40087986411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6592;

    public LocalbooruHandler_getHeight_40087986411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term6621 = newInstance(Class.forName("loliSnatcher.BooruItem"));
        setField(term6621, term6621.getClass(), "fileURL", "");
        setField(term6621, term6621.getClass(), "sampleURL", "");
        setField(term6621, term6621.getClass(), "thumbnailURL", "");
        setField(term6621, term6621.getClass(), "tags", "");
        setField(term6621, term6621.getClass(), "postURL", "");
        setIntField(term6621, term6621.getClass(), "id", 1351900243);
        setIntField(term6621, term6621.getClass(), "width", -330897705);
        setIntField(term6621, term6621.getClass(), "height", 1065595802);
        Object term6630 = newInstance(Class.forName("loliSnatcher.BooruItem"));
        setField(term6630, term6630.getClass(), "fileURL", "");
        setField(term6630, term6630.getClass(), "sampleURL", "");
        setField(term6630, term6630.getClass(), "thumbnailURL", "");
        setField(term6630, term6630.getClass(), "tags", "");
        setField(term6630, term6630.getClass(), "postURL", "");
        setIntField(term6630, term6630.getClass(), "id", 21031843);
        setIntField(term6630, term6630.getClass(), "width", -380787857);
        setIntField(term6630, term6630.getClass(), "height", 319853052);
        Object term6639 = newInstance(Class.forName("loliSnatcher.BooruItem"));
        setField(term6639, term6639.getClass(), "fileURL", "");
        setField(term6639, term6639.getClass(), "sampleURL", "");
        setField(term6639, term6639.getClass(), "thumbnailURL", "");
        setField(term6639, term6639.getClass(), "tags", "");
        setField(term6639, term6639.getClass(), "postURL", "");
        setIntField(term6639, term6639.getClass(), "id", -1097563716);
        setIntField(term6639, term6639.getClass(), "width", 1572907769);
        setIntField(term6639, term6639.getClass(), "height", 1608016787);
        Object term6648 = newInstance(Class.forName("loliSnatcher.BooruItem"));
        setField(term6648, term6648.getClass(), "fileURL", "");
        setField(term6648, term6648.getClass(), "sampleURL", "");
        setField(term6648, term6648.getClass(), "thumbnailURL", "");
        setField(term6648, term6648.getClass(), "tags", "");
        setField(term6648, term6648.getClass(), "postURL", "");
        setIntField(term6648, term6648.getClass(), "id", -516303035);
        setIntField(term6648, term6648.getClass(), "width", -2143043890);
        setIntField(term6648, term6648.getClass(), "height", -2138825831);
        Object term6657 = newInstance(Class.forName("loliSnatcher.BooruItem"));
        setField(term6657, term6657.getClass(), "fileURL", "");
        setField(term6657, term6657.getClass(), "sampleURL", "");
        setField(term6657, term6657.getClass(), "thumbnailURL", "");
        setField(term6657, term6657.getClass(), "tags", "");
        setField(term6657, term6657.getClass(), "postURL", "");
        setIntField(term6657, term6657.getClass(), "id", 1454781562);
        setIntField(term6657, term6657.getClass(), "width", -27944011);
        setIntField(term6657, term6657.getClass(), "height", -20614472);
        Object term6666 = newInstance(Class.forName("loliSnatcher.BooruItem"));
        setField(term6666, term6666.getClass(), "fileURL", "");
        setField(term6666, term6666.getClass(), "sampleURL", "");
        setField(term6666, term6666.getClass(), "thumbnailURL", "");
        setField(term6666, term6666.getClass(), "tags", "");
        setField(term6666, term6666.getClass(), "postURL", "");
        setIntField(term6666, term6666.getClass(), "id", 1126618861);
        setIntField(term6666, term6666.getClass(), "width", 947449400);
        setIntField(term6666, term6666.getClass(), "height", -763799087);
        ArrayList term6619 = new ArrayList();
        ((ArrayList) term6619).add(term6621);
        ((ArrayList) term6619).add(term6630);
        ((ArrayList) term6619).add(term6639);
        ((ArrayList) term6619).add(term6648);
        ((ArrayList) term6619).add(term6657);
        ((ArrayList) term6619).add(term6666);
        term6592 = newInstance(Class.forName("loliSnatcher.LocalbooruHandler"));
        setField(term6592, term6592.getClass(), "baseURL", "YaDWphDOSz");
        setIntField(term6592, term6592.getClass(), "pageNum", -15712667);
        setIntField(term6592, term6592.getClass(), "limit", 1964967720);
        setField(term6592, term6592.getClass(), "prevTags", "nnnmCgFBLw");
        setField(term6592, term6592.getClass(), "fetched", term6619);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("loliSnatcher.LocalbooruHandler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ITrhiKKzcb";
        callMethod(klass, "getHeight", argTypes, term6592, args);
    }

};


