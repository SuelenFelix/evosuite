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
     Object term4274331;

    public UserDetail_setUserName_176709579179() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4274335 = new Long(-8666244601924927641L);
        Integer term4274398 = new Integer(-1878396438);
        Integer term4274400 = new Integer(22205123);
        Integer term4274402 = new Integer(479068999);
        Integer term4274404 = new Integer(-1528330666);
        ArrayList term4274396 = new ArrayList();
        ((ArrayList) term4274396).add(term4274398);
        ((ArrayList) term4274396).add(term4274400);
        ((ArrayList) term4274396).add(term4274402);
        ((ArrayList) term4274396).add(term4274404);
        Integer term4274410 = new Integer(-453088521);
        Integer term4274412 = new Integer(-1951273050);
        Integer term4274414 = new Integer(924528463);
        Integer term4274416 = new Integer(148137606);
        Integer term4274418 = new Integer(364962451);
        Integer term4274420 = new Integer(-368045173);
        Integer term4274422 = new Integer(-38776100);
        Integer term4274424 = new Integer(-1097669979);
        ArrayList term4274408 = new ArrayList();
        ((ArrayList) term4274408).add(term4274410);
        ((ArrayList) term4274408).add(term4274412);
        ((ArrayList) term4274408).add(term4274414);
        ((ArrayList) term4274408).add(term4274416);
        ((ArrayList) term4274408).add(term4274418);
        ((ArrayList) term4274408).add(term4274420);
        ((ArrayList) term4274408).add(term4274422);
        ((ArrayList) term4274408).add(term4274424);
        term4274331 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term4274333 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term4274349 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4274350 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4274354 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4274359 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4274360 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4274364 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term4274331, term4274331.getClass(), "id", -4445405440650665957L);
        setLongField(term4274333, term4274333.getClass(), "id", 2445300380757499798L);
        setField(term4274333, term4274333.getClass(), "extId", term4274335);
        setField(term4274333, term4274333.getClass(), "luid", "aXehszOwtL");
        setIntField(term4274350, term4274350.getClass(), "year", 2024);
        setShortField(term4274350, term4274350.getClass(), "month", (short) 11);
        setShortField(term4274350, term4274350.getClass(), "day", (short) 4);
        setField(term4274349, term4274349.getClass(), "date", term4274350);
        setByteField(term4274354, term4274354.getClass(), "hour", (byte) 11);
        setByteField(term4274354, term4274354.getClass(), "minute", (byte) 29);
        setByteField(term4274354, term4274354.getClass(), "second", (byte) 6);
        setIntField(term4274354, term4274354.getClass(), "nano", 856630638);
        setField(term4274349, term4274349.getClass(), "time", term4274354);
        setField(term4274333, term4274333.getClass(), "registerTime", term4274349);
        setIntField(term4274360, term4274360.getClass(), "year", 2011);
        setShortField(term4274360, term4274360.getClass(), "month", (short) 12);
        setShortField(term4274360, term4274360.getClass(), "day", (short) 10);
        setField(term4274359, term4274359.getClass(), "date", term4274360);
        setByteField(term4274364, term4274364.getClass(), "hour", (byte) 0);
        setByteField(term4274364, term4274364.getClass(), "minute", (byte) 47);
        setByteField(term4274364, term4274364.getClass(), "second", (byte) 41);
        setIntField(term4274364, term4274364.getClass(), "nano", 132238498);
        setField(term4274359, term4274359.getClass(), "time", term4274364);
        setField(term4274333, term4274333.getClass(), "accessTime", term4274359);
        setField(term4274331, term4274331.getClass(), "card", term4274333);
        setField(term4274331, term4274331.getClass(), "userName", "tUlHEvYVZZ");
        setIntField(term4274331, term4274331.getClass(), "isNetMember", 684395076);
        setIntField(term4274331, term4274331.getClass(), "iconId", 1424134870);
        setIntField(term4274331, term4274331.getClass(), "plateId", -1646678974);
        setIntField(term4274331, term4274331.getClass(), "titleId", -400974461);
        setIntField(term4274331, term4274331.getClass(), "partnerId", -212433647);
        setIntField(term4274331, term4274331.getClass(), "frameId", -1345328373);
        setIntField(term4274331, term4274331.getClass(), "selectMapId", 1371320198);
        setIntField(term4274331, term4274331.getClass(), "totalAwake", 1960604799);
        setIntField(term4274331, term4274331.getClass(), "gradeRating", -1954377287);
        setIntField(term4274331, term4274331.getClass(), "musicRating", 483820189);
        setIntField(term4274331, term4274331.getClass(), "playerRating", -705377887);
        setIntField(term4274331, term4274331.getClass(), "highestRating", -1621079461);
        setIntField(term4274331, term4274331.getClass(), "gradeRank", -383066159);
        setIntField(term4274331, term4274331.getClass(), "classRank", -1202025470);
        setIntField(term4274331, term4274331.getClass(), "courseRank", 53237763);
        setField(term4274331, term4274331.getClass(), "charaSlot", term4274396);
        setField(term4274331, term4274331.getClass(), "charaLockSlot", term4274408);
        setLongField(term4274331, term4274331.getClass(), "contentBit", 3935454478120935150L);
        setIntField(term4274331, term4274331.getClass(), "playCount", 438561218);
        setField(term4274331, term4274331.getClass(), "eventWatchedDate", "fiWqSqCKVw");
        setField(term4274331, term4274331.getClass(), "lastGameId", "PXYJdKXUVa");
        setField(term4274331, term4274331.getClass(), "lastRomVersion", "mjKeWYNbFz");
        setField(term4274331, term4274331.getClass(), "lastDataVersion", "LHYppNoGXt");
        setField(term4274331, term4274331.getClass(), "lastLoginDate", "XxfllMulzX");
        setField(term4274331, term4274331.getClass(), "lastPlayDate", "VUjFRoyePc");
        setIntField(term4274331, term4274331.getClass(), "lastPlayCredit", 141923863);
        setIntField(term4274331, term4274331.getClass(), "lastPlayMode", 2066823399);
        setIntField(term4274331, term4274331.getClass(), "lastPlaceId", -1527242829);
        setField(term4274331, term4274331.getClass(), "lastPlaceName", "MoERaNOKhP");
        setIntField(term4274331, term4274331.getClass(), "lastAllNetId", 1162799387);
        setIntField(term4274331, term4274331.getClass(), "lastRegionId", 1244747171);
        setField(term4274331, term4274331.getClass(), "lastRegionName", "uimPyRmIZI");
        setField(term4274331, term4274331.getClass(), "lastClientId", "CgNtVFUGuK");
        setField(term4274331, term4274331.getClass(), "lastCountryCode", "ExMFGZcdqx");
        setIntField(term4274331, term4274331.getClass(), "lastSelectEMoney", -981938351);
        setIntField(term4274331, term4274331.getClass(), "lastSelectTicket", 1879483814);
        setIntField(term4274331, term4274331.getClass(), "lastSelectCourse", -811221421);
        setIntField(term4274331, term4274331.getClass(), "lastCountCourse", 1983102043);
        setField(term4274331, term4274331.getClass(), "firstGameId", "iJWOHPkIjf");
        setField(term4274331, term4274331.getClass(), "firstRomVersion", "upwwpKFxOL");
        setField(term4274331, term4274331.getClass(), "firstDataVersion", "hmaSDGEeKJ");
        setField(term4274331, term4274331.getClass(), "firstPlayDate", "ZptDnrKwLh");
        setField(term4274331, term4274331.getClass(), "compatibleCmVersion", "QzmScFrrtr");
        setField(term4274331, term4274331.getClass(), "dailyBonusDate", "PJgBugXDyL");
        setField(term4274331, term4274331.getClass(), "dailyCourseBonusDate", "AtqLXKxrmi");
        setField(term4274331, term4274331.getClass(), "lastPairLoginDate", "FFNVPaKpFX");
        setField(term4274331, term4274331.getClass(), "lastTrialPlayDate", "KocXiHPbGn");
        setIntField(term4274331, term4274331.getClass(), "playVsCount", 620391685);
        setIntField(term4274331, term4274331.getClass(), "playSyncCount", 662452309);
        setIntField(term4274331, term4274331.getClass(), "winCount", 2076494559);
        setIntField(term4274331, term4274331.getClass(), "helpCount", 1308170924);
        setIntField(term4274331, term4274331.getClass(), "comboCount", -631628502);
        setLongField(term4274331, term4274331.getClass(), "totalDeluxscore", -900755772073384035L);
        setLongField(term4274331, term4274331.getClass(), "totalBasicDeluxscore", 5936605190297016055L);
        setLongField(term4274331, term4274331.getClass(), "totalAdvancedDeluxscore", -8330194017907614860L);
        setLongField(term4274331, term4274331.getClass(), "totalExpertDeluxscore", -6346190781263366498L);
        setLongField(term4274331, term4274331.getClass(), "totalMasterDeluxscore", -6668416779225818182L);
        setLongField(term4274331, term4274331.getClass(), "totalReMasterDeluxscore", 4426321055228437397L);
        setIntField(term4274331, term4274331.getClass(), "totalSync", -1324515703);
        setIntField(term4274331, term4274331.getClass(), "totalBasicSync", 254911489);
        setIntField(term4274331, term4274331.getClass(), "totalAdvancedSync", 1956466806);
        setIntField(term4274331, term4274331.getClass(), "totalExpertSync", 2105549868);
        setIntField(term4274331, term4274331.getClass(), "totalMasterSync", 1580441464);
        setIntField(term4274331, term4274331.getClass(), "totalReMasterSync", -1543365815);
        setLongField(term4274331, term4274331.getClass(), "totalAchievement", -4894680356257200078L);
        setLongField(term4274331, term4274331.getClass(), "totalBasicAchievement", 750086292159069978L);
        setLongField(term4274331, term4274331.getClass(), "totalAdvancedAchievement", 6259742334317258661L);
        setLongField(term4274331, term4274331.getClass(), "totalExpertAchievement", -4821022733999232391L);
        setLongField(term4274331, term4274331.getClass(), "totalMasterAchievement", 184280231969139206L);
        setLongField(term4274331, term4274331.getClass(), "totalReMasterAchievement", 1875914160892514261L);
        setLongField(term4274331, term4274331.getClass(), "playerOldRating", -8984207557767517993L);
        setLongField(term4274331, term4274331.getClass(), "playerNewRating", 1863444962341548838L);
        setIntField(term4274331, term4274331.getClass(), "banState", -1773075129);
        setLongField(term4274331, term4274331.getClass(), "dateTime", -7263661511407760949L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "YmjiSeUuRg";
        callMethod(klass, "setUserName", argTypes, term4274331, args);
    }

};


