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

public class ProfileResp_getTotalHiScore_43519208363 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4434;

    public ProfileResp_getTotalHiScore_43519208363() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4434 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ProfileResp"));
        setField(term4434, term4434.getClass(), "userName", null);
        setIntField(term4434, term4434.getClass(), "level", 0);
        setField(term4434, term4434.getClass(), "exp", null);
        setLongField(term4434, term4434.getClass(), "point", 0L);
        setLongField(term4434, term4434.getClass(), "totalPoint", 0L);
        setIntField(term4434, term4434.getClass(), "playCount", 0);
        setIntField(term4434, term4434.getClass(), "playerRating", 0);
        setIntField(term4434, term4434.getClass(), "highestRating", 0);
        setIntField(term4434, term4434.getClass(), "nameplateId", 0);
        setIntField(term4434, term4434.getClass(), "frameId", 0);
        setIntField(term4434, term4434.getClass(), "characterId", 0);
        setIntField(term4434, term4434.getClass(), "trophyId", 0);
        setIntField(term4434, term4434.getClass(), "totalMapNum", 0);
        setLongField(term4434, term4434.getClass(), "totalHiScore", 0L);
        setLongField(term4434, term4434.getClass(), "totalBasicHighScore", 0L);
        setLongField(term4434, term4434.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term4434, term4434.getClass(), "totalExpertHighScore", 0L);
        setLongField(term4434, term4434.getClass(), "totalMasterHighScore", 0L);
        setIntField(term4434, term4434.getClass(), "friendCount", 0);
        setField(term4434, term4434.getClass(), "firstPlayDate", null);
        setField(term4434, term4434.getClass(), "lastPlayDate", null);
        setIntField(term4434, term4434.getClass(), "courseClass", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ProfileResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalHiScore", argTypes, term4434, args);
    }

};


