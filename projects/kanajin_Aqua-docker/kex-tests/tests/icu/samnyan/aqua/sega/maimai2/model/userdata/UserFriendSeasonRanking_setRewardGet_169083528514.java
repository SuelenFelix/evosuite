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
import java.lang.Boolean;

public class UserFriendSeasonRanking_setRewardGet_169083528514 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23777;
     Object term24162;

    public UserFriendSeasonRanking_setRewardGet_169083528514() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term23783 = new Long(4178434741742309755L);
        Integer term23846 = new Integer(-1268314569);
        Integer term23848 = new Integer(877649659);
        Integer term23850 = new Integer(-1332748804);
        Integer term23852 = new Integer(1774507971);
        Integer term23854 = new Integer(-1420269858);
        Integer term23856 = new Integer(-2119545015);
        Integer term23858 = new Integer(1272542218);
        ArrayList term23844 = new ArrayList();
        ((ArrayList) term23844).add(term23846);
        ((ArrayList) term23844).add(term23848);
        ((ArrayList) term23844).add(term23850);
        ((ArrayList) term23844).add(term23852);
        ((ArrayList) term23844).add(term23854);
        ((ArrayList) term23844).add(term23856);
        ((ArrayList) term23844).add(term23858);
        Integer term23864 = new Integer(1209799204);
        ArrayList term23862 = new ArrayList();
        ((ArrayList) term23862).add(term23864);
        term23777 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserFriendSeasonRanking"));
        Object term23779 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term23781 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term23797 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term23798 = newInstance(Class.forName("java.time.LocalDate"));
        Object term23802 = newInstance(Class.forName("java.time.LocalTime"));
        Object term23807 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term23808 = newInstance(Class.forName("java.time.LocalDate"));
        Object term23812 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term23777, term23777.getClass(), "id", -7148236042086608592L);
        setLongField(term23779, term23779.getClass(), "id", 7716258711075652753L);
        setLongField(term23781, term23781.getClass(), "id", -3988042285731673145L);
        setField(term23781, term23781.getClass(), "extId", term23783);
        setField(term23781, term23781.getClass(), "luid", "VWPFyrpmmb");
        setIntField(term23798, term23798.getClass(), "year", 2011);
        setShortField(term23798, term23798.getClass(), "month", (short) 4);
        setShortField(term23798, term23798.getClass(), "day", (short) 19);
        setField(term23797, term23797.getClass(), "date", term23798);
        setByteField(term23802, term23802.getClass(), "hour", (byte) 12);
        setByteField(term23802, term23802.getClass(), "minute", (byte) 0);
        setByteField(term23802, term23802.getClass(), "second", (byte) 14);
        setIntField(term23802, term23802.getClass(), "nano", 849079063);
        setField(term23797, term23797.getClass(), "time", term23802);
        setField(term23781, term23781.getClass(), "registerTime", term23797);
        setIntField(term23808, term23808.getClass(), "year", 2014);
        setShortField(term23808, term23808.getClass(), "month", (short) 8);
        setShortField(term23808, term23808.getClass(), "day", (short) 17);
        setField(term23807, term23807.getClass(), "date", term23808);
        setByteField(term23812, term23812.getClass(), "hour", (byte) 19);
        setByteField(term23812, term23812.getClass(), "minute", (byte) 32);
        setByteField(term23812, term23812.getClass(), "second", (byte) 5);
        setIntField(term23812, term23812.getClass(), "nano", 604713831);
        setField(term23807, term23807.getClass(), "time", term23812);
        setField(term23781, term23781.getClass(), "accessTime", term23807);
        setField(term23779, term23779.getClass(), "card", term23781);
        setField(term23779, term23779.getClass(), "userName", "gYYKrIeThw");
        setIntField(term23779, term23779.getClass(), "isNetMember", 1641117123);
        setIntField(term23779, term23779.getClass(), "iconId", -1084408453);
        setIntField(term23779, term23779.getClass(), "plateId", -1466822773);
        setIntField(term23779, term23779.getClass(), "titleId", -230022261);
        setIntField(term23779, term23779.getClass(), "partnerId", 831967494);
        setIntField(term23779, term23779.getClass(), "frameId", -1858635791);
        setIntField(term23779, term23779.getClass(), "selectMapId", 1919079331);
        setIntField(term23779, term23779.getClass(), "totalAwake", 144872711);
        setIntField(term23779, term23779.getClass(), "gradeRating", -720037395);
        setIntField(term23779, term23779.getClass(), "musicRating", 1232105469);
        setIntField(term23779, term23779.getClass(), "playerRating", -1547322575);
        setIntField(term23779, term23779.getClass(), "highestRating", -61444233);
        setIntField(term23779, term23779.getClass(), "gradeRank", -400720912);
        setIntField(term23779, term23779.getClass(), "classRank", 1266192397);
        setIntField(term23779, term23779.getClass(), "courseRank", 218346781);
        setField(term23779, term23779.getClass(), "charaSlot", term23844);
        setField(term23779, term23779.getClass(), "charaLockSlot", term23862);
        setLongField(term23779, term23779.getClass(), "contentBit", 1729206737148270563L);
        setIntField(term23779, term23779.getClass(), "playCount", -984660976);
        setField(term23779, term23779.getClass(), "eventWatchedDate", "UsxeLMVkAK");
        setField(term23779, term23779.getClass(), "lastGameId", "ITrhiKKzcb");
        setField(term23779, term23779.getClass(), "lastRomVersion", "qMKmSzOQXg");
        setField(term23779, term23779.getClass(), "lastDataVersion", "CURQCMkqbZ");
        setField(term23779, term23779.getClass(), "lastLoginDate", "VZwkkQktrm");
        setField(term23779, term23779.getClass(), "lastPlayDate", "wIuJvIvEMb");
        setIntField(term23779, term23779.getClass(), "lastPlayCredit", -1419341969);
        setIntField(term23779, term23779.getClass(), "lastPlayMode", -89522625);
        setIntField(term23779, term23779.getClass(), "lastPlaceId", 1475906894);
        setField(term23779, term23779.getClass(), "lastPlaceName", "EyojsbSjWT");
        setIntField(term23779, term23779.getClass(), "lastAllNetId", -2004794532);
        setIntField(term23779, term23779.getClass(), "lastRegionId", 1232958763);
        setField(term23779, term23779.getClass(), "lastRegionName", "szGicGyWDL");
        setField(term23779, term23779.getClass(), "lastClientId", "lkdvUiYwRq");
        setField(term23779, term23779.getClass(), "lastCountryCode", "XuxkPrpfND");
        setIntField(term23779, term23779.getClass(), "lastSelectEMoney", -1702132549);
        setIntField(term23779, term23779.getClass(), "lastSelectTicket", -1786136772);
        setIntField(term23779, term23779.getClass(), "lastSelectCourse", -1510967747);
        setIntField(term23779, term23779.getClass(), "lastCountCourse", -2014792457);
        setField(term23779, term23779.getClass(), "firstGameId", "OxNXeKMDje");
        setField(term23779, term23779.getClass(), "firstRomVersion", "hGTqHomrbc");
        setField(term23779, term23779.getClass(), "firstDataVersion", "NNMBrIWEBw");
        setField(term23779, term23779.getClass(), "firstPlayDate", "GrTaccOQzl");
        setField(term23779, term23779.getClass(), "compatibleCmVersion", "uuSYOUCVHU");
        setField(term23779, term23779.getClass(), "dailyBonusDate", "DfWwbodtVw");
        setField(term23779, term23779.getClass(), "dailyCourseBonusDate", "kTbFMpVWqx");
        setField(term23779, term23779.getClass(), "lastPairLoginDate", "HegRNsidFg");
        setField(term23779, term23779.getClass(), "lastTrialPlayDate", "udRdJkgXmH");
        setIntField(term23779, term23779.getClass(), "playVsCount", 1957633116);
        setIntField(term23779, term23779.getClass(), "playSyncCount", 1428598210);
        setIntField(term23779, term23779.getClass(), "winCount", 1071776561);
        setIntField(term23779, term23779.getClass(), "helpCount", 1846399918);
        setIntField(term23779, term23779.getClass(), "comboCount", 35388821);
        setLongField(term23779, term23779.getClass(), "totalDeluxscore", -932981811228171529L);
        setLongField(term23779, term23779.getClass(), "totalBasicDeluxscore", 5817794709356277010L);
        setLongField(term23779, term23779.getClass(), "totalAdvancedDeluxscore", -205762347192500511L);
        setLongField(term23779, term23779.getClass(), "totalExpertDeluxscore", -4987344934532917085L);
        setLongField(term23779, term23779.getClass(), "totalMasterDeluxscore", 4832511106024339541L);
        setLongField(term23779, term23779.getClass(), "totalReMasterDeluxscore", 7840243516767232066L);
        setIntField(term23779, term23779.getClass(), "totalSync", -598803400);
        setIntField(term23779, term23779.getClass(), "totalBasicSync", 25560022);
        setIntField(term23779, term23779.getClass(), "totalAdvancedSync", -1090136985);
        setIntField(term23779, term23779.getClass(), "totalExpertSync", -355574894);
        setIntField(term23779, term23779.getClass(), "totalMasterSync", 1866941633);
        setIntField(term23779, term23779.getClass(), "totalReMasterSync", 1697296048);
        setLongField(term23779, term23779.getClass(), "totalAchievement", -4069312743655862444L);
        setLongField(term23779, term23779.getClass(), "totalBasicAchievement", 3233502115953753827L);
        setLongField(term23779, term23779.getClass(), "totalAdvancedAchievement", -308461294344616496L);
        setLongField(term23779, term23779.getClass(), "totalExpertAchievement", -6325201865655646423L);
        setLongField(term23779, term23779.getClass(), "totalMasterAchievement", -9093996849713569099L);
        setLongField(term23779, term23779.getClass(), "totalReMasterAchievement", -1234885562462779381L);
        setLongField(term23779, term23779.getClass(), "playerOldRating", 2678845111978352940L);
        setLongField(term23779, term23779.getClass(), "playerNewRating", 873013799050926004L);
        setIntField(term23779, term23779.getClass(), "banState", 1302075623);
        setLongField(term23779, term23779.getClass(), "dateTime", 132446939133186077L);
        setField(term23777, term23777.getClass(), "user", term23779);
        setIntField(term23777, term23777.getClass(), "seasonId", 1238707613);
        setIntField(term23777, term23777.getClass(), "point", 1961351136);
        setIntField(term23777, term23777.getClass(), "rank", -1546528470);
        setBooleanField(term23777, term23777.getClass(), "rewardGet", true);
        setField(term23777, term23777.getClass(), "userName", "FBCXbjHVXO");
        setField(term23777, term23777.getClass(), "recordDate", "dIWAnvmLiC");
        term24162 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserFriendSeasonRanking");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term24162;
        callMethod(klass, "setRewardGet", argTypes, term23777, args);
    }

};


