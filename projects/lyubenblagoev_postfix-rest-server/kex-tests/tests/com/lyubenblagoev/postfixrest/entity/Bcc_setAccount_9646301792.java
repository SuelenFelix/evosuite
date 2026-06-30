package com.lyubenblagoev.postfixrest.entity;

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
import static com.lyubenblagoev.postfixrest.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;

public class Bcc_setAccount_9646301792 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4765;
     Object term4839;

    public Bcc_setAccount_9646301792() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4782 = new Long(-159468133651974975L);
        Long term4813 = new Long(9160882370265093763L);
        Long term4832 = new Long(6848008460134431064L);
        term4765 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.Bcc"));
        Object term4766 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.Account"));
        Object term4767 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.Domain"));
        Object term4780 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        Object term4785 = newInstance(Class.forName("java.util.Date"));
        Object term4787 = newInstance(Class.forName("java.util.Date"));
        Object term4816 = newInstance(Class.forName("java.util.Date"));
        Object term4818 = newInstance(Class.forName("java.util.Date"));
        Object term4835 = newInstance(Class.forName("java.util.Date"));
        Object term4837 = newInstance(Class.forName("java.util.Date"));
        setField(term4767, term4767.getClass(), "name", "lRaSlqzqNY");
        setIntField(term4780, term4780.getClass(), "modCount", 0);
        setField(term4767, term4767.getClass(), "accounts", term4780);
        setField(term4767, term4767.getClass(), "aliases", term4780);
        setField(term4767, term4767.getClass(), "id", term4782);
        setBooleanField(term4767, term4767.getClass(), "enabled", false);
        setLongField(term4785, term4785.getClass(), "fastTime", 1263263667787L);
        setField(term4785, term4785.getClass(), "cdate", null);
        setField(term4767, term4767.getClass(), "created", term4785);
        setLongField(term4787, term4787.getClass(), "fastTime", 1860500882998L);
        setField(term4787, term4787.getClass(), "cdate", null);
        setField(term4767, term4767.getClass(), "updated", term4787);
        setField(term4766, term4766.getClass(), "domain", term4767);
        setField(term4766, term4766.getClass(), "username", "TiEyxWXsra");
        setField(term4766, term4766.getClass(), "password", "TuLgwTZsPP");
        setField(term4766, term4766.getClass(), "id", term4813);
        setBooleanField(term4766, term4766.getClass(), "enabled", false);
        setLongField(term4816, term4816.getClass(), "fastTime", 1596904935889L);
        setField(term4816, term4816.getClass(), "cdate", null);
        setField(term4766, term4766.getClass(), "created", term4816);
        setLongField(term4818, term4818.getClass(), "fastTime", 1544906682190L);
        setField(term4818, term4818.getClass(), "cdate", null);
        setField(term4766, term4766.getClass(), "updated", term4818);
        setField(term4765, term4765.getClass(), "account", term4766);
        setField(term4765, term4765.getClass(), "receiverEmailAddress", "KoasxTJGpx");
        setField(term4765, term4765.getClass(), "id", term4832);
        setBooleanField(term4765, term4765.getClass(), "enabled", true);
        setLongField(term4835, term4835.getClass(), "fastTime", 1772247440345L);
        setField(term4835, term4835.getClass(), "cdate", null);
        setField(term4765, term4765.getClass(), "created", term4835);
        setLongField(term4837, term4837.getClass(), "fastTime", 1794516079179L);
        setField(term4837, term4837.getClass(), "cdate", null);
        setField(term4765, term4765.getClass(), "updated", term4837);
        Long term4853 = new Long(-5338413783740215067L);
        Long term4884 = new Long(-814922776357887557L);
        term4839 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.Account"));
        Object term4840 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.Domain"));
        Object term4856 = newInstance(Class.forName("java.util.Date"));
        Object term4858 = newInstance(Class.forName("java.util.Date"));
        Object term4887 = newInstance(Class.forName("java.util.Date"));
        Object term4889 = newInstance(Class.forName("java.util.Date"));
        setField(term4840, term4840.getClass(), "name", "ceGeARYMoa");
        setField(term4840, term4840.getClass(), "accounts", term4780);
        setField(term4840, term4840.getClass(), "aliases", term4780);
        setField(term4840, term4840.getClass(), "id", term4853);
        setBooleanField(term4840, term4840.getClass(), "enabled", true);
        setLongField(term4856, term4856.getClass(), "fastTime", 1330069512898L);
        setField(term4856, term4856.getClass(), "cdate", null);
        setField(term4840, term4840.getClass(), "created", term4856);
        setLongField(term4858, term4858.getClass(), "fastTime", 1371995370004L);
        setField(term4858, term4858.getClass(), "cdate", null);
        setField(term4840, term4840.getClass(), "updated", term4858);
        setField(term4839, term4839.getClass(), "domain", term4840);
        setField(term4839, term4839.getClass(), "username", "fFWllaiFvh");
        setField(term4839, term4839.getClass(), "password", "PFTdEDSbvZ");
        setField(term4839, term4839.getClass(), "id", term4884);
        setBooleanField(term4839, term4839.getClass(), "enabled", false);
        setLongField(term4887, term4887.getClass(), "fastTime", 1869302296932L);
        setField(term4887, term4887.getClass(), "cdate", null);
        setField(term4839, term4839.getClass(), "created", term4887);
        setLongField(term4889, term4889.getClass(), "fastTime", 1813524348389L);
        setField(term4889, term4889.getClass(), "cdate", null);
        setField(term4839, term4839.getClass(), "updated", term4889);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.lyubenblagoev.postfixrest.entity.Bcc");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.lyubenblagoev.postfixrest.entity.Account");
        Object[] args = new Object[1];
        args[0] = term4839;
        callMethod(klass, "setAccount", argTypes, term4765, args);
    }

};


