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

public class ProfileResp_setTotalBasicHighScore_102599450686 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4895;
     Object term4914;

    public ProfileResp_setTotalBasicHighScore_102599450686() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4895 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ProfileResp"));
        setField(term4895, term4895.getClass(), "userName", null);
        setIntField(term4895, term4895.getClass(), "level", 0);
        setField(term4895, term4895.getClass(), "exp", null);
        setLongField(term4895, term4895.getClass(), "point", 0L);
        setLongField(term4895, term4895.getClass(), "totalPoint", 0L);
        setIntField(term4895, term4895.getClass(), "playCount", 0);
        setIntField(term4895, term4895.getClass(), "playerRating", 0);
        setIntField(term4895, term4895.getClass(), "highestRating", 0);
        setIntField(term4895, term4895.getClass(), "nameplateId", 0);
        setIntField(term4895, term4895.getClass(), "frameId", 0);
        setIntField(term4895, term4895.getClass(), "characterId", 0);
        setIntField(term4895, term4895.getClass(), "trophyId", 0);
        setIntField(term4895, term4895.getClass(), "totalMapNum", 0);
        setLongField(term4895, term4895.getClass(), "totalHiScore", 0L);
        setLongField(term4895, term4895.getClass(), "totalBasicHighScore", 0L);
        setLongField(term4895, term4895.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term4895, term4895.getClass(), "totalExpertHighScore", 0L);
        setLongField(term4895, term4895.getClass(), "totalMasterHighScore", 0L);
        setIntField(term4895, term4895.getClass(), "friendCount", 0);
        setField(term4895, term4895.getClass(), "firstPlayDate", null);
        setField(term4895, term4895.getClass(), "lastPlayDate", null);
        setIntField(term4895, term4895.getClass(), "courseClass", 0);
        term4914 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ProfileResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term4914;
        callMethod(klass, "setTotalBasicHighScore", argTypes, term4895, args);
    }

};


