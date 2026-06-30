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

public class ProfileResp_setNameplateId_138580714680 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4769;
     Object term4788;

    public ProfileResp_setNameplateId_138580714680() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4769 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ProfileResp"));
        setField(term4769, term4769.getClass(), "userName", null);
        setIntField(term4769, term4769.getClass(), "level", 0);
        setField(term4769, term4769.getClass(), "exp", null);
        setLongField(term4769, term4769.getClass(), "point", 0L);
        setLongField(term4769, term4769.getClass(), "totalPoint", 0L);
        setIntField(term4769, term4769.getClass(), "playCount", 0);
        setIntField(term4769, term4769.getClass(), "playerRating", 0);
        setIntField(term4769, term4769.getClass(), "highestRating", 0);
        setIntField(term4769, term4769.getClass(), "nameplateId", 0);
        setIntField(term4769, term4769.getClass(), "frameId", 0);
        setIntField(term4769, term4769.getClass(), "characterId", 0);
        setIntField(term4769, term4769.getClass(), "trophyId", 0);
        setIntField(term4769, term4769.getClass(), "totalMapNum", 0);
        setLongField(term4769, term4769.getClass(), "totalHiScore", 0L);
        setLongField(term4769, term4769.getClass(), "totalBasicHighScore", 0L);
        setLongField(term4769, term4769.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term4769, term4769.getClass(), "totalExpertHighScore", 0L);
        setLongField(term4769, term4769.getClass(), "totalMasterHighScore", 0L);
        setIntField(term4769, term4769.getClass(), "friendCount", 0);
        setField(term4769, term4769.getClass(), "firstPlayDate", null);
        setField(term4769, term4769.getClass(), "lastPlayDate", null);
        setIntField(term4769, term4769.getClass(), "courseClass", 0);
        term4788 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ProfileResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term4788;
        callMethod(klass, "setNameplateId", argTypes, term4769, args);
    }

};


