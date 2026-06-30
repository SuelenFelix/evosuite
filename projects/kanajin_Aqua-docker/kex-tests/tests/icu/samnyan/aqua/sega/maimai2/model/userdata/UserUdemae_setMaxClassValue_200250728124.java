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

public class UserUdemae_setMaxClassValue_200250728124 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term108968;
     Object term109335;

    public UserUdemae_setMaxClassValue_200250728124() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term108974 = new Long(-8614778293741404325L);
        Integer term109037 = new Integer(1796581482);
        Integer term109039 = new Integer(1286440081);
        Integer term109041 = new Integer(-928538452);
        Integer term109043 = new Integer(-1313207353);
        Integer term109045 = new Integer(402612318);
        ArrayList term109035 = new ArrayList();
        ((ArrayList) term109035).add(term109037);
        ((ArrayList) term109035).add(term109039);
        ((ArrayList) term109035).add(term109041);
        ((ArrayList) term109035).add(term109043);
        ((ArrayList) term109035).add(term109045);
        ArrayList term109049 = new ArrayList();
        term108968 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserUdemae"));
        Object term108970 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term108972 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term108988 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term108989 = newInstance(Class.forName("java.time.LocalDate"));
        Object term108993 = newInstance(Class.forName("java.time.LocalTime"));
        Object term108998 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term108999 = newInstance(Class.forName("java.time.LocalDate"));
        Object term109003 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term108968, term108968.getClass(), "id", -5473289678956769394L);
        setLongField(term108970, term108970.getClass(), "id", 1682107454655274084L);
        setLongField(term108972, term108972.getClass(), "id", -4816041910670569630L);
        setField(term108972, term108972.getClass(), "extId", term108974);
        setField(term108972, term108972.getClass(), "luid", "GxNdoXawUZ");
        setIntField(term108989, term108989.getClass(), "year", 2013);
        setShortField(term108989, term108989.getClass(), "month", (short) 9);
        setShortField(term108989, term108989.getClass(), "day", (short) 12);
        setField(term108988, term108988.getClass(), "date", term108989);
        setByteField(term108993, term108993.getClass(), "hour", (byte) 14);
        setByteField(term108993, term108993.getClass(), "minute", (byte) 21);
        setByteField(term108993, term108993.getClass(), "second", (byte) 35);
        setIntField(term108993, term108993.getClass(), "nano", 520302725);
        setField(term108988, term108988.getClass(), "time", term108993);
        setField(term108972, term108972.getClass(), "registerTime", term108988);
        setIntField(term108999, term108999.getClass(), "year", 2016);
        setShortField(term108999, term108999.getClass(), "month", (short) 2);
        setShortField(term108999, term108999.getClass(), "day", (short) 15);
        setField(term108998, term108998.getClass(), "date", term108999);
        setByteField(term109003, term109003.getClass(), "hour", (byte) 7);
        setByteField(term109003, term109003.getClass(), "minute", (byte) 36);
        setByteField(term109003, term109003.getClass(), "second", (byte) 21);
        setIntField(term109003, term109003.getClass(), "nano", 74269011);
        setField(term108998, term108998.getClass(), "time", term109003);
        setField(term108972, term108972.getClass(), "accessTime", term108998);
        setField(term108970, term108970.getClass(), "card", term108972);
        setField(term108970, term108970.getClass(), "userName", "YAFTYAtere");
        setIntField(term108970, term108970.getClass(), "isNetMember", 1331143399);
        setIntField(term108970, term108970.getClass(), "iconId", -1736012493);
        setIntField(term108970, term108970.getClass(), "plateId", 1021379232);
        setIntField(term108970, term108970.getClass(), "titleId", 180789471);
        setIntField(term108970, term108970.getClass(), "partnerId", -1718954451);
        setIntField(term108970, term108970.getClass(), "frameId", 1867721531);
        setIntField(term108970, term108970.getClass(), "selectMapId", -964194849);
        setIntField(term108970, term108970.getClass(), "totalAwake", -1558640225);
        setIntField(term108970, term108970.getClass(), "gradeRating", 1206556058);
        setIntField(term108970, term108970.getClass(), "musicRating", 85515004);
        setIntField(term108970, term108970.getClass(), "playerRating", 1809173984);
        setIntField(term108970, term108970.getClass(), "highestRating", -1649722492);
        setIntField(term108970, term108970.getClass(), "gradeRank", 1892060110);
        setIntField(term108970, term108970.getClass(), "classRank", -1722968935);
        setIntField(term108970, term108970.getClass(), "courseRank", -352942698);
        setField(term108970, term108970.getClass(), "charaSlot", term109035);
        setField(term108970, term108970.getClass(), "charaLockSlot", term109049);
        setLongField(term108970, term108970.getClass(), "contentBit", -1787967031647261832L);
        setIntField(term108970, term108970.getClass(), "playCount", -291574787);
        setField(term108970, term108970.getClass(), "eventWatchedDate", "EYQnrjiZfX");
        setField(term108970, term108970.getClass(), "lastGameId", "xydFPTvtMs");
        setField(term108970, term108970.getClass(), "lastRomVersion", "lopARHjeMT");
        setField(term108970, term108970.getClass(), "lastDataVersion", "wizysRLgRr");
        setField(term108970, term108970.getClass(), "lastLoginDate", "VbDDltcmiT");
        setField(term108970, term108970.getClass(), "lastPlayDate", "VWIEojCQCj");
        setIntField(term108970, term108970.getClass(), "lastPlayCredit", 1661313090);
        setIntField(term108970, term108970.getClass(), "lastPlayMode", 1684314973);
        setIntField(term108970, term108970.getClass(), "lastPlaceId", 1244976316);
        setField(term108970, term108970.getClass(), "lastPlaceName", "jbeRMWjQTQ");
        setIntField(term108970, term108970.getClass(), "lastAllNetId", -1572789846);
        setIntField(term108970, term108970.getClass(), "lastRegionId", -1829984905);
        setField(term108970, term108970.getClass(), "lastRegionName", "YOjmohMpFb");
        setField(term108970, term108970.getClass(), "lastClientId", "WCRWOgfbRC");
        setField(term108970, term108970.getClass(), "lastCountryCode", "MeiYkUfwEV");
        setIntField(term108970, term108970.getClass(), "lastSelectEMoney", -1730584098);
        setIntField(term108970, term108970.getClass(), "lastSelectTicket", -1681411287);
        setIntField(term108970, term108970.getClass(), "lastSelectCourse", -1796526306);
        setIntField(term108970, term108970.getClass(), "lastCountCourse", 719664754);
        setField(term108970, term108970.getClass(), "firstGameId", "YOelMtNboh");
        setField(term108970, term108970.getClass(), "firstRomVersion", "ngShbLrxUt");
        setField(term108970, term108970.getClass(), "firstDataVersion", "tyyoVDzJBp");
        setField(term108970, term108970.getClass(), "firstPlayDate", "tbFDmscmBa");
        setField(term108970, term108970.getClass(), "compatibleCmVersion", "iwNiuIUhrn");
        setField(term108970, term108970.getClass(), "dailyBonusDate", "uRfXEtHgIt");
        setField(term108970, term108970.getClass(), "dailyCourseBonusDate", "lzrbwfKykX");
        setField(term108970, term108970.getClass(), "lastPairLoginDate", "eZWnfePnkp");
        setField(term108970, term108970.getClass(), "lastTrialPlayDate", "BSdXqptUKz");
        setIntField(term108970, term108970.getClass(), "playVsCount", 1908542558);
        setIntField(term108970, term108970.getClass(), "playSyncCount", -1081520792);
        setIntField(term108970, term108970.getClass(), "winCount", 1538397670);
        setIntField(term108970, term108970.getClass(), "helpCount", 1892710246);
        setIntField(term108970, term108970.getClass(), "comboCount", 1847407988);
        setLongField(term108970, term108970.getClass(), "totalDeluxscore", 6923295800018827960L);
        setLongField(term108970, term108970.getClass(), "totalBasicDeluxscore", -2861825709944291199L);
        setLongField(term108970, term108970.getClass(), "totalAdvancedDeluxscore", 8351145561182470563L);
        setLongField(term108970, term108970.getClass(), "totalExpertDeluxscore", -7104210321005753947L);
        setLongField(term108970, term108970.getClass(), "totalMasterDeluxscore", -6940797163068748652L);
        setLongField(term108970, term108970.getClass(), "totalReMasterDeluxscore", 1997269281468700420L);
        setIntField(term108970, term108970.getClass(), "totalSync", 15668872);
        setIntField(term108970, term108970.getClass(), "totalBasicSync", -1367697974);
        setIntField(term108970, term108970.getClass(), "totalAdvancedSync", 16297395);
        setIntField(term108970, term108970.getClass(), "totalExpertSync", 623171819);
        setIntField(term108970, term108970.getClass(), "totalMasterSync", 1066443567);
        setIntField(term108970, term108970.getClass(), "totalReMasterSync", 547908690);
        setLongField(term108970, term108970.getClass(), "totalAchievement", -7128006109272835548L);
        setLongField(term108970, term108970.getClass(), "totalBasicAchievement", -1369792038073493476L);
        setLongField(term108970, term108970.getClass(), "totalAdvancedAchievement", 5718274845956420880L);
        setLongField(term108970, term108970.getClass(), "totalExpertAchievement", 6700769086218292078L);
        setLongField(term108970, term108970.getClass(), "totalMasterAchievement", -5284499986511698301L);
        setLongField(term108970, term108970.getClass(), "totalReMasterAchievement", -8886870795876891550L);
        setLongField(term108970, term108970.getClass(), "playerOldRating", 4714001757937272987L);
        setLongField(term108970, term108970.getClass(), "playerNewRating", 4834376760880884583L);
        setIntField(term108970, term108970.getClass(), "banState", -378543345);
        setLongField(term108970, term108970.getClass(), "dateTime", -6570219387007034075L);
        setField(term108968, term108968.getClass(), "user", term108970);
        setIntField(term108968, term108968.getClass(), "rate", -2144696087);
        setIntField(term108968, term108968.getClass(), "maxRate", -1629969931);
        setIntField(term108968, term108968.getClass(), "classValue", -1274836853);
        setIntField(term108968, term108968.getClass(), "maxClassValue", -757528574);
        setIntField(term108968, term108968.getClass(), "totalWinNum", 673141075);
        setIntField(term108968, term108968.getClass(), "totalLoseNum", -1755544337);
        setIntField(term108968, term108968.getClass(), "maxWinNum", -1445578997);
        setIntField(term108968, term108968.getClass(), "maxLoseNum", 830228887);
        setIntField(term108968, term108968.getClass(), "winNum", -903090832);
        setIntField(term108968, term108968.getClass(), "loseNum", -1760776056);
        setIntField(term108968, term108968.getClass(), "npcTotalWinNum", 83069489);
        setIntField(term108968, term108968.getClass(), "npcTotalLoseNum", 2053017168);
        setIntField(term108968, term108968.getClass(), "npcMaxWinNum", -1780206644);
        setIntField(term108968, term108968.getClass(), "npcMaxLoseNum", 507003800);
        setIntField(term108968, term108968.getClass(), "npcWinNum", 344294065);
        setIntField(term108968, term108968.getClass(), "npcLoseNum", 1193234010);
        term109335 = new Integer(988470366);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserUdemae");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term109335;
        callMethod(klass, "setMaxClassValue", argTypes, term108968, args);
    }

};


