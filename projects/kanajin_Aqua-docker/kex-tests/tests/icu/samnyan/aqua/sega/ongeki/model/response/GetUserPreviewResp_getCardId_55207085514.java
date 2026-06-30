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

public class GetUserPreviewResp_getCardId_55207085514 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6156;

    public GetUserPreviewResp_getCardId_55207085514() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6156 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.GetUserPreviewResp"));
        setLongField(term6156, term6156.getClass(), "userId", -6367418587326372844L);
        setBooleanField(term6156, term6156.getClass(), "isLogin", false);
        setField(term6156, term6156.getClass(), "lastLoginDate", "rOfPCPHmtJ");
        setField(term6156, term6156.getClass(), "userName", "");
        setIntField(term6156, term6156.getClass(), "reincarnationNum", 2009028243);
        setIntField(term6156, term6156.getClass(), "level", 1900131331);
        setLongField(term6156, term6156.getClass(), "exp", 6371581018571997173L);
        setLongField(term6156, term6156.getClass(), "playerRating", 6604328992663797314L);
        setField(term6156, term6156.getClass(), "lastGameId", "");
        setField(term6156, term6156.getClass(), "lastRomVersion", "");
        setField(term6156, term6156.getClass(), "lastDataVersion", "");
        setField(term6156, term6156.getClass(), "lastPlayDate", "EnmiAvfpJv");
        setIntField(term6156, term6156.getClass(), "nameplateId", -1489604464);
        setIntField(term6156, term6156.getClass(), "trophyId", 601642248);
        setIntField(term6156, term6156.getClass(), "cardId", -1186936928);
        setIntField(term6156, term6156.getClass(), "dispPlayerLv", -315380004);
        setIntField(term6156, term6156.getClass(), "dispRating", -1945754843);
        setIntField(term6156, term6156.getClass(), "dispBP", -1512221115);
        setIntField(term6156, term6156.getClass(), "headphone", -515486706);
        setIntField(term6156, term6156.getClass(), "banStatus", -612862488);
        setBooleanField(term6156, term6156.getClass(), "isWarningConfirmed", true);
        setIntField(term6156, term6156.getClass(), "lastEmoneyBrand", 52739905);
        setIntField(term6156, term6156.getClass(), "lastEmoneyCredit", -2105349391);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCardId", argTypes, term6156, args);
    }

};


