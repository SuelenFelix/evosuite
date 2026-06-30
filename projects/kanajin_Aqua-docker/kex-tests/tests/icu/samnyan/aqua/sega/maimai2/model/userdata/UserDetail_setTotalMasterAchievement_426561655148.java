package icu.samnyan.aqua.sega.maimai2.model.userdata;

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
import static icu.samnyan.aqua.sega.maimai2.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;
import java.util.ArrayList;
import java.lang.Integer;

public class UserDetail_setTotalMasterAchievement_426561655148 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4314027;
     Object term4314382;

    public UserDetail_setTotalMasterAchievement_426561655148() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4314031 = new Long(3291346185553347924L);
        Integer term4314094 = new Integer(776006341);
        Integer term4314096 = new Integer(1145867680);
        Integer term4314098 = new Integer(1382995321);
        Integer term4314100 = new Integer(375758346);
        Integer term4314102 = new Integer(128390500);
        Integer term4314104 = new Integer(2129617215);
        Integer term4314106 = new Integer(123578164);
        ArrayList term4314092 = new ArrayList();
        ((ArrayList) term4314092).add(term4314094);
        ((ArrayList) term4314092).add(term4314096);
        ((ArrayList) term4314092).add(term4314098);
        ((ArrayList) term4314092).add(term4314100);
        ((ArrayList) term4314092).add(term4314102);
        ((ArrayList) term4314092).add(term4314104);
        ((ArrayList) term4314092).add(term4314106);
        Integer term4314112 = new Integer(496578261);
        ArrayList term4314110 = new ArrayList();
        ((ArrayList) term4314110).add(term4314112);
        term4314027 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term4314029 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term4314045 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4314046 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4314050 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4314055 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4314056 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4314060 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term4314027, term4314027.getClass(), "id", 2946054723752389619L);
        setLongField(term4314029, term4314029.getClass(), "id", -6170438836109697498L);
        setField(term4314029, term4314029.getClass(), "extId", term4314031);
        setField(term4314029, term4314029.getClass(), "luid", "QlLlPonKeK");
        setIntField(term4314046, term4314046.getClass(), "year", 2028);
        setShortField(term4314046, term4314046.getClass(), "month", (short) 2);
        setShortField(term4314046, term4314046.getClass(), "day", (short) 18);
        setField(term4314045, term4314045.getClass(), "date", term4314046);
        setByteField(term4314050, term4314050.getClass(), "hour", (byte) 10);
        setByteField(term4314050, term4314050.getClass(), "minute", (byte) 46);
        setByteField(term4314050, term4314050.getClass(), "second", (byte) 39);
        setIntField(term4314050, term4314050.getClass(), "nano", 322153244);
        setField(term4314045, term4314045.getClass(), "time", term4314050);
        setField(term4314029, term4314029.getClass(), "registerTime", term4314045);
        setIntField(term4314056, term4314056.getClass(), "year", 2025);
        setShortField(term4314056, term4314056.getClass(), "month", (short) 5);
        setShortField(term4314056, term4314056.getClass(), "day", (short) 1);
        setField(term4314055, term4314055.getClass(), "date", term4314056);
        setByteField(term4314060, term4314060.getClass(), "hour", (byte) 8);
        setByteField(term4314060, term4314060.getClass(), "minute", (byte) 56);
        setByteField(term4314060, term4314060.getClass(), "second", (byte) 40);
        setIntField(term4314060, term4314060.getClass(), "nano", 406132661);
        setField(term4314055, term4314055.getClass(), "time", term4314060);
        setField(term4314029, term4314029.getClass(), "accessTime", term4314055);
        setField(term4314027, term4314027.getClass(), "card", term4314029);
        setField(term4314027, term4314027.getClass(), "userName", "SAHTuYQmlB");
        setIntField(term4314027, term4314027.getClass(), "isNetMember", -1282275662);
        setIntField(term4314027, term4314027.getClass(), "iconId", 568574371);
        setIntField(term4314027, term4314027.getClass(), "plateId", -1178633244);
        setIntField(term4314027, term4314027.getClass(), "titleId", 1057136822);
        setIntField(term4314027, term4314027.getClass(), "partnerId", -922595832);
        setIntField(term4314027, term4314027.getClass(), "frameId", -13185445);
        setIntField(term4314027, term4314027.getClass(), "selectMapId", -1245469662);
        setIntField(term4314027, term4314027.getClass(), "totalAwake", 98884572);
        setIntField(term4314027, term4314027.getClass(), "gradeRating", -1205076803);
        setIntField(term4314027, term4314027.getClass(), "musicRating", -1078594782);
        setIntField(term4314027, term4314027.getClass(), "playerRating", 1983888102);
        setIntField(term4314027, term4314027.getClass(), "highestRating", 267618536);
        setIntField(term4314027, term4314027.getClass(), "gradeRank", 1372740374);
        setIntField(term4314027, term4314027.getClass(), "classRank", 2049277277);
        setIntField(term4314027, term4314027.getClass(), "courseRank", -1602970993);
        setField(term4314027, term4314027.getClass(), "charaSlot", term4314092);
        setField(term4314027, term4314027.getClass(), "charaLockSlot", term4314110);
        setLongField(term4314027, term4314027.getClass(), "contentBit", -819852672919387180L);
        setIntField(term4314027, term4314027.getClass(), "playCount", -400569991);
        setField(term4314027, term4314027.getClass(), "eventWatchedDate", "zxejzZkMBb");
        setField(term4314027, term4314027.getClass(), "lastGameId", "IIQJKUbzja");
        setField(term4314027, term4314027.getClass(), "lastRomVersion", "nOTkcvOlml");
        setField(term4314027, term4314027.getClass(), "lastDataVersion", "ZWgruysdIV");
        setField(term4314027, term4314027.getClass(), "lastLoginDate", "aCeQnULOgS");
        setField(term4314027, term4314027.getClass(), "lastPlayDate", "BBTyXbTPrq");
        setIntField(term4314027, term4314027.getClass(), "lastPlayCredit", 1680352714);
        setIntField(term4314027, term4314027.getClass(), "lastPlayMode", -47188845);
        setIntField(term4314027, term4314027.getClass(), "lastPlaceId", 650008280);
        setField(term4314027, term4314027.getClass(), "lastPlaceName", "bgwXlrRKJy");
        setIntField(term4314027, term4314027.getClass(), "lastAllNetId", -2079978250);
        setIntField(term4314027, term4314027.getClass(), "lastRegionId", -849331480);
        setField(term4314027, term4314027.getClass(), "lastRegionName", "ZUcgQDoCrr");
        setField(term4314027, term4314027.getClass(), "lastClientId", "JYvejGelTg");
        setField(term4314027, term4314027.getClass(), "lastCountryCode", "nLEhxEolcu");
        setIntField(term4314027, term4314027.getClass(), "lastSelectEMoney", -863727737);
        setIntField(term4314027, term4314027.getClass(), "lastSelectTicket", -1305735591);
        setIntField(term4314027, term4314027.getClass(), "lastSelectCourse", 1031724481);
        setIntField(term4314027, term4314027.getClass(), "lastCountCourse", 446804215);
        setField(term4314027, term4314027.getClass(), "firstGameId", "syEwpFeHnH");
        setField(term4314027, term4314027.getClass(), "firstRomVersion", "JFfKieGjxX");
        setField(term4314027, term4314027.getClass(), "firstDataVersion", "mVcPGbpNmk");
        setField(term4314027, term4314027.getClass(), "firstPlayDate", "pnTYMMlMol");
        setField(term4314027, term4314027.getClass(), "compatibleCmVersion", "MTNSObOVEX");
        setField(term4314027, term4314027.getClass(), "dailyBonusDate", "DMOzIzsWLy");
        setField(term4314027, term4314027.getClass(), "dailyCourseBonusDate", "SNlVUUxHpS");
        setField(term4314027, term4314027.getClass(), "lastPairLoginDate", "SIzqMZBMzb");
        setField(term4314027, term4314027.getClass(), "lastTrialPlayDate", "BbERzBBIea");
        setIntField(term4314027, term4314027.getClass(), "playVsCount", -1463851383);
        setIntField(term4314027, term4314027.getClass(), "playSyncCount", 1527042131);
        setIntField(term4314027, term4314027.getClass(), "winCount", -1840067156);
        setIntField(term4314027, term4314027.getClass(), "helpCount", 1627634782);
        setIntField(term4314027, term4314027.getClass(), "comboCount", 1928460040);
        setLongField(term4314027, term4314027.getClass(), "totalDeluxscore", 8250064548321870751L);
        setLongField(term4314027, term4314027.getClass(), "totalBasicDeluxscore", -1278028373571014284L);
        setLongField(term4314027, term4314027.getClass(), "totalAdvancedDeluxscore", 7732208645107510345L);
        setLongField(term4314027, term4314027.getClass(), "totalExpertDeluxscore", -1215250315357622599L);
        setLongField(term4314027, term4314027.getClass(), "totalMasterDeluxscore", 5696785549619365870L);
        setLongField(term4314027, term4314027.getClass(), "totalReMasterDeluxscore", -3684724411747634061L);
        setIntField(term4314027, term4314027.getClass(), "totalSync", -728851796);
        setIntField(term4314027, term4314027.getClass(), "totalBasicSync", 870069675);
        setIntField(term4314027, term4314027.getClass(), "totalAdvancedSync", 160958214);
        setIntField(term4314027, term4314027.getClass(), "totalExpertSync", 1526189164);
        setIntField(term4314027, term4314027.getClass(), "totalMasterSync", -1304906696);
        setIntField(term4314027, term4314027.getClass(), "totalReMasterSync", -1244087093);
        setLongField(term4314027, term4314027.getClass(), "totalAchievement", -5507545046857155862L);
        setLongField(term4314027, term4314027.getClass(), "totalBasicAchievement", -2674239697968212291L);
        setLongField(term4314027, term4314027.getClass(), "totalAdvancedAchievement", -7961971368450102475L);
        setLongField(term4314027, term4314027.getClass(), "totalExpertAchievement", -2709384559133473879L);
        setLongField(term4314027, term4314027.getClass(), "totalMasterAchievement", -4281297000437065312L);
        setLongField(term4314027, term4314027.getClass(), "totalReMasterAchievement", -2444019638155720677L);
        setLongField(term4314027, term4314027.getClass(), "playerOldRating", 432665748955499359L);
        setLongField(term4314027, term4314027.getClass(), "playerNewRating", 8271993483844042485L);
        setIntField(term4314027, term4314027.getClass(), "banState", -2133828035);
        setLongField(term4314027, term4314027.getClass(), "dateTime", 1150172097833174983L);
        term4314382 = new Long(4953362117637049972L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term4314382;
        callMethod(klass, "setTotalMasterAchievement", argTypes, term4314027, args);
    }

};


