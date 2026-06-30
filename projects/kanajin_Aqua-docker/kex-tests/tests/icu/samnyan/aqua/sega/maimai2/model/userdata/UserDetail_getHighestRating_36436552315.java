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

public class UserDetail_getHighestRating_36436552315 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term203587;

    public UserDetail_getHighestRating_36436552315() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term203591 = new Long(3731931947533293029L);
        Integer term203654 = new Integer(-2128082017);
        ArrayList term203652 = new ArrayList();
        ((ArrayList) term203652).add(term203654);
        Integer term203660 = new Integer(-626860638);
        Integer term203662 = new Integer(969445811);
        Integer term203664 = new Integer(-1232355383);
        Integer term203666 = new Integer(1599985157);
        Integer term203668 = new Integer(80735812);
        Integer term203670 = new Integer(1616706735);
        Integer term203672 = new Integer(-445244024);
        Integer term203674 = new Integer(-1836568689);
        ArrayList term203658 = new ArrayList();
        ((ArrayList) term203658).add(term203660);
        ((ArrayList) term203658).add(term203662);
        ((ArrayList) term203658).add(term203664);
        ((ArrayList) term203658).add(term203666);
        ((ArrayList) term203658).add(term203668);
        ((ArrayList) term203658).add(term203670);
        ((ArrayList) term203658).add(term203672);
        ((ArrayList) term203658).add(term203674);
        term203587 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term203589 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term203605 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term203606 = newInstance(Class.forName("java.time.LocalDate"));
        Object term203610 = newInstance(Class.forName("java.time.LocalTime"));
        Object term203615 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term203616 = newInstance(Class.forName("java.time.LocalDate"));
        Object term203620 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term203587, term203587.getClass(), "id", -699732253235761101L);
        setLongField(term203589, term203589.getClass(), "id", -7258287095782966034L);
        setField(term203589, term203589.getClass(), "extId", term203591);
        setField(term203589, term203589.getClass(), "luid", "lvhWpqyoYG");
        setIntField(term203606, term203606.getClass(), "year", 2017);
        setShortField(term203606, term203606.getClass(), "month", (short) 2);
        setShortField(term203606, term203606.getClass(), "day", (short) 9);
        setField(term203605, term203605.getClass(), "date", term203606);
        setByteField(term203610, term203610.getClass(), "hour", (byte) 16);
        setByteField(term203610, term203610.getClass(), "minute", (byte) 11);
        setByteField(term203610, term203610.getClass(), "second", (byte) 59);
        setIntField(term203610, term203610.getClass(), "nano", 660290526);
        setField(term203605, term203605.getClass(), "time", term203610);
        setField(term203589, term203589.getClass(), "registerTime", term203605);
        setIntField(term203616, term203616.getClass(), "year", 2013);
        setShortField(term203616, term203616.getClass(), "month", (short) 8);
        setShortField(term203616, term203616.getClass(), "day", (short) 19);
        setField(term203615, term203615.getClass(), "date", term203616);
        setByteField(term203620, term203620.getClass(), "hour", (byte) 23);
        setByteField(term203620, term203620.getClass(), "minute", (byte) 0);
        setByteField(term203620, term203620.getClass(), "second", (byte) 13);
        setIntField(term203620, term203620.getClass(), "nano", 134992386);
        setField(term203615, term203615.getClass(), "time", term203620);
        setField(term203589, term203589.getClass(), "accessTime", term203615);
        setField(term203587, term203587.getClass(), "card", term203589);
        setField(term203587, term203587.getClass(), "userName", "HMnGeMHNnH");
        setIntField(term203587, term203587.getClass(), "isNetMember", 86106790);
        setIntField(term203587, term203587.getClass(), "iconId", -1239672206);
        setIntField(term203587, term203587.getClass(), "plateId", -909873191);
        setIntField(term203587, term203587.getClass(), "titleId", -17106495);
        setIntField(term203587, term203587.getClass(), "partnerId", -1205540932);
        setIntField(term203587, term203587.getClass(), "frameId", -1477355747);
        setIntField(term203587, term203587.getClass(), "selectMapId", -1041405094);
        setIntField(term203587, term203587.getClass(), "totalAwake", -2004362129);
        setIntField(term203587, term203587.getClass(), "gradeRating", 1709267900);
        setIntField(term203587, term203587.getClass(), "musicRating", -2036597343);
        setIntField(term203587, term203587.getClass(), "playerRating", -988488193);
        setIntField(term203587, term203587.getClass(), "highestRating", -910318730);
        setIntField(term203587, term203587.getClass(), "gradeRank", -1198085025);
        setIntField(term203587, term203587.getClass(), "classRank", -1420655161);
        setIntField(term203587, term203587.getClass(), "courseRank", 559777465);
        setField(term203587, term203587.getClass(), "charaSlot", term203652);
        setField(term203587, term203587.getClass(), "charaLockSlot", term203658);
        setLongField(term203587, term203587.getClass(), "contentBit", 95126305293354093L);
        setIntField(term203587, term203587.getClass(), "playCount", 965262203);
        setField(term203587, term203587.getClass(), "eventWatchedDate", "UUmHKDSCMT");
        setField(term203587, term203587.getClass(), "lastGameId", "WXmWNJiHvn");
        setField(term203587, term203587.getClass(), "lastRomVersion", "bVCerjjUoe");
        setField(term203587, term203587.getClass(), "lastDataVersion", "LdCnyLLJLt");
        setField(term203587, term203587.getClass(), "lastLoginDate", "jmVRvbyUiV");
        setField(term203587, term203587.getClass(), "lastPlayDate", "mCjXzizWkB");
        setIntField(term203587, term203587.getClass(), "lastPlayCredit", 1569464081);
        setIntField(term203587, term203587.getClass(), "lastPlayMode", 1899979707);
        setIntField(term203587, term203587.getClass(), "lastPlaceId", -379153640);
        setField(term203587, term203587.getClass(), "lastPlaceName", "aHBChNyLfT");
        setIntField(term203587, term203587.getClass(), "lastAllNetId", 2059143976);
        setIntField(term203587, term203587.getClass(), "lastRegionId", -855871020);
        setField(term203587, term203587.getClass(), "lastRegionName", "QjcelbYsLz");
        setField(term203587, term203587.getClass(), "lastClientId", "RAxKFeZvmg");
        setField(term203587, term203587.getClass(), "lastCountryCode", "iwreWNsHUJ");
        setIntField(term203587, term203587.getClass(), "lastSelectEMoney", 294740259);
        setIntField(term203587, term203587.getClass(), "lastSelectTicket", -843479862);
        setIntField(term203587, term203587.getClass(), "lastSelectCourse", -1178581916);
        setIntField(term203587, term203587.getClass(), "lastCountCourse", -1533008285);
        setField(term203587, term203587.getClass(), "firstGameId", "rdRsnXsoyn");
        setField(term203587, term203587.getClass(), "firstRomVersion", "wPiKSHAfNN");
        setField(term203587, term203587.getClass(), "firstDataVersion", "pozUDtZicM");
        setField(term203587, term203587.getClass(), "firstPlayDate", "ClOHNQfMBt");
        setField(term203587, term203587.getClass(), "compatibleCmVersion", "wmGHOMaZMz");
        setField(term203587, term203587.getClass(), "dailyBonusDate", "StwnIPgnrO");
        setField(term203587, term203587.getClass(), "dailyCourseBonusDate", "VJxpQdocmB");
        setField(term203587, term203587.getClass(), "lastPairLoginDate", "nySDwbsteb");
        setField(term203587, term203587.getClass(), "lastTrialPlayDate", "NQxSeIhzbf");
        setIntField(term203587, term203587.getClass(), "playVsCount", -317721741);
        setIntField(term203587, term203587.getClass(), "playSyncCount", 603089761);
        setIntField(term203587, term203587.getClass(), "winCount", 357209284);
        setIntField(term203587, term203587.getClass(), "helpCount", -1561404518);
        setIntField(term203587, term203587.getClass(), "comboCount", 1567499135);
        setLongField(term203587, term203587.getClass(), "totalDeluxscore", -2836116440995051104L);
        setLongField(term203587, term203587.getClass(), "totalBasicDeluxscore", 3052424490591601427L);
        setLongField(term203587, term203587.getClass(), "totalAdvancedDeluxscore", 2826450205224042980L);
        setLongField(term203587, term203587.getClass(), "totalExpertDeluxscore", -5867652514921287694L);
        setLongField(term203587, term203587.getClass(), "totalMasterDeluxscore", -3892209833459216794L);
        setLongField(term203587, term203587.getClass(), "totalReMasterDeluxscore", 6647398985586664971L);
        setIntField(term203587, term203587.getClass(), "totalSync", 1468757593);
        setIntField(term203587, term203587.getClass(), "totalBasicSync", -1645647552);
        setIntField(term203587, term203587.getClass(), "totalAdvancedSync", 1876056340);
        setIntField(term203587, term203587.getClass(), "totalExpertSync", -114566575);
        setIntField(term203587, term203587.getClass(), "totalMasterSync", -415161512);
        setIntField(term203587, term203587.getClass(), "totalReMasterSync", -638764759);
        setLongField(term203587, term203587.getClass(), "totalAchievement", -8292559159601562342L);
        setLongField(term203587, term203587.getClass(), "totalBasicAchievement", -2497823560091110830L);
        setLongField(term203587, term203587.getClass(), "totalAdvancedAchievement", 8266352916277191587L);
        setLongField(term203587, term203587.getClass(), "totalExpertAchievement", 3379680155855476403L);
        setLongField(term203587, term203587.getClass(), "totalMasterAchievement", -5310978420460518408L);
        setLongField(term203587, term203587.getClass(), "totalReMasterAchievement", 4031153279089654101L);
        setLongField(term203587, term203587.getClass(), "playerOldRating", 582346301604665157L);
        setLongField(term203587, term203587.getClass(), "playerNewRating", -6949644321844804575L);
        setIntField(term203587, term203587.getClass(), "banState", -1643368171);
        setLongField(term203587, term203587.getClass(), "dateTime", -8730986987759901938L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHighestRating", argTypes, term203587, args);
    }

};


