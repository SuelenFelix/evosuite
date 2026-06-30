package icu.samnyan.aqua.sega.ongeki.model.response;

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
import static icu.samnyan.aqua.sega.ongeki.model.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class GetUserPreviewResp_setReincarnationNum_124793178927 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7114;
     Object term7164;

    public GetUserPreviewResp_setReincarnationNum_124793178927() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7114 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.GetUserPreviewResp"));
        setLongField(term7114, term7114.getClass(), "userId", 7016651719770171901L);
        setBooleanField(term7114, term7114.getClass(), "isLogin", true);
        setField(term7114, term7114.getClass(), "lastLoginDate", "KpurAcrHYT");
        setField(term7114, term7114.getClass(), "userName", "");
        setIntField(term7114, term7114.getClass(), "reincarnationNum", -1355715967);
        setIntField(term7114, term7114.getClass(), "level", -972516789);
        setLongField(term7114, term7114.getClass(), "exp", 7777131569376571611L);
        setLongField(term7114, term7114.getClass(), "playerRating", -2792969772767139843L);
        setField(term7114, term7114.getClass(), "lastGameId", "");
        setField(term7114, term7114.getClass(), "lastRomVersion", "");
        setField(term7114, term7114.getClass(), "lastDataVersion", "");
        setField(term7114, term7114.getClass(), "lastPlayDate", "QjvDwgKJGz");
        setIntField(term7114, term7114.getClass(), "nameplateId", 720077443);
        setIntField(term7114, term7114.getClass(), "trophyId", -884523977);
        setIntField(term7114, term7114.getClass(), "cardId", -1396233580);
        setIntField(term7114, term7114.getClass(), "dispPlayerLv", -654234892);
        setIntField(term7114, term7114.getClass(), "dispRating", -50930731);
        setIntField(term7114, term7114.getClass(), "dispBP", -1067876039);
        setIntField(term7114, term7114.getClass(), "headphone", -1143749623);
        setIntField(term7114, term7114.getClass(), "banStatus", 1961561878);
        setBooleanField(term7114, term7114.getClass(), "isWarningConfirmed", true);
        setIntField(term7114, term7114.getClass(), "lastEmoneyBrand", 1235809050);
        setIntField(term7114, term7114.getClass(), "lastEmoneyCredit", 1370082921);
        term7164 = new Integer(1966881264);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term7164;
        callMethod(klass, "setReincarnationNum", argTypes, term7114, args);
    }

};


