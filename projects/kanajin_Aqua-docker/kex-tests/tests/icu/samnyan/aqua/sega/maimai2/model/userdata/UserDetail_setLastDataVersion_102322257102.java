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

public class UserDetail_setLastDataVersion_102322257102 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term253416;

    public UserDetail_setLastDataVersion_102322257102() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term253420 = new Long(1133267598258375793L);
        Integer term253483 = new Integer(-88572295);
        Integer term253485 = new Integer(-1830705318);
        Integer term253487 = new Integer(1003880925);
        Integer term253489 = new Integer(-1963566761);
        Integer term253491 = new Integer(-1043400736);
        Integer term253493 = new Integer(497106793);
        Integer term253495 = new Integer(-1904196296);
        Integer term253497 = new Integer(-1857445668);
        Integer term253499 = new Integer(-1481132293);
        ArrayList term253481 = new ArrayList();
        ((ArrayList) term253481).add(term253483);
        ((ArrayList) term253481).add(term253485);
        ((ArrayList) term253481).add(term253487);
        ((ArrayList) term253481).add(term253489);
        ((ArrayList) term253481).add(term253491);
        ((ArrayList) term253481).add(term253493);
        ((ArrayList) term253481).add(term253495);
        ((ArrayList) term253481).add(term253497);
        ((ArrayList) term253481).add(term253499);
        Integer term253505 = new Integer(-1458633954);
        Integer term253507 = new Integer(1334294885);
        Integer term253509 = new Integer(-711784035);
        Integer term253511 = new Integer(-497219797);
        Integer term253513 = new Integer(720453125);
        Integer term253515 = new Integer(-860314891);
        Integer term253517 = new Integer(-444697262);
        Integer term253519 = new Integer(-460183304);
        Integer term253521 = new Integer(-2123879019);
        ArrayList term253503 = new ArrayList();
        ((ArrayList) term253503).add(term253505);
        ((ArrayList) term253503).add(term253507);
        ((ArrayList) term253503).add(term253509);
        ((ArrayList) term253503).add(term253511);
        ((ArrayList) term253503).add(term253513);
        ((ArrayList) term253503).add(term253515);
        ((ArrayList) term253503).add(term253517);
        ((ArrayList) term253503).add(term253519);
        ((ArrayList) term253503).add(term253521);
        term253416 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term253418 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term253434 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term253435 = newInstance(Class.forName("java.time.LocalDate"));
        Object term253439 = newInstance(Class.forName("java.time.LocalTime"));
        Object term253444 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term253445 = newInstance(Class.forName("java.time.LocalDate"));
        Object term253449 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term253416, term253416.getClass(), "id", 3233466106422186477L);
        setLongField(term253418, term253418.getClass(), "id", -5207253283948375393L);
        setField(term253418, term253418.getClass(), "extId", term253420);
        setField(term253418, term253418.getClass(), "luid", "gkKANBoKRQ");
        setIntField(term253435, term253435.getClass(), "year", 2014);
        setShortField(term253435, term253435.getClass(), "month", (short) 8);
        setShortField(term253435, term253435.getClass(), "day", (short) 10);
        setField(term253434, term253434.getClass(), "date", term253435);
        setByteField(term253439, term253439.getClass(), "hour", (byte) 17);
        setByteField(term253439, term253439.getClass(), "minute", (byte) 8);
        setByteField(term253439, term253439.getClass(), "second", (byte) 32);
        setIntField(term253439, term253439.getClass(), "nano", 120357006);
        setField(term253434, term253434.getClass(), "time", term253439);
        setField(term253418, term253418.getClass(), "registerTime", term253434);
        setIntField(term253445, term253445.getClass(), "year", 2029);
        setShortField(term253445, term253445.getClass(), "month", (short) 5);
        setShortField(term253445, term253445.getClass(), "day", (short) 3);
        setField(term253444, term253444.getClass(), "date", term253445);
        setByteField(term253449, term253449.getClass(), "hour", (byte) 21);
        setByteField(term253449, term253449.getClass(), "minute", (byte) 41);
        setByteField(term253449, term253449.getClass(), "second", (byte) 9);
        setIntField(term253449, term253449.getClass(), "nano", 699417700);
        setField(term253444, term253444.getClass(), "time", term253449);
        setField(term253418, term253418.getClass(), "accessTime", term253444);
        setField(term253416, term253416.getClass(), "card", term253418);
        setField(term253416, term253416.getClass(), "userName", "nwIfxSYLbH");
        setIntField(term253416, term253416.getClass(), "isNetMember", 1185873996);
        setIntField(term253416, term253416.getClass(), "iconId", 205875972);
        setIntField(term253416, term253416.getClass(), "plateId", 1064911901);
        setIntField(term253416, term253416.getClass(), "titleId", 194380521);
        setIntField(term253416, term253416.getClass(), "partnerId", 1283277389);
        setIntField(term253416, term253416.getClass(), "frameId", -1328214687);
        setIntField(term253416, term253416.getClass(), "selectMapId", 17241672);
        setIntField(term253416, term253416.getClass(), "totalAwake", 34966127);
        setIntField(term253416, term253416.getClass(), "gradeRating", 1906285293);
        setIntField(term253416, term253416.getClass(), "musicRating", -238734417);
        setIntField(term253416, term253416.getClass(), "playerRating", -1873132810);
        setIntField(term253416, term253416.getClass(), "highestRating", 2076149493);
        setIntField(term253416, term253416.getClass(), "gradeRank", -109918085);
        setIntField(term253416, term253416.getClass(), "classRank", 1074991086);
        setIntField(term253416, term253416.getClass(), "courseRank", -814652670);
        setField(term253416, term253416.getClass(), "charaSlot", term253481);
        setField(term253416, term253416.getClass(), "charaLockSlot", term253503);
        setLongField(term253416, term253416.getClass(), "contentBit", -6865653138077866888L);
        setIntField(term253416, term253416.getClass(), "playCount", 1798901789);
        setField(term253416, term253416.getClass(), "eventWatchedDate", "VlbJRuEAoY");
        setField(term253416, term253416.getClass(), "lastGameId", "FwbSKnEQVR");
        setField(term253416, term253416.getClass(), "lastRomVersion", "SUIyTSOfNO");
        setField(term253416, term253416.getClass(), "lastDataVersion", "dXdjApLAzK");
        setField(term253416, term253416.getClass(), "lastLoginDate", "SoglrUcgGE");
        setField(term253416, term253416.getClass(), "lastPlayDate", "rWtaQaTGlL");
        setIntField(term253416, term253416.getClass(), "lastPlayCredit", -31619649);
        setIntField(term253416, term253416.getClass(), "lastPlayMode", -37410385);
        setIntField(term253416, term253416.getClass(), "lastPlaceId", 1071145962);
        setField(term253416, term253416.getClass(), "lastPlaceName", "cHAyWxkpYO");
        setIntField(term253416, term253416.getClass(), "lastAllNetId", 1665849594);
        setIntField(term253416, term253416.getClass(), "lastRegionId", -895176866);
        setField(term253416, term253416.getClass(), "lastRegionName", "neHaYsveYy");
        setField(term253416, term253416.getClass(), "lastClientId", "jwOOWlBKWZ");
        setField(term253416, term253416.getClass(), "lastCountryCode", "LFabroENXN");
        setIntField(term253416, term253416.getClass(), "lastSelectEMoney", 575087010);
        setIntField(term253416, term253416.getClass(), "lastSelectTicket", 333563350);
        setIntField(term253416, term253416.getClass(), "lastSelectCourse", -39309378);
        setIntField(term253416, term253416.getClass(), "lastCountCourse", 961665922);
        setField(term253416, term253416.getClass(), "firstGameId", "xTtWtlUDcE");
        setField(term253416, term253416.getClass(), "firstRomVersion", "zaYpmvkBFb");
        setField(term253416, term253416.getClass(), "firstDataVersion", "oBbrOFbyjc");
        setField(term253416, term253416.getClass(), "firstPlayDate", "VRZXwrWoco");
        setField(term253416, term253416.getClass(), "compatibleCmVersion", "RrxbbTEHjO");
        setField(term253416, term253416.getClass(), "dailyBonusDate", "AszeYDlmYY");
        setField(term253416, term253416.getClass(), "dailyCourseBonusDate", "DujdUzFIMa");
        setField(term253416, term253416.getClass(), "lastPairLoginDate", "NOySWCkmik");
        setField(term253416, term253416.getClass(), "lastTrialPlayDate", "DNMHqWALqA");
        setIntField(term253416, term253416.getClass(), "playVsCount", -1685742995);
        setIntField(term253416, term253416.getClass(), "playSyncCount", 371668440);
        setIntField(term253416, term253416.getClass(), "winCount", 637125815);
        setIntField(term253416, term253416.getClass(), "helpCount", 1459177402);
        setIntField(term253416, term253416.getClass(), "comboCount", -1398842690);
        setLongField(term253416, term253416.getClass(), "totalDeluxscore", 295923853159909621L);
        setLongField(term253416, term253416.getClass(), "totalBasicDeluxscore", 944060676602933061L);
        setLongField(term253416, term253416.getClass(), "totalAdvancedDeluxscore", -147933201134044656L);
        setLongField(term253416, term253416.getClass(), "totalExpertDeluxscore", -8377324864728965074L);
        setLongField(term253416, term253416.getClass(), "totalMasterDeluxscore", -955530064007969735L);
        setLongField(term253416, term253416.getClass(), "totalReMasterDeluxscore", 7806290748371830045L);
        setIntField(term253416, term253416.getClass(), "totalSync", -503117709);
        setIntField(term253416, term253416.getClass(), "totalBasicSync", -1285985156);
        setIntField(term253416, term253416.getClass(), "totalAdvancedSync", 219562270);
        setIntField(term253416, term253416.getClass(), "totalExpertSync", 448658595);
        setIntField(term253416, term253416.getClass(), "totalMasterSync", 583555169);
        setIntField(term253416, term253416.getClass(), "totalReMasterSync", 327897443);
        setLongField(term253416, term253416.getClass(), "totalAchievement", -6431872345838028268L);
        setLongField(term253416, term253416.getClass(), "totalBasicAchievement", -1862965541594229073L);
        setLongField(term253416, term253416.getClass(), "totalAdvancedAchievement", 4660995028433627101L);
        setLongField(term253416, term253416.getClass(), "totalExpertAchievement", -2878839270340687597L);
        setLongField(term253416, term253416.getClass(), "totalMasterAchievement", 3175208025054914805L);
        setLongField(term253416, term253416.getClass(), "totalReMasterAchievement", -3249643352608258248L);
        setLongField(term253416, term253416.getClass(), "playerOldRating", 4603535153444311453L);
        setLongField(term253416, term253416.getClass(), "playerNewRating", 20726008471010343L);
        setIntField(term253416, term253416.getClass(), "banState", -1702663498);
        setLongField(term253416, term253416.getClass(), "dateTime", 6670560491725467904L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "xlwLAxfWId";
        callMethod(klass, "setLastDataVersion", argTypes, term253416, args);
    }

};


