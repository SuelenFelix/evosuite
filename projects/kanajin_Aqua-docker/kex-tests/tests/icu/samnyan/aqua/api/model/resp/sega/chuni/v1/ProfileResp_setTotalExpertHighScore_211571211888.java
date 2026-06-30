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

public class ProfileResp_setTotalExpertHighScore_211571211888 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4937;
     Object term4956;

    public ProfileResp_setTotalExpertHighScore_211571211888() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4937 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ProfileResp"));
        setField(term4937, term4937.getClass(), "userName", null);
        setIntField(term4937, term4937.getClass(), "level", 0);
        setField(term4937, term4937.getClass(), "exp", null);
        setLongField(term4937, term4937.getClass(), "point", 0L);
        setLongField(term4937, term4937.getClass(), "totalPoint", 0L);
        setIntField(term4937, term4937.getClass(), "playCount", 0);
        setIntField(term4937, term4937.getClass(), "playerRating", 0);
        setIntField(term4937, term4937.getClass(), "highestRating", 0);
        setIntField(term4937, term4937.getClass(), "nameplateId", 0);
        setIntField(term4937, term4937.getClass(), "frameId", 0);
        setIntField(term4937, term4937.getClass(), "characterId", 0);
        setIntField(term4937, term4937.getClass(), "trophyId", 0);
        setIntField(term4937, term4937.getClass(), "totalMapNum", 0);
        setLongField(term4937, term4937.getClass(), "totalHiScore", 0L);
        setLongField(term4937, term4937.getClass(), "totalBasicHighScore", 0L);
        setLongField(term4937, term4937.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term4937, term4937.getClass(), "totalExpertHighScore", 0L);
        setLongField(term4937, term4937.getClass(), "totalMasterHighScore", 0L);
        setIntField(term4937, term4937.getClass(), "friendCount", 0);
        setField(term4937, term4937.getClass(), "firstPlayDate", null);
        setField(term4937, term4937.getClass(), "lastPlayDate", null);
        setIntField(term4937, term4937.getClass(), "courseClass", 0);
        term4956 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ProfileResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term4956;
        callMethod(klass, "setTotalExpertHighScore", argTypes, term4937, args);
    }

};


