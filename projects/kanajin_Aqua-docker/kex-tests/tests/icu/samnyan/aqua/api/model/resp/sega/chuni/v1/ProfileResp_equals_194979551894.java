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

public class ProfileResp_equals_194979551894 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5059;

    public ProfileResp_equals_194979551894() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5059 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ProfileResp"));
        setField(term5059, term5059.getClass(), "userName", null);
        setIntField(term5059, term5059.getClass(), "level", 0);
        setField(term5059, term5059.getClass(), "exp", null);
        setLongField(term5059, term5059.getClass(), "point", 0L);
        setLongField(term5059, term5059.getClass(), "totalPoint", 0L);
        setIntField(term5059, term5059.getClass(), "playCount", 0);
        setIntField(term5059, term5059.getClass(), "playerRating", 0);
        setIntField(term5059, term5059.getClass(), "highestRating", 0);
        setIntField(term5059, term5059.getClass(), "nameplateId", 0);
        setIntField(term5059, term5059.getClass(), "frameId", 0);
        setIntField(term5059, term5059.getClass(), "characterId", 0);
        setIntField(term5059, term5059.getClass(), "trophyId", 0);
        setIntField(term5059, term5059.getClass(), "totalMapNum", 0);
        setLongField(term5059, term5059.getClass(), "totalHiScore", 0L);
        setLongField(term5059, term5059.getClass(), "totalBasicHighScore", 0L);
        setLongField(term5059, term5059.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term5059, term5059.getClass(), "totalExpertHighScore", 0L);
        setLongField(term5059, term5059.getClass(), "totalMasterHighScore", 0L);
        setIntField(term5059, term5059.getClass(), "friendCount", 0);
        setField(term5059, term5059.getClass(), "firstPlayDate", null);
        setField(term5059, term5059.getClass(), "lastPlayDate", null);
        setIntField(term5059, term5059.getClass(), "courseClass", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ProfileResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "equals", argTypes, term5059, args);
    }

};


