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

public class UserCourse_canEqual_162448980930 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term91306;
     Object term91707;

    public UserCourse_canEqual_162448980930() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term91312 = new Long(-6587807377747738663L);
        ArrayList term91373 = new ArrayList();
        Integer term91379 = new Integer(910269225);
        Integer term91381 = new Integer(-298852874);
        ArrayList term91377 = new ArrayList();
        ((ArrayList) term91377).add(term91379);
        ((ArrayList) term91377).add(term91381);
        term91306 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserCourse"));
        Object term91308 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term91310 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term91326 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term91327 = newInstance(Class.forName("java.time.LocalDate"));
        Object term91331 = newInstance(Class.forName("java.time.LocalTime"));
        Object term91336 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term91337 = newInstance(Class.forName("java.time.LocalDate"));
        Object term91341 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term91306, term91306.getClass(), "id", 8871323174678446760L);
        setLongField(term91308, term91308.getClass(), "id", 3223972915053331194L);
        setLongField(term91310, term91310.getClass(), "id", 2718592162673693959L);
        setField(term91310, term91310.getClass(), "extId", term91312);
        setField(term91310, term91310.getClass(), "luid", "tMDFwEQAGW");
        setIntField(term91327, term91327.getClass(), "year", 2014);
        setShortField(term91327, term91327.getClass(), "month", (short) 5);
        setShortField(term91327, term91327.getClass(), "day", (short) 20);
        setField(term91326, term91326.getClass(), "date", term91327);
        setByteField(term91331, term91331.getClass(), "hour", (byte) 12);
        setByteField(term91331, term91331.getClass(), "minute", (byte) 30);
        setByteField(term91331, term91331.getClass(), "second", (byte) 37);
        setIntField(term91331, term91331.getClass(), "nano", 390283474);
        setField(term91326, term91326.getClass(), "time", term91331);
        setField(term91310, term91310.getClass(), "registerTime", term91326);
        setIntField(term91337, term91337.getClass(), "year", 2028);
        setShortField(term91337, term91337.getClass(), "month", (short) 11);
        setShortField(term91337, term91337.getClass(), "day", (short) 28);
        setField(term91336, term91336.getClass(), "date", term91337);
        setByteField(term91341, term91341.getClass(), "hour", (byte) 4);
        setByteField(term91341, term91341.getClass(), "minute", (byte) 25);
        setByteField(term91341, term91341.getClass(), "second", (byte) 12);
        setIntField(term91341, term91341.getClass(), "nano", 726554360);
        setField(term91336, term91336.getClass(), "time", term91341);
        setField(term91310, term91310.getClass(), "accessTime", term91336);
        setField(term91308, term91308.getClass(), "card", term91310);
        setField(term91308, term91308.getClass(), "userName", "heAByNySVP");
        setIntField(term91308, term91308.getClass(), "isNetMember", -1361096912);
        setIntField(term91308, term91308.getClass(), "iconId", -1489448292);
        setIntField(term91308, term91308.getClass(), "plateId", -111099654);
        setIntField(term91308, term91308.getClass(), "titleId", 1865814659);
        setIntField(term91308, term91308.getClass(), "partnerId", -715300089);
        setIntField(term91308, term91308.getClass(), "frameId", 493602399);
        setIntField(term91308, term91308.getClass(), "selectMapId", 306088960);
        setIntField(term91308, term91308.getClass(), "totalAwake", 1739612725);
        setIntField(term91308, term91308.getClass(), "gradeRating", 684431128);
        setIntField(term91308, term91308.getClass(), "musicRating", -131718261);
        setIntField(term91308, term91308.getClass(), "playerRating", 1392281647);
        setIntField(term91308, term91308.getClass(), "highestRating", 1896966568);
        setIntField(term91308, term91308.getClass(), "gradeRank", 95747063);
        setIntField(term91308, term91308.getClass(), "classRank", 1353810730);
        setIntField(term91308, term91308.getClass(), "courseRank", 1704841611);
        setField(term91308, term91308.getClass(), "charaSlot", term91373);
        setField(term91308, term91308.getClass(), "charaLockSlot", term91377);
        setLongField(term91308, term91308.getClass(), "contentBit", -5221197842613792699L);
        setIntField(term91308, term91308.getClass(), "playCount", -1055865904);
        setField(term91308, term91308.getClass(), "eventWatchedDate", "gPuVkQobYQ");
        setField(term91308, term91308.getClass(), "lastGameId", "sAHDMENVSp");
        setField(term91308, term91308.getClass(), "lastRomVersion", "oLoxfeWIGH");
        setField(term91308, term91308.getClass(), "lastDataVersion", "vdErTHSsJu");
        setField(term91308, term91308.getClass(), "lastLoginDate", "MeFZCtLbdV");
        setField(term91308, term91308.getClass(), "lastPlayDate", "oNgxBniAuz");
        setIntField(term91308, term91308.getClass(), "lastPlayCredit", 1639434832);
        setIntField(term91308, term91308.getClass(), "lastPlayMode", 41120682);
        setIntField(term91308, term91308.getClass(), "lastPlaceId", -565584348);
        setField(term91308, term91308.getClass(), "lastPlaceName", "hvbJVpbmAQ");
        setIntField(term91308, term91308.getClass(), "lastAllNetId", 768323855);
        setIntField(term91308, term91308.getClass(), "lastRegionId", -346585829);
        setField(term91308, term91308.getClass(), "lastRegionName", "aqayJgOWOQ");
        setField(term91308, term91308.getClass(), "lastClientId", "YStxlrcedL");
        setField(term91308, term91308.getClass(), "lastCountryCode", "mDLwflwlja");
        setIntField(term91308, term91308.getClass(), "lastSelectEMoney", -1575960315);
        setIntField(term91308, term91308.getClass(), "lastSelectTicket", -514683546);
        setIntField(term91308, term91308.getClass(), "lastSelectCourse", 1234114047);
        setIntField(term91308, term91308.getClass(), "lastCountCourse", 781355790);
        setField(term91308, term91308.getClass(), "firstGameId", "RqkgPxDFnv");
        setField(term91308, term91308.getClass(), "firstRomVersion", "egaLajwFgY");
        setField(term91308, term91308.getClass(), "firstDataVersion", "wUXTYOJezz");
        setField(term91308, term91308.getClass(), "firstPlayDate", "dovCZEmPER");
        setField(term91308, term91308.getClass(), "compatibleCmVersion", "QIADULuFso");
        setField(term91308, term91308.getClass(), "dailyBonusDate", "XWnZIYfmmD");
        setField(term91308, term91308.getClass(), "dailyCourseBonusDate", "PbkTntqZDZ");
        setField(term91308, term91308.getClass(), "lastPairLoginDate", "yDWoqUswuW");
        setField(term91308, term91308.getClass(), "lastTrialPlayDate", "mgjEDzRwET");
        setIntField(term91308, term91308.getClass(), "playVsCount", 549100322);
        setIntField(term91308, term91308.getClass(), "playSyncCount", 398153902);
        setIntField(term91308, term91308.getClass(), "winCount", 377234030);
        setIntField(term91308, term91308.getClass(), "helpCount", 1874512723);
        setIntField(term91308, term91308.getClass(), "comboCount", 1522351738);
        setLongField(term91308, term91308.getClass(), "totalDeluxscore", 8797226144896755216L);
        setLongField(term91308, term91308.getClass(), "totalBasicDeluxscore", -4524622074523380827L);
        setLongField(term91308, term91308.getClass(), "totalAdvancedDeluxscore", 3094101285402200938L);
        setLongField(term91308, term91308.getClass(), "totalExpertDeluxscore", -1691547788317547227L);
        setLongField(term91308, term91308.getClass(), "totalMasterDeluxscore", 5409837706558296333L);
        setLongField(term91308, term91308.getClass(), "totalReMasterDeluxscore", -6838907525371973667L);
        setIntField(term91308, term91308.getClass(), "totalSync", 1017805089);
        setIntField(term91308, term91308.getClass(), "totalBasicSync", -1625168727);
        setIntField(term91308, term91308.getClass(), "totalAdvancedSync", 1507365243);
        setIntField(term91308, term91308.getClass(), "totalExpertSync", -1212284162);
        setIntField(term91308, term91308.getClass(), "totalMasterSync", -1956243783);
        setIntField(term91308, term91308.getClass(), "totalReMasterSync", 33967357);
        setLongField(term91308, term91308.getClass(), "totalAchievement", -7024469480394415540L);
        setLongField(term91308, term91308.getClass(), "totalBasicAchievement", 8192919049584536731L);
        setLongField(term91308, term91308.getClass(), "totalAdvancedAchievement", 661658911296323350L);
        setLongField(term91308, term91308.getClass(), "totalExpertAchievement", 2352206876218352319L);
        setLongField(term91308, term91308.getClass(), "totalMasterAchievement", -7692507274255908488L);
        setLongField(term91308, term91308.getClass(), "totalReMasterAchievement", 2508296380707148646L);
        setLongField(term91308, term91308.getClass(), "playerOldRating", -471151828695812251L);
        setLongField(term91308, term91308.getClass(), "playerNewRating", -7531297671326780727L);
        setIntField(term91308, term91308.getClass(), "banState", -1227252559);
        setLongField(term91308, term91308.getClass(), "dateTime", -6655674259185118023L);
        setField(term91306, term91306.getClass(), "user", term91308);
        setIntField(term91306, term91306.getClass(), "courseId", 1636889912);
        setBooleanField(term91306, term91306.getClass(), "isLastClear", true);
        setIntField(term91306, term91306.getClass(), "totalRestlife", 1695339680);
        setIntField(term91306, term91306.getClass(), "totalAchievement", 79521146);
        setIntField(term91306, term91306.getClass(), "totalDeluxscore", 1295906354);
        setIntField(term91306, term91306.getClass(), "playCount", 980180400);
        setField(term91306, term91306.getClass(), "clearDate", "CepeBzACyE");
        setField(term91306, term91306.getClass(), "lastPlayDate", "WtgzEUhZIl");
        setIntField(term91306, term91306.getClass(), "bestAchievement", -128299328);
        setField(term91306, term91306.getClass(), "bestAchievementDate", "tzigWGaijF");
        setIntField(term91306, term91306.getClass(), "bestDeluxscore", 668320250);
        setField(term91306, term91306.getClass(), "bestDeluxscoreDate", "VWFNUuzpse");
        term91707 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserCourse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term91707;
        callMethod(klass, "canEqual", argTypes, term91306, args);
    }

};


