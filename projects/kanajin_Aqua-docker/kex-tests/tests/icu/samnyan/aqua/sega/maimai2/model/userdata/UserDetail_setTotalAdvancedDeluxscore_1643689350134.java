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

public class UserDetail_setTotalAdvancedDeluxscore_1643689350134 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4306031;
     Object term4306390;

    public UserDetail_setTotalAdvancedDeluxscore_1643689350134() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4306035 = new Long(8091751543255986624L);
        Integer term4306098 = new Integer(-1422276108);
        Integer term4306100 = new Integer(629145097);
        Integer term4306102 = new Integer(-1038526476);
        ArrayList term4306096 = new ArrayList();
        ((ArrayList) term4306096).add(term4306098);
        ((ArrayList) term4306096).add(term4306100);
        ((ArrayList) term4306096).add(term4306102);
        Integer term4306108 = new Integer(-1620249948);
        Integer term4306110 = new Integer(407409382);
        Integer term4306112 = new Integer(-434813900);
        Integer term4306114 = new Integer(-1591071874);
        Integer term4306116 = new Integer(-1309509159);
        Integer term4306118 = new Integer(876797689);
        Integer term4306120 = new Integer(-851468449);
        ArrayList term4306106 = new ArrayList();
        ((ArrayList) term4306106).add(term4306108);
        ((ArrayList) term4306106).add(term4306110);
        ((ArrayList) term4306106).add(term4306112);
        ((ArrayList) term4306106).add(term4306114);
        ((ArrayList) term4306106).add(term4306116);
        ((ArrayList) term4306106).add(term4306118);
        ((ArrayList) term4306106).add(term4306120);
        term4306031 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term4306033 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term4306049 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4306050 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4306054 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4306059 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4306060 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4306064 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term4306031, term4306031.getClass(), "id", -1007985008506546276L);
        setLongField(term4306033, term4306033.getClass(), "id", -3336654166229812745L);
        setField(term4306033, term4306033.getClass(), "extId", term4306035);
        setField(term4306033, term4306033.getClass(), "luid", "vmeEauStdM");
        setIntField(term4306050, term4306050.getClass(), "year", 2025);
        setShortField(term4306050, term4306050.getClass(), "month", (short) 6);
        setShortField(term4306050, term4306050.getClass(), "day", (short) 10);
        setField(term4306049, term4306049.getClass(), "date", term4306050);
        setByteField(term4306054, term4306054.getClass(), "hour", (byte) 1);
        setByteField(term4306054, term4306054.getClass(), "minute", (byte) 56);
        setByteField(term4306054, term4306054.getClass(), "second", (byte) 46);
        setIntField(term4306054, term4306054.getClass(), "nano", 326896201);
        setField(term4306049, term4306049.getClass(), "time", term4306054);
        setField(term4306033, term4306033.getClass(), "registerTime", term4306049);
        setIntField(term4306060, term4306060.getClass(), "year", 2024);
        setShortField(term4306060, term4306060.getClass(), "month", (short) 8);
        setShortField(term4306060, term4306060.getClass(), "day", (short) 10);
        setField(term4306059, term4306059.getClass(), "date", term4306060);
        setByteField(term4306064, term4306064.getClass(), "hour", (byte) 13);
        setByteField(term4306064, term4306064.getClass(), "minute", (byte) 8);
        setByteField(term4306064, term4306064.getClass(), "second", (byte) 11);
        setIntField(term4306064, term4306064.getClass(), "nano", 713775372);
        setField(term4306059, term4306059.getClass(), "time", term4306064);
        setField(term4306033, term4306033.getClass(), "accessTime", term4306059);
        setField(term4306031, term4306031.getClass(), "card", term4306033);
        setField(term4306031, term4306031.getClass(), "userName", "ejalBIOPBY");
        setIntField(term4306031, term4306031.getClass(), "isNetMember", -1128600577);
        setIntField(term4306031, term4306031.getClass(), "iconId", 1553487902);
        setIntField(term4306031, term4306031.getClass(), "plateId", -1771352506);
        setIntField(term4306031, term4306031.getClass(), "titleId", -1971082304);
        setIntField(term4306031, term4306031.getClass(), "partnerId", -2064843038);
        setIntField(term4306031, term4306031.getClass(), "frameId", 778575968);
        setIntField(term4306031, term4306031.getClass(), "selectMapId", 1442571755);
        setIntField(term4306031, term4306031.getClass(), "totalAwake", 399594923);
        setIntField(term4306031, term4306031.getClass(), "gradeRating", 761763862);
        setIntField(term4306031, term4306031.getClass(), "musicRating", 1934375877);
        setIntField(term4306031, term4306031.getClass(), "playerRating", 1413291819);
        setIntField(term4306031, term4306031.getClass(), "highestRating", -642521130);
        setIntField(term4306031, term4306031.getClass(), "gradeRank", -1774539965);
        setIntField(term4306031, term4306031.getClass(), "classRank", 986599320);
        setIntField(term4306031, term4306031.getClass(), "courseRank", 554429385);
        setField(term4306031, term4306031.getClass(), "charaSlot", term4306096);
        setField(term4306031, term4306031.getClass(), "charaLockSlot", term4306106);
        setLongField(term4306031, term4306031.getClass(), "contentBit", 7485484402694356922L);
        setIntField(term4306031, term4306031.getClass(), "playCount", 1570022563);
        setField(term4306031, term4306031.getClass(), "eventWatchedDate", "URGNRmKLtz");
        setField(term4306031, term4306031.getClass(), "lastGameId", "ioKRHwVLVH");
        setField(term4306031, term4306031.getClass(), "lastRomVersion", "ufrQNVvHDE");
        setField(term4306031, term4306031.getClass(), "lastDataVersion", "OzeqsUyVtL");
        setField(term4306031, term4306031.getClass(), "lastLoginDate", "FDVwTzlTbg");
        setField(term4306031, term4306031.getClass(), "lastPlayDate", "gcZrxxcuaF");
        setIntField(term4306031, term4306031.getClass(), "lastPlayCredit", 1858104662);
        setIntField(term4306031, term4306031.getClass(), "lastPlayMode", -436344434);
        setIntField(term4306031, term4306031.getClass(), "lastPlaceId", 396280278);
        setField(term4306031, term4306031.getClass(), "lastPlaceName", "TsyOZpcpry");
        setIntField(term4306031, term4306031.getClass(), "lastAllNetId", 72695326);
        setIntField(term4306031, term4306031.getClass(), "lastRegionId", 1481472677);
        setField(term4306031, term4306031.getClass(), "lastRegionName", "MOkuQrDAEZ");
        setField(term4306031, term4306031.getClass(), "lastClientId", "EuWFJLJqXM");
        setField(term4306031, term4306031.getClass(), "lastCountryCode", "xoCoBziSNG");
        setIntField(term4306031, term4306031.getClass(), "lastSelectEMoney", -1880812263);
        setIntField(term4306031, term4306031.getClass(), "lastSelectTicket", 398633080);
        setIntField(term4306031, term4306031.getClass(), "lastSelectCourse", 2004245878);
        setIntField(term4306031, term4306031.getClass(), "lastCountCourse", -600130731);
        setField(term4306031, term4306031.getClass(), "firstGameId", "MJTCVkELdl");
        setField(term4306031, term4306031.getClass(), "firstRomVersion", "bFIzLprfTj");
        setField(term4306031, term4306031.getClass(), "firstDataVersion", "bTUczCWwnx");
        setField(term4306031, term4306031.getClass(), "firstPlayDate", "bxUstUveLu");
        setField(term4306031, term4306031.getClass(), "compatibleCmVersion", "nhAgMMgEWs");
        setField(term4306031, term4306031.getClass(), "dailyBonusDate", "TnCPYnnKrC");
        setField(term4306031, term4306031.getClass(), "dailyCourseBonusDate", "uWrGwQUYsi");
        setField(term4306031, term4306031.getClass(), "lastPairLoginDate", "FIudWmzSsn");
        setField(term4306031, term4306031.getClass(), "lastTrialPlayDate", "DqRLmxYnGf");
        setIntField(term4306031, term4306031.getClass(), "playVsCount", -148868610);
        setIntField(term4306031, term4306031.getClass(), "playSyncCount", -933901076);
        setIntField(term4306031, term4306031.getClass(), "winCount", -254104152);
        setIntField(term4306031, term4306031.getClass(), "helpCount", 729721343);
        setIntField(term4306031, term4306031.getClass(), "comboCount", 516530213);
        setLongField(term4306031, term4306031.getClass(), "totalDeluxscore", 6633299644343763269L);
        setLongField(term4306031, term4306031.getClass(), "totalBasicDeluxscore", 9031827068622974107L);
        setLongField(term4306031, term4306031.getClass(), "totalAdvancedDeluxscore", 4439761427829125548L);
        setLongField(term4306031, term4306031.getClass(), "totalExpertDeluxscore", -1528350859020008869L);
        setLongField(term4306031, term4306031.getClass(), "totalMasterDeluxscore", 3396376570605696696L);
        setLongField(term4306031, term4306031.getClass(), "totalReMasterDeluxscore", 1561508167214145530L);
        setIntField(term4306031, term4306031.getClass(), "totalSync", -144186419);
        setIntField(term4306031, term4306031.getClass(), "totalBasicSync", -492610180);
        setIntField(term4306031, term4306031.getClass(), "totalAdvancedSync", 423747729);
        setIntField(term4306031, term4306031.getClass(), "totalExpertSync", 276567215);
        setIntField(term4306031, term4306031.getClass(), "totalMasterSync", 1411963541);
        setIntField(term4306031, term4306031.getClass(), "totalReMasterSync", -1291957067);
        setLongField(term4306031, term4306031.getClass(), "totalAchievement", -2265497926490425021L);
        setLongField(term4306031, term4306031.getClass(), "totalBasicAchievement", 8303350974579393339L);
        setLongField(term4306031, term4306031.getClass(), "totalAdvancedAchievement", -9213090934688317450L);
        setLongField(term4306031, term4306031.getClass(), "totalExpertAchievement", 5956585216710330062L);
        setLongField(term4306031, term4306031.getClass(), "totalMasterAchievement", -7029252255787478000L);
        setLongField(term4306031, term4306031.getClass(), "totalReMasterAchievement", -8794109796769800528L);
        setLongField(term4306031, term4306031.getClass(), "playerOldRating", 7773768756286123622L);
        setLongField(term4306031, term4306031.getClass(), "playerNewRating", 6308447466681120466L);
        setIntField(term4306031, term4306031.getClass(), "banState", 305467250);
        setLongField(term4306031, term4306031.getClass(), "dateTime", 8961293019561095338L);
        term4306390 = new Long(2410178007304427512L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term4306390;
        callMethod(klass, "setTotalAdvancedDeluxscore", argTypes, term4306031, args);
    }

};


