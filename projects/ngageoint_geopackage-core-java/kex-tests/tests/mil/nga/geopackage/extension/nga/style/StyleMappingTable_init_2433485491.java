package mil.nga.geopackage.extension.nga.style;

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
import static mil.nga.geopackage.extension.nga.style.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.util.HashMap;

public class StyleMappingTable_init_2433485491 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7841;

    public StyleMappingTable_init_2433485491() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term7843 = new ArrayList();
        HashMap term7847 = new HashMap();
        term7841 = newInstance(Class.forName("mil.nga.geopackage.user.custom.UserCustomTable"));
        Object term7842 = newInstance(Class.forName("mil.nga.geopackage.db.table.Constraints"));
        setField(term7841, term7841.getClass(), "columns", null);
        setField(term7842, term7842.getClass(), "constraints", term7843);
        setField(term7842, term7842.getClass(), "typedContraints", term7847);
        setField(term7841, term7841.getClass(), "constraints", term7842);
        setField(term7841, term7841.getClass(), "contents", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.nga.style.StyleMappingTable");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("mil.nga.geopackage.user.custom.UserCustomTable");
        Object[] args = new Object[1];
        args[0] = term7841;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


