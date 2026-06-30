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

public class ProfileResp_setCourseClass_84607888193 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5038;
     Object term5057;

    public ProfileResp_setCourseClass_84607888193() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5038 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ProfileResp"));
        setField(term5038, term5038.getClass(), "userName", null);
        setIntField(term5038, term5038.getClass(), "level", 0);
        setField(term5038, term5038.getClass(), "exp", null);
        setLongField(term5038, term5038.getClass(), "point", 0L);
        setLongField(term5038, term5038.getClass(), "totalPoint", 0L);
        setIntField(term5038, term5038.getClass(), "playCount", 0);
        setIntField(term5038, term5038.getClass(), "playerRating", 0);
        setIntField(term5038, term5038.getClass(), "highestRating", 0);
        setIntField(term5038, term5038.getClass(), "nameplateId", 0);
        setIntField(term5038, term5038.getClass(), "frameId", 0);
        setIntField(term5038, term5038.getClass(), "characterId", 0);
        setIntField(term5038, term5038.getClass(), "trophyId", 0);
        setIntField(term5038, term5038.getClass(), "totalMapNum", 0);
        setLongField(term5038, term5038.getClass(), "totalHiScore", 0L);
        setLongField(term5038, term5038.getClass(), "totalBasicHighScore", 0L);
        setLongField(term5038, term5038.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term5038, term5038.getClass(), "totalExpertHighScore", 0L);
        setLongField(term5038, term5038.getClass(), "totalMasterHighScore", 0L);
        setIntField(term5038, term5038.getClass(), "friendCount", 0);
        setField(term5038, term5038.getClass(), "firstPlayDate", null);
        setField(term5038, term5038.getClass(), "lastPlayDate", null);
        setIntField(term5038, term5038.getClass(), "courseClass", 0);
        term5057 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ProfileResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term5057;
        callMethod(klass, "setCourseClass", argTypes, term5038, args);
    }

};


