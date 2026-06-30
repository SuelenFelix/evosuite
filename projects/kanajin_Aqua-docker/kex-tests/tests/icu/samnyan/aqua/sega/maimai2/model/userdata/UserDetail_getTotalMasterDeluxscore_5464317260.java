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

public class UserDetail_getTotalMasterDeluxscore_5464317260 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term229024;

    public UserDetail_getTotalMasterDeluxscore_5464317260() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term229028 = new Long(-4058686252500969842L);
        Integer term229091 = new Integer(-808971480);
        Integer term229093 = new Integer(534508972);
        Integer term229095 = new Integer(-301935716);
        Integer term229097 = new Integer(1701720681);
        Integer term229099 = new Integer(-378738380);
        Integer term229101 = new Integer(1984720770);
        ArrayList term229089 = new ArrayList();
        ((ArrayList) term229089).add(term229091);
        ((ArrayList) term229089).add(term229093);
        ((ArrayList) term229089).add(term229095);
        ((ArrayList) term229089).add(term229097);
        ((ArrayList) term229089).add(term229099);
        ((ArrayList) term229089).add(term229101);
        Integer term229107 = new Integer(-8765616);
        ArrayList term229105 = new ArrayList();
        ((ArrayList) term229105).add(term229107);
        term229024 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term229026 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term229042 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term229043 = newInstance(Class.forName("java.time.LocalDate"));
        Object term229047 = newInstance(Class.forName("java.time.LocalTime"));
        Object term229052 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term229053 = newInstance(Class.forName("java.time.LocalDate"));
        Object term229057 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term229024, term229024.getClass(), "id", -4049351845977809755L);
        setLongField(term229026, term229026.getClass(), "id", 5556350288489551656L);
        setField(term229026, term229026.getClass(), "extId", term229028);
        setField(term229026, term229026.getClass(), "luid", "gsDkRFcnWo");
        setIntField(term229043, term229043.getClass(), "year", 2020);
        setShortField(term229043, term229043.getClass(), "month", (short) 10);
        setShortField(term229043, term229043.getClass(), "day", (short) 22);
        setField(term229042, term229042.getClass(), "date", term229043);
        setByteField(term229047, term229047.getClass(), "hour", (byte) 22);
        setByteField(term229047, term229047.getClass(), "minute", (byte) 10);
        setByteField(term229047, term229047.getClass(), "second", (byte) 45);
        setIntField(term229047, term229047.getClass(), "nano", 397845140);
        setField(term229042, term229042.getClass(), "time", term229047);
        setField(term229026, term229026.getClass(), "registerTime", term229042);
        setIntField(term229053, term229053.getClass(), "year", 2023);
        setShortField(term229053, term229053.getClass(), "month", (short) 3);
        setShortField(term229053, term229053.getClass(), "day", (short) 11);
        setField(term229052, term229052.getClass(), "date", term229053);
        setByteField(term229057, term229057.getClass(), "hour", (byte) 2);
        setByteField(term229057, term229057.getClass(), "minute", (byte) 18);
        setByteField(term229057, term229057.getClass(), "second", (byte) 39);
        setIntField(term229057, term229057.getClass(), "nano", 701112042);
        setField(term229052, term229052.getClass(), "time", term229057);
        setField(term229026, term229026.getClass(), "accessTime", term229052);
        setField(term229024, term229024.getClass(), "card", term229026);
        setField(term229024, term229024.getClass(), "userName", "yQngLjjiPy");
        setIntField(term229024, term229024.getClass(), "isNetMember", -968433681);
        setIntField(term229024, term229024.getClass(), "iconId", 905327545);
        setIntField(term229024, term229024.getClass(), "plateId", 1664191791);
        setIntField(term229024, term229024.getClass(), "titleId", -427560957);
        setIntField(term229024, term229024.getClass(), "partnerId", -581810177);
        setIntField(term229024, term229024.getClass(), "frameId", -285538295);
        setIntField(term229024, term229024.getClass(), "selectMapId", -901566153);
        setIntField(term229024, term229024.getClass(), "totalAwake", -1797034561);
        setIntField(term229024, term229024.getClass(), "gradeRating", -258947595);
        setIntField(term229024, term229024.getClass(), "musicRating", 1492766673);
        setIntField(term229024, term229024.getClass(), "playerRating", 768722873);
        setIntField(term229024, term229024.getClass(), "highestRating", 1881997045);
        setIntField(term229024, term229024.getClass(), "gradeRank", -208521759);
        setIntField(term229024, term229024.getClass(), "classRank", -1398952792);
        setIntField(term229024, term229024.getClass(), "courseRank", 207531746);
        setField(term229024, term229024.getClass(), "charaSlot", term229089);
        setField(term229024, term229024.getClass(), "charaLockSlot", term229105);
        setLongField(term229024, term229024.getClass(), "contentBit", -4284673412269868116L);
        setIntField(term229024, term229024.getClass(), "playCount", -898437128);
        setField(term229024, term229024.getClass(), "eventWatchedDate", "UrfjRKtIoT");
        setField(term229024, term229024.getClass(), "lastGameId", "vgahNbDKFu");
        setField(term229024, term229024.getClass(), "lastRomVersion", "jwGtShAOZR");
        setField(term229024, term229024.getClass(), "lastDataVersion", "HqxxvASIJq");
        setField(term229024, term229024.getClass(), "lastLoginDate", "MBJxaagZhg");
        setField(term229024, term229024.getClass(), "lastPlayDate", "cpHleFahfl");
        setIntField(term229024, term229024.getClass(), "lastPlayCredit", 1644653752);
        setIntField(term229024, term229024.getClass(), "lastPlayMode", 957395270);
        setIntField(term229024, term229024.getClass(), "lastPlaceId", -1969074333);
        setField(term229024, term229024.getClass(), "lastPlaceName", "fWZbsaquDq");
        setIntField(term229024, term229024.getClass(), "lastAllNetId", 1826327602);
        setIntField(term229024, term229024.getClass(), "lastRegionId", 374724967);
        setField(term229024, term229024.getClass(), "lastRegionName", "HZUfvLLZWl");
        setField(term229024, term229024.getClass(), "lastClientId", "uRtTKxfUmc");
        setField(term229024, term229024.getClass(), "lastCountryCode", "iMwYcIBemV");
        setIntField(term229024, term229024.getClass(), "lastSelectEMoney", 973041410);
        setIntField(term229024, term229024.getClass(), "lastSelectTicket", -1310460501);
        setIntField(term229024, term229024.getClass(), "lastSelectCourse", 1679642951);
        setIntField(term229024, term229024.getClass(), "lastCountCourse", 1302045483);
        setField(term229024, term229024.getClass(), "firstGameId", "IsEKnDPoFO");
        setField(term229024, term229024.getClass(), "firstRomVersion", "LwUrUwnvds");
        setField(term229024, term229024.getClass(), "firstDataVersion", "sRQPBAZKAb");
        setField(term229024, term229024.getClass(), "firstPlayDate", "KgmTgRsDwa");
        setField(term229024, term229024.getClass(), "compatibleCmVersion", "tjdFdntraI");
        setField(term229024, term229024.getClass(), "dailyBonusDate", "PWTZROlgso");
        setField(term229024, term229024.getClass(), "dailyCourseBonusDate", "FTKNQGShBg");
        setField(term229024, term229024.getClass(), "lastPairLoginDate", "irfiORDZdO");
        setField(term229024, term229024.getClass(), "lastTrialPlayDate", "gXGEyEhyUf");
        setIntField(term229024, term229024.getClass(), "playVsCount", 235493269);
        setIntField(term229024, term229024.getClass(), "playSyncCount", -1369863592);
        setIntField(term229024, term229024.getClass(), "winCount", 837333114);
        setIntField(term229024, term229024.getClass(), "helpCount", -1247356641);
        setIntField(term229024, term229024.getClass(), "comboCount", 1915680547);
        setLongField(term229024, term229024.getClass(), "totalDeluxscore", -4431594244474371652L);
        setLongField(term229024, term229024.getClass(), "totalBasicDeluxscore", 7061998293449035472L);
        setLongField(term229024, term229024.getClass(), "totalAdvancedDeluxscore", -710516859478126305L);
        setLongField(term229024, term229024.getClass(), "totalExpertDeluxscore", 3439220637284129151L);
        setLongField(term229024, term229024.getClass(), "totalMasterDeluxscore", -7062832304045233672L);
        setLongField(term229024, term229024.getClass(), "totalReMasterDeluxscore", -2970231946983830807L);
        setIntField(term229024, term229024.getClass(), "totalSync", 417717738);
        setIntField(term229024, term229024.getClass(), "totalBasicSync", 216138319);
        setIntField(term229024, term229024.getClass(), "totalAdvancedSync", 242714390);
        setIntField(term229024, term229024.getClass(), "totalExpertSync", 811289212);
        setIntField(term229024, term229024.getClass(), "totalMasterSync", 700677049);
        setIntField(term229024, term229024.getClass(), "totalReMasterSync", -36401038);
        setLongField(term229024, term229024.getClass(), "totalAchievement", 2308033960283885298L);
        setLongField(term229024, term229024.getClass(), "totalBasicAchievement", -1485620458269241848L);
        setLongField(term229024, term229024.getClass(), "totalAdvancedAchievement", -3746020777641223593L);
        setLongField(term229024, term229024.getClass(), "totalExpertAchievement", -6290696433519340064L);
        setLongField(term229024, term229024.getClass(), "totalMasterAchievement", -3549201925417898505L);
        setLongField(term229024, term229024.getClass(), "totalReMasterAchievement", 2212942126645094920L);
        setLongField(term229024, term229024.getClass(), "playerOldRating", 8571899324184902990L);
        setLongField(term229024, term229024.getClass(), "playerNewRating", 108856595308836712L);
        setIntField(term229024, term229024.getClass(), "banState", 1242416043);
        setLongField(term229024, term229024.getClass(), "dateTime", -5963342408779721243L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalMasterDeluxscore", argTypes, term229024, args);
    }

};


