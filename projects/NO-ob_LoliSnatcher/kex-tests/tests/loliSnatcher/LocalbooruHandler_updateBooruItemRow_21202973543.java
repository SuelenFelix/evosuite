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

public class LocalbooruHandler_updateBooruItemRow_21202973543 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5583;
     Object term5641;

    public LocalbooruHandler_updateBooruItemRow_21202973543() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term5612 = newInstance(Class.forName("loliSnatcher.BooruItem"));
        setField(term5612, term5612.getClass(), "fileURL", "");
        setField(term5612, term5612.getClass(), "sampleURL", "");
        setField(term5612, term5612.getClass(), "thumbnailURL", "");
        setField(term5612, term5612.getClass(), "tags", "");
        setField(term5612, term5612.getClass(), "postURL", "");
        setIntField(term5612, term5612.getClass(), "id", -938508470);
        setIntField(term5612, term5612.getClass(), "width", 1242676024);
        setIntField(term5612, term5612.getClass(), "height", -1865023308);
        Object term5621 = newInstance(Class.forName("loliSnatcher.BooruItem"));
        setField(term5621, term5621.getClass(), "fileURL", "");
        setField(term5621, term5621.getClass(), "sampleURL", "");
        setField(term5621, term5621.getClass(), "thumbnailURL", "");
        setField(term5621, term5621.getClass(), "tags", "");
        setField(term5621, term5621.getClass(), "postURL", "");
        setIntField(term5621, term5621.getClass(), "id", 1698510819);
        setIntField(term5621, term5621.getClass(), "width", -1553893255);
        setIntField(term5621, term5621.getClass(), "height", 1303442927);
        Object term5630 = newInstance(Class.forName("loliSnatcher.BooruItem"));
        setField(term5630, term5630.getClass(), "fileURL", "");
        setField(term5630, term5630.getClass(), "sampleURL", "");
        setField(term5630, term5630.getClass(), "thumbnailURL", "");
        setField(term5630, term5630.getClass(), "tags", "");
        setField(term5630, term5630.getClass(), "postURL", "");
        setIntField(term5630, term5630.getClass(), "id", 794568325);
        setIntField(term5630, term5630.getClass(), "width", -434468428);
        setIntField(term5630, term5630.getClass(), "height", 1559605714);
        ArrayList term5610 = new ArrayList();
        ((ArrayList) term5610).add(term5612);
        ((ArrayList) term5610).add(term5621);
        ((ArrayList) term5610).add(term5630);
        term5583 = newInstance(Class.forName("loliSnatcher.LocalbooruHandler"));
        setField(term5583, term5583.getClass(), "baseURL", "ZDhASPHjDG");
        setIntField(term5583, term5583.getClass(), "pageNum", 1116576792);
        setIntField(term5583, term5583.getClass(), "limit", -942194446);
        setField(term5583, term5583.getClass(), "prevTags", "HNVOAXYNEZ");
        setField(term5583, term5583.getClass(), "fetched", term5610);
        term5641 = newInstance(Class.forName("loliSnatcher.BooruItem"));
        setField(term5641, term5641.getClass(), "fileURL", "lnvLKbtveE");
        setField(term5641, term5641.getClass(), "sampleURL", "FfrrEhTHzQ");
        setField(term5641, term5641.getClass(), "thumbnailURL", "LXnDNrMsqT");
        setField(term5641, term5641.getClass(), "tags", "ZLQamJFBmu");
        setField(term5641, term5641.getClass(), "postURL", "ZWcOCwKNvd");
        setIntField(term5641, term5641.getClass(), "id", 1146601902);
        setIntField(term5641, term5641.getClass(), "width", -1938881385);
        setIntField(term5641, term5641.getClass(), "height", -1629418973);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("loliSnatcher.LocalbooruHandler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("loliSnatcher.BooruItem");
        Object[] args = new Object[1];
        args[0] = term5641;
        callMethod(klass, "updateBooruItemRow", argTypes, term5583, args);
    }

};


