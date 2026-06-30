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
import java.lang.Integer;

public class ProfileResp_setCharacterId_85761482482 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4811;
     Object term4830;

    public ProfileResp_setCharacterId_85761482482() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4811 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ProfileResp"));
        setField(term4811, term4811.getClass(), "userName", null);
        setIntField(term4811, term4811.getClass(), "level", 0);
        setField(term4811, term4811.getClass(), "exp", null);
        setLongField(term4811, term4811.getClass(), "point", 0L);
        setLongField(term4811, term4811.getClass(), "totalPoint", 0L);
        setIntField(term4811, term4811.getClass(), "playCount", 0);
        setIntField(term4811, term4811.getClass(), "playerRating", 0);
        setIntField(term4811, term4811.getClass(), "highestRating", 0);
        setIntField(term4811, term4811.getClass(), "nameplateId", 0);
        setIntField(term4811, term4811.getClass(), "frameId", 0);
        setIntField(term4811, term4811.getClass(), "characterId", 0);
        setIntField(term4811, term4811.getClass(), "trophyId", 0);
        setIntField(term4811, term4811.getClass(), "totalMapNum", 0);
        setLongField(term4811, term4811.getClass(), "totalHiScore", 0L);
        setLongField(term4811, term4811.getClass(), "totalBasicHighScore", 0L);
        setLongField(term4811, term4811.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term4811, term4811.getClass(), "totalExpertHighScore", 0L);
        setLongField(term4811, term4811.getClass(), "totalMasterHighScore", 0L);
        setIntField(term4811, term4811.getClass(), "friendCount", 0);
        setField(term4811, term4811.getClass(), "firstPlayDate", null);
        setField(term4811, term4811.getClass(), "lastPlayDate", null);
        setIntField(term4811, term4811.getClass(), "courseClass", 0);
        term4830 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ProfileResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term4830;
        callMethod(klass, "setCharacterId", argTypes, term4811, args);
    }

};


