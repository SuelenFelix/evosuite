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

public class UserMusicDetail_getAchievement_17252126006 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58401;

    public UserMusicDetail_getAchievement_17252126006() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term58407 = new Long(-2177368829816872572L);
        Integer term58470 = new Integer(-680627153);
        Integer term58472 = new Integer(722519669);
        Integer term58474 = new Integer(-40335961);
        Integer term58476 = new Integer(175343605);
        Integer term58478 = new Integer(1050853183);
        Integer term58480 = new Integer(848428785);
        ArrayList term58468 = new ArrayList();
        ((ArrayList) term58468).add(term58470);
        ((ArrayList) term58468).add(term58472);
        ((ArrayList) term58468).add(term58474);
        ((ArrayList) term58468).add(term58476);
        ((ArrayList) term58468).add(term58478);
        ((ArrayList) term58468).add(term58480);
        Integer term58486 = new Integer(-1984436481);
        Integer term58488 = new Integer(-407582855);
        ArrayList term58484 = new ArrayList();
        ((ArrayList) term58484).add(term58486);
        ((ArrayList) term58484).add(term58488);
        term58401 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserMusicDetail"));
        Object term58403 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term58405 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term58421 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term58422 = newInstance(Class.forName("java.time.LocalDate"));
        Object term58426 = newInstance(Class.forName("java.time.LocalTime"));
        Object term58431 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term58432 = newInstance(Class.forName("java.time.LocalDate"));
        Object term58436 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term58401, term58401.getClass(), "id", -1765487752643688529L);
        setLongField(term58403, term58403.getClass(), "id", -322037057179477006L);
        setLongField(term58405, term58405.getClass(), "id", -856690647211976135L);
        setField(term58405, term58405.getClass(), "extId", term58407);
        setField(term58405, term58405.getClass(), "luid", "GXKhRJLVFZ");
        setIntField(term58422, term58422.getClass(), "year", 2023);
        setShortField(term58422, term58422.getClass(), "month", (short) 12);
        setShortField(term58422, term58422.getClass(), "day", (short) 12);
        setField(term58421, term58421.getClass(), "date", term58422);
        setByteField(term58426, term58426.getClass(), "hour", (byte) 0);
        setByteField(term58426, term58426.getClass(), "minute", (byte) 12);
        setByteField(term58426, term58426.getClass(), "second", (byte) 38);
        setIntField(term58426, term58426.getClass(), "nano", 430999236);
        setField(term58421, term58421.getClass(), "time", term58426);
        setField(term58405, term58405.getClass(), "registerTime", term58421);
        setIntField(term58432, term58432.getClass(), "year", 2018);
        setShortField(term58432, term58432.getClass(), "month", (short) 6);
        setShortField(term58432, term58432.getClass(), "day", (short) 17);
        setField(term58431, term58431.getClass(), "date", term58432);
        setByteField(term58436, term58436.getClass(), "hour", (byte) 1);
        setByteField(term58436, term58436.getClass(), "minute", (byte) 3);
        setByteField(term58436, term58436.getClass(), "second", (byte) 5);
        setIntField(term58436, term58436.getClass(), "nano", 914834044);
        setField(term58431, term58431.getClass(), "time", term58436);
        setField(term58405, term58405.getClass(), "accessTime", term58431);
        setField(term58403, term58403.getClass(), "card", term58405);
        setField(term58403, term58403.getClass(), "userName", "qDflhZTJjR");
        setIntField(term58403, term58403.getClass(), "isNetMember", -1176098787);
        setIntField(term58403, term58403.getClass(), "iconId", -1108621848);
        setIntField(term58403, term58403.getClass(), "plateId", 1868049133);
        setIntField(term58403, term58403.getClass(), "titleId", -2041713971);
        setIntField(term58403, term58403.getClass(), "partnerId", 752002755);
        setIntField(term58403, term58403.getClass(), "frameId", -975157064);
        setIntField(term58403, term58403.getClass(), "selectMapId", -378255267);
        setIntField(term58403, term58403.getClass(), "totalAwake", -1205835103);
        setIntField(term58403, term58403.getClass(), "gradeRating", -2022370596);
        setIntField(term58403, term58403.getClass(), "musicRating", 856428856);
        setIntField(term58403, term58403.getClass(), "playerRating", 1295040350);
        setIntField(term58403, term58403.getClass(), "highestRating", 1744402926);
        setIntField(term58403, term58403.getClass(), "gradeRank", -68148707);
        setIntField(term58403, term58403.getClass(), "classRank", -487634357);
        setIntField(term58403, term58403.getClass(), "courseRank", 52605389);
        setField(term58403, term58403.getClass(), "charaSlot", term58468);
        setField(term58403, term58403.getClass(), "charaLockSlot", term58484);
        setLongField(term58403, term58403.getClass(), "contentBit", 1872623849965712756L);
        setIntField(term58403, term58403.getClass(), "playCount", -769585004);
        setField(term58403, term58403.getClass(), "eventWatchedDate", "bzQSjpIauE");
        setField(term58403, term58403.getClass(), "lastGameId", "ESQqarFUtp");
        setField(term58403, term58403.getClass(), "lastRomVersion", "TiCRQbKtcf");
        setField(term58403, term58403.getClass(), "lastDataVersion", "shGEZulpDG");
        setField(term58403, term58403.getClass(), "lastLoginDate", "twDnEqZglX");
        setField(term58403, term58403.getClass(), "lastPlayDate", "TWzZFATLAj");
        setIntField(term58403, term58403.getClass(), "lastPlayCredit", 483184455);
        setIntField(term58403, term58403.getClass(), "lastPlayMode", -1969040570);
        setIntField(term58403, term58403.getClass(), "lastPlaceId", 1627123408);
        setField(term58403, term58403.getClass(), "lastPlaceName", "QjsqHrtVMY");
        setIntField(term58403, term58403.getClass(), "lastAllNetId", 782600956);
        setIntField(term58403, term58403.getClass(), "lastRegionId", -1051453067);
        setField(term58403, term58403.getClass(), "lastRegionName", "PlQZGGhnZK");
        setField(term58403, term58403.getClass(), "lastClientId", "sTtLCWDEPO");
        setField(term58403, term58403.getClass(), "lastCountryCode", "UGMtNRjhnC");
        setIntField(term58403, term58403.getClass(), "lastSelectEMoney", -865849681);
        setIntField(term58403, term58403.getClass(), "lastSelectTicket", -1554795442);
        setIntField(term58403, term58403.getClass(), "lastSelectCourse", 1486110844);
        setIntField(term58403, term58403.getClass(), "lastCountCourse", 1811211444);
        setField(term58403, term58403.getClass(), "firstGameId", "oTnPmmIphJ");
        setField(term58403, term58403.getClass(), "firstRomVersion", "vTgJolwQXF");
        setField(term58403, term58403.getClass(), "firstDataVersion", "QuNSfeKtAH");
        setField(term58403, term58403.getClass(), "firstPlayDate", "vFhRdscfFA");
        setField(term58403, term58403.getClass(), "compatibleCmVersion", "ZmfocrvaII");
        setField(term58403, term58403.getClass(), "dailyBonusDate", "LTbQXrGKuA");
        setField(term58403, term58403.getClass(), "dailyCourseBonusDate", "gzmGmDALUv");
        setField(term58403, term58403.getClass(), "lastPairLoginDate", "ZRoptBRTDM");
        setField(term58403, term58403.getClass(), "lastTrialPlayDate", "vVVFChfeBQ");
        setIntField(term58403, term58403.getClass(), "playVsCount", -1188357817);
        setIntField(term58403, term58403.getClass(), "playSyncCount", 800428961);
        setIntField(term58403, term58403.getClass(), "winCount", 1035639807);
        setIntField(term58403, term58403.getClass(), "helpCount", 1255067608);
        setIntField(term58403, term58403.getClass(), "comboCount", -1085076149);
        setLongField(term58403, term58403.getClass(), "totalDeluxscore", 4536273050817852892L);
        setLongField(term58403, term58403.getClass(), "totalBasicDeluxscore", -8877453128191451125L);
        setLongField(term58403, term58403.getClass(), "totalAdvancedDeluxscore", -7419533263156606680L);
        setLongField(term58403, term58403.getClass(), "totalExpertDeluxscore", -6669304009215553269L);
        setLongField(term58403, term58403.getClass(), "totalMasterDeluxscore", 8850925698448189827L);
        setLongField(term58403, term58403.getClass(), "totalReMasterDeluxscore", -2444680017884853722L);
        setIntField(term58403, term58403.getClass(), "totalSync", 2037214602);
        setIntField(term58403, term58403.getClass(), "totalBasicSync", 1791859428);
        setIntField(term58403, term58403.getClass(), "totalAdvancedSync", 313791373);
        setIntField(term58403, term58403.getClass(), "totalExpertSync", -1757202955);
        setIntField(term58403, term58403.getClass(), "totalMasterSync", -1618822811);
        setIntField(term58403, term58403.getClass(), "totalReMasterSync", -850405849);
        setLongField(term58403, term58403.getClass(), "totalAchievement", 3396057794430157389L);
        setLongField(term58403, term58403.getClass(), "totalBasicAchievement", -419363521580148942L);
        setLongField(term58403, term58403.getClass(), "totalAdvancedAchievement", 7635276988377158212L);
        setLongField(term58403, term58403.getClass(), "totalExpertAchievement", -5040671346926017489L);
        setLongField(term58403, term58403.getClass(), "totalMasterAchievement", -8525585238233113814L);
        setLongField(term58403, term58403.getClass(), "totalReMasterAchievement", -3955508582186061944L);
        setLongField(term58403, term58403.getClass(), "playerOldRating", -7986118407298160731L);
        setLongField(term58403, term58403.getClass(), "playerNewRating", 6721721782435142809L);
        setIntField(term58403, term58403.getClass(), "banState", -545145172);
        setLongField(term58403, term58403.getClass(), "dateTime", -8413391289081836699L);
        setField(term58401, term58401.getClass(), "user", term58403);
        setIntField(term58401, term58401.getClass(), "musicId", -2069653687);
        setIntField(term58401, term58401.getClass(), "level", -1832612963);
        setIntField(term58401, term58401.getClass(), "playCount", 1064073662);
        setIntField(term58401, term58401.getClass(), "achievement", 1120854991);
        setIntField(term58401, term58401.getClass(), "comboStatus", 1448504845);
        setIntField(term58401, term58401.getClass(), "syncStatus", 451612513);
        setIntField(term58401, term58401.getClass(), "deluxscoreMax", 343920197);
        setIntField(term58401, term58401.getClass(), "scoreRank", -521630681);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAchievement", argTypes, term58401, args);
    }

};


