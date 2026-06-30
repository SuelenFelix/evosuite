package icu.samnyan.aqua.api.model.resp.sega.chuni.v1;

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
import static icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class ProfileResp_setTotalPoint_30110999676 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4685;
     Object term4704;

    public ProfileResp_setTotalPoint_30110999676() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4685 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ProfileResp"));
        setField(term4685, term4685.getClass(), "userName", null);
        setIntField(term4685, term4685.getClass(), "level", 0);
        setField(term4685, term4685.getClass(), "exp", null);
        setLongField(term4685, term4685.getClass(), "point", 0L);
        setLongField(term4685, term4685.getClass(), "totalPoint", 0L);
        setIntField(term4685, term4685.getClass(), "playCount", 0);
        setIntField(term4685, term4685.getClass(), "playerRating", 0);
        setIntField(term4685, term4685.getClass(), "highestRating", 0);
        setIntField(term4685, term4685.getClass(), "nameplateId", 0);
        setIntField(term4685, term4685.getClass(), "frameId", 0);
        setIntField(term4685, term4685.getClass(), "characterId", 0);
        setIntField(term4685, term4685.getClass(), "trophyId", 0);
        setIntField(term4685, term4685.getClass(), "totalMapNum", 0);
        setLongField(term4685, term4685.getClass(), "totalHiScore", 0L);
        setLongField(term4685, term4685.getClass(), "totalBasicHighScore", 0L);
        setLongField(term4685, term4685.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term4685, term4685.getClass(), "totalExpertHighScore", 0L);
        setLongField(term4685, term4685.getClass(), "totalMasterHighScore", 0L);
        setIntField(term4685, term4685.getClass(), "friendCount", 0);
        setField(term4685, term4685.getClass(), "firstPlayDate", null);
        setField(term4685, term4685.getClass(), "lastPlayDate", null);
        setIntField(term4685, term4685.getClass(), "courseClass", 0);
        term4704 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ProfileResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term4704;
        callMethod(klass, "setTotalPoint", argTypes, term4685, args);
    }

};


