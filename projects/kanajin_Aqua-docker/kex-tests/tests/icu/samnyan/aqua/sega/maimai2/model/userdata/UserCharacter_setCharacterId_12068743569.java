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

public class UserCharacter_setCharacterId_12068743569 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term190295;
     Object term190650;

    public UserCharacter_setCharacterId_12068743569() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term190301 = new Long(-7205236974351118210L);
        Integer term190364 = new Integer(469445830);
        ArrayList term190362 = new ArrayList();
        ((ArrayList) term190362).add(term190364);
        Integer term190370 = new Integer(-1482217659);
        Integer term190372 = new Integer(1650302326);
        Integer term190374 = new Integer(-123648353);
        Integer term190376 = new Integer(-992215212);
        ArrayList term190368 = new ArrayList();
        ((ArrayList) term190368).add(term190370);
        ((ArrayList) term190368).add(term190372);
        ((ArrayList) term190368).add(term190374);
        ((ArrayList) term190368).add(term190376);
        term190295 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserCharacter"));
        Object term190297 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term190299 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term190315 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term190316 = newInstance(Class.forName("java.time.LocalDate"));
        Object term190320 = newInstance(Class.forName("java.time.LocalTime"));
        Object term190325 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term190326 = newInstance(Class.forName("java.time.LocalDate"));
        Object term190330 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term190295, term190295.getClass(), "id", -2240986930373678636L);
        setLongField(term190297, term190297.getClass(), "id", 2133592839428936035L);
        setLongField(term190299, term190299.getClass(), "id", -2418391248513817762L);
        setField(term190299, term190299.getClass(), "extId", term190301);
        setField(term190299, term190299.getClass(), "luid", "NAkrjjouYH");
        setIntField(term190316, term190316.getClass(), "year", 2021);
        setShortField(term190316, term190316.getClass(), "month", (short) 2);
        setShortField(term190316, term190316.getClass(), "day", (short) 24);
        setField(term190315, term190315.getClass(), "date", term190316);
        setByteField(term190320, term190320.getClass(), "hour", (byte) 2);
        setByteField(term190320, term190320.getClass(), "minute", (byte) 4);
        setByteField(term190320, term190320.getClass(), "second", (byte) 26);
        setIntField(term190320, term190320.getClass(), "nano", 423826252);
        setField(term190315, term190315.getClass(), "time", term190320);
        setField(term190299, term190299.getClass(), "registerTime", term190315);
        setIntField(term190326, term190326.getClass(), "year", 2017);
        setShortField(term190326, term190326.getClass(), "month", (short) 8);
        setShortField(term190326, term190326.getClass(), "day", (short) 15);
        setField(term190325, term190325.getClass(), "date", term190326);
        setByteField(term190330, term190330.getClass(), "hour", (byte) 7);
        setByteField(term190330, term190330.getClass(), "minute", (byte) 47);
        setByteField(term190330, term190330.getClass(), "second", (byte) 20);
        setIntField(term190330, term190330.getClass(), "nano", 749374038);
        setField(term190325, term190325.getClass(), "time", term190330);
        setField(term190299, term190299.getClass(), "accessTime", term190325);
        setField(term190297, term190297.getClass(), "card", term190299);
        setField(term190297, term190297.getClass(), "userName", "dSiUSTAjCX");
        setIntField(term190297, term190297.getClass(), "isNetMember", 1265876286);
        setIntField(term190297, term190297.getClass(), "iconId", 111275435);
        setIntField(term190297, term190297.getClass(), "plateId", 1944060051);
        setIntField(term190297, term190297.getClass(), "titleId", 630074094);
        setIntField(term190297, term190297.getClass(), "partnerId", 570208042);
        setIntField(term190297, term190297.getClass(), "frameId", -93488030);
        setIntField(term190297, term190297.getClass(), "selectMapId", 926138799);
        setIntField(term190297, term190297.getClass(), "totalAwake", 591313019);
        setIntField(term190297, term190297.getClass(), "gradeRating", -1755672438);
        setIntField(term190297, term190297.getClass(), "musicRating", -2140257584);
        setIntField(term190297, term190297.getClass(), "playerRating", -1626490850);
        setIntField(term190297, term190297.getClass(), "highestRating", 446978027);
        setIntField(term190297, term190297.getClass(), "gradeRank", -384315341);
        setIntField(term190297, term190297.getClass(), "classRank", 204740619);
        setIntField(term190297, term190297.getClass(), "courseRank", 107555188);
        setField(term190297, term190297.getClass(), "charaSlot", term190362);
        setField(term190297, term190297.getClass(), "charaLockSlot", term190368);
        setLongField(term190297, term190297.getClass(), "contentBit", -4714635200532185455L);
        setIntField(term190297, term190297.getClass(), "playCount", -531718135);
        setField(term190297, term190297.getClass(), "eventWatchedDate", "xBAPqcTBHS");
        setField(term190297, term190297.getClass(), "lastGameId", "VFosMMhIdi");
        setField(term190297, term190297.getClass(), "lastRomVersion", "zUZtiqtfst");
        setField(term190297, term190297.getClass(), "lastDataVersion", "hQcNBUpzME");
        setField(term190297, term190297.getClass(), "lastLoginDate", "eNnBrxvrSt");
        setField(term190297, term190297.getClass(), "lastPlayDate", "PxvnQVNeCZ");
        setIntField(term190297, term190297.getClass(), "lastPlayCredit", 598160626);
        setIntField(term190297, term190297.getClass(), "lastPlayMode", 1754085320);
        setIntField(term190297, term190297.getClass(), "lastPlaceId", -143315713);
        setField(term190297, term190297.getClass(), "lastPlaceName", "DhASIoZdwe");
        setIntField(term190297, term190297.getClass(), "lastAllNetId", -362106921);
        setIntField(term190297, term190297.getClass(), "lastRegionId", 86367204);
        setField(term190297, term190297.getClass(), "lastRegionName", "PMrzFHnOYQ");
        setField(term190297, term190297.getClass(), "lastClientId", "FrWWpuUBJY");
        setField(term190297, term190297.getClass(), "lastCountryCode", "CHVvZioDMH");
        setIntField(term190297, term190297.getClass(), "lastSelectEMoney", -602995676);
        setIntField(term190297, term190297.getClass(), "lastSelectTicket", 815088701);
        setIntField(term190297, term190297.getClass(), "lastSelectCourse", 502026234);
        setIntField(term190297, term190297.getClass(), "lastCountCourse", -871479292);
        setField(term190297, term190297.getClass(), "firstGameId", "qsUACKTmDD");
        setField(term190297, term190297.getClass(), "firstRomVersion", "EmkqGYkPzv");
        setField(term190297, term190297.getClass(), "firstDataVersion", "owHMQAOCOb");
        setField(term190297, term190297.getClass(), "firstPlayDate", "mwPpmhmgxe");
        setField(term190297, term190297.getClass(), "compatibleCmVersion", "AkTBlKrxZl");
        setField(term190297, term190297.getClass(), "dailyBonusDate", "JjTdvIrvPK");
        setField(term190297, term190297.getClass(), "dailyCourseBonusDate", "IPYNkBSSpi");
        setField(term190297, term190297.getClass(), "lastPairLoginDate", "jrAClCtfec");
        setField(term190297, term190297.getClass(), "lastTrialPlayDate", "bsICeJRjzc");
        setIntField(term190297, term190297.getClass(), "playVsCount", -1077764191);
        setIntField(term190297, term190297.getClass(), "playSyncCount", 1374586510);
        setIntField(term190297, term190297.getClass(), "winCount", -354597292);
        setIntField(term190297, term190297.getClass(), "helpCount", -581675259);
        setIntField(term190297, term190297.getClass(), "comboCount", -495803538);
        setLongField(term190297, term190297.getClass(), "totalDeluxscore", 5833833394744830629L);
        setLongField(term190297, term190297.getClass(), "totalBasicDeluxscore", -7573479995177479483L);
        setLongField(term190297, term190297.getClass(), "totalAdvancedDeluxscore", -2366286768847765151L);
        setLongField(term190297, term190297.getClass(), "totalExpertDeluxscore", -5097256644226032512L);
        setLongField(term190297, term190297.getClass(), "totalMasterDeluxscore", -8927827038296427456L);
        setLongField(term190297, term190297.getClass(), "totalReMasterDeluxscore", -409185820590411414L);
        setIntField(term190297, term190297.getClass(), "totalSync", -168864726);
        setIntField(term190297, term190297.getClass(), "totalBasicSync", 970702834);
        setIntField(term190297, term190297.getClass(), "totalAdvancedSync", -863293599);
        setIntField(term190297, term190297.getClass(), "totalExpertSync", -416844310);
        setIntField(term190297, term190297.getClass(), "totalMasterSync", -609565612);
        setIntField(term190297, term190297.getClass(), "totalReMasterSync", 1241183529);
        setLongField(term190297, term190297.getClass(), "totalAchievement", -5660292101720594350L);
        setLongField(term190297, term190297.getClass(), "totalBasicAchievement", -8001458640699468718L);
        setLongField(term190297, term190297.getClass(), "totalAdvancedAchievement", -2531379667934668121L);
        setLongField(term190297, term190297.getClass(), "totalExpertAchievement", -8493569200291088525L);
        setLongField(term190297, term190297.getClass(), "totalMasterAchievement", -1214297584521497035L);
        setLongField(term190297, term190297.getClass(), "totalReMasterAchievement", -7893939569994031367L);
        setLongField(term190297, term190297.getClass(), "playerOldRating", -7660606501487991809L);
        setLongField(term190297, term190297.getClass(), "playerNewRating", -875185413198895165L);
        setIntField(term190297, term190297.getClass(), "banState", 825457585);
        setLongField(term190297, term190297.getClass(), "dateTime", -5708499938823947916L);
        setField(term190295, term190295.getClass(), "user", term190297);
        setIntField(term190295, term190295.getClass(), "characterId", -365689493);
        setIntField(term190295, term190295.getClass(), "level", -1044364593);
        setIntField(term190295, term190295.getClass(), "awakening", -1144558597);
        setIntField(term190295, term190295.getClass(), "useCount", 392267583);
        term190650 = new Integer(1712122682);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserCharacter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term190650;
        callMethod(klass, "setCharacterId", argTypes, term190295, args);
    }

};


