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

public class GetUserPreviewResp_setLastGameId_57226459031 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7402;

    public GetUserPreviewResp_setLastGameId_57226459031() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7402 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.GetUserPreviewResp"));
        setLongField(term7402, term7402.getClass(), "userId", -1572808624189549793L);
        setBooleanField(term7402, term7402.getClass(), "isLogin", true);
        setField(term7402, term7402.getClass(), "lastLoginDate", "HUgzMgrpsK");
        setField(term7402, term7402.getClass(), "userName", "");
        setIntField(term7402, term7402.getClass(), "reincarnationNum", 505087197);
        setIntField(term7402, term7402.getClass(), "level", 427005798);
        setLongField(term7402, term7402.getClass(), "exp", -6151316713456472560L);
        setLongField(term7402, term7402.getClass(), "playerRating", -5597498165246748176L);
        setField(term7402, term7402.getClass(), "lastGameId", "");
        setField(term7402, term7402.getClass(), "lastRomVersion", "");
        setField(term7402, term7402.getClass(), "lastDataVersion", "");
        setField(term7402, term7402.getClass(), "lastPlayDate", "ubaBUfLolu");
        setIntField(term7402, term7402.getClass(), "nameplateId", -993454505);
        setIntField(term7402, term7402.getClass(), "trophyId", -238353821);
        setIntField(term7402, term7402.getClass(), "cardId", -818992228);
        setIntField(term7402, term7402.getClass(), "dispPlayerLv", 2087429143);
        setIntField(term7402, term7402.getClass(), "dispRating", -1892890104);
        setIntField(term7402, term7402.getClass(), "dispBP", 2003356558);
        setIntField(term7402, term7402.getClass(), "headphone", -638126185);
        setIntField(term7402, term7402.getClass(), "banStatus", 28070985);
        setBooleanField(term7402, term7402.getClass(), "isWarningConfirmed", false);
        setIntField(term7402, term7402.getClass(), "lastEmoneyBrand", 334110739);
        setIntField(term7402, term7402.getClass(), "lastEmoneyCredit", -1724529322);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "itAUCFhZhq";
        callMethod(klass, "setLastGameId", argTypes, term7402, args);
    }

};


