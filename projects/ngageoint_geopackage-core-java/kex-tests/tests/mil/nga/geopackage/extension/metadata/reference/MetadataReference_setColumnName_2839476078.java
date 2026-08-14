package mil.nga.geopackage.extension.metadata.reference;

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
import static mil.nga.geopackage.extension.metadata.reference.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;

public class MetadataReference_setColumnName_2839476078 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4135;

    public MetadataReference_setColumnName_2839476078() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4172 = new Long(-5476826692763582090L);
        Long term4277 = new Long(-872011222785455006L);
        term4135 = newInstance(Class.forName("mil.nga.geopackage.extension.metadata.reference.MetadataReference"));
        Object term4174 = newInstance(Class.forName("java.util.Date"));
        Object term4176 = newInstance(Class.forName("mil.nga.geopackage.extension.metadata.Metadata"));
        Object term4227 = newInstance(Class.forName("mil.nga.geopackage.extension.metadata.Metadata"));
        setField(term4135, term4135.getClass(), "referenceScope", "VgZnGoIFwQ");
        setField(term4135, term4135.getClass(), "tableName", "jUbSRrkrYZ");
        setField(term4135, term4135.getClass(), "columnName", "bWWfajKbEX");
        setField(term4135, term4135.getClass(), "rowIdValue", term4172);
        setLongField(term4174, term4174.getClass(), "fastTime", 1495357463288L);
        setField(term4174, term4174.getClass(), "cdate", null);
        setField(term4135, term4135.getClass(), "timestamp", term4174);
        setLongField(term4176, term4176.getClass(), "id", -2585684163342970173L);
        setField(term4176, term4176.getClass(), "scope", "cAPeiZHKGJ");
        setField(term4176, term4176.getClass(), "standardUri", "LvJFtLBaxj");
        setField(term4176, term4176.getClass(), "mimeType", "PHvxnGHptP");
        setField(term4176, term4176.getClass(), "metadata", "TimdotUuNC");
        setField(term4135, term4135.getClass(), "metadata", term4176);
        setLongField(term4135, term4135.getClass(), "fileId", 8059786003080744426L);
        setLongField(term4227, term4227.getClass(), "id", -4365849114644724155L);
        setField(term4227, term4227.getClass(), "scope", "PkWMRdJcBb");
        setField(term4227, term4227.getClass(), "standardUri", "jSpAteRute");
        setField(term4227, term4227.getClass(), "mimeType", "swZVeJAxjt");
        setField(term4227, term4227.getClass(), "metadata", "xOcJIiQQDu");
        setField(term4135, term4135.getClass(), "parentMetadata", term4227);
        setField(term4135, term4135.getClass(), "parentId", term4277);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.metadata.reference.MetadataReference");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "GVizqqzXpy";
        callMethod(klass, "setColumnName", argTypes, term4135, args);
    }

};


