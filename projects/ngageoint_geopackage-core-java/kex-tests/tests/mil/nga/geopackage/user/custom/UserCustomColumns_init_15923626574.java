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

public class UserCustomColumns_init_15923626574 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4584;

    public UserCustomColumns_init_15923626574() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term4585 = new ArrayList();
        ((ArrayList) term4585).add("PCipZnmBOF");
        ((ArrayList) term4585).add("zcorEihhLK");
        ((ArrayList) term4585).add("GrqozDKFOk");
        ((ArrayList) term4585).add("CFyoseFGLF");
        ((ArrayList) term4585).add("SFqCrhEWLm");
        ((ArrayList) term4585).add("GZdcJyZntS");
        ((ArrayList) term4585).add("OIHoJeysUi");
        ((ArrayList) term4585).add("WXMWFDGcLB");
        ((ArrayList) term4585).add("wKWbJssZuG");
        ArrayList term4710 = new ArrayList();
        HashMap term4715 = new HashMap();
        term4584 = newInstance(Class.forName("mil.nga.geopackage.user.custom.UserCustomColumns"));
        Object[] term4709 = (Object[]) newArray("java.lang.String", 0);
        setField(term4584, term4584.getClass(), "requiredColumns", term4585);
        setField(term4584, term4584.getClass(), "tableName", "NzBMMhkhpT");
        setField(term4584, term4584.getClass(), "columnNames", term4709);
        setField(term4584, term4584.getClass(), "columns", term4710);
        setBooleanField(term4584, term4584.getClass(), "custom", false);
        setField(term4584, term4584.getClass(), "nameToIndex", term4715);
        setIntField(term4584, term4584.getClass(), "pkIndex", -469968304);
        setBooleanField(term4584, term4584.getClass(), "pkModifiable", false);
        setBooleanField(term4584, term4584.getClass(), "valueValidation", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.user.custom.UserCustomColumns");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("mil.nga.geopackage.user.custom.UserCustomColumns");
        Object[] args = new Object[1];
        args[0] = term4584;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


