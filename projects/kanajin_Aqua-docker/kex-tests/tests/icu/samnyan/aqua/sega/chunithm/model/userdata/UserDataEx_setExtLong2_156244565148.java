package icu.samnyan.aqua.sega.chunithm.model.userdata;

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
import static icu.samnyan.aqua.sega.chunithm.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class UserDataEx_setExtLong2_156244565148 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48439;
     Object term48469;

    public UserDataEx_setExtLong2_156244565148() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48439 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserDataEx"));
        setLongField(term48439, term48439.getClass(), "id", 0L);
        setField(term48439, term48439.getClass(), "user", null);
        setField(term48439, term48439.getClass(), "compatibleCmVersion", null);
        setIntField(term48439, term48439.getClass(), "medal", 0);
        setIntField(term48439, term48439.getClass(), "mapIconId", 0);
        setIntField(term48439, term48439.getClass(), "voiceId", 0);
        setIntField(term48439, term48439.getClass(), "ext1", 0);
        setIntField(term48439, term48439.getClass(), "ext2", 0);
        setIntField(term48439, term48439.getClass(), "ext3", 0);
        setIntField(term48439, term48439.getClass(), "ext4", 0);
        setIntField(term48439, term48439.getClass(), "ext5", 0);
        setIntField(term48439, term48439.getClass(), "ext6", 0);
        setIntField(term48439, term48439.getClass(), "ext7", 0);
        setIntField(term48439, term48439.getClass(), "ext8", 0);
        setIntField(term48439, term48439.getClass(), "ext9", 0);
        setIntField(term48439, term48439.getClass(), "ext10", 0);
        setIntField(term48439, term48439.getClass(), "ext11", 0);
        setIntField(term48439, term48439.getClass(), "ext12", 0);
        setIntField(term48439, term48439.getClass(), "ext13", 0);
        setIntField(term48439, term48439.getClass(), "ext14", 0);
        setIntField(term48439, term48439.getClass(), "ext15", 0);
        setIntField(term48439, term48439.getClass(), "ext16", 0);
        setIntField(term48439, term48439.getClass(), "ext17", 0);
        setIntField(term48439, term48439.getClass(), "ext18", 0);
        setIntField(term48439, term48439.getClass(), "ext19", 0);
        setIntField(term48439, term48439.getClass(), "ext20", 0);
        setField(term48439, term48439.getClass(), "extStr1", null);
        setField(term48439, term48439.getClass(), "extStr2", null);
        setField(term48439, term48439.getClass(), "extStr3", null);
        setField(term48439, term48439.getClass(), "extStr4", null);
        setField(term48439, term48439.getClass(), "extStr5", null);
        setLongField(term48439, term48439.getClass(), "extLong1", 0L);
        setLongField(term48439, term48439.getClass(), "extLong2", 0L);
        setLongField(term48439, term48439.getClass(), "extLong3", 0L);
        setLongField(term48439, term48439.getClass(), "extLong4", 0L);
        setLongField(term48439, term48439.getClass(), "extLong5", 0L);
        term48469 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserDataEx");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term48469;
        callMethod(klass, "setExtLong2", argTypes, term48439, args);
    }

};


