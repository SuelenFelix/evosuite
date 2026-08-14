package mil.nga.geopackage.tiles.reproject;

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
import static mil.nga.geopackage.tiles.reproject.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.LinkedList;
import java.lang.Long;
import java.lang.Object;

public class TileReprojectionCore_reproject_165062890928 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57;

    public TileReprojectionCore_reproject_165062890928() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term60 = new Long(6811161968424632369L);
        Long term63 = new Long(-7237588299778557629L);
        Long term66 = new Long(6967924379644551255L);
        Long term69 = new Long(-2813493605142626659L);
        term57 = new LinkedList();
        ((LinkedList) term57).add(term60);
        ((LinkedList) term57).add(term63);
        ((LinkedList) term57).add(term66);
        ((LinkedList) term57).add(term69);
        ((LinkedList) term57).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.tiles.reproject.TileReprojectionCore");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term57;
        callMethod(klass, "reproject", argTypes, null, args);
    }

};


