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

public class UserFriendSeasonRanking_getRecordDate_7809506988 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19540;

    public UserFriendSeasonRanking_getRecordDate_7809506988() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term19546 = new Long(-6823727938421990489L);
        ArrayList term19607 = new ArrayList();
        Integer term19613 = new Integer(-851097944);
        Integer term19615 = new Integer(803925431);
        Integer term19617 = new Integer(76929641);
        Integer term19619 = new Integer(-2003192918);
        Integer term19621 = new Integer(-1362856620);
        Integer term19623 = new Integer(-1835839814);
        ArrayList term19611 = new ArrayList();
        ((ArrayList) term19611).add(term19613);
        ((ArrayList) term19611).add(term19615);
        ((ArrayList) term19611).add(term19617);
        ((ArrayList) term19611).add(term19619);
        ((ArrayList) term19611).add(term19621);
        ((ArrayList) term19611).add(term19623);
        term19540 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserFriendSeasonRanking"));
        Object term19542 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term19544 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term19560 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term19561 = newInstance(Class.forName("java.time.LocalDate"));
        Object term19565 = newInstance(Class.forName("java.time.LocalTime"));
        Object term19570 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term19571 = newInstance(Class.forName("java.time.LocalDate"));
        Object term19575 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term19540, term19540.getClass(), "id", 6921855906793748590L);
        setLongField(term19542, term19542.getClass(), "id", 7450182989722198450L);
        setLongField(term19544, term19544.getClass(), "id", 675601558105654203L);
        setField(term19544, term19544.getClass(), "extId", term19546);
        setField(term19544, term19544.getClass(), "luid", "mdxcgZwsaP");
        setIntField(term19561, term19561.getClass(), "year", 2018);
        setShortField(term19561, term19561.getClass(), "month", (short) 2);
        setShortField(term19561, term19561.getClass(), "day", (short) 14);
        setField(term19560, term19560.getClass(), "date", term19561);
        setByteField(term19565, term19565.getClass(), "hour", (byte) 2);
        setByteField(term19565, term19565.getClass(), "minute", (byte) 40);
        setByteField(term19565, term19565.getClass(), "second", (byte) 48);
        setIntField(term19565, term19565.getClass(), "nano", 371006728);
        setField(term19560, term19560.getClass(), "time", term19565);
        setField(term19544, term19544.getClass(), "registerTime", term19560);
        setIntField(term19571, term19571.getClass(), "year", 2025);
        setShortField(term19571, term19571.getClass(), "month", (short) 8);
        setShortField(term19571, term19571.getClass(), "day", (short) 22);
        setField(term19570, term19570.getClass(), "date", term19571);
        setByteField(term19575, term19575.getClass(), "hour", (byte) 6);
        setByteField(term19575, term19575.getClass(), "minute", (byte) 48);
        setByteField(term19575, term19575.getClass(), "second", (byte) 49);
        setIntField(term19575, term19575.getClass(), "nano", 46400229);
        setField(term19570, term19570.getClass(), "time", term19575);
        setField(term19544, term19544.getClass(), "accessTime", term19570);
        setField(term19542, term19542.getClass(), "card", term19544);
        setField(term19542, term19542.getClass(), "userName", "XildIRoZHG");
        setIntField(term19542, term19542.getClass(), "isNetMember", -2060284160);
        setIntField(term19542, term19542.getClass(), "iconId", -568450686);
        setIntField(term19542, term19542.getClass(), "plateId", 1314660281);
        setIntField(term19542, term19542.getClass(), "titleId", -126399768);
        setIntField(term19542, term19542.getClass(), "partnerId", 318982923);
        setIntField(term19542, term19542.getClass(), "frameId", -154210001);
        setIntField(term19542, term19542.getClass(), "selectMapId", 621910137);
        setIntField(term19542, term19542.getClass(), "totalAwake", 241533020);
        setIntField(term19542, term19542.getClass(), "gradeRating", 2081679151);
        setIntField(term19542, term19542.getClass(), "musicRating", -1030167086);
        setIntField(term19542, term19542.getClass(), "playerRating", -434230943);
        setIntField(term19542, term19542.getClass(), "highestRating", 698633875);
        setIntField(term19542, term19542.getClass(), "gradeRank", 548468113);
        setIntField(term19542, term19542.getClass(), "classRank", 1701819905);
        setIntField(term19542, term19542.getClass(), "courseRank", 1721418943);
        setField(term19542, term19542.getClass(), "charaSlot", term19607);
        setField(term19542, term19542.getClass(), "charaLockSlot", term19611);
        setLongField(term19542, term19542.getClass(), "contentBit", -6481933642917183045L);
        setIntField(term19542, term19542.getClass(), "playCount", -111082612);
        setField(term19542, term19542.getClass(), "eventWatchedDate", "lEcrFlxJXH");
        setField(term19542, term19542.getClass(), "lastGameId", "VNdDwXMYxR");
        setField(term19542, term19542.getClass(), "lastRomVersion", "bVbexZPmwW");
        setField(term19542, term19542.getClass(), "lastDataVersion", "tvxYdqiyGc");
        setField(term19542, term19542.getClass(), "lastLoginDate", "ZEXFoMSKeG");
        setField(term19542, term19542.getClass(), "lastPlayDate", "HvxahUfZcJ");
        setIntField(term19542, term19542.getClass(), "lastPlayCredit", 1253334988);
        setIntField(term19542, term19542.getClass(), "lastPlayMode", 1086709736);
        setIntField(term19542, term19542.getClass(), "lastPlaceId", -1606698075);
        setField(term19542, term19542.getClass(), "lastPlaceName", "WkLpmqoQxy");
        setIntField(term19542, term19542.getClass(), "lastAllNetId", 90996421);
        setIntField(term19542, term19542.getClass(), "lastRegionId", -1805802783);
        setField(term19542, term19542.getClass(), "lastRegionName", "XiNoscmYhd");
        setField(term19542, term19542.getClass(), "lastClientId", "asMqnMNrZp");
        setField(term19542, term19542.getClass(), "lastCountryCode", "pqFUMTCKJd");
        setIntField(term19542, term19542.getClass(), "lastSelectEMoney", -529831900);
        setIntField(term19542, term19542.getClass(), "lastSelectTicket", 1574493440);
        setIntField(term19542, term19542.getClass(), "lastSelectCourse", 1854694585);
        setIntField(term19542, term19542.getClass(), "lastCountCourse", -1260562836);
        setField(term19542, term19542.getClass(), "firstGameId", "PTEndmPMzk");
        setField(term19542, term19542.getClass(), "firstRomVersion", "aJQuCOCvZs");
        setField(term19542, term19542.getClass(), "firstDataVersion", "lHYNCJRiOv");
        setField(term19542, term19542.getClass(), "firstPlayDate", "QVLresHoaP");
        setField(term19542, term19542.getClass(), "compatibleCmVersion", "IbxeAMwLVt");
        setField(term19542, term19542.getClass(), "dailyBonusDate", "bShlAqoTmZ");
        setField(term19542, term19542.getClass(), "dailyCourseBonusDate", "nOKlKlNhtU");
        setField(term19542, term19542.getClass(), "lastPairLoginDate", "gXFNBHJSey");
        setField(term19542, term19542.getClass(), "lastTrialPlayDate", "wUcSfItZgv");
        setIntField(term19542, term19542.getClass(), "playVsCount", 694100722);
        setIntField(term19542, term19542.getClass(), "playSyncCount", -680529431);
        setIntField(term19542, term19542.getClass(), "winCount", 212698793);
        setIntField(term19542, term19542.getClass(), "helpCount", 1169519385);
        setIntField(term19542, term19542.getClass(), "comboCount", 1846078344);
        setLongField(term19542, term19542.getClass(), "totalDeluxscore", 2054808971423494757L);
        setLongField(term19542, term19542.getClass(), "totalBasicDeluxscore", 8734518435788772658L);
        setLongField(term19542, term19542.getClass(), "totalAdvancedDeluxscore", 2289954139848415685L);
        setLongField(term19542, term19542.getClass(), "totalExpertDeluxscore", -6137280723045949220L);
        setLongField(term19542, term19542.getClass(), "totalMasterDeluxscore", -7787918913179897745L);
        setLongField(term19542, term19542.getClass(), "totalReMasterDeluxscore", 9173715346996433126L);
        setIntField(term19542, term19542.getClass(), "totalSync", 1692543802);
        setIntField(term19542, term19542.getClass(), "totalBasicSync", 376341151);
        setIntField(term19542, term19542.getClass(), "totalAdvancedSync", -1607267243);
        setIntField(term19542, term19542.getClass(), "totalExpertSync", 1641377218);
        setIntField(term19542, term19542.getClass(), "totalMasterSync", 1235375204);
        setIntField(term19542, term19542.getClass(), "totalReMasterSync", 258334639);
        setLongField(term19542, term19542.getClass(), "totalAchievement", -3243599172737171562L);
        setLongField(term19542, term19542.getClass(), "totalBasicAchievement", 3221586604131689186L);
        setLongField(term19542, term19542.getClass(), "totalAdvancedAchievement", -1283936527800858962L);
        setLongField(term19542, term19542.getClass(), "totalExpertAchievement", -8901189796092679153L);
        setLongField(term19542, term19542.getClass(), "totalMasterAchievement", 1731335447688885587L);
        setLongField(term19542, term19542.getClass(), "totalReMasterAchievement", -6206610574921547811L);
        setLongField(term19542, term19542.getClass(), "playerOldRating", -1625372334693179543L);
        setLongField(term19542, term19542.getClass(), "playerNewRating", 3778691000276335279L);
        setIntField(term19542, term19542.getClass(), "banState", 1432187207);
        setLongField(term19542, term19542.getClass(), "dateTime", 8453730687540121475L);
        setField(term19540, term19540.getClass(), "user", term19542);
        setIntField(term19540, term19540.getClass(), "seasonId", -91068927);
        setIntField(term19540, term19540.getClass(), "point", 680714112);
        setIntField(term19540, term19540.getClass(), "rank", 385297023);
        setBooleanField(term19540, term19540.getClass(), "rewardGet", true);
        setField(term19540, term19540.getClass(), "userName", "rOfPCPHmtJ");
        setField(term19540, term19540.getClass(), "recordDate", "EnmiAvfpJv");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserFriendSeasonRanking");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRecordDate", argTypes, term19540, args);
    }

};


