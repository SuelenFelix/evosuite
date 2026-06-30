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

public class GetUserPreviewResp_setLastEmoneyCredit_102414559445 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8490;
     Object term8540;

    public GetUserPreviewResp_setLastEmoneyCredit_102414559445() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8490 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.GetUserPreviewResp"));
        setLongField(term8490, term8490.getClass(), "userId", -4526944004625263747L);
        setBooleanField(term8490, term8490.getClass(), "isLogin", true);
        setField(term8490, term8490.getClass(), "lastLoginDate", "nDCcyhiTnS");
        setField(term8490, term8490.getClass(), "userName", "");
        setIntField(term8490, term8490.getClass(), "reincarnationNum", -1943255435);
        setIntField(term8490, term8490.getClass(), "level", 868436312);
        setLongField(term8490, term8490.getClass(), "exp", -8195504192950938590L);
        setLongField(term8490, term8490.getClass(), "playerRating", -3141593811423226559L);
        setField(term8490, term8490.getClass(), "lastGameId", "");
        setField(term8490, term8490.getClass(), "lastRomVersion", "");
        setField(term8490, term8490.getClass(), "lastDataVersion", "");
        setField(term8490, term8490.getClass(), "lastPlayDate", "Bcivwcjece");
        setIntField(term8490, term8490.getClass(), "nameplateId", 1737963071);
        setIntField(term8490, term8490.getClass(), "trophyId", 6456997);
        setIntField(term8490, term8490.getClass(), "cardId", -797269627);
        setIntField(term8490, term8490.getClass(), "dispPlayerLv", -224331928);
        setIntField(term8490, term8490.getClass(), "dispRating", -587857163);
        setIntField(term8490, term8490.getClass(), "dispBP", -2018093075);
        setIntField(term8490, term8490.getClass(), "headphone", 135879009);
        setIntField(term8490, term8490.getClass(), "banStatus", 1923027847);
        setBooleanField(term8490, term8490.getClass(), "isWarningConfirmed", false);
        setIntField(term8490, term8490.getClass(), "lastEmoneyBrand", -1652693609);
        setIntField(term8490, term8490.getClass(), "lastEmoneyCredit", -824893512);
        term8540 = new Integer(-55435071);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term8540;
        callMethod(klass, "setLastEmoneyCredit", argTypes, term8490, args);
    }

};


