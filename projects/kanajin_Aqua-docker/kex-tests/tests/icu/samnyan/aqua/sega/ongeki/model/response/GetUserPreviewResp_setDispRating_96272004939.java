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

public class GetUserPreviewResp_setDispRating_96272004939 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8058;
     Object term8108;

    public GetUserPreviewResp_setDispRating_96272004939() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8058 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.GetUserPreviewResp"));
        setLongField(term8058, term8058.getClass(), "userId", -7671399023433976259L);
        setBooleanField(term8058, term8058.getClass(), "isLogin", false);
        setField(term8058, term8058.getClass(), "lastLoginDate", "HuOUlaFmvJ");
        setField(term8058, term8058.getClass(), "userName", "");
        setIntField(term8058, term8058.getClass(), "reincarnationNum", -1103257588);
        setIntField(term8058, term8058.getClass(), "level", 1463219831);
        setLongField(term8058, term8058.getClass(), "exp", -8653467709084853156L);
        setLongField(term8058, term8058.getClass(), "playerRating", 6135782592145916721L);
        setField(term8058, term8058.getClass(), "lastGameId", "");
        setField(term8058, term8058.getClass(), "lastRomVersion", "");
        setField(term8058, term8058.getClass(), "lastDataVersion", "");
        setField(term8058, term8058.getClass(), "lastPlayDate", "dWVwcwFGNo");
        setIntField(term8058, term8058.getClass(), "nameplateId", -1516863216);
        setIntField(term8058, term8058.getClass(), "trophyId", 1392468004);
        setIntField(term8058, term8058.getClass(), "cardId", -1568339070);
        setIntField(term8058, term8058.getClass(), "dispPlayerLv", -1427059961);
        setIntField(term8058, term8058.getClass(), "dispRating", 1120685189);
        setIntField(term8058, term8058.getClass(), "dispBP", 654585209);
        setIntField(term8058, term8058.getClass(), "headphone", -1661685401);
        setIntField(term8058, term8058.getClass(), "banStatus", 1427434947);
        setBooleanField(term8058, term8058.getClass(), "isWarningConfirmed", false);
        setIntField(term8058, term8058.getClass(), "lastEmoneyBrand", 2130990985);
        setIntField(term8058, term8058.getClass(), "lastEmoneyCredit", 523197189);
        term8108 = new Integer(658684460);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term8108;
        callMethod(klass, "setDispRating", argTypes, term8058, args);
    }

};


