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

public class UserFriendSeasonRanking_setSeasonId_84739027811 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21936;
     Object term22315;

    public UserFriendSeasonRanking_setSeasonId_84739027811() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term21942 = new Long(1439298019805881866L);
        Integer term22005 = new Integer(-1560631747);
        Integer term22007 = new Integer(1215150180);
        Integer term22009 = new Integer(-1422859977);
        Integer term22011 = new Integer(-1972436591);
        ArrayList term22003 = new ArrayList();
        ((ArrayList) term22003).add(term22005);
        ((ArrayList) term22003).add(term22007);
        ((ArrayList) term22003).add(term22009);
        ((ArrayList) term22003).add(term22011);
        Integer term22017 = new Integer(68922753);
        ArrayList term22015 = new ArrayList();
        ((ArrayList) term22015).add(term22017);
        term21936 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserFriendSeasonRanking"));
        Object term21938 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term21940 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term21956 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term21957 = newInstance(Class.forName("java.time.LocalDate"));
        Object term21961 = newInstance(Class.forName("java.time.LocalTime"));
        Object term21966 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term21967 = newInstance(Class.forName("java.time.LocalDate"));
        Object term21971 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term21936, term21936.getClass(), "id", -3502423991725415780L);
        setLongField(term21938, term21938.getClass(), "id", 7717843551775677202L);
        setLongField(term21940, term21940.getClass(), "id", 2823262561274956150L);
        setField(term21940, term21940.getClass(), "extId", term21942);
        setField(term21940, term21940.getClass(), "luid", "Bcivwcjece");
        setIntField(term21957, term21957.getClass(), "year", 2010);
        setShortField(term21957, term21957.getClass(), "month", (short) 2);
        setShortField(term21957, term21957.getClass(), "day", (short) 24);
        setField(term21956, term21956.getClass(), "date", term21957);
        setByteField(term21961, term21961.getClass(), "hour", (byte) 17);
        setByteField(term21961, term21961.getClass(), "minute", (byte) 58);
        setByteField(term21961, term21961.getClass(), "second", (byte) 56);
        setIntField(term21961, term21961.getClass(), "nano", 291725532);
        setField(term21956, term21956.getClass(), "time", term21961);
        setField(term21940, term21940.getClass(), "registerTime", term21956);
        setIntField(term21967, term21967.getClass(), "year", 2028);
        setShortField(term21967, term21967.getClass(), "month", (short) 7);
        setShortField(term21967, term21967.getClass(), "day", (short) 22);
        setField(term21966, term21966.getClass(), "date", term21967);
        setByteField(term21971, term21971.getClass(), "hour", (byte) 18);
        setByteField(term21971, term21971.getClass(), "minute", (byte) 33);
        setByteField(term21971, term21971.getClass(), "second", (byte) 7);
        setIntField(term21971, term21971.getClass(), "nano", 763613074);
        setField(term21966, term21966.getClass(), "time", term21971);
        setField(term21940, term21940.getClass(), "accessTime", term21966);
        setField(term21938, term21938.getClass(), "card", term21940);
        setField(term21938, term21938.getClass(), "userName", "QTefjRuiez");
        setIntField(term21938, term21938.getClass(), "isNetMember", 2103971768);
        setIntField(term21938, term21938.getClass(), "iconId", -939132796);
        setIntField(term21938, term21938.getClass(), "plateId", 159279866);
        setIntField(term21938, term21938.getClass(), "titleId", 138122227);
        setIntField(term21938, term21938.getClass(), "partnerId", 1795358995);
        setIntField(term21938, term21938.getClass(), "frameId", -781185864);
        setIntField(term21938, term21938.getClass(), "selectMapId", 340500914);
        setIntField(term21938, term21938.getClass(), "totalAwake", -2061712635);
        setIntField(term21938, term21938.getClass(), "gradeRating", 1182911731);
        setIntField(term21938, term21938.getClass(), "musicRating", 644726932);
        setIntField(term21938, term21938.getClass(), "playerRating", -1515977761);
        setIntField(term21938, term21938.getClass(), "highestRating", -1476037190);
        setIntField(term21938, term21938.getClass(), "gradeRank", -718204437);
        setIntField(term21938, term21938.getClass(), "classRank", 468974358);
        setIntField(term21938, term21938.getClass(), "courseRank", 346282818);
        setField(term21938, term21938.getClass(), "charaSlot", term22003);
        setField(term21938, term21938.getClass(), "charaLockSlot", term22015);
        setLongField(term21938, term21938.getClass(), "contentBit", 8039153062846287600L);
        setIntField(term21938, term21938.getClass(), "playCount", -857876056);
        setField(term21938, term21938.getClass(), "eventWatchedDate", "SQZVNkAVBB");
        setField(term21938, term21938.getClass(), "lastGameId", "mrSAYJlddZ");
        setField(term21938, term21938.getClass(), "lastRomVersion", "KbwxawvYsw");
        setField(term21938, term21938.getClass(), "lastDataVersion", "gvjdfHNzOa");
        setField(term21938, term21938.getClass(), "lastLoginDate", "HqitWglYWX");
        setField(term21938, term21938.getClass(), "lastPlayDate", "pOuFRlHmbK");
        setIntField(term21938, term21938.getClass(), "lastPlayCredit", 1392910876);
        setIntField(term21938, term21938.getClass(), "lastPlayMode", 1086383182);
        setIntField(term21938, term21938.getClass(), "lastPlaceId", 1425319286);
        setField(term21938, term21938.getClass(), "lastPlaceName", "WrzdBkinqV");
        setIntField(term21938, term21938.getClass(), "lastAllNetId", 1729919228);
        setIntField(term21938, term21938.getClass(), "lastRegionId", 872351195);
        setField(term21938, term21938.getClass(), "lastRegionName", "vydWXHfFTw");
        setField(term21938, term21938.getClass(), "lastClientId", "DRhkpDneCC");
        setField(term21938, term21938.getClass(), "lastCountryCode", "vuIJRrypuA");
        setIntField(term21938, term21938.getClass(), "lastSelectEMoney", -1664328399);
        setIntField(term21938, term21938.getClass(), "lastSelectTicket", 1422430512);
        setIntField(term21938, term21938.getClass(), "lastSelectCourse", 1796581482);
        setIntField(term21938, term21938.getClass(), "lastCountCourse", 1286440081);
        setField(term21938, term21938.getClass(), "firstGameId", "AxfSZmaiyA");
        setField(term21938, term21938.getClass(), "firstRomVersion", "lBpveIKbea");
        setField(term21938, term21938.getClass(), "firstDataVersion", "uyLBVQYcOV");
        setField(term21938, term21938.getClass(), "firstPlayDate", "PoTZjDuBHa");
        setField(term21938, term21938.getClass(), "compatibleCmVersion", "MIwvgVrhzP");
        setField(term21938, term21938.getClass(), "dailyBonusDate", "HcUUieXdep");
        setField(term21938, term21938.getClass(), "dailyCourseBonusDate", "AbonCTtbef");
        setField(term21938, term21938.getClass(), "lastPairLoginDate", "maXrGOGoKA");
        setField(term21938, term21938.getClass(), "lastTrialPlayDate", "zAkgWQVCpM");
        setIntField(term21938, term21938.getClass(), "playVsCount", -928538452);
        setIntField(term21938, term21938.getClass(), "playSyncCount", -1313207353);
        setIntField(term21938, term21938.getClass(), "winCount", 402612318);
        setIntField(term21938, term21938.getClass(), "helpCount", -1628481565);
        setIntField(term21938, term21938.getClass(), "comboCount", -217226756);
        setLongField(term21938, term21938.getClass(), "totalDeluxscore", -7087265016767824631L);
        setLongField(term21938, term21938.getClass(), "totalBasicDeluxscore", -8121348431673567857L);
        setLongField(term21938, term21938.getClass(), "totalAdvancedDeluxscore", 7594342965038171122L);
        setLongField(term21938, term21938.getClass(), "totalExpertDeluxscore", -4475453924678388077L);
        setLongField(term21938, term21938.getClass(), "totalMasterDeluxscore", 3831842879355381917L);
        setLongField(term21938, term21938.getClass(), "totalReMasterDeluxscore", -2196447813514870436L);
        setIntField(term21938, term21938.getClass(), "totalSync", 1608000247);
        setIntField(term21938, term21938.getClass(), "totalBasicSync", 1354560887);
        setIntField(term21938, term21938.getClass(), "totalAdvancedSync", -749474542);
        setIntField(term21938, term21938.getClass(), "totalExpertSync", -47907780);
        setIntField(term21938, term21938.getClass(), "totalMasterSync", 1131462369);
        setIntField(term21938, term21938.getClass(), "totalReMasterSync", -1161206731);
        setLongField(term21938, term21938.getClass(), "totalAchievement", 2984955721798941743L);
        setLongField(term21938, term21938.getClass(), "totalBasicAchievement", 7495572757420909707L);
        setLongField(term21938, term21938.getClass(), "totalAdvancedAchievement", -1237494311441603673L);
        setLongField(term21938, term21938.getClass(), "totalExpertAchievement", 3550928874058758597L);
        setLongField(term21938, term21938.getClass(), "totalMasterAchievement", 987797117310260031L);
        setLongField(term21938, term21938.getClass(), "totalReMasterAchievement", -4703513086610650698L);
        setLongField(term21938, term21938.getClass(), "playerOldRating", -8123300791906968552L);
        setLongField(term21938, term21938.getClass(), "playerNewRating", 7654605795400256601L);
        setIntField(term21938, term21938.getClass(), "banState", -992847709);
        setLongField(term21938, term21938.getClass(), "dateTime", 3610800451815944213L);
        setField(term21936, term21936.getClass(), "user", term21938);
        setIntField(term21936, term21936.getClass(), "seasonId", 1125156671);
        setIntField(term21936, term21936.getClass(), "point", 1203107925);
        setIntField(term21936, term21936.getClass(), "rank", 1825448944);
        setBooleanField(term21936, term21936.getClass(), "rewardGet", false);
        setField(term21936, term21936.getClass(), "userName", "yQUDyOroXU");
        setField(term21936, term21936.getClass(), "recordDate", "xweqkPdyJH");
        term22315 = new Integer(1769496642);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserFriendSeasonRanking");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term22315;
        callMethod(klass, "setSeasonId", argTypes, term21936, args);
    }

};


