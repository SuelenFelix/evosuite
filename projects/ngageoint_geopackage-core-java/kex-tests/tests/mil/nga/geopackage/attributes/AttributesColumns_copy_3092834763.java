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

public class AttributesColumns_copy_3092834763 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term183375;

    public AttributesColumns_copy_3092834763() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term183437 = new ArrayList();
        HashMap term183442 = new HashMap();
        term183375 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesColumns"));
        Object[] term183388 = (Object[]) newArray("java.lang.String", 4);
        setField(term183375, term183375.getClass(), "tableName", "OgafASdxEn");
        setElement(term183388, 0, "SdEDpqIgHG");
        setElement(term183388, 1, "KiOHPfuKbp");
        setElement(term183388, 2, "faneZfiPkz");
        setElement(term183388, 3, "xKSrJBCTXk");
        setField(term183375, term183375.getClass(), "columnNames", term183388);
        setField(term183375, term183375.getClass(), "columns", term183437);
        setBooleanField(term183375, term183375.getClass(), "custom", false);
        setField(term183375, term183375.getClass(), "nameToIndex", term183442);
        setIntField(term183375, term183375.getClass(), "pkIndex", -2069930777);
        setBooleanField(term183375, term183375.getClass(), "pkModifiable", true);
        setBooleanField(term183375, term183375.getClass(), "valueValidation", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.attributes.AttributesColumns");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "copy", argTypes, term183375, args);
    }

};


