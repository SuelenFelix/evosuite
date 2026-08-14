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

public class UserDetail_getCompatibleCmVersion_208788715345 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term221035;

    public UserDetail_getCompatibleCmVersion_208788715345() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term221039 = new Long(6351887424140565471L);
        Integer term221102 = new Integer(280068573);
        Integer term221104 = new Integer(-1081530515);
        Integer term221106 = new Integer(492096339);
        Integer term221108 = new Integer(-1679827671);
        Integer term221110 = new Integer(932019255);
        Integer term221112 = new Integer(1939661233);
        Integer term221114 = new Integer(-485147289);
        Integer term221116 = new Integer(-1098526777);
        Integer term221118 = new Integer(871491464);
        ArrayList term221100 = new ArrayList();
        ((ArrayList) term221100).add(term221102);
        ((ArrayList) term221100).add(term221104);
        ((ArrayList) term221100).add(term221106);
        ((ArrayList) term221100).add(term221108);
        ((ArrayList) term221100).add(term221110);
        ((ArrayList) term221100).add(term221112);
        ((ArrayList) term221100).add(term221114);
        ((ArrayList) term221100).add(term221116);
        ((ArrayList) term221100).add(term221118);
        Integer term221124 = new Integer(1250354269);
        Integer term221126 = new Integer(695748317);
        Integer term221128 = new Integer(-439470959);
        Integer term221130 = new Integer(-248472453);
        Integer term221132 = new Integer(1056759659);
        ArrayList term221122 = new ArrayList();
        ((ArrayList) term221122).add(term221124);
        ((ArrayList) term221122).add(term221126);
        ((ArrayList) term221122).add(term221128);
        ((ArrayList) term221122).add(term221130);
        ((ArrayList) term221122).add(term221132);
        term221035 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term221037 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term221053 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term221054 = newInstance(Class.forName("java.time.LocalDate"));
        Object term221058 = newInstance(Class.forName("java.time.LocalTime"));
        Object term221063 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term221064 = newInstance(Class.forName("java.time.LocalDate"));
        Object term221068 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term221035, term221035.getClass(), "id", 4377184190248737508L);
        setLongField(term221037, term221037.getClass(), "id", -4743830380585824129L);
        setField(term221037, term221037.getClass(), "extId", term221039);
        setField(term221037, term221037.getClass(), "luid", "MrjCdvTPnq");
        setIntField(term221054, term221054.getClass(), "year", 2014);
        setShortField(term221054, term221054.getClass(), "month", (short) 2);
        setShortField(term221054, term221054.getClass(), "day", (short) 2);
        setField(term221053, term221053.getClass(), "date", term221054);
        setByteField(term221058, term221058.getClass(), "hour", (byte) 17);
        setByteField(term221058, term221058.getClass(), "minute", (byte) 45);
        setByteField(term221058, term221058.getClass(), "second", (byte) 37);
        setIntField(term221058, term221058.getClass(), "nano", 147840174);
        setField(term221053, term221053.getClass(), "time", term221058);
        setField(term221037, term221037.getClass(), "registerTime", term221053);
        setIntField(term221064, term221064.getClass(), "year", 2023);
        setShortField(term221064, term221064.getClass(), "month", (short) 4);
        setShortField(term221064, term221064.getClass(), "day", (short) 27);
        setField(term221063, term221063.getClass(), "date", term221064);
        setByteField(term221068, term221068.getClass(), "hour", (byte) 11);
        setByteField(term221068, term221068.getClass(), "minute", (byte) 41);
        setByteField(term221068, term221068.getClass(), "second", (byte) 10);
        setIntField(term221068, term221068.getClass(), "nano", 59265345);
        setField(term221063, term221063.getClass(), "time", term221068);
        setField(term221037, term221037.getClass(), "accessTime", term221063);
        setField(term221035, term221035.getClass(), "card", term221037);
        setField(term221035, term221035.getClass(), "userName", "fheVosxidN");
        setIntField(term221035, term221035.getClass(), "isNetMember", -1566042472);
        setIntField(term221035, term221035.getClass(), "iconId", 654568310);
        setIntField(term221035, term221035.getClass(), "plateId", 1379492509);
        setIntField(term221035, term221035.getClass(), "titleId", 1859663828);
        setIntField(term221035, term221035.getClass(), "partnerId", -241347649);
        setIntField(term221035, term221035.getClass(), "frameId", -996032013);
        setIntField(term221035, term221035.getClass(), "selectMapId", -499780226);
        setIntField(term221035, term221035.getClass(), "totalAwake", -2047034320);
        setIntField(term221035, term221035.getClass(), "gradeRating", 229323589);
        setIntField(term221035, term221035.getClass(), "musicRating", 608950067);
        setIntField(term221035, term221035.getClass(), "playerRating", -1976530324);
        setIntField(term221035, term221035.getClass(), "highestRating", -345508496);
        setIntField(term221035, term221035.getClass(), "gradeRank", 1836772931);
        setIntField(term221035, term221035.getClass(), "classRank", 1471156136);
        setIntField(term221035, term221035.getClass(), "courseRank", 869271750);
        setField(term221035, term221035.getClass(), "charaSlot", term221100);
        setField(term221035, term221035.getClass(), "charaLockSlot", term221122);
        setLongField(term221035, term221035.getClass(), "contentBit", 9068898375463638986L);
        setIntField(term221035, term221035.getClass(), "playCount", -891906508);
        setField(term221035, term221035.getClass(), "eventWatchedDate", "EliOjzcjaH");
        setField(term221035, term221035.getClass(), "lastGameId", "QebYNbOBeP");
        setField(term221035, term221035.getClass(), "lastRomVersion", "azqpHmPbfX");
        setField(term221035, term221035.getClass(), "lastDataVersion", "mzjGFHNpPh");
        setField(term221035, term221035.getClass(), "lastLoginDate", "JmuvhLuzoo");
        setField(term221035, term221035.getClass(), "lastPlayDate", "yunXHVjiFz");
        setIntField(term221035, term221035.getClass(), "lastPlayCredit", 33200561);
        setIntField(term221035, term221035.getClass(), "lastPlayMode", -391675562);
        setIntField(term221035, term221035.getClass(), "lastPlaceId", 206061309);
        setField(term221035, term221035.getClass(), "lastPlaceName", "fInyTanaRj");
        setIntField(term221035, term221035.getClass(), "lastAllNetId", -469486858);
        setIntField(term221035, term221035.getClass(), "lastRegionId", -1184776933);
        setField(term221035, term221035.getClass(), "lastRegionName", "vUkEfrLXZa");
        setField(term221035, term221035.getClass(), "lastClientId", "SqXFUOzCDt");
        setField(term221035, term221035.getClass(), "lastCountryCode", "sPJdROPLoS");
        setIntField(term221035, term221035.getClass(), "lastSelectEMoney", -947890577);
        setIntField(term221035, term221035.getClass(), "lastSelectTicket", -2103526812);
        setIntField(term221035, term221035.getClass(), "lastSelectCourse", 2001968974);
        setIntField(term221035, term221035.getClass(), "lastCountCourse", 2036080787);
        setField(term221035, term221035.getClass(), "firstGameId", "BjNKZeUpZK");
        setField(term221035, term221035.getClass(), "firstRomVersion", "GUNfUXiXry");
        setField(term221035, term221035.getClass(), "firstDataVersion", "GHokIWCLXI");
        setField(term221035, term221035.getClass(), "firstPlayDate", "zgzHXWMKZV");
        setField(term221035, term221035.getClass(), "compatibleCmVersion", "wytMnhStpX");
        setField(term221035, term221035.getClass(), "dailyBonusDate", "hSBhOxKOgt");
        setField(term221035, term221035.getClass(), "dailyCourseBonusDate", "UNhbUArssD");
        setField(term221035, term221035.getClass(), "lastPairLoginDate", "KpyICcvyZe");
        setField(term221035, term221035.getClass(), "lastTrialPlayDate", "hmrbHaufRb");
        setIntField(term221035, term221035.getClass(), "playVsCount", -1187989955);
        setIntField(term221035, term221035.getClass(), "playSyncCount", 1522845770);
        setIntField(term221035, term221035.getClass(), "winCount", 457792368);
        setIntField(term221035, term221035.getClass(), "helpCount", 1883178473);
        setIntField(term221035, term221035.getClass(), "comboCount", -1873487804);
        setLongField(term221035, term221035.getClass(), "totalDeluxscore", -1325957388046326118L);
        setLongField(term221035, term221035.getClass(), "totalBasicDeluxscore", -4103900596755497991L);
        setLongField(term221035, term221035.getClass(), "totalAdvancedDeluxscore", -6476245452312735980L);
        setLongField(term221035, term221035.getClass(), "totalExpertDeluxscore", 4872695929657126219L);
        setLongField(term221035, term221035.getClass(), "totalMasterDeluxscore", 6798904122821331479L);
        setLongField(term221035, term221035.getClass(), "totalReMasterDeluxscore", -1359566511307790428L);
        setIntField(term221035, term221035.getClass(), "totalSync", 338162762);
        setIntField(term221035, term221035.getClass(), "totalBasicSync", -2029988360);
        setIntField(term221035, term221035.getClass(), "totalAdvancedSync", 985415961);
        setIntField(term221035, term221035.getClass(), "totalExpertSync", 1163437479);
        setIntField(term221035, term221035.getClass(), "totalMasterSync", 446404576);
        setIntField(term221035, term221035.getClass(), "totalReMasterSync", -250771991);
        setLongField(term221035, term221035.getClass(), "totalAchievement", -2145376871585702573L);
        setLongField(term221035, term221035.getClass(), "totalBasicAchievement", -6831828368646215302L);
        setLongField(term221035, term221035.getClass(), "totalAdvancedAchievement", 603470447927590435L);
        setLongField(term221035, term221035.getClass(), "totalExpertAchievement", 5563689140460528791L);
        setLongField(term221035, term221035.getClass(), "totalMasterAchievement", -6807100124632008206L);
        setLongField(term221035, term221035.getClass(), "totalReMasterAchievement", 1852487610612905757L);
        setLongField(term221035, term221035.getClass(), "playerOldRating", 1975113384225423579L);
        setLongField(term221035, term221035.getClass(), "playerNewRating", 179641543976710347L);
        setIntField(term221035, term221035.getClass(), "banState", -87432188);
        setLongField(term221035, term221035.getClass(), "dateTime", 1213540058509375119L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCompatibleCmVersion", argTypes, term221035, args);
    }

};


