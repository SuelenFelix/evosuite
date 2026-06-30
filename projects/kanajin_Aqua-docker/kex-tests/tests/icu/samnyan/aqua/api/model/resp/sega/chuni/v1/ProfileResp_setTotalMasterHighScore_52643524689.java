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

public class ProfileResp_setTotalMasterHighScore_52643524689 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4958;
     Object term4977;

    public ProfileResp_setTotalMasterHighScore_52643524689() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4958 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ProfileResp"));
        setField(term4958, term4958.getClass(), "userName", null);
        setIntField(term4958, term4958.getClass(), "level", 0);
        setField(term4958, term4958.getClass(), "exp", null);
        setLongField(term4958, term4958.getClass(), "point", 0L);
        setLongField(term4958, term4958.getClass(), "totalPoint", 0L);
        setIntField(term4958, term4958.getClass(), "playCount", 0);
        setIntField(term4958, term4958.getClass(), "playerRating", 0);
        setIntField(term4958, term4958.getClass(), "highestRating", 0);
        setIntField(term4958, term4958.getClass(), "nameplateId", 0);
        setIntField(term4958, term4958.getClass(), "frameId", 0);
        setIntField(term4958, term4958.getClass(), "characterId", 0);
        setIntField(term4958, term4958.getClass(), "trophyId", 0);
        setIntField(term4958, term4958.getClass(), "totalMapNum", 0);
        setLongField(term4958, term4958.getClass(), "totalHiScore", 0L);
        setLongField(term4958, term4958.getClass(), "totalBasicHighScore", 0L);
        setLongField(term4958, term4958.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term4958, term4958.getClass(), "totalExpertHighScore", 0L);
        setLongField(term4958, term4958.getClass(), "totalMasterHighScore", 0L);
        setIntField(term4958, term4958.getClass(), "friendCount", 0);
        setField(term4958, term4958.getClass(), "firstPlayDate", null);
        setField(term4958, term4958.getClass(), "lastPlayDate", null);
        setIntField(term4958, term4958.getClass(), "courseClass", 0);
        term4977 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ProfileResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term4977;
        callMethod(klass, "setTotalMasterHighScore", argTypes, term4958, args);
    }

};


