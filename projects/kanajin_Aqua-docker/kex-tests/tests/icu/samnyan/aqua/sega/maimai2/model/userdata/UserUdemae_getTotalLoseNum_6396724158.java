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

public class UserUdemae_getTotalLoseNum_6396724158 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term99009;

    public UserUdemae_getTotalLoseNum_6396724158() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term99015 = new Long(-8649738738252714180L);
        Integer term99078 = new Integer(-111082612);
        Integer term99080 = new Integer(1253334988);
        Integer term99082 = new Integer(1086709736);
        Integer term99084 = new Integer(-1606698075);
        Integer term99086 = new Integer(90996421);
        Integer term99088 = new Integer(-1805802783);
        Integer term99090 = new Integer(-529831900);
        Integer term99092 = new Integer(1574493440);
        Integer term99094 = new Integer(1854694585);
        ArrayList term99076 = new ArrayList();
        ((ArrayList) term99076).add(term99078);
        ((ArrayList) term99076).add(term99080);
        ((ArrayList) term99076).add(term99082);
        ((ArrayList) term99076).add(term99084);
        ((ArrayList) term99076).add(term99086);
        ((ArrayList) term99076).add(term99088);
        ((ArrayList) term99076).add(term99090);
        ((ArrayList) term99076).add(term99092);
        ((ArrayList) term99076).add(term99094);
        Integer term99100 = new Integer(-1260562836);
        ArrayList term99098 = new ArrayList();
        ((ArrayList) term99098).add(term99100);
        term99009 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserUdemae"));
        Object term99011 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term99013 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term99029 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term99030 = newInstance(Class.forName("java.time.LocalDate"));
        Object term99034 = newInstance(Class.forName("java.time.LocalTime"));
        Object term99039 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term99040 = newInstance(Class.forName("java.time.LocalDate"));
        Object term99044 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term99009, term99009.getClass(), "id", 4051658878918665197L);
        setLongField(term99011, term99011.getClass(), "id", -7721169040681572263L);
        setLongField(term99013, term99013.getClass(), "id", 3973799120661807990L);
        setField(term99013, term99013.getClass(), "extId", term99015);
        setField(term99013, term99013.getClass(), "luid", "DEvoiMeeMr");
        setIntField(term99030, term99030.getClass(), "year", 2017);
        setShortField(term99030, term99030.getClass(), "month", (short) 1);
        setShortField(term99030, term99030.getClass(), "day", (short) 4);
        setField(term99029, term99029.getClass(), "date", term99030);
        setByteField(term99034, term99034.getClass(), "hour", (byte) 17);
        setByteField(term99034, term99034.getClass(), "minute", (byte) 39);
        setByteField(term99034, term99034.getClass(), "second", (byte) 5);
        setIntField(term99034, term99034.getClass(), "nano", 712424493);
        setField(term99029, term99029.getClass(), "time", term99034);
        setField(term99013, term99013.getClass(), "registerTime", term99029);
        setIntField(term99040, term99040.getClass(), "year", 2012);
        setShortField(term99040, term99040.getClass(), "month", (short) 1);
        setShortField(term99040, term99040.getClass(), "day", (short) 27);
        setField(term99039, term99039.getClass(), "date", term99040);
        setByteField(term99044, term99044.getClass(), "hour", (byte) 3);
        setByteField(term99044, term99044.getClass(), "minute", (byte) 30);
        setByteField(term99044, term99044.getClass(), "second", (byte) 25);
        setIntField(term99044, term99044.getClass(), "nano", 460782173);
        setField(term99039, term99039.getClass(), "time", term99044);
        setField(term99013, term99013.getClass(), "accessTime", term99039);
        setField(term99011, term99011.getClass(), "card", term99013);
        setField(term99011, term99011.getClass(), "userName", "CeaAfrYZQU");
        setIntField(term99011, term99011.getClass(), "isNetMember", -1687052168);
        setIntField(term99011, term99011.getClass(), "iconId", -2097023139);
        setIntField(term99011, term99011.getClass(), "plateId", -1867947821);
        setIntField(term99011, term99011.getClass(), "titleId", 561665845);
        setIntField(term99011, term99011.getClass(), "partnerId", -283888175);
        setIntField(term99011, term99011.getClass(), "frameId", 277022954);
        setIntField(term99011, term99011.getClass(), "selectMapId", -1539323257);
        setIntField(term99011, term99011.getClass(), "totalAwake", -1696039925);
        setIntField(term99011, term99011.getClass(), "gradeRating", 741097031);
        setIntField(term99011, term99011.getClass(), "musicRating", -1525517989);
        setIntField(term99011, term99011.getClass(), "playerRating", -1137095698);
        setIntField(term99011, term99011.getClass(), "highestRating", -1037663898);
        setIntField(term99011, term99011.getClass(), "gradeRank", 425749446);
        setIntField(term99011, term99011.getClass(), "classRank", -1720765811);
        setIntField(term99011, term99011.getClass(), "courseRank", 1856736903);
        setField(term99011, term99011.getClass(), "charaSlot", term99076);
        setField(term99011, term99011.getClass(), "charaLockSlot", term99098);
        setLongField(term99011, term99011.getClass(), "contentBit", 9052872633177963228L);
        setIntField(term99011, term99011.getClass(), "playCount", 601640545);
        setField(term99011, term99011.getClass(), "eventWatchedDate", "hLWnnngzRq");
        setField(term99011, term99011.getClass(), "lastGameId", "iLNHwyhEDE");
        setField(term99011, term99011.getClass(), "lastRomVersion", "duILkPooNH");
        setField(term99011, term99011.getClass(), "lastDataVersion", "bUJrQeiZOb");
        setField(term99011, term99011.getClass(), "lastLoginDate", "mQqpexSybQ");
        setField(term99011, term99011.getClass(), "lastPlayDate", "KxEBqnheIv");
        setIntField(term99011, term99011.getClass(), "lastPlayCredit", 1768015672);
        setIntField(term99011, term99011.getClass(), "lastPlayMode", -575165301);
        setIntField(term99011, term99011.getClass(), "lastPlaceId", -1576541436);
        setField(term99011, term99011.getClass(), "lastPlaceName", "ExgxdQmpcx");
        setIntField(term99011, term99011.getClass(), "lastAllNetId", -220907120);
        setIntField(term99011, term99011.getClass(), "lastRegionId", -1401366212);
        setField(term99011, term99011.getClass(), "lastRegionName", "SUwVfgXZzs");
        setField(term99011, term99011.getClass(), "lastClientId", "OzwvrniiKl");
        setField(term99011, term99011.getClass(), "lastCountryCode", "beAkHVBeEQ");
        setIntField(term99011, term99011.getClass(), "lastSelectEMoney", 1124444723);
        setIntField(term99011, term99011.getClass(), "lastSelectTicket", -149423332);
        setIntField(term99011, term99011.getClass(), "lastSelectCourse", 1593811012);
        setIntField(term99011, term99011.getClass(), "lastCountCourse", 1743792661);
        setField(term99011, term99011.getClass(), "firstGameId", "tiGVUUaQMv");
        setField(term99011, term99011.getClass(), "firstRomVersion", "NzoNAsaJqr");
        setField(term99011, term99011.getClass(), "firstDataVersion", "VRKEuPftph");
        setField(term99011, term99011.getClass(), "firstPlayDate", "DkRegMkIWt");
        setField(term99011, term99011.getClass(), "compatibleCmVersion", "IIOFAGjcXe");
        setField(term99011, term99011.getClass(), "dailyBonusDate", "XsAUdWVfqM");
        setField(term99011, term99011.getClass(), "dailyCourseBonusDate", "WRKAHqtTqT");
        setField(term99011, term99011.getClass(), "lastPairLoginDate", "EkgwvUqGYF");
        setField(term99011, term99011.getClass(), "lastTrialPlayDate", "sbtPNrurvf");
        setIntField(term99011, term99011.getClass(), "playVsCount", -1347677159);
        setIntField(term99011, term99011.getClass(), "playSyncCount", 405531807);
        setIntField(term99011, term99011.getClass(), "winCount", -784847348);
        setIntField(term99011, term99011.getClass(), "helpCount", -1819128604);
        setIntField(term99011, term99011.getClass(), "comboCount", 937586090);
        setLongField(term99011, term99011.getClass(), "totalDeluxscore", 3498870473976116381L);
        setLongField(term99011, term99011.getClass(), "totalBasicDeluxscore", 4125808103563576764L);
        setLongField(term99011, term99011.getClass(), "totalAdvancedDeluxscore", 5326420816295740567L);
        setLongField(term99011, term99011.getClass(), "totalExpertDeluxscore", -515217973613983289L);
        setLongField(term99011, term99011.getClass(), "totalMasterDeluxscore", 1865737772535583755L);
        setLongField(term99011, term99011.getClass(), "totalReMasterDeluxscore", 7180218348598736937L);
        setIntField(term99011, term99011.getClass(), "totalSync", -507719222);
        setIntField(term99011, term99011.getClass(), "totalBasicSync", -100427651);
        setIntField(term99011, term99011.getClass(), "totalAdvancedSync", -836703719);
        setIntField(term99011, term99011.getClass(), "totalExpertSync", -1563918188);
        setIntField(term99011, term99011.getClass(), "totalMasterSync", 153656028);
        setIntField(term99011, term99011.getClass(), "totalReMasterSync", 440521526);
        setLongField(term99011, term99011.getClass(), "totalAchievement", -4078605882460245000L);
        setLongField(term99011, term99011.getClass(), "totalBasicAchievement", 5979904252027515883L);
        setLongField(term99011, term99011.getClass(), "totalAdvancedAchievement", 4082344193051454677L);
        setLongField(term99011, term99011.getClass(), "totalExpertAchievement", -777942352389232708L);
        setLongField(term99011, term99011.getClass(), "totalMasterAchievement", 730530576174994425L);
        setLongField(term99011, term99011.getClass(), "totalReMasterAchievement", -694309572389702668L);
        setLongField(term99011, term99011.getClass(), "playerOldRating", 5257435816251102013L);
        setLongField(term99011, term99011.getClass(), "playerNewRating", 2254797667827153109L);
        setIntField(term99011, term99011.getClass(), "banState", -1106412249);
        setLongField(term99011, term99011.getClass(), "dateTime", 2060510242405205727L);
        setField(term99009, term99009.getClass(), "user", term99011);
        setIntField(term99009, term99009.getClass(), "rate", -1922114971);
        setIntField(term99009, term99009.getClass(), "maxRate", -1285495576);
        setIntField(term99009, term99009.getClass(), "classValue", 605159454);
        setIntField(term99009, term99009.getClass(), "maxClassValue", 1393801591);
        setIntField(term99009, term99009.getClass(), "totalWinNum", -1187577742);
        setIntField(term99009, term99009.getClass(), "totalLoseNum", -793777683);
        setIntField(term99009, term99009.getClass(), "maxWinNum", 1741594607);
        setIntField(term99009, term99009.getClass(), "maxLoseNum", 853592734);
        setIntField(term99009, term99009.getClass(), "winNum", -626491911);
        setIntField(term99009, term99009.getClass(), "loseNum", -648815069);
        setIntField(term99009, term99009.getClass(), "npcTotalWinNum", 1501415160);
        setIntField(term99009, term99009.getClass(), "npcTotalLoseNum", 905044945);
        setIntField(term99009, term99009.getClass(), "npcMaxWinNum", -1878642551);
        setIntField(term99009, term99009.getClass(), "npcMaxLoseNum", 300043927);
        setIntField(term99009, term99009.getClass(), "npcWinNum", 2122930718);
        setIntField(term99009, term99009.getClass(), "npcLoseNum", -578301288);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserUdemae");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalLoseNum", argTypes, term99009, args);
    }

};


