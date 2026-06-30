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

public class ProfileResp_getTotalBasicHighScore_182644732864 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4453;

    public ProfileResp_getTotalBasicHighScore_182644732864() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4453 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ProfileResp"));
        setField(term4453, term4453.getClass(), "userName", null);
        setIntField(term4453, term4453.getClass(), "level", 0);
        setField(term4453, term4453.getClass(), "exp", null);
        setLongField(term4453, term4453.getClass(), "point", 0L);
        setLongField(term4453, term4453.getClass(), "totalPoint", 0L);
        setIntField(term4453, term4453.getClass(), "playCount", 0);
        setIntField(term4453, term4453.getClass(), "playerRating", 0);
        setIntField(term4453, term4453.getClass(), "highestRating", 0);
        setIntField(term4453, term4453.getClass(), "nameplateId", 0);
        setIntField(term4453, term4453.getClass(), "frameId", 0);
        setIntField(term4453, term4453.getClass(), "characterId", 0);
        setIntField(term4453, term4453.getClass(), "trophyId", 0);
        setIntField(term4453, term4453.getClass(), "totalMapNum", 0);
        setLongField(term4453, term4453.getClass(), "totalHiScore", 0L);
        setLongField(term4453, term4453.getClass(), "totalBasicHighScore", 0L);
        setLongField(term4453, term4453.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term4453, term4453.getClass(), "totalExpertHighScore", 0L);
        setLongField(term4453, term4453.getClass(), "totalMasterHighScore", 0L);
        setIntField(term4453, term4453.getClass(), "friendCount", 0);
        setField(term4453, term4453.getClass(), "firstPlayDate", null);
        setField(term4453, term4453.getClass(), "lastPlayDate", null);
        setIntField(term4453, term4453.getClass(), "courseClass", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ProfileResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalBasicHighScore", argTypes, term4453, args);
    }

};


