package me.qoomon.gitversioning.commons;

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
import static me.qoomon.gitversioning.commons.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;
import java.util.ArrayList;

public class StringUtil_patternGroupCount_4301666416 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term808;

    public StringUtil_patternGroupCount_4301666416() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term843 = new HashMap();
        ArrayList term898 = new ArrayList();
        term808 = newInstance(Class.forName("java.util.regex.Pattern"));
        Object term836 = newInstance(Class.forName("java.util.regex.Pattern$Node"));
        Object term837 = newInstance(Class.forName("java.util.regex.Pattern$Node"));
        Object term838 = newInstance(Class.forName("java.util.regex.Pattern$Node"));
        int[] term839 = (int[]) newIntArray(3);
        Object[] term854 = (Object[]) newArray("java.util.regex.Pattern$GroupHead", 7);
        Object term855 = newInstance(Class.forName("java.util.regex.Pattern$GroupHead"));
        Object term857 = newInstance(Class.forName("java.util.regex.Pattern$GroupTail"));
        Object term860 = newInstance(Class.forName("java.util.regex.Pattern$Node"));
        Object term861 = newInstance(Class.forName("java.util.regex.Pattern$Node"));
        Object term862 = newInstance(Class.forName("java.util.regex.Pattern$GroupHead"));
        Object term864 = newInstance(Class.forName("java.util.regex.Pattern$GroupTail"));
        Object term867 = newInstance(Class.forName("java.util.regex.Pattern$Node"));
        Object term868 = newInstance(Class.forName("java.util.regex.Pattern$Node"));
        Object term869 = newInstance(Class.forName("java.util.regex.Pattern$GroupHead"));
        Object term871 = newInstance(Class.forName("java.util.regex.Pattern$GroupTail"));
        Object term874 = newInstance(Class.forName("java.util.regex.Pattern$Node"));
        Object term875 = newInstance(Class.forName("java.util.regex.Pattern$Node"));
        Object term876 = newInstance(Class.forName("java.util.regex.Pattern$GroupHead"));
        Object term878 = newInstance(Class.forName("java.util.regex.Pattern$GroupTail"));
        Object term881 = newInstance(Class.forName("java.util.regex.Pattern$Node"));
        Object term882 = newInstance(Class.forName("java.util.regex.Pattern$Node"));
        Object term883 = newInstance(Class.forName("java.util.regex.Pattern$GroupHead"));
        Object term885 = newInstance(Class.forName("java.util.regex.Pattern$GroupTail"));
        Object term888 = newInstance(Class.forName("java.util.regex.Pattern$GroupHead"));
        Object term890 = newInstance(Class.forName("java.util.regex.Pattern$GroupTail"));
        Object term893 = newInstance(Class.forName("java.util.regex.Pattern$GroupHead"));
        Object term895 = newInstance(Class.forName("java.util.regex.Pattern$GroupTail"));
        int[] term904 = (int[]) newIntArray(1);
        setField(term808, term808.getClass(), "pattern", "NRdvgJlhkX");
        setIntField(term808, term808.getClass(), "flags", 1876565163);
        setIntField(term808, term808.getClass(), "flags0", -817164822);
        setBooleanField(term808, term808.getClass(), "compiled", true);
        setField(term808, term808.getClass(), "normalizedPattern", "uuaPigETmJ");
        setField(term837, term837.getClass(), "next", null);
        setField(term836, term836.getClass(), "next", term837);
        setField(term808, term808.getClass(), "root", term836);
        setField(term838, term838.getClass(), "next", term837);
        setField(term808, term808.getClass(), "matchRoot", term838);
        setIntElement(term839, 0, -1016503459);
        setIntElement(term839, 1, -1968847291);
        setIntElement(term839, 2, 579005622);
        setField(term808, term808.getClass(), "buffer", term839);
        setField(term808, term808.getClass(), "predicate", null);
        setField(term808, term808.getClass(), "namedGroups", term843);
        setIntField(term855, term855.getClass(), "localIndex", -14890619);
        setIntField(term857, term857.getClass(), "localIndex", 1632125673);
        setIntField(term857, term857.getClass(), "groupIndex", 454281060);
        setField(term860, term860.getClass(), "next", term837);
        setField(term857, term857.getClass(), "next", term860);
        setField(term855, term855.getClass(), "tail", term857);
        setField(term861, term861.getClass(), "next", term837);
        setField(term855, term855.getClass(), "next", term861);
        setElement(term854, 0, term855);
        setIntField(term862, term862.getClass(), "localIndex", -1786399638);
        setIntField(term864, term864.getClass(), "localIndex", 2055867847);
        setIntField(term864, term864.getClass(), "groupIndex", -1048298087);
        setField(term867, term867.getClass(), "next", term837);
        setField(term864, term864.getClass(), "next", term867);
        setField(term862, term862.getClass(), "tail", term864);
        setField(term868, term868.getClass(), "next", term837);
        setField(term862, term862.getClass(), "next", term868);
        setElement(term854, 1, term862);
        setIntField(term869, term869.getClass(), "localIndex", 292681826);
        setIntField(term871, term871.getClass(), "localIndex", 458147407);
        setIntField(term871, term871.getClass(), "groupIndex", -184153539);
        setField(term874, term874.getClass(), "next", term837);
        setField(term871, term871.getClass(), "next", term874);
        setField(term869, term869.getClass(), "tail", term871);
        setField(term875, term875.getClass(), "next", term837);
        setField(term869, term869.getClass(), "next", term875);
        setElement(term854, 2, term869);
        setIntField(term876, term876.getClass(), "localIndex", 493620644);
        setIntField(term878, term878.getClass(), "localIndex", 1328271830);
        setIntField(term878, term878.getClass(), "groupIndex", 1596070772);
        setField(term881, term881.getClass(), "next", term837);
        setField(term878, term878.getClass(), "next", term881);
        setField(term876, term876.getClass(), "tail", term878);
        setField(term882, term882.getClass(), "next", term837);
        setField(term876, term876.getClass(), "next", term882);
        setElement(term854, 3, term876);
        setIntField(term883, term883.getClass(), "localIndex", 97029295);
        setIntField(term885, term885.getClass(), "localIndex", -1371869594);
        setIntField(term885, term885.getClass(), "groupIndex", -2095575670);
        setField(term885, term885.getClass(), "next", term875);
        setField(term883, term883.getClass(), "tail", term885);
        setField(term883, term883.getClass(), "next", term881);
        setElement(term854, 4, term883);
        setIntField(term888, term888.getClass(), "localIndex", 1225272962);
        setIntField(term890, term890.getClass(), "localIndex", 1324040357);
        setIntField(term890, term890.getClass(), "groupIndex", -1588772968);
        setField(term890, term890.getClass(), "next", term836);
        setField(term888, term888.getClass(), "tail", term890);
        setField(term888, term888.getClass(), "next", term868);
        setElement(term854, 5, term888);
        setIntField(term893, term893.getClass(), "localIndex", -93135961);
        setIntField(term895, term895.getClass(), "localIndex", -112921587);
        setIntField(term895, term895.getClass(), "groupIndex", 933028652);
        setField(term895, term895.getClass(), "next", term861);
        setField(term893, term893.getClass(), "tail", term895);
        setField(term893, term893.getClass(), "next", term838);
        setElement(term854, 6, term893);
        setField(term808, term808.getClass(), "groupNodes", term854);
        setField(term808, term808.getClass(), "topClosureNodes", term898);
        setIntField(term808, term808.getClass(), "localTCNCount", 287287233);
        setBooleanField(term808, term808.getClass(), "hasGroupRef", true);
        setIntElement(term904, 0, 962840079);
        setField(term808, term808.getClass(), "temp", term904);
        setIntField(term808, term808.getClass(), "capturingGroupCount", 1540719661);
        setIntField(term808, term808.getClass(), "localCount", 1265463001);
        setIntField(term808, term808.getClass(), "cursor", 335112684);
        setIntField(term808, term808.getClass(), "patternLength", 1551099402);
        setBooleanField(term808, term808.getClass(), "hasSupplementary", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("me.qoomon.gitversioning.commons.StringUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.regex.Pattern");
        Object[] args = new Object[1];
        args[0] = term808;
        callMethod(klass, "patternGroupCount", argTypes, null, args);
    }

};


