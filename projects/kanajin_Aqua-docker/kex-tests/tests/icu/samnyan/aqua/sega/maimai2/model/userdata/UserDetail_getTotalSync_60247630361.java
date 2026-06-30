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

public class UserDetail_getTotalSync_60247630361 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4264039;

    public UserDetail_getTotalSync_60247630361() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4264043 = new Long(-5559145737380156017L);
        Integer term4264106 = new Integer(-2053124772);
        Integer term4264108 = new Integer(-873131161);
        Integer term4264110 = new Integer(1399978457);
        Integer term4264112 = new Integer(-1973849284);
        Integer term4264114 = new Integer(-1074349521);
        ArrayList term4264104 = new ArrayList();
        ((ArrayList) term4264104).add(term4264106);
        ((ArrayList) term4264104).add(term4264108);
        ((ArrayList) term4264104).add(term4264110);
        ((ArrayList) term4264104).add(term4264112);
        ((ArrayList) term4264104).add(term4264114);
        Integer term4264120 = new Integer(-301274199);
        Integer term4264122 = new Integer(495802747);
        Integer term4264124 = new Integer(-2002408985);
        Integer term4264126 = new Integer(-1289271829);
        Integer term4264128 = new Integer(-1303889576);
        Integer term4264130 = new Integer(158488233);
        ArrayList term4264118 = new ArrayList();
        ((ArrayList) term4264118).add(term4264120);
        ((ArrayList) term4264118).add(term4264122);
        ((ArrayList) term4264118).add(term4264124);
        ((ArrayList) term4264118).add(term4264126);
        ((ArrayList) term4264118).add(term4264128);
        ((ArrayList) term4264118).add(term4264130);
        term4264039 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term4264041 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term4264057 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4264058 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4264062 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4264067 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4264068 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4264072 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term4264039, term4264039.getClass(), "id", -8303685300858839307L);
        setLongField(term4264041, term4264041.getClass(), "id", -3128877832936427537L);
        setField(term4264041, term4264041.getClass(), "extId", term4264043);
        setField(term4264041, term4264041.getClass(), "luid", "uUXJddWJXI");
        setIntField(term4264058, term4264058.getClass(), "year", 2027);
        setShortField(term4264058, term4264058.getClass(), "month", (short) 4);
        setShortField(term4264058, term4264058.getClass(), "day", (short) 7);
        setField(term4264057, term4264057.getClass(), "date", term4264058);
        setByteField(term4264062, term4264062.getClass(), "hour", (byte) 1);
        setByteField(term4264062, term4264062.getClass(), "minute", (byte) 22);
        setByteField(term4264062, term4264062.getClass(), "second", (byte) 13);
        setIntField(term4264062, term4264062.getClass(), "nano", 962435596);
        setField(term4264057, term4264057.getClass(), "time", term4264062);
        setField(term4264041, term4264041.getClass(), "registerTime", term4264057);
        setIntField(term4264068, term4264068.getClass(), "year", 2028);
        setShortField(term4264068, term4264068.getClass(), "month", (short) 10);
        setShortField(term4264068, term4264068.getClass(), "day", (short) 2);
        setField(term4264067, term4264067.getClass(), "date", term4264068);
        setByteField(term4264072, term4264072.getClass(), "hour", (byte) 2);
        setByteField(term4264072, term4264072.getClass(), "minute", (byte) 13);
        setByteField(term4264072, term4264072.getClass(), "second", (byte) 52);
        setIntField(term4264072, term4264072.getClass(), "nano", 816639339);
        setField(term4264067, term4264067.getClass(), "time", term4264072);
        setField(term4264041, term4264041.getClass(), "accessTime", term4264067);
        setField(term4264039, term4264039.getClass(), "card", term4264041);
        setField(term4264039, term4264039.getClass(), "userName", "ytcwgxgdde");
        setIntField(term4264039, term4264039.getClass(), "isNetMember", -825558212);
        setIntField(term4264039, term4264039.getClass(), "iconId", 1154531988);
        setIntField(term4264039, term4264039.getClass(), "plateId", 2135961938);
        setIntField(term4264039, term4264039.getClass(), "titleId", -580925996);
        setIntField(term4264039, term4264039.getClass(), "partnerId", -667826434);
        setIntField(term4264039, term4264039.getClass(), "frameId", 1608911245);
        setIntField(term4264039, term4264039.getClass(), "selectMapId", 802366497);
        setIntField(term4264039, term4264039.getClass(), "totalAwake", -2070378150);
        setIntField(term4264039, term4264039.getClass(), "gradeRating", -216314469);
        setIntField(term4264039, term4264039.getClass(), "musicRating", -384073146);
        setIntField(term4264039, term4264039.getClass(), "playerRating", 294008965);
        setIntField(term4264039, term4264039.getClass(), "highestRating", -1473982868);
        setIntField(term4264039, term4264039.getClass(), "gradeRank", -1458823816);
        setIntField(term4264039, term4264039.getClass(), "classRank", -1253837779);
        setIntField(term4264039, term4264039.getClass(), "courseRank", 1705988900);
        setField(term4264039, term4264039.getClass(), "charaSlot", term4264104);
        setField(term4264039, term4264039.getClass(), "charaLockSlot", term4264118);
        setLongField(term4264039, term4264039.getClass(), "contentBit", -5187018443244701845L);
        setIntField(term4264039, term4264039.getClass(), "playCount", -863751544);
        setField(term4264039, term4264039.getClass(), "eventWatchedDate", "ZAiVMFdBWv");
        setField(term4264039, term4264039.getClass(), "lastGameId", "IOFHvronGp");
        setField(term4264039, term4264039.getClass(), "lastRomVersion", "naBVwklYQf");
        setField(term4264039, term4264039.getClass(), "lastDataVersion", "wxzWkIgrcj");
        setField(term4264039, term4264039.getClass(), "lastLoginDate", "jAgGQzAtJK");
        setField(term4264039, term4264039.getClass(), "lastPlayDate", "ylUWNjQnRY");
        setIntField(term4264039, term4264039.getClass(), "lastPlayCredit", -1786708792);
        setIntField(term4264039, term4264039.getClass(), "lastPlayMode", -256159594);
        setIntField(term4264039, term4264039.getClass(), "lastPlaceId", -1131855790);
        setField(term4264039, term4264039.getClass(), "lastPlaceName", "TtYjVTGyvd");
        setIntField(term4264039, term4264039.getClass(), "lastAllNetId", -340562874);
        setIntField(term4264039, term4264039.getClass(), "lastRegionId", 1647218977);
        setField(term4264039, term4264039.getClass(), "lastRegionName", "LZCCKNfouD");
        setField(term4264039, term4264039.getClass(), "lastClientId", "xCQRKPvGgJ");
        setField(term4264039, term4264039.getClass(), "lastCountryCode", "izPmYPPoyz");
        setIntField(term4264039, term4264039.getClass(), "lastSelectEMoney", -1954544453);
        setIntField(term4264039, term4264039.getClass(), "lastSelectTicket", -815056951);
        setIntField(term4264039, term4264039.getClass(), "lastSelectCourse", 1514346244);
        setIntField(term4264039, term4264039.getClass(), "lastCountCourse", -1076138932);
        setField(term4264039, term4264039.getClass(), "firstGameId", "dQYXXYiAqp");
        setField(term4264039, term4264039.getClass(), "firstRomVersion", "kefQpDCvyr");
        setField(term4264039, term4264039.getClass(), "firstDataVersion", "nxuLSqNNXQ");
        setField(term4264039, term4264039.getClass(), "firstPlayDate", "OeLOCLeTIK");
        setField(term4264039, term4264039.getClass(), "compatibleCmVersion", "GImhQUWNfV");
        setField(term4264039, term4264039.getClass(), "dailyBonusDate", "mkuHCpPtpy");
        setField(term4264039, term4264039.getClass(), "dailyCourseBonusDate", "fAXcoUuzaW");
        setField(term4264039, term4264039.getClass(), "lastPairLoginDate", "flNclQoBxA");
        setField(term4264039, term4264039.getClass(), "lastTrialPlayDate", "QtYLZwyxSX");
        setIntField(term4264039, term4264039.getClass(), "playVsCount", -1056905212);
        setIntField(term4264039, term4264039.getClass(), "playSyncCount", -164075623);
        setIntField(term4264039, term4264039.getClass(), "winCount", -1348660027);
        setIntField(term4264039, term4264039.getClass(), "helpCount", -1743941028);
        setIntField(term4264039, term4264039.getClass(), "comboCount", 400902793);
        setLongField(term4264039, term4264039.getClass(), "totalDeluxscore", -2983598074781119340L);
        setLongField(term4264039, term4264039.getClass(), "totalBasicDeluxscore", 2905182396370521974L);
        setLongField(term4264039, term4264039.getClass(), "totalAdvancedDeluxscore", -3627588983618520645L);
        setLongField(term4264039, term4264039.getClass(), "totalExpertDeluxscore", 5898831654969134681L);
        setLongField(term4264039, term4264039.getClass(), "totalMasterDeluxscore", -7791393287273803571L);
        setLongField(term4264039, term4264039.getClass(), "totalReMasterDeluxscore", -170879552878706481L);
        setIntField(term4264039, term4264039.getClass(), "totalSync", -1505183139);
        setIntField(term4264039, term4264039.getClass(), "totalBasicSync", -1054627242);
        setIntField(term4264039, term4264039.getClass(), "totalAdvancedSync", 365022465);
        setIntField(term4264039, term4264039.getClass(), "totalExpertSync", 1986586580);
        setIntField(term4264039, term4264039.getClass(), "totalMasterSync", 2119912623);
        setIntField(term4264039, term4264039.getClass(), "totalReMasterSync", 1826863538);
        setLongField(term4264039, term4264039.getClass(), "totalAchievement", 6461039008357361065L);
        setLongField(term4264039, term4264039.getClass(), "totalBasicAchievement", -1650993002676630380L);
        setLongField(term4264039, term4264039.getClass(), "totalAdvancedAchievement", -87180407180046391L);
        setLongField(term4264039, term4264039.getClass(), "totalExpertAchievement", -5617601205303158742L);
        setLongField(term4264039, term4264039.getClass(), "totalMasterAchievement", -3786729681851489881L);
        setLongField(term4264039, term4264039.getClass(), "totalReMasterAchievement", -2589510826171389223L);
        setLongField(term4264039, term4264039.getClass(), "playerOldRating", 6413912054123967069L);
        setLongField(term4264039, term4264039.getClass(), "playerNewRating", -4896533453275297546L);
        setIntField(term4264039, term4264039.getClass(), "banState", -1611374563);
        setLongField(term4264039, term4264039.getClass(), "dateTime", -6847712109306110581L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalSync", argTypes, term4264039, args);
    }

};


