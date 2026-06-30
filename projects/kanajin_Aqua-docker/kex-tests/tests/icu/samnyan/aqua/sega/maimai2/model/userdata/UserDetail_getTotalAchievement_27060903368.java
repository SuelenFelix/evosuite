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

public class UserDetail_getTotalAchievement_27060903368 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term233514;

    public UserDetail_getTotalAchievement_27060903368() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term233518 = new Long(3104349415269466587L);
        Integer term233581 = new Integer(-1181936403);
        Integer term233583 = new Integer(597843779);
        Integer term233585 = new Integer(-920715260);
        Integer term233587 = new Integer(-111304359);
        Integer term233589 = new Integer(-1359946362);
        Integer term233591 = new Integer(882866050);
        Integer term233593 = new Integer(-979923296);
        ArrayList term233579 = new ArrayList();
        ((ArrayList) term233579).add(term233581);
        ((ArrayList) term233579).add(term233583);
        ((ArrayList) term233579).add(term233585);
        ((ArrayList) term233579).add(term233587);
        ((ArrayList) term233579).add(term233589);
        ((ArrayList) term233579).add(term233591);
        ((ArrayList) term233579).add(term233593);
        Integer term233599 = new Integer(1294282133);
        ArrayList term233597 = new ArrayList();
        ((ArrayList) term233597).add(term233599);
        term233514 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term233516 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term233532 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term233533 = newInstance(Class.forName("java.time.LocalDate"));
        Object term233537 = newInstance(Class.forName("java.time.LocalTime"));
        Object term233542 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term233543 = newInstance(Class.forName("java.time.LocalDate"));
        Object term233547 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term233514, term233514.getClass(), "id", 3909767097276933654L);
        setLongField(term233516, term233516.getClass(), "id", -1443149616140457580L);
        setField(term233516, term233516.getClass(), "extId", term233518);
        setField(term233516, term233516.getClass(), "luid", "zekWayuKWe");
        setIntField(term233533, term233533.getClass(), "year", 2011);
        setShortField(term233533, term233533.getClass(), "month", (short) 4);
        setShortField(term233533, term233533.getClass(), "day", (short) 14);
        setField(term233532, term233532.getClass(), "date", term233533);
        setByteField(term233537, term233537.getClass(), "hour", (byte) 4);
        setByteField(term233537, term233537.getClass(), "minute", (byte) 35);
        setByteField(term233537, term233537.getClass(), "second", (byte) 21);
        setIntField(term233537, term233537.getClass(), "nano", 578174822);
        setField(term233532, term233532.getClass(), "time", term233537);
        setField(term233516, term233516.getClass(), "registerTime", term233532);
        setIntField(term233543, term233543.getClass(), "year", 2028);
        setShortField(term233543, term233543.getClass(), "month", (short) 2);
        setShortField(term233543, term233543.getClass(), "day", (short) 8);
        setField(term233542, term233542.getClass(), "date", term233543);
        setByteField(term233547, term233547.getClass(), "hour", (byte) 9);
        setByteField(term233547, term233547.getClass(), "minute", (byte) 51);
        setByteField(term233547, term233547.getClass(), "second", (byte) 30);
        setIntField(term233547, term233547.getClass(), "nano", 433905289);
        setField(term233542, term233542.getClass(), "time", term233547);
        setField(term233516, term233516.getClass(), "accessTime", term233542);
        setField(term233514, term233514.getClass(), "card", term233516);
        setField(term233514, term233514.getClass(), "userName", "ECrlgCZHjb");
        setIntField(term233514, term233514.getClass(), "isNetMember", 1463010893);
        setIntField(term233514, term233514.getClass(), "iconId", -1452316637);
        setIntField(term233514, term233514.getClass(), "plateId", -838298764);
        setIntField(term233514, term233514.getClass(), "titleId", 953497835);
        setIntField(term233514, term233514.getClass(), "partnerId", -1249269926);
        setIntField(term233514, term233514.getClass(), "frameId", -1389133666);
        setIntField(term233514, term233514.getClass(), "selectMapId", 308996006);
        setIntField(term233514, term233514.getClass(), "totalAwake", 1161088046);
        setIntField(term233514, term233514.getClass(), "gradeRating", 960018546);
        setIntField(term233514, term233514.getClass(), "musicRating", -2118429819);
        setIntField(term233514, term233514.getClass(), "playerRating", -2005706286);
        setIntField(term233514, term233514.getClass(), "highestRating", -556951238);
        setIntField(term233514, term233514.getClass(), "gradeRank", -1728342547);
        setIntField(term233514, term233514.getClass(), "classRank", -2088958897);
        setIntField(term233514, term233514.getClass(), "courseRank", 2078210785);
        setField(term233514, term233514.getClass(), "charaSlot", term233579);
        setField(term233514, term233514.getClass(), "charaLockSlot", term233597);
        setLongField(term233514, term233514.getClass(), "contentBit", 8037116802229597692L);
        setIntField(term233514, term233514.getClass(), "playCount", 427319716);
        setField(term233514, term233514.getClass(), "eventWatchedDate", "xYtFJCbsbO");
        setField(term233514, term233514.getClass(), "lastGameId", "ZPCvymeQVU");
        setField(term233514, term233514.getClass(), "lastRomVersion", "sLCvnzKIFo");
        setField(term233514, term233514.getClass(), "lastDataVersion", "goGIsaCumE");
        setField(term233514, term233514.getClass(), "lastLoginDate", "GiVMlvuShR");
        setField(term233514, term233514.getClass(), "lastPlayDate", "ZPGcWKWutp");
        setIntField(term233514, term233514.getClass(), "lastPlayCredit", 1672134929);
        setIntField(term233514, term233514.getClass(), "lastPlayMode", -141732103);
        setIntField(term233514, term233514.getClass(), "lastPlaceId", -1315502709);
        setField(term233514, term233514.getClass(), "lastPlaceName", "gFgcyNetpo");
        setIntField(term233514, term233514.getClass(), "lastAllNetId", -755308608);
        setIntField(term233514, term233514.getClass(), "lastRegionId", -74057307);
        setField(term233514, term233514.getClass(), "lastRegionName", "hHOpAcIbrX");
        setField(term233514, term233514.getClass(), "lastClientId", "tTVkENlDIG");
        setField(term233514, term233514.getClass(), "lastCountryCode", "FvTMHvjoRU");
        setIntField(term233514, term233514.getClass(), "lastSelectEMoney", 1133890568);
        setIntField(term233514, term233514.getClass(), "lastSelectTicket", -1537842167);
        setIntField(term233514, term233514.getClass(), "lastSelectCourse", -1785621434);
        setIntField(term233514, term233514.getClass(), "lastCountCourse", -1591665469);
        setField(term233514, term233514.getClass(), "firstGameId", "EJpmCzuBBK");
        setField(term233514, term233514.getClass(), "firstRomVersion", "yIrQZlXeDl");
        setField(term233514, term233514.getClass(), "firstDataVersion", "IXSfYobkAg");
        setField(term233514, term233514.getClass(), "firstPlayDate", "TpYMxcIQzy");
        setField(term233514, term233514.getClass(), "compatibleCmVersion", "ywfCzJJUCY");
        setField(term233514, term233514.getClass(), "dailyBonusDate", "TsARcdrqyk");
        setField(term233514, term233514.getClass(), "dailyCourseBonusDate", "wreFfKvmjb");
        setField(term233514, term233514.getClass(), "lastPairLoginDate", "LLTyGZZqRf");
        setField(term233514, term233514.getClass(), "lastTrialPlayDate", "luuujjjCiB");
        setIntField(term233514, term233514.getClass(), "playVsCount", -1505625906);
        setIntField(term233514, term233514.getClass(), "playSyncCount", -1623892722);
        setIntField(term233514, term233514.getClass(), "winCount", 1807438387);
        setIntField(term233514, term233514.getClass(), "helpCount", 911187186);
        setIntField(term233514, term233514.getClass(), "comboCount", -772562965);
        setLongField(term233514, term233514.getClass(), "totalDeluxscore", -5611149132849899108L);
        setLongField(term233514, term233514.getClass(), "totalBasicDeluxscore", 3291346185553347924L);
        setLongField(term233514, term233514.getClass(), "totalAdvancedDeluxscore", 3971997283680673075L);
        setLongField(term233514, term233514.getClass(), "totalExpertDeluxscore", 7862186299051476140L);
        setLongField(term233514, term233514.getClass(), "totalMasterDeluxscore", 2438792678064435188L);
        setLongField(term233514, term233514.getClass(), "totalReMasterDeluxscore", 3000898825884778616L);
        setIntField(term233514, term233514.getClass(), "totalSync", 2081332215);
        setIntField(term233514, term233514.getClass(), "totalBasicSync", 1586283756);
        setIntField(term233514, term233514.getClass(), "totalAdvancedSync", -335091853);
        setIntField(term233514, term233514.getClass(), "totalExpertSync", -1702801898);
        setIntField(term233514, term233514.getClass(), "totalMasterSync", 1529874496);
        setIntField(term233514, term233514.getClass(), "totalReMasterSync", -998359895);
        setLongField(term233514, term233514.getClass(), "totalAchievement", -7525675331115095909L);
        setLongField(term233514, term233514.getClass(), "totalBasicAchievement", -4684447831405489389L);
        setLongField(term233514, term233514.getClass(), "totalAdvancedAchievement", -1234944805975284573L);
        setLongField(term233514, term233514.getClass(), "totalExpertAchievement", -2262970860436884733L);
        setLongField(term233514, term233514.getClass(), "totalMasterAchievement", -5173367172520031696L);
        setLongField(term233514, term233514.getClass(), "totalReMasterAchievement", 1634750282436944257L);
        setLongField(term233514, term233514.getClass(), "playerOldRating", -6569625350734756817L);
        setLongField(term233514, term233514.getClass(), "playerNewRating", -8480494695741080265L);
        setIntField(term233514, term233514.getClass(), "banState", -578729253);
        setLongField(term233514, term233514.getClass(), "dateTime", -846917263311840069L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalAchievement", argTypes, term233514, args);
    }

};


