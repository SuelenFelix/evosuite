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

public class AttributesTable_validateContents_19101036896 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term171606;

    public AttributesTable_validateContents_19101036896() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term171608 = new ArrayList();
        HashMap term171612 = new HashMap();
        term171606 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesTable"));
        Object term171607 = newInstance(Class.forName("mil.nga.geopackage.db.table.Constraints"));
        setField(term171606, term171606.getClass(), "columns", null);
        setField(term171607, term171607.getClass(), "constraints", term171608);
        setField(term171607, term171607.getClass(), "typedContraints", term171612);
        setField(term171606, term171606.getClass(), "constraints", term171607);
        setField(term171606, term171606.getClass(), "contents", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.attributes.AttributesTable");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("mil.nga.geopackage.contents.Contents");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "validateContents", argTypes, term171606, args);
    }

};


