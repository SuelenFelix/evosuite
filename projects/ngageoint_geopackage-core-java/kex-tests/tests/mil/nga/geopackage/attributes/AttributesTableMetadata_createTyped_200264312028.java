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
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.HashMap;

public class AttributesTableMetadata_createTyped_200264312028 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term136778;
     Object term136781;

    public AttributesTableMetadata_createTyped_200264312028() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term136778 = new LinkedList();
        ArrayList term136782 = new ArrayList();
        HashMap term136786 = new HashMap();
        term136781 = newInstance(Class.forName("mil.nga.geopackage.db.table.Constraints"));
        setField(term136781, term136781.getClass(), "constraints", term136782);
        setField(term136781, term136781.getClass(), "typedContraints", term136786);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.attributes.AttributesTableMetadata");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.util.List");
        argTypes[4] = Class.forName("mil.nga.geopackage.db.table.Constraints");
        Object[] args = new Object[5];
        args[0] = "GhZQSLeLeq";
        args[1] = "vCJwFnMbeg";
        args[2] = "HiMyMWtfDT";
        args[3] = term136778;
        args[4] = term136781;
        callMethod(klass, "createTyped", argTypes, null, args);
    }

};


