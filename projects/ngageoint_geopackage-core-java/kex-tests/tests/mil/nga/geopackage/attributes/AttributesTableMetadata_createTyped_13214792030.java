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

public class AttributesTableMetadata_createTyped_13214792030 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term136914;

    public AttributesTableMetadata_createTyped_13214792030() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term136988 = new ArrayList();
        HashMap term136993 = new HashMap();
        term136914 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesColumns"));
        Object[] term136927 = (Object[]) newArray("java.lang.String", 5);
        setField(term136914, term136914.getClass(), "tableName", "CssqWIyxap");
        setElement(term136927, 0, "EtmaqZMoVN");
        setElement(term136927, 1, "mluXYJByNP");
        setElement(term136927, 2, "kLMqANSDgO");
        setElement(term136927, 3, "nStYnHGCom");
        setElement(term136927, 4, "gfqZitqjcH");
        setField(term136914, term136914.getClass(), "columnNames", term136927);
        setField(term136914, term136914.getClass(), "columns", term136988);
        setBooleanField(term136914, term136914.getClass(), "custom", false);
        setField(term136914, term136914.getClass(), "nameToIndex", term136993);
        setIntField(term136914, term136914.getClass(), "pkIndex", -201517446);
        setBooleanField(term136914, term136914.getClass(), "pkModifiable", false);
        setBooleanField(term136914, term136914.getClass(), "valueValidation", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.attributes.AttributesTableMetadata");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("mil.nga.geopackage.attributes.AttributesColumns");
        Object[] args = new Object[2];
        args[0] = "FTbhYKJKQL";
        args[1] = term136914;
        callMethod(klass, "createTyped", argTypes, null, args);
    }

};


