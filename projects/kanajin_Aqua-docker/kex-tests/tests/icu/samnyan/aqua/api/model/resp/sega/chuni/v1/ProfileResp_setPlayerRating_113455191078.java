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

public class ProfileResp_setPlayerRating_113455191078 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4727;
     Object term4746;

    public ProfileResp_setPlayerRating_113455191078() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4727 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ProfileResp"));
        setField(term4727, term4727.getClass(), "userName", null);
        setIntField(term4727, term4727.getClass(), "level", 0);
        setField(term4727, term4727.getClass(), "exp", null);
        setLongField(term4727, term4727.getClass(), "point", 0L);
        setLongField(term4727, term4727.getClass(), "totalPoint", 0L);
        setIntField(term4727, term4727.getClass(), "playCount", 0);
        setIntField(term4727, term4727.getClass(), "playerRating", 0);
        setIntField(term4727, term4727.getClass(), "highestRating", 0);
        setIntField(term4727, term4727.getClass(), "nameplateId", 0);
        setIntField(term4727, term4727.getClass(), "frameId", 0);
        setIntField(term4727, term4727.getClass(), "characterId", 0);
        setIntField(term4727, term4727.getClass(), "trophyId", 0);
        setIntField(term4727, term4727.getClass(), "totalMapNum", 0);
        setLongField(term4727, term4727.getClass(), "totalHiScore", 0L);
        setLongField(term4727, term4727.getClass(), "totalBasicHighScore", 0L);
        setLongField(term4727, term4727.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term4727, term4727.getClass(), "totalExpertHighScore", 0L);
        setLongField(term4727, term4727.getClass(), "totalMasterHighScore", 0L);
        setIntField(term4727, term4727.getClass(), "friendCount", 0);
        setField(term4727, term4727.getClass(), "firstPlayDate", null);
        setField(term4727, term4727.getClass(), "lastPlayDate", null);
        setIntField(term4727, term4727.getClass(), "courseClass", 0);
        term4746 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ProfileResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term4746;
        callMethod(klass, "setPlayerRating", argTypes, term4727, args);
    }

};


