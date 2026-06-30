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

public class UserDetail_getTotalReMasterAchievement_93664770072 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4270346;

    public UserDetail_getTotalReMasterAchievement_93664770072() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4270350 = new Long(-741178090091846530L);
        Integer term4270413 = new Integer(975944827);
        ArrayList term4270411 = new ArrayList();
        ((ArrayList) term4270411).add(term4270413);
        Integer term4270419 = new Integer(880513984);
        Integer term4270421 = new Integer(-846950202);
        Integer term4270423 = new Integer(-109407576);
        Integer term4270425 = new Integer(-2104308132);
        Integer term4270427 = new Integer(1163850867);
        ArrayList term4270417 = new ArrayList();
        ((ArrayList) term4270417).add(term4270419);
        ((ArrayList) term4270417).add(term4270421);
        ((ArrayList) term4270417).add(term4270423);
        ((ArrayList) term4270417).add(term4270425);
        ((ArrayList) term4270417).add(term4270427);
        term4270346 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term4270348 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term4270364 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4270365 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4270369 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4270374 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4270375 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4270379 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term4270346, term4270346.getClass(), "id", -2681601222893152287L);
        setLongField(term4270348, term4270348.getClass(), "id", -1787637309546145580L);
        setField(term4270348, term4270348.getClass(), "extId", term4270350);
        setField(term4270348, term4270348.getClass(), "luid", "lxDjHeExho");
        setIntField(term4270365, term4270365.getClass(), "year", 2023);
        setShortField(term4270365, term4270365.getClass(), "month", (short) 12);
        setShortField(term4270365, term4270365.getClass(), "day", (short) 7);
        setField(term4270364, term4270364.getClass(), "date", term4270365);
        setByteField(term4270369, term4270369.getClass(), "hour", (byte) 10);
        setByteField(term4270369, term4270369.getClass(), "minute", (byte) 59);
        setByteField(term4270369, term4270369.getClass(), "second", (byte) 29);
        setIntField(term4270369, term4270369.getClass(), "nano", 109760260);
        setField(term4270364, term4270364.getClass(), "time", term4270369);
        setField(term4270348, term4270348.getClass(), "registerTime", term4270364);
        setIntField(term4270375, term4270375.getClass(), "year", 2019);
        setShortField(term4270375, term4270375.getClass(), "month", (short) 2);
        setShortField(term4270375, term4270375.getClass(), "day", (short) 23);
        setField(term4270374, term4270374.getClass(), "date", term4270375);
        setByteField(term4270379, term4270379.getClass(), "hour", (byte) 16);
        setByteField(term4270379, term4270379.getClass(), "minute", (byte) 5);
        setByteField(term4270379, term4270379.getClass(), "second", (byte) 30);
        setIntField(term4270379, term4270379.getClass(), "nano", 213923308);
        setField(term4270374, term4270374.getClass(), "time", term4270379);
        setField(term4270348, term4270348.getClass(), "accessTime", term4270374);
        setField(term4270346, term4270346.getClass(), "card", term4270348);
        setField(term4270346, term4270346.getClass(), "userName", "RZZfgYSxxp");
        setIntField(term4270346, term4270346.getClass(), "isNetMember", 1631533576);
        setIntField(term4270346, term4270346.getClass(), "iconId", 1219183702);
        setIntField(term4270346, term4270346.getClass(), "plateId", -976554025);
        setIntField(term4270346, term4270346.getClass(), "titleId", -1879917217);
        setIntField(term4270346, term4270346.getClass(), "partnerId", -1721771512);
        setIntField(term4270346, term4270346.getClass(), "frameId", -433107244);
        setIntField(term4270346, term4270346.getClass(), "selectMapId", 386358572);
        setIntField(term4270346, term4270346.getClass(), "totalAwake", -707066593);
        setIntField(term4270346, term4270346.getClass(), "gradeRating", -1353924687);
        setIntField(term4270346, term4270346.getClass(), "musicRating", 1374018690);
        setIntField(term4270346, term4270346.getClass(), "playerRating", -1766077826);
        setIntField(term4270346, term4270346.getClass(), "highestRating", -1463485132);
        setIntField(term4270346, term4270346.getClass(), "gradeRank", 1483956503);
        setIntField(term4270346, term4270346.getClass(), "classRank", -1038626950);
        setIntField(term4270346, term4270346.getClass(), "courseRank", 1593831336);
        setField(term4270346, term4270346.getClass(), "charaSlot", term4270411);
        setField(term4270346, term4270346.getClass(), "charaLockSlot", term4270417);
        setLongField(term4270346, term4270346.getClass(), "contentBit", -5985284020043356680L);
        setIntField(term4270346, term4270346.getClass(), "playCount", 1796334053);
        setField(term4270346, term4270346.getClass(), "eventWatchedDate", "NUBXWlYUxu");
        setField(term4270346, term4270346.getClass(), "lastGameId", "GFjdCnXnvj");
        setField(term4270346, term4270346.getClass(), "lastRomVersion", "PDhmMyoDNF");
        setField(term4270346, term4270346.getClass(), "lastDataVersion", "sxZDSCrhau");
        setField(term4270346, term4270346.getClass(), "lastLoginDate", "wkWTwVrARt");
        setField(term4270346, term4270346.getClass(), "lastPlayDate", "qxVILqCIKH");
        setIntField(term4270346, term4270346.getClass(), "lastPlayCredit", 1522202527);
        setIntField(term4270346, term4270346.getClass(), "lastPlayMode", 2041911644);
        setIntField(term4270346, term4270346.getClass(), "lastPlaceId", 559271875);
        setField(term4270346, term4270346.getClass(), "lastPlaceName", "FbfxVBkaSw");
        setIntField(term4270346, term4270346.getClass(), "lastAllNetId", -1187282529);
        setIntField(term4270346, term4270346.getClass(), "lastRegionId", 1367292646);
        setField(term4270346, term4270346.getClass(), "lastRegionName", "VJOfxBnyUc");
        setField(term4270346, term4270346.getClass(), "lastClientId", "TUlACLTRXJ");
        setField(term4270346, term4270346.getClass(), "lastCountryCode", "vKynpeAjgb");
        setIntField(term4270346, term4270346.getClass(), "lastSelectEMoney", -315677089);
        setIntField(term4270346, term4270346.getClass(), "lastSelectTicket", 575492264);
        setIntField(term4270346, term4270346.getClass(), "lastSelectCourse", 1192816681);
        setIntField(term4270346, term4270346.getClass(), "lastCountCourse", -389978655);
        setField(term4270346, term4270346.getClass(), "firstGameId", "rfXtVibeGk");
        setField(term4270346, term4270346.getClass(), "firstRomVersion", "LqMZoLcPtf");
        setField(term4270346, term4270346.getClass(), "firstDataVersion", "ZDOsvzBSij");
        setField(term4270346, term4270346.getClass(), "firstPlayDate", "asCaOqFhLX");
        setField(term4270346, term4270346.getClass(), "compatibleCmVersion", "vKLSKbaXVy");
        setField(term4270346, term4270346.getClass(), "dailyBonusDate", "pMHwhLOhdb");
        setField(term4270346, term4270346.getClass(), "dailyCourseBonusDate", "kjmxDhZphl");
        setField(term4270346, term4270346.getClass(), "lastPairLoginDate", "qLAtIgZSob");
        setField(term4270346, term4270346.getClass(), "lastTrialPlayDate", "CKAUmXBQpv");
        setIntField(term4270346, term4270346.getClass(), "playVsCount", -165255767);
        setIntField(term4270346, term4270346.getClass(), "playSyncCount", -1470972238);
        setIntField(term4270346, term4270346.getClass(), "winCount", 148814107);
        setIntField(term4270346, term4270346.getClass(), "helpCount", -1702761915);
        setIntField(term4270346, term4270346.getClass(), "comboCount", 569869025);
        setLongField(term4270346, term4270346.getClass(), "totalDeluxscore", -1737279211244957619L);
        setLongField(term4270346, term4270346.getClass(), "totalBasicDeluxscore", -2892343397454854372L);
        setLongField(term4270346, term4270346.getClass(), "totalAdvancedDeluxscore", 7409105662737445573L);
        setLongField(term4270346, term4270346.getClass(), "totalExpertDeluxscore", -868274114922475482L);
        setLongField(term4270346, term4270346.getClass(), "totalMasterDeluxscore", 1110787642711393482L);
        setLongField(term4270346, term4270346.getClass(), "totalReMasterDeluxscore", 3332289982383735863L);
        setIntField(term4270346, term4270346.getClass(), "totalSync", -1141159736);
        setIntField(term4270346, term4270346.getClass(), "totalBasicSync", -1765063280);
        setIntField(term4270346, term4270346.getClass(), "totalAdvancedSync", -596150743);
        setIntField(term4270346, term4270346.getClass(), "totalExpertSync", 48899329);
        setIntField(term4270346, term4270346.getClass(), "totalMasterSync", 2077145241);
        setIntField(term4270346, term4270346.getClass(), "totalReMasterSync", -330864358);
        setLongField(term4270346, term4270346.getClass(), "totalAchievement", -8336369823664875247L);
        setLongField(term4270346, term4270346.getClass(), "totalBasicAchievement", 2145735180968626428L);
        setLongField(term4270346, term4270346.getClass(), "totalAdvancedAchievement", -5871936114515548077L);
        setLongField(term4270346, term4270346.getClass(), "totalExpertAchievement", 5541047062525008690L);
        setLongField(term4270346, term4270346.getClass(), "totalMasterAchievement", -8756219261102652559L);
        setLongField(term4270346, term4270346.getClass(), "totalReMasterAchievement", -7556805273508313236L);
        setLongField(term4270346, term4270346.getClass(), "playerOldRating", 1679116149322400734L);
        setLongField(term4270346, term4270346.getClass(), "playerNewRating", 43578030153100052L);
        setIntField(term4270346, term4270346.getClass(), "banState", 1216229352);
        setLongField(term4270346, term4270346.getClass(), "dateTime", 787617297879735869L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalReMasterAchievement", argTypes, term4270346, args);
    }

};


