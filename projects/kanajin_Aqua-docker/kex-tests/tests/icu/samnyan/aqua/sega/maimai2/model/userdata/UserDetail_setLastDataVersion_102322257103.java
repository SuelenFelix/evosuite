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

public class UserDetail_setLastDataVersion_102322257103 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term253471;

    public UserDetail_setLastDataVersion_102322257103() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term253475 = new Long(1133267598258375793L);
        Integer term253538 = new Integer(-88572295);
        Integer term253540 = new Integer(-1830705318);
        Integer term253542 = new Integer(1003880925);
        Integer term253544 = new Integer(-1963566761);
        Integer term253546 = new Integer(-1043400736);
        Integer term253548 = new Integer(497106793);
        Integer term253550 = new Integer(-1904196296);
        Integer term253552 = new Integer(-1857445668);
        Integer term253554 = new Integer(-1481132293);
        ArrayList term253536 = new ArrayList();
        ((ArrayList) term253536).add(term253538);
        ((ArrayList) term253536).add(term253540);
        ((ArrayList) term253536).add(term253542);
        ((ArrayList) term253536).add(term253544);
        ((ArrayList) term253536).add(term253546);
        ((ArrayList) term253536).add(term253548);
        ((ArrayList) term253536).add(term253550);
        ((ArrayList) term253536).add(term253552);
        ((ArrayList) term253536).add(term253554);
        Integer term253560 = new Integer(-1458633954);
        Integer term253562 = new Integer(1334294885);
        Integer term253564 = new Integer(-711784035);
        Integer term253566 = new Integer(-497219797);
        Integer term253568 = new Integer(720453125);
        Integer term253570 = new Integer(-860314891);
        Integer term253572 = new Integer(-444697262);
        Integer term253574 = new Integer(-460183304);
        Integer term253576 = new Integer(-2123879019);
        ArrayList term253558 = new ArrayList();
        ((ArrayList) term253558).add(term253560);
        ((ArrayList) term253558).add(term253562);
        ((ArrayList) term253558).add(term253564);
        ((ArrayList) term253558).add(term253566);
        ((ArrayList) term253558).add(term253568);
        ((ArrayList) term253558).add(term253570);
        ((ArrayList) term253558).add(term253572);
        ((ArrayList) term253558).add(term253574);
        ((ArrayList) term253558).add(term253576);
        term253471 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term253473 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term253489 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term253490 = newInstance(Class.forName("java.time.LocalDate"));
        Object term253494 = newInstance(Class.forName("java.time.LocalTime"));
        Object term253499 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term253500 = newInstance(Class.forName("java.time.LocalDate"));
        Object term253504 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term253471, term253471.getClass(), "id", 3233466106422186477L);
        setLongField(term253473, term253473.getClass(), "id", -5207253283948375393L);
        setField(term253473, term253473.getClass(), "extId", term253475);
        setField(term253473, term253473.getClass(), "luid", "gkKANBoKRQ");
        setIntField(term253490, term253490.getClass(), "year", 2014);
        setShortField(term253490, term253490.getClass(), "month", (short) 8);
        setShortField(term253490, term253490.getClass(), "day", (short) 10);
        setField(term253489, term253489.getClass(), "date", term253490);
        setByteField(term253494, term253494.getClass(), "hour", (byte) 17);
        setByteField(term253494, term253494.getClass(), "minute", (byte) 8);
        setByteField(term253494, term253494.getClass(), "second", (byte) 32);
        setIntField(term253494, term253494.getClass(), "nano", 120357006);
        setField(term253489, term253489.getClass(), "time", term253494);
        setField(term253473, term253473.getClass(), "registerTime", term253489);
        setIntField(term253500, term253500.getClass(), "year", 2029);
        setShortField(term253500, term253500.getClass(), "month", (short) 5);
        setShortField(term253500, term253500.getClass(), "day", (short) 3);
        setField(term253499, term253499.getClass(), "date", term253500);
        setByteField(term253504, term253504.getClass(), "hour", (byte) 21);
        setByteField(term253504, term253504.getClass(), "minute", (byte) 41);
        setByteField(term253504, term253504.getClass(), "second", (byte) 9);
        setIntField(term253504, term253504.getClass(), "nano", 699417700);
        setField(term253499, term253499.getClass(), "time", term253504);
        setField(term253473, term253473.getClass(), "accessTime", term253499);
        setField(term253471, term253471.getClass(), "card", term253473);
        setField(term253471, term253471.getClass(), "userName", "nwIfxSYLbH");
        setIntField(term253471, term253471.getClass(), "isNetMember", 1185873996);
        setIntField(term253471, term253471.getClass(), "iconId", 205875972);
        setIntField(term253471, term253471.getClass(), "plateId", 1064911901);
        setIntField(term253471, term253471.getClass(), "titleId", 194380521);
        setIntField(term253471, term253471.getClass(), "partnerId", 1283277389);
        setIntField(term253471, term253471.getClass(), "frameId", -1328214687);
        setIntField(term253471, term253471.getClass(), "selectMapId", 17241672);
        setIntField(term253471, term253471.getClass(), "totalAwake", 34966127);
        setIntField(term253471, term253471.getClass(), "gradeRating", 1906285293);
        setIntField(term253471, term253471.getClass(), "musicRating", -238734417);
        setIntField(term253471, term253471.getClass(), "playerRating", -1873132810);
        setIntField(term253471, term253471.getClass(), "highestRating", 2076149493);
        setIntField(term253471, term253471.getClass(), "gradeRank", -109918085);
        setIntField(term253471, term253471.getClass(), "classRank", 1074991086);
        setIntField(term253471, term253471.getClass(), "courseRank", -814652670);
        setField(term253471, term253471.getClass(), "charaSlot", term253536);
        setField(term253471, term253471.getClass(), "charaLockSlot", term253558);
        setLongField(term253471, term253471.getClass(), "contentBit", -6865653138077866888L);
        setIntField(term253471, term253471.getClass(), "playCount", 1798901789);
        setField(term253471, term253471.getClass(), "eventWatchedDate", "VlbJRuEAoY");
        setField(term253471, term253471.getClass(), "lastGameId", "FwbSKnEQVR");
        setField(term253471, term253471.getClass(), "lastRomVersion", "SUIyTSOfNO");
        setField(term253471, term253471.getClass(), "lastDataVersion", "dXdjApLAzK");
        setField(term253471, term253471.getClass(), "lastLoginDate", "SoglrUcgGE");
        setField(term253471, term253471.getClass(), "lastPlayDate", "rWtaQaTGlL");
        setIntField(term253471, term253471.getClass(), "lastPlayCredit", -31619649);
        setIntField(term253471, term253471.getClass(), "lastPlayMode", -37410385);
        setIntField(term253471, term253471.getClass(), "lastPlaceId", 1071145962);
        setField(term253471, term253471.getClass(), "lastPlaceName", "cHAyWxkpYO");
        setIntField(term253471, term253471.getClass(), "lastAllNetId", 1665849594);
        setIntField(term253471, term253471.getClass(), "lastRegionId", -895176866);
        setField(term253471, term253471.getClass(), "lastRegionName", "neHaYsveYy");
        setField(term253471, term253471.getClass(), "lastClientId", "jwOOWlBKWZ");
        setField(term253471, term253471.getClass(), "lastCountryCode", "LFabroENXN");
        setIntField(term253471, term253471.getClass(), "lastSelectEMoney", 575087010);
        setIntField(term253471, term253471.getClass(), "lastSelectTicket", 333563350);
        setIntField(term253471, term253471.getClass(), "lastSelectCourse", -39309378);
        setIntField(term253471, term253471.getClass(), "lastCountCourse", 961665922);
        setField(term253471, term253471.getClass(), "firstGameId", "xTtWtlUDcE");
        setField(term253471, term253471.getClass(), "firstRomVersion", "zaYpmvkBFb");
        setField(term253471, term253471.getClass(), "firstDataVersion", "oBbrOFbyjc");
        setField(term253471, term253471.getClass(), "firstPlayDate", "VRZXwrWoco");
        setField(term253471, term253471.getClass(), "compatibleCmVersion", "RrxbbTEHjO");
        setField(term253471, term253471.getClass(), "dailyBonusDate", "AszeYDlmYY");
        setField(term253471, term253471.getClass(), "dailyCourseBonusDate", "DujdUzFIMa");
        setField(term253471, term253471.getClass(), "lastPairLoginDate", "NOySWCkmik");
        setField(term253471, term253471.getClass(), "lastTrialPlayDate", "DNMHqWALqA");
        setIntField(term253471, term253471.getClass(), "playVsCount", -1685742995);
        setIntField(term253471, term253471.getClass(), "playSyncCount", 371668440);
        setIntField(term253471, term253471.getClass(), "winCount", 637125815);
        setIntField(term253471, term253471.getClass(), "helpCount", 1459177402);
        setIntField(term253471, term253471.getClass(), "comboCount", -1398842690);
        setLongField(term253471, term253471.getClass(), "totalDeluxscore", 295923853159909621L);
        setLongField(term253471, term253471.getClass(), "totalBasicDeluxscore", 944060676602933061L);
        setLongField(term253471, term253471.getClass(), "totalAdvancedDeluxscore", -147933201134044656L);
        setLongField(term253471, term253471.getClass(), "totalExpertDeluxscore", -8377324864728965074L);
        setLongField(term253471, term253471.getClass(), "totalMasterDeluxscore", -955530064007969735L);
        setLongField(term253471, term253471.getClass(), "totalReMasterDeluxscore", 7806290748371830045L);
        setIntField(term253471, term253471.getClass(), "totalSync", -503117709);
        setIntField(term253471, term253471.getClass(), "totalBasicSync", -1285985156);
        setIntField(term253471, term253471.getClass(), "totalAdvancedSync", 219562270);
        setIntField(term253471, term253471.getClass(), "totalExpertSync", 448658595);
        setIntField(term253471, term253471.getClass(), "totalMasterSync", 583555169);
        setIntField(term253471, term253471.getClass(), "totalReMasterSync", 327897443);
        setLongField(term253471, term253471.getClass(), "totalAchievement", -6431872345838028268L);
        setLongField(term253471, term253471.getClass(), "totalBasicAchievement", -1862965541594229073L);
        setLongField(term253471, term253471.getClass(), "totalAdvancedAchievement", 4660995028433627101L);
        setLongField(term253471, term253471.getClass(), "totalExpertAchievement", -2878839270340687597L);
        setLongField(term253471, term253471.getClass(), "totalMasterAchievement", 3175208025054914805L);
        setLongField(term253471, term253471.getClass(), "totalReMasterAchievement", -3249643352608258248L);
        setLongField(term253471, term253471.getClass(), "playerOldRating", 4603535153444311453L);
        setLongField(term253471, term253471.getClass(), "playerNewRating", 20726008471010343L);
        setIntField(term253471, term253471.getClass(), "banState", -1702663498);
        setLongField(term253471, term253471.getClass(), "dateTime", 6670560491725467904L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "xlwLAxfWId";
        callMethod(klass, "setLastDataVersion", argTypes, term253471, args);
    }

};


