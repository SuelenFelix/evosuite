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

public class UserUdemae_setClassValue_144253150323 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term108381;
     Object term108756;

    public UserUdemae_setClassValue_144253150323() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term108387 = new Long(-3730936709704460408L);
        Integer term108450 = new Integer(346282818);
        ArrayList term108448 = new ArrayList();
        ((ArrayList) term108448).add(term108450);
        Integer term108456 = new Integer(-857876056);
        Integer term108458 = new Integer(1392910876);
        Integer term108460 = new Integer(1086383182);
        Integer term108462 = new Integer(1425319286);
        Integer term108464 = new Integer(1729919228);
        Integer term108466 = new Integer(872351195);
        Integer term108468 = new Integer(-1664328399);
        Integer term108470 = new Integer(1422430512);
        ArrayList term108454 = new ArrayList();
        ((ArrayList) term108454).add(term108456);
        ((ArrayList) term108454).add(term108458);
        ((ArrayList) term108454).add(term108460);
        ((ArrayList) term108454).add(term108462);
        ((ArrayList) term108454).add(term108464);
        ((ArrayList) term108454).add(term108466);
        ((ArrayList) term108454).add(term108468);
        ((ArrayList) term108454).add(term108470);
        term108381 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserUdemae"));
        Object term108383 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term108385 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term108401 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term108402 = newInstance(Class.forName("java.time.LocalDate"));
        Object term108406 = newInstance(Class.forName("java.time.LocalTime"));
        Object term108411 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term108412 = newInstance(Class.forName("java.time.LocalDate"));
        Object term108416 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term108381, term108381.getClass(), "id", 8638115260738822106L);
        setLongField(term108383, term108383.getClass(), "id", 6633619306147406774L);
        setLongField(term108385, term108385.getClass(), "id", -2598531502895563715L);
        setField(term108385, term108385.getClass(), "extId", term108387);
        setField(term108385, term108385.getClass(), "luid", "ICNsClDoAn");
        setIntField(term108402, term108402.getClass(), "year", 2028);
        setShortField(term108402, term108402.getClass(), "month", (short) 7);
        setShortField(term108402, term108402.getClass(), "day", (short) 4);
        setField(term108401, term108401.getClass(), "date", term108402);
        setByteField(term108406, term108406.getClass(), "hour", (byte) 13);
        setByteField(term108406, term108406.getClass(), "minute", (byte) 43);
        setByteField(term108406, term108406.getClass(), "second", (byte) 17);
        setIntField(term108406, term108406.getClass(), "nano", 949713407);
        setField(term108401, term108401.getClass(), "time", term108406);
        setField(term108385, term108385.getClass(), "registerTime", term108401);
        setIntField(term108412, term108412.getClass(), "year", 2013);
        setShortField(term108412, term108412.getClass(), "month", (short) 3);
        setShortField(term108412, term108412.getClass(), "day", (short) 25);
        setField(term108411, term108411.getClass(), "date", term108412);
        setByteField(term108416, term108416.getClass(), "hour", (byte) 16);
        setByteField(term108416, term108416.getClass(), "minute", (byte) 28);
        setByteField(term108416, term108416.getClass(), "second", (byte) 0);
        setIntField(term108416, term108416.getClass(), "nano", 265797826);
        setField(term108411, term108411.getClass(), "time", term108416);
        setField(term108385, term108385.getClass(), "accessTime", term108411);
        setField(term108383, term108383.getClass(), "card", term108385);
        setField(term108383, term108383.getClass(), "userName", "LACfLkaJjq");
        setIntField(term108383, term108383.getClass(), "isNetMember", -330936660);
        setIntField(term108383, term108383.getClass(), "iconId", 2055839448);
        setIntField(term108383, term108383.getClass(), "plateId", -384754498);
        setIntField(term108383, term108383.getClass(), "titleId", 264487081);
        setIntField(term108383, term108383.getClass(), "partnerId", -834904279);
        setIntField(term108383, term108383.getClass(), "frameId", 1040056537);
        setIntField(term108383, term108383.getClass(), "selectMapId", 2036195661);
        setIntField(term108383, term108383.getClass(), "totalAwake", -1622316712);
        setIntField(term108383, term108383.getClass(), "gradeRating", -1235123974);
        setIntField(term108383, term108383.getClass(), "musicRating", -898215180);
        setIntField(term108383, term108383.getClass(), "playerRating", 537429234);
        setIntField(term108383, term108383.getClass(), "highestRating", -2003655808);
        setIntField(term108383, term108383.getClass(), "gradeRank", 483470724);
        setIntField(term108383, term108383.getClass(), "classRank", -2146772904);
        setIntField(term108383, term108383.getClass(), "courseRank", -1010615015);
        setField(term108383, term108383.getClass(), "charaSlot", term108448);
        setField(term108383, term108383.getClass(), "charaLockSlot", term108454);
        setLongField(term108383, term108383.getClass(), "contentBit", -6832530349389010593L);
        setIntField(term108383, term108383.getClass(), "playCount", 1876974431);
        setField(term108383, term108383.getClass(), "eventWatchedDate", "OhYEjeUQkK");
        setField(term108383, term108383.getClass(), "lastGameId", "rgZeldfAMO");
        setField(term108383, term108383.getClass(), "lastRomVersion", "btsBDylBZe");
        setField(term108383, term108383.getClass(), "lastDataVersion", "eAWJddaxnT");
        setField(term108383, term108383.getClass(), "lastLoginDate", "PyaMftIAzC");
        setField(term108383, term108383.getClass(), "lastPlayDate", "QiSmNdQUzl");
        setIntField(term108383, term108383.getClass(), "lastPlayCredit", -910876771);
        setIntField(term108383, term108383.getClass(), "lastPlayMode", 1838706925);
        setIntField(term108383, term108383.getClass(), "lastPlaceId", -618691801);
        setField(term108383, term108383.getClass(), "lastPlaceName", "FsjVOWFhLi");
        setIntField(term108383, term108383.getClass(), "lastAllNetId", -1470171320);
        setIntField(term108383, term108383.getClass(), "lastRegionId", -995528354);
        setField(term108383, term108383.getClass(), "lastRegionName", "RReQXZQnIR");
        setField(term108383, term108383.getClass(), "lastClientId", "VnHgyPgIAn");
        setField(term108383, term108383.getClass(), "lastCountryCode", "EIkLuLTIDO");
        setIntField(term108383, term108383.getClass(), "lastSelectEMoney", -2002926440);
        setIntField(term108383, term108383.getClass(), "lastSelectTicket", -985098142);
        setIntField(term108383, term108383.getClass(), "lastSelectCourse", -889602431);
        setIntField(term108383, term108383.getClass(), "lastCountCourse", 233063229);
        setField(term108383, term108383.getClass(), "firstGameId", "rQFJbYZksA");
        setField(term108383, term108383.getClass(), "firstRomVersion", "jndrnlnwbO");
        setField(term108383, term108383.getClass(), "firstDataVersion", "qdFzHeHbQc");
        setField(term108383, term108383.getClass(), "firstPlayDate", "EcxYliBmNQ");
        setField(term108383, term108383.getClass(), "compatibleCmVersion", "MGbwgunHMQ");
        setField(term108383, term108383.getClass(), "dailyBonusDate", "wCgQVdppSI");
        setField(term108383, term108383.getClass(), "dailyCourseBonusDate", "oQWxaFnrYq");
        setField(term108383, term108383.getClass(), "lastPairLoginDate", "uZcUOSgoMp");
        setField(term108383, term108383.getClass(), "lastTrialPlayDate", "eMxNpewLIS");
        setIntField(term108383, term108383.getClass(), "playVsCount", -2119606595);
        setIntField(term108383, term108383.getClass(), "playSyncCount", -11676368);
        setIntField(term108383, term108383.getClass(), "winCount", 1176193646);
        setIntField(term108383, term108383.getClass(), "helpCount", -1538768806);
        setIntField(term108383, term108383.getClass(), "comboCount", -762348027);
        setLongField(term108383, term108383.getClass(), "totalDeluxscore", 8784363523617467565L);
        setLongField(term108383, term108383.getClass(), "totalBasicDeluxscore", -2581326673349768387L);
        setLongField(term108383, term108383.getClass(), "totalAdvancedDeluxscore", -8721205078422480633L);
        setLongField(term108383, term108383.getClass(), "totalExpertDeluxscore", -8590885095512673228L);
        setLongField(term108383, term108383.getClass(), "totalMasterDeluxscore", 4081077498890518776L);
        setLongField(term108383, term108383.getClass(), "totalReMasterDeluxscore", -2218287258931868955L);
        setIntField(term108383, term108383.getClass(), "totalSync", 174471043);
        setIntField(term108383, term108383.getClass(), "totalBasicSync", 90007022);
        setIntField(term108383, term108383.getClass(), "totalAdvancedSync", -1775594472);
        setIntField(term108383, term108383.getClass(), "totalExpertSync", 2043059296);
        setIntField(term108383, term108383.getClass(), "totalMasterSync", 809100435);
        setIntField(term108383, term108383.getClass(), "totalReMasterSync", -1186136316);
        setLongField(term108383, term108383.getClass(), "totalAchievement", 8007043833946390244L);
        setLongField(term108383, term108383.getClass(), "totalBasicAchievement", -1028298066253346513L);
        setLongField(term108383, term108383.getClass(), "totalAdvancedAchievement", -1736742262774950648L);
        setLongField(term108383, term108383.getClass(), "totalExpertAchievement", -3526785905169020936L);
        setLongField(term108383, term108383.getClass(), "totalMasterAchievement", -6164563266809190174L);
        setLongField(term108383, term108383.getClass(), "totalReMasterAchievement", 296176504085562157L);
        setLongField(term108383, term108383.getClass(), "playerOldRating", -8754845690934701873L);
        setLongField(term108383, term108383.getClass(), "playerNewRating", -9130931529513264634L);
        setIntField(term108383, term108383.getClass(), "banState", -1777720081);
        setLongField(term108383, term108383.getClass(), "dateTime", -3784941054078150666L);
        setField(term108381, term108381.getClass(), "user", term108383);
        setIntField(term108381, term108381.getClass(), "rate", -21630131);
        setIntField(term108381, term108381.getClass(), "maxRate", -908750386);
        setIntField(term108381, term108381.getClass(), "classValue", 373886649);
        setIntField(term108381, term108381.getClass(), "maxClassValue", -2113984384);
        setIntField(term108381, term108381.getClass(), "totalWinNum", 900825176);
        setIntField(term108381, term108381.getClass(), "totalLoseNum", -1078523636);
        setIntField(term108381, term108381.getClass(), "maxWinNum", -1869767871);
        setIntField(term108381, term108381.getClass(), "maxLoseNum", -1987615511);
        setIntField(term108381, term108381.getClass(), "winNum", -334279196);
        setIntField(term108381, term108381.getClass(), "loseNum", -1801372665);
        setIntField(term108381, term108381.getClass(), "npcTotalWinNum", 149567580);
        setIntField(term108381, term108381.getClass(), "npcTotalLoseNum", -1027296422);
        setIntField(term108381, term108381.getClass(), "npcMaxWinNum", 1436156970);
        setIntField(term108381, term108381.getClass(), "npcMaxLoseNum", 349805322);
        setIntField(term108381, term108381.getClass(), "npcWinNum", -1951028737);
        setIntField(term108381, term108381.getClass(), "npcLoseNum", -2088200216);
        term108756 = new Integer(808519297);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserUdemae");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term108756;
        callMethod(klass, "setClassValue", argTypes, term108381, args);
    }

};


