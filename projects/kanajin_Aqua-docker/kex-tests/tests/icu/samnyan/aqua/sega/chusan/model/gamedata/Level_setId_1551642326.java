package icu.samnyan.aqua.sega.chusan.model.gamedata;

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
import static icu.samnyan.aqua.sega.chusan.model.gamedata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;
import java.util.HashMap;
import java.lang.Long;

public class Level_setId_1551642326 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18500;
     Object term18596;

    public Level_setId_1551642326() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term18629 = Class.forName((String) "icu.samnyan.aqua.sega.chusan.model.gamedata.Genre");
        Field term18628 = ((Class) term18629).getDeclaredField((String) "TOUHOU");
        ((Field) term18628).setAccessible(true);
        Object enum32 = ((Field) term18628).get((Object) null);
        HashMap term18582 = new HashMap();
        term18500 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.Level"));
        Object term18502 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.Music"));
        setLongField(term18500, term18500.getClass(), "id", -6685235643232255177L);
        setIntField(term18502, term18502.getClass(), "musicId", -355376034);
        setField(term18502, term18502.getClass(), "name", "OxNXeKMDje");
        setField(term18502, term18502.getClass(), "sortName", "hGTqHomrbc");
        setField(term18502, term18502.getClass(), "artistName", "NNMBrIWEBw");
        setField(term18502, term18502.getClass(), "genre", enum32);
        setField(term18502, term18502.getClass(), "releaseVersion", "GrTaccOQzl");
        setField(term18502, term18502.getClass(), "levels", term18582);
        setField(term18500, term18500.getClass(), "music", term18502);
        setBooleanField(term18500, term18500.getClass(), "enable", true);
        setIntField(term18500, term18500.getClass(), "level", -1780848958);
        setIntField(term18500, term18500.getClass(), "levelDecimal", 1235045850);
        setIntField(term18500, term18500.getClass(), "diff", -75143033);
        term18596 = new Long(174253963298276221L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.Level");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term18596;
        callMethod(klass, "setId", argTypes, term18500, args);
    }

};


