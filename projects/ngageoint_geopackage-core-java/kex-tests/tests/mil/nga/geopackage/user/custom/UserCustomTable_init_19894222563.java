package mil.nga.geopackage.user.custom;

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
import static mil.nga.geopackage.user.custom.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;
import java.util.HashMap;

public class UserCustomTable_init_19894222563 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6028;

    public UserCustomTable_init_19894222563() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term6029 = new ArrayList();
        ((ArrayList) term6029).add("PsqusYmejD");
        ((ArrayList) term6029).add("NTWMiBEaDF");
        ArrayList term6142 = new ArrayList();
        HashMap term6147 = new HashMap();
        term6028 = newInstance(Class.forName("mil.nga.geopackage.user.custom.UserCustomColumns"));
        Object[] term6069 = (Object[]) newArray("java.lang.String", 6);
        setField(term6028, term6028.getClass(), "requiredColumns", term6029);
        setField(term6028, term6028.getClass(), "tableName", "SPBstwKFVr");
        setElement(term6069, 0, "WxYUTuqmIq");
        setElement(term6069, 1, "OeQLvhVERT");
        setElement(term6069, 2, "IlvgFINwIa");
        setElement(term6069, 3, "GEJABPlHSI");
        setElement(term6069, 4, "aQFUvuaYxd");
        setElement(term6069, 5, "zNFLXMifnS");
        setField(term6028, term6028.getClass(), "columnNames", term6069);
        setField(term6028, term6028.getClass(), "columns", term6142);
        setBooleanField(term6028, term6028.getClass(), "custom", false);
        setField(term6028, term6028.getClass(), "nameToIndex", term6147);
        setIntField(term6028, term6028.getClass(), "pkIndex", 1632125673);
        setBooleanField(term6028, term6028.getClass(), "pkModifiable", false);
        setBooleanField(term6028, term6028.getClass(), "valueValidation", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.user.custom.UserCustomTable");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("mil.nga.geopackage.user.custom.UserCustomColumns");
        Object[] args = new Object[1];
        args[0] = term6028;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


