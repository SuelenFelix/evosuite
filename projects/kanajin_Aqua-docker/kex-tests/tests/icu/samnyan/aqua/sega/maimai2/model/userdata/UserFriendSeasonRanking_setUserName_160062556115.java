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

public class UserFriendSeasonRanking_setUserName_160062556115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24394;

    public UserFriendSeasonRanking_setUserName_160062556115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term24400 = new Long(-2068172595987555756L);
        Integer term24463 = new Integer(1094107751);
        Integer term24465 = new Integer(844222656);
        Integer term24467 = new Integer(-18216811);
        Integer term24469 = new Integer(-1813280137);
        Integer term24471 = new Integer(719656595);
        Integer term24473 = new Integer(-1516995753);
        ArrayList term24461 = new ArrayList();
        ((ArrayList) term24461).add(term24463);
        ((ArrayList) term24461).add(term24465);
        ((ArrayList) term24461).add(term24467);
        ((ArrayList) term24461).add(term24469);
        ((ArrayList) term24461).add(term24471);
        ((ArrayList) term24461).add(term24473);
        Integer term24479 = new Integer(-390501023);
        Integer term24481 = new Integer(-1667482829);
        Integer term24483 = new Integer(1116576792);
        Integer term24485 = new Integer(-942194446);
        ArrayList term24477 = new ArrayList();
        ((ArrayList) term24477).add(term24479);
        ((ArrayList) term24477).add(term24481);
        ((ArrayList) term24477).add(term24483);
        ((ArrayList) term24477).add(term24485);
        term24394 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserFriendSeasonRanking"));
        Object term24396 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term24398 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term24414 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term24415 = newInstance(Class.forName("java.time.LocalDate"));
        Object term24419 = newInstance(Class.forName("java.time.LocalTime"));
        Object term24424 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term24425 = newInstance(Class.forName("java.time.LocalDate"));
        Object term24429 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term24394, term24394.getClass(), "id", 4369503082568083627L);
        setLongField(term24396, term24396.getClass(), "id", -1148001666040486410L);
        setLongField(term24398, term24398.getClass(), "id", -2097210721190032076L);
        setField(term24398, term24398.getClass(), "extId", term24400);
        setField(term24398, term24398.getClass(), "luid", "CuWebzZQjZ");
        setIntField(term24415, term24415.getClass(), "year", 2021);
        setShortField(term24415, term24415.getClass(), "month", (short) 3);
        setShortField(term24415, term24415.getClass(), "day", (short) 13);
        setField(term24414, term24414.getClass(), "date", term24415);
        setByteField(term24419, term24419.getClass(), "hour", (byte) 6);
        setByteField(term24419, term24419.getClass(), "minute", (byte) 25);
        setByteField(term24419, term24419.getClass(), "second", (byte) 42);
        setIntField(term24419, term24419.getClass(), "nano", 282924199);
        setField(term24414, term24414.getClass(), "time", term24419);
        setField(term24398, term24398.getClass(), "registerTime", term24414);
        setIntField(term24425, term24425.getClass(), "year", 2020);
        setShortField(term24425, term24425.getClass(), "month", (short) 10);
        setShortField(term24425, term24425.getClass(), "day", (short) 25);
        setField(term24424, term24424.getClass(), "date", term24425);
        setByteField(term24429, term24429.getClass(), "hour", (byte) 18);
        setByteField(term24429, term24429.getClass(), "minute", (byte) 22);
        setByteField(term24429, term24429.getClass(), "second", (byte) 30);
        setIntField(term24429, term24429.getClass(), "nano", 948592965);
        setField(term24424, term24424.getClass(), "time", term24429);
        setField(term24398, term24398.getClass(), "accessTime", term24424);
        setField(term24396, term24396.getClass(), "card", term24398);
        setField(term24396, term24396.getClass(), "userName", "wRVaaJxKYI");
        setIntField(term24396, term24396.getClass(), "isNetMember", -1518971561);
        setIntField(term24396, term24396.getClass(), "iconId", 1513663171);
        setIntField(term24396, term24396.getClass(), "plateId", 1527034193);
        setIntField(term24396, term24396.getClass(), "titleId", 1309545946);
        setIntField(term24396, term24396.getClass(), "partnerId", -1457812682);
        setIntField(term24396, term24396.getClass(), "frameId", -161850441);
        setIntField(term24396, term24396.getClass(), "selectMapId", 1486351894);
        setIntField(term24396, term24396.getClass(), "totalAwake", 1352463113);
        setIntField(term24396, term24396.getClass(), "gradeRating", 897269648);
        setIntField(term24396, term24396.getClass(), "musicRating", -1020664075);
        setIntField(term24396, term24396.getClass(), "playerRating", -1412100145);
        setIntField(term24396, term24396.getClass(), "highestRating", -1702355599);
        setIntField(term24396, term24396.getClass(), "gradeRank", -1477091217);
        setIntField(term24396, term24396.getClass(), "classRank", 2023226154);
        setIntField(term24396, term24396.getClass(), "courseRank", 2111611214);
        setField(term24396, term24396.getClass(), "charaSlot", term24461);
        setField(term24396, term24396.getClass(), "charaLockSlot", term24477);
        setLongField(term24396, term24396.getClass(), "contentBit", -3022442322233520981L);
        setIntField(term24396, term24396.getClass(), "playCount", -2031129784);
        setField(term24396, term24396.getClass(), "eventWatchedDate", "yOQuJXRvOo");
        setField(term24396, term24396.getClass(), "lastGameId", "XmLHcnVsch");
        setField(term24396, term24396.getClass(), "lastRomVersion", "Yrvtdcltri");
        setField(term24396, term24396.getClass(), "lastDataVersion", "RxrsjXRVcT");
        setField(term24396, term24396.getClass(), "lastLoginDate", "cfRimmJxqA");
        setField(term24396, term24396.getClass(), "lastPlayDate", "oOnRVGqFmy");
        setIntField(term24396, term24396.getClass(), "lastPlayCredit", 251039122);
        setIntField(term24396, term24396.getClass(), "lastPlayMode", 459471826);
        setIntField(term24396, term24396.getClass(), "lastPlaceId", -1054011286);
        setField(term24396, term24396.getClass(), "lastPlaceName", "LaXzFIlWMk");
        setIntField(term24396, term24396.getClass(), "lastAllNetId", -1640361091);
        setIntField(term24396, term24396.getClass(), "lastRegionId", -1908164516);
        setField(term24396, term24396.getClass(), "lastRegionName", "GuVQjhBxma");
        setField(term24396, term24396.getClass(), "lastClientId", "WAVMPPbIfL");
        setField(term24396, term24396.getClass(), "lastCountryCode", "GISHLsgALf");
        setIntField(term24396, term24396.getClass(), "lastSelectEMoney", -1343269854);
        setIntField(term24396, term24396.getClass(), "lastSelectTicket", -731459309);
        setIntField(term24396, term24396.getClass(), "lastSelectCourse", -913468095);
        setIntField(term24396, term24396.getClass(), "lastCountCourse", 38489871);
        setField(term24396, term24396.getClass(), "firstGameId", "PVykkUSgBq");
        setField(term24396, term24396.getClass(), "firstRomVersion", "tnKbZaCsuj");
        setField(term24396, term24396.getClass(), "firstDataVersion", "ZFpcYBgLNC");
        setField(term24396, term24396.getClass(), "firstPlayDate", "VAGkRppBem");
        setField(term24396, term24396.getClass(), "compatibleCmVersion", "eKcEJRxNSu");
        setField(term24396, term24396.getClass(), "dailyBonusDate", "NTXQPWFYSA");
        setField(term24396, term24396.getClass(), "dailyCourseBonusDate", "fOuOhBpldm");
        setField(term24396, term24396.getClass(), "lastPairLoginDate", "qQQRKGPyIM");
        setField(term24396, term24396.getClass(), "lastTrialPlayDate", "lzcwhvjdFg");
        setIntField(term24396, term24396.getClass(), "playVsCount", -1667787735);
        setIntField(term24396, term24396.getClass(), "playSyncCount", 1841765799);
        setIntField(term24396, term24396.getClass(), "winCount", 72160200);
        setIntField(term24396, term24396.getClass(), "helpCount", -1870567623);
        setIntField(term24396, term24396.getClass(), "comboCount", -1442923471);
        setLongField(term24396, term24396.getClass(), "totalDeluxscore", -8735757853649335051L);
        setLongField(term24396, term24396.getClass(), "totalBasicDeluxscore", 7016651719770171901L);
        setLongField(term24396, term24396.getClass(), "totalAdvancedDeluxscore", 7777131569376571611L);
        setLongField(term24396, term24396.getClass(), "totalExpertDeluxscore", -2792969772767139843L);
        setLongField(term24396, term24396.getClass(), "totalMasterDeluxscore", 6313343355456678206L);
        setLongField(term24396, term24396.getClass(), "totalReMasterDeluxscore", -8901826621860118061L);
        setIntField(term24396, term24396.getClass(), "totalSync", -434247549);
        setIntField(term24396, term24396.getClass(), "totalBasicSync", 1246505552);
        setIntField(term24396, term24396.getClass(), "totalAdvancedSync", -1456497810);
        setIntField(term24396, term24396.getClass(), "totalExpertSync", 61954667);
        setIntField(term24396, term24396.getClass(), "totalMasterSync", -919022885);
        setIntField(term24396, term24396.getClass(), "totalReMasterSync", -1836286878);
        setLongField(term24396, term24396.getClass(), "totalAchievement", 2947576061864407618L);
        setLongField(term24396, term24396.getClass(), "totalBasicAchievement", 7265006047025305787L);
        setLongField(term24396, term24396.getClass(), "totalAdvancedAchievement", -3323049156110984575L);
        setLongField(term24396, term24396.getClass(), "totalExpertAchievement", -9079706905309751984L);
        setLongField(term24396, term24396.getClass(), "totalMasterAchievement", -2080067238602928154L);
        setLongField(term24396, term24396.getClass(), "totalReMasterAchievement", 8202413349907503373L);
        setLongField(term24396, term24396.getClass(), "playerOldRating", 4715419421865334491L);
        setLongField(term24396, term24396.getClass(), "playerNewRating", 6320559761926095887L);
        setIntField(term24396, term24396.getClass(), "banState", 276336694);
        setLongField(term24396, term24396.getClass(), "dateTime", 5067793047038594982L);
        setField(term24394, term24394.getClass(), "user", term24396);
        setIntField(term24394, term24394.getClass(), "seasonId", 1627938506);
        setIntField(term24394, term24394.getClass(), "point", 386284750);
        setIntField(term24394, term24394.getClass(), "rank", 906856023);
        setBooleanField(term24394, term24394.getClass(), "rewardGet", false);
        setField(term24394, term24394.getClass(), "userName", "dfzWTjcjnI");
        setField(term24394, term24394.getClass(), "recordDate", "bsnZXGEvFv");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserFriendSeasonRanking");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "osFrHWYeRy";
        callMethod(klass, "setUserName", argTypes, term24394, args);
    }

};


