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

public class AttributesColumns_copy_3092834764 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5645;

    public AttributesColumns_copy_3092834764() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term5671 = new ArrayList();
        HashMap term5676 = new HashMap();
        term5645 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesColumns"));
        Object[] term5658 = (Object[]) newArray("java.lang.String", 1);
        setField(term5645, term5645.getClass(), "tableName", "qxhOsmyyjm");
        setElement(term5658, 0, "DuKcNfVVYR");
        setField(term5645, term5645.getClass(), "columnNames", term5658);
        setField(term5645, term5645.getClass(), "columns", term5671);
        setBooleanField(term5645, term5645.getClass(), "custom", true);
        setField(term5645, term5645.getClass(), "nameToIndex", term5676);
        setIntField(term5645, term5645.getClass(), "pkIndex", -2027534003);
        setBooleanField(term5645, term5645.getClass(), "pkModifiable", true);
        setBooleanField(term5645, term5645.getClass(), "valueValidation", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.attributes.AttributesColumns");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "copy", argTypes, term5645, args);
    }

};


