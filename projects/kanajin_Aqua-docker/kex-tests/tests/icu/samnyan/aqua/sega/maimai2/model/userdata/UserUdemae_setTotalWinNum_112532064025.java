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

public class UserUdemae_setTotalWinNum_112532064025 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term109547;
     Object term109920;

    public UserUdemae_setTotalWinNum_112532064025() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term109553 = new Long(-5447369594017685765L);
        Integer term109616 = new Integer(-1628481565);
        Integer term109618 = new Integer(-217226756);
        ArrayList term109614 = new ArrayList();
        ((ArrayList) term109614).add(term109616);
        ((ArrayList) term109614).add(term109618);
        Integer term109624 = new Integer(1608000247);
        Integer term109626 = new Integer(1354560887);
        Integer term109628 = new Integer(-749474542);
        Integer term109630 = new Integer(-47907780);
        Integer term109632 = new Integer(1131462369);
        Integer term109634 = new Integer(-1161206731);
        ArrayList term109622 = new ArrayList();
        ((ArrayList) term109622).add(term109624);
        ((ArrayList) term109622).add(term109626);
        ((ArrayList) term109622).add(term109628);
        ((ArrayList) term109622).add(term109630);
        ((ArrayList) term109622).add(term109632);
        ((ArrayList) term109622).add(term109634);
        term109547 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserUdemae"));
        Object term109549 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term109551 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term109567 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term109568 = newInstance(Class.forName("java.time.LocalDate"));
        Object term109572 = newInstance(Class.forName("java.time.LocalTime"));
        Object term109577 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term109578 = newInstance(Class.forName("java.time.LocalDate"));
        Object term109582 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term109547, term109547.getClass(), "id", -3413579640035550114L);
        setLongField(term109549, term109549.getClass(), "id", 4272894798367624363L);
        setLongField(term109551, term109551.getClass(), "id", -8629176539372583112L);
        setField(term109551, term109551.getClass(), "extId", term109553);
        setField(term109551, term109551.getClass(), "luid", "UtzMtwAaid");
        setIntField(term109568, term109568.getClass(), "year", 2012);
        setShortField(term109568, term109568.getClass(), "month", (short) 11);
        setShortField(term109568, term109568.getClass(), "day", (short) 23);
        setField(term109567, term109567.getClass(), "date", term109568);
        setByteField(term109572, term109572.getClass(), "hour", (byte) 21);
        setByteField(term109572, term109572.getClass(), "minute", (byte) 45);
        setByteField(term109572, term109572.getClass(), "second", (byte) 46);
        setIntField(term109572, term109572.getClass(), "nano", 484678696);
        setField(term109567, term109567.getClass(), "time", term109572);
        setField(term109551, term109551.getClass(), "registerTime", term109567);
        setIntField(term109578, term109578.getClass(), "year", 2027);
        setShortField(term109578, term109578.getClass(), "month", (short) 12);
        setShortField(term109578, term109578.getClass(), "day", (short) 25);
        setField(term109577, term109577.getClass(), "date", term109578);
        setByteField(term109582, term109582.getClass(), "hour", (byte) 8);
        setByteField(term109582, term109582.getClass(), "minute", (byte) 19);
        setByteField(term109582, term109582.getClass(), "second", (byte) 20);
        setIntField(term109582, term109582.getClass(), "nano", 127700185);
        setField(term109577, term109577.getClass(), "time", term109582);
        setField(term109551, term109551.getClass(), "accessTime", term109577);
        setField(term109549, term109549.getClass(), "card", term109551);
        setField(term109549, term109549.getClass(), "userName", "bchxgKxuUf");
        setIntField(term109549, term109549.getClass(), "isNetMember", -1015231314);
        setIntField(term109549, term109549.getClass(), "iconId", 2138487887);
        setIntField(term109549, term109549.getClass(), "plateId", 1608465153);
        setIntField(term109549, term109549.getClass(), "titleId", 1367934188);
        setIntField(term109549, term109549.getClass(), "partnerId", -1586790224);
        setIntField(term109549, term109549.getClass(), "frameId", 188981994);
        setIntField(term109549, term109549.getClass(), "selectMapId", -1348114075);
        setIntField(term109549, term109549.getClass(), "totalAwake", -1005643858);
        setIntField(term109549, term109549.getClass(), "gradeRating", 456312486);
        setIntField(term109549, term109549.getClass(), "musicRating", 1799058363);
        setIntField(term109549, term109549.getClass(), "playerRating", 216003694);
        setIntField(term109549, term109549.getClass(), "highestRating", -1542784975);
        setIntField(term109549, term109549.getClass(), "gradeRank", 1798581458);
        setIntField(term109549, term109549.getClass(), "classRank", -151417122);
        setIntField(term109549, term109549.getClass(), "courseRank", -2013771268);
        setField(term109549, term109549.getClass(), "charaSlot", term109614);
        setField(term109549, term109549.getClass(), "charaLockSlot", term109622);
        setLongField(term109549, term109549.getClass(), "contentBit", -4504123476834618959L);
        setIntField(term109549, term109549.getClass(), "playCount", 549034622);
        setField(term109549, term109549.getClass(), "eventWatchedDate", "mjXKuwKUyR");
        setField(term109549, term109549.getClass(), "lastGameId", "UfdjcAQclb");
        setField(term109549, term109549.getClass(), "lastRomVersion", "skKLlFIRTI");
        setField(term109549, term109549.getClass(), "lastDataVersion", "SfjOvqPCwx");
        setField(term109549, term109549.getClass(), "lastLoginDate", "rinBVtrpcr");
        setField(term109549, term109549.getClass(), "lastPlayDate", "KjCvQWfqew");
        setIntField(term109549, term109549.getClass(), "lastPlayCredit", 744233731);
        setIntField(term109549, term109549.getClass(), "lastPlayMode", 744742162);
        setIntField(term109549, term109549.getClass(), "lastPlaceId", 482514787);
        setField(term109549, term109549.getClass(), "lastPlaceName", "WewLrXvLmC");
        setIntField(term109549, term109549.getClass(), "lastAllNetId", -1042782085);
        setIntField(term109549, term109549.getClass(), "lastRegionId", -1231956438);
        setField(term109549, term109549.getClass(), "lastRegionName", "vbEYtFntxd");
        setField(term109549, term109549.getClass(), "lastClientId", "ZiYiKyRQTQ");
        setField(term109549, term109549.getClass(), "lastCountryCode", "aaACqoZRFl");
        setIntField(term109549, term109549.getClass(), "lastSelectEMoney", 1392725436);
        setIntField(term109549, term109549.getClass(), "lastSelectTicket", 1678969110);
        setIntField(term109549, term109549.getClass(), "lastSelectCourse", -312665712);
        setIntField(term109549, term109549.getClass(), "lastCountCourse", 1022077229);
        setField(term109549, term109549.getClass(), "firstGameId", "CtIecpnHzx");
        setField(term109549, term109549.getClass(), "firstRomVersion", "lgGoogCJeG");
        setField(term109549, term109549.getClass(), "firstDataVersion", "EyskfGpFOR");
        setField(term109549, term109549.getClass(), "firstPlayDate", "eEKpyfnNFi");
        setField(term109549, term109549.getClass(), "compatibleCmVersion", "WjMAISAxtn");
        setField(term109549, term109549.getClass(), "dailyBonusDate", "GiDsfCiYsm");
        setField(term109549, term109549.getClass(), "dailyCourseBonusDate", "RuvnkQFdLv");
        setField(term109549, term109549.getClass(), "lastPairLoginDate", "zAaRUjWcRI");
        setField(term109549, term109549.getClass(), "lastTrialPlayDate", "biuSELVcRS");
        setIntField(term109549, term109549.getClass(), "playVsCount", -1336430287);
        setIntField(term109549, term109549.getClass(), "playSyncCount", 1614467489);
        setIntField(term109549, term109549.getClass(), "winCount", 1306583181);
        setIntField(term109549, term109549.getClass(), "helpCount", -1162066181);
        setIntField(term109549, term109549.getClass(), "comboCount", 1058566964);
        setLongField(term109549, term109549.getClass(), "totalDeluxscore", 4324130988072072925L);
        setLongField(term109549, term109549.getClass(), "totalBasicDeluxscore", 1218466700428006458L);
        setLongField(term109549, term109549.getClass(), "totalAdvancedDeluxscore", 2910835673340027471L);
        setLongField(term109549, term109549.getClass(), "totalExpertDeluxscore", 7535740177428257169L);
        setLongField(term109549, term109549.getClass(), "totalMasterDeluxscore", -217553849551393777L);
        setLongField(term109549, term109549.getClass(), "totalReMasterDeluxscore", -4567914077856781243L);
        setIntField(term109549, term109549.getClass(), "totalSync", 349842396);
        setIntField(term109549, term109549.getClass(), "totalBasicSync", 1156977610);
        setIntField(term109549, term109549.getClass(), "totalAdvancedSync", -800343585);
        setIntField(term109549, term109549.getClass(), "totalExpertSync", 1248328125);
        setIntField(term109549, term109549.getClass(), "totalMasterSync", 395562077);
        setIntField(term109549, term109549.getClass(), "totalReMasterSync", -294800497);
        setLongField(term109549, term109549.getClass(), "totalAchievement", -3772628385704266817L);
        setLongField(term109549, term109549.getClass(), "totalBasicAchievement", 3674075662000201844L);
        setLongField(term109549, term109549.getClass(), "totalAdvancedAchievement", 5265812777907707400L);
        setLongField(term109549, term109549.getClass(), "totalExpertAchievement", 7752215053758781516L);
        setLongField(term109549, term109549.getClass(), "totalMasterAchievement", 2100213380733826749L);
        setLongField(term109549, term109549.getClass(), "totalReMasterAchievement", 6920150385523223759L);
        setLongField(term109549, term109549.getClass(), "playerOldRating", -78405432235699904L);
        setLongField(term109549, term109549.getClass(), "playerNewRating", -1742227387713986859L);
        setIntField(term109549, term109549.getClass(), "banState", 979334169);
        setLongField(term109549, term109549.getClass(), "dateTime", -6767834419480442076L);
        setField(term109547, term109547.getClass(), "user", term109549);
        setIntField(term109547, term109547.getClass(), "rate", 840412156);
        setIntField(term109547, term109547.getClass(), "maxRate", 788624942);
        setIntField(term109547, term109547.getClass(), "classValue", -1174113610);
        setIntField(term109547, term109547.getClass(), "maxClassValue", -438676054);
        setIntField(term109547, term109547.getClass(), "totalWinNum", -1032395364);
        setIntField(term109547, term109547.getClass(), "totalLoseNum", -552556865);
        setIntField(term109547, term109547.getClass(), "maxWinNum", -1908071026);
        setIntField(term109547, term109547.getClass(), "maxLoseNum", 737590127);
        setIntField(term109547, term109547.getClass(), "winNum", 1091000908);
        setIntField(term109547, term109547.getClass(), "loseNum", 417959197);
        setIntField(term109547, term109547.getClass(), "npcTotalWinNum", 736672515);
        setIntField(term109547, term109547.getClass(), "npcTotalLoseNum", 1093266289);
        setIntField(term109547, term109547.getClass(), "npcMaxWinNum", -1407865478);
        setIntField(term109547, term109547.getClass(), "npcMaxLoseNum", 1207025764);
        setIntField(term109547, term109547.getClass(), "npcWinNum", -220584965);
        setIntField(term109547, term109547.getClass(), "npcLoseNum", -1579060613);
        term109920 = new Integer(-975355295);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserUdemae");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term109920;
        callMethod(klass, "setTotalWinNum", argTypes, term109547, args);
    }

};


