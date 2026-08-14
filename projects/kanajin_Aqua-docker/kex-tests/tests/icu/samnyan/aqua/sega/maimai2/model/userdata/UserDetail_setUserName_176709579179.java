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

public class UserDetail_setUserName_176709579179 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term240273;

    public UserDetail_setUserName_176709579179() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term240277 = new Long(-1449569009562240465L);
        Integer term240340 = new Integer(1988824012);
        Integer term240342 = new Integer(365061041);
        ArrayList term240338 = new ArrayList();
        ((ArrayList) term240338).add(term240340);
        ((ArrayList) term240338).add(term240342);
        Integer term240348 = new Integer(205907008);
        Integer term240350 = new Integer(-1281782269);
        Integer term240352 = new Integer(-1728872282);
        Integer term240354 = new Integer(-537646987);
        Integer term240356 = new Integer(-558527010);
        Integer term240358 = new Integer(-271207664);
        Integer term240360 = new Integer(-1452529928);
        ArrayList term240346 = new ArrayList();
        ((ArrayList) term240346).add(term240348);
        ((ArrayList) term240346).add(term240350);
        ((ArrayList) term240346).add(term240352);
        ((ArrayList) term240346).add(term240354);
        ((ArrayList) term240346).add(term240356);
        ((ArrayList) term240346).add(term240358);
        ((ArrayList) term240346).add(term240360);
        term240273 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term240275 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term240291 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term240292 = newInstance(Class.forName("java.time.LocalDate"));
        Object term240296 = newInstance(Class.forName("java.time.LocalTime"));
        Object term240301 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term240302 = newInstance(Class.forName("java.time.LocalDate"));
        Object term240306 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term240273, term240273.getClass(), "id", 2329182980072157596L);
        setLongField(term240275, term240275.getClass(), "id", 5188704488591459085L);
        setField(term240275, term240275.getClass(), "extId", term240277);
        setField(term240275, term240275.getClass(), "luid", "snXrQUgpsn");
        setIntField(term240292, term240292.getClass(), "year", 2025);
        setShortField(term240292, term240292.getClass(), "month", (short) 2);
        setShortField(term240292, term240292.getClass(), "day", (short) 11);
        setField(term240291, term240291.getClass(), "date", term240292);
        setByteField(term240296, term240296.getClass(), "hour", (byte) 22);
        setByteField(term240296, term240296.getClass(), "minute", (byte) 56);
        setByteField(term240296, term240296.getClass(), "second", (byte) 10);
        setIntField(term240296, term240296.getClass(), "nano", 94699593);
        setField(term240291, term240291.getClass(), "time", term240296);
        setField(term240275, term240275.getClass(), "registerTime", term240291);
        setIntField(term240302, term240302.getClass(), "year", 2023);
        setShortField(term240302, term240302.getClass(), "month", (short) 2);
        setShortField(term240302, term240302.getClass(), "day", (short) 6);
        setField(term240301, term240301.getClass(), "date", term240302);
        setByteField(term240306, term240306.getClass(), "hour", (byte) 13);
        setByteField(term240306, term240306.getClass(), "minute", (byte) 35);
        setByteField(term240306, term240306.getClass(), "second", (byte) 14);
        setIntField(term240306, term240306.getClass(), "nano", 917848995);
        setField(term240301, term240301.getClass(), "time", term240306);
        setField(term240275, term240275.getClass(), "accessTime", term240301);
        setField(term240273, term240273.getClass(), "card", term240275);
        setField(term240273, term240273.getClass(), "userName", "WUqpvkVxcO");
        setIntField(term240273, term240273.getClass(), "isNetMember", 312950095);
        setIntField(term240273, term240273.getClass(), "iconId", 1743914604);
        setIntField(term240273, term240273.getClass(), "plateId", 651554189);
        setIntField(term240273, term240273.getClass(), "titleId", 679237021);
        setIntField(term240273, term240273.getClass(), "partnerId", 1215433415);
        setIntField(term240273, term240273.getClass(), "frameId", -604279512);
        setIntField(term240273, term240273.getClass(), "selectMapId", 1339586196);
        setIntField(term240273, term240273.getClass(), "totalAwake", 718138171);
        setIntField(term240273, term240273.getClass(), "gradeRating", 1807834211);
        setIntField(term240273, term240273.getClass(), "musicRating", 696150663);
        setIntField(term240273, term240273.getClass(), "playerRating", 1350044317);
        setIntField(term240273, term240273.getClass(), "highestRating", 2139666491);
        setIntField(term240273, term240273.getClass(), "gradeRank", 17465484);
        setIntField(term240273, term240273.getClass(), "classRank", 758434940);
        setIntField(term240273, term240273.getClass(), "courseRank", 385974209);
        setField(term240273, term240273.getClass(), "charaSlot", term240338);
        setField(term240273, term240273.getClass(), "charaLockSlot", term240346);
        setLongField(term240273, term240273.getClass(), "contentBit", -6031666715679119131L);
        setIntField(term240273, term240273.getClass(), "playCount", 1817657461);
        setField(term240273, term240273.getClass(), "eventWatchedDate", "Exlzbmdcxa");
        setField(term240273, term240273.getClass(), "lastGameId", "YUNVygcAmQ");
        setField(term240273, term240273.getClass(), "lastRomVersion", "kNTcrneNir");
        setField(term240273, term240273.getClass(), "lastDataVersion", "RiNlMPpFPw");
        setField(term240273, term240273.getClass(), "lastLoginDate", "mJUknTnMoF");
        setField(term240273, term240273.getClass(), "lastPlayDate", "EriFQVVsYo");
        setIntField(term240273, term240273.getClass(), "lastPlayCredit", 454672648);
        setIntField(term240273, term240273.getClass(), "lastPlayMode", -528837252);
        setIntField(term240273, term240273.getClass(), "lastPlaceId", 1538801717);
        setField(term240273, term240273.getClass(), "lastPlaceName", "PDCfhQKGsz");
        setIntField(term240273, term240273.getClass(), "lastAllNetId", 680563419);
        setIntField(term240273, term240273.getClass(), "lastRegionId", -136366265);
        setField(term240273, term240273.getClass(), "lastRegionName", "LLOgknEuqU");
        setField(term240273, term240273.getClass(), "lastClientId", "YPuXXabbQT");
        setField(term240273, term240273.getClass(), "lastCountryCode", "ysYFcjbmKr");
        setIntField(term240273, term240273.getClass(), "lastSelectEMoney", -1195910080);
        setIntField(term240273, term240273.getClass(), "lastSelectTicket", -1599821637);
        setIntField(term240273, term240273.getClass(), "lastSelectCourse", -605898530);
        setIntField(term240273, term240273.getClass(), "lastCountCourse", -146533891);
        setField(term240273, term240273.getClass(), "firstGameId", "ENDtqsidqV");
        setField(term240273, term240273.getClass(), "firstRomVersion", "vAYeBSSlRp");
        setField(term240273, term240273.getClass(), "firstDataVersion", "pvKNUuBUeT");
        setField(term240273, term240273.getClass(), "firstPlayDate", "paIiUFEXVG");
        setField(term240273, term240273.getClass(), "compatibleCmVersion", "RhdoUtwGNW");
        setField(term240273, term240273.getClass(), "dailyBonusDate", "TdPikAQSWD");
        setField(term240273, term240273.getClass(), "dailyCourseBonusDate", "czyIZPfIiS");
        setField(term240273, term240273.getClass(), "lastPairLoginDate", "WTSBaHJKIf");
        setField(term240273, term240273.getClass(), "lastTrialPlayDate", "RQXVNnHMfw");
        setIntField(term240273, term240273.getClass(), "playVsCount", -652057656);
        setIntField(term240273, term240273.getClass(), "playSyncCount", -347776421);
        setIntField(term240273, term240273.getClass(), "winCount", 1747597328);
        setIntField(term240273, term240273.getClass(), "helpCount", -443146256);
        setIntField(term240273, term240273.getClass(), "comboCount", 884092835);
        setLongField(term240273, term240273.getClass(), "totalDeluxscore", -4915024505983142936L);
        setLongField(term240273, term240273.getClass(), "totalBasicDeluxscore", -3172904420677972162L);
        setLongField(term240273, term240273.getClass(), "totalAdvancedDeluxscore", -1984693807185811190L);
        setLongField(term240273, term240273.getClass(), "totalExpertDeluxscore", 7957053290014639325L);
        setLongField(term240273, term240273.getClass(), "totalMasterDeluxscore", 8705054514929267238L);
        setLongField(term240273, term240273.getClass(), "totalReMasterDeluxscore", 6120242224489812239L);
        setIntField(term240273, term240273.getClass(), "totalSync", -1651018926);
        setIntField(term240273, term240273.getClass(), "totalBasicSync", 1309510154);
        setIntField(term240273, term240273.getClass(), "totalAdvancedSync", 1033942034);
        setIntField(term240273, term240273.getClass(), "totalExpertSync", -1441490835);
        setIntField(term240273, term240273.getClass(), "totalMasterSync", 582280011);
        setIntField(term240273, term240273.getClass(), "totalReMasterSync", 603827855);
        setLongField(term240273, term240273.getClass(), "totalAchievement", -8869611363232114075L);
        setLongField(term240273, term240273.getClass(), "totalBasicAchievement", 2563783661803950975L);
        setLongField(term240273, term240273.getClass(), "totalAdvancedAchievement", 5915640370423989572L);
        setLongField(term240273, term240273.getClass(), "totalExpertAchievement", -7257818421664725576L);
        setLongField(term240273, term240273.getClass(), "totalMasterAchievement", -5678194829631507012L);
        setLongField(term240273, term240273.getClass(), "totalReMasterAchievement", -418880175931256601L);
        setLongField(term240273, term240273.getClass(), "playerOldRating", 4287586709773001634L);
        setLongField(term240273, term240273.getClass(), "playerNewRating", 6487318804597750757L);
        setIntField(term240273, term240273.getClass(), "banState", 1214723794);
        setLongField(term240273, term240273.getClass(), "dateTime", -6169633255646330032L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "HEBNhULneC";
        callMethod(klass, "setUserName", argTypes, term240273, args);
    }

};


