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

public class GetUserPreviewResp_setLevel_42568267228 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7186;
     Object term7236;

    public GetUserPreviewResp_setLevel_42568267228() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7186 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.GetUserPreviewResp"));
        setLongField(term7186, term7186.getClass(), "userId", 6313343355456678206L);
        setBooleanField(term7186, term7186.getClass(), "isLogin", false);
        setField(term7186, term7186.getClass(), "lastLoginDate", "ngYxiXTZrk");
        setField(term7186, term7186.getClass(), "userName", "");
        setIntField(term7186, term7186.getClass(), "reincarnationNum", -1707655562);
        setIntField(term7186, term7186.getClass(), "level", 1525815085);
        setLongField(term7186, term7186.getClass(), "exp", -8901826621860118061L);
        setLongField(term7186, term7186.getClass(), "playerRating", 2947576061864407618L);
        setField(term7186, term7186.getClass(), "lastGameId", "");
        setField(term7186, term7186.getClass(), "lastRomVersion", "");
        setField(term7186, term7186.getClass(), "lastDataVersion", "");
        setField(term7186, term7186.getClass(), "lastPlayDate", "YTxBqWRAlo");
        setIntField(term7186, term7186.getClass(), "nameplateId", 1785476260);
        setIntField(term7186, term7186.getClass(), "trophyId", -655035002);
        setIntField(term7186, term7186.getClass(), "cardId", 1841475189);
        setIntField(term7186, term7186.getClass(), "dispPlayerLv", -456566581);
        setIntField(term7186, term7186.getClass(), "dispRating", 2114761003);
        setIntField(term7186, term7186.getClass(), "dispBP", -1128091158);
        setIntField(term7186, term7186.getClass(), "headphone", 380526008);
        setIntField(term7186, term7186.getClass(), "banStatus", -285065370);
        setBooleanField(term7186, term7186.getClass(), "isWarningConfirmed", true);
        setIntField(term7186, term7186.getClass(), "lastEmoneyBrand", -1542216721);
        setIntField(term7186, term7186.getClass(), "lastEmoneyCredit", -311300330);
        term7236 = new Integer(1160936971);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term7236;
        callMethod(klass, "setLevel", argTypes, term7186, args);
    }

};


