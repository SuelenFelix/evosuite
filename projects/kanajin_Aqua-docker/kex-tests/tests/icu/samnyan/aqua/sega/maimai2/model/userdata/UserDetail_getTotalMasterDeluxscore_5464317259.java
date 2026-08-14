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

public class UserDetail_getTotalMasterDeluxscore_5464317259 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term228969;

    public UserDetail_getTotalMasterDeluxscore_5464317259() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term228973 = new Long(-4058686252500969842L);
        Integer term229036 = new Integer(-808971480);
        Integer term229038 = new Integer(534508972);
        Integer term229040 = new Integer(-301935716);
        Integer term229042 = new Integer(1701720681);
        Integer term229044 = new Integer(-378738380);
        Integer term229046 = new Integer(1984720770);
        ArrayList term229034 = new ArrayList();
        ((ArrayList) term229034).add(term229036);
        ((ArrayList) term229034).add(term229038);
        ((ArrayList) term229034).add(term229040);
        ((ArrayList) term229034).add(term229042);
        ((ArrayList) term229034).add(term229044);
        ((ArrayList) term229034).add(term229046);
        Integer term229052 = new Integer(-8765616);
        ArrayList term229050 = new ArrayList();
        ((ArrayList) term229050).add(term229052);
        term228969 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term228971 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term228987 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term228988 = newInstance(Class.forName("java.time.LocalDate"));
        Object term228992 = newInstance(Class.forName("java.time.LocalTime"));
        Object term228997 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term228998 = newInstance(Class.forName("java.time.LocalDate"));
        Object term229002 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term228969, term228969.getClass(), "id", -4049351845977809755L);
        setLongField(term228971, term228971.getClass(), "id", 5556350288489551656L);
        setField(term228971, term228971.getClass(), "extId", term228973);
        setField(term228971, term228971.getClass(), "luid", "gsDkRFcnWo");
        setIntField(term228988, term228988.getClass(), "year", 2020);
        setShortField(term228988, term228988.getClass(), "month", (short) 10);
        setShortField(term228988, term228988.getClass(), "day", (short) 22);
        setField(term228987, term228987.getClass(), "date", term228988);
        setByteField(term228992, term228992.getClass(), "hour", (byte) 22);
        setByteField(term228992, term228992.getClass(), "minute", (byte) 10);
        setByteField(term228992, term228992.getClass(), "second", (byte) 45);
        setIntField(term228992, term228992.getClass(), "nano", 397845140);
        setField(term228987, term228987.getClass(), "time", term228992);
        setField(term228971, term228971.getClass(), "registerTime", term228987);
        setIntField(term228998, term228998.getClass(), "year", 2023);
        setShortField(term228998, term228998.getClass(), "month", (short) 3);
        setShortField(term228998, term228998.getClass(), "day", (short) 11);
        setField(term228997, term228997.getClass(), "date", term228998);
        setByteField(term229002, term229002.getClass(), "hour", (byte) 2);
        setByteField(term229002, term229002.getClass(), "minute", (byte) 18);
        setByteField(term229002, term229002.getClass(), "second", (byte) 39);
        setIntField(term229002, term229002.getClass(), "nano", 701112042);
        setField(term228997, term228997.getClass(), "time", term229002);
        setField(term228971, term228971.getClass(), "accessTime", term228997);
        setField(term228969, term228969.getClass(), "card", term228971);
        setField(term228969, term228969.getClass(), "userName", "yQngLjjiPy");
        setIntField(term228969, term228969.getClass(), "isNetMember", -968433681);
        setIntField(term228969, term228969.getClass(), "iconId", 905327545);
        setIntField(term228969, term228969.getClass(), "plateId", 1664191791);
        setIntField(term228969, term228969.getClass(), "titleId", -427560957);
        setIntField(term228969, term228969.getClass(), "partnerId", -581810177);
        setIntField(term228969, term228969.getClass(), "frameId", -285538295);
        setIntField(term228969, term228969.getClass(), "selectMapId", -901566153);
        setIntField(term228969, term228969.getClass(), "totalAwake", -1797034561);
        setIntField(term228969, term228969.getClass(), "gradeRating", -258947595);
        setIntField(term228969, term228969.getClass(), "musicRating", 1492766673);
        setIntField(term228969, term228969.getClass(), "playerRating", 768722873);
        setIntField(term228969, term228969.getClass(), "highestRating", 1881997045);
        setIntField(term228969, term228969.getClass(), "gradeRank", -208521759);
        setIntField(term228969, term228969.getClass(), "classRank", -1398952792);
        setIntField(term228969, term228969.getClass(), "courseRank", 207531746);
        setField(term228969, term228969.getClass(), "charaSlot", term229034);
        setField(term228969, term228969.getClass(), "charaLockSlot", term229050);
        setLongField(term228969, term228969.getClass(), "contentBit", -4284673412269868116L);
        setIntField(term228969, term228969.getClass(), "playCount", -898437128);
        setField(term228969, term228969.getClass(), "eventWatchedDate", "UrfjRKtIoT");
        setField(term228969, term228969.getClass(), "lastGameId", "vgahNbDKFu");
        setField(term228969, term228969.getClass(), "lastRomVersion", "jwGtShAOZR");
        setField(term228969, term228969.getClass(), "lastDataVersion", "HqxxvASIJq");
        setField(term228969, term228969.getClass(), "lastLoginDate", "MBJxaagZhg");
        setField(term228969, term228969.getClass(), "lastPlayDate", "cpHleFahfl");
        setIntField(term228969, term228969.getClass(), "lastPlayCredit", 1644653752);
        setIntField(term228969, term228969.getClass(), "lastPlayMode", 957395270);
        setIntField(term228969, term228969.getClass(), "lastPlaceId", -1969074333);
        setField(term228969, term228969.getClass(), "lastPlaceName", "fWZbsaquDq");
        setIntField(term228969, term228969.getClass(), "lastAllNetId", 1826327602);
        setIntField(term228969, term228969.getClass(), "lastRegionId", 374724967);
        setField(term228969, term228969.getClass(), "lastRegionName", "HZUfvLLZWl");
        setField(term228969, term228969.getClass(), "lastClientId", "uRtTKxfUmc");
        setField(term228969, term228969.getClass(), "lastCountryCode", "iMwYcIBemV");
        setIntField(term228969, term228969.getClass(), "lastSelectEMoney", 973041410);
        setIntField(term228969, term228969.getClass(), "lastSelectTicket", -1310460501);
        setIntField(term228969, term228969.getClass(), "lastSelectCourse", 1679642951);
        setIntField(term228969, term228969.getClass(), "lastCountCourse", 1302045483);
        setField(term228969, term228969.getClass(), "firstGameId", "IsEKnDPoFO");
        setField(term228969, term228969.getClass(), "firstRomVersion", "LwUrUwnvds");
        setField(term228969, term228969.getClass(), "firstDataVersion", "sRQPBAZKAb");
        setField(term228969, term228969.getClass(), "firstPlayDate", "KgmTgRsDwa");
        setField(term228969, term228969.getClass(), "compatibleCmVersion", "tjdFdntraI");
        setField(term228969, term228969.getClass(), "dailyBonusDate", "PWTZROlgso");
        setField(term228969, term228969.getClass(), "dailyCourseBonusDate", "FTKNQGShBg");
        setField(term228969, term228969.getClass(), "lastPairLoginDate", "irfiORDZdO");
        setField(term228969, term228969.getClass(), "lastTrialPlayDate", "gXGEyEhyUf");
        setIntField(term228969, term228969.getClass(), "playVsCount", 235493269);
        setIntField(term228969, term228969.getClass(), "playSyncCount", -1369863592);
        setIntField(term228969, term228969.getClass(), "winCount", 837333114);
        setIntField(term228969, term228969.getClass(), "helpCount", -1247356641);
        setIntField(term228969, term228969.getClass(), "comboCount", 1915680547);
        setLongField(term228969, term228969.getClass(), "totalDeluxscore", -4431594244474371652L);
        setLongField(term228969, term228969.getClass(), "totalBasicDeluxscore", 7061998293449035472L);
        setLongField(term228969, term228969.getClass(), "totalAdvancedDeluxscore", -710516859478126305L);
        setLongField(term228969, term228969.getClass(), "totalExpertDeluxscore", 3439220637284129151L);
        setLongField(term228969, term228969.getClass(), "totalMasterDeluxscore", -7062832304045233672L);
        setLongField(term228969, term228969.getClass(), "totalReMasterDeluxscore", -2970231946983830807L);
        setIntField(term228969, term228969.getClass(), "totalSync", 417717738);
        setIntField(term228969, term228969.getClass(), "totalBasicSync", 216138319);
        setIntField(term228969, term228969.getClass(), "totalAdvancedSync", 242714390);
        setIntField(term228969, term228969.getClass(), "totalExpertSync", 811289212);
        setIntField(term228969, term228969.getClass(), "totalMasterSync", 700677049);
        setIntField(term228969, term228969.getClass(), "totalReMasterSync", -36401038);
        setLongField(term228969, term228969.getClass(), "totalAchievement", 2308033960283885298L);
        setLongField(term228969, term228969.getClass(), "totalBasicAchievement", -1485620458269241848L);
        setLongField(term228969, term228969.getClass(), "totalAdvancedAchievement", -3746020777641223593L);
        setLongField(term228969, term228969.getClass(), "totalExpertAchievement", -6290696433519340064L);
        setLongField(term228969, term228969.getClass(), "totalMasterAchievement", -3549201925417898505L);
        setLongField(term228969, term228969.getClass(), "totalReMasterAchievement", 2212942126645094920L);
        setLongField(term228969, term228969.getClass(), "playerOldRating", 8571899324184902990L);
        setLongField(term228969, term228969.getClass(), "playerNewRating", 108856595308836712L);
        setIntField(term228969, term228969.getClass(), "banState", 1242416043);
        setLongField(term228969, term228969.getClass(), "dateTime", -5963342408779721243L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalMasterDeluxscore", argTypes, term228969, args);
    }

};


