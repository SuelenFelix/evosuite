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

public class GetUserPreviewResp_getUserId_8103084600 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5176;

    public GetUserPreviewResp_getUserId_8103084600() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5176 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.GetUserPreviewResp"));
        setLongField(term5176, term5176.getClass(), "userId", -4726601557653351735L);
        setBooleanField(term5176, term5176.getClass(), "isLogin", false);
        setField(term5176, term5176.getClass(), "lastLoginDate", "FnEkAHBfyV");
        setField(term5176, term5176.getClass(), "userName", "");
        setIntField(term5176, term5176.getClass(), "reincarnationNum", 198857801);
        setIntField(term5176, term5176.getClass(), "level", 1342884142);
        setLongField(term5176, term5176.getClass(), "exp", -3502423991725415780L);
        setLongField(term5176, term5176.getClass(), "playerRating", 7717843551775677202L);
        setField(term5176, term5176.getClass(), "lastGameId", "");
        setField(term5176, term5176.getClass(), "lastRomVersion", "");
        setField(term5176, term5176.getClass(), "lastDataVersion", "");
        setField(term5176, term5176.getClass(), "lastPlayDate", "VfmNFpEuax");
        setIntField(term5176, term5176.getClass(), "nameplateId", -1454325068);
        setIntField(term5176, term5176.getClass(), "trophyId", 346714653);
        setIntField(term5176, term5176.getClass(), "cardId", 2121928697);
        setIntField(term5176, term5176.getClass(), "dispPlayerLv", -1741056571);
        setIntField(term5176, term5176.getClass(), "dispRating", 522501050);
        setIntField(term5176, term5176.getClass(), "dispBP", 125432890);
        setIntField(term5176, term5176.getClass(), "headphone", -197740561);
        setIntField(term5176, term5176.getClass(), "banStatus", -1811706962);
        setBooleanField(term5176, term5176.getClass(), "isWarningConfirmed", false);
        setIntField(term5176, term5176.getClass(), "lastEmoneyBrand", -1242133071);
        setIntField(term5176, term5176.getClass(), "lastEmoneyCredit", -455052015);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUserId", argTypes, term5176, args);
    }

};


