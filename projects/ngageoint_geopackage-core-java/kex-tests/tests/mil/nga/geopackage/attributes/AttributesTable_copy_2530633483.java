package mil.nga.geopackage.attributes;

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
import static mil.nga.geopackage.attributes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.util.HashMap;

public class AttributesTable_copy_2530633483 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5044;

    public AttributesTable_copy_2530633483() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term5046 = new ArrayList();
        HashMap term5050 = new HashMap();
        term5044 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesTable"));
        Object term5045 = newInstance(Class.forName("mil.nga.geopackage.db.table.Constraints"));
        setField(term5044, term5044.getClass(), "columns", null);
        setField(term5045, term5045.getClass(), "constraints", term5046);
        setField(term5045, term5045.getClass(), "typedContraints", term5050);
        setField(term5044, term5044.getClass(), "constraints", term5045);
        setField(term5044, term5044.getClass(), "contents", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.attributes.AttributesTable");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "copy", argTypes, term5044, args);
    }

};


