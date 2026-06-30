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

public class UserUdemae_getTotalWinNum_7024949347 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term98424;

    public UserUdemae_getTotalWinNum_7024949347() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term98430 = new Long(-7884871963229073324L);
        Integer term98493 = new Integer(621910137);
        Integer term98495 = new Integer(241533020);
        Integer term98497 = new Integer(2081679151);
        Integer term98499 = new Integer(-1030167086);
        Integer term98501 = new Integer(-434230943);
        Integer term98503 = new Integer(698633875);
        ArrayList term98491 = new ArrayList();
        ((ArrayList) term98491).add(term98493);
        ((ArrayList) term98491).add(term98495);
        ((ArrayList) term98491).add(term98497);
        ((ArrayList) term98491).add(term98499);
        ((ArrayList) term98491).add(term98501);
        ((ArrayList) term98491).add(term98503);
        Integer term98509 = new Integer(548468113);
        Integer term98511 = new Integer(1701819905);
        Integer term98513 = new Integer(1721418943);
        ArrayList term98507 = new ArrayList();
        ((ArrayList) term98507).add(term98509);
        ((ArrayList) term98507).add(term98511);
        ((ArrayList) term98507).add(term98513);
        term98424 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserUdemae"));
        Object term98426 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term98428 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term98444 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term98445 = newInstance(Class.forName("java.time.LocalDate"));
        Object term98449 = newInstance(Class.forName("java.time.LocalTime"));
        Object term98454 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term98455 = newInstance(Class.forName("java.time.LocalDate"));
        Object term98459 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term98424, term98424.getClass(), "id", 6336043600941119731L);
        setLongField(term98426, term98426.getClass(), "id", 5597778474359417291L);
        setLongField(term98428, term98428.getClass(), "id", -7785852591389112331L);
        setField(term98428, term98428.getClass(), "extId", term98430);
        setField(term98428, term98428.getClass(), "luid", "SszlMxumKX");
        setIntField(term98445, term98445.getClass(), "year", 2014);
        setShortField(term98445, term98445.getClass(), "month", (short) 5);
        setShortField(term98445, term98445.getClass(), "day", (short) 18);
        setField(term98444, term98444.getClass(), "date", term98445);
        setByteField(term98449, term98449.getClass(), "hour", (byte) 19);
        setByteField(term98449, term98449.getClass(), "minute", (byte) 25);
        setByteField(term98449, term98449.getClass(), "second", (byte) 8);
        setIntField(term98449, term98449.getClass(), "nano", 217186771);
        setField(term98444, term98444.getClass(), "time", term98449);
        setField(term98428, term98428.getClass(), "registerTime", term98444);
        setIntField(term98455, term98455.getClass(), "year", 2023);
        setShortField(term98455, term98455.getClass(), "month", (short) 2);
        setShortField(term98455, term98455.getClass(), "day", (short) 27);
        setField(term98454, term98454.getClass(), "date", term98455);
        setByteField(term98459, term98459.getClass(), "hour", (byte) 5);
        setByteField(term98459, term98459.getClass(), "minute", (byte) 50);
        setByteField(term98459, term98459.getClass(), "second", (byte) 50);
        setIntField(term98459, term98459.getClass(), "nano", 528521692);
        setField(term98454, term98454.getClass(), "time", term98459);
        setField(term98428, term98428.getClass(), "accessTime", term98454);
        setField(term98426, term98426.getClass(), "card", term98428);
        setField(term98426, term98426.getClass(), "userName", "FhbYnMXUCk");
        setIntField(term98426, term98426.getClass(), "isNetMember", -2135129588);
        setIntField(term98426, term98426.getClass(), "iconId", -1453667786);
        setIntField(term98426, term98426.getClass(), "plateId", 390534071);
        setIntField(term98426, term98426.getClass(), "titleId", 134001300);
        setIntField(term98426, term98426.getClass(), "partnerId", -1533628114);
        setIntField(term98426, term98426.getClass(), "frameId", 886396590);
        setIntField(term98426, term98426.getClass(), "selectMapId", -1864639476);
        setIntField(term98426, term98426.getClass(), "totalAwake", 233887874);
        setIntField(term98426, term98426.getClass(), "gradeRating", 1421452259);
        setIntField(term98426, term98426.getClass(), "musicRating", 2051816737);
        setIntField(term98426, term98426.getClass(), "playerRating", 191145214);
        setIntField(term98426, term98426.getClass(), "highestRating", 597423188);
        setIntField(term98426, term98426.getClass(), "gradeRank", 170448789);
        setIntField(term98426, term98426.getClass(), "classRank", -105784895);
        setIntField(term98426, term98426.getClass(), "courseRank", -190866786);
        setField(term98426, term98426.getClass(), "charaSlot", term98491);
        setField(term98426, term98426.getClass(), "charaLockSlot", term98507);
        setLongField(term98426, term98426.getClass(), "contentBit", -8920882081423821401L);
        setIntField(term98426, term98426.getClass(), "playCount", -1192542298);
        setField(term98426, term98426.getClass(), "eventWatchedDate", "MMUzzZjmHQ");
        setField(term98426, term98426.getClass(), "lastGameId", "NSPCJaizlC");
        setField(term98426, term98426.getClass(), "lastRomVersion", "JoFUYaQQtF");
        setField(term98426, term98426.getClass(), "lastDataVersion", "SAKoORlZVA");
        setField(term98426, term98426.getClass(), "lastLoginDate", "HhYVbmMRiN");
        setField(term98426, term98426.getClass(), "lastPlayDate", "UYEVBNEKyf");
        setIntField(term98426, term98426.getClass(), "lastPlayCredit", 1742896562);
        setIntField(term98426, term98426.getClass(), "lastPlayMode", -1205180837);
        setIntField(term98426, term98426.getClass(), "lastPlaceId", 1782497174);
        setField(term98426, term98426.getClass(), "lastPlaceName", "EXduYtKPaE");
        setIntField(term98426, term98426.getClass(), "lastAllNetId", 354412864);
        setIntField(term98426, term98426.getClass(), "lastRegionId", -1323183254);
        setField(term98426, term98426.getClass(), "lastRegionName", "UVMEqArKpY");
        setField(term98426, term98426.getClass(), "lastClientId", "fLbDziHEHK");
        setField(term98426, term98426.getClass(), "lastCountryCode", "lzRecPiQNU");
        setIntField(term98426, term98426.getClass(), "lastSelectEMoney", 366309576);
        setIntField(term98426, term98426.getClass(), "lastSelectTicket", 202085518);
        setIntField(term98426, term98426.getClass(), "lastSelectCourse", -527355218);
        setIntField(term98426, term98426.getClass(), "lastCountCourse", 1946726839);
        setField(term98426, term98426.getClass(), "firstGameId", "CVfKmjoLKq");
        setField(term98426, term98426.getClass(), "firstRomVersion", "zvqciKTUAl");
        setField(term98426, term98426.getClass(), "firstDataVersion", "hvNiDuvOYJ");
        setField(term98426, term98426.getClass(), "firstPlayDate", "unTIyPhfcW");
        setField(term98426, term98426.getClass(), "compatibleCmVersion", "McPsgamHga");
        setField(term98426, term98426.getClass(), "dailyBonusDate", "wiqxbqDkJU");
        setField(term98426, term98426.getClass(), "dailyCourseBonusDate", "psNunGzDVf");
        setField(term98426, term98426.getClass(), "lastPairLoginDate", "YFOetAfnRt");
        setField(term98426, term98426.getClass(), "lastTrialPlayDate", "VgCCefhtcT");
        setIntField(term98426, term98426.getClass(), "playVsCount", 185844905);
        setIntField(term98426, term98426.getClass(), "playSyncCount", 1821594065);
        setIntField(term98426, term98426.getClass(), "winCount", 888820496);
        setIntField(term98426, term98426.getClass(), "helpCount", 1745066397);
        setIntField(term98426, term98426.getClass(), "comboCount", 47561810);
        setLongField(term98426, term98426.getClass(), "totalDeluxscore", 6575164463340577898L);
        setLongField(term98426, term98426.getClass(), "totalBasicDeluxscore", 8860147662823251488L);
        setLongField(term98426, term98426.getClass(), "totalAdvancedDeluxscore", 6235472569901138913L);
        setLongField(term98426, term98426.getClass(), "totalExpertDeluxscore", -1732771393859471811L);
        setLongField(term98426, term98426.getClass(), "totalMasterDeluxscore", 376617836260009696L);
        setLongField(term98426, term98426.getClass(), "totalReMasterDeluxscore", 7959584504878946737L);
        setIntField(term98426, term98426.getClass(), "totalSync", -1708484817);
        setIntField(term98426, term98426.getClass(), "totalBasicSync", 574829358);
        setIntField(term98426, term98426.getClass(), "totalAdvancedSync", 179028147);
        setIntField(term98426, term98426.getClass(), "totalExpertSync", -1077334778);
        setIntField(term98426, term98426.getClass(), "totalMasterSync", -845040092);
        setIntField(term98426, term98426.getClass(), "totalReMasterSync", -1659873585);
        setLongField(term98426, term98426.getClass(), "totalAchievement", -46420887778055199L);
        setLongField(term98426, term98426.getClass(), "totalBasicAchievement", 7667843194609869185L);
        setLongField(term98426, term98426.getClass(), "totalAdvancedAchievement", -6200837024273756516L);
        setLongField(term98426, term98426.getClass(), "totalExpertAchievement", 9046663610727775978L);
        setLongField(term98426, term98426.getClass(), "totalMasterAchievement", 6115702104023062411L);
        setLongField(term98426, term98426.getClass(), "totalReMasterAchievement", -7393121202464432000L);
        setLongField(term98426, term98426.getClass(), "playerOldRating", -2126569881795166293L);
        setLongField(term98426, term98426.getClass(), "playerNewRating", 3910222794831758746L);
        setIntField(term98426, term98426.getClass(), "banState", 1881072097);
        setLongField(term98426, term98426.getClass(), "dateTime", -9065147632457577345L);
        setField(term98424, term98424.getClass(), "user", term98426);
        setIntField(term98424, term98424.getClass(), "rate", 1677550181);
        setIntField(term98424, term98424.getClass(), "maxRate", 1710291513);
        setIntField(term98424, term98424.getClass(), "classValue", -464025782);
        setIntField(term98424, term98424.getClass(), "maxClassValue", -1392716182);
        setIntField(term98424, term98424.getClass(), "totalWinNum", -251208414);
        setIntField(term98424, term98424.getClass(), "totalLoseNum", 2058785706);
        setIntField(term98424, term98424.getClass(), "maxWinNum", -1996745891);
        setIntField(term98424, term98424.getClass(), "maxLoseNum", 615988012);
        setIntField(term98424, term98424.getClass(), "winNum", -2129409800);
        setIntField(term98424, term98424.getClass(), "loseNum", -522844088);
        setIntField(term98424, term98424.getClass(), "npcTotalWinNum", 1867429949);
        setIntField(term98424, term98424.getClass(), "npcTotalLoseNum", 1323279910);
        setIntField(term98424, term98424.getClass(), "npcMaxWinNum", 1526554078);
        setIntField(term98424, term98424.getClass(), "npcMaxLoseNum", 119754400);
        setIntField(term98424, term98424.getClass(), "npcWinNum", -1149597715);
        setIntField(term98424, term98424.getClass(), "npcLoseNum", 1709518907);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserUdemae");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalWinNum", argTypes, term98424, args);
    }

};


