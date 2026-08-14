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

public class UserDetail_getTotalAchievement_27060903367 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term233459;

    public UserDetail_getTotalAchievement_27060903367() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term233463 = new Long(3104349415269466587L);
        Integer term233526 = new Integer(-1181936403);
        Integer term233528 = new Integer(597843779);
        Integer term233530 = new Integer(-920715260);
        Integer term233532 = new Integer(-111304359);
        Integer term233534 = new Integer(-1359946362);
        Integer term233536 = new Integer(882866050);
        Integer term233538 = new Integer(-979923296);
        ArrayList term233524 = new ArrayList();
        ((ArrayList) term233524).add(term233526);
        ((ArrayList) term233524).add(term233528);
        ((ArrayList) term233524).add(term233530);
        ((ArrayList) term233524).add(term233532);
        ((ArrayList) term233524).add(term233534);
        ((ArrayList) term233524).add(term233536);
        ((ArrayList) term233524).add(term233538);
        Integer term233544 = new Integer(1294282133);
        ArrayList term233542 = new ArrayList();
        ((ArrayList) term233542).add(term233544);
        term233459 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term233461 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term233477 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term233478 = newInstance(Class.forName("java.time.LocalDate"));
        Object term233482 = newInstance(Class.forName("java.time.LocalTime"));
        Object term233487 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term233488 = newInstance(Class.forName("java.time.LocalDate"));
        Object term233492 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term233459, term233459.getClass(), "id", 3909767097276933654L);
        setLongField(term233461, term233461.getClass(), "id", -1443149616140457580L);
        setField(term233461, term233461.getClass(), "extId", term233463);
        setField(term233461, term233461.getClass(), "luid", "zekWayuKWe");
        setIntField(term233478, term233478.getClass(), "year", 2011);
        setShortField(term233478, term233478.getClass(), "month", (short) 4);
        setShortField(term233478, term233478.getClass(), "day", (short) 14);
        setField(term233477, term233477.getClass(), "date", term233478);
        setByteField(term233482, term233482.getClass(), "hour", (byte) 4);
        setByteField(term233482, term233482.getClass(), "minute", (byte) 35);
        setByteField(term233482, term233482.getClass(), "second", (byte) 21);
        setIntField(term233482, term233482.getClass(), "nano", 578174822);
        setField(term233477, term233477.getClass(), "time", term233482);
        setField(term233461, term233461.getClass(), "registerTime", term233477);
        setIntField(term233488, term233488.getClass(), "year", 2028);
        setShortField(term233488, term233488.getClass(), "month", (short) 2);
        setShortField(term233488, term233488.getClass(), "day", (short) 8);
        setField(term233487, term233487.getClass(), "date", term233488);
        setByteField(term233492, term233492.getClass(), "hour", (byte) 9);
        setByteField(term233492, term233492.getClass(), "minute", (byte) 51);
        setByteField(term233492, term233492.getClass(), "second", (byte) 30);
        setIntField(term233492, term233492.getClass(), "nano", 433905289);
        setField(term233487, term233487.getClass(), "time", term233492);
        setField(term233461, term233461.getClass(), "accessTime", term233487);
        setField(term233459, term233459.getClass(), "card", term233461);
        setField(term233459, term233459.getClass(), "userName", "ECrlgCZHjb");
        setIntField(term233459, term233459.getClass(), "isNetMember", 1463010893);
        setIntField(term233459, term233459.getClass(), "iconId", -1452316637);
        setIntField(term233459, term233459.getClass(), "plateId", -838298764);
        setIntField(term233459, term233459.getClass(), "titleId", 953497835);
        setIntField(term233459, term233459.getClass(), "partnerId", -1249269926);
        setIntField(term233459, term233459.getClass(), "frameId", -1389133666);
        setIntField(term233459, term233459.getClass(), "selectMapId", 308996006);
        setIntField(term233459, term233459.getClass(), "totalAwake", 1161088046);
        setIntField(term233459, term233459.getClass(), "gradeRating", 960018546);
        setIntField(term233459, term233459.getClass(), "musicRating", -2118429819);
        setIntField(term233459, term233459.getClass(), "playerRating", -2005706286);
        setIntField(term233459, term233459.getClass(), "highestRating", -556951238);
        setIntField(term233459, term233459.getClass(), "gradeRank", -1728342547);
        setIntField(term233459, term233459.getClass(), "classRank", -2088958897);
        setIntField(term233459, term233459.getClass(), "courseRank", 2078210785);
        setField(term233459, term233459.getClass(), "charaSlot", term233524);
        setField(term233459, term233459.getClass(), "charaLockSlot", term233542);
        setLongField(term233459, term233459.getClass(), "contentBit", 8037116802229597692L);
        setIntField(term233459, term233459.getClass(), "playCount", 427319716);
        setField(term233459, term233459.getClass(), "eventWatchedDate", "xYtFJCbsbO");
        setField(term233459, term233459.getClass(), "lastGameId", "ZPCvymeQVU");
        setField(term233459, term233459.getClass(), "lastRomVersion", "sLCvnzKIFo");
        setField(term233459, term233459.getClass(), "lastDataVersion", "goGIsaCumE");
        setField(term233459, term233459.getClass(), "lastLoginDate", "GiVMlvuShR");
        setField(term233459, term233459.getClass(), "lastPlayDate", "ZPGcWKWutp");
        setIntField(term233459, term233459.getClass(), "lastPlayCredit", 1672134929);
        setIntField(term233459, term233459.getClass(), "lastPlayMode", -141732103);
        setIntField(term233459, term233459.getClass(), "lastPlaceId", -1315502709);
        setField(term233459, term233459.getClass(), "lastPlaceName", "gFgcyNetpo");
        setIntField(term233459, term233459.getClass(), "lastAllNetId", -755308608);
        setIntField(term233459, term233459.getClass(), "lastRegionId", -74057307);
        setField(term233459, term233459.getClass(), "lastRegionName", "hHOpAcIbrX");
        setField(term233459, term233459.getClass(), "lastClientId", "tTVkENlDIG");
        setField(term233459, term233459.getClass(), "lastCountryCode", "FvTMHvjoRU");
        setIntField(term233459, term233459.getClass(), "lastSelectEMoney", 1133890568);
        setIntField(term233459, term233459.getClass(), "lastSelectTicket", -1537842167);
        setIntField(term233459, term233459.getClass(), "lastSelectCourse", -1785621434);
        setIntField(term233459, term233459.getClass(), "lastCountCourse", -1591665469);
        setField(term233459, term233459.getClass(), "firstGameId", "EJpmCzuBBK");
        setField(term233459, term233459.getClass(), "firstRomVersion", "yIrQZlXeDl");
        setField(term233459, term233459.getClass(), "firstDataVersion", "IXSfYobkAg");
        setField(term233459, term233459.getClass(), "firstPlayDate", "TpYMxcIQzy");
        setField(term233459, term233459.getClass(), "compatibleCmVersion", "ywfCzJJUCY");
        setField(term233459, term233459.getClass(), "dailyBonusDate", "TsARcdrqyk");
        setField(term233459, term233459.getClass(), "dailyCourseBonusDate", "wreFfKvmjb");
        setField(term233459, term233459.getClass(), "lastPairLoginDate", "LLTyGZZqRf");
        setField(term233459, term233459.getClass(), "lastTrialPlayDate", "luuujjjCiB");
        setIntField(term233459, term233459.getClass(), "playVsCount", -1505625906);
        setIntField(term233459, term233459.getClass(), "playSyncCount", -1623892722);
        setIntField(term233459, term233459.getClass(), "winCount", 1807438387);
        setIntField(term233459, term233459.getClass(), "helpCount", 911187186);
        setIntField(term233459, term233459.getClass(), "comboCount", -772562965);
        setLongField(term233459, term233459.getClass(), "totalDeluxscore", -5611149132849899108L);
        setLongField(term233459, term233459.getClass(), "totalBasicDeluxscore", 3291346185553347924L);
        setLongField(term233459, term233459.getClass(), "totalAdvancedDeluxscore", 3971997283680673075L);
        setLongField(term233459, term233459.getClass(), "totalExpertDeluxscore", 7862186299051476140L);
        setLongField(term233459, term233459.getClass(), "totalMasterDeluxscore", 2438792678064435188L);
        setLongField(term233459, term233459.getClass(), "totalReMasterDeluxscore", 3000898825884778616L);
        setIntField(term233459, term233459.getClass(), "totalSync", 2081332215);
        setIntField(term233459, term233459.getClass(), "totalBasicSync", 1586283756);
        setIntField(term233459, term233459.getClass(), "totalAdvancedSync", -335091853);
        setIntField(term233459, term233459.getClass(), "totalExpertSync", -1702801898);
        setIntField(term233459, term233459.getClass(), "totalMasterSync", 1529874496);
        setIntField(term233459, term233459.getClass(), "totalReMasterSync", -998359895);
        setLongField(term233459, term233459.getClass(), "totalAchievement", -7525675331115095909L);
        setLongField(term233459, term233459.getClass(), "totalBasicAchievement", -4684447831405489389L);
        setLongField(term233459, term233459.getClass(), "totalAdvancedAchievement", -1234944805975284573L);
        setLongField(term233459, term233459.getClass(), "totalExpertAchievement", -2262970860436884733L);
        setLongField(term233459, term233459.getClass(), "totalMasterAchievement", -5173367172520031696L);
        setLongField(term233459, term233459.getClass(), "totalReMasterAchievement", 1634750282436944257L);
        setLongField(term233459, term233459.getClass(), "playerOldRating", -6569625350734756817L);
        setLongField(term233459, term233459.getClass(), "playerNewRating", -8480494695741080265L);
        setIntField(term233459, term233459.getClass(), "banState", -578729253);
        setLongField(term233459, term233459.getClass(), "dateTime", -846917263311840069L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalAchievement", argTypes, term233459, args);
    }

};


