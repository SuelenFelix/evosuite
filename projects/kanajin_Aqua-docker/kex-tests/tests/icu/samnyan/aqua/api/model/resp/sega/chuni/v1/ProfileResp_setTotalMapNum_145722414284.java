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

public class ProfileResp_setTotalMapNum_145722414284 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4853;
     Object term4872;

    public ProfileResp_setTotalMapNum_145722414284() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4853 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ProfileResp"));
        setField(term4853, term4853.getClass(), "userName", null);
        setIntField(term4853, term4853.getClass(), "level", 0);
        setField(term4853, term4853.getClass(), "exp", null);
        setLongField(term4853, term4853.getClass(), "point", 0L);
        setLongField(term4853, term4853.getClass(), "totalPoint", 0L);
        setIntField(term4853, term4853.getClass(), "playCount", 0);
        setIntField(term4853, term4853.getClass(), "playerRating", 0);
        setIntField(term4853, term4853.getClass(), "highestRating", 0);
        setIntField(term4853, term4853.getClass(), "nameplateId", 0);
        setIntField(term4853, term4853.getClass(), "frameId", 0);
        setIntField(term4853, term4853.getClass(), "characterId", 0);
        setIntField(term4853, term4853.getClass(), "trophyId", 0);
        setIntField(term4853, term4853.getClass(), "totalMapNum", 0);
        setLongField(term4853, term4853.getClass(), "totalHiScore", 0L);
        setLongField(term4853, term4853.getClass(), "totalBasicHighScore", 0L);
        setLongField(term4853, term4853.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term4853, term4853.getClass(), "totalExpertHighScore", 0L);
        setLongField(term4853, term4853.getClass(), "totalMasterHighScore", 0L);
        setIntField(term4853, term4853.getClass(), "friendCount", 0);
        setField(term4853, term4853.getClass(), "firstPlayDate", null);
        setField(term4853, term4853.getClass(), "lastPlayDate", null);
        setIntField(term4853, term4853.getClass(), "courseClass", 0);
        term4872 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ProfileResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term4872;
        callMethod(klass, "setTotalMapNum", argTypes, term4853, args);
    }

};


