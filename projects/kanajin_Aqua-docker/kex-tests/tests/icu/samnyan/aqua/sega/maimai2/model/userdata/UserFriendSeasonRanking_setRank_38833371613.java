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

public class UserFriendSeasonRanking_setRank_38833371613 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23162;
     Object term23545;

    public UserFriendSeasonRanking_setRank_38833371613() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term23168 = new Long(5907001541142728739L);
        Integer term23231 = new Integer(533197381);
        Integer term23233 = new Integer(1048271679);
        Integer term23235 = new Integer(-1529797673);
        Integer term23237 = new Integer(-868676396);
        Integer term23239 = new Integer(1922684808);
        Integer term23241 = new Integer(-2005784375);
        Integer term23243 = new Integer(-288604325);
        ArrayList term23229 = new ArrayList();
        ((ArrayList) term23229).add(term23231);
        ((ArrayList) term23229).add(term23233);
        ((ArrayList) term23229).add(term23235);
        ((ArrayList) term23229).add(term23237);
        ((ArrayList) term23229).add(term23239);
        ((ArrayList) term23229).add(term23241);
        ((ArrayList) term23229).add(term23243);
        ArrayList term23247 = new ArrayList();
        term23162 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserFriendSeasonRanking"));
        Object term23164 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term23166 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term23182 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term23183 = newInstance(Class.forName("java.time.LocalDate"));
        Object term23187 = newInstance(Class.forName("java.time.LocalTime"));
        Object term23192 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term23193 = newInstance(Class.forName("java.time.LocalDate"));
        Object term23197 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term23162, term23162.getClass(), "id", -4821516944173509228L);
        setLongField(term23164, term23164.getClass(), "id", 2315395988604904502L);
        setLongField(term23166, term23166.getClass(), "id", 4337555582321907177L);
        setField(term23166, term23166.getClass(), "extId", term23168);
        setField(term23166, term23166.getClass(), "luid", "NFkbBiPeiw");
        setIntField(term23183, term23183.getClass(), "year", 2020);
        setShortField(term23183, term23183.getClass(), "month", (short) 8);
        setShortField(term23183, term23183.getClass(), "day", (short) 16);
        setField(term23182, term23182.getClass(), "date", term23183);
        setByteField(term23187, term23187.getClass(), "hour", (byte) 4);
        setByteField(term23187, term23187.getClass(), "minute", (byte) 37);
        setByteField(term23187, term23187.getClass(), "second", (byte) 19);
        setIntField(term23187, term23187.getClass(), "nano", 605410923);
        setField(term23182, term23182.getClass(), "time", term23187);
        setField(term23166, term23166.getClass(), "registerTime", term23182);
        setIntField(term23193, term23193.getClass(), "year", 2028);
        setShortField(term23193, term23193.getClass(), "month", (short) 5);
        setShortField(term23193, term23193.getClass(), "day", (short) 2);
        setField(term23192, term23192.getClass(), "date", term23193);
        setByteField(term23197, term23197.getClass(), "hour", (byte) 2);
        setByteField(term23197, term23197.getClass(), "minute", (byte) 59);
        setByteField(term23197, term23197.getClass(), "second", (byte) 30);
        setIntField(term23197, term23197.getClass(), "nano", 222274238);
        setField(term23192, term23192.getClass(), "time", term23197);
        setField(term23166, term23166.getClass(), "accessTime", term23192);
        setField(term23164, term23164.getClass(), "card", term23166);
        setField(term23164, term23164.getClass(), "userName", "tlRvilQyjJ");
        setIntField(term23164, term23164.getClass(), "isNetMember", 335681723);
        setIntField(term23164, term23164.getClass(), "iconId", -773707674);
        setIntField(term23164, term23164.getClass(), "plateId", 383244929);
        setIntField(term23164, term23164.getClass(), "titleId", -2114034003);
        setIntField(term23164, term23164.getClass(), "partnerId", 207213904);
        setIntField(term23164, term23164.getClass(), "frameId", -484303394);
        setIntField(term23164, term23164.getClass(), "selectMapId", -31125530);
        setIntField(term23164, term23164.getClass(), "totalAwake", 1909773180);
        setIntField(term23164, term23164.getClass(), "gradeRating", -970417907);
        setIntField(term23164, term23164.getClass(), "musicRating", 1097894139);
        setIntField(term23164, term23164.getClass(), "playerRating", 390256347);
        setIntField(term23164, term23164.getClass(), "highestRating", 1471619998);
        setIntField(term23164, term23164.getClass(), "gradeRank", -1623489521);
        setIntField(term23164, term23164.getClass(), "classRank", 1179937517);
        setIntField(term23164, term23164.getClass(), "courseRank", 200150950);
        setField(term23164, term23164.getClass(), "charaSlot", term23229);
        setField(term23164, term23164.getClass(), "charaLockSlot", term23247);
        setLongField(term23164, term23164.getClass(), "contentBit", -6367418587326372844L);
        setIntField(term23164, term23164.getClass(), "playCount", -366198044);
        setField(term23164, term23164.getClass(), "eventWatchedDate", "gwTUlYNpjM");
        setField(term23164, term23164.getClass(), "lastGameId", "uXYojRmxrM");
        setField(term23164, term23164.getClass(), "lastRomVersion", "cxRwRcodud");
        setField(term23164, term23164.getClass(), "lastDataVersion", "GDGBPlYeLn");
        setField(term23164, term23164.getClass(), "lastLoginDate", "jdQANIXSTq");
        setField(term23164, term23164.getClass(), "lastPlayDate", "stVcZLTNpu");
        setIntField(term23164, term23164.getClass(), "lastPlayCredit", -1350380769);
        setIntField(term23164, term23164.getClass(), "lastPlayMode", -1432215030);
        setIntField(term23164, term23164.getClass(), "lastPlaceId", 1233186320);
        setField(term23164, term23164.getClass(), "lastPlaceName", "LgXdqWrsLL");
        setIntField(term23164, term23164.getClass(), "lastAllNetId", -1303269101);
        setIntField(term23164, term23164.getClass(), "lastRegionId", 1435572720);
        setField(term23164, term23164.getClass(), "lastRegionName", "bbHWyibNmy");
        setField(term23164, term23164.getClass(), "lastClientId", "vYYOYhWMWZ");
        setField(term23164, term23164.getClass(), "lastCountryCode", "FLQJOzEXff");
        setIntField(term23164, term23164.getClass(), "lastSelectEMoney", 1437618365);
        setIntField(term23164, term23164.getClass(), "lastSelectTicket", 1122535239);
        setIntField(term23164, term23164.getClass(), "lastSelectCourse", 1158923260);
        setIntField(term23164, term23164.getClass(), "lastCountCourse", 1633508772);
        setField(term23164, term23164.getClass(), "firstGameId", "qlaIVJBSfQ");
        setField(term23164, term23164.getClass(), "firstRomVersion", "lYvIWBFFsq");
        setField(term23164, term23164.getClass(), "firstDataVersion", "tThwsqWKcE");
        setField(term23164, term23164.getClass(), "firstPlayDate", "bkSgsDrkCN");
        setField(term23164, term23164.getClass(), "compatibleCmVersion", "hwjlcimgJH");
        setField(term23164, term23164.getClass(), "dailyBonusDate", "TLxQzxvizR");
        setField(term23164, term23164.getClass(), "dailyCourseBonusDate", "uUgJfKAzDM");
        setField(term23164, term23164.getClass(), "lastPairLoginDate", "gZPZNkweEp");
        setField(term23164, term23164.getClass(), "lastTrialPlayDate", "vfennwtmqe");
        setIntField(term23164, term23164.getClass(), "playVsCount", -545275970);
        setIntField(term23164, term23164.getClass(), "playSyncCount", 1355471365);
        setIntField(term23164, term23164.getClass(), "winCount", -1746962742);
        setIntField(term23164, term23164.getClass(), "helpCount", -575810668);
        setIntField(term23164, term23164.getClass(), "comboCount", 256028547);
        setLongField(term23164, term23164.getClass(), "totalDeluxscore", 6371581018571997173L);
        setLongField(term23164, term23164.getClass(), "totalBasicDeluxscore", 6604328992663797314L);
        setLongField(term23164, term23164.getClass(), "totalAdvancedDeluxscore", -5133307284441518726L);
        setLongField(term23164, term23164.getClass(), "totalExpertDeluxscore", 7921404547326630089L);
        setLongField(term23164, term23164.getClass(), "totalMasterDeluxscore", 2155219577693802424L);
        setLongField(term23164, term23164.getClass(), "totalReMasterDeluxscore", -4033544645261759750L);
        setIntField(term23164, term23164.getClass(), "totalSync", -750603024);
        setIntField(term23164, term23164.getClass(), "totalBasicSync", 1255234202);
        setIntField(term23164, term23164.getClass(), "totalAdvancedSync", -223786928);
        setIntField(term23164, term23164.getClass(), "totalExpertSync", 1703103733);
        setIntField(term23164, term23164.getClass(), "totalMasterSync", 1057562436);
        setIntField(term23164, term23164.getClass(), "totalReMasterSync", 646610000);
        setLongField(term23164, term23164.getClass(), "totalAchievement", 593230449611047187L);
        setLongField(term23164, term23164.getClass(), "totalBasicAchievement", -3355167737637002830L);
        setLongField(term23164, term23164.getClass(), "totalAdvancedAchievement", -8854988339892073229L);
        setLongField(term23164, term23164.getClass(), "totalExpertAchievement", 2769081086274438111L);
        setLongField(term23164, term23164.getClass(), "totalMasterAchievement", -6339531459447942677L);
        setLongField(term23164, term23164.getClass(), "totalReMasterAchievement", 2014229530618878786L);
        setLongField(term23164, term23164.getClass(), "playerOldRating", -3684549603148553700L);
        setLongField(term23164, term23164.getClass(), "playerNewRating", 4665980239039735158L);
        setIntField(term23164, term23164.getClass(), "banState", 2003399396);
        setLongField(term23164, term23164.getClass(), "dateTime", 7429946509853918683L);
        setField(term23162, term23162.getClass(), "user", term23164);
        setIntField(term23162, term23162.getClass(), "seasonId", 1223703911);
        setIntField(term23162, term23162.getClass(), "point", -1824905298);
        setIntField(term23162, term23162.getClass(), "rank", -2062724184);
        setBooleanField(term23162, term23162.getClass(), "rewardGet", false);
        setField(term23162, term23162.getClass(), "userName", "zZxoNkohbw");
        setField(term23162, term23162.getClass(), "recordDate", "DQrjPcLysX");
        term23545 = new Integer(-716654499);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserFriendSeasonRanking");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term23545;
        callMethod(klass, "setRank", argTypes, term23162, args);
    }

};


