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

public class ProfileResp_setFirstPlayDate_198777587791 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5000;

    public ProfileResp_setFirstPlayDate_198777587791() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5000 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ProfileResp"));
        setField(term5000, term5000.getClass(), "userName", null);
        setIntField(term5000, term5000.getClass(), "level", 0);
        setField(term5000, term5000.getClass(), "exp", null);
        setLongField(term5000, term5000.getClass(), "point", 0L);
        setLongField(term5000, term5000.getClass(), "totalPoint", 0L);
        setIntField(term5000, term5000.getClass(), "playCount", 0);
        setIntField(term5000, term5000.getClass(), "playerRating", 0);
        setIntField(term5000, term5000.getClass(), "highestRating", 0);
        setIntField(term5000, term5000.getClass(), "nameplateId", 0);
        setIntField(term5000, term5000.getClass(), "frameId", 0);
        setIntField(term5000, term5000.getClass(), "characterId", 0);
        setIntField(term5000, term5000.getClass(), "trophyId", 0);
        setIntField(term5000, term5000.getClass(), "totalMapNum", 0);
        setLongField(term5000, term5000.getClass(), "totalHiScore", 0L);
        setLongField(term5000, term5000.getClass(), "totalBasicHighScore", 0L);
        setLongField(term5000, term5000.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term5000, term5000.getClass(), "totalExpertHighScore", 0L);
        setLongField(term5000, term5000.getClass(), "totalMasterHighScore", 0L);
        setIntField(term5000, term5000.getClass(), "friendCount", 0);
        setField(term5000, term5000.getClass(), "firstPlayDate", null);
        setField(term5000, term5000.getClass(), "lastPlayDate", null);
        setIntField(term5000, term5000.getClass(), "courseClass", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ProfileResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setFirstPlayDate", argTypes, term5000, args);
    }

};


