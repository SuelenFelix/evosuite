package com.hamitmizrak.data.entity;

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
import static com.hamitmizrak.data.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;

public class BaseEntityAudit_hashCode_140361801013 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term799;

    public BaseEntityAudit_hashCode_140361801013() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term800 = new Long(2535595959091595249L);
        term799 = newInstance(Class.forName("com.hamitmizrak.data.entity.BaseEntityAudit"));
        Object term814 = newInstance(Class.forName("java.util.Date"));
        Object term828 = newInstance(Class.forName("java.util.Date"));
        setField(term799, term799.getClass(), "id", term800);
        setField(term799, term799.getClass(), "createdBy", "AijpHYOFuy");
        setLongField(term814, term814.getClass(), "fastTime", 1630952644759L);
        setField(term814, term814.getClass(), "cdate", null);
        setField(term799, term799.getClass(), "createdDate", term814);
        setField(term799, term799.getClass(), "updateBy", "SbAoxhfrkn");
        setLongField(term828, term828.getClass(), "fastTime", 1739417792956L);
        setField(term828, term828.getClass(), "cdate", null);
        setField(term799, term799.getClass(), "updateDate", term828);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.hamitmizrak.data.entity.BaseEntityAudit");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term799, args);
    }

};


