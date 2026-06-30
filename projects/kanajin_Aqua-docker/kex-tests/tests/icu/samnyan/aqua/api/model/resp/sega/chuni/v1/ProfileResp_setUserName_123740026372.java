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

public class ProfileResp_setUserName_123740026372 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4605;

    public ProfileResp_setUserName_123740026372() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4605 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ProfileResp"));
        setField(term4605, term4605.getClass(), "userName", null);
        setIntField(term4605, term4605.getClass(), "level", 0);
        setField(term4605, term4605.getClass(), "exp", null);
        setLongField(term4605, term4605.getClass(), "point", 0L);
        setLongField(term4605, term4605.getClass(), "totalPoint", 0L);
        setIntField(term4605, term4605.getClass(), "playCount", 0);
        setIntField(term4605, term4605.getClass(), "playerRating", 0);
        setIntField(term4605, term4605.getClass(), "highestRating", 0);
        setIntField(term4605, term4605.getClass(), "nameplateId", 0);
        setIntField(term4605, term4605.getClass(), "frameId", 0);
        setIntField(term4605, term4605.getClass(), "characterId", 0);
        setIntField(term4605, term4605.getClass(), "trophyId", 0);
        setIntField(term4605, term4605.getClass(), "totalMapNum", 0);
        setLongField(term4605, term4605.getClass(), "totalHiScore", 0L);
        setLongField(term4605, term4605.getClass(), "totalBasicHighScore", 0L);
        setLongField(term4605, term4605.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term4605, term4605.getClass(), "totalExpertHighScore", 0L);
        setLongField(term4605, term4605.getClass(), "totalMasterHighScore", 0L);
        setIntField(term4605, term4605.getClass(), "friendCount", 0);
        setField(term4605, term4605.getClass(), "firstPlayDate", null);
        setField(term4605, term4605.getClass(), "lastPlayDate", null);
        setIntField(term4605, term4605.getClass(), "courseClass", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ProfileResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setUserName", argTypes, term4605, args);
    }

};


