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

public class UserDetail_setPlayerOldRating_789141119150 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term281012;
     Object term281375;

    public UserDetail_setPlayerOldRating_789141119150() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term281016 = new Long(8847748922379375307L);
        Integer term281079 = new Integer(338229726);
        Integer term281081 = new Integer(-1891580978);
        Integer term281083 = new Integer(1101260257);
        Integer term281085 = new Integer(1800400048);
        Integer term281087 = new Integer(-1248348901);
        ArrayList term281077 = new ArrayList();
        ((ArrayList) term281077).add(term281079);
        ((ArrayList) term281077).add(term281081);
        ((ArrayList) term281077).add(term281083);
        ((ArrayList) term281077).add(term281085);
        ((ArrayList) term281077).add(term281087);
        Integer term281093 = new Integer(-808864128);
        Integer term281095 = new Integer(-1813216452);
        Integer term281097 = new Integer(180516410);
        Integer term281099 = new Integer(606206987);
        Integer term281101 = new Integer(-534930572);
        Integer term281103 = new Integer(-748140133);
        Integer term281105 = new Integer(795993216);
        ArrayList term281091 = new ArrayList();
        ((ArrayList) term281091).add(term281093);
        ((ArrayList) term281091).add(term281095);
        ((ArrayList) term281091).add(term281097);
        ((ArrayList) term281091).add(term281099);
        ((ArrayList) term281091).add(term281101);
        ((ArrayList) term281091).add(term281103);
        ((ArrayList) term281091).add(term281105);
        term281012 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term281014 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term281030 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term281031 = newInstance(Class.forName("java.time.LocalDate"));
        Object term281035 = newInstance(Class.forName("java.time.LocalTime"));
        Object term281040 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term281041 = newInstance(Class.forName("java.time.LocalDate"));
        Object term281045 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term281012, term281012.getClass(), "id", -4308060436706063425L);
        setLongField(term281014, term281014.getClass(), "id", 8958523844182801555L);
        setField(term281014, term281014.getClass(), "extId", term281016);
        setField(term281014, term281014.getClass(), "luid", "wbTCLFBQCF");
        setIntField(term281031, term281031.getClass(), "year", 2023);
        setShortField(term281031, term281031.getClass(), "month", (short) 8);
        setShortField(term281031, term281031.getClass(), "day", (short) 23);
        setField(term281030, term281030.getClass(), "date", term281031);
        setByteField(term281035, term281035.getClass(), "hour", (byte) 23);
        setByteField(term281035, term281035.getClass(), "minute", (byte) 38);
        setByteField(term281035, term281035.getClass(), "second", (byte) 9);
        setIntField(term281035, term281035.getClass(), "nano", 356476969);
        setField(term281030, term281030.getClass(), "time", term281035);
        setField(term281014, term281014.getClass(), "registerTime", term281030);
        setIntField(term281041, term281041.getClass(), "year", 2014);
        setShortField(term281041, term281041.getClass(), "month", (short) 4);
        setShortField(term281041, term281041.getClass(), "day", (short) 23);
        setField(term281040, term281040.getClass(), "date", term281041);
        setByteField(term281045, term281045.getClass(), "hour", (byte) 21);
        setByteField(term281045, term281045.getClass(), "minute", (byte) 18);
        setByteField(term281045, term281045.getClass(), "second", (byte) 52);
        setIntField(term281045, term281045.getClass(), "nano", 192261366);
        setField(term281040, term281040.getClass(), "time", term281045);
        setField(term281014, term281014.getClass(), "accessTime", term281040);
        setField(term281012, term281012.getClass(), "card", term281014);
        setField(term281012, term281012.getClass(), "userName", "YdrFzLJmBL");
        setIntField(term281012, term281012.getClass(), "isNetMember", 1198986574);
        setIntField(term281012, term281012.getClass(), "iconId", 1496477362);
        setIntField(term281012, term281012.getClass(), "plateId", 694634515);
        setIntField(term281012, term281012.getClass(), "titleId", -1684684863);
        setIntField(term281012, term281012.getClass(), "partnerId", -1337880590);
        setIntField(term281012, term281012.getClass(), "frameId", -40671465);
        setIntField(term281012, term281012.getClass(), "selectMapId", 906922634);
        setIntField(term281012, term281012.getClass(), "totalAwake", 50121333);
        setIntField(term281012, term281012.getClass(), "gradeRating", 1552254538);
        setIntField(term281012, term281012.getClass(), "musicRating", -66330072);
        setIntField(term281012, term281012.getClass(), "playerRating", 1911156222);
        setIntField(term281012, term281012.getClass(), "highestRating", -595089281);
        setIntField(term281012, term281012.getClass(), "gradeRank", 336328847);
        setIntField(term281012, term281012.getClass(), "classRank", -1839425499);
        setIntField(term281012, term281012.getClass(), "courseRank", -1228260643);
        setField(term281012, term281012.getClass(), "charaSlot", term281077);
        setField(term281012, term281012.getClass(), "charaLockSlot", term281091);
        setLongField(term281012, term281012.getClass(), "contentBit", -5370634325913369443L);
        setIntField(term281012, term281012.getClass(), "playCount", 574874911);
        setField(term281012, term281012.getClass(), "eventWatchedDate", "oJxwTUrGoA");
        setField(term281012, term281012.getClass(), "lastGameId", "DZyWRMZKkh");
        setField(term281012, term281012.getClass(), "lastRomVersion", "FfDRlqapMv");
        setField(term281012, term281012.getClass(), "lastDataVersion", "REXiUGDUvP");
        setField(term281012, term281012.getClass(), "lastLoginDate", "kxhtDyZCFj");
        setField(term281012, term281012.getClass(), "lastPlayDate", "ksqLSkOdPn");
        setIntField(term281012, term281012.getClass(), "lastPlayCredit", -526061609);
        setIntField(term281012, term281012.getClass(), "lastPlayMode", -1784695440);
        setIntField(term281012, term281012.getClass(), "lastPlaceId", -770471106);
        setField(term281012, term281012.getClass(), "lastPlaceName", "OjuNeqiAeo");
        setIntField(term281012, term281012.getClass(), "lastAllNetId", 1307638203);
        setIntField(term281012, term281012.getClass(), "lastRegionId", 1624606138);
        setField(term281012, term281012.getClass(), "lastRegionName", "NMHarFCqvq");
        setField(term281012, term281012.getClass(), "lastClientId", "MmNWdQUdHF");
        setField(term281012, term281012.getClass(), "lastCountryCode", "nIGJbiiUvW");
        setIntField(term281012, term281012.getClass(), "lastSelectEMoney", 1148154717);
        setIntField(term281012, term281012.getClass(), "lastSelectTicket", 1743443237);
        setIntField(term281012, term281012.getClass(), "lastSelectCourse", 1817003214);
        setIntField(term281012, term281012.getClass(), "lastCountCourse", 1718370872);
        setField(term281012, term281012.getClass(), "firstGameId", "JzhWLyxXkj");
        setField(term281012, term281012.getClass(), "firstRomVersion", "AAidHZAyKB");
        setField(term281012, term281012.getClass(), "firstDataVersion", "krYrsxROnJ");
        setField(term281012, term281012.getClass(), "firstPlayDate", "QUrFaZSXXZ");
        setField(term281012, term281012.getClass(), "compatibleCmVersion", "fzsErxnPmd");
        setField(term281012, term281012.getClass(), "dailyBonusDate", "sDIrgCFfkO");
        setField(term281012, term281012.getClass(), "dailyCourseBonusDate", "hNDigjtAOH");
        setField(term281012, term281012.getClass(), "lastPairLoginDate", "KRnwDMPCbm");
        setField(term281012, term281012.getClass(), "lastTrialPlayDate", "YWxoRQOEME");
        setIntField(term281012, term281012.getClass(), "playVsCount", 1587341901);
        setIntField(term281012, term281012.getClass(), "playSyncCount", 1329288453);
        setIntField(term281012, term281012.getClass(), "winCount", -758711264);
        setIntField(term281012, term281012.getClass(), "helpCount", -1402801191);
        setIntField(term281012, term281012.getClass(), "comboCount", -138841862);
        setLongField(term281012, term281012.getClass(), "totalDeluxscore", 3172754617115999258L);
        setLongField(term281012, term281012.getClass(), "totalBasicDeluxscore", 7280844066232587956L);
        setLongField(term281012, term281012.getClass(), "totalAdvancedDeluxscore", 6101527964967183690L);
        setLongField(term281012, term281012.getClass(), "totalExpertDeluxscore", 550863938148788477L);
        setLongField(term281012, term281012.getClass(), "totalMasterDeluxscore", -8060664115470734715L);
        setLongField(term281012, term281012.getClass(), "totalReMasterDeluxscore", 847288150704981718L);
        setIntField(term281012, term281012.getClass(), "totalSync", 1531550853);
        setIntField(term281012, term281012.getClass(), "totalBasicSync", -1492283849);
        setIntField(term281012, term281012.getClass(), "totalAdvancedSync", -1673304554);
        setIntField(term281012, term281012.getClass(), "totalExpertSync", -620356333);
        setIntField(term281012, term281012.getClass(), "totalMasterSync", -157136506);
        setIntField(term281012, term281012.getClass(), "totalReMasterSync", 2127767309);
        setLongField(term281012, term281012.getClass(), "totalAchievement", 7846897591824181919L);
        setLongField(term281012, term281012.getClass(), "totalBasicAchievement", -5656540365912860631L);
        setLongField(term281012, term281012.getClass(), "totalAdvancedAchievement", -5697641509048557664L);
        setLongField(term281012, term281012.getClass(), "totalExpertAchievement", 11459664456333261L);
        setLongField(term281012, term281012.getClass(), "totalMasterAchievement", -7966363509507508793L);
        setLongField(term281012, term281012.getClass(), "totalReMasterAchievement", -8170709579257820116L);
        setLongField(term281012, term281012.getClass(), "playerOldRating", 5559447669412695762L);
        setLongField(term281012, term281012.getClass(), "playerNewRating", -8463695230560696795L);
        setIntField(term281012, term281012.getClass(), "banState", -1632200201);
        setLongField(term281012, term281012.getClass(), "dateTime", -7578977401060608644L);
        term281375 = new Long(-4720079533116855758L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term281375;
        callMethod(klass, "setPlayerOldRating", argTypes, term281012, args);
    }

};


