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

public class ProfileResp_toString_99034915397 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5116;

    public ProfileResp_toString_99034915397() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5116 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ProfileResp"));
        setField(term5116, term5116.getClass(), "userName", null);
        setIntField(term5116, term5116.getClass(), "level", 0);
        setField(term5116, term5116.getClass(), "exp", null);
        setLongField(term5116, term5116.getClass(), "point", 0L);
        setLongField(term5116, term5116.getClass(), "totalPoint", 0L);
        setIntField(term5116, term5116.getClass(), "playCount", 0);
        setIntField(term5116, term5116.getClass(), "playerRating", 0);
        setIntField(term5116, term5116.getClass(), "highestRating", 0);
        setIntField(term5116, term5116.getClass(), "nameplateId", 0);
        setIntField(term5116, term5116.getClass(), "frameId", 0);
        setIntField(term5116, term5116.getClass(), "characterId", 0);
        setIntField(term5116, term5116.getClass(), "trophyId", 0);
        setIntField(term5116, term5116.getClass(), "totalMapNum", 0);
        setLongField(term5116, term5116.getClass(), "totalHiScore", 0L);
        setLongField(term5116, term5116.getClass(), "totalBasicHighScore", 0L);
        setLongField(term5116, term5116.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term5116, term5116.getClass(), "totalExpertHighScore", 0L);
        setLongField(term5116, term5116.getClass(), "totalMasterHighScore", 0L);
        setIntField(term5116, term5116.getClass(), "friendCount", 0);
        setField(term5116, term5116.getClass(), "firstPlayDate", null);
        setField(term5116, term5116.getClass(), "lastPlayDate", null);
        setIntField(term5116, term5116.getClass(), "courseClass", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ProfileResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term5116, args);
    }

};


