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

public class UserDetail_getLastDataVersion_142589249725 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4243699;

    public UserDetail_getLastDataVersion_142589249725() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4243703 = new Long(5829409186054190538L);
        Integer term4243766 = new Integer(-531718135);
        Integer term4243768 = new Integer(598160626);
        Integer term4243770 = new Integer(1754085320);
        ArrayList term4243764 = new ArrayList();
        ((ArrayList) term4243764).add(term4243766);
        ((ArrayList) term4243764).add(term4243768);
        ((ArrayList) term4243764).add(term4243770);
        ArrayList term4243774 = new ArrayList();
        term4243699 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term4243701 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term4243717 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4243718 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4243722 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4243727 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4243728 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4243732 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term4243699, term4243699.getClass(), "id", -6744753013535996720L);
        setLongField(term4243701, term4243701.getClass(), "id", 408621593518001644L);
        setField(term4243701, term4243701.getClass(), "extId", term4243703);
        setField(term4243701, term4243701.getClass(), "luid", "jqMpBGlERM");
        setIntField(term4243718, term4243718.getClass(), "year", 2013);
        setShortField(term4243718, term4243718.getClass(), "month", (short) 7);
        setShortField(term4243718, term4243718.getClass(), "day", (short) 31);
        setField(term4243717, term4243717.getClass(), "date", term4243718);
        setByteField(term4243722, term4243722.getClass(), "hour", (byte) 23);
        setByteField(term4243722, term4243722.getClass(), "minute", (byte) 51);
        setByteField(term4243722, term4243722.getClass(), "second", (byte) 9);
        setIntField(term4243722, term4243722.getClass(), "nano", 143191992);
        setField(term4243717, term4243717.getClass(), "time", term4243722);
        setField(term4243701, term4243701.getClass(), "registerTime", term4243717);
        setIntField(term4243728, term4243728.getClass(), "year", 2023);
        setShortField(term4243728, term4243728.getClass(), "month", (short) 4);
        setShortField(term4243728, term4243728.getClass(), "day", (short) 4);
        setField(term4243727, term4243727.getClass(), "date", term4243728);
        setByteField(term4243732, term4243732.getClass(), "hour", (byte) 18);
        setByteField(term4243732, term4243732.getClass(), "minute", (byte) 59);
        setByteField(term4243732, term4243732.getClass(), "second", (byte) 50);
        setIntField(term4243732, term4243732.getClass(), "nano", 313444171);
        setField(term4243727, term4243727.getClass(), "time", term4243732);
        setField(term4243701, term4243701.getClass(), "accessTime", term4243727);
        setField(term4243699, term4243699.getClass(), "card", term4243701);
        setField(term4243699, term4243699.getClass(), "userName", "YVnckSVlYT");
        setIntField(term4243699, term4243699.getClass(), "isNetMember", 1722520881);
        setIntField(term4243699, term4243699.getClass(), "iconId", 579789495);
        setIntField(term4243699, term4243699.getClass(), "plateId", -307163759);
        setIntField(term4243699, term4243699.getClass(), "titleId", 1168749449);
        setIntField(term4243699, term4243699.getClass(), "partnerId", 42296754);
        setIntField(term4243699, term4243699.getClass(), "frameId", -1930637267);
        setIntField(term4243699, term4243699.getClass(), "selectMapId", 800869499);
        setIntField(term4243699, term4243699.getClass(), "totalAwake", -2024707201);
        setIntField(term4243699, term4243699.getClass(), "gradeRating", -1134474169);
        setIntField(term4243699, term4243699.getClass(), "musicRating", -103025184);
        setIntField(term4243699, term4243699.getClass(), "playerRating", 177920254);
        setIntField(term4243699, term4243699.getClass(), "highestRating", 1832759492);
        setIntField(term4243699, term4243699.getClass(), "gradeRank", 1088702389);
        setIntField(term4243699, term4243699.getClass(), "classRank", -1195771261);
        setIntField(term4243699, term4243699.getClass(), "courseRank", -483627895);
        setField(term4243699, term4243699.getClass(), "charaSlot", term4243764);
        setField(term4243699, term4243699.getClass(), "charaLockSlot", term4243774);
        setLongField(term4243699, term4243699.getClass(), "contentBit", 6440152547971825555L);
        setIntField(term4243699, term4243699.getClass(), "playCount", 1013212038);
        setField(term4243699, term4243699.getClass(), "eventWatchedDate", "WLwGmVBOgE");
        setField(term4243699, term4243699.getClass(), "lastGameId", "UPjtfSOhNL");
        setField(term4243699, term4243699.getClass(), "lastRomVersion", "nfhEnsTJcI");
        setField(term4243699, term4243699.getClass(), "lastDataVersion", "TFcOzMdoko");
        setField(term4243699, term4243699.getClass(), "lastLoginDate", "HhEeOvHKBN");
        setField(term4243699, term4243699.getClass(), "lastPlayDate", "nWpsucViVA");
        setIntField(term4243699, term4243699.getClass(), "lastPlayCredit", -1659167539);
        setIntField(term4243699, term4243699.getClass(), "lastPlayMode", 923215418);
        setIntField(term4243699, term4243699.getClass(), "lastPlaceId", 2064996048);
        setField(term4243699, term4243699.getClass(), "lastPlaceName", "EYUBFHRsvO");
        setIntField(term4243699, term4243699.getClass(), "lastAllNetId", 1733688702);
        setIntField(term4243699, term4243699.getClass(), "lastRegionId", -573889094);
        setField(term4243699, term4243699.getClass(), "lastRegionName", "YLukoYJytl");
        setField(term4243699, term4243699.getClass(), "lastClientId", "dtfBvhIkmB");
        setField(term4243699, term4243699.getClass(), "lastCountryCode", "BheuttxvEr");
        setIntField(term4243699, term4243699.getClass(), "lastSelectEMoney", 1770266974);
        setIntField(term4243699, term4243699.getClass(), "lastSelectTicket", 1081921356);
        setIntField(term4243699, term4243699.getClass(), "lastSelectCourse", 778336341);
        setIntField(term4243699, term4243699.getClass(), "lastCountCourse", 1328562841);
        setField(term4243699, term4243699.getClass(), "firstGameId", "ncYBxQSUSZ");
        setField(term4243699, term4243699.getClass(), "firstRomVersion", "joPeNbZIyt");
        setField(term4243699, term4243699.getClass(), "firstDataVersion", "WJNWcvZHOu");
        setField(term4243699, term4243699.getClass(), "firstPlayDate", "ODdINBazAz");
        setField(term4243699, term4243699.getClass(), "compatibleCmVersion", "jIdOvEZVEf");
        setField(term4243699, term4243699.getClass(), "dailyBonusDate", "MZQUPUwZNr");
        setField(term4243699, term4243699.getClass(), "dailyCourseBonusDate", "urYIZYVjPV");
        setField(term4243699, term4243699.getClass(), "lastPairLoginDate", "sFrDxMdKzI");
        setField(term4243699, term4243699.getClass(), "lastTrialPlayDate", "PoTqVfsKZm");
        setIntField(term4243699, term4243699.getClass(), "playVsCount", -1230611587);
        setIntField(term4243699, term4243699.getClass(), "playSyncCount", 635070950);
        setIntField(term4243699, term4243699.getClass(), "winCount", -957893053);
        setIntField(term4243699, term4243699.getClass(), "helpCount", 1515241294);
        setIntField(term4243699, term4243699.getClass(), "comboCount", 1262313124);
        setLongField(term4243699, term4243699.getClass(), "totalDeluxscore", 674228268856008970L);
        setLongField(term4243699, term4243699.getClass(), "totalBasicDeluxscore", -1453401087711887335L);
        setLongField(term4243699, term4243699.getClass(), "totalAdvancedDeluxscore", -5046391814275017813L);
        setLongField(term4243699, term4243699.getClass(), "totalExpertDeluxscore", -4414996116720276213L);
        setLongField(term4243699, term4243699.getClass(), "totalMasterDeluxscore", -1513635073263024518L);
        setLongField(term4243699, term4243699.getClass(), "totalReMasterDeluxscore", 1912348478591156731L);
        setIntField(term4243699, term4243699.getClass(), "totalSync", -270949650);
        setIntField(term4243699, term4243699.getClass(), "totalBasicSync", -1848815367);
        setIntField(term4243699, term4243699.getClass(), "totalAdvancedSync", 1716077205);
        setIntField(term4243699, term4243699.getClass(), "totalExpertSync", -16543009);
        setIntField(term4243699, term4243699.getClass(), "totalMasterSync", 1280685649);
        setIntField(term4243699, term4243699.getClass(), "totalReMasterSync", -1541672255);
        setLongField(term4243699, term4243699.getClass(), "totalAchievement", 6312096630390040964L);
        setLongField(term4243699, term4243699.getClass(), "totalBasicAchievement", 453312979867339246L);
        setLongField(term4243699, term4243699.getClass(), "totalAdvancedAchievement", 7830606406526608482L);
        setLongField(term4243699, term4243699.getClass(), "totalExpertAchievement", 6221388422765133338L);
        setLongField(term4243699, term4243699.getClass(), "totalMasterAchievement", 5290781288718490781L);
        setLongField(term4243699, term4243699.getClass(), "totalReMasterAchievement", -3877516317299176208L);
        setLongField(term4243699, term4243699.getClass(), "playerOldRating", -4459448443880653235L);
        setLongField(term4243699, term4243699.getClass(), "playerNewRating", -3535553349485867684L);
        setIntField(term4243699, term4243699.getClass(), "banState", 1602230871);
        setLongField(term4243699, term4243699.getClass(), "dateTime", 2184540351007632131L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastDataVersion", argTypes, term4243699, args);
    }

};


