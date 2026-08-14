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

public class UserDetail_getHighestRating_36436552314 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term203532;

    public UserDetail_getHighestRating_36436552314() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term203536 = new Long(3731931947533293029L);
        Integer term203599 = new Integer(-2128082017);
        ArrayList term203597 = new ArrayList();
        ((ArrayList) term203597).add(term203599);
        Integer term203605 = new Integer(-626860638);
        Integer term203607 = new Integer(969445811);
        Integer term203609 = new Integer(-1232355383);
        Integer term203611 = new Integer(1599985157);
        Integer term203613 = new Integer(80735812);
        Integer term203615 = new Integer(1616706735);
        Integer term203617 = new Integer(-445244024);
        Integer term203619 = new Integer(-1836568689);
        ArrayList term203603 = new ArrayList();
        ((ArrayList) term203603).add(term203605);
        ((ArrayList) term203603).add(term203607);
        ((ArrayList) term203603).add(term203609);
        ((ArrayList) term203603).add(term203611);
        ((ArrayList) term203603).add(term203613);
        ((ArrayList) term203603).add(term203615);
        ((ArrayList) term203603).add(term203617);
        ((ArrayList) term203603).add(term203619);
        term203532 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term203534 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term203550 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term203551 = newInstance(Class.forName("java.time.LocalDate"));
        Object term203555 = newInstance(Class.forName("java.time.LocalTime"));
        Object term203560 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term203561 = newInstance(Class.forName("java.time.LocalDate"));
        Object term203565 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term203532, term203532.getClass(), "id", -699732253235761101L);
        setLongField(term203534, term203534.getClass(), "id", -7258287095782966034L);
        setField(term203534, term203534.getClass(), "extId", term203536);
        setField(term203534, term203534.getClass(), "luid", "lvhWpqyoYG");
        setIntField(term203551, term203551.getClass(), "year", 2017);
        setShortField(term203551, term203551.getClass(), "month", (short) 2);
        setShortField(term203551, term203551.getClass(), "day", (short) 9);
        setField(term203550, term203550.getClass(), "date", term203551);
        setByteField(term203555, term203555.getClass(), "hour", (byte) 16);
        setByteField(term203555, term203555.getClass(), "minute", (byte) 11);
        setByteField(term203555, term203555.getClass(), "second", (byte) 59);
        setIntField(term203555, term203555.getClass(), "nano", 660290526);
        setField(term203550, term203550.getClass(), "time", term203555);
        setField(term203534, term203534.getClass(), "registerTime", term203550);
        setIntField(term203561, term203561.getClass(), "year", 2013);
        setShortField(term203561, term203561.getClass(), "month", (short) 8);
        setShortField(term203561, term203561.getClass(), "day", (short) 19);
        setField(term203560, term203560.getClass(), "date", term203561);
        setByteField(term203565, term203565.getClass(), "hour", (byte) 23);
        setByteField(term203565, term203565.getClass(), "minute", (byte) 0);
        setByteField(term203565, term203565.getClass(), "second", (byte) 13);
        setIntField(term203565, term203565.getClass(), "nano", 134992386);
        setField(term203560, term203560.getClass(), "time", term203565);
        setField(term203534, term203534.getClass(), "accessTime", term203560);
        setField(term203532, term203532.getClass(), "card", term203534);
        setField(term203532, term203532.getClass(), "userName", "HMnGeMHNnH");
        setIntField(term203532, term203532.getClass(), "isNetMember", 86106790);
        setIntField(term203532, term203532.getClass(), "iconId", -1239672206);
        setIntField(term203532, term203532.getClass(), "plateId", -909873191);
        setIntField(term203532, term203532.getClass(), "titleId", -17106495);
        setIntField(term203532, term203532.getClass(), "partnerId", -1205540932);
        setIntField(term203532, term203532.getClass(), "frameId", -1477355747);
        setIntField(term203532, term203532.getClass(), "selectMapId", -1041405094);
        setIntField(term203532, term203532.getClass(), "totalAwake", -2004362129);
        setIntField(term203532, term203532.getClass(), "gradeRating", 1709267900);
        setIntField(term203532, term203532.getClass(), "musicRating", -2036597343);
        setIntField(term203532, term203532.getClass(), "playerRating", -988488193);
        setIntField(term203532, term203532.getClass(), "highestRating", -910318730);
        setIntField(term203532, term203532.getClass(), "gradeRank", -1198085025);
        setIntField(term203532, term203532.getClass(), "classRank", -1420655161);
        setIntField(term203532, term203532.getClass(), "courseRank", 559777465);
        setField(term203532, term203532.getClass(), "charaSlot", term203597);
        setField(term203532, term203532.getClass(), "charaLockSlot", term203603);
        setLongField(term203532, term203532.getClass(), "contentBit", 95126305293354093L);
        setIntField(term203532, term203532.getClass(), "playCount", 965262203);
        setField(term203532, term203532.getClass(), "eventWatchedDate", "UUmHKDSCMT");
        setField(term203532, term203532.getClass(), "lastGameId", "WXmWNJiHvn");
        setField(term203532, term203532.getClass(), "lastRomVersion", "bVCerjjUoe");
        setField(term203532, term203532.getClass(), "lastDataVersion", "LdCnyLLJLt");
        setField(term203532, term203532.getClass(), "lastLoginDate", "jmVRvbyUiV");
        setField(term203532, term203532.getClass(), "lastPlayDate", "mCjXzizWkB");
        setIntField(term203532, term203532.getClass(), "lastPlayCredit", 1569464081);
        setIntField(term203532, term203532.getClass(), "lastPlayMode", 1899979707);
        setIntField(term203532, term203532.getClass(), "lastPlaceId", -379153640);
        setField(term203532, term203532.getClass(), "lastPlaceName", "aHBChNyLfT");
        setIntField(term203532, term203532.getClass(), "lastAllNetId", 2059143976);
        setIntField(term203532, term203532.getClass(), "lastRegionId", -855871020);
        setField(term203532, term203532.getClass(), "lastRegionName", "QjcelbYsLz");
        setField(term203532, term203532.getClass(), "lastClientId", "RAxKFeZvmg");
        setField(term203532, term203532.getClass(), "lastCountryCode", "iwreWNsHUJ");
        setIntField(term203532, term203532.getClass(), "lastSelectEMoney", 294740259);
        setIntField(term203532, term203532.getClass(), "lastSelectTicket", -843479862);
        setIntField(term203532, term203532.getClass(), "lastSelectCourse", -1178581916);
        setIntField(term203532, term203532.getClass(), "lastCountCourse", -1533008285);
        setField(term203532, term203532.getClass(), "firstGameId", "rdRsnXsoyn");
        setField(term203532, term203532.getClass(), "firstRomVersion", "wPiKSHAfNN");
        setField(term203532, term203532.getClass(), "firstDataVersion", "pozUDtZicM");
        setField(term203532, term203532.getClass(), "firstPlayDate", "ClOHNQfMBt");
        setField(term203532, term203532.getClass(), "compatibleCmVersion", "wmGHOMaZMz");
        setField(term203532, term203532.getClass(), "dailyBonusDate", "StwnIPgnrO");
        setField(term203532, term203532.getClass(), "dailyCourseBonusDate", "VJxpQdocmB");
        setField(term203532, term203532.getClass(), "lastPairLoginDate", "nySDwbsteb");
        setField(term203532, term203532.getClass(), "lastTrialPlayDate", "NQxSeIhzbf");
        setIntField(term203532, term203532.getClass(), "playVsCount", -317721741);
        setIntField(term203532, term203532.getClass(), "playSyncCount", 603089761);
        setIntField(term203532, term203532.getClass(), "winCount", 357209284);
        setIntField(term203532, term203532.getClass(), "helpCount", -1561404518);
        setIntField(term203532, term203532.getClass(), "comboCount", 1567499135);
        setLongField(term203532, term203532.getClass(), "totalDeluxscore", -2836116440995051104L);
        setLongField(term203532, term203532.getClass(), "totalBasicDeluxscore", 3052424490591601427L);
        setLongField(term203532, term203532.getClass(), "totalAdvancedDeluxscore", 2826450205224042980L);
        setLongField(term203532, term203532.getClass(), "totalExpertDeluxscore", -5867652514921287694L);
        setLongField(term203532, term203532.getClass(), "totalMasterDeluxscore", -3892209833459216794L);
        setLongField(term203532, term203532.getClass(), "totalReMasterDeluxscore", 6647398985586664971L);
        setIntField(term203532, term203532.getClass(), "totalSync", 1468757593);
        setIntField(term203532, term203532.getClass(), "totalBasicSync", -1645647552);
        setIntField(term203532, term203532.getClass(), "totalAdvancedSync", 1876056340);
        setIntField(term203532, term203532.getClass(), "totalExpertSync", -114566575);
        setIntField(term203532, term203532.getClass(), "totalMasterSync", -415161512);
        setIntField(term203532, term203532.getClass(), "totalReMasterSync", -638764759);
        setLongField(term203532, term203532.getClass(), "totalAchievement", -8292559159601562342L);
        setLongField(term203532, term203532.getClass(), "totalBasicAchievement", -2497823560091110830L);
        setLongField(term203532, term203532.getClass(), "totalAdvancedAchievement", 8266352916277191587L);
        setLongField(term203532, term203532.getClass(), "totalExpertAchievement", 3379680155855476403L);
        setLongField(term203532, term203532.getClass(), "totalMasterAchievement", -5310978420460518408L);
        setLongField(term203532, term203532.getClass(), "totalReMasterAchievement", 4031153279089654101L);
        setLongField(term203532, term203532.getClass(), "playerOldRating", 582346301604665157L);
        setLongField(term203532, term203532.getClass(), "playerNewRating", -6949644321844804575L);
        setIntField(term203532, term203532.getClass(), "banState", -1643368171);
        setLongField(term203532, term203532.getClass(), "dateTime", -8730986987759901938L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHighestRating", argTypes, term203532, args);
    }

};


