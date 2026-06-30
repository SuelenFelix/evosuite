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

public class GetUserPreviewResp_setTrophyId_53254089136 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7842;
     Object term7892;

    public GetUserPreviewResp_setTrophyId_53254089136() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7842 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.GetUserPreviewResp"));
        setLongField(term7842, term7842.getClass(), "userId", 3573273176206440433L);
        setBooleanField(term7842, term7842.getClass(), "isLogin", false);
        setField(term7842, term7842.getClass(), "lastLoginDate", "DddqUYfomL");
        setField(term7842, term7842.getClass(), "userName", "");
        setIntField(term7842, term7842.getClass(), "reincarnationNum", -1886360357);
        setIntField(term7842, term7842.getClass(), "level", -235867268);
        setLongField(term7842, term7842.getClass(), "exp", 8242382965219431687L);
        setLongField(term7842, term7842.getClass(), "playerRating", -3092537062189928451L);
        setField(term7842, term7842.getClass(), "lastGameId", "");
        setField(term7842, term7842.getClass(), "lastRomVersion", "");
        setField(term7842, term7842.getClass(), "lastDataVersion", "");
        setField(term7842, term7842.getClass(), "lastPlayDate", "YQwoogpPyi");
        setIntField(term7842, term7842.getClass(), "nameplateId", -972330704);
        setIntField(term7842, term7842.getClass(), "trophyId", 134173297);
        setIntField(term7842, term7842.getClass(), "cardId", 2025698852);
        setIntField(term7842, term7842.getClass(), "dispPlayerLv", 113961338);
        setIntField(term7842, term7842.getClass(), "dispRating", 1869277085);
        setIntField(term7842, term7842.getClass(), "dispBP", 498801287);
        setIntField(term7842, term7842.getClass(), "headphone", 969573395);
        setIntField(term7842, term7842.getClass(), "banStatus", -899109027);
        setBooleanField(term7842, term7842.getClass(), "isWarningConfirmed", true);
        setIntField(term7842, term7842.getClass(), "lastEmoneyBrand", -694297070);
        setIntField(term7842, term7842.getClass(), "lastEmoneyCredit", 786551253);
        term7892 = new Integer(-104779523);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term7892;
        callMethod(klass, "setTrophyId", argTypes, term7842, args);
    }

};


