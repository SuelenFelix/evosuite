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

public class UserDetail_setUserName_176709579180 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term240328;

    public UserDetail_setUserName_176709579180() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term240332 = new Long(-1449569009562240465L);
        Integer term240395 = new Integer(1988824012);
        Integer term240397 = new Integer(365061041);
        ArrayList term240393 = new ArrayList();
        ((ArrayList) term240393).add(term240395);
        ((ArrayList) term240393).add(term240397);
        Integer term240403 = new Integer(205907008);
        Integer term240405 = new Integer(-1281782269);
        Integer term240407 = new Integer(-1728872282);
        Integer term240409 = new Integer(-537646987);
        Integer term240411 = new Integer(-558527010);
        Integer term240413 = new Integer(-271207664);
        Integer term240415 = new Integer(-1452529928);
        ArrayList term240401 = new ArrayList();
        ((ArrayList) term240401).add(term240403);
        ((ArrayList) term240401).add(term240405);
        ((ArrayList) term240401).add(term240407);
        ((ArrayList) term240401).add(term240409);
        ((ArrayList) term240401).add(term240411);
        ((ArrayList) term240401).add(term240413);
        ((ArrayList) term240401).add(term240415);
        term240328 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term240330 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term240346 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term240347 = newInstance(Class.forName("java.time.LocalDate"));
        Object term240351 = newInstance(Class.forName("java.time.LocalTime"));
        Object term240356 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term240357 = newInstance(Class.forName("java.time.LocalDate"));
        Object term240361 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term240328, term240328.getClass(), "id", 2329182980072157596L);
        setLongField(term240330, term240330.getClass(), "id", 5188704488591459085L);
        setField(term240330, term240330.getClass(), "extId", term240332);
        setField(term240330, term240330.getClass(), "luid", "snXrQUgpsn");
        setIntField(term240347, term240347.getClass(), "year", 2025);
        setShortField(term240347, term240347.getClass(), "month", (short) 2);
        setShortField(term240347, term240347.getClass(), "day", (short) 11);
        setField(term240346, term240346.getClass(), "date", term240347);
        setByteField(term240351, term240351.getClass(), "hour", (byte) 22);
        setByteField(term240351, term240351.getClass(), "minute", (byte) 56);
        setByteField(term240351, term240351.getClass(), "second", (byte) 10);
        setIntField(term240351, term240351.getClass(), "nano", 94699593);
        setField(term240346, term240346.getClass(), "time", term240351);
        setField(term240330, term240330.getClass(), "registerTime", term240346);
        setIntField(term240357, term240357.getClass(), "year", 2023);
        setShortField(term240357, term240357.getClass(), "month", (short) 2);
        setShortField(term240357, term240357.getClass(), "day", (short) 6);
        setField(term240356, term240356.getClass(), "date", term240357);
        setByteField(term240361, term240361.getClass(), "hour", (byte) 13);
        setByteField(term240361, term240361.getClass(), "minute", (byte) 35);
        setByteField(term240361, term240361.getClass(), "second", (byte) 14);
        setIntField(term240361, term240361.getClass(), "nano", 917848995);
        setField(term240356, term240356.getClass(), "time", term240361);
        setField(term240330, term240330.getClass(), "accessTime", term240356);
        setField(term240328, term240328.getClass(), "card", term240330);
        setField(term240328, term240328.getClass(), "userName", "WUqpvkVxcO");
        setIntField(term240328, term240328.getClass(), "isNetMember", 312950095);
        setIntField(term240328, term240328.getClass(), "iconId", 1743914604);
        setIntField(term240328, term240328.getClass(), "plateId", 651554189);
        setIntField(term240328, term240328.getClass(), "titleId", 679237021);
        setIntField(term240328, term240328.getClass(), "partnerId", 1215433415);
        setIntField(term240328, term240328.getClass(), "frameId", -604279512);
        setIntField(term240328, term240328.getClass(), "selectMapId", 1339586196);
        setIntField(term240328, term240328.getClass(), "totalAwake", 718138171);
        setIntField(term240328, term240328.getClass(), "gradeRating", 1807834211);
        setIntField(term240328, term240328.getClass(), "musicRating", 696150663);
        setIntField(term240328, term240328.getClass(), "playerRating", 1350044317);
        setIntField(term240328, term240328.getClass(), "highestRating", 2139666491);
        setIntField(term240328, term240328.getClass(), "gradeRank", 17465484);
        setIntField(term240328, term240328.getClass(), "classRank", 758434940);
        setIntField(term240328, term240328.getClass(), "courseRank", 385974209);
        setField(term240328, term240328.getClass(), "charaSlot", term240393);
        setField(term240328, term240328.getClass(), "charaLockSlot", term240401);
        setLongField(term240328, term240328.getClass(), "contentBit", -6031666715679119131L);
        setIntField(term240328, term240328.getClass(), "playCount", 1817657461);
        setField(term240328, term240328.getClass(), "eventWatchedDate", "Exlzbmdcxa");
        setField(term240328, term240328.getClass(), "lastGameId", "YUNVygcAmQ");
        setField(term240328, term240328.getClass(), "lastRomVersion", "kNTcrneNir");
        setField(term240328, term240328.getClass(), "lastDataVersion", "RiNlMPpFPw");
        setField(term240328, term240328.getClass(), "lastLoginDate", "mJUknTnMoF");
        setField(term240328, term240328.getClass(), "lastPlayDate", "EriFQVVsYo");
        setIntField(term240328, term240328.getClass(), "lastPlayCredit", 454672648);
        setIntField(term240328, term240328.getClass(), "lastPlayMode", -528837252);
        setIntField(term240328, term240328.getClass(), "lastPlaceId", 1538801717);
        setField(term240328, term240328.getClass(), "lastPlaceName", "PDCfhQKGsz");
        setIntField(term240328, term240328.getClass(), "lastAllNetId", 680563419);
        setIntField(term240328, term240328.getClass(), "lastRegionId", -136366265);
        setField(term240328, term240328.getClass(), "lastRegionName", "LLOgknEuqU");
        setField(term240328, term240328.getClass(), "lastClientId", "YPuXXabbQT");
        setField(term240328, term240328.getClass(), "lastCountryCode", "ysYFcjbmKr");
        setIntField(term240328, term240328.getClass(), "lastSelectEMoney", -1195910080);
        setIntField(term240328, term240328.getClass(), "lastSelectTicket", -1599821637);
        setIntField(term240328, term240328.getClass(), "lastSelectCourse", -605898530);
        setIntField(term240328, term240328.getClass(), "lastCountCourse", -146533891);
        setField(term240328, term240328.getClass(), "firstGameId", "ENDtqsidqV");
        setField(term240328, term240328.getClass(), "firstRomVersion", "vAYeBSSlRp");
        setField(term240328, term240328.getClass(), "firstDataVersion", "pvKNUuBUeT");
        setField(term240328, term240328.getClass(), "firstPlayDate", "paIiUFEXVG");
        setField(term240328, term240328.getClass(), "compatibleCmVersion", "RhdoUtwGNW");
        setField(term240328, term240328.getClass(), "dailyBonusDate", "TdPikAQSWD");
        setField(term240328, term240328.getClass(), "dailyCourseBonusDate", "czyIZPfIiS");
        setField(term240328, term240328.getClass(), "lastPairLoginDate", "WTSBaHJKIf");
        setField(term240328, term240328.getClass(), "lastTrialPlayDate", "RQXVNnHMfw");
        setIntField(term240328, term240328.getClass(), "playVsCount", -652057656);
        setIntField(term240328, term240328.getClass(), "playSyncCount", -347776421);
        setIntField(term240328, term240328.getClass(), "winCount", 1747597328);
        setIntField(term240328, term240328.getClass(), "helpCount", -443146256);
        setIntField(term240328, term240328.getClass(), "comboCount", 884092835);
        setLongField(term240328, term240328.getClass(), "totalDeluxscore", -4915024505983142936L);
        setLongField(term240328, term240328.getClass(), "totalBasicDeluxscore", -3172904420677972162L);
        setLongField(term240328, term240328.getClass(), "totalAdvancedDeluxscore", -1984693807185811190L);
        setLongField(term240328, term240328.getClass(), "totalExpertDeluxscore", 7957053290014639325L);
        setLongField(term240328, term240328.getClass(), "totalMasterDeluxscore", 8705054514929267238L);
        setLongField(term240328, term240328.getClass(), "totalReMasterDeluxscore", 6120242224489812239L);
        setIntField(term240328, term240328.getClass(), "totalSync", -1651018926);
        setIntField(term240328, term240328.getClass(), "totalBasicSync", 1309510154);
        setIntField(term240328, term240328.getClass(), "totalAdvancedSync", 1033942034);
        setIntField(term240328, term240328.getClass(), "totalExpertSync", -1441490835);
        setIntField(term240328, term240328.getClass(), "totalMasterSync", 582280011);
        setIntField(term240328, term240328.getClass(), "totalReMasterSync", 603827855);
        setLongField(term240328, term240328.getClass(), "totalAchievement", -8869611363232114075L);
        setLongField(term240328, term240328.getClass(), "totalBasicAchievement", 2563783661803950975L);
        setLongField(term240328, term240328.getClass(), "totalAdvancedAchievement", 5915640370423989572L);
        setLongField(term240328, term240328.getClass(), "totalExpertAchievement", -7257818421664725576L);
        setLongField(term240328, term240328.getClass(), "totalMasterAchievement", -5678194829631507012L);
        setLongField(term240328, term240328.getClass(), "totalReMasterAchievement", -418880175931256601L);
        setLongField(term240328, term240328.getClass(), "playerOldRating", 4287586709773001634L);
        setLongField(term240328, term240328.getClass(), "playerNewRating", 6487318804597750757L);
        setIntField(term240328, term240328.getClass(), "banState", 1214723794);
        setLongField(term240328, term240328.getClass(), "dateTime", -6169633255646330032L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "HEBNhULneC";
        callMethod(klass, "setUserName", argTypes, term240328, args);
    }

};


