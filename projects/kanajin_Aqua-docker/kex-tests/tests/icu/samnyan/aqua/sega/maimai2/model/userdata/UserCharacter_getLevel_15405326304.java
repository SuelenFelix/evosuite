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

public class UserCharacter_getLevel_15405326304 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term186851;

    public UserCharacter_getLevel_15405326304() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term186857 = new Long(-5871746020807491998L);
        Integer term186920 = new Integer(-1100665028);
        Integer term186922 = new Integer(-1572533124);
        Integer term186924 = new Integer(1577766413);
        ArrayList term186918 = new ArrayList();
        ((ArrayList) term186918).add(term186920);
        ((ArrayList) term186918).add(term186922);
        ((ArrayList) term186918).add(term186924);
        ArrayList term186928 = new ArrayList();
        term186851 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserCharacter"));
        Object term186853 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term186855 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term186871 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term186872 = newInstance(Class.forName("java.time.LocalDate"));
        Object term186876 = newInstance(Class.forName("java.time.LocalTime"));
        Object term186881 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term186882 = newInstance(Class.forName("java.time.LocalDate"));
        Object term186886 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term186851, term186851.getClass(), "id", -772135562955984228L);
        setLongField(term186853, term186853.getClass(), "id", -8435453295822372001L);
        setLongField(term186855, term186855.getClass(), "id", 4870926120312695851L);
        setField(term186855, term186855.getClass(), "extId", term186857);
        setField(term186855, term186855.getClass(), "luid", "jOmdJDMEKW");
        setIntField(term186872, term186872.getClass(), "year", 2015);
        setShortField(term186872, term186872.getClass(), "month", (short) 6);
        setShortField(term186872, term186872.getClass(), "day", (short) 1);
        setField(term186871, term186871.getClass(), "date", term186872);
        setByteField(term186876, term186876.getClass(), "hour", (byte) 5);
        setByteField(term186876, term186876.getClass(), "minute", (byte) 44);
        setByteField(term186876, term186876.getClass(), "second", (byte) 48);
        setIntField(term186876, term186876.getClass(), "nano", 654356179);
        setField(term186871, term186871.getClass(), "time", term186876);
        setField(term186855, term186855.getClass(), "registerTime", term186871);
        setIntField(term186882, term186882.getClass(), "year", 2027);
        setShortField(term186882, term186882.getClass(), "month", (short) 10);
        setShortField(term186882, term186882.getClass(), "day", (short) 12);
        setField(term186881, term186881.getClass(), "date", term186882);
        setByteField(term186886, term186886.getClass(), "hour", (byte) 16);
        setByteField(term186886, term186886.getClass(), "minute", (byte) 59);
        setByteField(term186886, term186886.getClass(), "second", (byte) 46);
        setIntField(term186886, term186886.getClass(), "nano", 525561936);
        setField(term186881, term186881.getClass(), "time", term186886);
        setField(term186855, term186855.getClass(), "accessTime", term186881);
        setField(term186853, term186853.getClass(), "card", term186855);
        setField(term186853, term186853.getClass(), "userName", "yVUBrwMSLo");
        setIntField(term186853, term186853.getClass(), "isNetMember", -1387240902);
        setIntField(term186853, term186853.getClass(), "iconId", 1456385188);
        setIntField(term186853, term186853.getClass(), "plateId", -1778689215);
        setIntField(term186853, term186853.getClass(), "titleId", -215214458);
        setIntField(term186853, term186853.getClass(), "partnerId", 2088442412);
        setIntField(term186853, term186853.getClass(), "frameId", 1432096332);
        setIntField(term186853, term186853.getClass(), "selectMapId", -1621097679);
        setIntField(term186853, term186853.getClass(), "totalAwake", 1349840444);
        setIntField(term186853, term186853.getClass(), "gradeRating", 671975307);
        setIntField(term186853, term186853.getClass(), "musicRating", 178052838);
        setIntField(term186853, term186853.getClass(), "playerRating", -890432510);
        setIntField(term186853, term186853.getClass(), "highestRating", 1697782346);
        setIntField(term186853, term186853.getClass(), "gradeRank", 1469006441);
        setIntField(term186853, term186853.getClass(), "classRank", -848703672);
        setIntField(term186853, term186853.getClass(), "courseRank", 1610879895);
        setField(term186853, term186853.getClass(), "charaSlot", term186918);
        setField(term186853, term186853.getClass(), "charaLockSlot", term186928);
        setLongField(term186853, term186853.getClass(), "contentBit", 5624875115325952335L);
        setIntField(term186853, term186853.getClass(), "playCount", -1707478961);
        setField(term186853, term186853.getClass(), "eventWatchedDate", "CpZsTbPacH");
        setField(term186853, term186853.getClass(), "lastGameId", "HyRjodIKrt");
        setField(term186853, term186853.getClass(), "lastRomVersion", "dGqYTSkmlc");
        setField(term186853, term186853.getClass(), "lastDataVersion", "XBismYeIOM");
        setField(term186853, term186853.getClass(), "lastLoginDate", "TQZuVrOtiK");
        setField(term186853, term186853.getClass(), "lastPlayDate", "UUetRJugfR");
        setIntField(term186853, term186853.getClass(), "lastPlayCredit", -1627748692);
        setIntField(term186853, term186853.getClass(), "lastPlayMode", -1802652052);
        setIntField(term186853, term186853.getClass(), "lastPlaceId", -450223205);
        setField(term186853, term186853.getClass(), "lastPlaceName", "ozLkLYzWZD");
        setIntField(term186853, term186853.getClass(), "lastAllNetId", -1685460453);
        setIntField(term186853, term186853.getClass(), "lastRegionId", -932031927);
        setField(term186853, term186853.getClass(), "lastRegionName", "LEAEPBtmDE");
        setField(term186853, term186853.getClass(), "lastClientId", "oUCfMEViOl");
        setField(term186853, term186853.getClass(), "lastCountryCode", "NCKuJOimgb");
        setIntField(term186853, term186853.getClass(), "lastSelectEMoney", -396155497);
        setIntField(term186853, term186853.getClass(), "lastSelectTicket", 1550347477);
        setIntField(term186853, term186853.getClass(), "lastSelectCourse", 1999753330);
        setIntField(term186853, term186853.getClass(), "lastCountCourse", -1417694542);
        setField(term186853, term186853.getClass(), "firstGameId", "BbWYbJZcOk");
        setField(term186853, term186853.getClass(), "firstRomVersion", "rclaaiJLVZ");
        setField(term186853, term186853.getClass(), "firstDataVersion", "yQuEIHUdPd");
        setField(term186853, term186853.getClass(), "firstPlayDate", "YGcdcqZBhD");
        setField(term186853, term186853.getClass(), "compatibleCmVersion", "YIiYmjYKPu");
        setField(term186853, term186853.getClass(), "dailyBonusDate", "BNzmlooMdf");
        setField(term186853, term186853.getClass(), "dailyCourseBonusDate", "txAQLBXsin");
        setField(term186853, term186853.getClass(), "lastPairLoginDate", "ZxLrAouHPX");
        setField(term186853, term186853.getClass(), "lastTrialPlayDate", "YsBtkFntbK");
        setIntField(term186853, term186853.getClass(), "playVsCount", -1703634243);
        setIntField(term186853, term186853.getClass(), "playSyncCount", -1946719296);
        setIntField(term186853, term186853.getClass(), "winCount", 1702907407);
        setIntField(term186853, term186853.getClass(), "helpCount", 1943139725);
        setIntField(term186853, term186853.getClass(), "comboCount", -1895631581);
        setLongField(term186853, term186853.getClass(), "totalDeluxscore", -9080310106055827773L);
        setLongField(term186853, term186853.getClass(), "totalBasicDeluxscore", 7747202674379406098L);
        setLongField(term186853, term186853.getClass(), "totalAdvancedDeluxscore", -3120913720963099689L);
        setLongField(term186853, term186853.getClass(), "totalExpertDeluxscore", -4836831199613890387L);
        setLongField(term186853, term186853.getClass(), "totalMasterDeluxscore", -5985091787359828019L);
        setLongField(term186853, term186853.getClass(), "totalReMasterDeluxscore", -1556371026742712412L);
        setIntField(term186853, term186853.getClass(), "totalSync", 1484386906);
        setIntField(term186853, term186853.getClass(), "totalBasicSync", -1086902549);
        setIntField(term186853, term186853.getClass(), "totalAdvancedSync", -1325092699);
        setIntField(term186853, term186853.getClass(), "totalExpertSync", 1282150470);
        setIntField(term186853, term186853.getClass(), "totalMasterSync", -2063207620);
        setIntField(term186853, term186853.getClass(), "totalReMasterSync", 908971966);
        setLongField(term186853, term186853.getClass(), "totalAchievement", -2150229403476575447L);
        setLongField(term186853, term186853.getClass(), "totalBasicAchievement", -623600138515789120L);
        setLongField(term186853, term186853.getClass(), "totalAdvancedAchievement", 3384791734790058474L);
        setLongField(term186853, term186853.getClass(), "totalExpertAchievement", -5159022687886007790L);
        setLongField(term186853, term186853.getClass(), "totalMasterAchievement", 5961711205558912307L);
        setLongField(term186853, term186853.getClass(), "totalReMasterAchievement", -422916641348511945L);
        setLongField(term186853, term186853.getClass(), "playerOldRating", 3012829681646545710L);
        setLongField(term186853, term186853.getClass(), "playerNewRating", 4377245184623049180L);
        setIntField(term186853, term186853.getClass(), "banState", -1448487643);
        setLongField(term186853, term186853.getClass(), "dateTime", 6534893758959343917L);
        setField(term186851, term186851.getClass(), "user", term186853);
        setIntField(term186851, term186851.getClass(), "characterId", 799385851);
        setIntField(term186851, term186851.getClass(), "level", -360289814);
        setIntField(term186851, term186851.getClass(), "awakening", 1714192838);
        setIntField(term186851, term186851.getClass(), "useCount", 352666115);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserCharacter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLevel", argTypes, term186851, args);
    }

};


