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

public class AttributesTableMetadata_create_45133485316 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term135779;
     Object term135872;

    public AttributesTableMetadata_create_45133485316() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term135853 = new ArrayList();
        HashMap term135858 = new HashMap();
        term135779 = newInstance(Class.forName("mil.nga.geopackage.attributes.AttributesColumns"));
        Object[] term135792 = (Object[]) newArray("java.lang.String", 5);
        setField(term135779, term135779.getClass(), "tableName", "oWooJBZOyh");
        setElement(term135792, 0, "iNnWLGJCBN");
        setElement(term135792, 1, "jYJrGEVHCD");
        setElement(term135792, 2, "wlBPkhpzWH");
        setElement(term135792, 3, "aBZsgezjug");
        setElement(term135792, 4, "hvlXhuKNfP");
        setField(term135779, term135779.getClass(), "columnNames", term135792);
        setField(term135779, term135779.getClass(), "columns", term135853);
        setBooleanField(term135779, term135779.getClass(), "custom", false);
        setField(term135779, term135779.getClass(), "nameToIndex", term135858);
        setIntField(term135779, term135779.getClass(), "pkIndex", 510162332);
        setBooleanField(term135779, term135779.getClass(), "pkModifiable", false);
        setBooleanField(term135779, term135779.getClass(), "valueValidation", false);
        ArrayList term135873 = new ArrayList();
        HashMap term135877 = new HashMap();
        term135872 = newInstance(Class.forName("mil.nga.geopackage.db.table.Constraints"));
        setField(term135872, term135872.getClass(), "constraints", term135873);
        setField(term135872, term135872.getClass(), "typedContraints", term135877);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.attributes.AttributesTableMetadata");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("mil.nga.geopackage.attributes.AttributesColumns");
        argTypes[1] = Class.forName("mil.nga.geopackage.db.table.Constraints");
        Object[] args = new Object[2];
        args[0] = term135779;
        args[1] = term135872;
        callMethod(klass, "create", argTypes, null, args);
    }

};


